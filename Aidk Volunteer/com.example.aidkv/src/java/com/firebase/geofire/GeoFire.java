/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.database.DataSnapshot
 *  com.google.firebase.database.DatabaseError
 *  com.google.firebase.database.DatabaseException
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.DatabaseReference$CompletionListener
 *  com.google.firebase.database.GenericTypeIndicator
 *  com.google.firebase.database.ValueEventListener
 *  java.lang.ClassCastException
 *  java.lang.Double
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.logging.Logger
 */
package com.firebase.geofire;

import com.firebase.geofire.AndroidEventRaiser;
import com.firebase.geofire.EventRaiser;
import com.firebase.geofire.GeoLocation;
import com.firebase.geofire.GeoQuery;
import com.firebase.geofire.LocationCallback;
import com.firebase.geofire.ThreadEventRaiser;
import com.firebase.geofire.core.GeoHash;
import com.firebase.geofire.util.GeoUtils;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class GeoFire {
    public static Logger LOGGER = Logger.getLogger((String)"GeoFire");
    private final DatabaseReference databaseReference;
    private final EventRaiser eventRaiser;

    public GeoFire(DatabaseReference databaseReference) {
        EventRaiser eventRaiser;
        this.databaseReference = databaseReference;
        try {
            eventRaiser = new AndroidEventRaiser();
        }
        catch (Throwable throwable) {
            eventRaiser = new ThreadEventRaiser();
        }
        this.eventRaiser = eventRaiser;
    }

    public static GeoLocation getLocationValue(DataSnapshot dataSnapshot) {
        try {
            List list = (List)((Map)dataSnapshot.getValue((GenericTypeIndicator)new GenericTypeIndicator<Map<String, Object>>(){})).get((Object)"l");
            Number number = (Number)list.get(0);
            Number number2 = (Number)list.get(1);
            double d = number.doubleValue();
            double d2 = number2.doubleValue();
            if (list.size() == 2 && GeoLocation.coordinatesValid(d, d2)) {
                GeoLocation geoLocation = new GeoLocation(d, d2);
                return geoLocation;
            }
            return null;
        }
        catch (DatabaseException databaseException) {
            return null;
        }
        catch (ClassCastException classCastException) {
            return null;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    DatabaseReference getDatabaseRefForKey(String string2) {
        return this.databaseReference.child(string2);
    }

    public DatabaseReference getDatabaseReference() {
        return this.databaseReference;
    }

    public void getLocation(String string2, LocationCallback locationCallback) {
        this.getDatabaseRefForKey(string2).addListenerForSingleValueEvent((ValueEventListener)new LocationValueEventListener(locationCallback));
    }

    public GeoQuery queryAtLocation(GeoLocation geoLocation, double d) {
        return new GeoQuery(this, geoLocation, GeoUtils.capRadius(d));
    }

    public void raiseEvent(Runnable runnable) {
        this.eventRaiser.raiseEvent(runnable);
    }

    public void removeLocation(String string2) {
        this.removeLocation(string2, null);
    }

    public void removeLocation(final String string2, final CompletionListener completionListener) {
        if (string2 != null) {
            DatabaseReference databaseReference = this.getDatabaseRefForKey(string2);
            if (completionListener != null) {
                databaseReference.setValue(null, new DatabaseReference.CompletionListener(){

                    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                        completionListener.onComplete(string2, databaseError);
                    }
                });
                return;
            }
            databaseReference.setValue(null);
            return;
        }
        throw new NullPointerException();
    }

    public void setLocation(String string2, GeoLocation geoLocation) {
        this.setLocation(string2, geoLocation, null);
    }

    public void setLocation(final String string2, GeoLocation geoLocation, final CompletionListener completionListener) {
        if (string2 != null) {
            DatabaseReference databaseReference = this.getDatabaseRefForKey(string2);
            GeoHash geoHash = new GeoHash(geoLocation);
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"g", (Object)geoHash.getGeoHashString());
            Object[] arrobject = new Double[]{geoLocation.latitude, geoLocation.longitude};
            hashMap.put((Object)"l", (Object)Arrays.asList((Object[])arrobject));
            if (completionListener != null) {
                databaseReference.setValue((Object)hashMap, (Object)geoHash.getGeoHashString(), new DatabaseReference.CompletionListener(){

                    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                        completionListener.onComplete(string2, databaseError);
                    }
                });
                return;
            }
            databaseReference.setValue((Object)hashMap, (Object)geoHash.getGeoHashString());
            return;
        }
        throw new NullPointerException();
    }

    public static interface CompletionListener {
        public void onComplete(String var1, DatabaseError var2);
    }

    private static class LocationValueEventListener
    implements ValueEventListener {
        private final LocationCallback callback;

        LocationValueEventListener(LocationCallback locationCallback) {
            this.callback = locationCallback;
        }

        public void onCancelled(DatabaseError databaseError) {
            this.callback.onCancelled(databaseError);
        }

        public void onDataChange(DataSnapshot dataSnapshot) {
            if (dataSnapshot.getValue() == null) {
                this.callback.onLocationResult(dataSnapshot.getKey(), null);
                return;
            }
            GeoLocation geoLocation = GeoFire.getLocationValue(dataSnapshot);
            if (geoLocation != null) {
                this.callback.onLocationResult(dataSnapshot.getKey(), geoLocation);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("GeoFire data has invalid format: ");
            stringBuilder.append(dataSnapshot.getValue());
            String string2 = stringBuilder.toString();
            this.callback.onCancelled(DatabaseError.fromException((Throwable)new Throwable(string2)));
        }
    }

}

