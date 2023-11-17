package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d9 */
final class C4147d9 {

    /* renamed from: a */
    private final Object f13196a;

    /* renamed from: b */
    private final int f13197b;

    C4147d9(Object obj, int i) {
        this.f13196a = obj;
        this.f13197b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4147d9)) {
            return false;
        }
        C4147d9 d9Var = (C4147d9) obj;
        if (this.f13196a == d9Var.f13196a && this.f13197b == d9Var.f13197b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f13196a) * 65535) + this.f13197b;
    }
}
