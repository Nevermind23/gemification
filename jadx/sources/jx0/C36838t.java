package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;

/* renamed from: jx0.t */
public final class C36838t implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88902d;

    /* renamed from: e */
    public final CreditCardSmallPickerView f88903e;

    private C36838t(LinearLayout linearLayout, CreditCardSmallPickerView creditCardSmallPickerView) {
        this.f88902d = linearLayout;
        this.f88903e = creditCardSmallPickerView;
    }

    /* renamed from: a */
    public static C36838t m109164a(View view) {
        int i = C32024d.select;
        CreditCardSmallPickerView creditCardSmallPickerView = (CreditCardSmallPickerView) C6202b.m24689a(view, i);
        if (creditCardSmallPickerView != null) {
            return new C36838t((LinearLayout) view, creditCardSmallPickerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36838t m109165d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_card_chooser, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109164a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88902d;
    }
}
