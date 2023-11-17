package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.search.SearchView;

/* renamed from: ua1.o1 */
public final class C28668o1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f72873d;

    /* renamed from: e */
    public final RecyclerView f72874e;

    /* renamed from: f */
    public final SearchView f72875f;

    private C28668o1(LinearLayout linearLayout, RecyclerView recyclerView, SearchView searchView) {
        this.f72873d = linearLayout;
        this.f72874e = recyclerView;
        this.f72875f = searchView;
    }

    /* renamed from: a */
    public static C28668o1 m87784a(View view) {
        int i = C10216u.phone_number_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C10216u.f28345x2;
            SearchView searchView = (SearchView) C6202b.m24689a(view, i);
            if (searchView != null) {
                return new C28668o1((LinearLayout) view, recyclerView, searchView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28668o1 m87785d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.layout_country_code_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87784a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f72873d;
    }
}
