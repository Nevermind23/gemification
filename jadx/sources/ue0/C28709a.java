package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;

/* renamed from: ue0.a */
public final class C28709a implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f73106d;

    /* renamed from: e */
    public final AccountSelectorItemView f73107e;

    private C28709a(AccountSelectorItemView accountSelectorItemView, AccountSelectorItemView accountSelectorItemView2) {
        this.f73106d = accountSelectorItemView;
        this.f73107e = accountSelectorItemView2;
    }

    /* renamed from: a */
    public static C28709a m87952a(View view) {
        if (view != null) {
            AccountSelectorItemView accountSelectorItemView = (AccountSelectorItemView) view;
            return new C28709a(accountSelectorItemView, accountSelectorItemView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28709a m87953d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.account_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87952a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f73106d;
    }
}
