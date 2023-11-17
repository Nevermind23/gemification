package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.sf */
public final class C4408sf extends C4239j {

    /* renamed from: f */
    private final C4400s7 f13675f;

    /* renamed from: g */
    final Map f13676g = new HashMap();

    public C4408sf(C4400s7 s7Var) {
        super("require");
        this.f13675f = s7Var;
    }

    /* renamed from: a */
    public final C4358q mo13126a(C4363q4 q4Var, List list) {
        C4358q qVar;
        C4381r5.m16555h("require", 1, list);
        String c = q4Var.mo13484b((C4358q) list.get(0)).mo13078c();
        if (this.f13676g.containsKey(c)) {
            return (C4358q) this.f13676g.get(c);
        }
        C4400s7 s7Var = this.f13675f;
        if (s7Var.f13668a.containsKey(c)) {
            try {
                qVar = (C4358q) ((Callable) s7Var.f13668a.get(c)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(c)));
            }
        } else {
            qVar = C4358q.f13593U2;
        }
        if (qVar instanceof C4239j) {
            this.f13676g.put(c, (C4239j) qVar);
        }
        return qVar;
    }
}
