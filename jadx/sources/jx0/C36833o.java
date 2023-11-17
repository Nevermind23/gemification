package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fx0.C32025e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.categorycard.CategoryCardView;

/* renamed from: jx0.o */
public final class C36833o implements C6201a {

    /* renamed from: d */
    private final CategoryCardView f88889d;

    /* renamed from: e */
    public final CategoryCardView f88890e;

    private C36833o(CategoryCardView categoryCardView, CategoryCardView categoryCardView2) {
        this.f88889d = categoryCardView;
        this.f88890e = categoryCardView2;
    }

    /* renamed from: a */
    public static C36833o m109144a(View view) {
        if (view != null) {
            CategoryCardView categoryCardView = (CategoryCardView) view;
            return new C36833o(categoryCardView, categoryCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36833o m109145d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_categories_popular_child, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109144a(inflate);
    }

    /* renamed from: c */
    public CategoryCardView mo3946b() {
        return this.f88889d;
    }
}
