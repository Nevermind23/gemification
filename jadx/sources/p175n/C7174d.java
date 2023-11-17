package p175n;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashMap;
import p175n.C7183i;
import p214q.C7803d;
import p214q.C7806e;

/* renamed from: n.d */
public class C7174d {

    /* renamed from: r */
    public static boolean f21247r = false;

    /* renamed from: s */
    public static boolean f21248s = true;

    /* renamed from: t */
    public static boolean f21249t = true;

    /* renamed from: u */
    public static boolean f21250u = true;

    /* renamed from: v */
    public static boolean f21251v = false;

    /* renamed from: w */
    private static int f21252w = 1000;

    /* renamed from: x */
    public static long f21253x;

    /* renamed from: y */
    public static long f21254y;

    /* renamed from: a */
    public boolean f21255a;

    /* renamed from: b */
    int f21256b;

    /* renamed from: c */
    private HashMap f21257c;

    /* renamed from: d */
    private C7175a f21258d;

    /* renamed from: e */
    private int f21259e;

    /* renamed from: f */
    private int f21260f;

    /* renamed from: g */
    C7171b[] f21261g;

    /* renamed from: h */
    public boolean f21262h;

    /* renamed from: i */
    public boolean f21263i;

    /* renamed from: j */
    private boolean[] f21264j;

    /* renamed from: k */
    int f21265k;

    /* renamed from: l */
    int f21266l;

    /* renamed from: m */
    private int f21267m;

    /* renamed from: n */
    final C7173c f21268n;

    /* renamed from: o */
    private C7183i[] f21269o;

    /* renamed from: p */
    private int f21270p;

    /* renamed from: q */
    private C7175a f21271q;

    /* renamed from: n.d$a */
    interface C7175a {
        /* renamed from: a */
        void mo21445a(C7183i iVar);

        /* renamed from: b */
        void mo21446b(C7175a aVar);

        /* renamed from: c */
        C7183i mo21447c(C7174d dVar, boolean[] zArr);

        void clear();

        C7183i getKey();

        boolean isEmpty();
    }

    /* renamed from: n.d$b */
    class C7176b extends C7171b {
        public C7176b(C7173c cVar) {
            this.f21241e = new C7185j(this, cVar);
        }
    }

    public C7174d() {
        this.f21255a = false;
        this.f21256b = 0;
        this.f21257c = null;
        this.f21259e = 32;
        this.f21260f = 32;
        this.f21261g = null;
        this.f21262h = false;
        this.f21263i = false;
        this.f21264j = new boolean[32];
        this.f21265k = 1;
        this.f21266l = 0;
        this.f21267m = 32;
        this.f21269o = new C7183i[f21252w];
        this.f21270p = 0;
        this.f21261g = new C7171b[32];
        m27607D();
        C7173c cVar = new C7173c();
        this.f21268n = cVar;
        this.f21258d = new C7180h(cVar);
        if (f21251v) {
            this.f21271q = new C7176b(cVar);
        } else {
            this.f21271q = new C7171b(cVar);
        }
    }

    /* renamed from: C */
    private final int m27606C(C7175a aVar, boolean z) {
        for (int i = 0; i < this.f21265k; i++) {
            this.f21264j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.f21265k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f21264j[aVar.getKey().f21288f] = true;
            }
            C7183i c = aVar.mo21447c(this, this.f21264j);
            if (c != null) {
                boolean[] zArr = this.f21264j;
                int i3 = c.f21288f;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (c != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f21266l; i5++) {
                    C7171b bVar = this.f21261g[i5];
                    if (bVar.f21237a.f21295m != C7183i.C7184a.UNRESTRICTED && !bVar.f21242f && bVar.mo21467t(c)) {
                        float g = bVar.f21241e.mo21435g(c);
                        if (g < Utils.FLOAT_EPSILON) {
                            float f2 = (-bVar.f21238b) / g;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C7171b bVar2 = this.f21261g[i4];
                    bVar2.f21237a.f21289g = -1;
                    bVar2.mo21470x(c);
                    C7183i iVar = bVar2.f21237a;
                    iVar.f21289g = i4;
                    iVar.mo21513j(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: D */
    private void m27607D() {
        int i = 0;
        if (f21251v) {
            while (i < this.f21266l) {
                C7171b bVar = this.f21261g[i];
                if (bVar != null) {
                    this.f21268n.f21243a.mo21495a(bVar);
                }
                this.f21261g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f21266l) {
            C7171b bVar2 = this.f21261g[i];
            if (bVar2 != null) {
                this.f21268n.f21244b.mo21495a(bVar2);
            }
            this.f21261g[i] = null;
            i++;
        }
    }

    /* renamed from: a */
    private C7183i m27608a(C7183i.C7184a aVar, String str) {
        C7183i iVar = (C7183i) this.f21268n.f21245c.mo21496b();
        if (iVar == null) {
            iVar = new C7183i(aVar, str);
            iVar.mo21512h(aVar, str);
        } else {
            iVar.mo21510f();
            iVar.mo21512h(aVar, str);
        }
        int i = this.f21270p;
        int i2 = f21252w;
        if (i >= i2) {
            int i3 = i2 * 2;
            f21252w = i3;
            this.f21269o = (C7183i[]) Arrays.copyOf(this.f21269o, i3);
        }
        C7183i[] iVarArr = this.f21269o;
        int i4 = this.f21270p;
        this.f21270p = i4 + 1;
        iVarArr[i4] = iVar;
        return iVar;
    }

    /* renamed from: l */
    private final void m27609l(C7171b bVar) {
        int i;
        if (!f21249t || !bVar.f21242f) {
            C7171b[] bVarArr = this.f21261g;
            int i2 = this.f21266l;
            bVarArr[i2] = bVar;
            C7183i iVar = bVar.f21237a;
            iVar.f21289g = i2;
            this.f21266l = i2 + 1;
            iVar.mo21513j(this, bVar);
        } else {
            bVar.f21237a.mo21511g(this, bVar.f21238b);
        }
        if (f21249t && this.f21255a) {
            int i3 = 0;
            while (i3 < this.f21266l) {
                if (this.f21261g[i3] == null) {
                    System.out.println("WTF");
                }
                C7171b bVar2 = this.f21261g[i3];
                if (bVar2 != null && bVar2.f21242f) {
                    bVar2.f21237a.mo21511g(this, bVar2.f21238b);
                    if (f21251v) {
                        this.f21268n.f21243a.mo21495a(bVar2);
                    } else {
                        this.f21268n.f21244b.mo21495a(bVar2);
                    }
                    this.f21261g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f21266l;
                        if (i4 >= i) {
                            break;
                        }
                        C7171b[] bVarArr2 = this.f21261g;
                        int i6 = i4 - 1;
                        C7171b bVar3 = bVarArr2[i4];
                        bVarArr2[i6] = bVar3;
                        C7183i iVar2 = bVar3.f21237a;
                        if (iVar2.f21289g == i4) {
                            iVar2.f21289g = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f21261g[i5] = null;
                    }
                    this.f21266l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f21255a = false;
        }
    }

    /* renamed from: n */
    private void m27610n() {
        for (int i = 0; i < this.f21266l; i++) {
            C7171b bVar = this.f21261g[i];
            bVar.f21237a.f21291i = bVar.f21238b;
        }
    }

    /* renamed from: s */
    public static C7171b m27611s(C7174d dVar, C7183i iVar, C7183i iVar2, float f) {
        return dVar.mo21490r().mo21457j(iVar, iVar2, f);
    }

    /* renamed from: u */
    private int m27612u(C7175a aVar) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f21266l) {
                z = false;
                break;
            }
            C7171b bVar = this.f21261g[i];
            if (bVar.f21237a.f21295m != C7183i.C7184a.UNRESTRICTED && bVar.f21238b < Utils.FLOAT_EPSILON) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f21266l; i6++) {
                C7171b bVar2 = this.f21261g[i6];
                if (bVar2.f21237a.f21295m != C7183i.C7184a.UNRESTRICTED && !bVar2.f21242f && bVar2.f21238b < Utils.FLOAT_EPSILON) {
                    int i7 = 9;
                    if (f21250u) {
                        int f2 = bVar2.f21241e.mo21434f();
                        int i8 = 0;
                        while (i8 < f2) {
                            C7183i d = bVar2.f21241e.mo21432d(i8);
                            float g = bVar2.f21241e.mo21435g(d);
                            if (g > Utils.FLOAT_EPSILON) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f3 = d.f21293k[i9] / g;
                                    if ((f3 < f && i9 == i5) || i9 > i5) {
                                        i4 = d.f21288f;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f3;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i12 = 1; i12 < this.f21265k; i12++) {
                            C7183i iVar = this.f21268n.f21246d[i12];
                            float g2 = bVar2.f21241e.mo21435g(iVar);
                            if (g2 > Utils.FLOAT_EPSILON) {
                                for (int i13 = 0; i13 < 9; i13++) {
                                    float f4 = iVar.f21293k[i13] / g2;
                                    if ((f4 < f && i13 == i5) || i13 > i5) {
                                        i4 = i12;
                                        i3 = i6;
                                        i5 = i13;
                                        f = f4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                C7171b bVar3 = this.f21261g[i3];
                bVar3.f21237a.f21289g = -1;
                bVar3.mo21470x(this.f21268n.f21246d[i4]);
                C7183i iVar2 = bVar3.f21237a;
                iVar2.f21289g = i3;
                iVar2.mo21513j(this, bVar3);
            } else {
                z2 = true;
            }
            if (i2 > this.f21265k / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: x */
    public static C7177e m27613x() {
        return null;
    }

    /* renamed from: z */
    private void m27614z() {
        int i = this.f21259e * 2;
        this.f21259e = i;
        this.f21261g = (C7171b[]) Arrays.copyOf(this.f21261g, i);
        C7173c cVar = this.f21268n;
        cVar.f21246d = (C7183i[]) Arrays.copyOf(cVar.f21246d, this.f21259e);
        int i2 = this.f21259e;
        this.f21264j = new boolean[i2];
        this.f21260f = i2;
        this.f21267m = i2;
    }

    /* renamed from: A */
    public void mo21473A() {
        if (this.f21258d.isEmpty()) {
            m27610n();
        } else if (this.f21262h || this.f21263i) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f21266l) {
                    z = true;
                    break;
                } else if (!this.f21261g[i].f21242f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo21474B(this.f21258d);
            } else {
                m27610n();
            }
        } else {
            mo21474B(this.f21258d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo21474B(C7175a aVar) {
        m27612u(aVar);
        m27606C(aVar, false);
        m27610n();
    }

    /* renamed from: E */
    public void mo21475E() {
        C7173c cVar;
        int i = 0;
        while (true) {
            cVar = this.f21268n;
            C7183i[] iVarArr = cVar.f21246d;
            if (i >= iVarArr.length) {
                break;
            }
            C7183i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo21510f();
            }
            i++;
        }
        cVar.f21245c.mo21497c(this.f21269o, this.f21270p);
        this.f21270p = 0;
        Arrays.fill(this.f21268n.f21246d, (Object) null);
        HashMap hashMap = this.f21257c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f21256b = 0;
        this.f21258d.clear();
        this.f21265k = 1;
        for (int i2 = 0; i2 < this.f21266l; i2++) {
            C7171b bVar = this.f21261g[i2];
            if (bVar != null) {
                bVar.f21239c = false;
            }
        }
        m27607D();
        this.f21266l = 0;
        if (f21251v) {
            this.f21271q = new C7176b(this.f21268n);
        } else {
            this.f21271q = new C7171b(this.f21268n);
        }
    }

    /* renamed from: b */
    public void mo21476b(C7806e eVar, C7806e eVar2, float f, int i) {
        C7806e eVar3 = eVar;
        C7806e eVar4 = eVar2;
        C7803d.C7805b bVar = C7803d.C7805b.LEFT;
        C7183i q = mo21489q(eVar3.mo22666m(bVar));
        C7803d.C7805b bVar2 = C7803d.C7805b.TOP;
        C7183i q2 = mo21489q(eVar3.mo22666m(bVar2));
        C7803d.C7805b bVar3 = C7803d.C7805b.RIGHT;
        C7183i q3 = mo21489q(eVar3.mo22666m(bVar3));
        C7803d.C7805b bVar4 = C7803d.C7805b.BOTTOM;
        C7183i q4 = mo21489q(eVar3.mo22666m(bVar4));
        C7183i q5 = mo21489q(eVar4.mo22666m(bVar));
        C7183i q6 = mo21489q(eVar4.mo22666m(bVar2));
        C7183i q7 = mo21489q(eVar4.mo22666m(bVar3));
        C7183i q8 = mo21489q(eVar4.mo22666m(bVar4));
        C7171b r = mo21490r();
        double d = (double) f;
        C7183i iVar = q7;
        double d2 = (double) i;
        r.mo21464q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        mo21478d(r);
        C7171b r2 = mo21490r();
        r2.mo21464q(q, q3, q5, iVar, (float) (Math.cos(d) * d2));
        mo21478d(r2);
    }

    /* renamed from: c */
    public void mo21477c(C7183i iVar, C7183i iVar2, int i, float f, C7183i iVar3, C7183i iVar4, int i2, int i3) {
        int i4 = i3;
        C7171b r = mo21490r();
        r.mo21454h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 8) {
            r.mo21449d(this, i4);
        }
        mo21478d(r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo21478d(p175n.C7171b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f21266l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f21267m
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.f21265k
            int r0 = r0 + r1
            int r2 = r5.f21260f
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.m27614z()
        L_0x0015:
            boolean r0 = r6.f21242f
            r2 = 0
            if (r0 != 0) goto L_0x0084
            r6.mo21444D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.mo21465r()
            boolean r0 = r6.mo21451f(r5)
            if (r0 == 0) goto L_0x007b
            n.i r0 = r5.mo21488p()
            r6.f21237a = r0
            int r3 = r5.f21266l
            r5.m27609l(r6)
            int r4 = r5.f21266l
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x007b
            n.d$a r2 = r5.f21271q
            r2.mo21446b(r6)
            n.d$a r2 = r5.f21271q
            r5.m27606C(r2, r1)
            int r2 = r0.f21289g
            r3 = -1
            if (r2 != r3) goto L_0x007c
            n.i r2 = r6.f21237a
            if (r2 != r0) goto L_0x0059
            n.i r0 = r6.mo21469v(r0)
            if (r0 == 0) goto L_0x0059
            r6.mo21470x(r0)
        L_0x0059:
            boolean r0 = r6.f21242f
            if (r0 != 0) goto L_0x0062
            n.i r0 = r6.f21237a
            r0.mo21513j(r5, r6)
        L_0x0062:
            boolean r0 = f21251v
            if (r0 == 0) goto L_0x006e
            n.c r0 = r5.f21268n
            n.f r0 = r0.f21243a
            r0.mo21495a(r6)
            goto L_0x0075
        L_0x006e:
            n.c r0 = r5.f21268n
            n.f r0 = r0.f21244b
            r0.mo21495a(r6)
        L_0x0075:
            int r0 = r5.f21266l
            int r0 = r0 - r1
            r5.f21266l = r0
            goto L_0x007c
        L_0x007b:
            r1 = r2
        L_0x007c:
            boolean r0 = r6.mo21466s()
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r2 = r1
        L_0x0084:
            if (r2 != 0) goto L_0x0089
            r5.m27609l(r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175n.C7174d.mo21478d(n.b):void");
    }

    /* renamed from: e */
    public C7171b mo21479e(C7183i iVar, C7183i iVar2, int i, int i2) {
        if (!f21248s || i2 != 8 || !iVar2.f21292j || iVar.f21289g != -1) {
            C7171b r = mo21490r();
            r.mo21461n(iVar, iVar2, i);
            if (i2 != 8) {
                r.mo21449d(this, i2);
            }
            mo21478d(r);
            return r;
        }
        iVar.mo21511g(this, iVar2.f21291i + ((float) i));
        return null;
    }

    /* renamed from: f */
    public void mo21480f(C7183i iVar, int i) {
        if (!f21248s || iVar.f21289g != -1) {
            int i2 = iVar.f21289g;
            if (i2 != -1) {
                C7171b bVar = this.f21261g[i2];
                if (bVar.f21242f) {
                    bVar.f21238b = (float) i;
                } else if (bVar.f21241e.mo21434f() == 0) {
                    bVar.f21242f = true;
                    bVar.f21238b = (float) i;
                } else {
                    C7171b r = mo21490r();
                    r.mo21460m(iVar, i);
                    mo21478d(r);
                }
            } else {
                C7171b r2 = mo21490r();
                r2.mo21455i(iVar, i);
                mo21478d(r2);
            }
        } else {
            float f = (float) i;
            iVar.mo21511g(this, f);
            for (int i3 = 0; i3 < this.f21256b + 1; i3++) {
                C7183i iVar2 = this.f21268n.f21246d[i3];
                if (iVar2 != null && iVar2.f21299q && iVar2.f21300r == iVar.f21288f) {
                    iVar2.mo21511g(this, iVar2.f21301s + f);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo21481g(C7183i iVar, C7183i iVar2, int i, boolean z) {
        C7171b r = mo21490r();
        C7183i t = mo21491t();
        t.f21290h = 0;
        r.mo21462o(iVar, iVar2, t, i);
        mo21478d(r);
    }

    /* renamed from: h */
    public void mo21482h(C7183i iVar, C7183i iVar2, int i, int i2) {
        C7171b r = mo21490r();
        C7183i t = mo21491t();
        t.f21290h = 0;
        r.mo21462o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo21486m(r, (int) (r.f21241e.mo21435g(t) * -1.0f), i2);
        }
        mo21478d(r);
    }

    /* renamed from: i */
    public void mo21483i(C7183i iVar, C7183i iVar2, int i, boolean z) {
        C7171b r = mo21490r();
        C7183i t = mo21491t();
        t.f21290h = 0;
        r.mo21463p(iVar, iVar2, t, i);
        mo21478d(r);
    }

    /* renamed from: j */
    public void mo21484j(C7183i iVar, C7183i iVar2, int i, int i2) {
        C7171b r = mo21490r();
        C7183i t = mo21491t();
        t.f21290h = 0;
        r.mo21463p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo21486m(r, (int) (r.f21241e.mo21435g(t) * -1.0f), i2);
        }
        mo21478d(r);
    }

    /* renamed from: k */
    public void mo21485k(C7183i iVar, C7183i iVar2, C7183i iVar3, C7183i iVar4, float f, int i) {
        C7171b r = mo21490r();
        r.mo21458k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r.mo21449d(this, i);
        }
        mo21478d(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo21486m(C7171b bVar, int i, int i2) {
        bVar.mo21450e(mo21487o(i2, (String) null), i);
    }

    /* renamed from: o */
    public C7183i mo21487o(int i, String str) {
        if (this.f21265k + 1 >= this.f21260f) {
            m27614z();
        }
        C7183i a = m27608a(C7183i.C7184a.ERROR, str);
        int i2 = this.f21256b + 1;
        this.f21256b = i2;
        this.f21265k++;
        a.f21288f = i2;
        a.f21290h = i;
        this.f21268n.f21246d[i2] = a;
        this.f21258d.mo21445a(a);
        return a;
    }

    /* renamed from: p */
    public C7183i mo21488p() {
        if (this.f21265k + 1 >= this.f21260f) {
            m27614z();
        }
        C7183i a = m27608a(C7183i.C7184a.SLACK, (String) null);
        int i = this.f21256b + 1;
        this.f21256b = i;
        this.f21265k++;
        a.f21288f = i;
        this.f21268n.f21246d[i] = a;
        return a;
    }

    /* renamed from: q */
    public C7183i mo21489q(Object obj) {
        C7183i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f21265k + 1 >= this.f21260f) {
            m27614z();
        }
        if (obj instanceof C7803d) {
            C7803d dVar = (C7803d) obj;
            iVar = dVar.mo22576h();
            if (iVar == null) {
                dVar.mo22586r(this.f21268n);
                iVar = dVar.mo22576h();
            }
            int i = iVar.f21288f;
            if (i == -1 || i > this.f21256b || this.f21268n.f21246d[i] == null) {
                if (i != -1) {
                    iVar.mo21510f();
                }
                int i2 = this.f21256b + 1;
                this.f21256b = i2;
                this.f21265k++;
                iVar.f21288f = i2;
                iVar.f21295m = C7183i.C7184a.UNRESTRICTED;
                this.f21268n.f21246d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public C7171b mo21490r() {
        C7171b bVar;
        if (f21251v) {
            bVar = (C7171b) this.f21268n.f21243a.mo21496b();
            if (bVar == null) {
                bVar = new C7176b(this.f21268n);
                f21254y++;
            } else {
                bVar.mo21471y();
            }
        } else {
            bVar = (C7171b) this.f21268n.f21244b.mo21496b();
            if (bVar == null) {
                bVar = new C7171b(this.f21268n);
                f21253x++;
            } else {
                bVar.mo21471y();
            }
        }
        C7183i.m27658c();
        return bVar;
    }

    /* renamed from: t */
    public C7183i mo21491t() {
        if (this.f21265k + 1 >= this.f21260f) {
            m27614z();
        }
        C7183i a = m27608a(C7183i.C7184a.SLACK, (String) null);
        int i = this.f21256b + 1;
        this.f21256b = i;
        this.f21265k++;
        a.f21288f = i;
        this.f21268n.f21246d[i] = a;
        return a;
    }

    /* renamed from: v */
    public void mo21492v(C7177e eVar) {
    }

    /* renamed from: w */
    public C7173c mo21493w() {
        return this.f21268n;
    }

    /* renamed from: y */
    public int mo21494y(Object obj) {
        C7183i h = ((C7803d) obj).mo22576h();
        if (h != null) {
            return (int) (h.f21291i + 0.5f);
        }
        return 0;
    }
}
