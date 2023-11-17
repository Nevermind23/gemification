package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: iy0.r */
public final class C36629r implements C6201a {

    /* renamed from: d */
    private final StateView f88396d;

    /* renamed from: e */
    public final Button f88397e;

    /* renamed from: f */
    public final LinearLayout f88398f;

    /* renamed from: g */
    public final PageDescriptionView f88399g;

    /* renamed from: h */
    public final RecyclerView f88400h;

    /* renamed from: i */
    public final LinearLayout f88401i;

    /* renamed from: j */
    public final PageDescriptionView f88402j;

    /* renamed from: k */
    public final Button f88403k;

    /* renamed from: l */
    public final LoadingView f88404l;

    /* renamed from: m */
    public final SwipeRefreshLayout f88405m;

    private C36629r(StateView stateView, Button button, LinearLayout linearLayout, PageDescriptionView pageDescriptionView, RecyclerView recyclerView, LinearLayout linearLayout2, PageDescriptionView pageDescriptionView2, Button button2, LoadingView loadingView, SwipeRefreshLayout swipeRefreshLayout) {
        this.f88396d = stateView;
        this.f88397e = button;
        this.f88398f = linearLayout;
        this.f88399g = pageDescriptionView;
        this.f88400h = recyclerView;
        this.f88401i = linearLayout2;
        this.f88402j = pageDescriptionView2;
        this.f88403k = button2;
        this.f88404l = loadingView;
        this.f88405m = swipeRefreshLayout;
    }

    /* renamed from: a */
    public static C36629r m108651a(View view) {
        int i = C36271e.f87512e;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C36271e.f87531l0;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C36271e.f87534m0;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C36271e.f87520h1;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        i = C36271e.f87555z1;
                        LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                        if (linearLayout2 != null) {
                            i = C36271e.f87481A1;
                            PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view, i);
                            if (pageDescriptionView2 != null) {
                                i = C36271e.f87505Y1;
                                Button button2 = (Button) C6202b.m24689a(view, i);
                                if (button2 != null) {
                                    i = C36271e.f87530k2;
                                    LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                                    if (loadingView != null) {
                                        i = C36271e.f87540p2;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C6202b.m24689a(view, i);
                                        if (swipeRefreshLayout != null) {
                                            return new C36629r((StateView) view, button, linearLayout, pageDescriptionView, recyclerView, linearLayout2, pageDescriptionView2, button2, loadingView, swipeRefreshLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36629r m108652d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.fragment_bog_products, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108651a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f88396d;
    }
}
