package p265tb;

import com.github.mikephil.charting.utils.Utils;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import p200ob.C7508b;
import p200ob.C7513g;
import p200ob.C7515i;
import p213pb.C7799b;

/* renamed from: tb.a */
public final class C8432a {

    /* renamed from: a */
    private final C7508b f23896a;

    /* renamed from: b */
    private final C7799b f23897b;

    public C8432a(C7508b bVar) {
        this.f23896a = bVar;
        this.f23897b = new C7799b(bVar);
    }

    /* renamed from: a */
    private C5766o m31641a(C5766o[] oVarArr) {
        C5766o oVar = oVarArr[0];
        C5766o oVar2 = oVarArr[1];
        C5766o oVar3 = oVarArr[2];
        C5766o oVar4 = oVarArr[3];
        int j = m31649j(oVar, oVar4);
        C5766o h = m31647h(oVar, oVar2, (m31649j(oVar2, oVar4) + 1) << 2);
        C5766o h2 = m31647h(oVar3, oVar2, (j + 1) << 2);
        int j2 = m31649j(h, oVar4);
        int j3 = m31649j(h2, oVar4);
        float f = (float) (j2 + 1);
        C5766o oVar5 = new C5766o(oVar4.mo18901c() + ((oVar3.mo18901c() - oVar2.mo18901c()) / f), oVar4.mo18902d() + ((oVar3.mo18902d() - oVar2.mo18902d()) / f));
        float f2 = (float) (j3 + 1);
        C5766o oVar6 = new C5766o(oVar4.mo18901c() + ((oVar.mo18901c() - oVar2.mo18901c()) / f2), oVar4.mo18902d() + ((oVar.mo18902d() - oVar2.mo18902d()) / f2));
        if (!m31644e(oVar5)) {
            if (m31644e(oVar6)) {
                return oVar6;
            }
            return null;
        } else if (m31644e(oVar6) && m31649j(h, oVar5) + m31649j(h2, oVar5) <= m31649j(h, oVar6) + m31649j(h2, oVar6)) {
            return oVar6;
        } else {
            return oVar5;
        }
    }

    /* renamed from: c */
    private C5766o[] m31642c(C5766o[] oVarArr) {
        C5766o oVar = oVarArr[0];
        C5766o oVar2 = oVarArr[1];
        C5766o oVar3 = oVarArr[3];
        C5766o oVar4 = oVarArr[2];
        int j = m31649j(oVar, oVar2);
        int j2 = m31649j(oVar2, oVar3);
        int j3 = m31649j(oVar3, oVar4);
        int j4 = m31649j(oVar4, oVar);
        C5766o[] oVarArr2 = {oVar4, oVar, oVar2, oVar3};
        if (j > j2) {
            oVarArr2[0] = oVar;
            oVarArr2[1] = oVar2;
            oVarArr2[2] = oVar3;
            oVarArr2[3] = oVar4;
            j = j2;
        }
        if (j > j3) {
            oVarArr2[0] = oVar2;
            oVarArr2[1] = oVar3;
            oVarArr2[2] = oVar4;
            oVarArr2[3] = oVar;
        } else {
            j3 = j;
        }
        if (j3 > j4) {
            oVarArr2[0] = oVar3;
            oVarArr2[1] = oVar4;
            oVarArr2[2] = oVar;
            oVarArr2[3] = oVar2;
        }
        return oVarArr2;
    }

    /* renamed from: d */
    private C5766o[] m31643d(C5766o[] oVarArr) {
        C5766o oVar = oVarArr[0];
        C5766o oVar2 = oVarArr[1];
        C5766o oVar3 = oVarArr[2];
        C5766o oVar4 = oVarArr[3];
        int j = (m31649j(oVar, oVar4) + 1) << 2;
        if (m31649j(m31647h(oVar2, oVar3, j), oVar) < m31649j(m31647h(oVar3, oVar2, j), oVar4)) {
            oVarArr[0] = oVar;
            oVarArr[1] = oVar2;
            oVarArr[2] = oVar3;
            oVarArr[3] = oVar4;
        } else {
            oVarArr[0] = oVar2;
            oVarArr[1] = oVar3;
            oVarArr[2] = oVar4;
            oVarArr[3] = oVar;
        }
        return oVarArr;
    }

    /* renamed from: e */
    private boolean m31644e(C5766o oVar) {
        return oVar.mo18901c() >= Utils.FLOAT_EPSILON && oVar.mo18901c() < ((float) this.f23896a.mo21982l()) && oVar.mo18902d() > Utils.FLOAT_EPSILON && oVar.mo18902d() < ((float) this.f23896a.mo21978h());
    }

    /* renamed from: f */
    private static C5766o m31645f(C5766o oVar, float f, float f2) {
        float f3;
        float f4;
        float c = oVar.mo18901c();
        float d = oVar.mo18902d();
        if (c < f) {
            f3 = c - 1.0f;
        } else {
            f3 = c + 1.0f;
        }
        if (d < f2) {
            f4 = d - 1.0f;
        } else {
            f4 = d + 1.0f;
        }
        return new C5766o(f3, f4);
    }

    /* renamed from: g */
    private static C7508b m31646g(C7508b bVar, C5766o oVar, C5766o oVar2, C5766o oVar3, C5766o oVar4, int i, int i2) {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C7515i.m28581b().mo22007c(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, oVar.mo18901c(), oVar.mo18902d(), oVar4.mo18901c(), oVar4.mo18902d(), oVar3.mo18901c(), oVar3.mo18902d(), oVar2.mo18901c(), oVar2.mo18902d());
    }

    /* renamed from: h */
    private static C5766o m31647h(C5766o oVar, C5766o oVar2, int i) {
        float f = (float) (i + 1);
        return new C5766o(oVar.mo18901c() + ((oVar2.mo18901c() - oVar.mo18901c()) / f), oVar.mo18902d() + ((oVar2.mo18902d() - oVar.mo18902d()) / f));
    }

    /* renamed from: i */
    private C5766o[] m31648i(C5766o[] oVarArr) {
        C5766o oVar = oVarArr[0];
        C5766o oVar2 = oVarArr[1];
        C5766o oVar3 = oVarArr[2];
        C5766o oVar4 = oVarArr[3];
        C5766o h = m31647h(oVar, oVar2, (m31649j(oVar3, oVar4) + 1) << 2);
        C5766o h2 = m31647h(oVar3, oVar2, (m31649j(oVar, oVar4) + 1) << 2);
        int j = m31649j(h, oVar4) + 1;
        int j2 = m31649j(h2, oVar4) + 1;
        if ((j & 1) == 1) {
            j++;
        }
        if ((j2 & 1) == 1) {
            j2++;
        }
        float c = (((oVar.mo18901c() + oVar2.mo18901c()) + oVar3.mo18901c()) + oVar4.mo18901c()) / 4.0f;
        float d = (((oVar.mo18902d() + oVar2.mo18902d()) + oVar3.mo18902d()) + oVar4.mo18902d()) / 4.0f;
        C5766o f = m31645f(oVar, c, d);
        C5766o f2 = m31645f(oVar2, c, d);
        C5766o f3 = m31645f(oVar3, c, d);
        C5766o f4 = m31645f(oVar4, c, d);
        int i = j2 << 2;
        int i2 = j << 2;
        return new C5766o[]{m31647h(m31647h(f, f2, i), f4, i2), m31647h(m31647h(f2, f, i), f3, i2), m31647h(m31647h(f3, f4, i), f2, i2), m31647h(m31647h(f4, f3, i), f, i2)};
    }

    /* renamed from: j */
    private int m31649j(C5766o oVar, C5766o oVar2) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int c = (int) oVar.mo18901c();
        int d = (int) oVar.mo18902d();
        int c2 = (int) oVar2.mo18901c();
        int d2 = (int) oVar2.mo18902d();
        int i6 = 0;
        int i7 = 1;
        if (Math.abs(d2 - d) > Math.abs(c2 - c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i8 = d;
            d = c;
            c = i8;
            int i9 = d2;
            d2 = c2;
            c2 = i9;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i12 = (-abs) / 2;
        if (d < d2) {
            i = 1;
        } else {
            i = -1;
        }
        if (c >= c2) {
            i7 = -1;
        }
        C7508b bVar = this.f23896a;
        if (z) {
            i2 = d;
        } else {
            i2 = c;
        }
        if (z) {
            i3 = c;
        } else {
            i3 = d;
        }
        boolean e = bVar.mo21974e(i2, i3);
        while (c != c2) {
            C7508b bVar2 = this.f23896a;
            if (z) {
                i4 = d;
            } else {
                i4 = c;
            }
            if (z) {
                i5 = c;
            } else {
                i5 = d;
            }
            boolean e2 = bVar2.mo21974e(i4, i5);
            if (e2 != e) {
                i6++;
                e = e2;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (d == d2) {
                    break;
                }
                d += i;
                i12 -= abs;
            }
            c += i7;
        }
        return i6;
    }

    /* renamed from: b */
    public C7513g mo23616b() {
        int i;
        int i2;
        C5766o[] d = m31643d(m31642c(this.f23897b.mo22553c()));
        C5766o a = m31641a(d);
        d[3] = a;
        if (a != null) {
            C5766o[] i3 = m31648i(d);
            C5766o oVar = i3[0];
            C5766o oVar2 = i3[1];
            C5766o oVar3 = i3[2];
            C5766o oVar4 = i3[3];
            int j = m31649j(oVar, oVar4) + 1;
            int j2 = m31649j(oVar3, oVar4) + 1;
            if ((j & 1) == 1) {
                j++;
            }
            if ((j2 & 1) == 1) {
                j2++;
            }
            if (j * 4 >= j2 * 7 || j2 * 4 >= j * 7) {
                i2 = j;
                i = j2;
            } else {
                i2 = Math.max(j, j2);
                i = i2;
            }
            return new C7513g(m31646g(this.f23896a, oVar, oVar2, oVar3, oVar4, i2, i), new C5766o[]{oVar, oVar2, oVar3, oVar4});
        }
        throw NotFoundException.m23155a();
    }
}
