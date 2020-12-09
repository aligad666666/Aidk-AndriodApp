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

public interface GeoQueryEventListener {
    public void onGeoQueryError(DatabaseError var1);

    public void onGeoQueryReady();

    public void onKeyEntered(String var1, GeoLocation var2);

    public void onKeyExited(String var1);

    public void onKeyMoved(String var1, GeoLocation var2);
}

