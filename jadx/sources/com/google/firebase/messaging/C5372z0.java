package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.z0 */
class C5372z0 implements Runnable {

    /* renamed from: i */
    private static final Object f17140i = new Object();

    /* renamed from: j */
    private static Boolean f17141j;

    /* renamed from: k */
    private static Boolean f17142k;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f17143d;

    /* renamed from: e */
    private final C5325f0 f17144e;

    /* renamed from: f */
    private final PowerManager.WakeLock f17145f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5370y0 f17146g;

    /* renamed from: h */
    private final long f17147h;

    /* renamed from: com.google.firebase.messaging.z0$a */
    class C5373a extends BroadcastReceiver {

        /* renamed from: a */
        private C5372z0 f17148a;

        public C5373a(C5372z0 z0Var) {
            this.f17148a = z0Var;
        }

        /* renamed from: a */
        public void mo17671a() {
            if (C5372z0.m21227j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            C5372z0.this.f17143d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            C5372z0 z0Var = this.f17148a;
            if (z0Var != null) {
                if (z0Var.m21226i()) {
                    if (C5372z0.m21227j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f17148a.f17146g.mo17665l(this.f17148a, 0);
                    context.unregisterReceiver(this);
                    this.f17148a = null;
                }
            }
        }
    }

    C5372z0(C5370y0 y0Var, Context context, C5325f0 f0Var, long j) {
        this.f17146g = y0Var;
        this.f17143d = context;
        this.f17147h = j;
        this.f17144e = f0Var;
        this.f17145f = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: e */
    private static String m21222e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    /* renamed from: f */
    private static boolean m21223f(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f17140i) {
            Boolean bool = f17142k;
            if (bool == null) {
                z = m21224g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f17142k = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: g */
    private static boolean m21224g(Context context, String str, Boolean bool) {
        boolean z;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", m21222e(str));
        }
        return z;
    }

    /* renamed from: h */
    private static boolean m21225h(Context context) {
        boolean z;
        boolean booleanValue;
        synchronized (f17140i) {
            Boolean bool = f17141j;
            if (bool == null) {
                z = m21224g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z);
            f17141j = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized boolean m21226i() {
        NetworkInfo networkInfo;
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f17143d.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static boolean m21227j() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    public void run() {
        PowerManager.WakeLock wakeLock;
        if (m21225h(this.f17143d)) {
            this.f17145f.acquire(C5320e.f17037a);
        }
        try {
            this.f17146g.mo17666m(true);
            if (!this.f17144e.mo17579g()) {
                this.f17146g.mo17666m(false);
                if (m21225h(this.f17143d)) {
                    try {
                        this.f17145f.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!m21223f(this.f17143d) || m21226i()) {
                if (this.f17146g.mo17668p()) {
                    this.f17146g.mo17666m(false);
                } else {
                    this.f17146g.mo17669q(this.f17147h);
                }
                if (m21225h(this.f17143d)) {
                    try {
                        wakeLock = this.f17145f;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new C5373a(this).mo17671a();
                if (m21225h(this.f17143d)) {
                    try {
                        this.f17145f.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
            this.f17146g.mo17666m(false);
            if (m21225h(this.f17143d)) {
                wakeLock = this.f17145f;
            }
        } catch (Throwable th) {
            if (m21225h(this.f17143d)) {
                try {
                    this.f17145f.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
