package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.search.SearchView;

/* renamed from: ue0.p */
public final class C28744p implements C6201a {

    /* renamed from: d */
    private final LinearLayout f73404d;

    /* renamed from: e */
    public final RecyclerView f73405e;

    /* renamed from: f */
    public final SearchView f73406f;

    private C28744p(LinearLayout linearLayout, RecyclerView recyclerView, SearchView searchView) {
        this.f73404d = linearLayout;
        this.f73405e = recyclerView;
        this.f73406f = searchView;
    }

    /* renamed from: a */
    public static C28744p m88101a(View view) {
        int i = C25187g.f64699h3;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C25187g.f64729x3;
            SearchView searchView = (SearchView) C6202b.m24689a(view, i);
            if (searchView != null) {
                return new C28744p((LinearLayout) view, recyclerView, searchView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28744p m88102d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.action_sheet_subtype_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88101a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f73404d;
    }
}
