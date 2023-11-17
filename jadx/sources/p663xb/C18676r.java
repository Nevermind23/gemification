package p663xb;

import com.github.mikephil.charting.utils.Utils;
import com.google.zxing.C5753c;
import com.google.zxing.C5754d;
import com.google.zxing.C5763l;
import com.google.zxing.C5764m;
import com.google.zxing.C5765n;
import com.google.zxing.C5766o;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import p200ob.C7507a;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.SubsamplingScaleImageView;

/* renamed from: xb.r */
public abstract class C18676r implements C5763l {
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007c A[Catch:{ ReaderException -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00cb A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.zxing.C5764m m63282e(com.google.zxing.C5753c r22, java.util.Map r23) {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.mo18873d()
            int r2 = r22.mo18872c()
            ob.a r3 = new ob.a
            r3.<init>(r1)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001d
            com.google.zxing.d r6 = com.google.zxing.C5754d.TRY_HARDER
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x001d
            r6 = r5
            goto L_0x001e
        L_0x001d:
            r6 = r4
        L_0x001e:
            if (r6 == 0) goto L_0x0023
            r7 = 8
            goto L_0x0024
        L_0x0023:
            r7 = 5
        L_0x0024:
            int r7 = r2 >> r7
            int r7 = java.lang.Math.max(r5, r7)
            if (r6 == 0) goto L_0x002e
            r6 = r2
            goto L_0x0030
        L_0x002e:
            r6 = 15
        L_0x0030:
            int r8 = r2 / 2
            r9 = r4
        L_0x0033:
            if (r9 >= r6) goto L_0x00e7
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = r5
            goto L_0x0040
        L_0x003f:
            r9 = r4
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r7
            int r11 = r11 + r8
            if (r11 < 0) goto L_0x00e7
            if (r11 >= r2) goto L_0x00e7
            r9 = r22
            ob.a r3 = r9.mo18871b(r11, r3)     // Catch:{ NotFoundException -> 0x00db }
            r12 = r4
        L_0x0051:
            r13 = 2
            if (r12 >= r13) goto L_0x00db
            if (r12 != r5) goto L_0x0074
            r3.mo21964p()
            if (r0 == 0) goto L_0x0074
            com.google.zxing.d r13 = com.google.zxing.C5754d.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0074
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<com.google.zxing.d> r15 = com.google.zxing.C5754d.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0076
        L_0x0074:
            r13 = r21
        L_0x0076:
            com.google.zxing.m r14 = r13.mo46487d(r11, r3, r0)     // Catch:{ ReaderException -> 0x00cc }
            if (r12 != r5) goto L_0x00cb
            com.google.zxing.n r15 = com.google.zxing.C5765n.ORIENTATION     // Catch:{ ReaderException -> 0x00cc }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ ReaderException -> 0x00c5 }
            r14.mo18899h(r15, r5)     // Catch:{ ReaderException -> 0x00c5 }
            com.google.zxing.o[] r5 = r14.mo18896e()     // Catch:{ ReaderException -> 0x00c5 }
            if (r5 == 0) goto L_0x00cb
            com.google.zxing.o r15 = new com.google.zxing.o     // Catch:{ ReaderException -> 0x00c5 }
            r16 = r0
            float r0 = (float) r1
            r18 = r5[r4]     // Catch:{ ReaderException -> 0x00c7 }
            float r18 = r18.mo18901c()     // Catch:{ ReaderException -> 0x00c7 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r5[r4]     // Catch:{ ReaderException -> 0x00c9 }
            float r4 = r18.mo18902d()     // Catch:{ ReaderException -> 0x00c9 }
            r15.<init>(r1, r4)     // Catch:{ ReaderException -> 0x00c9 }
            r1 = 0
            r5[r1] = r15     // Catch:{ ReaderException -> 0x00c9 }
            com.google.zxing.o r4 = new com.google.zxing.o     // Catch:{ ReaderException -> 0x00c9 }
            r15 = 1
            r17 = r5[r15]     // Catch:{ ReaderException -> 0x00d1 }
            float r17 = r17.mo18901c()     // Catch:{ ReaderException -> 0x00d1 }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r5[r15]     // Catch:{ ReaderException -> 0x00d1 }
            float r1 = r17.mo18902d()     // Catch:{ ReaderException -> 0x00d1 }
            r4.<init>(r0, r1)     // Catch:{ ReaderException -> 0x00d1 }
            r5[r15] = r4     // Catch:{ ReaderException -> 0x00d1 }
            goto L_0x00cb
        L_0x00c5:
            r16 = r0
        L_0x00c7:
            r20 = r1
        L_0x00c9:
            r15 = 1
            goto L_0x00d1
        L_0x00cb:
            return r14
        L_0x00cc:
            r16 = r0
            r20 = r1
            r15 = r5
        L_0x00d1:
            int r12 = r12 + 1
            r5 = r15
            r0 = r16
            r1 = r20
            r4 = 0
            goto L_0x0051
        L_0x00db:
            r13 = r21
            r20 = r1
            r15 = r5
            r9 = r10
            r5 = r15
            r1 = r20
            r4 = 0
            goto L_0x0033
        L_0x00e7:
            r13 = r21
            com.google.zxing.NotFoundException r0 = com.google.zxing.NotFoundException.m23155a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p663xb.C18676r.m63282e(com.google.zxing.c, java.util.Map):com.google.zxing.m");
    }

    /* renamed from: f */
    protected static float m63283f(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = (float) i;
        float f4 = f3 / ((float) i2);
        float f5 = f * f4;
        float f6 = Utils.FLOAT_EPSILON;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f7 = ((float) iArr2[i4]) * f4;
            float f8 = (float) i5;
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }

    /* renamed from: g */
    protected static void m63284g(C7507a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int l = aVar.mo21961l();
        if (i < l) {
            boolean z = !aVar.mo21956g(i);
            while (i < l) {
                if (aVar.mo21956g(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != l) {
                throw NotFoundException.m23155a();
            }
            return;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: h */
    protected static void m63285h(C7507a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean g = aVar.mo21956g(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo21956g(i) != g) {
                length--;
                g = !g;
            }
        }
        if (length < 0) {
            m63284g(aVar, i + 1, iArr);
            return;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: a */
    public void mo18886a() {
    }

    /* renamed from: b */
    public C5764m mo18887b(C5753c cVar, Map map) {
        boolean z;
        try {
            return m63282e(cVar, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(C5754d.TRY_HARDER)) {
                z = false;
            } else {
                z = true;
            }
            if (!z || !cVar.mo18874e()) {
                throw e;
            }
            C5753c f = cVar.mo18875f();
            C5764m e2 = m63282e(f, map);
            Map d = e2.mo18895d();
            int i = SubsamplingScaleImageView.ORIENTATION_270;
            if (d != null) {
                C5765n nVar = C5765n.ORIENTATION;
                if (d.containsKey(nVar)) {
                    i = (((Integer) d.get(nVar)).intValue() + SubsamplingScaleImageView.ORIENTATION_270) % 360;
                }
            }
            e2.mo18899h(C5765n.ORIENTATION, Integer.valueOf(i));
            C5766o[] e3 = e2.mo18896e();
            if (e3 != null) {
                int c = f.mo18872c();
                for (int i2 = 0; i2 < e3.length; i2++) {
                    e3[i2] = new C5766o((((float) c) - e3[i2].mo18902d()) - 1.0f, e3[i2].mo18901c());
                }
            }
            return e2;
        }
    }

    /* renamed from: c */
    public C5764m mo18888c(C5753c cVar) {
        return mo18887b(cVar, (Map) null);
    }

    /* renamed from: d */
    public abstract C5764m mo46487d(int i, C7507a aVar, Map map);
}
