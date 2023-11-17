package i01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import e01.C31639c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;

/* renamed from: i01.d */
public final class C36336d implements C6201a {

    /* renamed from: d */
    private final CreditCardView f87696d;

    /* renamed from: e */
    public final CreditCardView f87697e;

    private C36336d(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f87696d = creditCardView;
        this.f87697e = creditCardView2;
    }

    /* renamed from: a */
    public static C36336d m107835a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C36336d(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36336d m107836d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31639c.item_card_chooser, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m107835a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f87696d;
    }
}
