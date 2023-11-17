package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.e5 */
public final class C27289e5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68650d;

    /* renamed from: e */
    public final TextView f68651e;

    private C27289e5(LinearLayout linearLayout, TextView textView) {
        this.f68650d = linearLayout;
        this.f68651e = textView;
    }

    /* renamed from: a */
    public static C27289e5 m84457a(View view) {
        int i = C10322k.newOperationButton;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C27289e5((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27289e5 m84458d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_summary_operations_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84457a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68650d;
    }
}
