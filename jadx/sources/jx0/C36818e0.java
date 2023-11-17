package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fx0.C32025e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;

/* renamed from: jx0.e0 */
public final class C36818e0 implements C6201a {

    /* renamed from: d */
    private final CreditCardView f88848d;

    /* renamed from: e */
    public final CreditCardView f88849e;

    private C36818e0(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f88848d = creditCardView;
        this.f88849e = creditCardView2;
    }

    /* renamed from: a */
    public static C36818e0 m109087a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C36818e0(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36818e0 m109088d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_select_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109087a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f88848d;
    }
}
