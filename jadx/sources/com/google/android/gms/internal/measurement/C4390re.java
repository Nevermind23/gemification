package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.re */
public final class C4390re implements C4373qe {

    /* renamed from: a */
    public static final C4416t6 f13644a;

    /* renamed from: b */
    public static final C4416t6 f13645b;

    /* renamed from: c */
    public static final C4416t6 f13646c;

    /* renamed from: d */
    public static final C4416t6 f13647d;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13452b().mo13451a();
        f13644a = a.mo13456f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f13645b = a.mo13456f("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f13646c = a.mo13456f("measurement.session_stitching_token_enabled", false);
        f13647d = a.mo13456f("measurement.link_sst_to_sid", false);
    }

    /* renamed from: a */
    public final boolean mo13505a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo13506b() {
        return ((Boolean) f13646c.mo13631b()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo13507q() {
        return ((Boolean) f13644a.mo13631b()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo13508s() {
        return ((Boolean) f13645b.mo13631b()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo13509t() {
        return ((Boolean) f13647d.mo13631b()).booleanValue();
    }
}
