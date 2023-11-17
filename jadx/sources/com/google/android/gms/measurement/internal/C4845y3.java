package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
public final class C4845y3 {

    /* renamed from: a */
    private final String f15024a;

    /* renamed from: b */
    private final boolean f15025b;

    /* renamed from: c */
    private boolean f15026c;

    /* renamed from: d */
    private boolean f15027d;

    /* renamed from: e */
    final /* synthetic */ C4614d4 f15028e;

    public C4845y3(C4614d4 d4Var, String str, boolean z) {
        this.f15028e = d4Var;
        C7264i.m27898g(str);
        this.f15024a = str;
        this.f15025b = z;
    }

    /* renamed from: a */
    public final void mo14962a(boolean z) {
        SharedPreferences.Editor edit = this.f15028e.mo14330o().edit();
        edit.putBoolean(this.f15024a, z);
        edit.apply();
        this.f15027d = z;
    }

    /* renamed from: b */
    public final boolean mo14963b() {
        if (!this.f15026c) {
            this.f15026c = true;
            this.f15027d = this.f15028e.mo14330o().getBoolean(this.f15024a, this.f15025b);
        }
        return this.f15027d;
    }
}
