package com.alexandrius.accordionswipelayout.library;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.C0836a;

/* renamed from: com.alexandrius.accordionswipelayout.library.b */
abstract class C2365b {
    /* renamed from: a */
    static float m9137a(View view) {
        return ((LinearLayout.LayoutParams) view.getLayoutParams()).weight;
    }

    /* renamed from: b */
    static Drawable m9138b(Drawable drawable, int i) {
        Drawable r = C0836a.m3156r(drawable);
        C0836a.m3152n(r, i);
        return r.mutate();
    }

    /* renamed from: c */
    static void m9139c(View view, float f) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.weight = f;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    static void m9140d(View view, int i) {
        view.getLayoutParams().width = i;
        view.requestLayout();
    }
}
