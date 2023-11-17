package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.d5 */
public final class C27279d5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68548d;

    /* renamed from: e */
    public final RecyclerView f68549e;

    private C27279d5(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f68548d = linearLayout;
        this.f68549e = recyclerView;
    }

    /* renamed from: a */
    public static C27279d5 m84417a(View view) {
        int i = C10322k.operationsRecycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C27279d5((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27279d5 m84418d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_summary_operations, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84417a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68548d;
    }
}
