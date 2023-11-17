package il0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import el0.C20265c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: il0.g */
public final class C25230g implements C6201a {

    /* renamed from: d */
    private final PageDescriptionView f64810d;

    /* renamed from: e */
    public final PageDescriptionView f64811e;

    private C25230g(PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2) {
        this.f64810d = pageDescriptionView;
        this.f64811e = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C25230g m80317a(View view) {
        if (view != null) {
            PageDescriptionView pageDescriptionView = (PageDescriptionView) view;
            return new C25230g(pageDescriptionView, pageDescriptionView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C25230g m80318d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C20265c.item_insurance_products_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80317a(inflate);
    }

    /* renamed from: c */
    public PageDescriptionView mo3946b() {
        return this.f64810d;
    }
}
