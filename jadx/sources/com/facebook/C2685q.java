package com.facebook;

import android.os.Handler;

/* renamed from: com.facebook.q */
class C2685q {

    /* renamed from: a */
    private final GraphRequest f8415a;

    /* renamed from: b */
    private final Handler f8416b;

    /* renamed from: c */
    private final long f8417c = C2626d.m10148s();

    /* renamed from: d */
    private long f8418d;

    /* renamed from: e */
    private long f8419e;

    /* renamed from: f */
    private long f8420f;

    C2685q(Handler handler, GraphRequest graphRequest) {
        this.f8415a = graphRequest;
        this.f8416b = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8466a(long j) {
        long j2 = this.f8418d + j;
        this.f8418d = j2;
        if (j2 >= this.f8419e + this.f8417c || j2 >= this.f8420f) {
            mo8468c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8467b(long j) {
        this.f8420f += j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8468c() {
        if (this.f8418d > this.f8419e) {
            this.f8415a.mo8187s();
        }
    }
}
