package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.r */
public final class C12766r implements C6201a {

    /* renamed from: d */
    private final StateView f37836d;

    /* renamed from: e */
    public final RecyclerView f37837e;

    /* renamed from: f */
    public final FrameLayout f37838f;

    /* renamed from: g */
    public final StateView f37839g;

    private C12766r(StateView stateView, RecyclerView recyclerView, FrameLayout frameLayout, StateView stateView2) {
        this.f37836d = stateView;
        this.f37837e = recyclerView;
        this.f37838f = frameLayout;
        this.f37839g = stateView2;
    }

    /* renamed from: a */
    public static C12766r m48461a(View view) {
        int i = C10114f.f27977x0;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C10114f.f27943X0;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                StateView stateView = (StateView) view;
                return new C12766r(stateView, recyclerView, frameLayout, stateView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12766r m48462d(LayoutInflater layoutInflater) {
        return m48463e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C12766r m48463e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_package_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48461a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f37836d;
    }
}
