package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import x11.C39772e;

/* renamed from: b31.n */
public final class C31125n implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f77357d;

    private C31125n(AccountSelectorItemView accountSelectorItemView) {
        this.f77357d = accountSelectorItemView;
    }

    /* renamed from: a */
    public static C31125n m92619a(View view) {
        if (view != null) {
            return new C31125n((AccountSelectorItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31125n m92620d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.item_selector_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92619a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f77357d;
    }
}
