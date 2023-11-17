package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.e8 */
public final class C27292e8 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68657d;

    /* renamed from: e */
    public final AppCompatTextView f68658e;

    /* renamed from: f */
    public final AppCompatTextView f68659f;

    /* renamed from: g */
    public final FrameLayout f68660g;

    private C27292e8(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, FrameLayout frameLayout) {
        this.f68657d = linearLayout;
        this.f68658e = appCompatTextView;
        this.f68659f = appCompatTextView2;
        this.f68660g = frameLayout;
    }

    /* renamed from: a */
    public static C27292e8 m84468a(View view) {
        int i = C10322k.f28826da;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C10322k.f28915yx;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C10322k.title_container;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    return new C27292e8((LinearLayout) view, appCompatTextView, appCompatTextView2, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27292e8 m84469d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.transaction_list_date_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84468a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68657d;
    }
}
