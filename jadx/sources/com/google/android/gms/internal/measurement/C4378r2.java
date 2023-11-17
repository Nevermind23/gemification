package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p182n6.C7264i;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.internal.measurement.r2 */
final class C4378r2 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ Activity f13628h;

    /* renamed from: i */
    final /* synthetic */ C4105b1 f13629i;

    /* renamed from: j */
    final /* synthetic */ C4412t2 f13630j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4378r2(C4412t2 t2Var, Activity activity, C4105b1 b1Var) {
        super(t2Var.f13683d, true);
        this.f13630j = t2Var;
        this.f13628h = activity;
        this.f13629i = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        ((C4173f1) C7264i.m27902k(this.f13630j.f13683d.f13726i)).onActivitySaveInstanceState(C8862d.m32984T1(this.f13628h), this.f13629i, this.f13362e);
    }
}
