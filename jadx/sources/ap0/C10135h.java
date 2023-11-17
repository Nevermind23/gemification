package ap0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import wo0.C18653c;

/* renamed from: ap0.h */
public final class C10135h implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f28103d;

    /* renamed from: e */
    public final AccountSelectorItemView f28104e;

    private C10135h(AccountSelectorItemView accountSelectorItemView, AccountSelectorItemView accountSelectorItemView2) {
        this.f28103d = accountSelectorItemView;
        this.f28104e = accountSelectorItemView2;
    }

    /* renamed from: a */
    public static C10135h m37068a(View view) {
        if (view != null) {
            AccountSelectorItemView accountSelectorItemView = (AccountSelectorItemView) view;
            return new C10135h(accountSelectorItemView, accountSelectorItemView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C10135h m37069d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18653c.item_account_p2p, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37068a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f28103d;
    }
}
