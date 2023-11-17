package p175n;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import p175n.C7171b;

/* renamed from: n.j */
public class C7185j implements C7171b.C7172a {

    /* renamed from: n */
    private static float f21309n = 0.001f;

    /* renamed from: a */
    private final int f21310a = -1;

    /* renamed from: b */
    private int f21311b = 16;

    /* renamed from: c */
    private int f21312c = 16;

    /* renamed from: d */
    int[] f21313d = new int[16];

    /* renamed from: e */
    int[] f21314e = new int[16];

    /* renamed from: f */
    int[] f21315f = new int[16];

    /* renamed from: g */
    float[] f21316g = new float[16];

    /* renamed from: h */
    int[] f21317h = new int[16];

    /* renamed from: i */
    int[] f21318i = new int[16];

    /* renamed from: j */
    int f21319j = 0;

    /* renamed from: k */
    int f21320k = -1;

    /* renamed from: l */
    private final C7171b f21321l;

    /* renamed from: m */
    protected final C7173c f21322m;

    C7185j(C7171b bVar, C7173c cVar) {
        this.f21321l = bVar;
        this.f21322m = cVar;
        clear();
    }

    /* renamed from: l */
    private void m27666l(C7183i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f21288f % this.f21312c;
        int[] iArr2 = this.f21313d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f21314e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.f21314e[i] = -1;
    }

    /* renamed from: m */
    private void m27667m(int i, C7183i iVar, float f) {
        this.f21315f[i] = iVar.f21288f;
        this.f21316g[i] = f;
        this.f21317h[i] = -1;
        this.f21318i[i] = -1;
        iVar.mo21506a(this.f21321l);
        iVar.f21298p++;
        this.f21319j++;
    }

    /* renamed from: n */
    private int m27668n() {
        for (int i = 0; i < this.f21311b; i++) {
            if (this.f21315f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m27669o() {
        int i = this.f21311b * 2;
        this.f21315f = Arrays.copyOf(this.f21315f, i);
        this.f21316g = Arrays.copyOf(this.f21316g, i);
        this.f21317h = Arrays.copyOf(this.f21317h, i);
        this.f21318i = Arrays.copyOf(this.f21318i, i);
        this.f21314e = Arrays.copyOf(this.f21314e, i);
        for (int i2 = this.f21311b; i2 < i; i2++) {
            this.f21315f[i2] = -1;
            this.f21314e[i2] = -1;
        }
        this.f21311b = i;
    }

    /* renamed from: q */
    private void m27670q(int i, C7183i iVar, float f) {
        int n = m27668n();
        m27667m(n, iVar, f);
        if (i != -1) {
            this.f21317h[n] = i;
            int[] iArr = this.f21318i;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f21317h[n] = -1;
            if (this.f21319j > 0) {
                this.f21318i[n] = this.f21320k;
                this.f21320k = n;
            } else {
                this.f21318i[n] = -1;
            }
        }
        int i2 = this.f21318i[n];
        if (i2 != -1) {
            this.f21317h[i2] = n;
        }
        m27666l(iVar, n);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27671r(p175n.C7183i r6) {
        /*
            r5 = this;
            int r6 = r6.f21288f
            int r0 = r5.f21312c
            int r0 = r6 % r0
            int[] r1 = r5.f21313d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f21315f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f21314e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f21314e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f21315f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f21315f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175n.C7185j.m27671r(n.i):void");
    }

    /* renamed from: a */
    public void mo21428a(C7183i iVar, float f, boolean z) {
        float f2 = f21309n;
        if (f <= (-f2) || f >= f2) {
            int p = mo21515p(iVar);
            if (p == -1) {
                mo21430c(iVar, f);
                return;
            }
            float[] fArr = this.f21316g;
            float f3 = fArr[p] + f;
            fArr[p] = f3;
            float f4 = f21309n;
            if (f3 > (-f4) && f3 < f4) {
                fArr[p] = 0.0f;
                mo21439k(iVar, z);
            }
        }
    }

    /* renamed from: b */
    public float mo21429b(C7171b bVar, boolean z) {
        float g = mo21435g(bVar.f21237a);
        mo21439k(bVar.f21237a, z);
        C7185j jVar = (C7185j) bVar.f21241e;
        int f = jVar.mo21434f();
        int i = 0;
        int i2 = 0;
        while (i < f) {
            int i3 = jVar.f21315f[i2];
            if (i3 != -1) {
                mo21428a(this.f21322m.f21246d[i3], jVar.f21316g[i2] * g, z);
                i++;
            }
            i2++;
        }
        return g;
    }

    /* renamed from: c */
    public void mo21430c(C7183i iVar, float f) {
        float f2 = f21309n;
        if (f <= (-f2) || f >= f2) {
            if (this.f21319j == 0) {
                m27667m(0, iVar, f);
                m27666l(iVar, 0);
                this.f21320k = 0;
                return;
            }
            int p = mo21515p(iVar);
            if (p != -1) {
                this.f21316g[p] = f;
                return;
            }
            if (this.f21319j + 1 >= this.f21311b) {
                m27669o();
            }
            int i = this.f21319j;
            int i2 = this.f21320k;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = this.f21315f[i2];
                int i6 = iVar.f21288f;
                if (i5 == i6) {
                    this.f21316g[i2] = f;
                    return;
                }
                if (i5 < i6) {
                    i3 = i2;
                }
                i2 = this.f21318i[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m27670q(i3, iVar, f);
            return;
        }
        mo21439k(iVar, true);
    }

    public void clear() {
        int i = this.f21319j;
        for (int i2 = 0; i2 < i; i2++) {
            C7183i d = mo21432d(i2);
            if (d != null) {
                d.mo21509e(this.f21321l);
            }
        }
        for (int i3 = 0; i3 < this.f21311b; i3++) {
            this.f21315f[i3] = -1;
            this.f21314e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f21312c; i4++) {
            this.f21313d[i4] = -1;
        }
        this.f21319j = 0;
        this.f21320k = -1;
    }

    /* renamed from: d */
    public C7183i mo21432d(int i) {
        int i2 = this.f21319j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f21320k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f21322m.f21246d[this.f21315f[i3]];
            }
            i3 = this.f21318i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo21433e() {
        int i = this.f21319j;
        int i2 = this.f21320k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f21316g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f21318i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public int mo21434f() {
        return this.f21319j;
    }

    /* renamed from: g */
    public float mo21435g(C7183i iVar) {
        int p = mo21515p(iVar);
        if (p != -1) {
            return this.f21316g[p];
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: h */
    public float mo21436h(int i) {
        int i2 = this.f21319j;
        int i3 = this.f21320k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f21316g[i3];
            }
            i3 = this.f21318i[i3];
            if (i3 == -1) {
                return Utils.FLOAT_EPSILON;
            }
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: i */
    public boolean mo21437i(C7183i iVar) {
        return mo21515p(iVar) != -1;
    }

    /* renamed from: j */
    public void mo21438j(float f) {
        int i = this.f21319j;
        int i2 = this.f21320k;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f21316g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f21318i[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    public float mo21439k(C7183i iVar, boolean z) {
        int p = mo21515p(iVar);
        if (p == -1) {
            return Utils.FLOAT_EPSILON;
        }
        m27671r(iVar);
        float f = this.f21316g[p];
        if (this.f21320k == p) {
            this.f21320k = this.f21318i[p];
        }
        this.f21315f[p] = -1;
        int[] iArr = this.f21317h;
        int i = iArr[p];
        if (i != -1) {
            int[] iArr2 = this.f21318i;
            iArr2[i] = iArr2[p];
        }
        int i2 = this.f21318i[p];
        if (i2 != -1) {
            iArr[i2] = iArr[p];
        }
        this.f21319j--;
        iVar.f21298p--;
        if (z) {
            iVar.mo21509e(this.f21321l);
        }
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo21515p(p175n.C7183i r4) {
        /*
            r3 = this;
            int r0 = r3.f21319j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f21288f
            int r0 = r3.f21312c
            int r0 = r4 % r0
            int[] r2 = r3.f21313d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f21315f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f21314e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f21315f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f21315f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p175n.C7185j.mo21515p(n.i):int");
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f21319j;
        for (int i2 = 0; i2 < i; i2++) {
            C7183i d = mo21432d(i2);
            if (d != null) {
                String str4 = str3 + d + " = " + mo21436h(i2) + " ";
                int p = mo21515p(d);
                String str5 = str4 + "[p: ";
                if (this.f21317h[p] != -1) {
                    str = str5 + this.f21322m.f21246d[this.f21315f[this.f21317h[p]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f21318i[p] != -1) {
                    str2 = str6 + this.f21322m.f21246d[this.f21315f[this.f21318i[p]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
