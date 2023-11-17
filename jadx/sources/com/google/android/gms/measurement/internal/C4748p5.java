package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p182n6.C7264i;
import p248s7.C8260n;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
final class C4748p5 {

    /* renamed from: A */
    private long f14729A;

    /* renamed from: B */
    private long f14730B;

    /* renamed from: C */
    private long f14731C;

    /* renamed from: D */
    private String f14732D;

    /* renamed from: E */
    private boolean f14733E;

    /* renamed from: F */
    private long f14734F;

    /* renamed from: G */
    private long f14735G;

    /* renamed from: a */
    private final C4791t4 f14736a;

    /* renamed from: b */
    private final String f14737b;

    /* renamed from: c */
    private String f14738c;

    /* renamed from: d */
    private String f14739d;

    /* renamed from: e */
    private String f14740e;

    /* renamed from: f */
    private String f14741f;

    /* renamed from: g */
    private long f14742g;

    /* renamed from: h */
    private long f14743h;

    /* renamed from: i */
    private long f14744i;

    /* renamed from: j */
    private String f14745j;

    /* renamed from: k */
    private long f14746k;

    /* renamed from: l */
    private String f14747l;

    /* renamed from: m */
    private long f14748m;

    /* renamed from: n */
    private long f14749n;

    /* renamed from: o */
    private boolean f14750o;

    /* renamed from: p */
    private boolean f14751p;

    /* renamed from: q */
    private String f14752q;

    /* renamed from: r */
    private Boolean f14753r;

    /* renamed from: s */
    private long f14754s;

    /* renamed from: t */
    private List f14755t;

    /* renamed from: u */
    private String f14756u;

    /* renamed from: v */
    private boolean f14757v;

    /* renamed from: w */
    private long f14758w;

    /* renamed from: x */
    private long f14759x;

    /* renamed from: y */
    private long f14760y;

    /* renamed from: z */
    private long f14761z;

    C4748p5(C4791t4 t4Var, String str) {
        C7264i.m27902k(t4Var);
        C7264i.m27898g(str);
        this.f14736a = t4Var;
        this.f14737b = str;
        t4Var.mo14552f().mo14554h();
    }

    /* renamed from: A */
    public final long mo14685A() {
        this.f14736a.mo14552f().mo14554h();
        return 0;
    }

    /* renamed from: B */
    public final void mo14686B(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14744i != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14744i = j;
    }

    /* renamed from: C */
    public final void mo14687C(long j) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C7264i.m27892a(z);
        this.f14736a.mo14552f().mo14554h();
        boolean z3 = this.f14733E;
        if (this.f14742g == j) {
            z2 = false;
        }
        this.f14733E = z3 | z2;
        this.f14742g = j;
    }

    /* renamed from: D */
    public final void mo14688D(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14743h != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14743h = j;
    }

    /* renamed from: E */
    public final void mo14689E(boolean z) {
        boolean z2;
        this.f14736a.mo14552f().mo14554h();
        boolean z3 = this.f14733E;
        if (this.f14750o != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f14733E = z3 | z2;
        this.f14750o = z;
    }

    /* renamed from: F */
    public final void mo14690F(Boolean bool) {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E |= !C8260n.m31091a(this.f14753r, bool);
        this.f14753r = bool;
    }

    /* renamed from: G */
    public final void mo14691G(String str) {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E |= !C8260n.m31091a(this.f14740e, str);
        this.f14740e = str;
    }

    /* renamed from: H */
    public final void mo14692H(List list) {
        ArrayList arrayList;
        this.f14736a.mo14552f().mo14554h();
        if (!C8260n.m31091a(this.f14755t, list)) {
            this.f14733E = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.f14755t = arrayList;
        }
    }

    /* renamed from: I */
    public final void mo14693I(String str) {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E |= !C8260n.m31091a(this.f14756u, str);
        this.f14756u = str;
    }

    /* renamed from: J */
    public final void mo14694J(boolean z) {
        boolean z2;
        this.f14736a.mo14552f().mo14554h();
        boolean z3 = this.f14733E;
        if (this.f14757v != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f14733E = z3 | z2;
        this.f14757v = z;
    }

    /* renamed from: K */
    public final void mo14695K(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14758w != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14758w = j;
    }

    /* renamed from: L */
    public final boolean mo14696L() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14751p;
    }

    /* renamed from: M */
    public final boolean mo14697M() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14750o;
    }

    /* renamed from: N */
    public final boolean mo14698N() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14733E;
    }

    /* renamed from: O */
    public final boolean mo14699O() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14757v;
    }

    /* renamed from: P */
    public final long mo14700P() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14746k;
    }

    /* renamed from: Q */
    public final long mo14701Q() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14734F;
    }

    /* renamed from: R */
    public final long mo14702R() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14729A;
    }

    /* renamed from: S */
    public final long mo14703S() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14730B;
    }

    /* renamed from: T */
    public final long mo14704T() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14761z;
    }

    /* renamed from: U */
    public final long mo14705U() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14760y;
    }

    /* renamed from: V */
    public final long mo14706V() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14731C;
    }

    /* renamed from: W */
    public final long mo14707W() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14759x;
    }

    /* renamed from: X */
    public final long mo14708X() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14749n;
    }

    /* renamed from: Y */
    public final long mo14709Y() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14754s;
    }

    /* renamed from: Z */
    public final long mo14710Z() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14735G;
    }

    /* renamed from: a */
    public final String mo14711a() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14732D;
    }

    /* renamed from: a0 */
    public final long mo14712a0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14748m;
    }

    /* renamed from: b */
    public final String mo14713b() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14740e;
    }

    /* renamed from: b0 */
    public final long mo14714b0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14744i;
    }

    /* renamed from: c */
    public final String mo14715c() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14756u;
    }

    /* renamed from: c0 */
    public final long mo14716c0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14742g;
    }

    /* renamed from: d */
    public final List mo14717d() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14755t;
    }

    /* renamed from: d0 */
    public final long mo14718d0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14743h;
    }

    /* renamed from: e */
    public final void mo14719e() {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E = false;
    }

    /* renamed from: e0 */
    public final long mo14720e0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14758w;
    }

    /* renamed from: f */
    public final void mo14721f() {
        this.f14736a.mo14552f().mo14554h();
        long j = this.f14742g + 1;
        if (j > 2147483647L) {
            this.f14736a.mo14551d().mo14680w().mo14616b("Bundle index overflow. appId", C4746p3.m18094z(this.f14737b));
            j = 0;
        }
        this.f14733E = true;
        this.f14742g = j;
    }

    /* renamed from: f0 */
    public final Boolean mo14722f0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14753r;
    }

    /* renamed from: g */
    public final void mo14723g(String str) {
        this.f14736a.mo14552f().mo14554h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f14733E |= true ^ C8260n.m31091a(this.f14752q, str);
        this.f14752q = str;
    }

    /* renamed from: g0 */
    public final String mo14724g0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14752q;
    }

    /* renamed from: h */
    public final void mo14725h(boolean z) {
        boolean z2;
        this.f14736a.mo14552f().mo14554h();
        boolean z3 = this.f14733E;
        if (this.f14751p != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f14733E = z3 | z2;
        this.f14751p = z;
    }

    /* renamed from: h0 */
    public final String mo14726h0() {
        this.f14736a.mo14552f().mo14554h();
        String str = this.f14732D;
        mo14750z((String) null);
        return str;
    }

    /* renamed from: i */
    public final void mo14727i(String str) {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E |= !C8260n.m31091a(this.f14738c, str);
        this.f14738c = str;
    }

    /* renamed from: i0 */
    public final String mo14728i0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14737b;
    }

    /* renamed from: j */
    public final void mo14729j(String str) {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E |= !C8260n.m31091a(this.f14747l, str);
        this.f14747l = str;
    }

    /* renamed from: j0 */
    public final String mo14730j0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14738c;
    }

    /* renamed from: k */
    public final void mo14731k(String str) {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E |= !C8260n.m31091a(this.f14745j, str);
        this.f14745j = str;
    }

    /* renamed from: k0 */
    public final String mo14732k0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14747l;
    }

    /* renamed from: l */
    public final void mo14733l(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14746k != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14746k = j;
    }

    /* renamed from: l0 */
    public final String mo14734l0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14745j;
    }

    /* renamed from: m */
    public final void mo14735m(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14734F != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14734F = j;
    }

    /* renamed from: m0 */
    public final String mo14736m0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14741f;
    }

    /* renamed from: n */
    public final void mo14737n(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14729A != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14729A = j;
    }

    /* renamed from: n0 */
    public final String mo14738n0() {
        this.f14736a.mo14552f().mo14554h();
        return this.f14739d;
    }

    /* renamed from: o */
    public final void mo14739o(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14730B != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14730B = j;
    }

    /* renamed from: p */
    public final void mo14740p(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14761z != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14761z = j;
    }

    /* renamed from: q */
    public final void mo14741q(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14760y != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14760y = j;
    }

    /* renamed from: r */
    public final void mo14742r(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14731C != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14731C = j;
    }

    /* renamed from: s */
    public final void mo14743s(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14759x != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14759x = j;
    }

    /* renamed from: t */
    public final void mo14744t(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14749n != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14749n = j;
    }

    /* renamed from: u */
    public final void mo14745u(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14754s != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14754s = j;
    }

    /* renamed from: v */
    public final void mo14746v(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14735G != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14735G = j;
    }

    /* renamed from: w */
    public final void mo14747w(String str) {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E |= !C8260n.m31091a(this.f14741f, str);
        this.f14741f = str;
    }

    /* renamed from: x */
    public final void mo14748x(String str) {
        this.f14736a.mo14552f().mo14554h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f14733E |= true ^ C8260n.m31091a(this.f14739d, str);
        this.f14739d = str;
    }

    /* renamed from: y */
    public final void mo14749y(long j) {
        boolean z;
        this.f14736a.mo14552f().mo14554h();
        boolean z2 = this.f14733E;
        if (this.f14748m != j) {
            z = true;
        } else {
            z = false;
        }
        this.f14733E = z2 | z;
        this.f14748m = j;
    }

    /* renamed from: z */
    public final void mo14750z(String str) {
        this.f14736a.mo14552f().mo14554h();
        this.f14733E |= !C8260n.m31091a(this.f14732D, str);
        this.f14732D = str;
    }
}
