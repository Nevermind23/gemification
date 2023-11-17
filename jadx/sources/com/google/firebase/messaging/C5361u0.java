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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p273u6.C8638b;

/* renamed from: com.google.firebase.messaging.u0 */
class C5361u0 implements Runnable {

    /* renamed from: d */
    private final long f17105d;

    /* renamed from: e */
    private final PowerManager.WakeLock f17106e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final FirebaseMessaging f17107f;

    /* renamed from: g */
    ExecutorService f17108g = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C8638b("firebase-iid-executor"));

    /* renamed from: com.google.firebase.messaging.u0$a */
    static class C5362a extends BroadcastReceiver {

        /* renamed from: a */
        private C5361u0 f17109a;

        public C5362a(C5361u0 u0Var) {
            this.f17109a = u0Var;
        }

        /* renamed from: a */
        public void mo17650a() {
            if (C5361u0.m21183c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f17109a.mo17646b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            C5361u0 u0Var = this.f17109a;
            if (u0Var != null && u0Var.mo17647d()) {
                if (C5361u0.m21183c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f17109a.f17107f.mo17531j(this.f17109a, 0);
                this.f17109a.mo17646b().unregisterReceiver(this);
                this.f17109a = null;
            }
        }
    }

    public C5361u0(FirebaseMessaging firebaseMessaging, long j) {
        this.f17107f = firebaseMessaging;
        this.f17105d = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo17646b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f17106e = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    static boolean m21183c() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Context mo17646b() {
        return this.f17107f.mo17532k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo17647d() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) mo17646b().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo17648e() {
        try {
            if (this.f17107f.mo17530i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e) {
            if (C5306a0.m20980g(e.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (C5352q0.m21157b().mo17631e(mo17646b())) {
            this.f17106e.acquire();
        }
        try {
            this.f17107f.mo17527A(true);
            if (!this.f17107f.mo17536t()) {
                this.f17107f.mo17527A(false);
                if (C5352q0.m21157b().mo17631e(mo17646b())) {
                    this.f17106e.release();
                }
            } else if (!C5352q0.m21157b().mo17630d(mo17646b()) || mo17647d()) {
                if (mo17648e()) {
                    this.f17107f.mo17527A(false);
                } else {
                    this.f17107f.mo17528D(this.f17105d);
                }
                if (!C5352q0.m21157b().mo17631e(mo17646b())) {
                    return;
                }
                this.f17106e.release();
            } else {
                new C5362a(this).mo17650a();
                if (C5352q0.m21157b().mo17631e(mo17646b())) {
                    this.f17106e.release();
                }
            }
        } catch (IOException e) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
            this.f17107f.mo17527A(false);
            if (!C5352q0.m21157b().mo17631e(mo17646b())) {
            }
        } catch (Throwable th) {
            if (C5352q0.m21157b().mo17631e(mo17646b())) {
                this.f17106e.release();
            }
            throw th;
        }
    }
}
