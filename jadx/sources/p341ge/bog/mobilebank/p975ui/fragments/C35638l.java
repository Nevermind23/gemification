package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import g91.C32303f;
import java.util.Iterator;
import p341ge.bog.mobilebank.model.Bond;
import p341ge.bog.mobilebank.model.CashAgreement;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.fragments.l */
public class C35638l extends C35651n1 {

    /* renamed from: d */
    private ViewGroup f86174d;

    /* renamed from: e */
    private Bond f86175e;

    /* renamed from: j1 */
    private void m105849j1() {
        this.f86174d.removeAllViews();
        Iterator<CashAgreement> it = this.f86175e.getCashAgreements().iterator();
        while (it.hasNext()) {
            CashAgreement next = it.next();
            View inflate = getActivity().getLayoutInflater().inflate(C10324m.cash_item_layout, (ViewGroup) null, false);
            ((BogTextView) inflate.findViewById(C10322k.f28915yx)).setText(C32303f.m95204o(next.getQuantity().doubleValue()) + C32303f.m95198i(next.getCcy(), true));
            ((BogTextView) inflate.findViewById(C10322k.f28808Ya)).setText(next.getNote());
            if (this.f86175e.getCashAgreements().lastIndexOf(next) == this.f86175e.getCashAgreements().size() - 1) {
                inflate.findViewById(C10322k.item_divider).setVisibility(8);
            }
            this.f86174d.addView(inflate);
        }
    }

    /* renamed from: i1 */
    public void mo86723i1(Bond bond) {
        this.f86175e = bond;
        if (getContext() != null) {
            m105849j1();
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_cash_details;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86174d = (ViewGroup) view.findViewById(C10322k.f28868mb);
        if (this.f86175e != null) {
            m105849j1();
        }
    }
}
