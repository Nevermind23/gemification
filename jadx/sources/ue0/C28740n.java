package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ue0.n */
public final class C28740n implements C6201a {

    /* renamed from: d */
    private final FrameLayout f73388d;

    /* renamed from: e */
    public final ListItem f73389e;

    /* renamed from: f */
    public final ListItem f73390f;

    /* renamed from: g */
    public final ListItem f73391g;

    /* renamed from: h */
    public final ProgressBar f73392h;

    /* renamed from: i */
    public final PageDescriptionView f73393i;

    private C28740n(FrameLayout frameLayout, ListItem listItem, ListItem listItem2, ListItem listItem3, ProgressBar progressBar, PageDescriptionView pageDescriptionView) {
        this.f73388d = frameLayout;
        this.f73389e = listItem;
        this.f73390f = listItem2;
        this.f73391g = listItem3;
        this.f73392h = progressBar;
        this.f73393i = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28740n m88085a(View view) {
        int i = C25187g.button_id_card;
        ListItem listItem = (ListItem) C6202b.m24689a(view, i);
        if (listItem != null) {
            i = C25187g.button_passport;
            ListItem listItem2 = (ListItem) C6202b.m24689a(view, i);
            if (listItem2 != null) {
                i = C25187g.button_residence;
                ListItem listItem3 = (ListItem) C6202b.m24689a(view, i);
                if (listItem3 != null) {
                    i = C25187g.f64710m2;
                    ProgressBar progressBar = (ProgressBar) C6202b.m24689a(view, i);
                    if (progressBar != null) {
                        i = C25187g.pageDesc;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            return new C28740n((FrameLayout) view, listItem, listItem2, listItem3, progressBar, pageDescriptionView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28740n m88086d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_identomat_type_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88085a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f73388d;
    }
}
