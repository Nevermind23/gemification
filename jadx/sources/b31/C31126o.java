package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import x11.C39772e;

/* renamed from: b31.o */
public final class C31126o implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f77358d;

    private C31126o(AccountSelectorItemView accountSelectorItemView) {
        this.f77358d = accountSelectorItemView;
    }

    /* renamed from: a */
    public static C31126o m92623a(View view) {
        if (view != null) {
            return new C31126o((AccountSelectorItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31126o m92624d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.list_item_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92623a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f77358d;
    }
}
