package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32303f;
import java.util.HashMap;
import p341ge.bog.mobilebank.model.DepositBond;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p90.C27392p3;

/* renamed from: ge.bog.mobilebank.ui.fragments.c0 */
public class C35589c0 extends C35651n1 {

    /* renamed from: d */
    private C27392p3 f86066d;

    /* renamed from: e */
    private DepositBond f86067e;

    /* renamed from: j1 */
    private void m105726j1() {
        HashMap hashMap = new HashMap();
        hashMap.put("cdGroupId", String.valueOf(this.f86067e.cdGroupId));
        hashMap.put("prodType", this.f86067e.getProdType());
        C32303f.m95195f(RetrofitClient.getUrlWithExtras(BankApi.BONDS_GET_AGREEMENT_PDF, hashMap), getActivity(), this.f86067e.cdGroupId + ".pdf", "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ void m105727k1(View view) {
        m105726j1();
    }

    /* renamed from: l1 */
    private void m105728l1() {
        this.f86066d.mo66687E(C32303f.m95198i(this.f86067e.getCurrencyCode(), true));
        this.f86066d.mo66686D(this.f86067e);
        String str = "";
        for (int i = 0; i < this.f86067e.getCdsDetails().size(); i++) {
            str = str + this.f86067e.getCdsDetails().get(i).getAgreeNo();
            if (i < this.f86067e.getCdsDetails().size() - 1) {
                str = str + ", ";
            }
        }
        this.f86066d.f69531z.setText(str);
        this.f86066d.f69527A.setOnClickListener(new C35585b0(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27392p3 B = C27392p3.m84872B(layoutInflater, viewGroup, false);
        this.f86066d = B;
        this.rootView = B.mo3946b();
        if (this.f86067e != null) {
            m105728l1();
        }
        return this.rootView;
    }
}
