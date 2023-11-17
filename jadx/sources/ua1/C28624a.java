package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.search.SearchView;

/* renamed from: ua1.a */
public final class C28624a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72641d;

    /* renamed from: e */
    public final SearchView f72642e;

    /* renamed from: f */
    public final RecyclerView f72643f;

    private C28624a(ConstraintLayout constraintLayout, SearchView searchView, RecyclerView recyclerView) {
        this.f72641d = constraintLayout;
        this.f72642e = searchView;
        this.f72643f = recyclerView;
    }

    /* renamed from: a */
    public static C28624a m87590a(View view) {
        int i = C10216u.f28348y2;
        SearchView searchView = (SearchView) C6202b.m24689a(view, i);
        if (searchView != null) {
            i = C10216u.f28309V2;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C28624a((ConstraintLayout) view, searchView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28624a m87591d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.action_sheet_selector_with_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87590a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72641d;
    }
}
