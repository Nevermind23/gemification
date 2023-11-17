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
import p341ge.bog.designsystem.components.search.SearchView;

/* renamed from: jx0.b */
public final class C36811b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88799d;

    /* renamed from: e */
    public final RecyclerView f88800e;

    /* renamed from: f */
    public final SearchView f88801f;

    private C36811b(LinearLayout linearLayout, RecyclerView recyclerView, SearchView searchView) {
        this.f88799d = linearLayout;
        this.f88800e = recyclerView;
        this.f88801f = searchView;
    }

    /* renamed from: a */
    public static C36811b m109056a(View view) {
        int i = C32024d.options_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C32024d.f78845e0;
            SearchView searchView = (SearchView) C6202b.m24689a(view, i);
            if (searchView != null) {
                return new C36811b((LinearLayout) view, recyclerView, searchView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36811b m109057d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.action_sheet_payment_form_select_options, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109056a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88799d;
    }
}
