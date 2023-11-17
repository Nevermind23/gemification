package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g */
public final class C4188g implements C4358q {

    /* renamed from: d */
    private final boolean f13244d;

    public C4188g(Boolean bool) {
        this.f13244d = bool == null ? false : bool.booleanValue();
    }

    /* renamed from: b */
    public final C4358q mo13077b() {
        return new C4188g(Boolean.valueOf(this.f13244d));
    }

    /* renamed from: c */
    public final String mo13078c() {
        return Boolean.toString(this.f13244d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4188g) && this.f13244d == ((C4188g) obj).f13244d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f13244d).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f13244d);
    }

    /* renamed from: u */
    public final Double mo13091u() {
        return Double.valueOf(true != this.f13244d ? Utils.DOUBLE_EPSILON : 1.0d);
    }

    /* renamed from: v */
    public final Boolean mo13092v() {
        return Boolean.valueOf(this.f13244d);
    }

    /* renamed from: w */
    public final Iterator mo13093w() {
        return null;
    }

    /* renamed from: x */
    public final C4358q mo13094x(String str, C4363q4 q4Var, List list) {
        if ("toString".equals(str)) {
            return new C4426u(Boolean.toString(this.f13244d));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f13244d), str}));
    }
}
