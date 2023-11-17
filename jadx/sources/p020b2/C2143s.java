package p020b2;

import android.graphics.Color;
import android.graphics.PointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p033c2.C2224c;

/* renamed from: b2.s */
abstract class C2143s {

    /* renamed from: a */
    private static final C2224c.C2225a f6313a = C2224c.C2225a.m8482a("x", "y");

    /* renamed from: b2.s$a */
    static /* synthetic */ class C2144a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6314a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                c2.c$b[] r0 = p033c2.C2224c.C2226b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6314a = r0
                c2.c$b r1 = p033c2.C2224c.C2226b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6314a     // Catch:{ NoSuchFieldError -> 0x001d }
                c2.c$b r1 = p033c2.C2224c.C2226b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6314a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c2.c$b r1 = p033c2.C2224c.C2226b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p020b2.C2143s.C2144a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static PointF m8232a(C2224c cVar, float f) {
        cVar.mo7152k();
        float s = (float) cVar.mo7156s();
        float s2 = (float) cVar.mo7156s();
        while (cVar.mo7158v() != C2224c.C2226b.END_ARRAY) {
            cVar.mo7148N();
        }
        cVar.mo7154o();
        return new PointF(s * f, s2 * f);
    }

    /* renamed from: b */
    private static PointF m8233b(C2224c cVar, float f) {
        float s = (float) cVar.mo7156s();
        float s2 = (float) cVar.mo7156s();
        while (cVar.hasNext()) {
            cVar.mo7148N();
        }
        return new PointF(s * f, s2 * f);
    }

    /* renamed from: c */
    private static PointF m8234c(C2224c cVar, float f) {
        cVar.mo7153n();
        float f2 = Utils.FLOAT_EPSILON;
        float f3 = 0.0f;
        while (cVar.hasNext()) {
            int x = cVar.mo7160x(f6313a);
            if (x == 0) {
                f2 = m8238g(cVar);
            } else if (x != 1) {
                cVar.mo7161y();
                cVar.mo7148N();
            } else {
                f3 = m8238g(cVar);
            }
        }
        cVar.mo7155q();
        return new PointF(f2 * f, f3 * f);
    }

    /* renamed from: d */
    static int m8235d(C2224c cVar) {
        cVar.mo7152k();
        int s = (int) (cVar.mo7156s() * 255.0d);
        int s2 = (int) (cVar.mo7156s() * 255.0d);
        int s3 = (int) (cVar.mo7156s() * 255.0d);
        while (cVar.hasNext()) {
            cVar.mo7148N();
        }
        cVar.mo7154o();
        return Color.argb(C11051p3.f31759c, s, s2, s3);
    }

    /* renamed from: e */
    static PointF m8236e(C2224c cVar, float f) {
        int i = C2144a.f6314a[cVar.mo7158v().ordinal()];
        if (i == 1) {
            return m8233b(cVar, f);
        }
        if (i == 2) {
            return m8232a(cVar, f);
        }
        if (i == 3) {
            return m8234c(cVar, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.mo7158v());
    }

    /* renamed from: f */
    static List m8237f(C2224c cVar, float f) {
        ArrayList arrayList = new ArrayList();
        cVar.mo7152k();
        while (cVar.mo7158v() == C2224c.C2226b.BEGIN_ARRAY) {
            cVar.mo7152k();
            arrayList.add(m8236e(cVar, f));
            cVar.mo7154o();
        }
        cVar.mo7154o();
        return arrayList;
    }

    /* renamed from: g */
    static float m8238g(C2224c cVar) {
        C2224c.C2226b v = cVar.mo7158v();
        int i = C2144a.f6314a[v.ordinal()];
        if (i == 1) {
            return (float) cVar.mo7156s();
        }
        if (i == 2) {
            cVar.mo7152k();
            float s = (float) cVar.mo7156s();
            while (cVar.hasNext()) {
                cVar.mo7148N();
            }
            cVar.mo7154o();
            return s;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + v);
    }
}
