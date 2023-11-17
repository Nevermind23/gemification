package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.vd */
public final class C4457vd implements C4440ud {

    /* renamed from: a */
    public static final C4416t6 f13770a;

    /* renamed from: b */
    public static final C4416t6 f13771b;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13452b().mo13451a();
        f13770a = a.mo13456f("measurement.collection.client.log_target_api_version", true);
        f13771b = a.mo13456f("measurement.collection.service.log_target_api_version", true);
    }

    /* renamed from: a */
    public final boolean mo13757a() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo13758q() {
        return ((Boolean) f13770a.mo13631b()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo13759s() {
        return ((Boolean) f13771b.mo13631b()).booleanValue();
    }
}
