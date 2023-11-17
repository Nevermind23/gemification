package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31205e;
import p086g1.C6201a;

/* renamed from: ev0.k */
public final class C31830k implements C6201a {

    /* renamed from: d */
    private final RecyclerView f78526d;

    /* renamed from: e */
    public final RecyclerView f78527e;

    private C31830k(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f78526d = recyclerView;
        this.f78527e = recyclerView2;
    }

    /* renamed from: a */
    public static C31830k m94109a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C31830k(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31830k m94110d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.fragment_product_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94109a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f78526d;
    }
}
