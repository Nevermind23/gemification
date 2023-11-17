package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.p6 */
public final class C4348p6 {

    /* renamed from: a */
    final Uri f13580a;

    /* renamed from: b */
    final String f13581b;

    /* renamed from: c */
    final String f13582c;

    /* renamed from: d */
    final boolean f13583d;

    /* renamed from: e */
    final boolean f13584e;

    private C4348p6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, C4499y6 y6Var) {
        this.f13580a = uri;
        this.f13581b = "";
        this.f13582c = "";
        this.f13583d = z;
        this.f13584e = z3;
    }

    /* renamed from: a */
    public final C4348p6 mo13451a() {
        return new C4348p6((String) null, this.f13580a, this.f13581b, this.f13582c, this.f13583d, false, true, false, (C4499y6) null);
    }

    /* renamed from: b */
    public final C4348p6 mo13452b() {
        if (this.f13581b.isEmpty()) {
            return new C4348p6((String) null, this.f13580a, this.f13581b, this.f13582c, true, false, this.f13584e, false, (C4499y6) null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: c */
    public final C4416t6 mo13453c(String str, double d) {
        return new C4314n6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: d */
    public final C4416t6 mo13454d(String str, long j) {
        return new C4280l6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: e */
    public final C4416t6 mo13455e(String str, String str2) {
        return new C4331o6(this, str, str2, true);
    }

    /* renamed from: f */
    public final C4416t6 mo13456f(String str, boolean z) {
        return new C4297m6(this, str, Boolean.valueOf(z), true);
    }

    public C4348p6(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (C4499y6) null);
    }
}
