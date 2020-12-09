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
 *  android.net.Uri
 *  android.os.Bundle
 *  android.provider.MediaStore
 *  android.provider.MediaStore$Images
 *  android.provider.MediaStore$Images$Media
 *  android.text.Editable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  androidx.appcompat.app.AppCompatActivity
 *  com.bumptech.glide.Glide
 *  com.bumptech.glide.RequestBuilder
 *  com.bumptech.glide.request.target.ViewTarget
 *  com.google.android.gms.tasks.OnFailureListener
 *  com.google.android.gms.tasks.OnSuccessListener
 *  com.google.android.gms.tasks.Task
 *  com.google.firebase.auth.FirebaseAuth
 *  com.google.firebase.auth.FirebaseUser
 *  com.google.firebase.database.DataSnapshot
 *  com.google.firebase.database.DatabaseError
 *  com.google.firebase.database.DatabaseReference
 *  com.google.firebase.database.FirebaseDatabase
 *  com.google.firebase.database.ValueEventListener
 *  com.google.firebase.storage.FirebaseStorage
 *  com.google.firebase.storage.StorageReference
 *  com.google.firebase.storage.StorageTask
 *  com.google.firebase.storage.UploadTask
 *  com.google.firebase.storage.UploadTask$TaskSnapshot
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.example.aidkv;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.ViewTarget;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class DriverSettingsActivity
extends AppCompatActivity {
    static final /* synthetic */ boolean $assertionsDisabled;
    private FirebaseAuth mAuth;
    private DatabaseReference mDriverDatabase;
    private String mName;
    private EditText mNamefield;
    private String mPhone;
    private EditText mPhonefield;
    private ImageView profileImage;
    private String profileuri;
    private ProgressBar progressBar;
    private Uri resultUri;
    private String userid;

    private void getUserInfo() {
        this.mDriverDatabase.addValueEventListener(new ValueEventListener(){

            public void onCancelled(DatabaseError databaseError) {
            }

            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists() && dataSnapshot.getChildrenCount() > 0L) {
                    Map map = (Map)dataSnapshot.getValue();
                    if (map.get((Object)"name") != null) {
                        DriverSettingsActivity.this.mName = map.get((Object)"name").toString();
                        DriverSettingsActivity.this.mNamefield.setText((CharSequence)DriverSettingsActivity.this.mName);
                    }
                    if (map.get((Object)"phone") != null) {
                        DriverSettingsActivity.this.mPhone = map.get((Object)"phone").toString();
                        DriverSettingsActivity.this.mPhonefield.setText((CharSequence)DriverSettingsActivity.this.mPhone);
                    }
                    if (map.get((Object)"profilImageUri") != null) {
                        DriverSettingsActivity.this.profileuri = map.get((Object)"profilImageUri").toString();
                        Glide.with((Context)DriverSettingsActivity.this.getApplication()).load(DriverSettingsActivity.this.profileuri).into(DriverSettingsActivity.this.profileImage);
                    }
                }
            }
        });
    }

    private void saveUserInformation() {
        this.mName = this.mNamefield.getText().toString();
        this.mPhone = this.mPhonefield.getText().toString();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"name", (Object)this.mName);
        hashMap.put((Object)"phone", (Object)this.mPhone);
        this.mDriverDatabase.updateChildren((Map)hashMap);
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
            bitmap.compress(Bitmap.CompressFormat.JPEG, 30, (OutputStream)byteArrayOutputStream);
            UploadTask uploadTask = storageReference.putBytes(byteArrayOutputStream.toByteArray());
            uploadTask.addOnSuccessListener((OnSuccessListener)new OnSuccessListener<UploadTask.TaskSnapshot>(){

                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    storageReference.getDownloadUrl().addOnSuccessListener((OnSuccessListener)new OnSuccessListener<Uri>(){

                        public void onSuccess(Uri uri) {
                            HashMap hashMap = new HashMap();
                            hashMap.put((Object)"profilImageUri", (Object)uri.toString());
                            DriverSettingsActivity.this.mDriverDatabase.updateChildren((Map)hashMap);
                            DriverSettingsActivity.this.progressBar.setVisibility(4);
                            DriverSettingsActivity.this.finish();
                        }
                    });
                }

            });
            uploadTask.addOnFailureListener(new OnFailureListener(){

                public void onFailure(Exception exception) {
                    DriverSettingsActivity.this.finish();
                }
            });
            return;
        }
        this.finish();
    }

    public void back(View view) {
        this.finish();
    }

    public void conform(View view) {
        this.saveUserInformation();
        this.progressBar.setVisibility(0);
    }

    protected void onActivityResult(int n, int n2, Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n == 1 && n2 == -1) {
            this.resultUri = intent.getData();
            this.profileImage.setImageURI(this.resultUri);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361821);
        this.mNamefield = (EditText)this.findViewById(2131165305);
        this.mPhonefield = (EditText)this.findViewById(2131165319);
        this.profileImage = (ImageView)this.findViewById(2131165320);
        this.progressBar = (ProgressBar)this.findViewById(2131165321);
        this.progressBar.bringToFront();
        this.progressBar.setVisibility(4);
        this.mAuth = FirebaseAuth.getInstance();
        this.userid = this.mAuth.getCurrentUser().getUid();
        this.mDriverDatabase = FirebaseDatabase.getInstance().getReference().child("Users").child("Drivers").child(this.userid);
        this.getUserInfo();
        this.profileImage.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.PICK");
                intent.setType("image/*");
                DriverSettingsActivity.this.startActivityForResult(intent, 1);
            }
        });
    }

}

