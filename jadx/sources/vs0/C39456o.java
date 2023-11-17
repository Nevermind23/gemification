package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import rs0.C38337d;

/* renamed from: vs0.o */
public final class C39456o implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f93833d;

    private C39456o(AccountSelectorItemView accountSelectorItemView) {
        this.f93833d = accountSelectorItemView;
    }

    /* renamed from: a */
    public static C39456o m114679a(View view) {
        if (view != null) {
            return new C39456o((AccountSelectorItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C39456o m114680d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.item_piggy_bank_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114679a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f93833d;
    }
}
