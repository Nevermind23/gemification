package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
public final class C4274l0 extends C4476x {
    /* renamed from: a */
    public final C4358q mo12835a(String str, C4363q4 q4Var, List list) {
        if (str == null || str.isEmpty() || !q4Var.mo13490h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C4358q d = q4Var.mo13486d(str);
        if (d instanceof C4239j) {
            return ((C4239j) d).mo13126a(q4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
