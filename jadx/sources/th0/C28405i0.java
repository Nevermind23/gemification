package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: th0.i0 */
public final class C28405i0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72063d;

    /* renamed from: e */
    public final LinearLayout f72064e;

    /* renamed from: f */
    public final PageDescriptionView f72065f;

    private C28405i0(LinearLayout linearLayout, LinearLayout linearLayout2, PageDescriptionView pageDescriptionView) {
        this.f72063d = linearLayout;
        this.f72064e = linearLayout2;
        this.f72065f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28405i0 m87141a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C27010e.empty_transactions_page_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            return new C28405i0(linearLayout, linearLayout, pageDescriptionView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28405i0 m87142d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_incorrect_id, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87141a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72063d;
    }
}
