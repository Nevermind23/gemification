package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.pd */
public final class C4355pd implements C4338od {

    /* renamed from: a */
    public static final C4416t6 f13586a;

    /* renamed from: b */
    public static final C4416t6 f13587b;

    /* renamed from: c */
    public static final C4416t6 f13588c;

    /* renamed from: d */
    public static final C4416t6 f13589d;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13451a();
        f13586a = a.mo13456f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f13587b = a.mo13456f("measurement.sdk.collection.last_deep_link_referrer2", true);
        f13588c = a.mo13456f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f13589d = a.mo13454d("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    /* renamed from: a */
    public final boolean mo13438a() {
        return ((Boolean) f13588c.mo13631b()).booleanValue();
    }
}
