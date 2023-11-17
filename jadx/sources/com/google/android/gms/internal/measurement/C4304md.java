package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.md */
public final class C4304md implements C4287ld {

    /* renamed from: a */
    public static final C4416t6 f13472a;

    /* renamed from: b */
    public static final C4416t6 f13473b;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13452b().mo13451a();
        f13472a = a.mo13456f("measurement.item_scoped_custom_parameters.client", true);
        f13473b = a.mo13456f("measurement.item_scoped_custom_parameters.service", false);
    }

    /* renamed from: a */
    public final boolean mo13337a() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo13338q() {
        return ((Boolean) f13472a.mo13631b()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo13339s() {
        return ((Boolean) f13473b.mo13631b()).booleanValue();
    }
}
