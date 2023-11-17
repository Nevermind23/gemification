package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: jx0.z */
public final class C36844z implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f88919d;

    /* renamed from: e */
    public final View f88920e;

    /* renamed from: f */
    public final AppCompatImageView f88921f;

    /* renamed from: g */
    public final TextView f88922g;

    /* renamed from: h */
    public final TextView f88923h;

    /* renamed from: i */
    public final TextView f88924i;

    /* renamed from: j */
    public final AppCompatImageView f88925j;

    /* renamed from: k */
    public final LinearLayout f88926k;

    private C36844z(RelativeLayout relativeLayout, View view, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView2, LinearLayout linearLayout) {
        this.f88919d = relativeLayout;
        this.f88920e = view;
        this.f88921f = appCompatImageView;
        this.f88922g = textView;
        this.f88923h = textView2;
        this.f88924i = textView3;
        this.f88925j = appCompatImageView2;
        this.f88926k = linearLayout;
    }

    /* renamed from: a */
    public static C36844z m109188a(View view) {
        int i = C32024d.f78857t;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C32024d.pacakge_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C32024d.package_desc;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C32024d.package_price;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C32024d.package_title;
                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                        if (textView3 != null) {
                            i = C32024d.selected_image;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView2 != null) {
                                i = C32024d.texts_container;
                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout != null) {
                                    return new C36844z((RelativeLayout) view, a, appCompatImageView, textView, textView2, textView3, appCompatImageView2, linearLayout);
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
    public static C36844z m109189d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_package_select_option, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109188a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f88919d;
    }
}
