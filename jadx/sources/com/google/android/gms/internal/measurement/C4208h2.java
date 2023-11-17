package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.internal.measurement.h2 */
final class C4208h2 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ Long f13267h;

    /* renamed from: i */
    final /* synthetic */ String f13268i;

    /* renamed from: j */
    final /* synthetic */ String f13269j;

    /* renamed from: k */
    final /* synthetic */ Bundle f13270k;

    /* renamed from: l */
    final /* synthetic */ boolean f13271l;

    /* renamed from: m */
    final /* synthetic */ boolean f13272m;

    /* renamed from: n */
    final /* synthetic */ C4429u2 f13273n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4208h2(C4429u2 u2Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(u2Var, true);
        this.f13273n = u2Var;
        this.f13267h = l;
        this.f13268i = str;
        this.f13269j = str2;
        this.f13270k = bundle;
        this.f13271l = z;
        this.f13272m = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        long j;
        Long l = this.f13267h;
        if (l == null) {
            j = this.f13361d;
        } else {
            j = l.longValue();
        }
        ((C4173f1) C7264i.m27902k(this.f13273n.f13726i)).logEvent(this.f13268i, this.f13269j, this.f13270k, this.f13271l, this.f13272m, j);
    }
}
