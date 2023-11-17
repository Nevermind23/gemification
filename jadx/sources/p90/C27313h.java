package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.h */
public final class C27313h implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68840d;

    /* renamed from: e */
    public final LoadingView f68841e;

    /* renamed from: f */
    public final RecyclerView f68842f;

    private C27313h(FrameLayout frameLayout, LoadingView loadingView, RecyclerView recyclerView) {
        this.f68840d = frameLayout;
        this.f68841e = loadingView;
        this.f68842f = recyclerView;
    }

    /* renamed from: a */
    public static C27313h m84558a(View view) {
        int i = C10322k.f28780Pj;
        LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
        if (loadingView != null) {
            i = C10322k.f28917zr;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C27313h((FrameLayout) view, loadingView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27313h m84559d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.action_sheet_remmitance_rates, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84558a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68840d;
    }
}
