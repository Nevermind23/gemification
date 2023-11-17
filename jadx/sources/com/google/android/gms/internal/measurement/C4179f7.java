package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.f7 */
final class C4179f7 implements Serializable, C4162e7 {

    /* renamed from: d */
    final C4162e7 f13232d;

    /* renamed from: e */
    volatile transient boolean f13233e;

    /* renamed from: f */
    transient Object f13234f;

    C4179f7(C4162e7 e7Var) {
        e7Var.getClass();
        this.f13232d = e7Var;
    }

    /* renamed from: a */
    public final Object mo12874a() {
        if (!this.f13233e) {
            synchronized (this) {
                if (!this.f13233e) {
                    Object a = this.f13232d.mo12874a();
                    this.f13234f = a;
                    this.f13233e = true;
                    return a;
                }
            }
        }
        return this.f13234f;
    }

    public final String toString() {
        Object obj;
        if (this.f13233e) {
            obj = "<supplier that returned " + String.valueOf(this.f13234f) + ">";
        } else {
            obj = this.f13232d;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }
}
