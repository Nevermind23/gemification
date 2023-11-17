package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32240l;
import p341ge.bog.mobilebank.p975ui.activities.ManageAccountsAndCardsActivity;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.fragments.t0 */
public class C35671t0 extends C35651n1 {

    /* renamed from: d */
    private RecyclerView f86241d;

    /* renamed from: e */
    C32240l f86242e;

    /* renamed from: f */
    private boolean f86243f;

    /* renamed from: g */
    private boolean f86244g;

    /* renamed from: i1 */
    private ManageAccountsAndCardsActivity m105939i1() {
        return (ManageAccountsAndCardsActivity) getActivity();
    }

    /* renamed from: j1 */
    private void m105940j1() {
        this.f86242e = new C32240l(getActivity());
        this.f86241d.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f86241d.setAdapter(this.f86242e);
        this.f86242e.mo72760g(m105939i1().mo86246V2());
    }

    /* renamed from: k1 */
    public void mo86768k1() {
        this.f86243f = true;
        if (this.f86244g) {
            m105940j1();
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_manage_accounts;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86241d = (RecyclerView) view.findViewById(C10322k.manage_acct_recycler_view);
        this.f86244g = true;
        if (this.f86243f) {
            m105940j1();
        }
    }
}
