package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import c71.C31285e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;

/* renamed from: g71.c */
public final class C32110c implements C6201a {

    /* renamed from: d */
    private final CreditCardView f78969d;

    /* renamed from: e */
    public final CreditCardView f78970e;

    private C32110c(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f78969d = creditCardView;
        this.f78970e = creditCardView2;
    }

    /* renamed from: a */
    public static C32110c m94573a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C32110c(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C32110c m94574d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.card_recycler_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94573a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f78969d;
    }
}
