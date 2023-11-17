package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17783h;

/* renamed from: ak.d0 */
public final class C9892d0 implements C6201a {

    /* renamed from: d */
    private final TextBadgeView f26876d;

    /* renamed from: e */
    public final TextBadgeView f26877e;

    private C9892d0(TextBadgeView textBadgeView, TextBadgeView textBadgeView2) {
        this.f26876d = textBadgeView;
        this.f26877e = textBadgeView2;
    }

    /* renamed from: a */
    public static C9892d0 m36281a(View view) {
        if (view != null) {
            TextBadgeView textBadgeView = (TextBadgeView) view;
            return new C9892d0(textBadgeView, textBadgeView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9892d0 m36282d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.layout_product_card_loan_cosigner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36281a(inflate);
    }

    /* renamed from: c */
    public TextBadgeView mo3946b() {
        return this.f26876d;
    }
}
