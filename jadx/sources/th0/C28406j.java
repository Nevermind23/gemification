package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;

/* renamed from: th0.j */
public final class C28406j implements C6201a {

    /* renamed from: d */
    private final StateView f72066d;

    /* renamed from: e */
    public final LinearLayout f72067e;

    /* renamed from: f */
    public final RecyclerView f72068f;

    /* renamed from: g */
    public final Button f72069g;

    /* renamed from: h */
    public final FrameLayout f72070h;

    /* renamed from: i */
    public final StateView f72071i;

    /* renamed from: j */
    public final BogSwipeRefreshLayout f72072j;

    private C28406j(StateView stateView, LinearLayout linearLayout, RecyclerView recyclerView, Button button, FrameLayout frameLayout, StateView stateView2, BogSwipeRefreshLayout bogSwipeRefreshLayout) {
        this.f72066d = stateView;
        this.f72067e = linearLayout;
        this.f72068f = recyclerView;
        this.f72069g = button;
        this.f72070h = frameLayout;
        this.f72071i = stateView2;
        this.f72072j = bogSwipeRefreshLayout;
    }

    /* renamed from: a */
    public static C28406j m87145a(View view) {
        int i = C27010e.f67816c0;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C27010e.gift_cards_recycler_view;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C27010e.f67794D1;
                Button button = (Button) C6202b.m24689a(view, i);
                if (button != null) {
                    i = C27010e.f67805L1;
                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout != null) {
                        StateView stateView = (StateView) view;
                        i = C27010e.f67806P1;
                        BogSwipeRefreshLayout bogSwipeRefreshLayout = (BogSwipeRefreshLayout) C6202b.m24689a(view, i);
                        if (bogSwipeRefreshLayout != null) {
                            return new C28406j(stateView, linearLayout, recyclerView, button, frameLayout, stateView, bogSwipeRefreshLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28406j m87146d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_cards, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87145a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f72066d;
    }
}
