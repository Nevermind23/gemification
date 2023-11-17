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
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: jx0.g */
public final class C36821g implements C6201a {

    /* renamed from: d */
    private final StateView f88855d;

    /* renamed from: e */
    public final LinearLayout f88856e;

    /* renamed from: f */
    public final LoadingView f88857f;

    /* renamed from: g */
    public final RecyclerView f88858g;

    /* renamed from: h */
    public final SearchView f88859h;

    /* renamed from: i */
    public final StateView f88860i;

    private C36821g(StateView stateView, LinearLayout linearLayout, LoadingView loadingView, RecyclerView recyclerView, SearchView searchView, StateView stateView2) {
        this.f88855d = stateView;
        this.f88856e = linearLayout;
        this.f88857f = loadingView;
        this.f88858g = recyclerView;
        this.f88859h = searchView;
        this.f88860i = stateView2;
    }

    /* renamed from: a */
    public static C36821g m109097a(View view) {
        int i = C32024d.f78855r;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C32024d.f78835E;
            LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
            if (loadingView != null) {
                i = C32024d.f78841b0;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C32024d.f78844d0;
                    SearchView searchView = (SearchView) C6202b.m24689a(view, i);
                    if (searchView != null) {
                        StateView stateView = (StateView) view;
                        return new C36821g(stateView, linearLayout, loadingView, recyclerView, searchView, stateView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36821g m109098d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.fragment_categories, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109097a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f88855d;
    }
}
