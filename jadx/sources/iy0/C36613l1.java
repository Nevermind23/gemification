package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.DepositCardView;

/* renamed from: iy0.l1 */
public final class C36613l1 implements C6201a {

    /* renamed from: d */
    private final DepositCardView f88322d;

    private C36613l1(DepositCardView depositCardView) {
        this.f88322d = depositCardView;
    }

    /* renamed from: a */
    public static C36613l1 m108584a(View view) {
        if (view != null) {
            return new C36613l1((DepositCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36613l1 m108585d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_deposit_card_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108584a(inflate);
    }

    /* renamed from: c */
    public DepositCardView mo3946b() {
        return this.f88322d;
    }
}
