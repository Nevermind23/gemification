package p060e1;

import android.view.View;

/* renamed from: e1.d1 */
abstract class C5898d1 extends C5971n1 {

    /* renamed from: c */
    private static boolean f18496c = true;

    C5898d1() {
    }

    /* renamed from: a */
    public void mo19257a(View view) {
    }

    /* renamed from: b */
    public float mo19258b(View view) {
        if (f18496c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f18496c = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo19259c(View view) {
    }

    /* renamed from: f */
    public void mo19260f(View view, float f) {
        if (f18496c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f18496c = false;
            }
        }
        view.setAlpha(f);
    }
}
