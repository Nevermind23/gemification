package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import n51.C37357c;
import p086g1.C6201a;

/* renamed from: o51.k */
public final class C37654k implements C6201a {

    /* renamed from: d */
    private final LinearLayout f90502d;

    private C37654k(LinearLayout linearLayout) {
        this.f90502d = linearLayout;
    }

    /* renamed from: a */
    public static C37654k m110707a(View view) {
        if (view != null) {
            return new C37654k((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37654k m110708d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.item_statements_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110707a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f90502d;
    }
}
