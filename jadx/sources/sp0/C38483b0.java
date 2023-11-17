package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import np0.C37440f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;

/* renamed from: sp0.b0 */
public final class C38483b0 implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f92172d;

    private C38483b0(AccountSelectorItemView accountSelectorItemView) {
        this.f92172d = accountSelectorItemView;
    }

    /* renamed from: a */
    public static C38483b0 m112944a(View view) {
        if (view != null) {
            return new C38483b0((AccountSelectorItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C38483b0 m112945d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.list_item_loan_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112944a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f92172d;
    }
}
