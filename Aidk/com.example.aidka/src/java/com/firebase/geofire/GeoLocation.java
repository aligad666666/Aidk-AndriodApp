/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.firebase.geofire;

public final class GeoLocation {
    public final double latitude;
    public final double longitude;

    public GeoLocation(double d, double d2) {
        if (GeoLocation.coordinatesValid(d, d2)) {
            this.latitude = d;
            this.longitude = d2;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a valid geo location: ");
        stringBuilder.append(d);
        stringBuilder.append(", ");
        stringBuilder.append(d2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static boolean coordinatesValid(double d, double d2) {
        return d >= -90.0 && d <= 90.0 && d2 >= -180.0 && d2 <= 180.0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            GeoLocation geoLocation = (GeoLocation)object;
            if (Double.compare((double)geoLocation.latitude, (double)this.latitude) != 0) {
                return false;
            }
            return Double.compare((double)geoLocation.longitude, (double)this.longitude) == 0;
        }
        return false;
    }

    public int hashCode() {
        long l = Double.doubleToLongBits((double)this.latitude);
        int n = (int)(l ^ l >>> 32);
        long l2 = Double.doubleToLongBits((double)this.longitude);
        return n * 31 + (int)(l2 ^ l2 >>> 32);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GeoLocation(");
        stringBuilder.append(this.latitude);
        stringBuilder.append(", ");
        stringBuilder.append(this.longitude);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

