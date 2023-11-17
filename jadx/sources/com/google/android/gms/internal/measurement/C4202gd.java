package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.gd */
public final class C4202gd implements C4185fd {

    /* renamed from: a */
    public static final C4416t6 f13259a;

    /* renamed from: b */
    public static final C4416t6 f13260b;

    /* renamed from: c */
    public static final C4416t6 f13261c;

    /* renamed from: d */
    public static final C4416t6 f13262d;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13452b().mo13451a();
        f13259a = a.mo13456f("measurement.client.global_params", true);
        f13260b = a.mo13456f("measurement.service.global_params_in_payload", true);
        f13261c = a.mo13456f("measurement.service.clear_global_params_on_uninstall", true);
        f13262d = a.mo13456f("measurement.service.global_params", true);
    }

    /* renamed from: a */
    public final boolean mo13128a() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo13129q() {
        return ((Boolean) f13261c.mo13631b()).booleanValue();
    }
}
