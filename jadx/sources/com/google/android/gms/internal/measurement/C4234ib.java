package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.ib */
public final class C4234ib {

    /* renamed from: f */
    private static final C4234ib f13335f = new C4234ib(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f13336a;

    /* renamed from: b */
    private int[] f13337b;

    /* renamed from: c */
    private Object[] f13338c;

    /* renamed from: d */
    private int f13339d = -1;

    /* renamed from: e */
    private boolean f13340e;

    private C4234ib(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f13336a = i;
        this.f13337b = iArr;
        this.f13338c = objArr;
        this.f13340e = z;
    }

    /* renamed from: c */
    public static C4234ib m16102c() {
        return f13335f;
    }

    /* renamed from: e */
    static C4234ib m16103e(C4234ib ibVar, C4234ib ibVar2) {
        int i = ibVar.f13336a + ibVar2.f13336a;
        int[] copyOf = Arrays.copyOf(ibVar.f13337b, i);
        System.arraycopy(ibVar2.f13337b, 0, copyOf, ibVar.f13336a, ibVar2.f13336a);
        Object[] copyOf2 = Arrays.copyOf(ibVar.f13338c, i);
        System.arraycopy(ibVar2.f13338c, 0, copyOf2, ibVar.f13336a, ibVar2.f13336a);
        return new C4234ib(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    static C4234ib m16104f() {
        return new C4234ib(0, new int[8], new Object[8], true);
    }

    /* renamed from: l */
    private final void m16105l(int i) {
        int[] iArr = this.f13337b;
        if (i > iArr.length) {
            int i2 = this.f13336a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f13337b = Arrays.copyOf(iArr, i);
            this.f13338c = Arrays.copyOf(this.f13338c, i);
        }
    }

    /* renamed from: a */
    public final int mo13257a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f13339d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f13336a; i6++) {
            int i7 = this.f13337b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f13338c[i6]).longValue();
                    i = C4096a9.m15484y(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i12 = C4096a9.f13141d;
                    int g = ((C4418t8) this.f13338c[i6]).mo13355g();
                    i = C4096a9.m15484y(i8 << 3) + C4096a9.m15484y(g) + g;
                } else if (i9 == 3) {
                    int i13 = i8 << 3;
                    int i14 = C4096a9.f13141d;
                    i2 = ((C4234ib) this.f13338c[i6]).mo13257a();
                    int y = C4096a9.m15484y(i13);
                    i3 = y + y;
                } else if (i9 == 5) {
                    ((Integer) this.f13338c[i6]).intValue();
                    i = C4096a9.m15484y(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzll.m17327a());
                }
                i5 += i;
            } else {
                int i15 = i8 << 3;
                i2 = C4096a9.m15485z(((Long) this.f13338c[i6]).longValue());
                i3 = C4096a9.m15484y(i15);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f13339d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo13258b() {
        int i = this.f13339d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13336a; i3++) {
            int i4 = C4096a9.f13141d;
            int g = ((C4418t8) this.f13338c[i3]).mo13355g();
            int y = C4096a9.m15484y(g) + g;
            int y2 = C4096a9.m15484y(16);
            int y3 = C4096a9.m15484y(this.f13337b[i3] >>> 3);
            int y4 = C4096a9.m15484y(8);
            i2 += y4 + y4 + y2 + y3 + C4096a9.m15484y(24) + y;
        }
        this.f13339d = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C4234ib mo13259d(C4234ib ibVar) {
        if (ibVar.equals(f13335f)) {
            return this;
        }
        mo13261g();
        int i = this.f13336a + ibVar.f13336a;
        m16105l(i);
        System.arraycopy(ibVar.f13337b, 0, this.f13337b, this.f13336a, ibVar.f13336a);
        System.arraycopy(ibVar.f13338c, 0, this.f13338c, this.f13336a, ibVar.f13336a);
        this.f13336a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4234ib)) {
            return false;
        }
        C4234ib ibVar = (C4234ib) obj;
        int i = this.f13336a;
        if (i == ibVar.f13336a) {
            int[] iArr = this.f13337b;
            int[] iArr2 = ibVar.f13337b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f13338c;
                    Object[] objArr2 = ibVar.f13338c;
                    int i3 = this.f13336a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo13261g() {
        if (!this.f13340e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void mo13262h() {
        if (this.f13340e) {
            this.f13340e = false;
        }
    }

    public final int hashCode() {
        int i = this.f13336a;
        int i2 = i + 527;
        int[] iArr = this.f13337b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 * 31) + i4;
        Object[] objArr = this.f13338c;
        int i7 = this.f13336a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return (i6 * 31) + i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo13264i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f13336a; i2++) {
            C4420ta.m16763b(sb, i, String.valueOf(this.f13337b[i2] >>> 3), this.f13338c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo13265j(int i, Object obj) {
        mo13261g();
        m16105l(this.f13336a + 1);
        int[] iArr = this.f13337b;
        int i2 = this.f13336a;
        iArr[i2] = i;
        this.f13338c[i2] = obj;
        this.f13336a = i2 + 1;
    }

    /* renamed from: k */
    public final void mo13266k(C4504yb ybVar) {
        if (this.f13336a != 0) {
            for (int i = 0; i < this.f13336a; i++) {
                int i2 = this.f13337b[i];
                Object obj = this.f13338c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ybVar.mo12928f(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ybVar.mo12921I(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    ybVar.mo12937o(i4, (C4418t8) obj);
                } else if (i3 == 3) {
                    ybVar.mo12938p(i4);
                    ((C4234ib) obj).mo13266k(ybVar);
                    ybVar.mo12941s(i4);
                } else if (i3 == 5) {
                    ybVar.mo12944v(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzll.m17327a());
                }
            }
        }
    }
}
