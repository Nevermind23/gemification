package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ue */
public final class C4441ue implements C4424te {

    /* renamed from: a */
    public static final C4416t6 f13750a;

    /* renamed from: b */
    public static final C4416t6 f13751b;

    /* renamed from: c */
    public static final C4416t6 f13752c;

    /* renamed from: d */
    public static final C4416t6 f13753d;

    /* renamed from: e */
    public static final C4416t6 f13754e;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13452b().mo13451a();
        f13750a = a.mo13456f("measurement.client.sessions.background_sessions_enabled", true);
        f13751b = a.mo13456f("measurement.client.sessions.enable_fix_background_engagement", false);
        f13752c = a.mo13456f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f13753d = a.mo13456f("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f13754e = a.mo13456f("measurement.client.sessions.session_id_enabled", true);
    }

    /* renamed from: a */
    public final boolean mo13652a() {
        return ((Boolean) f13751b.mo13631b()).booleanValue();
    }
}
