package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: sp0.d */
public final class C38485d implements C6201a {

    /* renamed from: d */
    private final LinearLayout f92178d;

    /* renamed from: e */
    public final TextView f92179e;

    /* renamed from: f */
    public final RecyclerView f92180f;

    private C38485d(LinearLayout linearLayout, TextView textView, RecyclerView recyclerView) {
        this.f92178d = linearLayout;
        this.f92179e = textView;
        this.f92180f = recyclerView;
    }

    /* renamed from: a */
    public static C38485d m112952a(View view) {
        int i = C37439e.f90007m;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C37439e.pay_day_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C38485d((LinearLayout) view, textView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38485d m112953d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.action_sheet_loan_pay_day, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112952a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f92178d;
    }
}
