package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17783h;

/* renamed from: ak.f0 */
public final class C9908f0 implements C6201a {

    /* renamed from: d */
    private final TextBadgeView f26971d;

    /* renamed from: e */
    public final TextBadgeView f26972e;

    private C9908f0(TextBadgeView textBadgeView, TextBadgeView textBadgeView2) {
        this.f26971d = textBadgeView;
        this.f26972e = textBadgeView2;
    }

    /* renamed from: a */
    public static C9908f0 m36343a(View view) {
        if (view != null) {
            TextBadgeView textBadgeView = (TextBadgeView) view;
            return new C9908f0(textBadgeView, textBadgeView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9908f0 m36344d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.layout_product_card_new_credit_date, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36343a(inflate);
    }

    /* renamed from: c */
    public TextBadgeView mo3946b() {
        return this.f26971d;
    }
}
