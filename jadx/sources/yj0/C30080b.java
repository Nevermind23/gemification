package yj0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import tj0.C28444b;

/* renamed from: yj0.b */
public final class C30080b implements C6201a {

    /* renamed from: d */
    private final CreditCardView f75904d;

    /* renamed from: e */
    public final CreditCardView f75905e;

    private C30080b(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f75904d = creditCardView;
        this.f75905e = creditCardView2;
    }

    /* renamed from: a */
    public static C30080b m91046a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C30080b(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C30080b m91047d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.card_item_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m91046a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f75904d;
    }
}
