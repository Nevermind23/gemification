package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.internal.measurement.z1 */
final class C4510z1 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ C4105b1 f13848h;

    /* renamed from: i */
    final /* synthetic */ C4429u2 f13849i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4510z1(C4429u2 u2Var, C4105b1 b1Var) {
        super(u2Var, true);
        this.f13849i = u2Var;
        this.f13848h = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        ((C4173f1) C7264i.m27902k(this.f13849i.f13726i)).generateEventId(this.f13848h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12837b() {
        this.f13848h.mo12891H1((Bundle) null);
    }
}
