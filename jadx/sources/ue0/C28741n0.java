package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ue0.n0 */
public final class C28741n0 implements C6201a {

    /* renamed from: d */
    private final SwipeRefreshLayout f73394d;

    /* renamed from: e */
    public final ActionSheetTitle f73395e;

    /* renamed from: f */
    public final Button f73396f;

    /* renamed from: g */
    public final PageDescriptionView f73397g;

    /* renamed from: h */
    public final RecyclerView f73398h;

    /* renamed from: i */
    public final SwipeRefreshLayout f73399i;

    private C28741n0(SwipeRefreshLayout swipeRefreshLayout, ActionSheetTitle actionSheetTitle, Button button, PageDescriptionView pageDescriptionView, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.f73394d = swipeRefreshLayout;
        this.f73395e = actionSheetTitle;
        this.f73396f = button;
        this.f73397g = pageDescriptionView;
        this.f73398h = recyclerView;
        this.f73399i = swipeRefreshLayout2;
    }

    /* renamed from: a */
    public static C28741n0 m88089a(View view) {
        int i = C25187g.f64707l;
        ActionSheetTitle actionSheetTitle = (ActionSheetTitle) C6202b.m24689a(view, i);
        if (actionSheetTitle != null) {
            i = C25187g.button_new_watchlist;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C25187g.f64675I2;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C25187g.f64706k3;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                        return new C28741n0(swipeRefreshLayout, actionSheetTitle, button, pageDescriptionView, recyclerView, swipeRefreshLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28741n0 m88090d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.fragment_gt_watchlist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88089a(inflate);
    }

    /* renamed from: c */
    public SwipeRefreshLayout mo3946b() {
        return this.f73394d;
    }
}
