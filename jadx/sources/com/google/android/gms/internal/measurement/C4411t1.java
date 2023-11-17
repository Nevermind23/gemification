package com.google.android.gms.internal.measurement;

import android.app.Activity;
import p182n6.C7264i;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.internal.measurement.t1 */
final class C4411t1 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ Activity f13679h;

    /* renamed from: i */
    final /* synthetic */ String f13680i;

    /* renamed from: j */
    final /* synthetic */ String f13681j;

    /* renamed from: k */
    final /* synthetic */ C4429u2 f13682k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4411t1(C4429u2 u2Var, Activity activity, String str, String str2) {
        super(u2Var, true);
        this.f13682k = u2Var;
        this.f13679h = activity;
        this.f13680i = str;
        this.f13681j = str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        ((C4173f1) C7264i.m27902k(this.f13682k.f13726i)).setCurrentScreen(C8862d.m32984T1(this.f13679h), this.f13680i, this.f13681j, this.f13361d);
    }
}
