package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.categorycard.CategoryCardView;
import sn0.C17902f;

/* renamed from: xn0.q */
public final class C18859q implements C6201a {

    /* renamed from: d */
    private final CategoryCardView f52771d;

    /* renamed from: e */
    public final CategoryCardView f52772e;

    private C18859q(CategoryCardView categoryCardView, CategoryCardView categoryCardView2) {
        this.f52771d = categoryCardView;
        this.f52772e = categoryCardView2;
    }

    /* renamed from: a */
    public static C18859q m63806a(View view) {
        if (view != null) {
            CategoryCardView categoryCardView = (CategoryCardView) view;
            return new C18859q(categoryCardView, categoryCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C18859q m63807d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.list_item_progress_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63806a(inflate);
    }

    /* renamed from: c */
    public CategoryCardView mo3946b() {
        return this.f52771d;
    }
}
