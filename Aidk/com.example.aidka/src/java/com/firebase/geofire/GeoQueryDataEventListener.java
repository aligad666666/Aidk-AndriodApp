/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.database.DataSnapshot
 *  com.google.firebase.database.DatabaseError
 *  java.lang.Object
 */
package com.firebase.geofire;

import com.firebase.geofire.GeoLocation;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

public interface GeoQueryDataEventListener {
    public void onDataChanged(DataSnapshot var1, GeoLocation var2);

    public void onDataEntered(DataSnapshot var1, GeoLocation var2);

    public void onDataExited(DataSnapshot var1);

    public void onDataMoved(DataSnapshot var1, GeoLocation var2);

    public void onGeoQueryError(DatabaseError var1);

    public void onGeoQueryReady();
}

