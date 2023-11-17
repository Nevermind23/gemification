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

/* renamed from: ak.l1 */
public final class C9957l1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27231d;

    /* renamed from: e */
    public final AppCompatImageView f27232e;

    /* renamed from: f */
    public final AppCompatTextView f27233f;

    private C9957l1(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27231d = linearLayout;
        this.f27232e = appCompatImageView;
        this.f27233f = appCompatTextView;
    }

    /* renamed from: a */
    public static C9957l1 m36519a(View view) {
        int i = C17782g.iconView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.f49681D8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C9957l1((LinearLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9957l1 m36520d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_icon_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36519a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27231d;
    }
}
