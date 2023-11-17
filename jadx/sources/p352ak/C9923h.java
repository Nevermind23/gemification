package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.amountbadge.AmountSignBigBadgeView;
import p601sg.C17783h;

/* renamed from: ak.h */
public final class C9923h implements C6201a {

    /* renamed from: d */
    private final AmountSignBigBadgeView f27048d;

    private C9923h(AmountSignBigBadgeView amountSignBigBadgeView) {
        this.f27048d = amountSignBigBadgeView;
    }

    /* renamed from: a */
    public static C9923h m36398a(View view) {
        if (view != null) {
            return new C9923h((AmountSignBigBadgeView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9923h m36399d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_account_selector_amount_sign_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36398a(inflate);
    }

    /* renamed from: c */
    public AmountSignBigBadgeView mo3946b() {
        return this.f27048d;
    }
}
