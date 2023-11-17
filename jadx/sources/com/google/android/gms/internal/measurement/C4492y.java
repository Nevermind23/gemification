package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
public final class C4492y {

    /* renamed from: a */
    final Map f13826a = new HashMap();

    /* renamed from: b */
    final C4274l0 f13827b = new C4274l0();

    public C4492y() {
        mo13816b(new C4460w());
        mo13816b(new C4508z());
        mo13816b(new C4087a0());
        mo13816b(new C4155e0());
        mo13816b(new C4240j0());
        mo13816b(new C4257k0());
        mo13816b(new C4291m0());
    }

    /* renamed from: a */
    public final C4358q mo13815a(C4363q4 q4Var, C4358q qVar) {
        C4476x xVar;
        C4381r5.m16550c(q4Var);
        if (!(qVar instanceof C4375r)) {
            return qVar;
        }
        C4375r rVar = (C4375r) qVar;
        ArrayList d = rVar.mo13511d();
        String a = rVar.mo13510a();
        if (this.f13826a.containsKey(a)) {
            xVar = (C4476x) this.f13826a.get(a);
        } else {
            xVar = this.f13827b;
        }
        return xVar.mo12835a(a, q4Var, d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13816b(C4476x xVar) {
        for (C4308n0 b : xVar.f13791a) {
            this.f13826a.put(b.mo13382b().toString(), xVar);
        }
    }
}
