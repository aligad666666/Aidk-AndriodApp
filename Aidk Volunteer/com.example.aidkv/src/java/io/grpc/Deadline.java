/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Deadline$SystemTicker
 *  java.lang.Comparable
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 */
package io.grpc;

import io.grpc.Deadline;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*
 * Exception performing whole class analysis.
 */
public final class Deadline
implements Comparable<Deadline> {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final long MAX_OFFSET;
    private static final long MIN_OFFSET;
    private static final long NANOS_PER_SECOND;
    private static final SystemTicker SYSTEM_TICKER;
    private final long deadlineNanos;
    private volatile boolean expired;
    private final Ticker ticker;

    static {
        SYSTEM_TICKER = new /* Unavailable Anonymous Inner Class!! */;
        MAX_OFFSET = TimeUnit.DAYS.toNanos(36500L);
        MIN_OFFSET = -MAX_OFFSET;
        NANOS_PER_SECOND = TimeUnit.SECONDS.toNanos(1L);
    }

    private Deadline(Ticker ticker, long l, long l2, boolean bl) {
        this.ticker = ticker;
        long l3 = Math.min((long)MAX_OFFSET, (long)Math.max((long)MIN_OFFSET, (long)l2));
        this.deadlineNanos = l + l3;
        boolean bl2 = bl && l3 <= 0L;
        this.expired = bl2;
    }

    private Deadline(Ticker ticker, long l, boolean bl) {
        this(ticker, ticker.read(), l, bl);
    }

    public static Deadline after(long l, TimeUnit timeUnit) {
        return Deadline.after(l, timeUnit, (Ticker)SYSTEM_TICKER);
    }

    static Deadline after(long l, TimeUnit timeUnit, Ticker ticker) {
        Deadline.checkNotNull(timeUnit, "units");
        return new Deadline(ticker, timeUnit.toNanos(l), true);
    }

    private static <T> T checkNotNull(T t, Object object) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf((Object)object));
    }

    public int compareTo(Deadline deadline) {
        long l = this.deadlineNanos - deadline.deadlineNanos;
        if (l < 0L) {
            return -1;
        }
        return l > 0L;
    }

    public boolean isBefore(Deadline deadline) {
        return this.deadlineNanos - deadline.deadlineNanos < 0L;
    }

    public boolean isExpired() {
        if (!this.expired) {
            if (this.deadlineNanos - this.ticker.read() <= 0L) {
                this.expired = true;
                return true;
            }
            return false;
        }
        return true;
    }

    public Deadline minimum(Deadline deadline) {
        if (this.isBefore(deadline)) {
            return this;
        }
        return deadline;
    }

    public Deadline offset(long l, TimeUnit timeUnit) {
        if (l == 0L) {
            return this;
        }
        Deadline deadline = new Deadline(this.ticker, this.deadlineNanos, timeUnit.toNanos(l), this.isExpired());
        return deadline;
    }

    public ScheduledFuture<?> runOnExpiration(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        Deadline.checkNotNull(runnable, "task");
        Deadline.checkNotNull(scheduledExecutorService, "scheduler");
        return scheduledExecutorService.schedule(runnable, this.deadlineNanos - this.ticker.read(), TimeUnit.NANOSECONDS);
    }

    public long timeRemaining(TimeUnit timeUnit) {
        long l = this.ticker.read();
        if (!this.expired && this.deadlineNanos - l <= 0L) {
            this.expired = true;
        }
        return timeUnit.convert(this.deadlineNanos - l, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long l = this.timeRemaining(TimeUnit.NANOSECONDS);
        long l2 = Math.abs((long)l) / NANOS_PER_SECOND;
        long l3 = Math.abs((long)l) % NANOS_PER_SECOND;
        StringBuilder stringBuilder = new StringBuilder();
        if (l < 0L) {
            stringBuilder.append('-');
        }
        stringBuilder.append(l2);
        if (l3 > 0L) {
            Object[] arrobject = new Object[]{l3};
            stringBuilder.append(String.format((String)".%09d", (Object[])arrobject));
        }
        stringBuilder.append("s from now");
        return stringBuilder.toString();
    }

    static abstract class Ticker {
        Ticker() {
        }

        public abstract long read();
    }

}

