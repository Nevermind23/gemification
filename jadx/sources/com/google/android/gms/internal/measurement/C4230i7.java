package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.i7 */
final class C4230i7 implements Serializable, C4162e7 {

    /* renamed from: d */
    final Object f13333d;

    C4230i7(Object obj) {
        this.f13333d = obj;
    }

    /* renamed from: a */
    public final Object mo12874a() {
        return this.f13333d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4230i7) {
            return C4515z6.m17304a(this.f13333d, ((C4230i7) obj).f13333d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13333d});
    }

    public final String toString() {
        String obj = this.f13333d.toString();
        return "Suppliers.ofInstance(" + obj + ")";
    }
}
