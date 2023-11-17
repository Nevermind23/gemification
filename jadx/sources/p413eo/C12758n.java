package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.n */
public final class C12758n implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f37794d;

    /* renamed from: e */
    public final LinearLayout f37795e;

    private C12758n(ConstraintLayout constraintLayout, LinearLayout linearLayout) {
        this.f37794d = constraintLayout;
        this.f37795e = linearLayout;
    }

    /* renamed from: a */
    public static C12758n m48426a(View view) {
        int i = C10114f.financial_info_container;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            return new C12758n((ConstraintLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12758n m48427d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.fragment_financial_info_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48426a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f37794d;
    }
}
