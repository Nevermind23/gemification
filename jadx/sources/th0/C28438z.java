package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;

/* renamed from: th0.z */
public final class C28438z implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f72237d;

    private C28438z(AccountSelectorItemView accountSelectorItemView) {
        this.f72237d = accountSelectorItemView;
    }

    /* renamed from: a */
    public static C28438z m87274a(View view) {
        if (view != null) {
            return new C28438z((AccountSelectorItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28438z m87275d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87274a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f72237d;
    }
}
