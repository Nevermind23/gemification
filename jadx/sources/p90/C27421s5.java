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

/* renamed from: p90.s5 */
public final class C27421s5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69794d;

    /* renamed from: e */
    public final TextView f69795e;

    private C27421s5(LinearLayout linearLayout, TextView textView) {
        this.f69794d = linearLayout;
        this.f69795e = textView;
    }

    /* renamed from: a */
    public static C27421s5 m84994a(View view) {
        int i = C10322k.f28771N;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C27421s5((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27421s5 m84995d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_details_enrollment_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84994a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69794d;
    }
}
