package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C4791t4;
import com.google.android.gms.measurement.internal.C4793t6;
import java.util.List;
import java.util.Map;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.a */
final class C4569a extends C4572d {

    /* renamed from: a */
    private final C4791t4 f14174a;

    /* renamed from: b */
    private final C4793t6 f14175b;

    public C4569a(C4791t4 t4Var) {
        super((C4571c) null);
        C7264i.m27902k(t4Var);
        this.f14174a = t4Var;
        this.f14175b = t4Var.mo14851I();
    }

    /* renamed from: a */
    public final int mo14280a(String str) {
        this.f14175b.mo14892Q(str);
        return 25;
    }

    /* renamed from: b */
    public final void mo14281b(String str, String str2, Bundle bundle) {
        this.f14175b.mo14907r(str, str2, bundle);
    }

    /* renamed from: c */
    public final String mo14282c() {
        return this.f14175b.mo14898W();
    }

    /* renamed from: d */
    public final String mo14283d() {
        return this.f14175b.mo14899X();
    }

    /* renamed from: e */
    public final String mo14284e() {
        return this.f14175b.mo14897V();
    }

    /* renamed from: f */
    public final void mo14285f(String str) {
        this.f14174a.mo14875y().mo14951l(str, this.f14174a.mo14548a().mo23596c());
    }

    /* renamed from: g */
    public final void mo14286g(String str) {
        this.f14174a.mo14875y().mo14952m(str, this.f14174a.mo14548a().mo23596c());
    }

    /* renamed from: h */
    public final List mo14287h(String str, String str2) {
        return this.f14175b.mo14901Z(str, str2);
    }

    /* renamed from: i */
    public final Map mo14288i(String str, String str2, boolean z) {
        return this.f14175b.mo14902a0(str, str2, z);
    }

    /* renamed from: j */
    public final void mo14289j(Bundle bundle) {
        this.f14175b.mo14881D(bundle);
    }

    /* renamed from: k */
    public final void mo14290k(String str, String str2, Bundle bundle) {
        this.f14174a.mo14851I().mo14904o(str, str2, bundle);
    }

    /* renamed from: q */
    public final long mo14291q() {
        return this.f14174a.mo14856N().mo14831t0();
    }

    /* renamed from: u */
    public final String mo14292u() {
        return this.f14175b.mo14897V();
    }
}
