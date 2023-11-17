package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetBannerView;

/* renamed from: iy0.f1 */
public final class C36595f1 implements C6201a {

    /* renamed from: d */
    private final CreditCardWidgetBannerView f88193d;

    private C36595f1(CreditCardWidgetBannerView creditCardWidgetBannerView) {
        this.f88193d = creditCardWidgetBannerView;
    }

    /* renamed from: a */
    public static C36595f1 m108506a(View view) {
        if (view != null) {
            return new C36595f1((CreditCardWidgetBannerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36595f1 m108507d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_card_insurance_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108506a(inflate);
    }

    /* renamed from: c */
    public CreditCardWidgetBannerView mo3946b() {
        return this.f88193d;
    }
}
