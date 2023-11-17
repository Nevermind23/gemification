package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import rt0.C38341c;
import rt0.C38342d;

/* renamed from: vt0.i */
public final class C39472i implements C6201a {

    /* renamed from: d */
    private final LinearLayout f93914d;

    /* renamed from: e */
    public final AppCompatImageView f93915e;

    /* renamed from: f */
    public final AppCompatTextView f93916f;

    /* renamed from: g */
    public final AppCompatTextView f93917g;

    private C39472i(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f93914d = linearLayout;
        this.f93915e = appCompatImageView;
        this.f93916f = appCompatTextView;
        this.f93917g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C39472i m114743a(View view) {
        int i = C38341c.sub_product_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C38341c.sub_product_stars_count;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C38341c.sub_product_state;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C39472i((LinearLayout) view, appCompatImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39472i m114744d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.view_bottom_sub_product, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114743a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f93914d;
    }
}
