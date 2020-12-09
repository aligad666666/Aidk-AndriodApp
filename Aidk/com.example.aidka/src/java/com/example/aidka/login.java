/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.media.MediaPlayer
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.text.Editable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.Toast
 *  androidx.appcompat.app.AppCompatActivity
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.AuthResult
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.FirebaseDatabase
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.example.aidka;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aidka.RiderMapActivity;
import com.example.aidka.addphoto;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class login
extends AppCompatActivity {
    DatabaseReference current_user_db2;
    final Handler handler = new Handler();
    private Boolean log;
    private FirebaseAuth mAuth;
    private String mPhone;
    private MediaPlayer mediaPlayer;
    private ImageView mic;
    private EditText phone;
    private ImageView profile;
    private ProgressBar progressBar;
    private Uri resultUri;
    private String userid;

    private void updatu(FirebaseUser firebaseUser) {
        if (firebaseUser == null) {
            this.log = true;
            this.mAuth.signInAnonymously().addOnCompleteListener((Activity)this, (OnCompleteListener)new OnCompleteListener<AuthResult>(){

                public void onComplete(Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        login.this.mAuth.getCurrentUser();
                        return;
                    }
                    login.this.updatu(null);
                }
            });
            return;
        }
        if (firebaseUser != null) {
            this.startActivity(new Intent((Context)this, RiderMapActivity.class));
            this.mediaPlayer.stop();
            this.finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361821);
        this.log = false;
        this.progressBar = (ProgressBar)this.findViewById(2131165330);
        this.progressBar.bringToFront();
        this.progressBar.setVisibility(4);
        this.mic = (ImageView)this.findViewById(2131165308);
        this.phone = (EditText)this.findViewById(2131165326);
        this.mediaPlayer = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492868);
        this.mAuth = FirebaseAuth.getInstance();
        this.handler.postDelayed(new Runnable(){

            public void run() {
                login.this.mediaPlayer.start();
            }
        }, 600L);
        this.mic.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                login.this.mediaPlayer.start();
            }
        });
    }

    protected void onStart() {
        super.onStart();
        if (!this.log.booleanValue()) {
            this.updatu(this.mAuth.getCurrentUser());
        }
    }

    public void rejest12(View view) {
        this.progressBar.setVisibility(0);
        this.mPhone = this.phone.getText().toString();
        String string2 = this.mAuth.getCurrentUser().getUid();
        FirebaseDatabase.getInstance().getReference().child("Users").child("Rider").child(string2).setValue((Object)true);
        if (!this.mPhone.matches("")) {
            FirebaseDatabase.getInstance().getReference().child("Users").child("Rider").child(string2).child("phone").setValue((Object)this.mPhone);
            this.progressBar.setVisibility(4);
            this.startActivity(new Intent((Context)this, addphoto.class));
            this.mediaPlayer.stop();
            this.finish();
            return;
        }
        this.progressBar.setVisibility(4);
        Toast.makeText((Context)this, (CharSequence)"\u0627\u0644\u0631\u062c\u0627\u0621 \u0627\u062f\u062e\u0644 \u0631\u0642\u0645 \u0627\u0644\u0647\u0627\u062a\u0641", (int)0).show();
    }

}

