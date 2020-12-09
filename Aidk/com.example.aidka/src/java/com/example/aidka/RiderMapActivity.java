/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.location.Location
 *  android.media.MediaPlayer
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.Chronometer
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RatingBar
 *  android.widget.TextView
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  androidx.fragment.app.FragmentManager
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.request.target.ViewTarget
 *  com.google.android.gms.common.ConnectionResult
 *  com.google.android.gms.common.api.Api
 *  com.google.android.gms.common.api.GoogleApiClient
 *  com.google.android.gms.common.api.GoogleApiClient$Builder
 *  com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks
 *  com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener
 *  com.google.android.gms.common.api.PendingResult
 *  com.google.android.gms.location.FusedLocationProviderApi
 *  com.google.android.gms.location.LocationListener
 *  com.google.android.gms.location.LocationRequest
 *  com.google.android.gms.location.LocationServices
 *  com.google.android.gms.maps.CameraUpdate
 *  com.google.android.gms.maps.CameraUpdateFactory
 *  com.google.android.gms.maps.GoogleMap
 *  com.google.android.gms.maps.OnMapReadyCallback
 *  com.google.android.gms.maps.SupportMapFragment
 *  com.google.android.gms.maps.model.LatLng
 *  com.google.android.gms.maps.model.Marker
 *  com.google.android.gms.maps.model.MarkerOptions
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.google.firebase.database.DataSnapshot
 *  com.google.firebase.database.DatabaseError
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.FirebaseDatabase
 *  com.google.firebase.database.ValueEventListener
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.text.DecimalFormat
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.example.aidka;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.ViewTarget;
import com.example.aidka.RiderSettingsActivity;
import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
import com.firebase.geofire.GeoQuery;
import com.firebase.geofire.GeoQueryEventListener;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RiderMapActivity
extends FragmentActivity
implements OnMapReadyCallback,
GoogleApiClient.ConnectionCallbacks,
GoogleApiClient.OnConnectionFailedListener,
LocationListener {
    boolean Sound2;
    boolean Sound3;
    private int bool;
    Chronometer chronometer;
    private ValueEventListener driverLocationlistener;
    private Marker driverMarker;
    private String driverfiondID;
    private Boolean driverfiund;
    boolean driverfond;
    private ImageView driverimage;
    private LinearLayout driverinfo;
    private DatabaseReference driverlocationref;
    private TextView drivername;
    Button end;
    Button find;
    GeoQuery geoQuery;
    final Handler handler;
    Button ka;
    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    private GoogleMap mMap;
    private MediaPlayer mediaPlayer1;
    private MediaPlayer mediaPlayer2;
    private MediaPlayer mediaPlayer3;
    private MediaPlayer mediaPlayer4;
    private MediaPlayer mediaPlayer5;
    private MediaPlayer mediaPlayer6;
    GoogleApiClient mgoogleapi;
    private ImageView mic;
    Location mlastlocattion;
    LocationRequest mlocationrequst;
    Button msettings;
    private String phone;
    private Marker pickupMarker;
    private LatLng picuplocation;
    private ProgressBar progressBar;
    private int radius;
    String rate1;
    String rate2;
    RatingBar ratingBar;
    private Boolean requestbool;
    boolean running;
    boolean sound;
    TextView textView;
    private int wats;

    public RiderMapActivity() {
        Boolean bl;
        this.requestbool = bl = Boolean.valueOf((boolean)false);
        this.handler = new Handler();
        this.running = false;
        this.bool = 0;
        this.radius = 1;
        this.driverfiund = bl;
    }

    static /* synthetic */ LatLng access$1700(RiderMapActivity riderMapActivity) {
        return riderMapActivity.picuplocation;
    }

    private void drivernotfoind() {
        if (this.driverfond) {
            this.requestbool = false;
            this.progressBar.setVisibility(4);
            String string2 = FirebaseAuth.getInstance().getCurrentUser().getUid();
            FirebaseDatabase.getInstance().getReference().child("RiderRequst").child(string2).removeValue();
            Marker marker = this.pickupMarker;
            if (marker != null) {
                marker.remove();
            }
            this.mediaPlayer6.start();
            this.wats = 1;
            this.find.setText((CharSequence)"\u0627\u062d\u0635\u0644 \u0639\u0644\u0649 \u0645\u062a\u0637\u0648\u0639");
            this.find.setClickable(true);
            return;
        }
    }

    private void getClpsseteDrivers() {
        this.geoQuery = new GeoFire(FirebaseDatabase.getInstance().getReference().child("Drivers_Avaleble")).queryAtLocation(new GeoLocation(this.picuplocation.latitude, this.picuplocation.longitude), this.radius);
        this.geoQuery.removeAllListeners();
        this.geoQuery.addGeoQueryEventListener(new GeoQueryEventListener(){

            @Override
            public void onGeoQueryError(DatabaseError databaseError) {
            }

            @Override
            public void onGeoQueryReady() {
                if (!RiderMapActivity.this.driverfiund.booleanValue()) {
                    RiderMapActivity.this.getClpsseteDrivers();
                }
            }

            @Override
            public void onKeyEntered(String string2, GeoLocation geoLocation) {
                if (!RiderMapActivity.this.driverfiund.booleanValue() && RiderMapActivity.this.requestbool.booleanValue()) {
                    RiderMapActivity.this.driverfiund = true;
                    RiderMapActivity.this.driverfiondID = string2;
                    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(RiderMapActivity.this.driverfiondID);
                    String string3 = FirebaseAuth.getInstance().getCurrentUser().getUid();
                    HashMap hashMap = new HashMap();
                    hashMap.put((Object)"RiderID", (Object)string3);
                    databaseReference.updateChildren((Map)hashMap);
                    RiderMapActivity.this.getDriverlocation();
                    RiderMapActivity.this.getdriverinfo();
                    RiderMapActivity.this.progressBar.setVisibility(4);
                    RiderMapActivity riderMapActivity = RiderMapActivity.this;
                    riderMapActivity.driverfond = false;
                    riderMapActivity.find.setText((CharSequence)"\u064a\u062a\u0645 \u0627\u0644\u062d\u0635\u0648\u0644 \u0639\u0644\u064a \u0645\u0648\u0642\u0639 \u0627\u0644\u0645\u062a\u0637\u0648\u0639");
                }
            }

            @Override
            public void onKeyExited(String string2) {
            }

            @Override
            public void onKeyMoved(String string2, GeoLocation geoLocation) {
            }
        });
    }

    private void getDriverlocation() {
        this.driverlocationref = FirebaseDatabase.getInstance().getReference().child("Drivers_working").child(this.driverfiondID).child("l");
        this.driverLocationlistener = this.driverlocationref.addValueEventListener(new ValueEventListener(){

            public void onCancelled(DatabaseError databaseError) {
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists() && RiderMapActivity.this.requestbool.booleanValue()) {
                    List list = (List)dataSnapshot.getValue();
                    double d = 0.0;
                    double d2 = 0.0;
                    RiderMapActivity.this.find.setText((CharSequence)"\u062a\u0645 \u0628\u062d\u0645\u062f \u0627\u0644\u0644\u0647");
                    if (list.get(0) != null) {
                        d = Double.parseDouble((String)list.get(0).toString());
                        d2 = Double.parseDouble((String)list.get(1).toString());
                    }
                    LatLng latLng = new LatLng(d, d2);
                    if (RiderMapActivity.this.driverMarker != null) {
                        RiderMapActivity.this.driverMarker.remove();
                    }
                    Location location = new Location("");
                    location.setLatitude(RiderMapActivity.access$1700((RiderMapActivity)RiderMapActivity.this).latitude);
                    location.setLongitude(RiderMapActivity.access$1700((RiderMapActivity)RiderMapActivity.this).longitude);
                    Location location2 = new Location("");
                    location2.setLatitude(latLng.latitude);
                    location2.setLongitude(latLng.longitude);
                    if (location.distanceTo(location2) < 100.0f) {
                        if (RiderMapActivity.this.sound) {
                            RiderMapActivity.this.mediaPlayer4.start();
                            RiderMapActivity riderMapActivity = RiderMapActivity.this;
                            riderMapActivity.sound = false;
                            riderMapActivity.wats = 4;
                        }
                        if (RiderMapActivity.this.bool == 0) {
                            RiderMapActivity.this.find.setVisibility(8);
                            RiderMapActivity.this.ka.setVisibility(0);
                        }
                    } else {
                        if (RiderMapActivity.this.Sound2) {
                            RiderMapActivity.this.mediaPlayer3.start();
                            RiderMapActivity.this.Sound2 = false;
                        }
                        RiderMapActivity.this.find.setText((CharSequence)" \u0627\u0644\u063a\u0627\u0621 \u0627\u0644\u0637\u0644\u0628 ");
                        RiderMapActivity.this.find.setClickable(true);
                        new Thread(){

                            /*
                             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                             * Unable to fully structure code
                             * Enabled aggressive block sorting
                             * Enabled unnecessary exception pruning
                             * Enabled aggressive exception aggregation
                             * Lifted jumps to return sites
                             */
                            public void run() {
                                1.sleep((long)8000L);
                                if (5.this.RiderMapActivity.this.Sound3 == false) return;
lbl4: // 2 sources:
                                do {
                                    RiderMapActivity.access$300(5.this.RiderMapActivity.this).start();
                                    5.this.RiderMapActivity.this.Sound3 = false;
                                    RiderMapActivity.access$002(5.this.RiderMapActivity.this, 3);
                                    return;
                                    break;
                                } while (true);
                                {
                                    catch (Throwable var3_1) {
                                    }
                                    catch (InterruptedException var1_2) {}
                                    {
                                        var1_2.printStackTrace();
                                        if (5.this.RiderMapActivity.this.Sound3 == false) return;
                                        ** continue;
                                    }
                                }
                                if (5.this.RiderMapActivity.this.Sound3 == false) throw var3_1;
                                RiderMapActivity.access$300(5.this.RiderMapActivity.this).start();
                                5.this.RiderMapActivity.this.Sound3 = false;
                                RiderMapActivity.access$002(5.this.RiderMapActivity.this, 3);
                                throw var3_1;
                            }
                        }.start();
                    }
                    RiderMapActivity riderMapActivity = RiderMapActivity.this;
                    riderMapActivity.driverMarker = riderMapActivity.mMap.addMarker(new MarkerOptions().position(latLng).title("\u0627\u0644\u0645\u062a\u0637\u0648\u0639"));
                }
            }

        });
    }

    private void getdriverinfo() {
        this.driverinfo.setVisibility(0);
        FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(this.driverfiondID).addListenerForSingleValueEvent(new ValueEventListener(){

            public void onCancelled(DatabaseError databaseError) {
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists() && dataSnapshot.getChildrenCount() > 0L) {
                    Map map = (Map)dataSnapshot.getValue();
                    if (map.get((Object)"name") != null) {
                        RiderMapActivity.this.drivername.setText((CharSequence)map.get((Object)"name").toString());
                    }
                    if (map.get((Object)"phone") != null) {
                        RiderMapActivity.this.phone = map.get((Object)"phone").toString();
                    }
                    if (map.get((Object)"profilImageUri") != null) {
                        Glide.with((Context)RiderMapActivity.this.getApplicationContext()).load(map.get((Object)"profilImageUri").toString()).into(RiderMapActivity.this.driverimage);
                    }
                    if (map.get((Object)"rate3") != null) {
                        RiderMapActivity.this.rate1 = map.get((Object)"rate3").toString();
                    }
                    if (map.get((Object)"rate2") != null) {
                        RiderMapActivity.this.rate2 = map.get((Object)"rate2").toString();
                    }
                    if (map.get((Object)"rate1") != null) {
                        RiderMapActivity.this.textView.setText((CharSequence)map.get((Object)"rate1").toString());
                    }
                }
            }
        });
    }

    protected void bulldgoogleapiClint() {
        RiderMapActivity riderMapActivity = this;
        synchronized (riderMapActivity) {
            this.mgoogleapi = new GoogleApiClient.Builder((Context)this).addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)this).addOnConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener)this).addApi(LocationServices.API).build();
            this.mgoogleapi.connect();
            return;
        }
    }

    public void endtime(View view) {
        this.find.setVisibility(0);
        this.find.setClickable(true);
        this.find.setText((CharSequence)"\u0627\u0646\u0647\u0627\u0621 \u0627\u0644\u0645\u0647\u0645\u0629");
        this.linearLayout2.setVisibility(0);
        this.chronometer.stop();
        this.end.setVisibility(8);
    }

    public void etsal1(View view) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tel:");
        stringBuilder.append(this.phone);
        Intent intent = new Intent("android.intent.action.CALL", Uri.parse((String)stringBuilder.toString()));
        if (Build.VERSION.SDK_INT >= 23 && this.checkSelfPermission("android.permission.CALL_PHONE") != 0) {
            return;
        }
        this.startActivity(intent);
    }

    public void kaka(View view) {
        this.linearLayout1.setVisibility(0);
        if (!this.running) {
            this.chronometer.setBase(SystemClock.elapsedRealtime());
            this.chronometer.start();
            this.running = true;
        }
        this.bool = 1;
        this.ka.setVisibility(8);
    }

    public void onConnected(Bundle bundle) {
        this.mlocationrequst = new LocationRequest();
        this.mlocationrequst.setInterval(1000L);
        this.mlocationrequst.setFastestInterval(1000L);
        this.mlocationrequst.setPriority(100);
        LocationServices.FusedLocationApi.requestLocationUpdates(this.mgoogleapi, this.mlocationrequst, (LocationListener)this);
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    public void onConnectionSuspended(int n) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361823);
        this.mediaPlayer3 = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492864);
        this.mediaPlayer1 = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492866);
        this.mediaPlayer2 = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492867);
        this.mediaPlayer4 = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492869);
        this.mediaPlayer5 = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492865);
        this.mediaPlayer6 = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492870);
        this.ka = (Button)this.findViewById(2131165297);
        this.end = (Button)this.findViewById(2131165277);
        this.linearLayout1 = (LinearLayout)this.findViewById(2131165337);
        this.chronometer = (Chronometer)this.findViewById(2131165389);
        this.linearLayout2 = (LinearLayout)this.findViewById(2131165302);
        this.ratingBar = (RatingBar)this.findViewById(2131165336);
        this.textView = (TextView)this.findViewById(2131165370);
        this.wats = 1;
        this.driverfond = true;
        this.progressBar = (ProgressBar)this.findViewById(2131165332);
        this.progressBar.setVisibility(4);
        this.mic = (ImageView)this.findViewById(2131165307);
        this.mic.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                if (RiderMapActivity.this.wats == 1) {
                    RiderMapActivity.this.mediaPlayer1.start();
                    return;
                }
                if (RiderMapActivity.this.wats == 2) {
                    RiderMapActivity.this.mediaPlayer2.start();
                    return;
                }
                if (RiderMapActivity.this.wats == 3) {
                    RiderMapActivity.this.mediaPlayer5.start();
                    return;
                }
                if (RiderMapActivity.this.wats == 4) {
                    RiderMapActivity.this.mediaPlayer4.start();
                }
            }
        });
        this.sound = true;
        this.Sound2 = true;
        this.Sound3 = true;
        this.find = (Button)this.findViewById(2131165280);
        ((SupportMapFragment)this.getSupportFragmentManager().findFragmentById(2131165305)).getMapAsync((OnMapReadyCallback)this);
        this.drivername = (TextView)this.findViewById(2131165274);
        this.driverimage = (ImageView)this.findViewById(2131165272);
        this.driverinfo = (LinearLayout)this.findViewById(2131165273);
        this.mediaPlayer1.start();
    }

    public void onLocationChanged(Location location) {
        this.mlastlocattion = location;
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        this.mMap.moveCamera(CameraUpdateFactory.newLatLng((LatLng)latLng));
        this.mMap.animateCamera(CameraUpdateFactory.zoomTo((float)15.0f));
    }

    public void onMapReady(GoogleMap googleMap) {
        this.mMap = googleMap;
        this.bulldgoogleapiClint();
        this.mMap.setMyLocationEnabled(true);
    }

    protected void onStop() {
        super.onStop();
    }

    public void ratingProcess() {
        float f = Float.parseFloat((String)String.valueOf((float)this.ratingBar.getRating()));
        float f2 = Float.parseFloat((String)this.rate1);
        float f3 = Float.parseFloat((String)this.rate2);
        float f4 = f + f2;
        float f5 = f3 + 1.0f;
        float f6 = f4 / f5;
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(this.driverfiondID).child("rate1").setValue((Object)decimalFormat.format((double)f6));
        FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(this.driverfiondID).child("rate2").setValue((Object)Float.valueOf((float)f5));
        FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(this.driverfiondID).child("rate3").setValue((Object)Float.valueOf((float)f4));
    }

    public void request(View view) {
        boolean bl = this.requestbool;
        Boolean bl2 = false;
        if (bl) {
            Marker marker;
            this.ratingProcess();
            this.requestbool = bl2;
            this.geoQuery.removeAllListeners();
            this.driverlocationref.removeEventListener(this.driverLocationlistener);
            if (this.driverfiondID != null) {
                FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(this.driverfiondID).child("RiderID").removeValue();
                this.driverfiondID = null;
                this.linearLayout1.setVisibility(4);
                this.chronometer.setBase(SystemClock.elapsedRealtime());
            }
            this.wats = 1;
            this.driverfiund = bl2;
            this.radius = 1;
            String string2 = FirebaseAuth.getInstance().getCurrentUser().getUid();
            new GeoFire(FirebaseDatabase.getInstance().getReference("RiderRequst")).removeLocation(string2);
            Marker marker2 = this.pickupMarker;
            if (marker2 != null) {
                marker2.remove();
            }
            if ((marker = this.driverMarker) != null) {
                marker.remove();
            }
            this.driverinfo.setVisibility(8);
            this.drivername.setText((CharSequence)"");
            this.driverimage.setImageResource(2131099777);
            this.find.setText((CharSequence)"\u0627\u062d\u0635\u0644 \u0639\u0644\u0649 \u0645\u062a\u0637\u0648\u0639");
            return;
        }
        this.requestbool = true;
        String string3 = FirebaseAuth.getInstance().getCurrentUser().getUid();
        new GeoFire(FirebaseDatabase.getInstance().getReference("RiderRequst")).setLocation(string3, new GeoLocation(this.mlastlocattion.getLatitude(), this.mlastlocattion.getLongitude()));
        this.picuplocation = new LatLng(this.mlastlocattion.getLatitude(), this.mlastlocattion.getLongitude());
        this.pickupMarker = this.mMap.addMarker(new MarkerOptions().position(this.picuplocation).title("\u0627\u0646\u062a \u0647\u0646\u0627"));
        this.mediaPlayer2.start();
        this.wats = 2;
        this.progressBar.bringToFront();
        this.progressBar.setVisibility(0);
        this.find.setText((CharSequence)"\u062c\u0627\u0631\u064a \u0627\u0644\u0628\u062d\u062b \u0639\u0646 \u0645\u062a\u0637\u0648\u0639");
        this.find.setClickable(false);
        this.getClpsseteDrivers();
        this.handler.postDelayed(new Runnable(){

            public void run() {
                RiderMapActivity.this.drivernotfoind();
            }
        }, 30000L);
    }

    public void settings(View view) {
        this.startActivity(new Intent((Context)this, RiderSettingsActivity.class));
    }

}

