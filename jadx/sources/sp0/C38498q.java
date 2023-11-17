package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: sp0.q */
public final class C38498q implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f92263d;

    /* renamed from: e */
    public final ConstraintLayout f92264e;

    /* renamed from: f */
    public final TextView f92265f;

    /* renamed from: g */
    public final TextView f92266g;

    private C38498q(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2) {
        this.f92263d = constraintLayout;
        this.f92264e = constraintLayout2;
        this.f92265f = textView;
        this.f92266g = textView2;
    }

    /* renamed from: a */
    public static C38498q m113006a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C37439e.summary_label;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37439e.summary_value;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C38498q(constraintLayout, constraintLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38498q m113007d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_activation_details_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113006a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f92263d;
    }
}
