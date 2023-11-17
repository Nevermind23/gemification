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

/* renamed from: ak.d1 */
public final class C9893d1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f26878d;

    /* renamed from: e */
    public final AppCompatImageView f26879e;

    /* renamed from: f */
    public final AppCompatTextView f26880f;

    private C9893d1(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f26878d = linearLayout;
        this.f26879e = appCompatImageView;
        this.f26880f = appCompatTextView;
    }

    /* renamed from: a */
    public static C9893d1 m36285a(View view) {
        int i = C17782g.button_icon_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.f49701K8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C9893d1((LinearLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9893d1 m36286d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_card_action, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36285a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f26878d;
    }
}
