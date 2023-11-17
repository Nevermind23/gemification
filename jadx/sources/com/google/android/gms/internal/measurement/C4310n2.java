package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p182n6.C7264i;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.internal.measurement.n2 */
final class C4310n2 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ Activity f13546h;

    /* renamed from: i */
    final /* synthetic */ C4412t2 f13547i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4310n2(C4412t2 t2Var, Activity activity) {
        super(t2Var.f13683d, true);
        this.f13547i = t2Var;
        this.f13546h = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        ((C4173f1) C7264i.m27902k(this.f13547i.f13683d.f13726i)).onActivityResumed(C8862d.m32984T1(this.f13546h), this.f13362e);
    }
}
