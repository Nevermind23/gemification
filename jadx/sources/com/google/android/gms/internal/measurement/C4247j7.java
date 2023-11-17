package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.j7 */
public abstract class C4247j7 {
    /* renamed from: a */
    public static C4162e7 m16166a(C4162e7 e7Var) {
        if ((e7Var instanceof C4213h7) || (e7Var instanceof C4179f7)) {
            return e7Var;
        }
        if (e7Var instanceof Serializable) {
            return new C4179f7(e7Var);
        }
        return new C4213h7(e7Var);
    }

    /* renamed from: b */
    public static C4162e7 m16167b(Object obj) {
        return new C4230i7(obj);
    }
}
