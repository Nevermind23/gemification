package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.kc */
public final class C4269kc implements C4252jc {

    /* renamed from: a */
    public static final C4416t6 f13440a;

    /* renamed from: b */
    public static final C4416t6 f13441b;

    /* renamed from: c */
    public static final C4416t6 f13442c;

    /* renamed from: d */
    public static final C4416t6 f13443d;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13451a();
        f13440a = a.mo13456f("measurement.client.consent_state_v1", true);
        f13441b = a.mo13456f("measurement.client.3p_consent_state_v1", true);
        f13442c = a.mo13456f("measurement.service.consent_state_v1_W36", true);
        f13443d = a.mo13454d("measurement.service.storage_consent_support_version", 203600);
    }

    /* renamed from: a */
    public final long mo13290a() {
        return ((Long) f13443d.mo13631b()).longValue();
    }
}
