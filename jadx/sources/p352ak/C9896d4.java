package p352ak;

import android.view.View;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;

/* renamed from: ak.d4 */
public final class C9896d4 implements C6201a {

    /* renamed from: d */
    private final CurrencyBadgeView f26897d;

    /* renamed from: e */
    public final CurrencyBadgeView f26898e;

    private C9896d4(CurrencyBadgeView currencyBadgeView, CurrencyBadgeView currencyBadgeView2) {
        this.f26897d = currencyBadgeView;
        this.f26898e = currencyBadgeView2;
    }

    /* renamed from: a */
    public static C9896d4 m36298a(View view) {
        if (view != null) {
            CurrencyBadgeView currencyBadgeView = (CurrencyBadgeView) view;
            return new C9896d4(currencyBadgeView, currencyBadgeView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public CurrencyBadgeView mo3946b() {
        return this.f26897d;
    }
}
