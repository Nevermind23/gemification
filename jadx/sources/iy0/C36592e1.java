package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: iy0.e1 */
public final class C36592e1 implements C6201a {

    /* renamed from: d */
    private final PageDescriptionView f88181d;

    private C36592e1(PageDescriptionView pageDescriptionView) {
        this.f88181d = pageDescriptionView;
    }

    /* renamed from: a */
    public static C36592e1 m108494a(View view) {
        if (view != null) {
            return new C36592e1((PageDescriptionView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36592e1 m108495d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_card_insurance_overall_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108494a(inflate);
    }

    /* renamed from: c */
    public PageDescriptionView mo3946b() {
        return this.f88181d;
    }
}
