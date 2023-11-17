package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.a */
public final class C17048a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f47554d;

    /* renamed from: e */
    public final TextView f47555e;

    /* renamed from: f */
    public final RecyclerView f47556f;

    private C17048a(LinearLayout linearLayout, TextView textView, RecyclerView recyclerView) {
        this.f47554d = linearLayout;
        this.f47555e = textView;
        this.f47556f = recyclerView;
    }

    /* renamed from: a */
    public static C17048a m59892a(View view) {
        int i = C16213d.f45758u;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C16213d.shops_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C17048a((LinearLayout) view, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17048a m59893d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.action_sheet_bnpl_offer_shops, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59892a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f47554d;
    }
}
