package ha0;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import da0.C19951e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;

/* renamed from: ha0.t */
public final class C24943t implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f64242d;

    /* renamed from: e */
    public final TextView f64243e;

    /* renamed from: f */
    public final TextView f64244f;

    /* renamed from: g */
    public final TextView f64245g;

    /* renamed from: h */
    public final TextView f64246h;

    /* renamed from: i */
    public final LinearLayout f64247i;

    /* renamed from: j */
    public final TextView f64248j;

    /* renamed from: k */
    public final TextView f64249k;

    /* renamed from: l */
    public final LinearLayoutCompat f64250l;

    /* renamed from: m */
    public final InlineFeedback f64251m;

    private C24943t(LinearLayoutCompat linearLayoutCompat, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, TextView textView5, TextView textView6, LinearLayoutCompat linearLayoutCompat2, InlineFeedback inlineFeedback) {
        this.f64242d = linearLayoutCompat;
        this.f64243e = textView;
        this.f64244f = textView2;
        this.f64245g = textView3;
        this.f64246h = textView4;
        this.f64247i = linearLayout;
        this.f64248j = textView5;
        this.f64249k = textView6;
        this.f64250l = linearLayoutCompat2;
        this.f64251m = inlineFeedback;
    }

    /* renamed from: a */
    public static C24943t m79753a(View view) {
        int i = C19951e.annual_interest_rate_title_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C19951e.f54526f;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C19951e.effective_interest_rate_title_text;
                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                if (textView3 != null) {
                    i = C19951e.f54516K;
                    TextView textView4 = (TextView) C6202b.m24689a(view, i);
                    if (textView4 != null) {
                        i = C19951e.expected_interest_container;
                        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                        if (linearLayout != null) {
                            i = C19951e.expected_interest_title_text;
                            TextView textView5 = (TextView) C6202b.m24689a(view, i);
                            if (textView5 != null) {
                                i = C19951e.expected_interest_value_text;
                                TextView textView6 = (TextView) C6202b.m24689a(view, i);
                                if (textView6 != null) {
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                                    i = C19951e.withdrawal_type_inline_feedback;
                                    InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                                    if (inlineFeedback != null) {
                                        return new C24943t(linearLayoutCompat, textView, textView2, textView3, textView4, linearLayout, textView5, textView6, linearLayoutCompat, inlineFeedback);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f64242d;
    }
}
