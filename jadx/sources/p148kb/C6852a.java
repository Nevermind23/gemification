package p148kb;

import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import p122ib.C6628a;
import p200ob.C7508b;
import p200ob.C7515i;
import p213pb.C7798a;
import p213pb.C7799b;
import p226qb.C8001a;
import p226qb.C8003c;

/* renamed from: kb.a */
public final class C6852a {

    /* renamed from: g */
    private static final int[] f20518g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    private final C7508b f20519a;

    /* renamed from: b */
    private boolean f20520b;

    /* renamed from: c */
    private int f20521c;

    /* renamed from: d */
    private int f20522d;

    /* renamed from: e */
    private int f20523e;

    /* renamed from: f */
    private int f20524f;

    /* renamed from: kb.a$a */
    static final class C6853a {

        /* renamed from: a */
        private final int f20525a;

        /* renamed from: b */
        private final int f20526b;

        C6853a(int i, int i2) {
            this.f20525a = i;
            this.f20526b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo20923a() {
            return this.f20525a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo20924b() {
            return this.f20526b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5766o mo20925c() {
            return new C5766o((float) this.f20525a, (float) this.f20526b);
        }

        public String toString() {
            return "<" + this.f20525a + ' ' + this.f20526b + '>';
        }
    }

    public C6852a(C7508b bVar) {
        this.f20519a = bVar;
    }

    /* renamed from: b */
    private static float m26617b(C5766o oVar, C5766o oVar2) {
        return C7798a.m29507a(oVar.mo18901c(), oVar.mo18902d(), oVar2.mo18901c(), oVar2.mo18902d());
    }

    /* renamed from: c */
    private static float m26618c(C6853a aVar, C6853a aVar2) {
        return C7798a.m29508b(aVar.mo20923a(), aVar.mo20924b(), aVar2.mo20923a(), aVar2.mo20924b());
    }

    /* renamed from: d */
    private static C5766o[] m26619d(C5766o[] oVarArr, int i, int i2) {
        float f = ((float) i2) / (((float) i) * 2.0f);
        float c = oVarArr[0].mo18901c() - oVarArr[2].mo18901c();
        float d = oVarArr[0].mo18902d() - oVarArr[2].mo18902d();
        float c2 = (oVarArr[0].mo18901c() + oVarArr[2].mo18901c()) / 2.0f;
        float d2 = (oVarArr[0].mo18902d() + oVarArr[2].mo18902d()) / 2.0f;
        float f2 = c * f;
        float f3 = d * f;
        C5766o oVar = new C5766o(c2 + f2, d2 + f3);
        C5766o oVar2 = new C5766o(c2 - f2, d2 - f3);
        float c3 = oVarArr[1].mo18901c() - oVarArr[3].mo18901c();
        float d3 = oVarArr[1].mo18902d() - oVarArr[3].mo18902d();
        float c4 = (oVarArr[1].mo18901c() + oVarArr[3].mo18901c()) / 2.0f;
        float d4 = (oVarArr[1].mo18902d() + oVarArr[3].mo18902d()) / 2.0f;
        float f4 = c3 * f;
        float f5 = f * d3;
        return new C5766o[]{oVar, new C5766o(c4 + f4, d4 + f5), oVar2, new C5766o(c4 - f4, d4 - f5)};
    }

    /* renamed from: e */
    private void m26620e(C5766o[] oVarArr) {
        long j;
        long j2;
        if (!m26630o(oVarArr[0]) || !m26630o(oVarArr[1]) || !m26630o(oVarArr[2]) || !m26630o(oVarArr[3])) {
            throw NotFoundException.m23155a();
        }
        int i = this.f20523e * 2;
        int[] iArr = {m26633r(oVarArr[0], oVarArr[1], i), m26633r(oVarArr[1], oVarArr[2], i), m26633r(oVarArr[2], oVarArr[3], i), m26633r(oVarArr[3], oVarArr[0], i)};
        this.f20524f = m26628m(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.f20524f + i2) % 4];
            if (this.f20520b) {
                j2 = j3 << 7;
                j = (long) ((i3 >> 1) & C11051p3.f31760d);
            } else {
                j2 = j3 << 10;
                j = (long) (((i3 >> 2) & 992) + ((i3 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int h = m26623h(j3, this.f20520b);
        if (this.f20520b) {
            this.f20521c = (h >> 6) + 1;
            this.f20522d = (h & 63) + 1;
            return;
        }
        this.f20521c = (h >> 11) + 1;
        this.f20522d = (h & 2047) + 1;
    }

    /* renamed from: f */
    private C5766o[] m26621f(C6853a aVar) {
        boolean z;
        this.f20523e = 1;
        C6853a aVar2 = aVar;
        C6853a aVar3 = aVar2;
        C6853a aVar4 = aVar3;
        boolean z2 = true;
        while (this.f20523e < 9) {
            C6853a j = m26625j(aVar, z2, 1, -1);
            C6853a j2 = m26625j(aVar2, z2, 1, 1);
            C6853a j3 = m26625j(aVar3, z2, -1, 1);
            C6853a j4 = m26625j(aVar4, z2, -1, -1);
            if (this.f20523e > 2) {
                double c = (double) ((m26618c(j4, j) * ((float) this.f20523e)) / (m26618c(aVar4, aVar) * ((float) (this.f20523e + 2))));
                if (c < 0.75d || c > 1.25d || !m26631p(j, j2, j3, j4)) {
                    break;
                }
            }
            z2 = !z2;
            this.f20523e++;
            aVar4 = j4;
            aVar = j;
            aVar2 = j2;
            aVar3 = j3;
        }
        int i = this.f20523e;
        if (i == 5 || i == 7) {
            if (i == 5) {
                z = true;
            } else {
                z = false;
            }
            this.f20520b = z;
            C5766o[] oVarArr = {new C5766o(((float) aVar.mo20923a()) + 0.5f, ((float) aVar.mo20924b()) - 0.5f), new C5766o(((float) aVar2.mo20923a()) + 0.5f, ((float) aVar2.mo20924b()) + 0.5f), new C5766o(((float) aVar3.mo20923a()) - 0.5f, ((float) aVar3.mo20924b()) + 0.5f), new C5766o(((float) aVar4.mo20923a()) - 0.5f, ((float) aVar4.mo20924b()) - 0.5f)};
            int i2 = this.f20523e;
            return m26619d(oVarArr, (i2 * 2) - 3, i2 * 2);
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: g */
    private int m26622g(C6853a aVar, C6853a aVar2) {
        float c = m26618c(aVar, aVar2);
        float a = ((float) (aVar2.mo20923a() - aVar.mo20923a())) / c;
        float b = ((float) (aVar2.mo20924b() - aVar.mo20924b())) / c;
        float a2 = (float) aVar.mo20923a();
        float b2 = (float) aVar.mo20924b();
        boolean e = this.f20519a.mo21974e(aVar.mo20923a(), aVar.mo20924b());
        int ceil = (int) Math.ceil((double) c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f20519a.mo21974e(C7798a.m29509c(a2), C7798a.m29509c(b2)) != e) {
                i++;
            }
        }
        float f = ((float) i) / c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        if (z == e) {
            return 1;
        }
        return -1;
    }

    /* renamed from: h */
    private static int m26623h(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C8003c(C8001a.f23054k).mo23155a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.m23155a();
        }
    }

    /* renamed from: i */
    private int m26624i() {
        if (this.f20520b) {
            return (this.f20521c * 4) + 11;
        }
        int i = this.f20521c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: j */
    private C6853a m26625j(C6853a aVar, boolean z, int i, int i2) {
        int a = aVar.mo20923a() + i;
        int b = aVar.mo20924b();
        while (true) {
            b += i2;
            if (!m26629n(a, b) || this.f20519a.mo21974e(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m26629n(i32, i42) && this.f20519a.mo21974e(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m26629n(i5, i42) && this.f20519a.mo21974e(i5, i42) == z) {
            i42 += i2;
        }
        return new C6853a(i5, i42 - i2);
    }

    /* renamed from: k */
    private C6853a m26626k() {
        C5766o oVar;
        C5766o oVar2;
        C5766o oVar3;
        C5766o oVar4;
        C5766o oVar5;
        C5766o oVar6;
        C5766o oVar7;
        C5766o oVar8;
        try {
            C5766o[] c = new C7799b(this.f20519a).mo22553c();
            oVar3 = c[0];
            oVar2 = c[1];
            oVar = c[2];
            oVar4 = c[3];
        } catch (NotFoundException unused) {
            int l = this.f20519a.mo21982l() / 2;
            int h = this.f20519a.mo21978h() / 2;
            int i = l + 7;
            int i2 = h - 7;
            C5766o c2 = m26625j(new C6853a(i, i2), false, 1, -1).mo20925c();
            int i3 = h + 7;
            C5766o c3 = m26625j(new C6853a(i, i3), false, 1, 1).mo20925c();
            int i4 = l - 7;
            C5766o c4 = m26625j(new C6853a(i4, i3), false, -1, 1).mo20925c();
            oVar4 = m26625j(new C6853a(i4, i2), false, -1, -1).mo20925c();
            C5766o oVar9 = c3;
            oVar = c4;
            oVar3 = c2;
            oVar2 = oVar9;
        }
        int c5 = C7798a.m29509c((((oVar3.mo18901c() + oVar4.mo18901c()) + oVar2.mo18901c()) + oVar.mo18901c()) / 4.0f);
        int c6 = C7798a.m29509c((((oVar3.mo18902d() + oVar4.mo18902d()) + oVar2.mo18902d()) + oVar.mo18902d()) / 4.0f);
        try {
            C5766o[] c7 = new C7799b(this.f20519a, 15, c5, c6).mo22553c();
            oVar6 = c7[0];
            oVar5 = c7[1];
            oVar7 = c7[2];
            oVar8 = c7[3];
        } catch (NotFoundException unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            oVar6 = m26625j(new C6853a(i5, i6), false, 1, -1).mo20925c();
            int i7 = c6 + 7;
            oVar5 = m26625j(new C6853a(i5, i7), false, 1, 1).mo20925c();
            int i8 = c5 - 7;
            oVar7 = m26625j(new C6853a(i8, i7), false, -1, 1).mo20925c();
            oVar8 = m26625j(new C6853a(i8, i6), false, -1, -1).mo20925c();
        }
        return new C6853a(C7798a.m29509c((((oVar6.mo18901c() + oVar8.mo18901c()) + oVar5.mo18901c()) + oVar7.mo18901c()) / 4.0f), C7798a.m29509c((((oVar6.mo18902d() + oVar8.mo18902d()) + oVar5.mo18902d()) + oVar7.mo18902d()) / 4.0f));
    }

    /* renamed from: l */
    private C5766o[] m26627l(C5766o[] oVarArr) {
        return m26619d(oVarArr, this.f20523e * 2, m26624i());
    }

    /* renamed from: m */
    private static int m26628m(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f20518g[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: n */
    private boolean m26629n(int i, int i2) {
        return i >= 0 && i < this.f20519a.mo21982l() && i2 > 0 && i2 < this.f20519a.mo21978h();
    }

    /* renamed from: o */
    private boolean m26630o(C5766o oVar) {
        return m26629n(C7798a.m29509c(oVar.mo18901c()), C7798a.m29509c(oVar.mo18902d()));
    }

    /* renamed from: p */
    private boolean m26631p(C6853a aVar, C6853a aVar2, C6853a aVar3, C6853a aVar4) {
        C6853a aVar5 = new C6853a(aVar.mo20923a() - 3, aVar.mo20924b() + 3);
        C6853a aVar6 = new C6853a(aVar2.mo20923a() - 3, aVar2.mo20924b() - 3);
        C6853a aVar7 = new C6853a(aVar3.mo20923a() + 3, aVar3.mo20924b() - 3);
        C6853a aVar8 = new C6853a(aVar4.mo20923a() + 3, aVar4.mo20924b() + 3);
        int g = m26622g(aVar8, aVar5);
        if (g != 0 && m26622g(aVar5, aVar6) == g && m26622g(aVar6, aVar7) == g && m26622g(aVar7, aVar8) == g) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private C7508b m26632q(C7508b bVar, C5766o oVar, C5766o oVar2, C5766o oVar3, C5766o oVar4) {
        C7515i b = C7515i.m28581b();
        int i = m26624i();
        int i2 = i;
        int i3 = i;
        float f = ((float) i) / 2.0f;
        int i4 = this.f20523e;
        float f2 = f - ((float) i4);
        float f3 = f + ((float) i4);
        return b.mo22007c(bVar, i3, i2, f2, f2, f3, f2, f3, f3, f2, f3, oVar.mo18901c(), oVar.mo18902d(), oVar2.mo18901c(), oVar2.mo18902d(), oVar3.mo18901c(), oVar3.mo18902d(), oVar4.mo18901c(), oVar4.mo18902d());
    }

    /* renamed from: r */
    private int m26633r(C5766o oVar, C5766o oVar2, int i) {
        float b = m26617b(oVar, oVar2);
        float f = b / ((float) i);
        float c = oVar.mo18901c();
        float d = oVar.mo18902d();
        float c2 = ((oVar2.mo18901c() - oVar.mo18901c()) * f) / b;
        float d2 = (f * (oVar2.mo18902d() - oVar.mo18902d())) / b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f20519a.mo21974e(C7798a.m29509c((f2 * c2) + c), C7798a.m29509c((f2 * d2) + d))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public C6628a mo20922a(boolean z) {
        C5766o[] f = m26621f(m26626k());
        if (z) {
            C5766o oVar = f[0];
            f[0] = f[2];
            f[2] = oVar;
        }
        m26620e(f);
        C7508b bVar = this.f20519a;
        int i = this.f20524f;
        return new C6628a(m26632q(bVar, f[i % 4], f[(i + 1) % 4], f[(i + 2) % 4], f[(i + 3) % 4]), m26627l(f), this.f20520b, this.f20522d, this.f20521c);
    }
}
