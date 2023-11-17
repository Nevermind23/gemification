package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.search.SearchView;

/* renamed from: en0.b */
public final class C12716b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37607d;

    /* renamed from: e */
    public final RecyclerView f37608e;

    /* renamed from: f */
    public final SearchView f37609f;

    private C12716b(LinearLayout linearLayout, RecyclerView recyclerView, SearchView searchView) {
        this.f37607d = linearLayout;
        this.f37608e = recyclerView;
        this.f37609f = searchView;
    }

    /* renamed from: a */
    public static C12716b m48257a(View view) {
        int i = C10106b.f27877K;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C10106b.f27879M;
            SearchView searchView = (SearchView) C6202b.m24689a(view, i);
            if (searchView != null) {
                return new C12716b((LinearLayout) view, recyclerView, searchView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12716b m48258d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.action_sheet_single_text_item_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48257a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37607d;
    }
}
