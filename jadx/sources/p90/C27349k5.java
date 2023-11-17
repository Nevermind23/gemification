package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.k5 */
public final class C27349k5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69164d;

    /* renamed from: e */
    public final ImageView f69165e;

    /* renamed from: f */
    public final ImageView f69166f;

    /* renamed from: g */
    public final ImageView f69167g;

    /* renamed from: h */
    public final CircularProgressBar f69168h;

    /* renamed from: i */
    public final TextView f69169i;

    /* renamed from: j */
    public final TextView f69170j;

    /* renamed from: k */
    public final TextView f69171k;

    /* renamed from: l */
    public final TextView f69172l;

    private C27349k5(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, CircularProgressBar circularProgressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f69164d = constraintLayout;
        this.f69165e = imageView;
        this.f69166f = imageView2;
        this.f69167g = imageView3;
        this.f69168h = circularProgressBar;
        this.f69169i = textView;
        this.f69170j = textView2;
        this.f69171k = textView3;
        this.f69172l = textView4;
    }

    /* renamed from: a */
    public static C27349k5 m84704a(View view) {
        int i = C10322k.alert_badge_image;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.f28755J1;
            ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
            if (imageView2 != null) {
                i = C10322k.f28789Sg;
                ImageView imageView3 = (ImageView) C6202b.m24689a(view, i);
                if (imageView3 != null) {
                    i = C10322k.f28759Jq;
                    CircularProgressBar circularProgressBar = (CircularProgressBar) C6202b.m24689a(view, i);
                    if (circularProgressBar != null) {
                        i = C10322k.received_amount_text;
                        TextView textView = (TextView) C6202b.m24689a(view, i);
                        if (textView != null) {
                            i = C10322k.request_description_text;
                            TextView textView2 = (TextView) C6202b.m24689a(view, i);
                            if (textView2 != null) {
                                i = C10322k.requested_amount_text;
                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                if (textView3 != null) {
                                    i = C10322k.requests_money_text;
                                    TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                    if (textView4 != null) {
                                        return new C27349k5((ConstraintLayout) view, imageView, imageView2, imageView3, circularProgressBar, textView, textView2, textView3, textView4);
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

    /* renamed from: d */
    public static C27349k5 m84705d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_contact_details_money_request_to_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84704a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69164d;
    }
}
