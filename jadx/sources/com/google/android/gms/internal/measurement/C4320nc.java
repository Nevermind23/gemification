package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.nc */
public final class C4320nc implements C4303mc {

    /* renamed from: a */
    public static final C4416t6 f13551a;

    /* renamed from: b */
    public static final C4416t6 f13552b;

    /* renamed from: c */
    public static final C4416t6 f13553c;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13452b().mo13451a();
        f13551a = a.mo13456f("measurement.collection.event_safelist", true);
        f13552b = a.mo13456f("measurement.service.store_null_safelist", true);
        f13553c = a.mo13456f("measurement.service.store_safelist", true);
    }

    /* renamed from: a */
    public final boolean mo13373a() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo13374q() {
        return ((Boolean) f13552b.mo13631b()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo13375s() {
        return ((Boolean) f13553c.mo13631b()).booleanValue();
    }
}
