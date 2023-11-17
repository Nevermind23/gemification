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

/* renamed from: sp0.e */
public final class C38486e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92181d;

    /* renamed from: e */
    public final RecyclerView f92182e;

    private C38486e(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f92181d = linearLayout;
        this.f92182e = recyclerView;
    }

    /* renamed from: a */
    public static C38486e m112956a(View view) {
        int i = C37439e.month_term_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C38486e((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38486e m112957d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.action_sheet_month_term, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112956a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92181d;
    }
}
