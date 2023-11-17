package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fx0.C32025e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: jx0.i */
public final class C36825i implements C6201a {

    /* renamed from: d */
    private final PageDescriptionView f88866d;

    /* renamed from: e */
    public final PageDescriptionView f88867e;

    private C36825i(PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2) {
        this.f88866d = pageDescriptionView;
        this.f88867e = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C36825i m109112a(View view) {
        if (view != null) {
            PageDescriptionView pageDescriptionView = (PageDescriptionView) view;
            return new C36825i(pageDescriptionView, pageDescriptionView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36825i m109113d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_categories_empty_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109112a(inflate);
    }

    /* renamed from: c */
    public PageDescriptionView mo3946b() {
        return this.f88866d;
    }
}
