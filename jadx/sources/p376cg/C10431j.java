package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import p653wf.C18589r;

/* renamed from: cg.j */
public final class C10431j implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f29696d;

    /* renamed from: e */
    public final AccountSelectorItemView f29697e;

    private C10431j(AccountSelectorItemView accountSelectorItemView, AccountSelectorItemView accountSelectorItemView2) {
        this.f29696d = accountSelectorItemView;
        this.f29697e = accountSelectorItemView2;
    }

    /* renamed from: a */
    public static C10431j m37888a(View view) {
        if (view != null) {
            AccountSelectorItemView accountSelectorItemView = (AccountSelectorItemView) view;
            return new C10431j(accountSelectorItemView, accountSelectorItemView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C10431j m37889d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.item_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37888a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f29696d;
    }
}
