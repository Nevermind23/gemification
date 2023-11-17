package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.productcards.AccountCardView;

/* renamed from: iy0.v */
public final class C36641v implements C6201a {

    /* renamed from: d */
    private final AccountCardView f88439d;

    /* renamed from: e */
    public final AccountCardView f88440e;

    private C36641v(AccountCardView accountCardView, AccountCardView accountCardView2) {
        this.f88439d = accountCardView;
        this.f88440e = accountCardView2;
    }

    /* renamed from: a */
    public static C36641v m108699a(View view) {
        if (view != null) {
            AccountCardView accountCardView = (AccountCardView) view;
            return new C36641v(accountCardView, accountCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36641v m108700d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.grid_item_account_card_square, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108699a(inflate);
    }

    /* renamed from: c */
    public AccountCardView mo3946b() {
        return this.f88439d;
    }
}
