package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import uv0.C39107d;

/* renamed from: yv0.g */
public final class C40082g implements C6201a {

    /* renamed from: d */
    private final CreditCardView f95296d;

    /* renamed from: e */
    public final CreditCardView f95297e;

    private C40082g(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f95296d = creditCardView;
        this.f95297e = creditCardView2;
    }

    /* renamed from: a */
    public static C40082g m116133a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C40082g(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40082g m116134d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.f93257g, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116133a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f95296d;
    }
}
