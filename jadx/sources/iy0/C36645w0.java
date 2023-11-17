package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.mobilebank.products.presentation.details.view.AccordionView;

/* renamed from: iy0.w0 */
public final class C36645w0 implements C6201a {

    /* renamed from: d */
    private final AccordionView f88448d;

    /* renamed from: e */
    public final AccordionView f88449e;

    private C36645w0(AccordionView accordionView, AccordionView accordionView2) {
        this.f88448d = accordionView;
        this.f88449e = accordionView2;
    }

    /* renamed from: a */
    public static C36645w0 m108715a(View view) {
        if (view != null) {
            AccordionView accordionView = (AccordionView) view;
            return new C36645w0(accordionView, accordionView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36645w0 m108716d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_overdraft, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108715a(inflate);
    }

    /* renamed from: c */
    public AccordionView mo3946b() {
        return this.f88448d;
    }
}
