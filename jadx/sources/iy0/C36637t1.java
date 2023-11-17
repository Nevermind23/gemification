package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.PiggyBankCardView;

/* renamed from: iy0.t1 */
public final class C36637t1 implements C6201a {

    /* renamed from: d */
    private final PiggyBankCardView f88431d;

    private C36637t1(PiggyBankCardView piggyBankCardView) {
        this.f88431d = piggyBankCardView;
    }

    /* renamed from: a */
    public static C36637t1 m108683a(View view) {
        if (view != null) {
            return new C36637t1((PiggyBankCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36637t1 m108684d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_piggy_bank_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108683a(inflate);
    }

    /* renamed from: c */
    public PiggyBankCardView mo3946b() {
        return this.f88431d;
    }
}
