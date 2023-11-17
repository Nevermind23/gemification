package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.session.C0125b;

/* renamed from: com.google.android.gms.internal.measurement.va */
final class C4454va implements C4132cb {

    /* renamed from: a */
    private final C4386ra f13766a;

    /* renamed from: b */
    private final C4217hb f13767b;

    /* renamed from: c */
    private final boolean f13768c;

    /* renamed from: d */
    private final C4181f9 f13769d;

    private C4454va(C4217hb hbVar, C4181f9 f9Var, C4386ra raVar) {
        this.f13767b = hbVar;
        this.f13768c = f9Var.mo13125c(raVar);
        this.f13769d = f9Var;
        this.f13766a = raVar;
    }

    /* renamed from: i */
    static C4454va m17059i(C4217hb hbVar, C4181f9 f9Var, C4386ra raVar) {
        return new C4454va(hbVar, f9Var, raVar);
    }

    /* renamed from: a */
    public final void mo12988a(Object obj) {
        this.f13767b.mo13217g(obj);
        this.f13769d.mo13124b(obj);
    }

    /* renamed from: b */
    public final void mo12989b(Object obj, C4504yb ybVar) {
        this.f13769d.mo13123a(obj);
        throw null;
    }

    /* renamed from: c */
    public final int mo12990c(Object obj) {
        int hashCode = this.f13767b.mo13214d(obj).hashCode();
        if (!this.f13768c) {
            return hashCode;
        }
        this.f13769d.mo13123a(obj);
        throw null;
    }

    /* renamed from: d */
    public final void mo12991d(Object obj, byte[] bArr, int i, int i2, C4197g8 g8Var) {
        C4351p9 p9Var = (C4351p9) obj;
        if (p9Var.zzc == C4234ib.m16102c()) {
            p9Var.zzc = C4234ib.m16104f();
        }
        C0125b.m366a(obj);
        throw null;
    }

    /* renamed from: e */
    public final int mo12992e(Object obj) {
        C4217hb hbVar = this.f13767b;
        int b = hbVar.mo13212b(hbVar.mo13214d(obj));
        if (!this.f13768c) {
            return b;
        }
        this.f13769d.mo13123a(obj);
        throw null;
    }

    /* renamed from: f */
    public final void mo12993f(Object obj, Object obj2) {
        C4166eb.m15745c(this.f13767b, obj, obj2);
        if (this.f13768c) {
            this.f13769d.mo13123a(obj2);
            throw null;
        }
    }

    /* renamed from: g */
    public final boolean mo12994g(Object obj, Object obj2) {
        if (!this.f13767b.mo13214d(obj).equals(this.f13767b.mo13214d(obj2))) {
            return false;
        }
        if (!this.f13768c) {
            return true;
        }
        this.f13769d.mo13123a(obj);
        this.f13769d.mo13123a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final boolean mo12995h(Object obj) {
        this.f13769d.mo13123a(obj);
        throw null;
    }

    /* renamed from: t */
    public final Object mo12996t() {
        C4386ra raVar = this.f13766a;
        if (raVar instanceof C4351p9) {
            return ((C4351p9) raVar).mo13473l();
        }
        return raVar.mo13466b().mo13356R();
    }
}
