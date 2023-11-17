package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p451hk.C15527e;

/* renamed from: kk.q */
public final class C16463q implements C6201a {

    /* renamed from: d */
    private final CreditCardView f46604d;

    /* renamed from: e */
    public final CreditCardView f46605e;

    private C16463q(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f46604d = creditCardView;
        this.f46605e = creditCardView2;
    }

    /* renamed from: a */
    public static C16463q m58657a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C16463q(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C16463q m58658d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.item_insurance_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58657a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f46604d;
    }
}
