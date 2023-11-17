package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p026b8.C2170a;

/* renamed from: com.google.android.material.tabs.a */
class C5158a extends C5160c {
    C5158a() {
    }

    /* renamed from: e */
    private static float m20228e(float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m20229f(float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16988d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        boolean z;
        float f2;
        float f3;
        RectF a = C5160c.m20232a(tabLayout, view);
        RectF a2 = C5160c.m20232a(tabLayout, view2);
        if (a.left < a2.left) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = m20228e(f);
            f2 = m20229f(f);
        } else {
            f3 = m20229f(f);
            f2 = m20228e(f);
        }
        drawable.setBounds(C2170a.m8292c((int) a.left, (int) a2.left, f3), drawable.getBounds().top, C2170a.m8292c((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
