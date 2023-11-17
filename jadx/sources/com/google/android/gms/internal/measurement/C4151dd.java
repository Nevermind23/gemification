package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.dd */
public final class C4151dd implements C4134cd {

    /* renamed from: a */
    public static final C4416t6 f13198a;

    /* renamed from: b */
    public static final C4416t6 f13199b;

    /* renamed from: c */
    public static final C4416t6 f13200c;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13451a();
        f13198a = a.mo13456f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f13199b = a.mo13456f("measurement.client.sessions.check_on_startup", true);
        f13200c = a.mo13456f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    /* renamed from: a */
    public final boolean mo12998a() {
        return true;
    }

    /* renamed from: q */
    public final boolean mo12999q() {
        return ((Boolean) f13198a.mo13631b()).booleanValue();
    }
}
