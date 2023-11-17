package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.AccountCardView;

/* renamed from: iy0.g0 */
public final class C36597g0 implements C6201a {

    /* renamed from: d */
    private final AccountCardView f88207d;

    /* renamed from: e */
    public final AccountCardView f88208e;

    private C36597g0(AccountCardView accountCardView, AccountCardView accountCardView2) {
        this.f88207d = accountCardView;
        this.f88208e = accountCardView2;
    }

    /* renamed from: a */
    public static C36597g0 m108515a(View view) {
        if (view != null) {
            AccountCardView accountCardView = (AccountCardView) view;
            return new C36597g0(accountCardView, accountCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36597g0 m108516d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_card_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108515a(inflate);
    }

    /* renamed from: c */
    public AccountCardView mo3946b() {
        return this.f88207d;
    }
}
