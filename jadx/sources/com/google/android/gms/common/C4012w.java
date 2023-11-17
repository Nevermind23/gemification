package com.google.android.gms.common;

import android.util.Log;
import p130j6.C6737m;

/* renamed from: com.google.android.gms.common.w */
class C4012w {

    /* renamed from: e */
    private static final C4012w f12806e = new C4012w(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f12807a;

    /* renamed from: b */
    final String f12808b;

    /* renamed from: c */
    final Throwable f12809c;

    /* renamed from: d */
    final int f12810d;

    private C4012w(boolean z, int i, int i2, String str, Throwable th) {
        this.f12807a = z;
        this.f12810d = i;
        this.f12808b = str;
        this.f12809c = th;
    }

    /* renamed from: b */
    static C4012w m15244b() {
        return f12806e;
    }

    /* renamed from: c */
    static C4012w m15245c(String str) {
        return new C4012w(false, 1, 5, str, (Throwable) null);
    }

    /* renamed from: d */
    static C4012w m15246d(String str, Throwable th) {
        return new C4012w(false, 1, 5, str, th);
    }

    /* renamed from: f */
    static C4012w m15247f(int i) {
        return new C4012w(true, i, 1, (String) null, (Throwable) null);
    }

    /* renamed from: g */
    static C4012w m15248g(int i, int i2, String str, Throwable th) {
        return new C4012w(false, i, i2, str, th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo12387a() {
        return this.f12808b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12388e() {
        if (!this.f12807a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f12809c != null) {
                Log.d("GoogleCertificatesRslt", mo12387a(), this.f12809c);
            } else {
                Log.d("GoogleCertificatesRslt", mo12387a());
            }
        }
    }

    /* synthetic */ C4012w(boolean z, int i, int i2, String str, Throwable th, C6737m mVar) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }
}
