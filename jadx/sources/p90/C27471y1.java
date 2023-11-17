package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.search.NavigationSearchView;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.y1 */
public final class C27471y1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70251d;

    /* renamed from: e */
    public final RecyclerView f70252e;

    /* renamed from: f */
    public final BogProgressBar f70253f;

    /* renamed from: g */
    public final FrameLayout f70254g;

    /* renamed from: h */
    public final NavigationSearchView f70255h;

    private C27471y1(LinearLayout linearLayout, RecyclerView recyclerView, BogProgressBar bogProgressBar, FrameLayout frameLayout, NavigationSearchView navigationSearchView) {
        this.f70251d = linearLayout;
        this.f70252e = recyclerView;
        this.f70253f = bogProgressBar;
        this.f70254g = frameLayout;
        this.f70255h = navigationSearchView;
    }

    /* renamed from: a */
    public static C27471y1 m85190a(View view) {
        int i = C10322k.content_recycler_view;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C10322k.f28719Dq;
            BogProgressBar bogProgressBar = (BogProgressBar) C6202b.m24689a(view, i);
            if (bogProgressBar != null) {
                i = C10322k.search_progressbar;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    i = C10322k.f28788Rt;
                    NavigationSearchView navigationSearchView = (NavigationSearchView) C6202b.m24689a(view, i);
                    if (navigationSearchView != null) {
                        return new C27471y1((LinearLayout) view, recyclerView, bogProgressBar, frameLayout, navigationSearchView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27471y1 m85191d(LayoutInflater layoutInflater) {
        return m85192e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27471y1 m85192e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85190a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70251d;
    }
}
