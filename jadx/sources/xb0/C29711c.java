package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.c */
public final class C29711c implements C6201a {

    /* renamed from: d */
    private final FrameLayout f74982d;

    /* renamed from: e */
    public final RecyclerView f74983e;

    private C29711c(FrameLayout frameLayout, RecyclerView recyclerView) {
        this.f74982d = frameLayout;
        this.f74983e = recyclerView;
    }

    /* renamed from: a */
    public static C29711c m90210a(View view) {
        int i = C27985d.f71262K0;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C29711c((FrameLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29711c m90211d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.f71304c, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90210a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f74982d;
    }
}
