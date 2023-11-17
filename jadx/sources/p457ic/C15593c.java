package p457ic;

import com.google.zxing.C5754d;
import com.google.zxing.C5766o;
import com.google.zxing.C5767p;
import com.google.zxing.NotFoundException;
import java.util.Map;
import p200ob.C7508b;
import p200ob.C7513g;
import p200ob.C7515i;
import p200ob.C7517k;
import p213pb.C7798a;

/* renamed from: ic.c */
public class C15593c {

    /* renamed from: a */
    private final C7508b f44288a;

    /* renamed from: b */
    private C5767p f44289b;

    public C15593c(C7508b bVar) {
        this.f44288a = bVar;
    }

    /* renamed from: b */
    private float m56303b(C5766o oVar, C5766o oVar2) {
        float j = m56308j((int) oVar.mo18901c(), (int) oVar.mo18902d(), (int) oVar2.mo18901c(), (int) oVar2.mo18902d());
        float j2 = m56308j((int) oVar2.mo18901c(), (int) oVar2.mo18902d(), (int) oVar.mo18901c(), (int) oVar.mo18902d());
        if (Float.isNaN(j)) {
            return j2 / 7.0f;
        }
        if (Float.isNaN(j2)) {
            return j / 7.0f;
        }
        return (j + j2) / 14.0f;
    }

    /* renamed from: c */
    private static int m56304c(C5766o oVar, C5766o oVar2, C5766o oVar3, float f) {
        int c = ((C7798a.m29509c(C5766o.m23203b(oVar, oVar2) / f) + C7798a.m29509c(C5766o.m23203b(oVar, oVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw NotFoundException.m23155a();
    }

    /* renamed from: d */
    private static C7517k m56305d(C5766o oVar, C5766o oVar2, C5766o oVar3, C5766o oVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (oVar4 != null) {
            f2 = oVar4.mo18901c();
            f = oVar4.mo18902d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (oVar2.mo18901c() - oVar.mo18901c()) + oVar3.mo18901c();
            f = (oVar2.mo18902d() - oVar.mo18902d()) + oVar3.mo18902d();
            f3 = f4;
        }
        return C7517k.m28590b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, oVar.mo18901c(), oVar.mo18902d(), oVar2.mo18901c(), oVar2.mo18902d(), f2, f, oVar3.mo18901c(), oVar3.mo18902d());
    }

    /* renamed from: h */
    private static C7508b m56306h(C7508b bVar, C7517k kVar, int i) {
        return C7515i.m28581b().mo22008d(bVar, i, i, kVar);
    }

    /* renamed from: i */
    private float m56307i(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        C15593c cVar;
        boolean z3;
        boolean z4 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i16 = 2;
        int i17 = (-abs) / 2;
        int i18 = -1;
        if (i8 < i6) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i7 < i5) {
            i18 = 1;
        }
        int i19 = i6 + i9;
        int i22 = i8;
        int i23 = i7;
        int i24 = 0;
        while (true) {
            if (i22 == i19) {
                i12 = i19;
                i13 = i16;
                break;
            }
            if (z) {
                i14 = i23;
            } else {
                i14 = i22;
            }
            if (z) {
                i15 = i22;
            } else {
                i15 = i23;
            }
            if (i24 == z4) {
                z2 = z;
                z3 = z4;
                i12 = i19;
                cVar = this;
            } else {
                cVar = this;
                z2 = z;
                i12 = i19;
                z3 = false;
            }
            if (z3 == cVar.f44288a.mo21974e(i14, i15)) {
                if (i24 == 2) {
                    return C7798a.m29508b(i22, i23, i8, i7);
                }
                i24++;
            }
            i17 += abs2;
            if (i17 > 0) {
                if (i23 == i5) {
                    i13 = 2;
                    break;
                }
                i23 += i18;
                i17 -= abs;
            }
            i22 += i9;
            i19 = i12;
            z = z2;
            z4 = true;
            i16 = 2;
        }
        if (i24 == i13) {
            return C7798a.m29508b(i12, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    private float m56308j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m56307i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f44288a.mo21982l()) {
            f = ((float) ((this.f44288a.mo21982l() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f44288a.mo21982l() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f44288a.mo21978h()) {
            f2 = ((float) ((this.f44288a.mo21978h() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f44288a.mo21978h() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m56307i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo42853a(C5766o oVar, C5766o oVar2, C5766o oVar3) {
        return (m56303b(oVar, oVar2) + m56303b(oVar, oVar3)) / 2.0f;
    }

    /* renamed from: e */
    public final C7513g mo42854e(Map map) {
        C5767p pVar;
        if (map == null) {
            pVar = null;
        } else {
            pVar = (C5767p) map.get(C5754d.NEED_RESULT_POINT_CALLBACK);
        }
        this.f44289b = pVar;
        return mo42856g(new C15595e(this.f44288a, this.f44289b).mo42861g(map));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C15591a mo42855f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f44288a.mo21982l() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f44288a.mo21978h() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C15592b(this.f44288a, max, max2, min, min2, f, this.f44289b).mo42852c();
            }
            throw NotFoundException.m23155a();
        }
        throw NotFoundException.m23155a();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008d  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p200ob.C7513g mo42856g(p457ic.C15598f r11) {
        /*
            r10 = this;
            ic.d r0 = r11.mo42866b()
            ic.d r1 = r11.mo42867c()
            ic.d r11 = r11.mo42865a()
            float r2 = r10.mo42853a(r0, r1, r11)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 < 0) goto L_0x009e
            int r4 = m56304c(r0, r1, r11, r2)
            hc.j r5 = p443hc.C15480j.m55989g(r4)
            int r6 = r5.mo42569e()
            int r6 = r6 + -7
            int[] r5 = r5.mo42568d()
            int r5 = r5.length
            r7 = 4
            if (r5 <= 0) goto L_0x0073
            float r5 = r1.mo18901c()
            float r8 = r0.mo18901c()
            float r5 = r5 - r8
            float r8 = r11.mo18901c()
            float r5 = r5 + r8
            float r8 = r1.mo18902d()
            float r9 = r0.mo18902d()
            float r8 = r8 - r9
            float r9 = r11.mo18902d()
            float r8 = r8 + r9
            r9 = 1077936128(0x40400000, float:3.0)
            float r6 = (float) r6
            float r9 = r9 / r6
            float r3 = r3 - r9
            float r6 = r0.mo18901c()
            float r9 = r0.mo18901c()
            float r5 = r5 - r9
            float r5 = r5 * r3
            float r6 = r6 + r5
            int r5 = (int) r6
            float r6 = r0.mo18902d()
            float r9 = r0.mo18902d()
            float r8 = r8 - r9
            float r3 = r3 * r8
            float r6 = r6 + r3
            int r3 = (int) r6
            r6 = r7
        L_0x0066:
            r8 = 16
            if (r6 > r8) goto L_0x0073
            float r8 = (float) r6
            ic.a r2 = r10.mo42855f(r2, r5, r3, r8)     // Catch:{ NotFoundException -> 0x0070 }
            goto L_0x0074
        L_0x0070:
            int r6 = r6 << 1
            goto L_0x0066
        L_0x0073:
            r2 = 0
        L_0x0074:
            ob.k r3 = m56305d(r0, r1, r11, r2, r4)
            ob.b r5 = r10.f44288a
            ob.b r3 = m56306h(r5, r3, r4)
            r4 = 3
            r5 = 2
            r6 = 0
            r8 = 1
            if (r2 != 0) goto L_0x008d
            com.google.zxing.o[] r2 = new com.google.zxing.C5766o[r4]
            r2[r6] = r11
            r2[r8] = r0
            r2[r5] = r1
            goto L_0x0098
        L_0x008d:
            com.google.zxing.o[] r7 = new com.google.zxing.C5766o[r7]
            r7[r6] = r11
            r7[r8] = r0
            r7[r5] = r1
            r7[r4] = r2
            r2 = r7
        L_0x0098:
            ob.g r11 = new ob.g
            r11.<init>(r3, r2)
            return r11
        L_0x009e:
            com.google.zxing.NotFoundException r11 = com.google.zxing.NotFoundException.m23155a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p457ic.C15593c.mo42856g(ic.f):ob.g");
    }
}
