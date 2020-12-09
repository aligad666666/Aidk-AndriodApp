/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.Editable
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.ProgressBar
 *  android.widget.Toast
 *  androidx.appcompat.app.AppCompatActivity
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.AuthResult
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseAuth$AuthStateListener
 *  com.google.firebase.auth.FirebaseUser
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.FirebaseDatabase
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.example.aidkv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aidkv.DriverMapActivty;
import com.example.aidkv.DriverSettingsActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Driverlogin
extends AppCompatActivity {
    private EditText Email;
    private FirebaseAuth.AuthStateListener firebaseAuthLisener;
    private FirebaseAuth mAuth;
    private EditText password;
    private ProgressBar progressBar;
    String rate12 = "5";
    String rate22 = "1";
    String rate32 = "5";

    public void login(View view) {
        this.progressBar.setVisibility(0);
        String string2 = this.Email.getText().toString();
        String string3 = this.password.getText().toString();
        if (!string3.matches("") && !string2.matches("")) {
            this.progressBar.setVisibility(0);
            this.mAuth.signInWithEmailAndPassword(string2, string3).addOnCompleteListener((Activity)this, (OnCompleteListener)new OnCompleteListener<AuthResult>(){

                public void onComplete(Task<AuthResult> task) {
                    if (!task.isSuccessful()) {
                        Driverlogin.this.progressBar.setVisibility(4);
                        Toast.makeText((Context)Driverlogin.this, (CharSequence)"\u0627\u0644\u0631\u062c\u0627\u0621 \u0627\u062f\u062e\u0627\u0644 \u0628\u064a\u0627\u0646\u0627\u062a \u0635\u062d\u064a\u062d\u0629", (int)0).show();
                    }
                }
            });
            return;
        }
        this.progressBar.setVisibility(4);
        Toast.makeText((Context)this, (CharSequence)"\u0627\u0644\u0631\u062c\u0627\u0621 \u0627\u062f\u062e\u0644 \u0628\u064a\u0627\u0646\u0627\u062a\u0643", (int)0).show();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361822);
        this.progressBar = (ProgressBar)this.findViewById(2131165323);
        this.progressBar.bringToFront();
        this.progressBar.setVisibility(4);
        this.mAuth = FirebaseAuth.getInstance();
        this.firebaseAuthLisener = new FirebaseAuth.AuthStateListener(){

            public void onAuthStateChanged(FirebaseAuth firebaseAuth) {
                if (FirebaseAuth.getInstance().getCurrentUser() != null) {
                    Intent intent = new Intent((Context)Driverlogin.this, DriverMapActivty.class);
                    Driverlogin.this.startActivity(intent);
                    Driverlogin.this.finish();
                    return;
                }
            }
        };
        this.Email = (EditText)this.findViewById(2131165186);
        this.password = (EditText)this.findViewById(2131165189);
    }

    protected void onStart() {
        super.onStart();
        this.mAuth.addAuthStateListener(this.firebaseAuthLisener);
    }

    protected void onStop() {
        super.onStop();
        this.mAuth.removeAuthStateListener(this.firebaseAuthLisener);
    }

    public void rejester(View view) {
        this.progressBar.setVisibility(0);
        final String string2 = this.Email.getText().toString();
        String string3 = this.password.getText().toString();
        if (!string3.matches("") && !string2.matches("")) {
            this.mAuth.createUserWithEmailAndPassword(string2, string3).addOnCompleteListener((Activity)this, (OnCompleteListener)new OnCompleteListener<AuthResult>(){

                public void onComplete(Task<AuthResult> task) {
                    if (!task.isSuccessful()) {
                        Driverlogin.this.progressBar.setVisibility(4);
                        Toast.makeText((Context)Driverlogin.this, (CharSequence)"\u0627\u0644\u0631\u062c\u0627\u0621 \u0627\u062f\u062e\u0627\u0644 \u0627\u0644\u0628\u064a\u0627\u0646\u0627\u062a", (int)0).show();
                        return;
                    }
                    String string22 = Driverlogin.this.mAuth.getCurrentUser().getUid();
                    FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(string22).child("email").setValue((Object)string2);
                    FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(string22).child("rate1").setValue((Object)Driverlogin.this.rate12);
                    FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(string22).child("rate2").setValue((Object)Driverlogin.this.rate22);
                    FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(string22).child("rate3").setValue((Object)Driverlogin.this.rate32);
                    Intent intent = new Intent((Context)Driverlogin.this, DriverSettingsActivity.class);
                    Driverlogin.this.progressBar.setVisibility(4);
                    Driverlogin.this.startActivity(intent);
                }
            });
            return;
        }
        this.progressBar.setVisibility(4);
        Toast.makeText((Context)this, (CharSequence)"\u0627\u0644\u0631\u062c\u0627\u0621 \u0627\u062f\u062e\u0644 \u0628\u064a\u0627\u0646\u0627\u062a\u0643", (int)0).show();
    }

}

