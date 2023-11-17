package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.m */
public final class C24906m implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64024d;

    /* renamed from: e */
    public final TextView f64025e;

    /* renamed from: f */
    public final TextView f64026f;

    private C24906m(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f64024d = linearLayout;
        this.f64025e = textView;
        this.f64026f = textView2;
    }

    /* renamed from: a */
    public static C24906m m79608a(View view) {
        int i = C28606b.f72607s;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C28606b.f72582O;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C24906m((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24906m m79609d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.cla_contract_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79608a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64024d;
    }
}
