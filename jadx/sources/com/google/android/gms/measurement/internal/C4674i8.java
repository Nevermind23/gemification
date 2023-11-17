package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p248s7.C8243a;
import p248s7.C8245b;
import p335z5.C9208a;

/* renamed from: com.google.android.gms.measurement.internal.i8 */
public final class C4674i8 extends C4583a9 {

    /* renamed from: d */
    private final Map f14520d = new HashMap();

    /* renamed from: e */
    public final C4578a4 f14521e;

    /* renamed from: f */
    public final C4578a4 f14522f;

    /* renamed from: g */
    public final C4578a4 f14523g;

    /* renamed from: h */
    public final C4578a4 f14524h;

    /* renamed from: i */
    public final C4578a4 f14525i;

    C4674i8(C4719m9 m9Var) {
        super(m9Var);
        C4614d4 F = this.f14613a.mo14849F();
        F.getClass();
        this.f14521e = new C4578a4(F, "last_delete_stale", 0);
        C4614d4 F2 = this.f14613a.mo14849F();
        F2.getClass();
        this.f14522f = new C4578a4(F2, "backoff", 0);
        C4614d4 F3 = this.f14613a.mo14849F();
        F3.getClass();
        this.f14523g = new C4578a4(F3, "last_upload", 0);
        C4614d4 F4 = this.f14613a.mo14849F();
        F4.getClass();
        this.f14524h = new C4578a4(F4, "last_upload_attempt", 0);
        C4614d4 F5 = this.f14613a.mo14849F();
        F5.getClass();
        this.f14525i = new C4578a4(F5, "midnight_offset", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14304l() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Pair mo14466m(String str) {
        C4652g8 g8Var;
        C9208a.C9209a aVar;
        mo14554h();
        long c = this.f14613a.mo14548a().mo23596c();
        C4652g8 g8Var2 = (C4652g8) this.f14520d.get(str);
        if (g8Var2 != null && c < g8Var2.f14460c) {
            return new Pair(g8Var2.f14458a, Boolean.valueOf(g8Var2.f14459b));
        }
        C9208a.m34027b(true);
        long r = this.f14613a.mo14876z().mo14412r(str, C4636f3.f14364c) + c;
        try {
            long r2 = this.f14613a.mo14876z().mo14412r(str, C4636f3.f14366d);
            if (r2 > 0) {
                try {
                    aVar = C9208a.m34026a(this.f14613a.mo14550c());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (g8Var2 != null) {
                        if (c < g8Var2.f14460c + r2) {
                            return new Pair(g8Var2.f14458a, Boolean.valueOf(g8Var2.f14459b));
                        }
                    }
                    aVar = null;
                }
            } else {
                aVar = C9208a.m34026a(this.f14613a.mo14550c());
            }
            if (aVar == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String a = aVar.mo24847a();
            if (a != null) {
                g8Var = new C4652g8(a, aVar.mo24848b(), r);
            } else {
                g8Var = new C4652g8("", aVar.mo24848b(), r);
            }
            this.f14520d.put(str, g8Var);
            C9208a.m34027b(false);
            return new Pair(g8Var.f14458a, Boolean.valueOf(g8Var.f14459b));
        } catch (Exception e) {
            this.f14613a.mo14551d().mo14674q().mo14616b("Unable to get advertising id", e);
            g8Var = new C4652g8("", false, r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Pair mo14467n(String str, C8245b bVar) {
        if (bVar.mo23435i(C8243a.AD_STORAGE)) {
            return mo14466m(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final String mo14468o(String str, boolean z) {
        String str2;
        mo14554h();
        if (z) {
            str2 = (String) mo14466m(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest t = C4785s9.m18231t();
        if (t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, t.digest(str2.getBytes()))});
    }
}
