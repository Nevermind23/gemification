package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b9 */
final class C4113b9 implements C4504yb {

    /* renamed from: a */
    private final C4096a9 f13158a;

    private C4113b9(C4096a9 a9Var) {
        byte[] bArr = C4470w9.f13784d;
        this.f13158a = a9Var;
        a9Var.f13142a = this;
    }

    /* renamed from: K */
    public static C4113b9 m15560K(C4096a9 a9Var) {
        C4113b9 b9Var = a9Var.f13142a;
        return b9Var != null ? b9Var : new C4113b9(a9Var);
    }

    /* renamed from: A */
    public final void mo12913A(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4096a9.m15481v(((Integer) list.get(i4)).intValue());
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12856m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12855l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: B */
    public final void mo12914B(int i, List list) {
        int i2 = 0;
        if (list instanceof C4518z9) {
            C4518z9 z9Var = (C4518z9) list;
            while (i2 < list.size()) {
                Object Q = z9Var.mo13366Q(i2);
                if (Q instanceof String) {
                    this.f13158a.mo12858o(i, (String) Q);
                } else {
                    this.f13158a.mo12850g(i, (C4418t8) Q);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12858o(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: C */
    public final void mo12915C(int i, float f) {
        this.f13158a.mo12851h(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: D */
    public final void mo12916D(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += C4096a9.m15484y((intValue >> 31) ^ (intValue + intValue));
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                C4096a9 a9Var = this.f13158a;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                a9Var.mo12861r((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C4096a9 a9Var2 = this.f13158a;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            a9Var2.mo12860q(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    /* renamed from: E */
    public final void mo12917E(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4096a9.m15485z(((Long) list.get(i4)).longValue());
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12863t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12862s(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public final void mo12918F(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12852i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12851h(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: G */
    public final void mo12919G(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12854k(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12853j(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* renamed from: H */
    public final void mo12920H(int i, long j) {
        this.f13158a.mo12862s(i, j);
    }

    /* renamed from: I */
    public final void mo12921I(int i, long j) {
        this.f13158a.mo12853j(i, j);
    }

    /* renamed from: J */
    public final void mo12922J(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += C4096a9.m15485z((longValue >> 63) ^ (longValue + longValue));
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                C4096a9 a9Var = this.f13158a;
                long longValue2 = ((Long) list.get(i2)).longValue();
                a9Var.mo12863t((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            C4096a9 a9Var2 = this.f13158a;
            long longValue3 = ((Long) list.get(i2)).longValue();
            a9Var2.mo12862s(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo12923a(int i, Object obj, C4132cb cbVar) {
        C4096a9 a9Var = this.f13158a;
        a9Var.mo12859p(i, 3);
        cbVar.mo12989b((C4386ra) obj, a9Var.f13142a);
        a9Var.mo12859p(i, 4);
    }

    /* renamed from: b */
    public final void mo12924b(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f13158a.mo12850g(i, (C4418t8) list.get(i2));
        }
    }

    /* renamed from: c */
    public final void mo12925c(int i, boolean z) {
        this.f13158a.mo12849f(i, z);
    }

    /* renamed from: d */
    public final void mo12926d(int i, int i2) {
        this.f13158a.mo12860q(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: e */
    public final void mo12927e(int i, String str) {
        this.f13158a.mo12858o(i, str);
    }

    /* renamed from: f */
    public final void mo12928f(int i, long j) {
        this.f13158a.mo12862s(i, j);
    }

    /* renamed from: g */
    public final void mo12929g(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12848e(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12849f(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo12930h(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4096a9.m15481v(((Integer) list.get(i4)).intValue());
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12856m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12855l(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo12931i(int i, int i2) {
        this.f13158a.mo12855l(i, i2);
    }

    /* renamed from: j */
    public final void mo12932j(int i, double d) {
        this.f13158a.mo12853j(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: k */
    public final void mo12933k(int i, Object obj, C4132cb cbVar) {
        C4386ra raVar = (C4386ra) obj;
        C4501y8 y8Var = (C4501y8) this.f13158a;
        y8Var.mo12861r((i << 3) | 2);
        y8Var.mo12861r(((C4146d8) raVar).mo13040e(cbVar));
        cbVar.mo12989b(raVar, y8Var.f13142a);
    }

    /* renamed from: l */
    public final void mo12934l(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12854k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12853j(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo12935m(int i, int i2) {
        this.f13158a.mo12851h(i, i2);
    }

    /* renamed from: n */
    public final void mo12936n(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4096a9.m15485z(((Long) list.get(i4)).longValue());
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12863t(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12862s(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: o */
    public final void mo12937o(int i, C4418t8 t8Var) {
        this.f13158a.mo12850g(i, t8Var);
    }

    /* renamed from: p */
    public final void mo12938p(int i) {
        this.f13158a.mo12859p(i, 3);
    }

    /* renamed from: q */
    public final void mo12939q(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12852i(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12851h(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    /* renamed from: r */
    public final void mo12940r(int i, long j) {
        this.f13158a.mo12862s(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: s */
    public final void mo12941s(int i) {
        this.f13158a.mo12859p(i, 4);
    }

    /* renamed from: t */
    public final void mo12942t(int i, int i2) {
        this.f13158a.mo12860q(i, i2);
    }

    /* renamed from: u */
    public final void mo12943u(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12854k(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12853j(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: v */
    public final void mo12944v(int i, int i2) {
        this.f13158a.mo12851h(i, i2);
    }

    /* renamed from: w */
    public final void mo12945w(int i, long j) {
        this.f13158a.mo12853j(i, j);
    }

    /* renamed from: x */
    public final void mo12946x(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C4096a9.m15484y(((Integer) list.get(i4)).intValue());
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12861r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12860q(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: y */
    public final void mo12947y(int i, List list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f13158a.mo12859p(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.f13158a.mo12861r(i3);
            while (i2 < list.size()) {
                this.f13158a.mo12852i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f13158a.mo12851h(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: z */
    public final void mo12948z(int i, int i2) {
        this.f13158a.mo12855l(i, i2);
    }
}
