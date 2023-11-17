package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.AccountCardView;

/* renamed from: iy0.n1 */
public final class C36619n1 implements C6201a {

    /* renamed from: d */
    private final AccountCardView f88339d;

    private C36619n1(AccountCardView accountCardView) {
        this.f88339d = accountCardView;
    }

    /* renamed from: a */
    public static C36619n1 m108610a(View view) {
        if (view != null) {
            return new C36619n1((AccountCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36619n1 m108611d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_gift_cards_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108610a(inflate);
    }

    /* renamed from: c */
    public AccountCardView mo3946b() {
        return this.f88339d;
    }
}
