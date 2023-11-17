package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
public final class C4578a4 {

    /* renamed from: a */
    private final String f14186a;

    /* renamed from: b */
    private final long f14187b;

    /* renamed from: c */
    private boolean f14188c;

    /* renamed from: d */
    private long f14189d;

    /* renamed from: e */
    final /* synthetic */ C4614d4 f14190e;

    public C4578a4(C4614d4 d4Var, String str, long j) {
        this.f14190e = d4Var;
        C7264i.m27898g(str);
        this.f14186a = str;
        this.f14187b = j;
    }

    /* renamed from: a */
    public final long mo14295a() {
        if (!this.f14188c) {
            this.f14188c = true;
            this.f14189d = this.f14190e.mo14330o().getLong(this.f14186a, this.f14187b);
        }
        return this.f14189d;
    }

    /* renamed from: b */
    public final void mo14296b(long j) {
        SharedPreferences.Editor edit = this.f14190e.mo14330o().edit();
        edit.putLong(this.f14186a, j);
        edit.apply();
        this.f14189d = j;
    }
}
