package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import oh0.C27011f;
import p086g1.C6201a;

/* renamed from: th0.n */
public final class C28414n implements C6201a {

    /* renamed from: d */
    private final RecyclerView f72146d;

    /* renamed from: e */
    public final RecyclerView f72147e;

    private C28414n(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f72146d = recyclerView;
        this.f72147e = recyclerView2;
    }

    /* renamed from: a */
    public static C28414n m87177a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C28414n(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28414n m87178d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_cards_filtered_offers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87177a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f72146d;
    }
}
