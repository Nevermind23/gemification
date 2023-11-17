package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.mobilebank.products.presentation.details.view.AccordionView;

/* renamed from: iy0.y0 */
public final class C36651y0 implements C6201a {

    /* renamed from: d */
    private final AccordionView f88463d;

    /* renamed from: e */
    public final AccordionView f88464e;

    private C36651y0(AccordionView accordionView, AccordionView accordionView2) {
        this.f88463d = accordionView;
        this.f88464e = accordionView2;
    }

    /* renamed from: a */
    public static C36651y0 m108739a(View view) {
        if (view != null) {
            AccordionView accordionView = (AccordionView) view;
            return new C36651y0(accordionView, accordionView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36651y0 m108740d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_stud_dep_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108739a(inflate);
    }

    /* renamed from: c */
    public AccordionView mo3946b() {
        return this.f88463d;
    }
}
