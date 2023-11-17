package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.k */
public final class C12752k implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37763d;

    /* renamed from: e */
    public final RecyclerView f37764e;

    private C12752k(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f37763d = linearLayout;
        this.f37764e = recyclerView;
    }

    /* renamed from: a */
    public static C12752k m48402a(View view) {
        int i = C10114f.f27950c1;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C12752k((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12752k m48403d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_application_result, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48402a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37763d;
    }
}
