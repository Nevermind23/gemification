package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.c0 */
final class C4121c0 implements Comparator {

    /* renamed from: d */
    final /* synthetic */ C4239j f13172d;

    /* renamed from: e */
    final /* synthetic */ C4363q4 f13173e;

    C4121c0(C4239j jVar, C4363q4 q4Var) {
        this.f13172d = jVar;
        this.f13173e = q4Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4358q qVar = (C4358q) obj;
        C4358q qVar2 = (C4358q) obj2;
        C4239j jVar = this.f13172d;
        C4363q4 q4Var = this.f13173e;
        if (qVar instanceof C4443v) {
            if (!(qVar2 instanceof C4443v)) {
                return 1;
            }
            return 0;
        } else if (qVar2 instanceof C4443v) {
            return -1;
        } else {
            if (jVar == null) {
                return qVar.mo13078c().compareTo(qVar2.mo13078c());
            }
            return (int) C4381r5.m16548a(jVar.mo13126a(q4Var, Arrays.asList(new C4358q[]{qVar, qVar2})).mo13091u().doubleValue());
        }
    }
}
