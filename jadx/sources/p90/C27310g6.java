package p90;

import android.view.View;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.currencycardextended.CurrencyCardExtendedView;

/* renamed from: p90.g6 */
public final class C27310g6 implements C6201a {

    /* renamed from: d */
    private final CurrencyCardExtendedView f68824d;

    /* renamed from: e */
    public final CurrencyCardExtendedView f68825e;

    private C27310g6(CurrencyCardExtendedView currencyCardExtendedView, CurrencyCardExtendedView currencyCardExtendedView2) {
        this.f68824d = currencyCardExtendedView;
        this.f68825e = currencyCardExtendedView2;
    }

    /* renamed from: a */
    public static C27310g6 m84549a(View view) {
        if (view != null) {
            CurrencyCardExtendedView currencyCardExtendedView = (CurrencyCardExtendedView) view;
            return new C27310g6(currencyCardExtendedView, currencyCardExtendedView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public CurrencyCardExtendedView mo3946b() {
        return this.f68824d;
    }
}
