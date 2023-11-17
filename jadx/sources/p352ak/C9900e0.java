package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17783h;

/* renamed from: ak.e0 */
public final class C9900e0 implements C6201a {

    /* renamed from: d */
    private final TextBadgeView f26922d;

    /* renamed from: e */
    public final TextBadgeView f26923e;

    private C9900e0(TextBadgeView textBadgeView, TextBadgeView textBadgeView2) {
        this.f26922d = textBadgeView;
        this.f26923e = textBadgeView2;
    }

    /* renamed from: a */
    public static C9900e0 m36313a(View view) {
        if (view != null) {
            TextBadgeView textBadgeView = (TextBadgeView) view;
            return new C9900e0(textBadgeView, textBadgeView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9900e0 m36314d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.layout_product_card_loan_date, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36313a(inflate);
    }

    /* renamed from: c */
    public TextBadgeView mo3946b() {
        return this.f26922d;
    }
}
