package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ja */
final class C4250ja extends C4239j {

    /* renamed from: f */
    final /* synthetic */ C4488xb f13425f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4250ja(C4183fb fbVar, String str, C4488xb xbVar) {
        super("getValue");
        this.f13425f = xbVar;
    }

    /* renamed from: a */
    public final C4358q mo13126a(C4363q4 q4Var, List list) {
        C4381r5.m16555h("getValue", 2, list);
        C4358q b = q4Var.mo13484b((C4358q) list.get(0));
        C4358q b2 = q4Var.mo13484b((C4358q) list.get(1));
        String a = this.f13425f.mo13814a(b.mo13078c());
        if (a != null) {
            return new C4426u(a);
        }
        return b2;
    }
}
