package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C5089m;
import com.google.android.material.tabs.TabLayout;
import p026b8.C2170a;

/* renamed from: com.google.android.material.tabs.c */
class C5160c {
    C5160c() {
    }

    /* renamed from: a */
    static RectF m20232a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.C5155i)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        return m20233b((TabLayout.C5155i) view, 24);
    }

    /* renamed from: b */
    static RectF m20233b(TabLayout.C5155i iVar, int i) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int b = (int) C5089m.m19901b(iVar.getContext(), i);
        if (contentWidth < b) {
            contentWidth = b;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF((float) (left - i2), (float) (top - (contentHeight / 2)), (float) (i2 + left), (float) (top + (left / 2)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16989c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF a = m20232a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo16988d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF a = m20232a(tabLayout, view);
        RectF a2 = m20232a(tabLayout, view2);
        drawable.setBounds(C2170a.m8292c((int) a.left, (int) a2.left, f), drawable.getBounds().top, C2170a.m8292c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }
}
