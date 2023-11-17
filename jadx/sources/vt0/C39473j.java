package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import rt0.C38341c;
import rt0.C38342d;

/* renamed from: vt0.j */
public final class C39473j implements C6201a {

    /* renamed from: d */
    private final LinearLayout f93918d;

    /* renamed from: e */
    public final LinearLayout f93919e;

    private C39473j(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.f93918d = linearLayout;
        this.f93919e = linearLayout2;
    }

    /* renamed from: a */
    public static C39473j m114747a(View view) {
        int i = C38341c.bottom_products_container;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            return new C39473j((LinearLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39473j m114748d(LayoutInflater layoutInflater) {
        return m114749e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39473j m114749e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.view_bottom_with_sub_products_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114747a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f93918d;
    }
}
