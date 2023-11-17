package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.w7 */
public final class C27459w7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70180d;

    /* renamed from: e */
    public final AppCompatTextView f70181e;

    /* renamed from: f */
    public final ImageView f70182f;

    /* renamed from: g */
    public final AppCompatTextView f70183g;

    /* renamed from: h */
    public final FrameLayout f70184h;

    private C27459w7(LinearLayout linearLayout, AppCompatTextView appCompatTextView, ImageView imageView, AppCompatTextView appCompatTextView2, FrameLayout frameLayout) {
        this.f70180d = linearLayout;
        this.f70181e = appCompatTextView;
        this.f70182f = imageView;
        this.f70183g = appCompatTextView2;
        this.f70184h = frameLayout;
    }

    /* renamed from: a */
    public static C27459w7 m85141a(View view) {
        int i = C10322k.item_desc;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C10322k.item_image;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10322k.f28846ii;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C10322k.rounded_container;
                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout != null) {
                        return new C27459w7((LinearLayout) view, appCompatTextView, imageView, appCompatTextView2, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27459w7 m85142d(LayoutInflater layoutInflater) {
        return m85143e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27459w7 m85143e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.operation_details_single_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85141a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70180d;
    }
}
