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

/* renamed from: ak.u1 */
public final class C10024u1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27607d;

    /* renamed from: e */
    public final AppCompatImageView f27608e;

    /* renamed from: f */
    public final AppCompatTextView f27609f;

    private C10024u1(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27607d = linearLayout;
        this.f27608e = appCompatImageView;
        this.f27609f = appCompatTextView;
    }

    /* renamed from: a */
    public static C10024u1 m36765a(View view) {
        int i = C17782g.f49783q4;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.f49701K8;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C10024u1((LinearLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10024u1 m36766d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_small_icon_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36765a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27607d;
    }
}
