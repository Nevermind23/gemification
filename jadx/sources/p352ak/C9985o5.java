package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.o5 */
public final class C9985o5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27372d;

    /* renamed from: e */
    public final AppCompatTextView f27373e;

    private C9985o5(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView) {
        this.f27372d = constraintLayout;
        this.f27373e = appCompatTextView;
    }

    /* renamed from: a */
    public static C9985o5 m36621a(View view) {
        int i = C17782g.virtual_card_badge_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            return new C9985o5((ConstraintLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9985o5 m36622d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_text_badge_virtual_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36621a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27372d;
    }
}
