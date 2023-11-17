package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.zd */
public final class C4522zd implements C4506yd {

    /* renamed from: a */
    public static final C4416t6 f13856a;

    /* renamed from: b */
    public static final C4416t6 f13857b;

    /* renamed from: c */
    public static final C4416t6 f13858c;

    /* renamed from: d */
    public static final C4416t6 f13859d;

    /* renamed from: e */
    public static final C4416t6 f13860e;

    static {
        C4348p6 a = new C4348p6(C4212h6.m15980a("com.google.android.gms.measurement")).mo13451a();
        f13856a = a.mo13456f("measurement.test.boolean_flag", false);
        f13857b = a.mo13453c("measurement.test.double_flag", -3.0d);
        f13858c = a.mo13454d("measurement.test.int_flag", -2);
        f13859d = a.mo13454d("measurement.test.long_flag", -1);
        f13860e = a.mo13455e("measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final double mo13841a() {
        return ((Double) f13857b.mo13631b()).doubleValue();
    }

    /* renamed from: b */
    public final String mo13842b() {
        return (String) f13860e.mo13631b();
    }

    /* renamed from: q */
    public final long mo13843q() {
        return ((Long) f13858c.mo13631b()).longValue();
    }

    /* renamed from: s */
    public final long mo13844s() {
        return ((Long) f13859d.mo13631b()).longValue();
    }

    /* renamed from: t */
    public final boolean mo13845t() {
        return ((Boolean) f13856a.mo13631b()).booleanValue();
    }
}
