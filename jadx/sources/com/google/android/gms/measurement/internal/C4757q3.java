package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.q3 */
public final class C4757q3 {

    /* renamed from: a */
    public final String f14784a;

    /* renamed from: b */
    public final String f14785b;

    /* renamed from: c */
    public final long f14786c;

    /* renamed from: d */
    public final Bundle f14787d;

    public C4757q3(String str, String str2, Bundle bundle, long j) {
        this.f14784a = str;
        this.f14785b = str2;
        this.f14787d = bundle;
        this.f14786c = j;
    }

    /* renamed from: b */
    public static C4757q3 m18181b(zzaw zzaw) {
        return new C4757q3(zzaw.f15103d, zzaw.f15105f, zzaw.f15104e.mo14991x(), zzaw.f15106g);
    }

    /* renamed from: a */
    public final zzaw mo14758a() {
        return new zzaw(this.f14784a, new zzau(new Bundle(this.f14787d)), this.f14785b, this.f14786c);
    }

    public final String toString() {
        String str = this.f14785b;
        String str2 = this.f14784a;
        String obj = this.f14787d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
