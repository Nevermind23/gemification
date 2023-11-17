package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import p026b8.C2170a;

/* renamed from: com.google.android.material.tabs.b */
class C5159b extends C5160c {
    C5159b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16988d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF a = C5160c.m20232a(tabLayout, view);
        if (i < 0) {
            f2 = C2170a.m8291b(1.0f, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0.5f, f);
        } else {
            f2 = C2170a.m8291b(Utils.FLOAT_EPSILON, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (f2 * 255.0f));
    }
}
