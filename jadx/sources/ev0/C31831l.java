package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.accountcardclear.AccountCardClearView;

/* renamed from: ev0.l */
public final class C31831l implements C6201a {

    /* renamed from: d */
    private final AccountCardClearView f78528d;

    private C31831l(AccountCardClearView accountCardClearView) {
        this.f78528d = accountCardClearView;
    }

    /* renamed from: a */
    public static C31831l m94113a(View view) {
        if (view != null) {
            return new C31831l((AccountCardClearView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31831l m94114d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_account_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94113a(inflate);
    }

    /* renamed from: c */
    public AccountCardClearView mo3946b() {
        return this.f78528d;
    }
}
