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

/* renamed from: p90.z5 */
public final class C27484z5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70350d;

    /* renamed from: e */
    public final LinearLayout f70351e;

    /* renamed from: f */
    public final TextView f70352f;

    /* renamed from: g */
    public final TextView f70353g;

    /* renamed from: h */
    public final LinearLayout f70354h;

    /* renamed from: i */
    public final TextView f70355i;

    /* renamed from: j */
    public final TextView f70356j;

    /* renamed from: k */
    public final LinearLayout f70357k;

    private C27484z5(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, LinearLayout linearLayout3, TextView textView3, TextView textView4, LinearLayout linearLayout4) {
        this.f70350d = linearLayout;
        this.f70351e = linearLayout2;
        this.f70352f = textView;
        this.f70353g = textView2;
        this.f70354h = linearLayout3;
        this.f70355i = textView3;
        this.f70356j = textView4;
        this.f70357k = linearLayout4;
    }

    /* renamed from: a */
    public static C27484z5 m85242a(View view) {
        int i = C10322k.addressees_count_layout;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10322k.money_request_amount_tv;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.money_request_transferee_amount_tv;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C10322k.new_transferee_icon;
                    LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout2 != null) {
                        i = C10322k.request_receiver_header_tv;
                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                        if (textView3 != null) {
                            i = C10322k.total_requested_amount_header_tv;
                            TextView textView4 = (TextView) C6202b.m24689a(view, i);
                            if (textView4 != null) {
                                i = C10322k.total_requested_money_layout;
                                LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout3 != null) {
                                    return new C27484z5((LinearLayout) view, linearLayout, textView, textView2, linearLayout2, textView3, textView4, linearLayout3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27484z5 m85243d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_summary_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85242a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70350d;
    }
}
