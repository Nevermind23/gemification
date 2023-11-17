package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountselector.AccountSelectorItemView;
import y71.C40031e;

/* renamed from: z71.l */
public final class C40185l implements C6201a {

    /* renamed from: d */
    private final AccountSelectorItemView f95543d;

    private C40185l(AccountSelectorItemView accountSelectorItemView) {
        this.f95543d = accountSelectorItemView;
    }

    /* renamed from: a */
    public static C40185l m116447a(View view) {
        if (view != null) {
            return new C40185l((AccountSelectorItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40185l m116448d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_insurance_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116447a(inflate);
    }

    /* renamed from: c */
    public AccountSelectorItemView mo3946b() {
        return this.f95543d;
    }
}
