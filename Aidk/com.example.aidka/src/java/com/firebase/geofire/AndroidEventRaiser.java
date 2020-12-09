/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.firebase.geofire;

import android.os.Handler;
import android.os.Looper;
import com.firebase.geofire.EventRaiser;

class AndroidEventRaiser
implements EventRaiser {
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    @Override
    public void raiseEvent(Runnable runnable) {
        this.mainThreadHandler.post(runnable);
    }
}

