/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.database.DataSnapshot
 *  com.google.firebase.database.DatabaseError
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.firebase.geofire;

import com.firebase.geofire.GeoLocation;
import com.firebase.geofire.GeoQueryDataEventListener;
import com.firebase.geofire.GeoQueryEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

final class EventListenerBridge
implements GeoQueryDataEventListener {
    private final GeoQueryEventListener listener;

    public EventListenerBridge(GeoQueryEventListener geoQueryEventListener) {
        this.listener = geoQueryEventListener;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            EventListenerBridge eventListenerBridge = (EventListenerBridge)object;
            return this.listener.equals((Object)eventListenerBridge.listener);
        }
        return false;
    }

    public int hashCode() {
        return this.listener.hashCode();
    }

    @Override
    public void onDataChanged(DataSnapshot dataSnapshot, GeoLocation geoLocation) {
    }

    @Override
    public void onDataEntered(DataSnapshot dataSnapshot, GeoLocation geoLocation) {
        this.listener.onKeyEntered(dataSnapshot.getKey(), geoLocation);
    }

    @Override
    public void onDataExited(DataSnapshot dataSnapshot) {
        this.listener.onKeyExited(dataSnapshot.getKey());
    }

    @Override
    public void onDataMoved(DataSnapshot dataSnapshot, GeoLocation geoLocation) {
        this.listener.onKeyMoved(dataSnapshot.getKey(), geoLocation);
    }

    @Override
    public void onGeoQueryError(DatabaseError databaseError) {
        this.listener.onGeoQueryError(databaseError);
    }

    @Override
    public void onGeoQueryReady() {
        this.listener.onGeoQueryReady();
    }
}

