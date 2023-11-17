package p020b2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.C1109a;
import com.airbnb.lottie.C2311c;
import com.airbnb.lottie.C2325h;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import p033c2.C2224c;
import p048d2.C5807i;
import p048d2.C5808j;
import p061e2.C6013a;

/* renamed from: b2.t */
abstract class C2145t {

    /* renamed from: a */
    private static final Interpolator f6315a = new LinearInterpolator();

    /* renamed from: b */
    private static SparseArrayCompat f6316b;

    /* renamed from: c */
    static C2224c.C2225a f6317c = C2224c.C2225a.m8482a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    static C2224c.C2225a f6318d = C2224c.C2225a.m8482a("x", "y");

    /* renamed from: a */
    private static WeakReference m8239a(int i) {
        WeakReference weakReference;
        synchronized (C2145t.class) {
            weakReference = (WeakReference) m8245g().get(i);
        }
        return weakReference;
    }

    /* renamed from: b */
    private static Interpolator m8240b(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator interpolator;
        pointF.x = C5807i.m23363b(pointF.x, -1.0f, 1.0f);
        pointF.y = C5807i.m23363b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C5807i.m23363b(pointF2.x, -1.0f, 1.0f);
        float b = C5807i.m23363b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b;
        int i = C5808j.m23381i(pointF.x, pointF.y, pointF2.x, b);
        Interpolator interpolator2 = null;
        if (C2311c.m8886c()) {
            weakReference = null;
        } else {
            weakReference = m8239a(i);
        }
        if (weakReference != null) {
            interpolator2 = (Interpolator) weakReference.get();
        }
        if (weakReference == null || interpolator2 == null) {
            try {
                interpolator = C1109a.m4119a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator = C1109a.m4119a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, Utils.FLOAT_EPSILON), pointF2.y);
                } else {
                    interpolator = new LinearInterpolator();
                }
            }
            interpolator2 = interpolator;
            if (!C2311c.m8886c()) {
                try {
                    m8246h(i, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator2;
    }

    /* renamed from: c */
    static C6013a m8241c(C2224c cVar, C2325h hVar, float f, C2138n0 n0Var, boolean z, boolean z2) {
        if (z && z2) {
            return m8243e(hVar, cVar, f, n0Var);
        }
        if (z) {
            return m8242d(hVar, cVar, f, n0Var);
        }
        return m8244f(cVar, f, n0Var);
    }

    /* renamed from: d */
    private static C6013a m8242d(C2325h hVar, C2224c cVar, float f, C2138n0 n0Var) {
        Interpolator interpolator;
        Object obj;
        Interpolator interpolator2;
        cVar.mo7153n();
        PointF pointF = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (cVar.hasNext()) {
            switch (cVar.mo7160x(f6317c)) {
                case 0:
                    f2 = (float) cVar.mo7156s();
                    break;
                case 1:
                    obj3 = n0Var.mo7008a(cVar, f);
                    break;
                case 2:
                    obj2 = n0Var.mo7008a(cVar, f);
                    break;
                case 3:
                    pointF = C2143s.m8236e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = C2143s.m8236e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.mo7157t() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF2 = C2143s.m8236e(cVar, f);
                    break;
                case 7:
                    pointF3 = C2143s.m8236e(cVar, f);
                    break;
                default:
                    cVar.mo7148N();
                    break;
            }
        }
        cVar.mo7155q();
        if (z) {
            interpolator = f6315a;
            obj = obj3;
        } else {
            if (pointF == null || pointF4 == null) {
                interpolator2 = f6315a;
            } else {
                interpolator2 = m8240b(pointF, pointF4);
            }
            interpolator = interpolator2;
            obj = obj2;
        }
        C6013a aVar = new C6013a(hVar, obj3, obj, interpolator, f2, (Float) null);
        aVar.f18772o = pointF2;
        aVar.f18773p = pointF3;
        return aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        r14 = r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p061e2.C6013a m8243e(com.airbnb.lottie.C2325h r21, p033c2.C2224c r22, float r23, p020b2.C2138n0 r24) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r22.mo7153n()
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0016:
            boolean r17 = r22.hasNext()
            if (r17 == 0) goto L_0x01a8
            c2.c$a r4 = f6317c
            int r4 = r0.mo7160x(r4)
            r5 = 1
            switch(r4) {
                case 0: goto L_0x019b;
                case 1: goto L_0x0191;
                case 2: goto L_0x0187;
                case 3: goto L_0x00f3;
                case 4: goto L_0x0044;
                case 5: goto L_0x003a;
                case 6: goto L_0x0035;
                case 7: goto L_0x0030;
                default: goto L_0x0026;
            }
        L_0x0026:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo7148N()
            goto L_0x01a4
        L_0x0030:
            android.graphics.PointF r3 = p020b2.C2143s.m8236e(r22, r23)
            goto L_0x0016
        L_0x0035:
            android.graphics.PointF r15 = p020b2.C2143s.m8236e(r22, r23)
            goto L_0x0016
        L_0x003a:
            int r4 = r22.mo7157t()
            if (r4 != r5) goto L_0x0042
            r6 = r5
            goto L_0x0016
        L_0x0042:
            r6 = 0
            goto L_0x0016
        L_0x0044:
            c2.c$b r4 = r22.mo7158v()
            c2.c$b r5 = p033c2.C2224c.C2226b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x00e8
            r22.mo7153n()
            r4 = 0
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x0053:
            boolean r18 = r22.hasNext()
            if (r18 == 0) goto L_0x00d2
            r18 = r15
            c2.c$a r15 = f6318d
            int r15 = r0.mo7160x(r15)
            if (r15 == 0) goto L_0x00a5
            r19 = r3
            r3 = 1
            if (r15 == r3) goto L_0x0070
            r22.mo7148N()
        L_0x006b:
            r15 = r18
            r3 = r19
            goto L_0x0053
        L_0x0070:
            c2.c$b r3 = r22.mo7158v()
            c2.c$b r5 = p033c2.C2224c.C2226b.NUMBER
            if (r3 != r5) goto L_0x0081
            r3 = r14
            double r13 = r22.mo7156s()
            float r13 = (float) r13
            r14 = r3
            r5 = r13
            goto L_0x006b
        L_0x0081:
            r3 = r14
            r22.mo7152k()
            double r13 = r22.mo7156s()
            float r13 = (float) r13
            c2.c$b r14 = r22.mo7158v()
            if (r14 != r5) goto L_0x0096
            double r14 = r22.mo7156s()
            float r5 = (float) r14
            goto L_0x0097
        L_0x0096:
            r5 = r13
        L_0x0097:
            r22.mo7154o()
            r14 = r3
            r15 = r18
            r3 = r19
            r20 = r13
            r13 = r5
            r5 = r20
            goto L_0x0053
        L_0x00a5:
            r19 = r3
            r3 = r14
            c2.c$b r4 = r22.mo7158v()
            c2.c$b r12 = p033c2.C2224c.C2226b.NUMBER
            if (r4 != r12) goto L_0x00b8
            double r14 = r22.mo7156s()
            float r12 = (float) r14
            r14 = r3
            r4 = r12
            goto L_0x006b
        L_0x00b8:
            r22.mo7152k()
            double r14 = r22.mo7156s()
            float r4 = (float) r14
            c2.c$b r14 = r22.mo7158v()
            if (r14 != r12) goto L_0x00cc
            double r14 = r22.mo7156s()
            float r12 = (float) r14
            goto L_0x00cd
        L_0x00cc:
            r12 = r4
        L_0x00cd:
            r22.mo7154o()
            r14 = r3
            goto L_0x006b
        L_0x00d2:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r12, r13)
            r22.mo7155q()
            r13 = r4
            r12 = r14
            goto L_0x017d
        L_0x00e8:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r8 = p020b2.C2143s.m8236e(r22, r23)
            goto L_0x01a4
        L_0x00f3:
            r19 = r3
            r3 = r14
            r18 = r15
            c2.c$b r4 = r22.mo7158v()
            c2.c$b r5 = p033c2.C2224c.C2226b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x017f
            r22.mo7153n()
            r4 = 0
            r5 = 0
            r9 = 0
            r11 = 0
        L_0x0107:
            boolean r14 = r22.hasNext()
            if (r14 == 0) goto L_0x016c
            c2.c$a r14 = f6318d
            int r14 = r0.mo7160x(r14)
            if (r14 == 0) goto L_0x0144
            r15 = 1
            if (r14 == r15) goto L_0x011c
            r22.mo7148N()
            goto L_0x0107
        L_0x011c:
            c2.c$b r5 = r22.mo7158v()
            c2.c$b r11 = p033c2.C2224c.C2226b.NUMBER
            if (r5 != r11) goto L_0x012b
            double r14 = r22.mo7156s()
            float r11 = (float) r14
            r5 = r11
            goto L_0x0107
        L_0x012b:
            r22.mo7152k()
            double r14 = r22.mo7156s()
            float r5 = (float) r14
            c2.c$b r14 = r22.mo7158v()
            if (r14 != r11) goto L_0x013f
            double r14 = r22.mo7156s()
            float r11 = (float) r14
            goto L_0x0140
        L_0x013f:
            r11 = r5
        L_0x0140:
            r22.mo7154o()
            goto L_0x0107
        L_0x0144:
            c2.c$b r4 = r22.mo7158v()
            c2.c$b r9 = p033c2.C2224c.C2226b.NUMBER
            if (r4 != r9) goto L_0x0153
            double r14 = r22.mo7156s()
            float r9 = (float) r14
            r4 = r9
            goto L_0x0107
        L_0x0153:
            r22.mo7152k()
            double r14 = r22.mo7156s()
            float r4 = (float) r14
            c2.c$b r14 = r22.mo7158v()
            if (r14 != r9) goto L_0x0167
            double r14 = r22.mo7156s()
            float r9 = (float) r14
            goto L_0x0168
        L_0x0167:
            r9 = r4
        L_0x0168:
            r22.mo7154o()
            goto L_0x0107
        L_0x016c:
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r22.mo7155q()
            r11 = r4
            r9 = r14
            r15 = r18
        L_0x017d:
            r14 = r3
            goto L_0x01a4
        L_0x017f:
            android.graphics.PointF r7 = p020b2.C2143s.m8236e(r22, r23)
            r14 = r3
            r15 = r18
            goto L_0x01a4
        L_0x0187:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r16 = r2.mo7008a(r0, r1)
            goto L_0x01a4
        L_0x0191:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r10 = r2.mo7008a(r0, r1)
            goto L_0x01a4
        L_0x019b:
            r19 = r3
            r18 = r15
            double r3 = r22.mo7156s()
            float r14 = (float) r3
        L_0x01a4:
            r3 = r19
            goto L_0x0016
        L_0x01a8:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo7155q()
            if (r6 == 0) goto L_0x01b8
            android.view.animation.Interpolator r0 = f6315a
            r11 = r10
        L_0x01b5:
            r12 = 0
            r13 = 0
            goto L_0x01dc
        L_0x01b8:
            if (r7 == 0) goto L_0x01c1
            if (r8 == 0) goto L_0x01c1
            android.view.animation.Interpolator r0 = m8240b(r7, r8)
            goto L_0x01d9
        L_0x01c1:
            if (r9 == 0) goto L_0x01d7
            if (r11 == 0) goto L_0x01d7
            if (r12 == 0) goto L_0x01d7
            if (r13 == 0) goto L_0x01d7
            android.view.animation.Interpolator r0 = m8240b(r9, r12)
            android.view.animation.Interpolator r1 = m8240b(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01dc
        L_0x01d7:
            android.view.animation.Interpolator r0 = f6315a
        L_0x01d9:
            r11 = r16
            goto L_0x01b5
        L_0x01dc:
            if (r12 == 0) goto L_0x01ed
            if (r13 == 0) goto L_0x01ed
            e2.a r0 = new e2.a
            r15 = 0
            r8 = r0
            r9 = r21
            r14 = r3
            r1 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01fb
        L_0x01ed:
            r1 = r18
            e2.a r2 = new e2.a
            r14 = 0
            r8 = r2
            r9 = r21
            r12 = r0
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r2
        L_0x01fb:
            r0.f18772o = r1
            r3 = r19
            r0.f18773p = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p020b2.C2145t.m8243e(com.airbnb.lottie.h, c2.c, float, b2.n0):e2.a");
    }

    /* renamed from: f */
    private static C6013a m8244f(C2224c cVar, float f, C2138n0 n0Var) {
        return new C6013a(n0Var.mo7008a(cVar, f));
    }

    /* renamed from: g */
    private static SparseArrayCompat m8245g() {
        if (f6316b == null) {
            f6316b = new SparseArrayCompat();
        }
        return f6316b;
    }

    /* renamed from: h */
    private static void m8246h(int i, WeakReference weakReference) {
        synchronized (C2145t.class) {
            f6316b.put(i, weakReference);
        }
    }
}
