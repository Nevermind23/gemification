package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: g71.m */
public final class C32120m implements C6201a {

    /* renamed from: d */
    private final LinearLayout f79057d;

    /* renamed from: e */
    public final TextView f79058e;

    /* renamed from: f */
    public final TextView f79059f;

    private C32120m(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f79057d = linearLayout;
        this.f79058e = textView;
        this.f79059f = textView2;
    }

    /* renamed from: a */
    public static C32120m m94613a(View view) {
        int i = C31284d.active_pass_period;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C31284d.active_pass_period_title;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C32120m((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32120m m94614d(LayoutInflater layoutInflater) {
        return m94615e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C32120m m94615e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.layout_active_pass_period, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94613a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f79057d;
    }
}
