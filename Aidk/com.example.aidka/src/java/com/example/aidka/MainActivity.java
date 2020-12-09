/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Bundle
 *  android.view.View
 *  android.widget.Toast
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.core.app.ActivityCompat
 *  androidx.core.content.ContextCompat
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.net.InetAddress
 */
package com.example.aidka;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.example.aidka.login;
import java.net.InetAddress;

public class MainActivity
extends AppCompatActivity {
    private int LOCATION_CODE2 = 5;

    private void appreq_5() {
        if (ContextCompat.checkSelfPermission((Context)this, (String)"android.permission.ACCESS_COARSE_LOCATION") + ContextCompat.checkSelfPermission((Context)this, (String)"android.permission.ACCESS_FINE_LOCATION") + ContextCompat.checkSelfPermission((Context)this, (String)"android.permission.INTERNET") + ContextCompat.checkSelfPermission((Context)this, (String)"android.permission.CALL_PHONE") + ContextCompat.checkSelfPermission((Context)this, (String)"android.permission.ACCESS_NETWORK_STATE") + ContextCompat.checkSelfPermission((Context)this, (String)"android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return;
        }
        this.requestcrosslocationpremtion();
    }

    private boolean isNetworkConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager)this.getSystemService("connectivity");
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }

    private void requestcrosslocationpremtion() {
        if (!(ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, (String)"android.permission.ACCESS_COARSE_LOCATION") || ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, (String)"android.permission.ACCESS_FINE_LOCATION") || ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, (String)"android.permission.INTERNET") || ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, (String)"android.permission.CALL_PHONE") || ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, (String)"android.permission.ACCESS_NETWORK_STATE"))) {
            if (ActivityCompat.shouldShowRequestPermissionRationale((Activity)this, (String)"android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
            ActivityCompat.requestPermissions((Activity)this, (String[])new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.INTERNET", "android.permission.CALL_PHONE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_NETWORK_STATE"}, (int)this.LOCATION_CODE2);
        }
    }

    public void driver(View view) {
        if (!this.isInternetAvailable() && this.isNetworkConnected()) {
            this.startActivity(new Intent((Context)this, login.class));
            this.finish();
            return;
        }
        Toast.makeText((Context)this, (CharSequence)"\u0627\u062a\u0635\u0644 \u0628 \u0627\u0644\u0627\u0646\u062a\u0631\u0646\u062a \u0627\u0648\u0644\u0627 ..!", (int)0).show();
    }

    public boolean isInternetAvailable() {
        try {
            InetAddress.getByName((String)"www.google.com");
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361822);
        this.appreq_5();
    }
}

