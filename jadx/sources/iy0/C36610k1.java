package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.CreditCardView;

/* renamed from: iy0.k1 */
public final class C36610k1 implements C6201a {

    /* renamed from: d */
    private final CreditCardView f88304d;

    /* renamed from: e */
    public final CreditCardView f88305e;

    private C36610k1(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f88304d = creditCardView;
        this.f88305e = creditCardView2;
    }

    /* renamed from: a */
    public static C36610k1 m108571a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C36610k1(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36610k1 m108572d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_credit_card_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108571a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f88304d;
    }
}
