/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.database.ChildEventListener
 *  com.google.firebase.database.DataSnapshot
 *  com.google.firebase.database.DatabaseError
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.Query
 *  com.google.firebase.database.ValueEventListener
 *  java.lang.AssertionError
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.firebase.geofire;

import com.firebase.geofire.EventListenerBridge;
import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import com.firebase.geofire.GeoQueryDataEventListener;
import com.firebase.geofire.GeoQueryEventListener;
import com.firebase.geofire.core.GeoHash;
import com.firebase.geofire.core.GeoHashQuery;
import com.firebase.geofire.util.GeoUtils;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeoQuery {
    private static final int KILOMETER_TO_METER = 1000;
    private GeoLocation center;
    private final ChildEventListener childEventLister = new ChildEventListener(){

        /*
         * Enabled aggressive block sorting
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void onCancelled(DatabaseError databaseError) {
            1 var2_2 = this;
            // MONITORENTER : var2_2
            // MONITOREXIT : var2_2
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onChildAdded(DataSnapshot dataSnapshot, String string2) {
            GeoQuery geoQuery;
            GeoQuery geoQuery2 = geoQuery = GeoQuery.this;
            synchronized (geoQuery2) {
                GeoQuery.this.childAdded(dataSnapshot);
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onChildChanged(DataSnapshot dataSnapshot, String string2) {
            GeoQuery geoQuery;
            GeoQuery geoQuery2 = geoQuery = GeoQuery.this;
            synchronized (geoQuery2) {
                GeoQuery.this.childChanged(dataSnapshot);
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public void onChildMoved(DataSnapshot dataSnapshot, String string2) {
            1 var3_3 = this;
            // MONITORENTER : var3_3
            // MONITOREXIT : var3_3
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void onChildRemoved(DataSnapshot dataSnapshot) {
            GeoQuery geoQuery;
            GeoQuery geoQuery2 = geoQuery = GeoQuery.this;
            synchronized (geoQuery2) {
                GeoQuery.this.childRemoved(dataSnapshot);
                return;
            }
        }
    };
    private final Set<GeoQueryDataEventListener> eventListeners = new HashSet();
    private final Map<GeoHashQuery, Query> firebaseQueries = new HashMap();
    private final GeoFire geoFire;
    private final Map<String, LocationInfo> locationInfos = new HashMap();
    private final Set<GeoHashQuery> outstandingQueries = new HashSet();
    private Set<GeoHashQuery> queries;
    private double radius;

    GeoQuery(GeoFire geoFire, GeoLocation geoLocation, double d) {
        this.geoFire = geoFire;
        this.center = geoLocation;
        this.radius = 1000.0 * d;
    }

    private void addValueToReadyListener(Query query, final GeoHashQuery geoHashQuery) {
        query.addListenerForSingleValueEvent(new ValueEventListener(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onCancelled(final DatabaseError databaseError) {
                GeoQuery geoQuery;
                GeoQuery geoQuery2 = geoQuery = GeoQuery.this;
                synchronized (geoQuery2) {
                    Iterator iterator = GeoQuery.this.eventListeners.iterator();
                    while (iterator.hasNext()) {
                        final GeoQueryDataEventListener geoQueryDataEventListener = (GeoQueryDataEventListener)iterator.next();
                        GeoQuery.this.geoFire.raiseEvent(new Runnable(){

                            public void run() {
                                geoQueryDataEventListener.onGeoQueryError(databaseError);
                            }
                        });
                    }
                    return;
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void onDataChange(DataSnapshot dataSnapshot) {
                GeoQuery geoQuery;
                GeoQuery geoQuery2 = geoQuery = GeoQuery.this;
                synchronized (geoQuery2) {
                    GeoQuery.this.outstandingQueries.remove((Object)geoHashQuery);
                    GeoQuery.this.checkAndFireReady();
                    return;
                }
            }

        });
    }

    private boolean canFireReady() {
        return this.outstandingQueries.isEmpty();
    }

    private void checkAndFireReady() {
        if (this.canFireReady()) {
            for (final GeoQueryDataEventListener geoQueryDataEventListener : this.eventListeners) {
                this.geoFire.raiseEvent(new Runnable(){

                    public void run() {
                        geoQueryDataEventListener.onGeoQueryReady();
                    }
                });
            }
        }
    }

    private void childAdded(DataSnapshot dataSnapshot) {
        GeoLocation geoLocation = GeoFire.getLocationValue(dataSnapshot);
        if (geoLocation != null) {
            this.updateLocationInfo(dataSnapshot, geoLocation);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got Datasnapshot without location with key ");
        stringBuilder.append(dataSnapshot.getKey());
        throw new AssertionError((Object)stringBuilder.toString());
    }

    private void childChanged(DataSnapshot dataSnapshot) {
        GeoLocation geoLocation = GeoFire.getLocationValue(dataSnapshot);
        if (geoLocation != null) {
            this.updateLocationInfo(dataSnapshot, geoLocation);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got Datasnapshot without location with key ");
        stringBuilder.append(dataSnapshot.getKey());
        throw new AssertionError((Object)stringBuilder.toString());
    }

    private void childRemoved(DataSnapshot dataSnapshot) {
        final String string2 = dataSnapshot.getKey();
        if ((LocationInfo)this.locationInfos.get((Object)string2) != null) {
            this.geoFire.getDatabaseRefForKey(string2).addListenerForSingleValueEvent(new ValueEventListener(){

                public void onCancelled(DatabaseError databaseError) {
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                public void onDataChange(DataSnapshot dataSnapshot) {
                    GeoQuery geoQuery;
                    GeoQuery geoQuery2 = geoQuery = GeoQuery.this;
                    synchronized (geoQuery2) {
                        LocationInfo locationInfo;
                        GeoLocation geoLocation = GeoFire.getLocationValue(dataSnapshot);
                        GeoHash geoHash = geoLocation != null ? new GeoHash(geoLocation) : null;
                        if (geoHash != null) {
                            if (GeoQuery.this.geoHashQueriesContainGeoHash(geoHash)) return;
                        }
                        if ((locationInfo = (LocationInfo)GeoQuery.this.locationInfos.remove((Object)string2)) == null) return;
                        if (!locationInfo.inGeoQuery) return;
                        Iterator iterator = GeoQuery.this.eventListeners.iterator();
                        while (iterator.hasNext()) {
                            final GeoQueryDataEventListener geoQueryDataEventListener = (GeoQueryDataEventListener)iterator.next();
                            GeoQuery.this.geoFire.raiseEvent(new Runnable(){

                                public void run() {
                                    geoQueryDataEventListener.onDataExited(locationInfo.dataSnapshot);
                                }
                            });
                        }
                        return;
                    }
                }

            });
        }
    }

    private boolean geoHashQueriesContainGeoHash(GeoHash geoHash) {
        Set<GeoHashQuery> set = this.queries;
        if (set == null) {
            return false;
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if (!((GeoHashQuery)iterator.next()).containsGeoHash(geoHash)) continue;
            return true;
        }
        return false;
    }

    private boolean hasListeners() {
        return true ^ this.eventListeners.isEmpty();
    }

    private boolean locationIsInQuery(GeoLocation geoLocation) {
        return GeoUtils.distance(geoLocation, this.center) <= this.radius;
    }

    private void reset() {
        Iterator iterator = this.firebaseQueries.entrySet().iterator();
        while (iterator.hasNext()) {
            ((Query)((Map.Entry)iterator.next()).getValue()).removeEventListener(this.childEventLister);
        }
        this.outstandingQueries.clear();
        this.firebaseQueries.clear();
        this.queries = null;
        this.locationInfos.clear();
    }

    private void setupQueries() {
        HashSet hashSet = this.queries;
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        Set<GeoHashQuery> set = GeoHashQuery.queriesAtLocation(this.center, this.radius);
        this.queries = set;
        for (GeoHashQuery geoHashQuery : hashSet) {
            if (set.contains((Object)geoHashQuery)) continue;
            ((Query)this.firebaseQueries.get((Object)geoHashQuery)).removeEventListener(this.childEventLister);
            this.firebaseQueries.remove((Object)geoHashQuery);
            this.outstandingQueries.remove((Object)geoHashQuery);
        }
        for (GeoHashQuery geoHashQuery : set) {
            if (hashSet.contains((Object)geoHashQuery)) continue;
            this.outstandingQueries.add((Object)geoHashQuery);
            Query query = this.geoFire.getDatabaseReference().orderByChild("g").startAt(geoHashQuery.getStartValue()).endAt(geoHashQuery.getEndValue());
            query.addChildEventListener(this.childEventLister);
            this.addValueToReadyListener(query, geoHashQuery);
            this.firebaseQueries.put((Object)geoHashQuery, (Object)query);
        }
        Iterator iterator = this.locationInfos.entrySet().iterator();
        while (iterator.hasNext()) {
            LocationInfo locationInfo = (LocationInfo)((Map.Entry)iterator.next()).getValue();
            if (locationInfo == null) continue;
            this.updateLocationInfo(locationInfo.dataSnapshot, locationInfo.location);
        }
        Iterator iterator2 = this.locationInfos.entrySet().iterator();
        while (iterator2.hasNext()) {
            if (this.geoHashQueriesContainGeoHash(((LocationInfo)((Map.Entry)iterator2.next()).getValue()).geoHash)) continue;
            iterator2.remove();
        }
        this.checkAndFireReady();
    }

    private void updateLocationInfo(final DataSnapshot dataSnapshot, final GeoLocation geoLocation) {
        String string2 = dataSnapshot.getKey();
        LocationInfo locationInfo = (LocationInfo)this.locationInfos.get((Object)string2);
        boolean bl = true;
        boolean bl2 = locationInfo == null;
        boolean bl3 = bl2;
        final boolean bl4 = locationInfo != null && !locationInfo.location.equals(geoLocation);
        if (locationInfo == null || !locationInfo.inGeoQuery) {
            bl = false;
        }
        boolean bl5 = bl;
        boolean bl6 = this.locationIsInQuery(geoLocation);
        if ((bl3 || !bl5) && bl6) {
            for (final GeoQueryDataEventListener geoQueryDataEventListener : this.eventListeners) {
                this.geoFire.raiseEvent(new Runnable(){

                    public void run() {
                        geoQueryDataEventListener.onDataEntered(dataSnapshot, geoLocation);
                    }
                });
            }
        } else if (!bl3 && bl6) {
            for (final GeoQueryDataEventListener geoQueryDataEventListener : this.eventListeners) {
                GeoFire geoFire = this.geoFire;
                LocationInfo locationInfo2 = locationInfo;
                boolean bl7 = bl3;
                Runnable runnable = new Runnable(){

                    public void run() {
                        if (bl4) {
                            geoQueryDataEventListener.onDataMoved(dataSnapshot, geoLocation);
                        }
                        geoQueryDataEventListener.onDataChanged(dataSnapshot, geoLocation);
                    }
                };
                geoFire.raiseEvent(runnable);
                locationInfo = locationInfo2;
                bl3 = bl7;
            }
        } else if (bl5 && !bl6) {
            for (final GeoQueryDataEventListener geoQueryDataEventListener : this.eventListeners) {
                this.geoFire.raiseEvent(new Runnable(){

                    public void run() {
                        geoQueryDataEventListener.onDataExited(dataSnapshot);
                    }
                });
            }
        }
        LocationInfo locationInfo3 = new LocationInfo(geoLocation, this.locationIsInQuery(geoLocation), dataSnapshot);
        this.locationInfos.put((Object)string2, (Object)locationInfo3);
    }

    public void addGeoQueryDataEventListener(final GeoQueryDataEventListener geoQueryDataEventListener) {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            try {
                if (!this.eventListeners.contains((Object)geoQueryDataEventListener)) {
                    this.eventListeners.add((Object)geoQueryDataEventListener);
                    if (this.queries == null) {
                        this.setupQueries();
                    } else {
                        for (Map.Entry entry : this.locationInfos.entrySet()) {
                            (String)entry.getKey();
                            final LocationInfo locationInfo = (LocationInfo)entry.getValue();
                            if (!locationInfo.inGeoQuery) continue;
                            this.geoFire.raiseEvent(new Runnable(){

                                public void run() {
                                    geoQueryDataEventListener.onDataEntered(locationInfo.dataSnapshot, locationInfo.location);
                                }
                            });
                        }
                        if (this.canFireReady()) {
                            this.geoFire.raiseEvent(new Runnable(){

                                public void run() {
                                    geoQueryDataEventListener.onGeoQueryReady();
                                }
                            });
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("Added the same listener twice to a GeoQuery!");
            }
            catch (Throwable throwable) {
                throw throwable;
            }
        }
    }

    public void addGeoQueryEventListener(GeoQueryEventListener geoQueryEventListener) {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            this.addGeoQueryDataEventListener(new EventListenerBridge(geoQueryEventListener));
            return;
        }
    }

    public GeoLocation getCenter() {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            GeoLocation geoLocation = this.center;
            return geoLocation;
        }
    }

    public double getRadius() {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            double d = this.radius;
            double d2 = d / 1000.0;
            return d2;
        }
    }

    public void removeAllListeners() {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            this.eventListeners.clear();
            this.reset();
            return;
        }
    }

    public void removeGeoQueryEventListener(GeoQueryDataEventListener geoQueryDataEventListener) {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            if (this.eventListeners.contains((Object)geoQueryDataEventListener)) {
                this.eventListeners.remove((Object)geoQueryDataEventListener);
                if (!this.hasListeners()) {
                    this.reset();
                }
                return;
            }
            throw new IllegalArgumentException("Trying to remove listener that was removed or not added!");
        }
    }

    public void removeGeoQueryEventListener(GeoQueryEventListener geoQueryEventListener) {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            this.removeGeoQueryEventListener(new EventListenerBridge(geoQueryEventListener));
            return;
        }
    }

    public void setCenter(GeoLocation geoLocation) {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            this.center = geoLocation;
            if (this.hasListeners()) {
                this.setupQueries();
            }
            return;
        }
    }

    public void setLocation(GeoLocation geoLocation, double d) {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            this.center = geoLocation;
            this.radius = 1000.0 * GeoUtils.capRadius(d);
            if (this.hasListeners()) {
                this.setupQueries();
            }
            return;
        }
    }

    public void setRadius(double d) {
        GeoQuery geoQuery = this;
        synchronized (geoQuery) {
            this.radius = 1000.0 * GeoUtils.capRadius(d);
            if (this.hasListeners()) {
                this.setupQueries();
            }
            return;
        }
    }

    private static class LocationInfo {
        final DataSnapshot dataSnapshot;
        final GeoHash geoHash;
        final boolean inGeoQuery;
        final GeoLocation location;

        public LocationInfo(GeoLocation geoLocation, boolean bl, DataSnapshot dataSnapshot) {
            this.location = geoLocation;
            this.inGeoQuery = bl;
            this.geoHash = new GeoHash(geoLocation);
            this.dataSnapshot = dataSnapshot;
        }
    }

}

