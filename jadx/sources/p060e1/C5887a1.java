package p060e1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: e1.a1 */
abstract class C5887a1 {

    /* renamed from: a */
    private static final C5971n1 f18478a;

    /* renamed from: b */
    static final Property f18479b = new C5888a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property f18480c = new C5889b(Rect.class, "clipBounds");

    /* renamed from: e1.a1$a */
    class C5888a extends Property {
        C5888a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C5887a1.m23686c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C5887a1.m23691h(view, f.floatValue());
        }
    }

    /* renamed from: e1.a1$b */
    class C5889b extends Property {
        C5889b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return ViewCompat.m3624u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            ViewCompat.m3633y0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f18478a = new C5964m1();
        } else {
            f18478a = new C5961l1();
        }
    }

    /* renamed from: a */
    static void m23684a(View view) {
        f18478a.mo19257a(view);
    }

    /* renamed from: b */
    static C6012z0 m23685b(View view) {
        return new C6010y0(view);
    }

    /* renamed from: c */
    static float m23686c(View view) {
        return f18478a.mo19258b(view);
    }

    /* renamed from: d */
    static C5993r1 m23687d(View view) {
        return new C5990q1(view);
    }

    /* renamed from: e */
    static void m23688e(View view) {
        f18478a.mo19259c(view);
    }

    /* renamed from: f */
    static void m23689f(View view, Matrix matrix) {
        f18478a.mo19304d(view, matrix);
    }

    /* renamed from: g */
    static void m23690g(View view, int i, int i2, int i3, int i4) {
        f18478a.mo19370e(view, i, i2, i3, i4);
    }

    /* renamed from: h */
    static void m23691h(View view, float f) {
        f18478a.mo19260f(view, f);
    }

    /* renamed from: i */
    static void m23692i(View view, int i) {
        f18478a.mo19392g(view, i);
    }

    /* renamed from: j */
    static void m23693j(View view, Matrix matrix) {
        f18478a.mo19305h(view, matrix);
    }

    /* renamed from: k */
    static void m23694k(View view, Matrix matrix) {
        f18478a.mo19306i(view, matrix);
    }
}
