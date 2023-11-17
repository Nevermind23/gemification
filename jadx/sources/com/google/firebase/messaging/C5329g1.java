package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p247s6.C8242b;
import p273u6.C8638b;
import p337z7.C9227g;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.g1 */
class C5329g1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f17052a;

    /* renamed from: b */
    private final Intent f17053b;

    /* renamed from: c */
    private final ScheduledExecutorService f17054c;

    /* renamed from: d */
    private final Queue f17055d;

    /* renamed from: e */
    private C5318d1 f17056e;

    /* renamed from: f */
    private boolean f17057f;

    /* renamed from: com.google.firebase.messaging.g1$a */
    static class C5330a {

        /* renamed from: a */
        final Intent f17058a;

        /* renamed from: b */
        private final C9227g f17059b = new C9227g();

        C5330a(Intent intent) {
            this.f17058a = intent;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m21103f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f17058a.getAction() + " Releasing WakeLock.");
            mo17604d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo17603c(ScheduledExecutorService scheduledExecutorService) {
            boolean z;
            long j;
            if ((this.f17058a.getFlags() & 268435456) != 0) {
                z = true;
            } else {
                z = false;
            }
            C5323e1 e1Var = new C5323e1(this);
            if (z) {
                j = C5311b1.f17025a;
            } else {
                j = 9000;
            }
            mo17605e().mo24857b(scheduledExecutorService, new C5326f1(scheduledExecutorService.schedule(e1Var, j, TimeUnit.MILLISECONDS)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo17604d() {
            this.f17059b.mo24887e((Object) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Task mo17605e() {
            return this.f17059b.mo24883a();
        }
    }

    C5329g1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C8638b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    private void m21097a() {
        while (!this.f17055d.isEmpty()) {
            ((C5330a) this.f17055d.poll()).mo17604d();
        }
    }

    /* renamed from: b */
    private synchronized void m21098b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f17055d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            C5318d1 d1Var = this.f17056e;
            if (d1Var == null || !d1Var.isBinderAlive()) {
                m21099d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f17056e.mo17571c((C5330a) this.f17055d.poll());
        }
    }

    /* renamed from: d */
    private void m21099d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f17057f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (!this.f17057f) {
            this.f17057f = true;
            try {
                if (!C8242b.m31044b().mo23425a(this.f17052a, this.f17053b, this, 65)) {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f17057f = false;
                    m21097a();
                }
            } catch (SecurityException e) {
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized Task mo17600c(Intent intent) {
        C5330a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new C5330a(intent);
        aVar.mo17603c(this.f17054c);
        this.f17055d.add(aVar);
        m21098b();
        return aVar.mo17605e();
    }

    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f17057f = false;
        if (!(iBinder instanceof C5318d1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            m21097a();
            return;
        }
        this.f17056e = (C5318d1) iBinder;
        m21098b();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m21098b();
    }

    C5329g1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f17055d = new ArrayDeque();
        this.f17057f = false;
        Context applicationContext = context.getApplicationContext();
        this.f17052a = applicationContext;
        this.f17053b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f17054c = scheduledExecutorService;
    }
}
