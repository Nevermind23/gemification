package com.google.android.gms.internal.measurement;

import p182n6.C7264i;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.internal.measurement.i2 */
final class C4225i2 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ String f13327h;

    /* renamed from: i */
    final /* synthetic */ String f13328i;

    /* renamed from: j */
    final /* synthetic */ Object f13329j;

    /* renamed from: k */
    final /* synthetic */ boolean f13330k;

    /* renamed from: l */
    final /* synthetic */ C4429u2 f13331l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4225i2(C4429u2 u2Var, String str, String str2, Object obj, boolean z) {
        super(u2Var, true);
        this.f13331l = u2Var;
        this.f13327h = str;
        this.f13328i = str2;
        this.f13329j = obj;
        this.f13330k = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        ((C4173f1) C7264i.m27902k(this.f13331l.f13726i)).setUserProperty(this.f13327h, this.f13328i, C8862d.m32984T1(this.f13329j), this.f13330k, this.f13361d);
    }
}
