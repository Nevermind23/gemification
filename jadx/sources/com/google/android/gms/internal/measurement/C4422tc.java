package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.tc */
public final class C4422tc implements C4405sc {

    /* renamed from: a */
    public static final C4416t6 f13704a;

    /* renamed from: b */
    public static final C4416t6 f13705b;

    /* renamed from: c */
    public static final C4416t6 f13706c;

    /* renamed from: d */
    public static final C4416t6 f13707d;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13451a();
        f13704a = a.mo13456f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f13705b = a.mo13456f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f13706c = a.mo13456f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f13707d = a.mo13456f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo13537a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo13538b() {
        return ((Boolean) f13707d.mo13631b()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo13539q() {
        return ((Boolean) f13705b.mo13631b()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo13540s() {
        return ((Boolean) f13706c.mo13631b()).booleanValue();
    }
}
