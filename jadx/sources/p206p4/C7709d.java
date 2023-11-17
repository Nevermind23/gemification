package p206p4;

import com.github.mikephil.charting.utils.Utils;
import p334z4.C9207a;

/* renamed from: p4.d */
abstract class C7709d {
    /* renamed from: a */
    static void m29271a(C7696a aVar, C7696a aVar2) {
        Class<C7709d> cls = C7709d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                int c = aVar.mo22432c(0);
                int c2 = aVar.mo22432c(1);
                int c3 = aVar.mo22432c(2);
                float[] b = aVar.mo22431b();
                float[] b2 = aVar2.mo22431b();
                for (int i = 0; i < c; i++) {
                    for (int i2 = 0; i2 < c2; i2++) {
                        for (int i3 = 0; i3 < c3; i3++) {
                            int i4 = (i * c2 * c3) + (i2 * c3) + i3;
                            b[i4] = b[i4] + b2[i3];
                        }
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    static C7696a m29272b(C7696a[] aVarArr) {
        Class<C7709d> cls = C7709d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int c = aVarArr[0].mo22432c(0);
            int i = 0;
            for (C7696a c2 : aVarArr) {
                i += c2.mo22432c(1);
            }
            C7696a aVar = new C7696a(new int[]{c, i});
            float[] b = aVar.mo22431b();
            for (int i2 = 0; i2 < c; i2++) {
                int i3 = i2 * i;
                for (int i4 = 0; i4 < aVarArr.length; i4++) {
                    float[] b2 = aVarArr[i4].mo22431b();
                    int c3 = aVarArr[i4].mo22432c(1);
                    System.arraycopy(b2, i2 * c3, b, i3, c3);
                    i3 += c3;
                }
            }
            return aVar;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    static C7696a m29273c(C7696a aVar, C7696a aVar2) {
        C7696a aVar3 = aVar;
        C7696a aVar4 = aVar2;
        Class<C7709d> cls = C7709d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        int i = 0;
        try {
            int c = aVar3.mo22432c(0);
            int c2 = aVar3.mo22432c(1);
            int c3 = aVar3.mo22432c(2);
            int c4 = aVar4.mo22432c(0);
            int i2 = (c2 - c4) + 1;
            int c5 = aVar4.mo22432c(2);
            C7696a aVar5 = new C7696a(new int[]{c, i2, c5});
            float[] b = aVar.mo22431b();
            float[] b2 = aVar5.mo22431b();
            float[] b3 = aVar2.mo22431b();
            int i3 = 0;
            while (i3 < c) {
                int i4 = i;
                while (i4 < c5) {
                    int i5 = i;
                    while (i5 < i2) {
                        float f = Utils.FLOAT_EPSILON;
                        while (i < c4) {
                            for (int i6 = 0; i6 < c3; i6++) {
                                f += b[(c2 * c3 * i3) + ((i + i5) * c3) + i6] * b3[(((i * c3) + i6) * c5) + i4];
                            }
                            i++;
                        }
                        b2[(i2 * c5 * i3) + (i5 * c5) + i4] = f;
                        i5++;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return aVar5;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static C7696a m29274d(C7696a aVar, C7696a aVar2, C7696a aVar3) {
        Class<C7709d> cls = C7709d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int c = aVar.mo22432c(0);
            int c2 = aVar3.mo22432c(0);
            C7696a h = m29278h(aVar, aVar2);
            float[] b = aVar3.mo22431b();
            float[] b2 = h.mo22431b();
            for (int i = 0; i < c; i++) {
                for (int i2 = 0; i2 < c2; i2++) {
                    int i3 = (i * c2) + i2;
                    b2[i3] = b2[i3] + b[i2];
                }
            }
            return h;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    static C7696a m29275e(String[] strArr, int i, C7696a aVar) {
        Class<C7709d> cls = C7709d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int length = strArr.length;
            int c = aVar.mo22432c(1);
            C7696a aVar2 = new C7696a(new int[]{length, i, c});
            float[] b = aVar2.mo22431b();
            float[] b2 = aVar.mo22431b();
            for (int i2 = 0; i2 < length; i2++) {
                int[] c2 = C7710e.m29285c(strArr[i2], i);
                for (int i3 = 0; i3 < i; i3++) {
                    System.arraycopy(b2, c2[i3] * c, b, (c * i * i2) + (c * i3), c);
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    static void m29276f(C7696a aVar, int i) {
        Class<C7709d> cls = C7709d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                if (i < aVar.mo22433d()) {
                    int i2 = 1;
                    for (int i3 = i; i3 < aVar.mo22433d(); i3++) {
                        i2 *= aVar.mo22432c(i3);
                    }
                    int[] iArr = new int[(i + 1)];
                    for (int i4 = 0; i4 < i; i4++) {
                        iArr[i4] = aVar.mo22432c(i4);
                    }
                    iArr[i] = i2;
                    aVar.mo22434e(iArr);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: g */
    static C7696a m29277g(C7696a aVar, int i) {
        C7696a aVar2 = aVar;
        int i2 = i;
        Class<C7709d> cls = C7709d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        int i3 = 0;
        try {
            int c = aVar2.mo22432c(0);
            int c2 = aVar2.mo22432c(1);
            int c3 = aVar2.mo22432c(2);
            int i4 = (c2 - i2) + 1;
            C7696a aVar3 = new C7696a(new int[]{c, i4, c3});
            float[] b = aVar.mo22431b();
            float[] b2 = aVar3.mo22431b();
            int i5 = 0;
            while (i5 < c) {
                int i6 = i3;
                while (i6 < c3) {
                    int i7 = i3;
                    while (i7 < i4) {
                        int i8 = i7 * c3;
                        int i9 = (i5 * i4 * c3) + i8 + i6;
                        int i12 = (i5 * c2 * c3) + i8 + i6;
                        b2[i9] = Float.MIN_VALUE;
                        for (int i13 = i3; i13 < i2; i13++) {
                            b2[i9] = Math.max(b2[i9], b[i12 + (i13 * c3)]);
                        }
                        i7++;
                        i3 = 0;
                    }
                    i6++;
                    i3 = 0;
                }
                i5++;
                i3 = 0;
            }
            return aVar3;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: h */
    static C7696a m29278h(C7696a aVar, C7696a aVar2) {
        C7696a aVar3 = aVar2;
        Class<C7709d> cls = C7709d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int c = aVar.mo22432c(0);
            int c2 = aVar3.mo22432c(0);
            int c3 = aVar3.mo22432c(1);
            C7696a aVar4 = new C7696a(new int[]{c, c3});
            float[] b = aVar.mo22431b();
            float[] b2 = aVar2.mo22431b();
            float[] b3 = aVar4.mo22431b();
            for (int i = 0; i < c; i++) {
                for (int i2 = 0; i2 < c3; i2++) {
                    int i3 = (i * c3) + i2;
                    b3[i3] = 0.0f;
                    for (int i4 = 0; i4 < c2; i4++) {
                        b3[i3] = b3[i3] + (b[(i * c2) + i4] * b2[(i4 * c3) + i2]);
                    }
                }
            }
            return aVar4;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    static void m29279i(C7696a aVar) {
        Class<C7709d> cls = C7709d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                float[] b = aVar.mo22431b();
                for (int i = 0; i < b.length; i++) {
                    if (b[i] < Utils.FLOAT_EPSILON) {
                        b[i] = 0.0f;
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: j */
    static void m29280j(C7696a aVar) {
        Class<C7709d> cls = C7709d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                int c = aVar.mo22432c(0);
                int c2 = aVar.mo22432c(1);
                float[] b = aVar.mo22431b();
                for (int i = 0; i < c; i++) {
                    int i2 = i * c2;
                    int i3 = i2 + c2;
                    float f = Float.MIN_VALUE;
                    for (int i4 = i2; i4 < i3; i4++) {
                        float f2 = b[i4];
                        if (f2 > f) {
                            f = f2;
                        }
                    }
                    for (int i5 = i2; i5 < i3; i5++) {
                        b[i5] = (float) Math.exp((double) (b[i5] - f));
                    }
                    float f3 = Utils.FLOAT_EPSILON;
                    for (int i6 = i2; i6 < i3; i6++) {
                        f3 += b[i6];
                    }
                    while (i2 < i3) {
                        b[i2] = b[i2] / f3;
                        i2++;
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: k */
    static C7696a m29281k(C7696a aVar) {
        Class<C7709d> cls = C7709d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int c = aVar.mo22432c(0);
            int c2 = aVar.mo22432c(1);
            C7696a aVar2 = new C7696a(new int[]{c2, c});
            float[] b = aVar.mo22431b();
            float[] b2 = aVar2.mo22431b();
            for (int i = 0; i < c; i++) {
                for (int i2 = 0; i2 < c2; i2++) {
                    b2[(i2 * c) + i] = b[(i * c2) + i2];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    static C7696a m29282l(C7696a aVar) {
        Class<C7709d> cls = C7709d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            int c = aVar.mo22432c(0);
            int c2 = aVar.mo22432c(1);
            int c3 = aVar.mo22432c(2);
            C7696a aVar2 = new C7696a(new int[]{c3, c2, c});
            float[] b = aVar.mo22431b();
            float[] b2 = aVar2.mo22431b();
            for (int i = 0; i < c; i++) {
                for (int i2 = 0; i2 < c2; i2++) {
                    for (int i3 = 0; i3 < c3; i3++) {
                        b2[(i3 * c * c2) + (i2 * c) + i] = b[(i * c2 * c3) + (i2 * c3) + i3];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }
}
