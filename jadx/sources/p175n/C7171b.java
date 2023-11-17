package p175n;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p175n.C7174d;
import p175n.C7183i;

/* renamed from: n.b */
public class C7171b implements C7174d.C7175a {

    /* renamed from: a */
    C7183i f21237a = null;

    /* renamed from: b */
    float f21238b = Utils.FLOAT_EPSILON;

    /* renamed from: c */
    boolean f21239c = false;

    /* renamed from: d */
    ArrayList f21240d = new ArrayList();

    /* renamed from: e */
    public C7172a f21241e;

    /* renamed from: f */
    boolean f21242f = false;

    /* renamed from: n.b$a */
    public interface C7172a {
        /* renamed from: a */
        void mo21428a(C7183i iVar, float f, boolean z);

        /* renamed from: b */
        float mo21429b(C7171b bVar, boolean z);

        /* renamed from: c */
        void mo21430c(C7183i iVar, float f);

        void clear();

        /* renamed from: d */
        C7183i mo21432d(int i);

        /* renamed from: e */
        void mo21433e();

        /* renamed from: f */
        int mo21434f();

        /* renamed from: g */
        float mo21435g(C7183i iVar);

        /* renamed from: h */
        float mo21436h(int i);

        /* renamed from: i */
        boolean mo21437i(C7183i iVar);

        /* renamed from: j */
        void mo21438j(float f);

        /* renamed from: k */
        float mo21439k(C7183i iVar, boolean z);
    }

    public C7171b() {
    }

    /* renamed from: u */
    private boolean m27565u(C7183i iVar, C7174d dVar) {
        return iVar.f21298p <= 1;
    }

    /* renamed from: w */
    private C7183i m27566w(boolean[] zArr, C7183i iVar) {
        C7183i.C7184a aVar;
        int f = this.f21241e.mo21434f();
        C7183i iVar2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < f; i++) {
            float h = this.f21241e.mo21436h(i);
            if (h < Utils.FLOAT_EPSILON) {
                C7183i d = this.f21241e.mo21432d(i);
                if ((zArr == null || !zArr[d.f21288f]) && d != iVar && (((aVar = d.f21295m) == C7183i.C7184a.SLACK || aVar == C7183i.C7184a.ERROR) && h < f2)) {
                    f2 = h;
                    iVar2 = d;
                }
            }
        }
        return iVar2;
    }

    /* renamed from: A */
    public void mo21441A(C7174d dVar, C7183i iVar, boolean z) {
        if (iVar != null && iVar.f21292j) {
            this.f21238b += iVar.f21291i * this.f21241e.mo21435g(iVar);
            this.f21241e.mo21439k(iVar, z);
            if (z) {
                iVar.mo21509e(this);
            }
            if (C7174d.f21249t && this.f21241e.mo21434f() == 0) {
                this.f21242f = true;
                dVar.f21255a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo21442B(C7174d dVar, C7171b bVar, boolean z) {
        this.f21238b += bVar.f21238b * this.f21241e.mo21429b(bVar, z);
        if (z) {
            bVar.f21237a.mo21509e(this);
        }
        if (C7174d.f21249t && this.f21237a != null && this.f21241e.mo21434f() == 0) {
            this.f21242f = true;
            dVar.f21255a = true;
        }
    }

    /* renamed from: C */
    public void mo21443C(C7174d dVar, C7183i iVar, boolean z) {
        if (iVar != null && iVar.f21299q) {
            float g = this.f21241e.mo21435g(iVar);
            this.f21238b += iVar.f21301s * g;
            this.f21241e.mo21439k(iVar, z);
            if (z) {
                iVar.mo21509e(this);
            }
            this.f21241e.mo21428a(dVar.f21268n.f21246d[iVar.f21300r], g, z);
            if (C7174d.f21249t && this.f21241e.mo21434f() == 0) {
                this.f21242f = true;
                dVar.f21255a = true;
            }
        }
    }

    /* renamed from: D */
    public void mo21444D(C7174d dVar) {
        if (dVar.f21261g.length != 0) {
            boolean z = false;
            while (!z) {
                int f = this.f21241e.mo21434f();
                for (int i = 0; i < f; i++) {
                    C7183i d = this.f21241e.mo21432d(i);
                    if (d.f21289g != -1 || d.f21292j || d.f21299q) {
                        this.f21240d.add(d);
                    }
                }
                int size = this.f21240d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        C7183i iVar = (C7183i) this.f21240d.get(i2);
                        if (iVar.f21292j) {
                            mo21441A(dVar, iVar, true);
                        } else if (iVar.f21299q) {
                            mo21443C(dVar, iVar, true);
                        } else {
                            mo21442B(dVar, dVar.f21261g[iVar.f21289g], true);
                        }
                    }
                    this.f21240d.clear();
                } else {
                    z = true;
                }
            }
            if (C7174d.f21249t && this.f21237a != null && this.f21241e.mo21434f() == 0) {
                this.f21242f = true;
                dVar.f21255a = true;
            }
        }
    }

    /* renamed from: a */
    public void mo21445a(C7183i iVar) {
        int i = iVar.f21290h;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f21241e.mo21430c(iVar, f);
    }

    /* renamed from: b */
    public void mo21446b(C7174d.C7175a aVar) {
        if (aVar instanceof C7171b) {
            C7171b bVar = (C7171b) aVar;
            this.f21237a = null;
            this.f21241e.clear();
            for (int i = 0; i < bVar.f21241e.mo21434f(); i++) {
                this.f21241e.mo21428a(bVar.f21241e.mo21432d(i), bVar.f21241e.mo21436h(i), true);
            }
        }
    }

    /* renamed from: c */
    public C7183i mo21447c(C7174d dVar, boolean[] zArr) {
        return m27566w(zArr, (C7183i) null);
    }

    public void clear() {
        this.f21241e.clear();
        this.f21237a = null;
        this.f21238b = Utils.FLOAT_EPSILON;
    }

    /* renamed from: d */
    public C7171b mo21449d(C7174d dVar, int i) {
        this.f21241e.mo21430c(dVar.mo21487o(i, "ep"), 1.0f);
        this.f21241e.mo21430c(dVar.mo21487o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C7171b mo21450e(C7183i iVar, int i) {
        this.f21241e.mo21430c(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo21451f(C7174d dVar) {
        boolean z;
        C7183i g = mo21452g(dVar);
        if (g == null) {
            z = true;
        } else {
            mo21470x(g);
            z = false;
        }
        if (this.f21241e.mo21434f() == 0) {
            this.f21242f = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C7183i mo21452g(C7174d dVar) {
        boolean u;
        boolean u2;
        int f = this.f21241e.mo21434f();
        C7183i iVar = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C7183i iVar2 = null;
        for (int i = 0; i < f; i++) {
            float h = this.f21241e.mo21436h(i);
            C7183i d = this.f21241e.mo21432d(i);
            if (d.f21295m == C7183i.C7184a.UNRESTRICTED) {
                if (iVar == null) {
                    u2 = m27565u(d, dVar);
                } else if (f2 > h) {
                    u2 = m27565u(d, dVar);
                } else if (!z && m27565u(d, dVar)) {
                    f2 = h;
                    iVar = d;
                    z = true;
                }
                z = u2;
                f2 = h;
                iVar = d;
            } else if (iVar == null && h < Utils.FLOAT_EPSILON) {
                if (iVar2 == null) {
                    u = m27565u(d, dVar);
                } else if (f3 > h) {
                    u = m27565u(d, dVar);
                } else if (!z2 && m27565u(d, dVar)) {
                    f3 = h;
                    iVar2 = d;
                    z2 = true;
                }
                z2 = u;
                f3 = h;
                iVar2 = d;
            }
        }
        if (iVar != null) {
            return iVar;
        }
        return iVar2;
    }

    public C7183i getKey() {
        return this.f21237a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C7171b mo21454h(C7183i iVar, C7183i iVar2, int i, float f, C7183i iVar3, C7183i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f21241e.mo21430c(iVar, 1.0f);
            this.f21241e.mo21430c(iVar4, 1.0f);
            this.f21241e.mo21430c(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f21241e.mo21430c(iVar, 1.0f);
            this.f21241e.mo21430c(iVar2, -1.0f);
            this.f21241e.mo21430c(iVar3, -1.0f);
            this.f21241e.mo21430c(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f21238b = (float) ((-i) + i2);
            }
        } else if (f <= Utils.FLOAT_EPSILON) {
            this.f21241e.mo21430c(iVar, -1.0f);
            this.f21241e.mo21430c(iVar2, 1.0f);
            this.f21238b = (float) i;
        } else if (f >= 1.0f) {
            this.f21241e.mo21430c(iVar4, -1.0f);
            this.f21241e.mo21430c(iVar3, 1.0f);
            this.f21238b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            this.f21241e.mo21430c(iVar, f2 * 1.0f);
            this.f21241e.mo21430c(iVar2, f2 * -1.0f);
            this.f21241e.mo21430c(iVar3, -1.0f * f);
            this.f21241e.mo21430c(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f21238b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7171b mo21455i(C7183i iVar, int i) {
        this.f21237a = iVar;
        float f = (float) i;
        iVar.f21291i = f;
        this.f21238b = f;
        this.f21242f = true;
        return this;
    }

    public boolean isEmpty() {
        return this.f21237a == null && this.f21238b == Utils.FLOAT_EPSILON && this.f21241e.mo21434f() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C7171b mo21457j(C7183i iVar, C7183i iVar2, float f) {
        this.f21241e.mo21430c(iVar, -1.0f);
        this.f21241e.mo21430c(iVar2, f);
        return this;
    }

    /* renamed from: k */
    public C7171b mo21458k(C7183i iVar, C7183i iVar2, C7183i iVar3, C7183i iVar4, float f) {
        this.f21241e.mo21430c(iVar, -1.0f);
        this.f21241e.mo21430c(iVar2, 1.0f);
        this.f21241e.mo21430c(iVar3, f);
        this.f21241e.mo21430c(iVar4, -f);
        return this;
    }

    /* renamed from: l */
    public C7171b mo21459l(float f, float f2, float f3, C7183i iVar, C7183i iVar2, C7183i iVar3, C7183i iVar4) {
        this.f21238b = Utils.FLOAT_EPSILON;
        if (f2 == Utils.FLOAT_EPSILON || f == f3) {
            this.f21241e.mo21430c(iVar, 1.0f);
            this.f21241e.mo21430c(iVar2, -1.0f);
            this.f21241e.mo21430c(iVar4, 1.0f);
            this.f21241e.mo21430c(iVar3, -1.0f);
        } else if (f == Utils.FLOAT_EPSILON) {
            this.f21241e.mo21430c(iVar, 1.0f);
            this.f21241e.mo21430c(iVar2, -1.0f);
        } else if (f3 == Utils.FLOAT_EPSILON) {
            this.f21241e.mo21430c(iVar3, 1.0f);
            this.f21241e.mo21430c(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f21241e.mo21430c(iVar, 1.0f);
            this.f21241e.mo21430c(iVar2, -1.0f);
            this.f21241e.mo21430c(iVar4, f4);
            this.f21241e.mo21430c(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C7171b mo21460m(C7183i iVar, int i) {
        if (i < 0) {
            this.f21238b = (float) (i * -1);
            this.f21241e.mo21430c(iVar, 1.0f);
        } else {
            this.f21238b = (float) i;
            this.f21241e.mo21430c(iVar, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C7171b mo21461n(C7183i iVar, C7183i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f21238b = (float) i;
        }
        if (!z) {
            this.f21241e.mo21430c(iVar, -1.0f);
            this.f21241e.mo21430c(iVar2, 1.0f);
        } else {
            this.f21241e.mo21430c(iVar, 1.0f);
            this.f21241e.mo21430c(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C7171b mo21462o(C7183i iVar, C7183i iVar2, C7183i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f21238b = (float) i;
        }
        if (!z) {
            this.f21241e.mo21430c(iVar, -1.0f);
            this.f21241e.mo21430c(iVar2, 1.0f);
            this.f21241e.mo21430c(iVar3, 1.0f);
        } else {
            this.f21241e.mo21430c(iVar, 1.0f);
            this.f21241e.mo21430c(iVar2, -1.0f);
            this.f21241e.mo21430c(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C7171b mo21463p(C7183i iVar, C7183i iVar2, C7183i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f21238b = (float) i;
        }
        if (!z) {
            this.f21241e.mo21430c(iVar, -1.0f);
            this.f21241e.mo21430c(iVar2, 1.0f);
            this.f21241e.mo21430c(iVar3, -1.0f);
        } else {
            this.f21241e.mo21430c(iVar, 1.0f);
            this.f21241e.mo21430c(iVar2, -1.0f);
            this.f21241e.mo21430c(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C7171b mo21464q(C7183i iVar, C7183i iVar2, C7183i iVar3, C7183i iVar4, float f) {
        this.f21241e.mo21430c(iVar3, 0.5f);
        this.f21241e.mo21430c(iVar4, 0.5f);
        this.f21241e.mo21430c(iVar, -0.5f);
        this.f21241e.mo21430c(iVar2, -0.5f);
        this.f21238b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo21465r() {
        float f = this.f21238b;
        if (f < Utils.FLOAT_EPSILON) {
            this.f21238b = f * -1.0f;
            this.f21241e.mo21433e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo21466s() {
        C7183i iVar = this.f21237a;
        return iVar != null && (iVar.f21295m == C7183i.C7184a.UNRESTRICTED || this.f21238b >= Utils.FLOAT_EPSILON);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo21467t(C7183i iVar) {
        return this.f21241e.mo21437i(iVar);
    }

    public String toString() {
        return mo21472z();
    }

    /* renamed from: v */
    public C7183i mo21469v(C7183i iVar) {
        return m27566w((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo21470x(C7183i iVar) {
        C7183i iVar2 = this.f21237a;
        if (iVar2 != null) {
            this.f21241e.mo21430c(iVar2, -1.0f);
            this.f21237a.f21289g = -1;
            this.f21237a = null;
        }
        float k = this.f21241e.mo21439k(iVar, true) * -1.0f;
        this.f21237a = iVar;
        if (k != 1.0f) {
            this.f21238b /= k;
            this.f21241e.mo21438j(k);
        }
    }

    /* renamed from: y */
    public void mo21471y() {
        this.f21237a = null;
        this.f21241e.clear();
        this.f21238b = Utils.FLOAT_EPSILON;
        this.f21242f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo21472z() {
        /*
            r10 = this;
            n.i r0 = r10.f21237a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            n.i r1 = r10.f21237a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f21238b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f21238b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            n.b$a r5 = r10.f21241e
            int r5 = r5.mo21434f()
        L_0x005d:
            if (r3 >= r5) goto L_0x00eb
            n.b$a r6 = r10.f21241e
            n.i r6 = r6.mo21432d(r3)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e7
        L_0x0069:
            n.b$a r7 = r10.f21241e
            float r7 = r7.mo21436h(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e7
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x0093:
            if (r8 <= 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b9
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b8:
            float r7 = r7 * r9
        L_0x00b9:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e6
        L_0x00cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e6:
            r1 = r4
        L_0x00e7:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00eb:
            if (r1 != 0) goto L_0x00fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p175n.C7171b.mo21472z():java.lang.String");
    }

    public C7171b(C7173c cVar) {
        this.f21241e = new C7170a(this, cVar);
    }
}
