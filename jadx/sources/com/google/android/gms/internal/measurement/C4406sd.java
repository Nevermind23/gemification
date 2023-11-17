package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.sd */
public final class C4406sd implements C4389rd {

    /* renamed from: a */
    public static final C4416t6 f13670a;

    /* renamed from: b */
    public static final C4416t6 f13671b;

    /* renamed from: c */
    public static final C4416t6 f13672c;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13451a();
        f13670a = a.mo13454d("measurement.id.lifecycle.app_in_background_parameter", 0);
        f13671b = a.mo13456f("measurement.lifecycle.app_backgrounded_tracking", true);
        f13672c = a.mo13456f("measurement.lifecycle.app_in_background_parameter", false);
    }

    /* renamed from: a */
    public final boolean mo13523a() {
        return ((Boolean) f13672c.mo13631b()).booleanValue();
    }
}
