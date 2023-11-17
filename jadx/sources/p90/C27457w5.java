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

/* renamed from: p90.w5 */
public final class C27457w5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70176d;

    /* renamed from: e */
    public final TextView f70177e;

    private C27457w5(LinearLayout linearLayout, TextView textView) {
        this.f70176d = linearLayout;
        this.f70177e = textView;
    }

    /* renamed from: a */
    public static C27457w5 m85135a(View view) {
        int i = C10322k.count_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C27457w5((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27457w5 m85136d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_details_receivers_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85135a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70176d;
    }
}
