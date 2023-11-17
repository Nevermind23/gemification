package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
final class C4360q1 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ String f13603h;

    /* renamed from: i */
    final /* synthetic */ String f13604i;

    /* renamed from: j */
    final /* synthetic */ Bundle f13605j;

    /* renamed from: k */
    final /* synthetic */ C4429u2 f13606k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4360q1(C4429u2 u2Var, String str, String str2, Bundle bundle) {
        super(u2Var, true);
        this.f13606k = u2Var;
        this.f13603h = str;
        this.f13604i = str2;
        this.f13605j = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        ((C4173f1) C7264i.m27902k(this.f13606k.f13726i)).clearConditionalUserProperty(this.f13603h, this.f13604i, this.f13605j);
    }
}
