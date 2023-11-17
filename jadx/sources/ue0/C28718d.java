package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: ue0.d */
public final class C28718d implements C6201a {

    /* renamed from: d */
    private final StateView f73159d;

    /* renamed from: e */
    public final RecyclerView f73160e;

    /* renamed from: f */
    public final LoadingView f73161f;

    /* renamed from: g */
    public final StateView f73162g;

    private C28718d(StateView stateView, RecyclerView recyclerView, LoadingView loadingView, StateView stateView2) {
        this.f73159d = stateView;
        this.f73160e = recyclerView;
        this.f73161f = loadingView;
        this.f73162g = stateView2;
    }

    /* renamed from: a */
    public static C28718d m87990a(View view) {
        int i = C25187g.accountsRecycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C25187g.recyclerLoading;
            LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
            if (loadingView != null) {
                StateView stateView = (StateView) view;
                return new C28718d(stateView, recyclerView, loadingView, stateView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28718d m87991d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_gt_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87990a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f73159d;
    }
}
