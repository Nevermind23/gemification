package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.j5 */
public final class C27339j5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69079d;

    /* renamed from: e */
    public final ImageView f69080e;

    /* renamed from: f */
    public final ImageView f69081f;

    /* renamed from: g */
    public final TextView f69082g;

    /* renamed from: h */
    public final TextView f69083h;

    /* renamed from: i */
    public final TextView f69084i;

    private C27339j5(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f69079d = constraintLayout;
        this.f69080e = imageView;
        this.f69081f = imageView2;
        this.f69082g = textView;
        this.f69083h = textView2;
        this.f69084i = textView3;
    }

    /* renamed from: a */
    public static C27339j5 m84665a(View view) {
        int i = C10322k.f28755J1;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.f28789Sg;
            ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
            if (imageView2 != null) {
                i = C10322k.request_description_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.requested_amount_text;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C10322k.requests_money_text;
                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                        if (textView3 != null) {
                            return new C27339j5((ConstraintLayout) view, imageView, imageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27339j5 m84666d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_contact_details_money_request_from_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84665a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69079d;
    }
}
