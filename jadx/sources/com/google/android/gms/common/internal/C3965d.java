package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;
import p182n6.C7278o0;

/* renamed from: com.google.android.gms.common.internal.d */
public abstract class C3965d {

    /* renamed from: a */
    private static final Object f12681a = new Object();

    /* renamed from: b */
    private static C3987y f12682b = null;

    /* renamed from: c */
    static HandlerThread f12683c = null;

    /* renamed from: d */
    private static Executor f12684d = null;

    /* renamed from: e */
    private static boolean f12685e = false;

    /* renamed from: a */
    public static C3965d m15083a(Context context) {
        Looper looper;
        synchronized (f12681a) {
            if (f12682b == null) {
                Context applicationContext = context.getApplicationContext();
                if (f12685e) {
                    looper = m15084b().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                f12682b = new C3987y(applicationContext, looper, f12684d);
            }
        }
        return f12682b;
    }

    /* renamed from: b */
    public static HandlerThread m15084b() {
        synchronized (f12681a) {
            HandlerThread handlerThread = f12683c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f12683c = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = f12683c;
            return handlerThread3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo12261c(C7278o0 o0Var, ServiceConnection serviceConnection, String str);

    /* renamed from: d */
    public final void mo12262d(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo12261c(new C7278o0(str, str2, 4225, z), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo12263e(C7278o0 o0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
