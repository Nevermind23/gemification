package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import p182n6.C7264i;
import p248s7.C8255i;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
public final class C4590b4 {

    /* renamed from: a */
    final String f14218a;

    /* renamed from: b */
    private final String f14219b;

    /* renamed from: c */
    private final String f14220c;

    /* renamed from: d */
    private final long f14221d;

    /* renamed from: e */
    final /* synthetic */ C4614d4 f14222e;

    /* synthetic */ C4590b4(C4614d4 d4Var, String str, long j, C8255i iVar) {
        boolean z;
        this.f14222e = d4Var;
        C7264i.m27898g("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27892a(z);
        this.f14218a = "health_monitor:start";
        this.f14219b = "health_monitor:count";
        this.f14220c = "health_monitor:value";
        this.f14221d = j;
    }

    /* renamed from: c */
    private final long m17597c() {
        return this.f14222e.mo14330o().getLong(this.f14218a, 0);
    }

    /* renamed from: d */
    private final void m17598d() {
        this.f14222e.mo14554h();
        long a = this.f14222e.f14613a.mo14548a().mo23594a();
        SharedPreferences.Editor edit = this.f14222e.mo14330o().edit();
        edit.remove(this.f14219b);
        edit.remove(this.f14220c);
        edit.putLong(this.f14218a, a);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair mo14307a() {
        long j;
        this.f14222e.mo14554h();
        this.f14222e.mo14554h();
        long c = m17597c();
        if (c == 0) {
            m17598d();
            j = 0;
        } else {
            j = Math.abs(c - this.f14222e.f14613a.mo14548a().mo23594a());
        }
        long j2 = this.f14221d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            m17598d();
            return null;
        }
        String string = this.f14222e.mo14330o().getString(this.f14220c, (String) null);
        long j3 = this.f14222e.mo14330o().getLong(this.f14219b, 0);
        m17598d();
        if (string == null || j3 <= 0) {
            return C4614d4.f14258y;
        }
        return new Pair(string, Long.valueOf(j3));
    }

    /* renamed from: b */
    public final void mo14308b(String str, long j) {
        this.f14222e.mo14554h();
        if (m17597c() == 0) {
            m17598d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f14222e.mo14330o().getLong(this.f14219b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f14222e.mo14330o().edit();
            edit.putString(this.f14220c, str);
            edit.putLong(this.f14219b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        SharedPreferences.Editor edit2 = this.f14222e.mo14330o().edit();
        if ((this.f14222e.f14613a.mo14856N().mo14832u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3) {
            edit2.putString(this.f14220c, str);
        }
        edit2.putLong(this.f14219b, j3);
        edit2.apply();
    }
}
