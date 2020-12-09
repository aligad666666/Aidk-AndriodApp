/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.media.MediaPlayer
 *  android.net.Uri
 *  android.os.Bundle
 *  android.provider.MediaStore
 *  android.provider.MediaStore$Images
 *  android.provider.MediaStore$Images$Media
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.Toast
 *  androidx.appcompat.app.AppCompatActivity
 *  com.google.android.gms.tasks.OnFailureListener
 *  com.google.android.gms.tasks.OnSuccessListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.FirebaseDatabase
 *  com.google.firebase.storage.FirebaseStorage
 *  com.google.firebase.storage.StorageReference
 *  com.google.firebase.storage.StorageTask
 *  com.google.firebase.storage.UploadTask
 *  com.google.firebase.storage.UploadTask$TaskSnapshot
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.example.aidka;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.aidka.RiderMapActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class addphoto
extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled;
    private Button btn;
    DatabaseReference current_user_db2;
    private FirebaseAuth mAuth;
    private MediaPlayer mediaPlayer;
    private ImageView mic;
    private ImageView profile;
    private ProgressBar progressBar;
    private Uri resultUri;
    private String userid;

    private void saveimage() {
        this.current_user_db2 = FirebaseDatabase.getInstance().getReference().child("Users").child("Rider").child(this.userid);
        if (this.resultUri != null) {
            final StorageReference storageReference = FirebaseStorage.getInstance().getReference().child("profile_Images").child(this.userid);
            Bitmap bitmap = null;
            try {
                Bitmap bitmap2;
                bitmap = bitmap2 = MediaStore.Images.Media.getBitmap((ContentResolver)this.getApplication().getContentResolver(), (Uri)this.resultUri);
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 20, (OutputStream)byteArrayOutputStream);
            UploadTask uploadTask = storageReference.putBytes(byteArrayOutputStream.toByteArray());
            uploadTask.addOnSuccessListener((OnSuccessListener)new OnSuccessListener<UploadTask.TaskSnapshot>(){

                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    storageReference.getDownloadUrl().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<Uri>(){

                        public void onSuccess(Uri uri) {
                            HashMap hashMap = new HashMap();
                            hashMap.put((Object)"profilImageUri", (Object)uri.toString());
                            addphoto.this.current_user_db2.updateChildren((Map)hashMap);
                            Intent intent = new Intent((Context)addphoto.this, RiderMapActivity.class);
                            addphoto.this.progressBar.setVisibility(4);
                            addphoto.this.startActivity(intent);
                            addphoto.this.finish();
                        }
                    });
                }

            });
            uploadTask.addOnFailureListener(new OnFailureListener(){

                public void onFailure(Exception exception) {
                    addphoto.this.finish();
                }
            });
            return;
        }
        Toast.makeText((Context)this, (CharSequence)"\u0645\u0646 \u0641\u0636\u0644\u0643 \u0627\u062f\u062e\u0644 \u0635\u0648\u0631\u0629 \u0634\u062e\u0635\u064a\u0629", (int)0).show();
    }

    protected void onActivityResult(int n, int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1 && n2 == -1) {
            this.resultUri = intent.getData();
            this.profile.setImageURI(this.resultUri);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361820);
        this.mic = (ImageView)this.findViewById(2131165309);
        this.profile = (ImageView)this.findViewById(2131165328);
        this.progressBar = (ProgressBar)this.findViewById(2131165331);
        this.progressBar.bringToFront();
        this.progressBar.setVisibility(4);
        this.mediaPlayer = MediaPlayer.create((Context)this.getApplicationContext(), (int)2131492871);
        this.btn = (Button)this.findViewById(2131165253);
        this.mAuth = FirebaseAuth.getInstance();
        this.userid = this.mAuth.getCurrentUser().getUid();
        this.mediaPlayer.start();
        this.mic.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                addphoto.this.mediaPlayer.start();
            }
        });
        this.profile.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType("image/*");
                addphoto.this.startActivityForResult(intent, 1);
            }
        });
        this.btn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                addphoto.this.saveimage();
            }
        });
    }

}

