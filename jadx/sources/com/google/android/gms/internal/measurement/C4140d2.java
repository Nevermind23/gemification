package com.google.android.gms.internal.measurement;

import p182n6.C7264i;
import p299w6.C8862d;

/* renamed from: com.google.android.gms.internal.measurement.d2 */
final class C4140d2 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ String f13193h;

    /* renamed from: i */
    final /* synthetic */ Object f13194i;

    /* renamed from: j */
    final /* synthetic */ C4429u2 f13195j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4140d2(C4429u2 u2Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(u2Var, false);
        this.f13195j = u2Var;
        this.f13193h = str;
        this.f13194i = obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        ((C4173f1) C7264i.m27902k(this.f13195j.f13726i)).logHealthData(5, this.f13193h, C8862d.m32984T1(this.f13194i), C8862d.m32984T1((Object) null), C8862d.m32984T1((Object) null));
    }
}
