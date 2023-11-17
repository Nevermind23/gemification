package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h7 */
final class C4213h7 implements C4162e7 {

    /* renamed from: f */
    private static final C4162e7 f13275f = C4196g7.f13251d;

    /* renamed from: d */
    private volatile C4162e7 f13276d;

    /* renamed from: e */
    private Object f13277e;

    C4213h7(C4162e7 e7Var) {
        e7Var.getClass();
        this.f13276d = e7Var;
    }

    /* renamed from: a */
    public final Object mo12874a() {
        C4162e7 e7Var = this.f13276d;
        C4162e7 e7Var2 = f13275f;
        if (e7Var != e7Var2) {
            synchronized (this) {
                if (this.f13276d != e7Var2) {
                    Object a = this.f13276d.mo12874a();
                    this.f13277e = a;
                    this.f13276d = e7Var2;
                    return a;
                }
            }
        }
        return this.f13277e;
    }

    public final String toString() {
        Object obj = this.f13276d;
        if (obj == f13275f) {
            obj = "<supplier that returned " + String.valueOf(this.f13277e) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }
}
