package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;

/* renamed from: pr0.y */
public final class C37974y implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f91279d;

    private C37974y(AccountSelectorItemView accountSelectorItemView) {
        this.f91279d = accountSelectorItemView;
    }

    /* renamed from: a */
    public static C37974y m111641a(View view) {
        if (view != null) {
            return new C37974y((AccountSelectorItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37974y m111642d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_repayment_account_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111641a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f91279d;
    }
}
