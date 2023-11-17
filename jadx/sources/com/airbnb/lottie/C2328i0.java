package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.i0 */
public final class C2328i0 {

    /* renamed from: a */
    private final Object f7311a;

    /* renamed from: b */
    private final Throwable f7312b;

    public C2328i0(Object obj) {
        this.f7311a = obj;
        this.f7312b = null;
    }

    /* renamed from: a */
    public Throwable mo7566a() {
        return this.f7312b;
    }

    /* renamed from: b */
    public Object mo7567b() {
        return this.f7311a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2328i0)) {
            return false;
        }
        C2328i0 i0Var = (C2328i0) obj;
        if (mo7567b() != null && mo7567b().equals(i0Var.mo7567b())) {
            return true;
        }
        if (mo7566a() == null || i0Var.mo7566a() == null) {
            return false;
        }
        return mo7566a().toString().equals(mo7566a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo7567b(), mo7566a()});
    }

    public C2328i0(Throwable th) {
        this.f7312b = th;
        this.f7311a = null;
    }
}
