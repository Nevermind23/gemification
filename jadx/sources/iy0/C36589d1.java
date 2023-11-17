package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;

/* renamed from: iy0.d1 */
public final class C36589d1 implements C6201a {

    /* renamed from: d */
    private final CreditCardView f88175d;

    /* renamed from: e */
    public final CreditCardView f88176e;

    private C36589d1(CreditCardView creditCardView, CreditCardView creditCardView2) {
        this.f88175d = creditCardView;
        this.f88176e = creditCardView2;
    }

    /* renamed from: a */
    public static C36589d1 m108482a(View view) {
        if (view != null) {
            CreditCardView creditCardView = (CreditCardView) view;
            return new C36589d1(creditCardView, creditCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36589d1 m108483d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.f87558e0, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108482a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f88175d;
    }
}
