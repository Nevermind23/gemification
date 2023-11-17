package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.manager.C2559c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import p089g4.C6215f;
import p089g4.C6224l;

/* renamed from: com.bumptech.glide.manager.u */
final class C2583u {

    /* renamed from: d */
    private static volatile C2583u f8048d;

    /* renamed from: a */
    private final C2586c f8049a;

    /* renamed from: b */
    final Set f8050b = new HashSet();

    /* renamed from: c */
    private boolean f8051c;

    /* renamed from: com.bumptech.glide.manager.u$a */
    class C2584a implements C6215f.C6217b {

        /* renamed from: a */
        final /* synthetic */ Context f8052a;

        C2584a(Context context) {
            this.f8052a = context;
        }

        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f8052a.getSystemService("connectivity");
        }
    }

    /* renamed from: com.bumptech.glide.manager.u$b */
    class C2585b implements C2559c.C2560a {
        C2585b() {
        }

        /* renamed from: a */
        public void mo7761a(boolean z) {
            ArrayList<C2559c.C2560a> arrayList;
            C6224l.m24733b();
            synchronized (C2583u.this) {
                arrayList = new ArrayList<>(C2583u.this.f8050b);
            }
            for (C2559c.C2560a a : arrayList) {
                a.mo7761a(z);
            }
        }
    }

    /* renamed from: com.bumptech.glide.manager.u$c */
    private interface C2586c {
        boolean register();

        void unregister();
    }

    /* renamed from: com.bumptech.glide.manager.u$d */
    private static final class C2587d implements C2586c {

        /* renamed from: a */
        boolean f8055a;

        /* renamed from: b */
        final C2559c.C2560a f8056b;

        /* renamed from: c */
        private final C6215f.C6217b f8057c;

        /* renamed from: d */
        private final ConnectivityManager.NetworkCallback f8058d = new C2588a();

        /* renamed from: com.bumptech.glide.manager.u$d$a */
        class C2588a extends ConnectivityManager.NetworkCallback {

            /* renamed from: com.bumptech.glide.manager.u$d$a$a */
            class C2589a implements Runnable {

                /* renamed from: d */
                final /* synthetic */ boolean f8060d;

                C2589a(boolean z) {
                    this.f8060d = z;
                }

                public void run() {
                    C2588a.this.mo8101a(this.f8060d);
                }
            }

            C2588a() {
            }

            /* renamed from: b */
            private void m9937b(boolean z) {
                C6224l.m24753v(new C2589a(z));
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo8101a(boolean z) {
                C6224l.m24733b();
                C2587d dVar = C2587d.this;
                boolean z2 = dVar.f8055a;
                dVar.f8055a = z;
                if (z2 != z) {
                    dVar.f8056b.mo7761a(z);
                }
            }

            public void onAvailable(Network network) {
                m9937b(true);
            }

            public void onLost(Network network) {
                m9937b(false);
            }
        }

        C2587d(C6215f.C6217b bVar, C2559c.C2560a aVar) {
            this.f8057c = bVar;
            this.f8056b = aVar;
        }

        public boolean register() {
            boolean z;
            if (((ConnectivityManager) this.f8057c.get()).getActiveNetwork() != null) {
                z = true;
            } else {
                z = false;
            }
            this.f8055a = z;
            try {
                ((ConnectivityManager) this.f8057c.get()).registerDefaultNetworkCallback(this.f8058d);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }

        public void unregister() {
            ((ConnectivityManager) this.f8057c.get()).unregisterNetworkCallback(this.f8058d);
        }
    }

    /* renamed from: com.bumptech.glide.manager.u$e */
    private static final class C2590e implements C2586c {

        /* renamed from: g */
        static final Executor f8062g = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: a */
        final Context f8063a;

        /* renamed from: b */
        final C2559c.C2560a f8064b;

        /* renamed from: c */
        private final C6215f.C6217b f8065c;

        /* renamed from: d */
        volatile boolean f8066d;

        /* renamed from: e */
        volatile boolean f8067e;

        /* renamed from: f */
        final BroadcastReceiver f8068f = new C2591a();

        /* renamed from: com.bumptech.glide.manager.u$e$a */
        class C2591a extends BroadcastReceiver {
            C2591a() {
            }

            public void onReceive(Context context, Intent intent) {
                C2590e.this.mo8107c();
            }
        }

        /* renamed from: com.bumptech.glide.manager.u$e$b */
        class C2592b implements Runnable {
            C2592b() {
            }

            public void run() {
                C2590e eVar = C2590e.this;
                eVar.f8066d = eVar.mo8105a();
                try {
                    C2590e eVar2 = C2590e.this;
                    eVar2.f8063a.registerReceiver(eVar2.f8068f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    C2590e.this.f8067e = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    C2590e.this.f8067e = false;
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.u$e$c */
        class C2593c implements Runnable {
            C2593c() {
            }

            public void run() {
                if (C2590e.this.f8067e) {
                    C2590e.this.f8067e = false;
                    C2590e eVar = C2590e.this;
                    eVar.f8063a.unregisterReceiver(eVar.f8068f);
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.u$e$d */
        class C2594d implements Runnable {
            C2594d() {
            }

            public void run() {
                boolean z = C2590e.this.f8066d;
                C2590e eVar = C2590e.this;
                eVar.f8066d = eVar.mo8105a();
                if (z != C2590e.this.f8066d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C2590e.this.f8066d);
                    }
                    C2590e eVar2 = C2590e.this;
                    eVar2.mo8106b(eVar2.f8066d);
                }
            }
        }

        /* renamed from: com.bumptech.glide.manager.u$e$e */
        class C2595e implements Runnable {

            /* renamed from: d */
            final /* synthetic */ boolean f8073d;

            C2595e(boolean z) {
                this.f8073d = z;
            }

            public void run() {
                C2590e.this.f8064b.mo7761a(this.f8073d);
            }
        }

        C2590e(Context context, C6215f.C6217b bVar, C2559c.C2560a aVar) {
            this.f8063a = context.getApplicationContext();
            this.f8065c = bVar;
            this.f8064b = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8105a() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f8065c.get()).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return false;
                }
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8106b(boolean z) {
            C6224l.m24753v(new C2595e(z));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo8107c() {
            f8062g.execute(new C2594d());
        }

        public boolean register() {
            f8062g.execute(new C2592b());
            return true;
        }

        public void unregister() {
            f8062g.execute(new C2593c());
        }
    }

    private C2583u(Context context) {
        C2586c cVar;
        C6215f.C6217b a = C6215f.m24712a(new C2584a(context));
        C2585b bVar = new C2585b();
        if (Build.VERSION.SDK_INT >= 24) {
            cVar = new C2587d(a, bVar);
        } else {
            cVar = new C2590e(context, a, bVar);
        }
        this.f8049a = cVar;
    }

    /* renamed from: a */
    static C2583u m9930a(Context context) {
        if (f8048d == null) {
            synchronized (C2583u.class) {
                if (f8048d == null) {
                    f8048d = new C2583u(context.getApplicationContext());
                }
            }
        }
        return f8048d;
    }

    /* renamed from: b */
    private void m9931b() {
        if (!this.f8051c && !this.f8050b.isEmpty()) {
            this.f8051c = this.f8049a.register();
        }
    }

    /* renamed from: c */
    private void m9932c() {
        if (this.f8051c && this.f8050b.isEmpty()) {
            this.f8049a.unregister();
            this.f8051c = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo8096d(C2559c.C2560a aVar) {
        this.f8050b.add(aVar);
        m9931b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo8097e(C2559c.C2560a aVar) {
        this.f8050b.remove(aVar);
        m9932c();
    }
}
