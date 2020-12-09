/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashSet
 *  java.util.Set
 */
package com.firebase.geofire.core;

import com.firebase.geofire.GeoLocation;
import com.firebase.geofire.core.GeoHash;
import com.firebase.geofire.util.Base32Utils;
import com.firebase.geofire.util.GeoUtils;
import java.util.HashSet;
import java.util.Set;

public class GeoHashQuery {
    private final String endValue;
    private final String startValue;

    public GeoHashQuery(String string2, String string3) {
        this.startValue = string2;
        this.endValue = string3;
    }

    private boolean isPrefix(GeoHashQuery geoHashQuery) {
        return geoHashQuery.endValue.compareTo(this.startValue) >= 0 && geoHashQuery.startValue.compareTo(this.startValue) < 0 && geoHashQuery.endValue.compareTo(this.endValue) < 0;
    }

    private boolean isSuperQuery(GeoHashQuery geoHashQuery) {
        return geoHashQuery.startValue.compareTo(this.startValue) <= 0 && geoHashQuery.endValue.compareTo(this.endValue) >= 0;
    }

    public static Set<GeoHashQuery> queriesAtLocation(GeoLocation geoLocation, double d) {
        int n = Math.max((int)1, (int)Utils.bitsForBoundingBox(geoLocation, d));
        int n2 = (int)Math.ceil((double)((float)n / 5.0f));
        double d2 = geoLocation.latitude;
        double d3 = geoLocation.longitude;
        double d4 = d / 110574.0;
        double d5 = Math.min((double)90.0, (double)(d2 + d4));
        double d6 = Math.max((double)-90.0, (double)(d2 - d4));
        double d7 = Math.max((double)GeoUtils.distanceToLongitudeDegrees(d, d5), (double)GeoUtils.distanceToLongitudeDegrees(d, d6));
        HashSet hashSet = new HashSet();
        GeoHash geoHash = new GeoHash(d2, d3, n2);
        double d8 = GeoUtils.wrapLongitude(d3 - d7);
        GeoHash geoHash2 = geoHash;
        GeoHash geoHash3 = new GeoHash(d2, d8, n2);
        GeoHash geoHash4 = new GeoHash(d2, GeoUtils.wrapLongitude(d3 + d7), n2);
        GeoHash geoHash5 = new GeoHash(d5, d3, n2);
        GeoHash geoHash6 = new GeoHash(d5, GeoUtils.wrapLongitude(d3 - d7), n2);
        GeoHash geoHash7 = new GeoHash(d5, GeoUtils.wrapLongitude(d3 + d7), n2);
        GeoHash geoHash8 = new GeoHash(d6, d3, n2);
        GeoHash geoHash9 = new GeoHash(d6, GeoUtils.wrapLongitude(d3 - d7), n2);
        GeoHash geoHash10 = new GeoHash(d6, GeoUtils.wrapLongitude(d3 + d7), n2);
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash2, n));
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash4, n));
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash3, n));
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash5, n));
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash7, n));
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash6, n));
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash8, n));
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash10, n));
        hashSet.add((Object)GeoHashQuery.queryForGeoHash(geoHash9, n));
        do {
            boolean bl;
            GeoHashQuery geoHashQuery = null;
            GeoHashQuery geoHashQuery2 = null;
            for (GeoHashQuery geoHashQuery3 : hashSet) {
                GeoHash geoHash11;
                block7 : {
                    for (Object object : hashSet) {
                        geoHash11 = geoHash2;
                        GeoHashQuery geoHashQuery4 = (GeoHashQuery)object;
                        if (geoHashQuery3 != geoHashQuery4 && geoHashQuery3.canJoinWith(geoHashQuery4)) {
                            geoHashQuery = geoHashQuery3;
                            geoHashQuery2 = geoHashQuery4;
                            break block7;
                        }
                        geoHash2 = geoHash11;
                    }
                    geoHash11 = geoHash2;
                }
                geoHash2 = geoHash11;
            }
            GeoHash geoHash12 = geoHash2;
            if (geoHashQuery != null && geoHashQuery2 != null) {
                hashSet.remove(geoHashQuery);
                hashSet.remove(geoHashQuery2);
                hashSet.add((Object)geoHashQuery.joinWith(geoHashQuery2));
                bl = true;
            } else {
                bl = false;
            }
            if (!bl) {
                return hashSet;
            }
            geoHash2 = geoHash12;
        } while (true);
    }

    public static GeoHashQuery queryForGeoHash(GeoHash geoHash, int n) {
        String string2;
        String string3 = geoHash.getGeoHashString();
        double d = n;
        Double.isNaN((double)d);
        int n2 = (int)Math.ceil((double)(d / 5.0));
        if (string3.length() < n2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append("~");
            return new GeoHashQuery(string3, stringBuilder.toString());
        }
        String string4 = string3.substring(0, n2);
        String string5 = string4.substring(0, string4.length() - 1);
        int n3 = Base32Utils.base32CharToValue(string4.charAt(string4.length() - 1));
        int n4 = 5 - (n - 5 * string5.length());
        int n5 = n3 >> n4 << n4;
        int n6 = n5 + (1 << n4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string5);
        stringBuilder.append(Base32Utils.valueToBase32Char(n5));
        String string6 = stringBuilder.toString();
        if (n6 > 31) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string5);
            stringBuilder2.append("~");
            string2 = stringBuilder2.toString();
        } else {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string5);
            stringBuilder3.append(Base32Utils.valueToBase32Char(n6));
            string2 = stringBuilder3.toString();
        }
        return new GeoHashQuery(string6, string2);
    }

    public boolean canJoinWith(GeoHashQuery geoHashQuery) {
        return this.isPrefix(geoHashQuery) || geoHashQuery.isPrefix(this) || this.isSuperQuery(geoHashQuery) || geoHashQuery.isSuperQuery(this);
        {
        }
    }

    public boolean containsGeoHash(GeoHash geoHash) {
        String string2 = geoHash.getGeoHashString();
        return this.startValue.compareTo(string2) <= 0 && this.endValue.compareTo(string2) > 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            GeoHashQuery geoHashQuery = (GeoHashQuery)object;
            if (!this.endValue.equals((Object)geoHashQuery.endValue)) {
                return false;
            }
            return this.startValue.equals((Object)geoHashQuery.startValue);
        }
        return false;
    }

    public String getEndValue() {
        return this.endValue;
    }

    public String getStartValue() {
        return this.startValue;
    }

    public int hashCode() {
        return 31 * this.startValue.hashCode() + this.endValue.hashCode();
    }

    public GeoHashQuery joinWith(GeoHashQuery geoHashQuery) {
        if (geoHashQuery.isPrefix(this)) {
            return new GeoHashQuery(this.startValue, geoHashQuery.endValue);
        }
        if (this.isPrefix(geoHashQuery)) {
            return new GeoHashQuery(geoHashQuery.startValue, this.endValue);
        }
        if (this.isSuperQuery(geoHashQuery)) {
            return geoHashQuery;
        }
        if (geoHashQuery.isSuperQuery(this)) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't join these 2 queries: ");
        stringBuilder.append((Object)this);
        stringBuilder.append(", ");
        stringBuilder.append((Object)geoHashQuery);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GeoHashQuery{startValue='");
        stringBuilder.append(this.startValue);
        stringBuilder.append('\'');
        stringBuilder.append(", endValue='");
        stringBuilder.append(this.endValue);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class Utils {
        private Utils() {
            throw new AssertionError((Object)"No instances.");
        }

        public static int bitsForBoundingBox(GeoLocation geoLocation, double d) {
            double d2 = GeoUtils.distanceToLatitudeDegrees(d);
            double d3 = Math.min((double)90.0, (double)(d2 + geoLocation.latitude));
            double d4 = Math.max((double)-90.0, (double)(geoLocation.latitude - d2));
            return Math.min((int)(2 * (int)Math.floor((double)Utils.bitsLatitude(d))), (int)Math.min((int)(-1 + 2 * (int)Math.floor((double)Utils.bitsLongitude(d, d3))), (int)(-1 + 2 * (int)Math.floor((double)Utils.bitsLongitude(d, d4)))));
        }

        public static double bitsLatitude(double d) {
            return Math.min((double)(Math.log((double)(2.000393E7 / d)) / Math.log((double)2.0)), (double)110.0);
        }

        public static double bitsLongitude(double d, double d2) {
            double d3 = GeoUtils.distanceToLongitudeDegrees(d, d2);
            double d4 = Math.abs((double)d3);
            double d5 = 1.0;
            if (d4 > 0.0) {
                d5 = Math.max((double)d5, (double)(Math.log((double)(360.0 / d3)) / Math.log((double)2.0)));
            }
            return d5;
        }
    }

}

