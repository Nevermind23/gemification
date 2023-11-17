package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.c */
public final class C27263c implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68412d;

    /* renamed from: e */
    public final View f68413e;

    /* renamed from: f */
    public final ImageView f68414f;

    /* renamed from: g */
    public final TextView f68415g;

    /* renamed from: h */
    public final LinearLayout f68416h;

    /* renamed from: i */
    public final TextView f68417i;

    /* renamed from: j */
    public final TextView f68418j;

    private C27263c(ConstraintLayout constraintLayout, View view, ImageView imageView, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        this.f68412d = constraintLayout;
        this.f68413e = view;
        this.f68414f = imageView;
        this.f68415g = textView;
        this.f68416h = linearLayout;
        this.f68417i = textView2;
        this.f68418j = textView3;
    }

    /* renamed from: a */
    public static C27263c m84349a(View view) {
        int i = C10322k.f28850jc;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.f28789Sg;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10322k.mobile_number_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.number_container;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout != null) {
                        i = C10322k.status_message_text;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            i = C10322k.status_title_text;
                            TextView textView3 = (TextView) C6202b.m24689a(view, i);
                            if (textView3 != null) {
                                return new C27263c((ConstraintLayout) view, a, imageView, textView, linearLayout, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27263c m84350d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.action_sheet_installment_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84349a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68412d;
    }
}
