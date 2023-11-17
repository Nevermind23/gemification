package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31205e;
import p086g1.C6201a;

/* renamed from: ev0.h */
public final class C31827h implements C6201a {

    /* renamed from: d */
    private final RecyclerView f78503d;

    /* renamed from: e */
    public final RecyclerView f78504e;

    private C31827h(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f78503d = recyclerView;
        this.f78504e = recyclerView2;
    }

    /* renamed from: a */
    public static C31827h m94097a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new C31827h(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31827h m94098d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.dialog_fragment_product_more_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94097a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f78503d;
    }
}
