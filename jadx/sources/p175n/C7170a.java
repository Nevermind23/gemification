package p175n;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import p175n.C7171b;

/* renamed from: n.a */
public class C7170a implements C7171b.C7172a {

    /* renamed from: l */
    private static float f21225l = 0.001f;

    /* renamed from: a */
    int f21226a = 0;

    /* renamed from: b */
    private final C7171b f21227b;

    /* renamed from: c */
    protected final C7173c f21228c;

    /* renamed from: d */
    private int f21229d = 8;

    /* renamed from: e */
    private C7183i f21230e = null;

    /* renamed from: f */
    private int[] f21231f = new int[8];

    /* renamed from: g */
    private int[] f21232g = new int[8];

    /* renamed from: h */
    private float[] f21233h = new float[8];

    /* renamed from: i */
    private int f21234i = -1;

    /* renamed from: j */
    private int f21235j = -1;

    /* renamed from: k */
    private boolean f21236k = false;

    C7170a(C7171b bVar, C7173c cVar) {
        this.f21227b = bVar;
        this.f21228c = cVar;
    }

    /* renamed from: a */
    public void mo21428a(C7183i iVar, float f, boolean z) {
        float f2 = f21225l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f21234i;
            if (i == -1) {
                this.f21234i = 0;
                this.f21233h[0] = f;
                this.f21231f[0] = iVar.f21288f;
                this.f21232g[0] = -1;
                iVar.f21298p++;
                iVar.mo21506a(this.f21227b);
                this.f21226a++;
                if (!this.f21236k) {
                    int i2 = this.f21235j + 1;
                    this.f21235j = i2;
                    int[] iArr = this.f21231f;
                    if (i2 >= iArr.length) {
                        this.f21236k = true;
                        this.f21235j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f21226a) {
                int i5 = this.f21231f[i];
                int i6 = iVar.f21288f;
                if (i5 == i6) {
                    float[] fArr = this.f21233h;
                    float f3 = fArr[i] + f;
                    float f4 = f21225l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == Utils.FLOAT_EPSILON) {
                        if (i == this.f21234i) {
                            this.f21234i = this.f21232g[i];
                        } else {
                            int[] iArr2 = this.f21232g;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            iVar.mo21509e(this.f21227b);
                        }
                        if (this.f21236k) {
                            this.f21235j = i;
                        }
                        iVar.f21298p--;
                        this.f21226a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i4 = i;
                }
                i = this.f21232g[i];
                i3++;
            }
            int i7 = this.f21235j;
            int i8 = i7 + 1;
            if (this.f21236k) {
                int[] iArr3 = this.f21231f;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f21231f;
            if (i7 >= iArr4.length && this.f21226a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f21231f;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f21231f;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i12 = this.f21229d * 2;
                this.f21229d = i12;
                this.f21236k = false;
                this.f21235j = i7 - 1;
                this.f21233h = Arrays.copyOf(this.f21233h, i12);
                this.f21231f = Arrays.copyOf(this.f21231f, this.f21229d);
                this.f21232g = Arrays.copyOf(this.f21232g, this.f21229d);
            }
            this.f21231f[i7] = iVar.f21288f;
            this.f21233h[i7] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f21232g;
                iArr7[i7] = iArr7[i4];
                iArr7[i4] = i7;
            } else {
                this.f21232g[i7] = this.f21234i;
                this.f21234i = i7;
            }
            iVar.f21298p++;
            iVar.mo21506a(this.f21227b);
            this.f21226a++;
            if (!this.f21236k) {
                this.f21235j++;
            }
            int i13 = this.f21235j;
            int[] iArr8 = this.f21231f;
            if (i13 >= iArr8.length) {
                this.f21236k = true;
                this.f21235j = iArr8.length - 1;
            }
        }
    }

    /* renamed from: b */
    public float mo21429b(C7171b bVar, boolean z) {
        float g = mo21435g(bVar.f21237a);
        mo21439k(bVar.f21237a, z);
        C7171b.C7172a aVar = bVar.f21241e;
        int f = aVar.mo21434f();
        for (int i = 0; i < f; i++) {
            C7183i d = aVar.mo21432d(i);
            mo21428a(d, aVar.mo21435g(d) * g, z);
        }
        return g;
    }

    /* renamed from: c */
    public final void mo21430c(C7183i iVar, float f) {
        if (f == Utils.FLOAT_EPSILON) {
            mo21439k(iVar, true);
            return;
        }
        int i = this.f21234i;
        if (i == -1) {
            this.f21234i = 0;
            this.f21233h[0] = f;
            this.f21231f[0] = iVar.f21288f;
            this.f21232g[0] = -1;
            iVar.f21298p++;
            iVar.mo21506a(this.f21227b);
            this.f21226a++;
            if (!this.f21236k) {
                int i2 = this.f21235j + 1;
                this.f21235j = i2;
                int[] iArr = this.f21231f;
                if (i2 >= iArr.length) {
                    this.f21236k = true;
                    this.f21235j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f21226a) {
            int i5 = this.f21231f[i];
            int i6 = iVar.f21288f;
            if (i5 == i6) {
                this.f21233h[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.f21232g[i];
            i3++;
        }
        int i7 = this.f21235j;
        int i8 = i7 + 1;
        if (this.f21236k) {
            int[] iArr2 = this.f21231f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f21231f;
        if (i7 >= iArr3.length && this.f21226a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f21231f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f21231f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i12 = this.f21229d * 2;
            this.f21229d = i12;
            this.f21236k = false;
            this.f21235j = i7 - 1;
            this.f21233h = Arrays.copyOf(this.f21233h, i12);
            this.f21231f = Arrays.copyOf(this.f21231f, this.f21229d);
            this.f21232g = Arrays.copyOf(this.f21232g, this.f21229d);
        }
        this.f21231f[i7] = iVar.f21288f;
        this.f21233h[i7] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f21232g;
            iArr6[i7] = iArr6[i4];
            iArr6[i4] = i7;
        } else {
            this.f21232g[i7] = this.f21234i;
            this.f21234i = i7;
        }
        iVar.f21298p++;
        iVar.mo21506a(this.f21227b);
        int i13 = this.f21226a + 1;
        this.f21226a = i13;
        if (!this.f21236k) {
            this.f21235j++;
        }
        int[] iArr7 = this.f21231f;
        if (i13 >= iArr7.length) {
            this.f21236k = true;
        }
        if (this.f21235j >= iArr7.length) {
            this.f21236k = true;
            this.f21235j = iArr7.length - 1;
        }
    }

    public final void clear() {
        int i = this.f21234i;
        int i2 = 0;
        while (i != -1 && i2 < this.f21226a) {
            C7183i iVar = this.f21228c.f21246d[this.f21231f[i]];
            if (iVar != null) {
                iVar.mo21509e(this.f21227b);
            }
            i = this.f21232g[i];
            i2++;
        }
        this.f21234i = -1;
        this.f21235j = -1;
        this.f21236k = false;
        this.f21226a = 0;
    }

    /* renamed from: d */
    public C7183i mo21432d(int i) {
        int i2 = this.f21234i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f21226a) {
            if (i3 == i) {
                return this.f21228c.f21246d[this.f21231f[i2]];
            }
            i2 = this.f21232g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: e */
    public void mo21433e() {
        int i = this.f21234i;
        int i2 = 0;
        while (i != -1 && i2 < this.f21226a) {
            float[] fArr = this.f21233h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f21232g[i];
            i2++;
        }
    }

    /* renamed from: f */
    public int mo21434f() {
        return this.f21226a;
    }

    /* renamed from: g */
    public final float mo21435g(C7183i iVar) {
        int i = this.f21234i;
        int i2 = 0;
        while (i != -1 && i2 < this.f21226a) {
            if (this.f21231f[i] == iVar.f21288f) {
                return this.f21233h[i];
            }
            i = this.f21232g[i];
            i2++;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: h */
    public float mo21436h(int i) {
        int i2 = this.f21234i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f21226a) {
            if (i3 == i) {
                return this.f21233h[i2];
            }
            i2 = this.f21232g[i2];
            i3++;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: i */
    public boolean mo21437i(C7183i iVar) {
        int i = this.f21234i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f21226a) {
            if (this.f21231f[i] == iVar.f21288f) {
                return true;
            }
            i = this.f21232g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: j */
    public void mo21438j(float f) {
        int i = this.f21234i;
        int i2 = 0;
        while (i != -1 && i2 < this.f21226a) {
            float[] fArr = this.f21233h;
            fArr[i] = fArr[i] / f;
            i = this.f21232g[i];
            i2++;
        }
    }

    /* renamed from: k */
    public final float mo21439k(C7183i iVar, boolean z) {
        if (this.f21230e == iVar) {
            this.f21230e = null;
        }
        int i = this.f21234i;
        if (i == -1) {
            return Utils.FLOAT_EPSILON;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f21226a) {
            if (this.f21231f[i] == iVar.f21288f) {
                if (i == this.f21234i) {
                    this.f21234i = this.f21232g[i];
                } else {
                    int[] iArr = this.f21232g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo21509e(this.f21227b);
                }
                iVar.f21298p--;
                this.f21226a--;
                this.f21231f[i] = -1;
                if (this.f21236k) {
                    this.f21235j = i;
                }
                return this.f21233h[i];
            }
            i2++;
            i3 = i;
            i = this.f21232g[i];
        }
        return Utils.FLOAT_EPSILON;
    }

    public String toString() {
        int i = this.f21234i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f21226a) {
            str = ((str + " -> ") + this.f21233h[i] + " : ") + this.f21228c.f21246d[this.f21231f[i]];
            i = this.f21232g[i];
            i2++;
        }
        return str;
    }
}
