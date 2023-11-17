package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.CreditCardView;

/* renamed from: iy0.w */
public final class C36644w implements C6201a {

    /* renamed from: d */
    private final CreditCardView f88446d;

    /* renamed from: e */
    public final CreditCardView f88447e;

    private C36644w(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f88446d = creditCardView;
        this.f88447e = creditCardView2;
    }

    /* renamed from: a */
    public static C36644w m108711a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C36644w(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36644w m108712d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.grid_item_credit_card_square, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108711a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f88446d;
    }
}
