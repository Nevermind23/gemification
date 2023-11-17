package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.search.SearchView;

/* renamed from: th0.q0 */
public final class C28421q0 implements C6201a {

    /* renamed from: d */
    private final SearchView f72191d;

    /* renamed from: e */
    public final SearchView f72192e;

    private C28421q0(SearchView searchView, SearchView searchView2) {
        this.f72191d = searchView;
        this.f72192e = searchView2;
    }

    /* renamed from: a */
    public static C28421q0 m87205a(View view) {
        if (view != null) {
            SearchView searchView = (SearchView) view;
            return new C28421q0(searchView, searchView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28421q0 m87206d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_cards_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87205a(inflate);
    }

    /* renamed from: c */
    public SearchView mo3946b() {
        return this.f72191d;
    }
}
