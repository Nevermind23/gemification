package p223q8;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C5089m;

/* renamed from: q8.h */
public abstract class C7926h {
    /* renamed from: a */
    static C7919d m29966a(int i) {
        if (i == 0) {
            return new C7928j();
        }
        if (i != 1) {
            return m29967b();
        }
        return new C7920e();
    }

    /* renamed from: b */
    static C7919d m29967b() {
        return new C7928j();
    }

    /* renamed from: c */
    static C7921f m29968c() {
        return new C7921f();
    }

    /* renamed from: d */
    public static void m29969d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C7922g) {
            ((C7922g) background).mo22940W(f);
        }
    }

    /* renamed from: e */
    public static void m29970e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C7922g) {
            m29971f(view, (C7922g) background);
        }
    }

    /* renamed from: f */
    public static void m29971f(View view, C7922g gVar) {
        if (gVar.mo22935O()) {
            gVar.mo22944a0(C5089m.m19903d(view));
        }
    }
}
