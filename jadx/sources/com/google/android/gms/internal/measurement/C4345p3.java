package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.android.gms.internal.measurement.p3 */
public final class C4345p3 {

    /* renamed from: a */
    final C4492y f13576a;

    /* renamed from: b */
    final C4363q4 f13577b;

    /* renamed from: c */
    final C4363q4 f13578c;

    /* renamed from: d */
    final C4400s7 f13579d;

    public C4345p3() {
        C4492y yVar = new C4492y();
        this.f13576a = yVar;
        C4363q4 q4Var = new C4363q4((C4363q4) null, yVar);
        this.f13578c = q4Var;
        this.f13577b = q4Var.mo13483a();
        C4400s7 s7Var = new C4400s7();
        this.f13579d = s7Var;
        q4Var.mo13489g("require", new C4408sf(s7Var));
        s7Var.mo13536a("internal.platform", C4327o2.f13559d);
        q4Var.mo13489g("runtime.counter", new C4222i(Double.valueOf(Utils.DOUBLE_EPSILON)));
    }

    /* renamed from: a */
    public final C4358q mo13441a(C4363q4 q4Var, C4347p5... p5VarArr) {
        C4358q qVar = C4358q.f13593U2;
        for (C4347p5 a : p5VarArr) {
            qVar = C4382r6.m16560a(a);
            C4381r5.m16550c(this.f13578c);
            if ((qVar instanceof C4375r) || (qVar instanceof C4341p)) {
                qVar = this.f13576a.mo13815a(q4Var, qVar);
            }
        }
        return qVar;
    }
}
