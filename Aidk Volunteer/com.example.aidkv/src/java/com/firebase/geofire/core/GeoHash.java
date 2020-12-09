/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package com.firebase.geofire.core;

import com.firebase.geofire.GeoLocation;
import com.firebase.geofire.util.Base32Utils;
import java.util.Locale;

public class GeoHash {
    private static final int DEFAULT_PRECISION = 10;
    public static final int MAX_PRECISION = 22;
    public static final int MAX_PRECISION_BITS = 110;
    private final String geoHash;

    public GeoHash(double d, double d2) {
        this(d, d2, 10);
    }

    public GeoHash(double d, double d2, int n) {
        IllegalArgumentException illegalArgumentException;
        if (n >= 1) {
            if (n <= 22) {
                if (GeoLocation.coordinatesValid(d, d2)) {
                    double[] arrd = new double[]{-180.0, 180.0};
                    double[] arrd2 = new double[]{-90.0, 90.0};
                    char[] arrc = new char[n];
                    for (int i = 0; i < n; ++i) {
                        int n2 = 0;
                        for (int j = 0; j < 5; ++j) {
                            double d3;
                            double[] arrd3;
                            boolean bl = (j + i * 5) % 2 == 0;
                            double d4 = bl ? d2 : d;
                            if (d4 > (d3 = ((arrd3 = bl ? arrd : arrd2)[0] + arrd3[1]) / 2.0)) {
                                int n3 = 1 + (n2 << 1);
                                arrd3[0] = d3;
                                n2 = n3;
                                continue;
                            }
                            n2 <<= 1;
                            arrd3[1] = d3;
                        }
                        arrc[i] = Base32Utils.valueToBase32Char(n2);
                    }
                    this.geoHash = new String(arrc);
                    return;
                }
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{d, d2};
                throw new IllegalArgumentException(String.format((Locale)locale, (String)"Not valid location coordinates: [%f, %f]", (Object[])arrobject));
            }
            throw new IllegalArgumentException("Precision of a GeoHash must be less than 23!");
        }
        illegalArgumentException = new IllegalArgumentException("Precision of GeoHash must be larger than zero!");
        throw illegalArgumentException;
    }

    public GeoHash(GeoLocation geoLocation) {
        this(geoLocation.latitude, geoLocation.longitude, 10);
    }

    public GeoHash(String string2) {
        if (string2.length() != 0 && Base32Utils.isValidBase32String(string2)) {
            this.geoHash = string2;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a valid geoHash: ");
        stringBuilder.append(string2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            GeoHash geoHash = (GeoHash)object;
            return this.geoHash.equals((Object)geoHash.geoHash);
        }
        return false;
    }

    public String getGeoHashString() {
        return this.geoHash;
    }

    public int hashCode() {
        return this.geoHash.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GeoHash{geoHash='");
        stringBuilder.append(this.geoHash);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

