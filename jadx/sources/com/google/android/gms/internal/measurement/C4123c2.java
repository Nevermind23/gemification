package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.internal.measurement.c2 */
final class C4123c2 extends C4242j2 {

    /* renamed from: h */
    final /* synthetic */ String f13178h;

    /* renamed from: i */
    final /* synthetic */ String f13179i;

    /* renamed from: j */
    final /* synthetic */ boolean f13180j;

    /* renamed from: k */
    final /* synthetic */ C4105b1 f13181k;

    /* renamed from: l */
    final /* synthetic */ C4429u2 f13182l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4123c2(C4429u2 u2Var, String str, String str2, boolean z, C4105b1 b1Var) {
        super(u2Var, true);
        this.f13182l = u2Var;
        this.f13178h = str;
        this.f13179i = str2;
        this.f13180j = z;
        this.f13181k = b1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12836a() {
        ((C4173f1) C7264i.m27902k(this.f13182l.f13726i)).getUserProperties(this.f13178h, this.f13179i, this.f13180j, this.f13181k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12837b() {
        this.f13181k.mo12891H1((Bundle) null);
    }
}
