package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: sp0.k */
public final class C38492k implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92223d;

    /* renamed from: e */
    public final RecyclerView f92224e;

    private C38492k(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f92223d = linearLayout;
        this.f92224e = recyclerView;
    }

    /* renamed from: a */
    public static C38492k m112982a(View view) {
        int i = C37439e.f89983F0;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C38492k((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38492k m112983d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.form_segment_refinance_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112982a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92223d;
    }
}
