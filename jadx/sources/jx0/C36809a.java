package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: jx0.a */
public final class C36809a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88791d;

    /* renamed from: e */
    public final PageDescriptionView f88792e;

    /* renamed from: f */
    public final RecyclerView f88793f;

    /* renamed from: g */
    public final PageDescriptionView f88794g;

    /* renamed from: h */
    public final LinearLayout f88795h;

    /* renamed from: i */
    public final Button f88796i;

    private C36809a(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, RecyclerView recyclerView, PageDescriptionView pageDescriptionView2, LinearLayout linearLayout2, Button button) {
        this.f88791d = linearLayout;
        this.f88792e = pageDescriptionView;
        this.f88793f = recyclerView;
        this.f88794g = pageDescriptionView2;
        this.f88795h = linearLayout2;
        this.f88796i = button;
    }

    /* renamed from: a */
    public static C36809a m109048a(View view) {
        int i = C32024d.card_not_selected_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C32024d.f78848l;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C32024d.no_card_description;
                PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView2 != null) {
                    i = C32024d.no_card_view;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        i = C32024d.f78838M;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            return new C36809a((LinearLayout) view, pageDescriptionView, recyclerView, pageDescriptionView2, linearLayout, button);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36809a m109049d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.action_sheet_payment_form_select_cards, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109048a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88791d;
    }
}
