package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ev0.u */
public final class C31840u implements C6201a {

    /* renamed from: d */
    private final PageDescriptionView f78543d;

    /* renamed from: e */
    public final PageDescriptionView f78544e;

    private C31840u(PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2) {
        this.f78543d = pageDescriptionView;
        this.f78544e = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C31840u m94149a(View view) {
        if (view != null) {
            PageDescriptionView pageDescriptionView = (PageDescriptionView) view;
            return new C31840u(pageDescriptionView, pageDescriptionView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31840u m94150d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_open_bank_accounts_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94149a(inflate);
    }

    /* renamed from: c */
    public PageDescriptionView mo3946b() {
        return this.f78543d;
    }
}
