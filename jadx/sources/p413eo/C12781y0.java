package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView;
import p356ao.C10115g;

/* renamed from: eo.y0 */
public final class C12781y0 implements C6201a {

    /* renamed from: d */
    private final CreditCardWidgetBannerView f37895d;

    /* renamed from: e */
    public final CreditCardWidgetBannerView f37896e;

    private C12781y0(CreditCardWidgetBannerView creditCardWidgetBannerView, CreditCardWidgetBannerView creditCardWidgetBannerView2) {
        this.f37895d = creditCardWidgetBannerView;
        this.f37896e = creditCardWidgetBannerView2;
    }

    /* renamed from: a */
    public static C12781y0 m48523a(View view) {
        if (view != null) {
            CreditCardWidgetBannerView creditCardWidgetBannerView = (CreditCardWidgetBannerView) view;
            return new C12781y0(creditCardWidgetBannerView, creditCardWidgetBannerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C12781y0 m48524d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_card_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48523a(inflate);
    }

    /* renamed from: c */
    public CreditCardWidgetBannerView mo3946b() {
        return this.f37895d;
    }
}
