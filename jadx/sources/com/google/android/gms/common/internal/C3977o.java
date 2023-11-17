package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.o */
public abstract class C3977o {

    /* renamed from: a */
    private Object f12693a;

    /* renamed from: b */
    private boolean f12694b = false;

    /* renamed from: c */
    final /* synthetic */ C3958b f12695c;

    public C3977o(C3958b bVar, Object obj) {
        this.f12695c = bVar;
        this.f12693a = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12270a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo12271b();

    /* renamed from: c */
    public final void mo12279c() {
        Object obj;
        synchronized (this) {
            obj = this.f12693a;
            if (this.f12694b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            mo12270a(obj);
        }
        synchronized (this) {
            this.f12694b = true;
        }
        mo12281e();
    }

    /* renamed from: d */
    public final void mo12280d() {
        synchronized (this) {
            this.f12693a = null;
        }
    }

    /* renamed from: e */
    public final void mo12281e() {
        mo12280d();
        synchronized (this.f12695c.f12668r) {
            this.f12695c.f12668r.remove(this);
        }
    }
}
