/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.database.DatabaseError
 *  java.lang.Object
 *  java.lang.String
 */
package com.firebase.geofire;

import com.firebase.geofire.GeoLocation;
import com.google.firebase.database.DatabaseError;

public interface LocationCallback {
    public void onCancelled(DatabaseError var1);

    public void onLocationResult(String var1, GeoLocation var2);
}

