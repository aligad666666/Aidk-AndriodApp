/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 */
package com.firebase.geofire;

import com.firebase.geofire.EventRaiser;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadEventRaiser
implements EventRaiser {
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    @Override
    public void raiseEvent(Runnable runnable) {
        this.executorService.submit(runnable);
    }
}

