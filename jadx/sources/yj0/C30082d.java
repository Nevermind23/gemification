package yj0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import tj0.C28443a;
import tj0.C28444b;

/* renamed from: yj0.d */
public final class C30082d implements C6201a {

    /* renamed from: d */
    private final FrameLayout f75912d;

    /* renamed from: e */
    public final RecyclerView f75913e;

    /* renamed from: f */
    public final LoadingView f75914f;

    /* renamed from: g */
    public final FrameLayout f75915g;

    /* renamed from: h */
    public final StateView f75916h;

    private C30082d(FrameLayout frameLayout, RecyclerView recyclerView, LoadingView loadingView, FrameLayout frameLayout2, StateView stateView) {
        this.f75912d = frameLayout;
        this.f75913e = recyclerView;
        this.f75914f = loadingView;
        this.f75915g = frameLayout2;
        this.f75916h = stateView;
    }

    /* renamed from: a */
    public static C30082d m91055a(View view) {
        int i = C28443a.cards_rv;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C28443a.f72245g;
            LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
            if (loadingView != null) {
                i = C28443a.f72246h;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    i = C28443a.f72247i;
                    StateView stateView = (StateView) C6202b.m24689a(view, i);
                    if (stateView != null) {
                        return new C30082d((FrameLayout) view, recyclerView, loadingView, frameLayout, stateView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C30082d m91056d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.google_play_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m91055a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f75912d;
    }
}
