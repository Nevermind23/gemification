package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.w2 */
public final class C10039w2 implements C6201a {

    /* renamed from: d */
    private final View f27690d;

    /* renamed from: e */
    public final TextView f27691e;

    private C10039w2(View view, TextView textView) {
        this.f27690d = view;
        this.f27691e = textView;
    }

    /* renamed from: a */
    public static C10039w2 m36821a(View view) {
        int i = C17782g.f49751c9;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C10039w2(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10039w2 m36822c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_currency_badge, viewGroup);
            return m36821a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27690d;
    }
}
