package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p182n6.C7278o0;
import p182n6.C7284r0;
import p260t6.C8413o;

/* renamed from: com.google.android.gms.common.internal.w */
final class C3985w implements ServiceConnection, C7284r0 {

    /* renamed from: a */
    private final Map f12703a = new HashMap();

    /* renamed from: b */
    private int f12704b = 2;

    /* renamed from: c */
    private boolean f12705c;

    /* renamed from: d */
    private IBinder f12706d;

    /* renamed from: e */
    private final C7278o0 f12707e;

    /* renamed from: f */
    private ComponentName f12708f;

    /* renamed from: g */
    final /* synthetic */ C3987y f12709g;

    public C3985w(C3987y yVar, C7278o0 o0Var) {
        this.f12709g = yVar;
        this.f12707e = o0Var;
    }

    /* renamed from: a */
    public final int mo12294a() {
        return this.f12704b;
    }

    /* renamed from: b */
    public final ComponentName mo12295b() {
        return this.f12708f;
    }

    /* renamed from: c */
    public final IBinder mo12296c() {
        return this.f12706d;
    }

    /* renamed from: d */
    public final void mo12297d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f12703a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo12298e(String str, Executor executor) {
        this.f12704b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C8413o.m31574l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C3987y yVar = this.f12709g;
            boolean d = yVar.f12715j.mo23427d(yVar.f12712g, str, this.f12707e.mo21653b(yVar.f12712g), this, 4225, executor);
            this.f12705c = d;
            if (d) {
                this.f12709g.f12713h.sendMessageDelayed(this.f12709g.f12713h.obtainMessage(1, this.f12707e), this.f12709g.f12717l);
            } else {
                this.f12704b = 2;
                try {
                    C3987y yVar2 = this.f12709g;
                    yVar2.f12715j.mo23426c(yVar2.f12712g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void mo12299f(ServiceConnection serviceConnection, String str) {
        this.f12703a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo12300g(String str) {
        this.f12709g.f12713h.removeMessages(1, this.f12707e);
        C3987y yVar = this.f12709g;
        yVar.f12715j.mo23426c(yVar.f12712g, this);
        this.f12705c = false;
        this.f12704b = 2;
    }

    /* renamed from: h */
    public final boolean mo12301h(ServiceConnection serviceConnection) {
        return this.f12703a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo12302i() {
        return this.f12703a.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo12303j() {
        return this.f12705c;
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f12709g.f12711f) {
            this.f12709g.f12713h.removeMessages(1, this.f12707e);
            this.f12706d = iBinder;
            this.f12708f = componentName;
            for (ServiceConnection onServiceConnected : this.f12703a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f12704b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f12709g.f12711f) {
            this.f12709g.f12713h.removeMessages(1, this.f12707e);
            this.f12706d = null;
            this.f12708f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f12703a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f12704b = 2;
        }
    }
}
