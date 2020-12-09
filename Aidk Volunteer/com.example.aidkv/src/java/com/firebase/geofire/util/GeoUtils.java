/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.logging.Logger
 */
package com.firebase.geofire.util;

import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import java.util.logging.Logger;

public final class GeoUtils {
    private static final double MAX_SUPPORTED_RADIUS = 8587.0;

    private GeoUtils() {
        throw new AssertionError((Object)"No instances.");
    }

    public static double capRadius(double d) {
        if (d > 8587.0) {
            GeoFire.LOGGER.warning("The radius is bigger than 8587.0 and hence we'll use that value");
            return 8587.0;
        }
        return d;
    }

    public static double distance(double d, double d2, double d3, double d4) {
        double d5 = Math.toRadians((double)(d - d3));
        double d6 = Math.toRadians((double)(d2 - d4));
        double d7 = Math.sin((double)(d5 / 2.0)) * Math.sin((double)(d5 / 2.0)) + Math.cos((double)Math.toRadians((double)d)) * Math.cos((double)Math.toRadians((double)d3)) * Math.sin((double)(d6 / 2.0)) * Math.sin((double)(d6 / 2.0));
        return 1.27359893E7 * Math.atan2((double)Math.sqrt((double)d7), (double)Math.sqrt((double)(1.0 - d7)));
    }

    public static double distance(GeoLocation geoLocation, GeoLocation geoLocation2) {
        return GeoUtils.distance(geoLocation.latitude, geoLocation.longitude, geoLocation2.latitude, geoLocation2.longitude);
    }

    public static double distanceToLatitudeDegrees(double d) {
        return d / 110574.0;
    }

    public static double distanceToLongitudeDegrees(double d, double d2) {
        double d3 = Math.toRadians((double)d2);
        double d4 = 3.141592653589793 * (6378137.0 * Math.cos((double)d3)) / 180.0 * (1.0 / Math.sqrt((double)(1.0 - 0.00669447819799 * Math.sin((double)d3) * Math.sin((double)d3))));
        if (d4 < 1.0E-12) {
            if (d > 0.0) {
                return 360.0;
            }
            return d;
        }
        return Math.min((double)360.0, (double)(d / d4));
    }

    public static double wrapLongitude(double d) {
        if (d >= -180.0 && d <= 180.0) {
            return d;
        }
        double d2 = d + 180.0;
        if (d2 > 0.0) {
            return d2 % 360.0 - 180.0;
        }
        return 180.0 - -d2 % 360.0;
    }
}

