package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.h1 */
public final class C9925h1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27051d;

    /* renamed from: e */
    public final AppCompatImageView f27052e;

    /* renamed from: f */
    public final AppCompatTextView f27053f;

    private C9925h1(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27051d = linearLayout;
        this.f27052e = appCompatImageView;
        this.f27053f = appCompatTextView;
    }

    /* renamed from: a */
    public static C9925h1 m36405a(View view) {
        int i = C17782g.iconView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.f49681D8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C9925h1((LinearLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9925h1 m36406d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_function, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36405a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27051d;
    }
}
