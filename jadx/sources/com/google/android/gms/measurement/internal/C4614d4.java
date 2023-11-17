package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import p182n6.C7264i;
import p248s7.C8245b;
import p248s7.C8255i;
import p335z5.C9208a;

/* renamed from: com.google.android.gms.measurement.internal.d4 */
final class C4614d4 extends C4726n5 {

    /* renamed from: y */
    static final Pair f14258y = new Pair("", 0L);

    /* renamed from: c */
    private SharedPreferences f14259c;

    /* renamed from: d */
    public C4590b4 f14260d;

    /* renamed from: e */
    public final C4578a4 f14261e = new C4578a4(this, "first_open_time", 0);

    /* renamed from: f */
    public final C4578a4 f14262f = new C4578a4(this, "app_install_time", 0);

    /* renamed from: g */
    public final C4602c4 f14263g = new C4602c4(this, "app_instance_id", (String) null);

    /* renamed from: h */
    private String f14264h;

    /* renamed from: i */
    private boolean f14265i;

    /* renamed from: j */
    private long f14266j;

    /* renamed from: k */
    public final C4578a4 f14267k = new C4578a4(this, "session_timeout", 1800000);

    /* renamed from: l */
    public final C4845y3 f14268l = new C4845y3(this, "start_new_session", true);

    /* renamed from: m */
    public final C4602c4 f14269m = new C4602c4(this, "non_personalized_ads", (String) null);

    /* renamed from: n */
    public final C4845y3 f14270n = new C4845y3(this, "allow_remote_dynamite", false);

    /* renamed from: o */
    public final C4578a4 f14271o = new C4578a4(this, "last_pause_time", 0);

    /* renamed from: p */
    public final C4578a4 f14272p = new C4578a4(this, "session_id", 0);

    /* renamed from: q */
    public boolean f14273q;

    /* renamed from: r */
    public final C4845y3 f14274r = new C4845y3(this, "app_backgrounded", false);

    /* renamed from: s */
    public final C4845y3 f14275s = new C4845y3(this, "deep_link_retrieval_complete", false);

    /* renamed from: t */
    public final C4578a4 f14276t = new C4578a4(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: u */
    public final C4602c4 f14277u = new C4602c4(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: v */
    public final C4602c4 f14278v = new C4602c4(this, "deferred_attribution_cache", (String) null);

    /* renamed from: w */
    public final C4578a4 f14279w = new C4578a4(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: x */
    public final C4856z3 f14280x = new C4856z3(this, "default_event_parameters", (Bundle) null);

    C4614d4(C4791t4 t4Var) {
        super(t4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo14328i() {
        SharedPreferences sharedPreferences = this.f14613a.mo14550c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f14259c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f14273q = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f14259c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f14613a.mo14876z();
        this.f14260d = new C4590b4(this, "health_monitor", Math.max(0, ((Long) C4636f3.f14368e.mo14346a((Object) null)).longValue()), (C8255i) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14329j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final SharedPreferences mo14330o() {
        mo14554h();
        mo14640k();
        C7264i.m27902k(this.f14259c);
        return this.f14259c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Pair mo14331p(String str) {
        mo14554h();
        long c = this.f14613a.mo14548a().mo23596c();
        String str2 = this.f14264h;
        if (str2 != null && c < this.f14266j) {
            return new Pair(str2, Boolean.valueOf(this.f14265i));
        }
        this.f14266j = c + this.f14613a.mo14876z().mo14412r(str, C4636f3.f14364c);
        C9208a.m34027b(true);
        try {
            C9208a.C9209a a = C9208a.m34026a(this.f14613a.mo14550c());
            this.f14264h = "";
            String a2 = a.mo24847a();
            if (a2 != null) {
                this.f14264h = a2;
            }
            this.f14265i = a.mo24848b();
        } catch (Exception e) {
            this.f14613a.mo14551d().mo14674q().mo14616b("Unable to get advertising id", e);
            this.f14264h = "";
        }
        C9208a.m34027b(false);
        return new Pair(this.f14264h, Boolean.valueOf(this.f14265i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C8245b mo14332q() {
        mo14554h();
        return C8245b.m31053b(mo14330o().getString("consent_settings", "G1"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Boolean mo14333r() {
        mo14554h();
        if (mo14330o().contains("measurement_enabled")) {
            return Boolean.valueOf(mo14330o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo14334s(Boolean bool) {
        mo14554h();
        SharedPreferences.Editor edit = mo14330o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo14335t(boolean z) {
        mo14554h();
        this.f14613a.mo14551d().mo14679v().mo14616b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = mo14330o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo14336u() {
        SharedPreferences sharedPreferences = this.f14259c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo14337v(long j) {
        if (j - this.f14267k.mo14295a() > this.f14271o.mo14295a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo14338w(int i) {
        return C8245b.m31055j(i, mo14330o().getInt("consent_source", 100));
    }
}
