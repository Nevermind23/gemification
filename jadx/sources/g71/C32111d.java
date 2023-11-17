package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: g71.d */
public final class C32111d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f78971d;

    /* renamed from: e */
    public final RecyclerView f78972e;

    /* renamed from: f */
    public final PageDescriptionView f78973f;

    private C32111d(LinearLayout linearLayout, RecyclerView recyclerView, PageDescriptionView pageDescriptionView) {
        this.f78971d = linearLayout;
        this.f78972e = recyclerView;
        this.f78973f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C32111d m94577a(View view) {
        int i = C31284d.tc_cards_recycler_view;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C31284d.tc_choose_card_description;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C32111d((LinearLayout) view, recyclerView, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32111d m94578d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.dialog_choose_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94577a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f78971d;
    }
}
