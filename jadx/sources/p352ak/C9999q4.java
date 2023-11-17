package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p601sg.C17783h;

/* renamed from: ak.q4 */
public final class C9999q4 implements C6201a {

    /* renamed from: d */
    private final InfoBadgeView f27433d;

    /* renamed from: e */
    public final InfoBadgeView f27434e;

    private C9999q4(InfoBadgeView infoBadgeView, InfoBadgeView infoBadgeView2) {
        this.f27433d = infoBadgeView;
        this.f27434e = infoBadgeView2;
    }

    /* renamed from: a */
    public static C9999q4 m36673a(View view) {
        if (view != null) {
            InfoBadgeView infoBadgeView = (InfoBadgeView) view;
            return new C9999q4(infoBadgeView, infoBadgeView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9999q4 m36674d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_product_account_card_amount_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36673a(inflate);
    }

    /* renamed from: c */
    public InfoBadgeView mo3946b() {
        return this.f27433d;
    }
}
