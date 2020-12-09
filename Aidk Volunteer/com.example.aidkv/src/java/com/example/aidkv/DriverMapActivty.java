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
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
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
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Map
 */
package com.example.aidkv;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.ViewTarget;
import com.example.aidkv.DriverSettingsActivity;
import com.firebase.geofire.GeoFire;
import com.firebase.geofire.GeoLocation;
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
import java.util.List;
import java.util.Map;

public class DriverMapActivty
extends FragmentActivity
implements OnMapReadyCallback,
GoogleApiClient.ConnectionCallbacks,
GoogleApiClient.OnConnectionFailedListener,
LocationListener {
    private String RiderID = "";
    private DatabaseReference Riderrpicklocationref;
    private ValueEventListener Riderrpicklocationreflesner;
    private Button busy;
    final Handler handler = new Handler();
    private Button here;
    private GoogleMap mMap;
    private MediaPlayer mediaPlayer;
    GoogleApiClient mgoogleapi;
    Location mlastlocattion;
    LocationRequest mlocationrequst;
    private Button on;
    private boolean onof;
    private String phone;
    Marker pickuplocation;
    private ProgressBar progressBar;
    private TextView raidername;
    private ImageView riderimage;
    private LinearLayout riderinfo;

    private void getAssgnedRider() {
        String string2 = FirebaseAuth.getInstance().getCurrentUser().getUid();
        FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(string2).child("RiderID").addValueEventListener(new ValueEventListener(){

            public void onCancelled(DatabaseError databaseError) {
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    DriverMapActivty.this.RiderID = dataSnapshot.getValue().toString();
                    DriverMapActivty.this.getAssignedpickuplocation();
                    DriverMapActivty.this.getAssignedinfo();
                    return;
                }
                DriverMapActivty.this.RiderID = "";
                if (DriverMapActivty.this.pickuplocation != null) {
                    DriverMapActivty.this.pickuplocation.remove();
                }
                if (DriverMapActivty.this.Riderrpicklocationreflesner != null) {
                    DriverMapActivty.this.Riderrpicklocationref.removeEventListener(DriverMapActivty.this.Riderrpicklocationreflesner);
                }
                DriverMapActivty.this.riderinfo.setVisibility(8);
                DriverMapActivty.this.raidername.setText((CharSequence)"");
                DriverMapActivty.this.on.setVisibility(0);
                DriverMapActivty.this.busy.setVisibility(4);
                DriverMapActivty.this.riderimage.setImageResource(2131099782);
            }
        });
    }

    private void getAssignedinfo() {
        this.riderinfo.setVisibility(0);
        this.mediaPlayer.start();
        this.on.setVisibility(4);
        this.busy.setVisibility(0);
        this.here.setVisibility(0);
        FirebaseDatabase.getInstance().getReference().child("Users").child("Rider").child(this.RiderID).addListenerForSingleValueEvent(new ValueEventListener(){

            public void onCancelled(DatabaseError databaseError) {
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists() && dataSnapshot.getChildrenCount() > 0L) {
                    Map map = (Map)dataSnapshot.getValue();
                    if (map.get((Object)"name") != null) {
                        DriverMapActivty.this.raidername.setText((CharSequence)map.get((Object)"name").toString());
                    }
                    if (map.get((Object)"phone") != null) {
                        DriverMapActivty.this.phone = map.get((Object)"phone").toString();
                    }
                    if (map.get((Object)"profilImageUri") != null) {
                        Glide.with((Context)DriverMapActivty.this.getApplicationContext()).load(map.get((Object)"profilImageUri").toString()).into(DriverMapActivty.this.riderimage);
                    }
                }
            }
        });
    }

    private void getAssignedpickuplocation() {
        this.Riderrpicklocationref = FirebaseDatabase.getInstance().getReference().child("RiderRequst").child(this.RiderID).child("l");
        this.Riderrpicklocationreflesner = this.Riderrpicklocationref.addValueEventListener(new ValueEventListener(){

            public void onCancelled(DatabaseError databaseError) {
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists() && !DriverMapActivty.this.RiderID.equals((Object)"")) {
                    List list = (List)dataSnapshot.getValue();
                    double d = 0.0;
                    double d2 = 0.0;
                    if (list.get(0) != null) {
                        d = Double.parseDouble((String)list.get(0).toString());
                    }
                    if (list.get(1) != null) {
                        d2 = Double.parseDouble((String)list.get(1).toString());
                    }
                    LatLng latLng = new LatLng(d, d2);
                    DriverMapActivty driverMapActivty = DriverMapActivty.this;
                    driverMapActivty.pickuplocation = driverMapActivty.mMap.addMarker(new MarkerOptions().position(latLng).title("\u0627\u0644\u0627\u0645\u064a"));
                }
            }
        });
    }

    protected void bulldgoogleapiClint() {
        DriverMapActivty driverMapActivty = this;
        synchronized (driverMapActivty) {
            this.mgoogleapi = new GoogleApiClient.Builder((Context)this).addConnectionCallbacks((GoogleApiClient.ConnectionCallbacks)this).addOnConnectionFailedListener((GoogleApiClient.OnConnectionFailedListener)this).addApi(LocationServices.API).build();
            this.mgoogleapi.connect();
            return;
        }
    }

    public void etsal(View view) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("tel:");
        stringBuilder.append(this.phone);
        Intent intent = new Intent("android.intent.action.CALL", Uri.parse((String)stringBuilder.toString()));
        if (Build.VERSION.SDK_INT >= 23 && this.checkSelfPermission("android.permission.CALL_PHONE") != 0) {
            return;
        }
        this.startActivity(intent);
    }

    public void on(View view) {
        if (!this.onof) {
            this.progressBar.setVisibility(0);
            this.handler.postDelayed(new Runnable(){

                public void run() {
                    DriverMapActivty.this.onof = true;
                    DriverMapActivty.this.on.setText((CharSequence)"go offline");
                    DriverMapActivty.this.progressBar.setVisibility(4);
                }
            }, 7000L);
            return;
        }
        this.progressBar.setVisibility(0);
        this.handler.postDelayed(new Runnable(){

            public void run() {
                DriverMapActivty.this.onof = false;
                DriverMapActivty.this.on.setText((CharSequence)"go online");
                DriverMapActivty.this.progressBar.setVisibility(4);
            }
        }, 7000L);
    }

    public void onConnected(Bundle bundle) {
        this.mlocationrequst = new LocationRequest();
        this.mlocationrequst.setInterval(1000L);
        this.mlocationrequst.setFastestInterval(1000L);
        this.mlocationrequst.setPriority(102);
        LocationServices.FusedLocationApi.requestLocationUpdates(this.mgoogleapi, this.mlocationrequst, (LocationListener)this);
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
    }

    public void onConnectionSuspended(int n) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361820);
        ((SupportMapFragment)this.getSupportFragmentManager().findFragmentById(2131165301)).getMapAsync((OnMapReadyCallback)this);
        this.mediaPlayer = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492864);
        this.progressBar = (ProgressBar)this.findViewById(2131165322);
        this.progressBar.bringToFront();
        this.progressBar.setVisibility(4);
        this.raidername = (TextView)this.findViewById(2131165327);
        this.riderimage = (ImageView)this.findViewById(2131165328);
        this.riderinfo = (LinearLayout)this.findViewById(2131165329);
        this.on = (Button)this.findViewById(2131165314);
        this.busy = (Button)this.findViewById(2131165252);
        this.here = (Button)this.findViewById(2131165283);
        this.onof = false;
        this.getAssgnedRider();
        this.here.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                DriverMapActivty.this.mediaPlayer.stop();
                DriverMapActivty.this.here.setVisibility(4);
            }
        });
    }

    protected void onDestroy() {
        super.onDestroy();
        String string2 = FirebaseAuth.getInstance().getCurrentUser().getUid();
        FirebaseDatabase.getInstance().getReference("Drivers_Avaleble").child(string2).removeValue();
    }

    public void onLocationChanged(Location location) {
        if (this.getApplicationContext() != null) {
            this.mlastlocattion = location;
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            this.mMap.moveCamera(CameraUpdateFactory.newLatLng((LatLng)latLng));
            this.mMap.animateCamera(CameraUpdateFactory.zoomTo((float)15.0f));
            String string2 = FirebaseAuth.getInstance().getCurrentUser().getUid();
            GeoFire geoFire = new GeoFire(FirebaseDatabase.getInstance().getReference("Drivers_Avaleble"));
            GeoFire geoFire2 = new GeoFire(FirebaseDatabase.getInstance().getReference("Drivers_working"));
            String string3 = this.RiderID;
            int n = -1;
            if (string3.hashCode() == 0 && string3.equals((Object)"")) {
                n = 0;
            }
            if (n != 0) {
                geoFire.removeLocation(string2);
                geoFire2.setLocation(string2, new GeoLocation(location.getLatitude(), location.getLongitude()));
                return;
            }
            geoFire2.removeLocation(string2);
            boolean bl = this.onof;
            if (bl) {
                geoFire.setLocation(string2, new GeoLocation(location.getLatitude(), location.getLongitude()));
                return;
            }
            if (!bl) {
                geoFire.removeLocation(string2);
            }
        }
    }

    public void onMapReady(GoogleMap googleMap) {
        this.mMap = googleMap;
        this.bulldgoogleapiClint();
        this.mMap.setMyLocationEnabled(true);
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onStop() {
        super.onStop();
    }

    public void settings(View view) {
        this.startActivity(new Intent((Context)this, DriverSettingsActivity.class));
    }

}

