/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.grpc.Context$CancellableContext
 *  io.grpc.Context$ParentListener
 *  io.grpc.PersistentHashArrayMappedTrie
 *  io.grpc.ThreadLocalContextStorage
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Constructor
 *  java.util.ArrayList
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicReference
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package io.grpc;

import io.grpc.Context;
import io.grpc.Deadline;
import io.grpc.PersistentHashArrayMappedTrie;
import io.grpc.ThreadLocalContextStorage;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Exception performing whole class analysis.
 */
public class Context {
    static final int CONTEXT_DEPTH_WARN_THRESH = 1000;
    private static final PersistentHashArrayMappedTrie<Key<?>, Object> EMPTY_ENTRIES;
    public static final Context ROOT;
    static final Logger log;
    final CancellableContext cancellableAncestor;
    final int generation;
    final PersistentHashArrayMappedTrie<Key<?>, Object> keyValueEntries;
    private ArrayList<ExecutableListener> listeners;
    private CancellationListener parentListener;

    static {
        log = Logger.getLogger((String)Context.class.getName());
        EMPTY_ENTRIES = new PersistentHashArrayMappedTrie();
        ROOT = new Context(null, EMPTY_ENTRIES);
    }

    private Context(Context context, PersistentHashArrayMappedTrie<Key<?>, Object> persistentHashArrayMappedTrie) {
        this.parentListener = new /* Unavailable Anonymous Inner Class!! */;
        this.cancellableAncestor = Context.cancellableAncestor(context);
        this.keyValueEntries = persistentHashArrayMappedTrie;
        int n = context == null ? 0 : 1 + context.generation;
        this.generation = n;
        Context.validateGeneration(this.generation);
    }

    /* synthetic */ Context(Context context, PersistentHashArrayMappedTrie persistentHashArrayMappedTrie, 1 var3_3) {
        this(context, persistentHashArrayMappedTrie);
    }

    private Context(PersistentHashArrayMappedTrie<Key<?>, Object> persistentHashArrayMappedTrie, int n) {
        this.parentListener = new /* Unavailable Anonymous Inner Class!! */;
        this.cancellableAncestor = null;
        this.keyValueEntries = persistentHashArrayMappedTrie;
        this.generation = n;
        Context.validateGeneration(n);
    }

    static CancellableContext cancellableAncestor(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof CancellableContext) {
            return context;
        }
        return context.cancellableAncestor;
    }

    static <T> T checkNotNull(T t, Object object) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf((Object)object));
    }

    public static Context current() {
        Context context = Context.storage().current();
        if (context == null) {
            return ROOT;
        }
        return context;
    }

    public static Executor currentContextExecutor(Executor executor) {
        return executor.new 1CurrentContextExecutor();
    }

    public static <T> Key<T> key(String string) {
        return new Key(string);
    }

    public static <T> Key<T> keyWithDefault(String string, T t) {
        return new Key<T>(string, t);
    }

    static Storage storage() {
        return LazyStorage.storage;
    }

    private static void validateGeneration(int n) {
        if (n == 1000) {
            log.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable)new Exception());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void addListener(CancellationListener cancellationListener, Executor executor) {
        Context.checkNotNull(cancellationListener, "cancellationListener");
        Context.checkNotNull(executor, "executor");
        if (!this.canBeCancelled()) {
            return;
        }
        ExecutableListener executableListener = new ExecutableListener(executor, cancellationListener);
        Context context = this;
        synchronized (context) {
            if (this.isCancelled()) {
                executableListener.deliver();
            } else if (this.listeners == null) {
                this.listeners = new ArrayList();
                this.listeners.add((Object)executableListener);
                if (this.cancellableAncestor != null) {
                    this.cancellableAncestor.addListener(this.parentListener, (Executor)DirectExecutor.INSTANCE);
                }
            } else {
                this.listeners.add((Object)executableListener);
            }
            return;
        }
    }

    public Context attach() {
        Context context = Context.storage().doAttach(this);
        if (context == null) {
            return ROOT;
        }
        return context;
    }

    public <V> V call(Callable<V> callable) throws Exception {
        Context context = this.attach();
        try {
            Object object = callable.call();
            return (V)object;
        }
        finally {
            this.detach(context);
        }
    }

    boolean canBeCancelled() {
        return this.cancellableAncestor != null;
    }

    public Throwable cancellationCause() {
        CancellableContext cancellableContext = this.cancellableAncestor;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.cancellationCause();
    }

    public void detach(Context context) {
        Context.checkNotNull(context, "toAttach");
        Context.storage().detach(this, context);
    }

    public Executor fixedContextExecutor(Executor executor) {
        return new 1FixedContextExecutor(this, executor);
    }

    public Context fork() {
        return new Context(this.keyValueEntries, 1 + this.generation);
    }

    public Deadline getDeadline() {
        CancellableContext cancellableContext = this.cancellableAncestor;
        if (cancellableContext == null) {
            return null;
        }
        return cancellableContext.getDeadline();
    }

    public boolean isCancelled() {
        CancellableContext cancellableContext = this.cancellableAncestor;
        if (cancellableContext == null) {
            return false;
        }
        return cancellableContext.isCancelled();
    }

    boolean isCurrent() {
        return Context.current() == this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    int listenerCount() {
        Context context = this;
        synchronized (context) {
            if (this.listeners != null) return this.listeners.size();
            return 0;
        }
    }

    Object lookup(Key<?> key) {
        return this.keyValueEntries.get(key);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void notifyAndClearListeners() {
        if (!this.canBeCancelled()) {
            return;
        }
        Context context = this;
        // MONITORENTER : context
        if (this.listeners == null) {
            // MONITOREXIT : context
            return;
        }
        ArrayList<ExecutableListener> arrayList = this.listeners;
        this.listeners = null;
        // MONITOREXIT : context
        for (int i = 0; i < arrayList.size(); ++i) {
            if (((ExecutableListener)arrayList.get((int)i)).listener instanceof ParentListener) continue;
            ((ExecutableListener)arrayList.get(i)).deliver();
        }
        int n = 0;
        do {
            if (n >= arrayList.size()) {
                CancellableContext cancellableContext = this.cancellableAncestor;
                if (cancellableContext == null) return;
                cancellableContext.removeListener(this.parentListener);
                return;
            }
            if (((ExecutableListener)arrayList.get((int)n)).listener instanceof ParentListener) {
                ((ExecutableListener)arrayList.get(n)).deliver();
            }
            ++n;
        } while (true);
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : context
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void removeListener(CancellationListener cancellationListener) {
        if (!this.canBeCancelled()) {
            return;
        }
        Context context = this;
        synchronized (context) {
            if (this.listeners == null) return;
            int n = -1 + this.listeners.size();
            do {
                block10 : {
                    block9 : {
                        if (n < 0) break block9;
                        if (((ExecutableListener)this.listeners.get((int)n)).listener != cancellationListener) break block10;
                        this.listeners.remove(n);
                    }
                    if (!this.listeners.isEmpty()) return;
                    if (this.cancellableAncestor != null) {
                        this.cancellableAncestor.removeListener(this.parentListener);
                    }
                    this.listeners = null;
                    return;
                }
                --n;
            } while (true);
        }
    }

    public void run(Runnable runnable) {
        Context context = this.attach();
        try {
            runnable.run();
            return;
        }
        finally {
            this.detach(context);
        }
    }

    public CancellableContext withCancellation() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public CancellableContext withDeadline(Deadline deadline, ScheduledExecutorService scheduledExecutorService) {
        Context.checkNotNull(deadline, "deadline");
        Context.checkNotNull(scheduledExecutorService, "scheduler");
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public CancellableContext withDeadlineAfter(long l, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return this.withDeadline(Deadline.after(l, timeUnit), scheduledExecutorService);
    }

    public <V> Context withValue(Key<V> key, V v) {
        return new Context(this, this.keyValueEntries.put(key, v));
    }

    public <V1, V2> Context withValues(Key<V1> key, V1 V1, Key<V2> key2, V2 V2) {
        return new Context(this, this.keyValueEntries.put(key, V1).put(key2, V2));
    }

    public <V1, V2, V3> Context withValues(Key<V1> key, V1 V1, Key<V2> key2, V2 V2, Key<V3> key3, V3 V3) {
        return new Context(this, this.keyValueEntries.put(key, V1).put(key2, V2).put(key3, V3));
    }

    public <V1, V2, V3, V4> Context withValues(Key<V1> key, V1 V1, Key<V2> key2, V2 V2, Key<V3> key3, V3 V3, Key<V4> key4, V4 V4) {
        return new Context(this, this.keyValueEntries.put(key, V1).put(key2, V2).put(key3, V3).put(key4, V4));
    }

    public Runnable wrap(final Runnable runnable) {
        return new Runnable(){

            public void run() {
                Context context = Context.this.attach();
                try {
                    runnable.run();
                    return;
                }
                finally {
                    Context.this.detach(context);
                }
            }
        };
    }

    public <C> Callable<C> wrap(final Callable<C> callable) {
        return new Callable<C>(){

            public C call() throws Exception {
                Context context = Context.this.attach();
                try {
                    Object object = callable.call();
                    return (C)object;
                }
                finally {
                    Context.this.detach(context);
                }
            }
        };
    }

    final class 1CurrentContextExecutor
    implements Executor {
        1CurrentContextExecutor() {
        }

        public void execute(Runnable runnable) {
            Executor.this.execute(Context.current().wrap(runnable));
        }
    }

    final class 1FixedContextExecutor
    implements Executor {
        final /* synthetic */ Executor val$e;

        1FixedContextExecutor() {
            this.val$e = var2_2;
        }

        public void execute(Runnable runnable) {
            this.val$e.execute(this$0.wrap(runnable));
        }
    }

    static @interface CanIgnoreReturnValue {
    }

    public static interface CancellationListener {
        public void cancelled(Context var1);
    }

    static @interface CheckReturnValue {
    }

    private static final class DirectExecutor
    extends Enum<DirectExecutor>
    implements Executor {
        private static final /* synthetic */ DirectExecutor[] $VALUES;
        public static final /* enum */ DirectExecutor INSTANCE = new DirectExecutor();

        static {
            DirectExecutor[] arrdirectExecutor = new DirectExecutor[]{INSTANCE};
            $VALUES = arrdirectExecutor;
        }

        public static DirectExecutor valueOf(String string) {
            return (DirectExecutor)Enum.valueOf(DirectExecutor.class, (String)string);
        }

        public static DirectExecutor[] values() {
            return (DirectExecutor[])$VALUES.clone();
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }

        public String toString() {
            return "Context.DirectExecutor";
        }
    }

    private final class ExecutableListener
    implements Runnable {
        private final Executor executor;
        final CancellationListener listener;

        ExecutableListener(Executor executor, CancellationListener cancellationListener) {
            this.executor = executor;
            this.listener = cancellationListener;
        }

        void deliver() {
            try {
                this.executor.execute((Runnable)this);
                return;
            }
            catch (Throwable throwable) {
                Context.log.log(Level.INFO, "Exception notifying context listener", throwable);
                return;
            }
        }

        public void run() {
            this.listener.cancelled(Context.this);
        }
    }

    public static final class Key<T> {
        private final T defaultValue;
        private final String name;

        Key(String string) {
            this(string, null);
        }

        Key(String string, T t) {
            this.name = Context.checkNotNull(string, "name");
            this.defaultValue = t;
        }

        public T get() {
            return this.get(Context.current());
        }

        public T get(Context context) {
            Object object = context.lookup(this);
            if (object == null) {
                return this.defaultValue;
            }
            return (T)object;
        }

        public String toString() {
            return this.name;
        }
    }

    private static final class LazyStorage {
        static final Storage storage;

        static {
            AtomicReference atomicReference = new AtomicReference();
            storage = LazyStorage.createStorage((AtomicReference<? super ClassNotFoundException>)atomicReference);
            Throwable throwable = (Throwable)atomicReference.get();
            if (throwable != null) {
                Context.log.log(Level.FINE, "Storage override doesn't exist. Using default", throwable);
            }
        }

        private LazyStorage() {
        }

        private static Storage createStorage(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                Storage storage = (Storage)Class.forName((String)"io.grpc.override.ContextStorageOverride").asSubclass(Storage.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                return storage;
            }
            catch (Exception exception) {
                throw new RuntimeException("Storage override failed to initialize", (Throwable)exception);
            }
            catch (ClassNotFoundException classNotFoundException) {
                atomicReference.set((Object)classNotFoundException);
                return new ThreadLocalContextStorage();
            }
        }
    }

    public static abstract class Storage {
        @Deprecated
        public void attach(Context context) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract Context current();

        public abstract void detach(Context var1, Context var2);

        public Context doAttach(Context context) {
            Context context2 = this.current();
            this.attach(context);
            return context2;
        }
    }

}

