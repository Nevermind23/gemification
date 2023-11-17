package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
public final class C4602c4 {

    /* renamed from: a */
    private final String f14237a;

    /* renamed from: b */
    private boolean f14238b;

    /* renamed from: c */
    private String f14239c;

    /* renamed from: d */
    final /* synthetic */ C4614d4 f14240d;

    public C4602c4(C4614d4 d4Var, String str, String str2) {
        this.f14240d = d4Var;
        C7264i.m27898g(str);
        this.f14237a = str;
    }

    /* renamed from: a */
    public final String mo14319a() {
        if (!this.f14238b) {
            this.f14238b = true;
            this.f14239c = this.f14240d.mo14330o().getString(this.f14237a, (String) null);
        }
        return this.f14239c;
    }

    /* renamed from: b */
    public final void mo14320b(String str) {
        SharedPreferences.Editor edit = this.f14240d.mo14330o().edit();
        edit.putString(this.f14237a, str);
        edit.apply();
        this.f14239c = str;
    }
}
