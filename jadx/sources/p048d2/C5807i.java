package p048d2;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p255t1.C8319k;
import p294w1.C8733a;
import p294w1.C8738e;
import p319y1.C9025n;

/* renamed from: d2.i */
public abstract class C5807i {

    /* renamed from: a */
    private static final PointF f18292a = new PointF();

    /* renamed from: a */
    public static PointF m23362a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: b */
    public static float m23363b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static int m23364c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    /* renamed from: d */
    public static boolean m23365d(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: e */
    private static int m23366e(int i, int i2) {
        boolean z;
        int i3 = i / i2;
        if ((i ^ i2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        int i4 = i % i2;
        if (z || i4 == 0) {
            return i3;
        }
        return i3 - 1;
    }

    /* renamed from: f */
    static int m23367f(float f, float f2) {
        return m23368g((int) f, (int) f2);
    }

    /* renamed from: g */
    private static int m23368g(int i, int i2) {
        return i - (i2 * m23366e(i, i2));
    }

    /* renamed from: h */
    public static void m23369h(C9025n nVar, Path path) {
        path.reset();
        PointF b = nVar.mo24480b();
        path.moveTo(b.x, b.y);
        f18292a.set(b.x, b.y);
        for (int i = 0; i < nVar.mo24479a().size(); i++) {
            C8733a aVar = (C8733a) nVar.mo24479a().get(i);
            PointF a = aVar.mo24118a();
            PointF b2 = aVar.mo24119b();
            PointF c = aVar.mo24120c();
            PointF pointF = f18292a;
            if (!a.equals(pointF) || !b2.equals(c)) {
                path.cubicTo(a.x, a.y, b2.x, b2.y, c.x, c.y);
            } else {
                path.lineTo(c.x, c.y);
            }
            pointF.set(c.x, c.y);
        }
        if (nVar.mo24482d()) {
            path.close();
        }
    }

    /* renamed from: i */
    public static float m23370i(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: j */
    public static int m23371j(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: k */
    public static void m23372k(C8738e eVar, int i, List list, C8738e eVar2, C8319k kVar) {
        if (eVar.mo24136c(kVar.getName(), i)) {
            list.add(eVar2.mo24135a(kVar.getName()).mo24143i(kVar));
        }
    }
}
