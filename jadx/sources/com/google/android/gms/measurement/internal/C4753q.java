package com.google.android.gms.measurement.internal;

import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.q */
final class C4753q {

    /* renamed from: a */
    final String f14770a;

    /* renamed from: b */
    final String f14771b;

    /* renamed from: c */
    final long f14772c;

    /* renamed from: d */
    final long f14773d;

    /* renamed from: e */
    final long f14774e;

    /* renamed from: f */
    final long f14775f;

    /* renamed from: g */
    final long f14776g;

    /* renamed from: h */
    final Long f14777h;

    /* renamed from: i */
    final Long f14778i;

    /* renamed from: j */
    final Long f14779j;

    /* renamed from: k */
    final Boolean f14780k;

    C4753q(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C7264i.m27898g(str);
        C7264i.m27898g(str2);
        boolean z4 = true;
        if (j6 >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27892a(z);
        if (j7 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C7264i.m27892a(z2);
        if (j8 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C7264i.m27892a(z3);
        C7264i.m27892a(j9 < 0 ? false : z4);
        this.f14770a = str;
        this.f14771b = str2;
        this.f14772c = j6;
        this.f14773d = j7;
        this.f14774e = j8;
        this.f14775f = j4;
        this.f14776g = j9;
        this.f14777h = l;
        this.f14778i = l2;
        this.f14779j = l3;
        this.f14780k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C4753q mo14755a(Long l, Long l2, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new C4753q(this.f14770a, this.f14771b, this.f14772c, this.f14773d, this.f14774e, this.f14775f, this.f14776g, this.f14777h, l, l2, bool);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4753q mo14756b(long j, long j2) {
        return new C4753q(this.f14770a, this.f14771b, this.f14772c, this.f14773d, this.f14774e, this.f14775f, j, Long.valueOf(j2), this.f14778i, this.f14779j, this.f14780k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C4753q mo14757c(long j) {
        return new C4753q(this.f14770a, this.f14771b, this.f14772c, this.f14773d, this.f14774e, j, this.f14776g, this.f14777h, this.f14778i, this.f14779j, this.f14780k);
    }
}
