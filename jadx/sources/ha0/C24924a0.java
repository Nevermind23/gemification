package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import da0.C19951e;
import da0.C19952f;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ha0.a0 */
public final class C24924a0 implements C6201a {

    /* renamed from: d */
    private final View f64091d;

    /* renamed from: e */
    public final TextView f64092e;

    private C24924a0(View view, TextView textView) {
        this.f64091d = view;
        this.f64092e = textView;
    }

    /* renamed from: a */
    public static C24924a0 m79674a(View view) {
        int i = C19951e.f54504D0;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            return new C24924a0(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C24924a0 m79675c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C19952f.view_deposit_currency, viewGroup);
            return m79674a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f64091d;
    }
}
