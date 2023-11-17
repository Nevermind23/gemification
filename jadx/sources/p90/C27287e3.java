package p90;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.e3 */
public final class C27287e3 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68644d;

    /* renamed from: e */
    public final AppCompatTextView f68645e;

    /* renamed from: f */
    public final AppCompatTextView f68646f;

    private C27287e3(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f68644d = linearLayout;
        this.f68645e = appCompatTextView;
        this.f68646f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C27287e3 m84450a(View view) {
        int i = C10322k.exchange_currency_ccy_logo_tv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C10322k.exchange_from_to_layout_currency_tv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C27287e3((LinearLayout) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68644d;
    }
}
