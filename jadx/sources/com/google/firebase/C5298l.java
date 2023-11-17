package com.google.firebase;

import android.os.SystemClock;

/* renamed from: com.google.firebase.l */
public abstract class C5298l {
    /* renamed from: a */
    public static C5298l m20915a(long j, long j2, long j3) {
        return new C5233a(j, j2, j3);
    }

    /* renamed from: e */
    public static C5298l m20916e() {
        return m20915a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    /* renamed from: b */
    public abstract long mo17395b();

    /* renamed from: c */
    public abstract long mo17396c();

    /* renamed from: d */
    public abstract long mo17397d();
}
