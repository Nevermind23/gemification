package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetDoubleButtonView;

/* renamed from: iy0.h0 */
public final class C36600h0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88248d;

    /* renamed from: e */
    public final CreditCardWidgetDoubleButtonView f88249e;

    private C36600h0(ConstraintLayout constraintLayout, CreditCardWidgetDoubleButtonView creditCardWidgetDoubleButtonView) {
        this.f88248d = constraintLayout;
        this.f88249e = creditCardWidgetDoubleButtonView;
    }

    /* renamed from: a */
    public static C36600h0 m108528a(View view) {
        int i = C36271e.card_widget;
        CreditCardWidgetDoubleButtonView creditCardWidgetDoubleButtonView = (CreditCardWidgetDoubleButtonView) C6202b.m24689a(view, i);
        if (creditCardWidgetDoubleButtonView != null) {
            return new C36600h0((ConstraintLayout) view, creditCardWidgetDoubleButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36600h0 m108529d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_card_widget, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108528a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88248d;
    }
}
