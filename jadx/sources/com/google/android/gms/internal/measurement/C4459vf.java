package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.vf */
public final class C4459vf {

    /* renamed from: a */
    final TreeMap f13774a = new TreeMap();

    /* renamed from: b */
    final TreeMap f13775b = new TreeMap();

    /* renamed from: c */
    private static final int m17079c(C4363q4 q4Var, C4341p pVar, C4358q qVar) {
        C4358q a = pVar.mo13126a(q4Var, Collections.singletonList(qVar));
        if (a instanceof C4222i) {
            return C4381r5.m16549b(a.mo13091u().doubleValue());
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo13783a(String str, int i, C4341p pVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f13775b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f13774a;
        } else {
            throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pVar);
    }

    /* renamed from: b */
    public final void mo13784b(C4363q4 q4Var, C4120c cVar) {
        C4334o9 o9Var = new C4334o9(cVar);
        for (Integer num : this.f13774a.keySet()) {
            C4103b b = cVar.mo12959b().clone();
            int c = m17079c(q4Var, (C4341p) this.f13774a.get(num), o9Var);
            if (c == 2 || c == -1) {
                cVar.mo12964f(b);
            }
        }
        for (Integer num2 : this.f13775b.keySet()) {
            m17079c(q4Var, (C4341p) this.f13775b.get(num2), o9Var);
        }
    }
}
