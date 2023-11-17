package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.LoanCardView;

/* renamed from: iy0.q1 */
public final class C36628q1 implements C6201a {

    /* renamed from: d */
    private final LoanCardView f88395d;

    private C36628q1(LoanCardView loanCardView) {
        this.f88395d = loanCardView;
    }

    /* renamed from: a */
    public static C36628q1 m108647a(View view) {
        if (view != null) {
            return new C36628q1((LoanCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36628q1 m108648d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_loan_card_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108647a(inflate);
    }

    /* renamed from: c */
    public LoanCardView mo3946b() {
        return this.f88395d;
    }
}
