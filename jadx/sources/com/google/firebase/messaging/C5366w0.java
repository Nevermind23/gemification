package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.w0 */
final class C5366w0 {

    /* renamed from: d */
    private static WeakReference f17120d;

    /* renamed from: a */
    private final SharedPreferences f17121a;

    /* renamed from: b */
    private C5356s0 f17122b;

    /* renamed from: c */
    private final Executor f17123c;

    private C5366w0(SharedPreferences sharedPreferences, Executor executor) {
        this.f17123c = executor;
        this.f17121a = sharedPreferences;
    }

    /* renamed from: a */
    public static synchronized C5366w0 m21194a(Context context, Executor executor) {
        C5366w0 w0Var;
        synchronized (C5366w0.class) {
            WeakReference weakReference = f17120d;
            if (weakReference != null) {
                w0Var = (C5366w0) weakReference.get();
            } else {
                w0Var = null;
            }
            if (w0Var == null) {
                w0Var = new C5366w0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                w0Var.m21195c();
                f17120d = new WeakReference(w0Var);
            }
        }
        return w0Var;
    }

    /* renamed from: c */
    private synchronized void m21195c() {
        this.f17122b = C5356s0.m21166c(this.f17121a, "topic_operation_queue", ",", this.f17123c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized C5364v0 mo17658b() {
        return C5364v0.m21188a(this.f17122b.mo17636e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean mo17659d(C5364v0 v0Var) {
        return this.f17122b.mo17637f(v0Var.mo17654e());
    }
}
