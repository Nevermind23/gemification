package p341ge.bog.mobilebank.p975ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import g81.C32187i;
import g91.C32297d;
import hd1.C41205b;
import j81.C36761c;
import java.util.ArrayList;
import java.util.Iterator;
import jg1.C41452l;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.eventbus.events.DDSTOListEvent;
import p341ge.bog.mobilebank.eventbus.events.TerminateDDSTOEvent;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.payment.activities.DDFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.a0 */
public class C35574a0 extends C35651n1 implements C36761c {

    /* renamed from: d */
    private RecyclerView f86022d;

    /* renamed from: e */
    private View f86023e;

    /* renamed from: f */
    private SwipeRefreshLayout f86024f;

    /* renamed from: g */
    private int f86025g;

    /* renamed from: h */
    private C32187i f86026h;

    /* renamed from: i */
    private DDSTOListEvent f86027i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public RootEvent f86028j;

    /* renamed from: ge.bog.mobilebank.ui.fragments.a0$a */
    class C35575a implements SwipeRefreshLayout.C1862j {
        C35575a() {
        }

        /* renamed from: v */
        public void mo6203v() {
            C35574a0.this.mo86637s1();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.a0$b */
    class C35576b extends RestCallback {
        C35576b() {
        }

        public void onEnqueue(C41205b bVar) {
            C35574a0.this.addDisposable(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            C35574a0.this.f86028j = null;
            C35574a0.this.m105691t1();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            C35574a0.this.f86028j = null;
            if (bankApiResponse.isSuccess()) {
                C35574a0.this.mClient.onDDSTOList(bankApiResponse);
            }
            C35574a0.this.m105691t1();
        }
    }

    /* renamed from: n1 */
    private void m105686n1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int i = this.f86025g;
        if (i == 10) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DDSTO ddsto = (DDSTO) it.next();
                if ("DEB".equals(ddsto.productCode)) {
                    arrayList2.add(ddsto);
                }
            }
        } else if (i == 20) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                DDSTO ddsto2 = (DDSTO) it2.next();
                if ("BILL".equals(ddsto2.productCode) || "STO".equals(ddsto2.productCode)) {
                    arrayList2.add(ddsto2);
                }
            }
        }
        this.f86026h.mo72714o(arrayList2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m105687o1(DDSTO ddsto, C13310d dVar, Button button) {
        String str = ddsto.productCode;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 67553:
                if (str.equals("DEB")) {
                    c = 0;
                    break;
                }
                break;
            case 82446:
                if (str.equals("STO")) {
                    c = 1;
                    break;
                }
                break;
            case 2038791:
                if (str.equals("BILL")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mClient.terminatePayment(ddsto.paymentId, "DEB");
                dVar.mo4577k1();
                return;
            case 1:
                this.mClient.terminateSTO(ddsto.paymentId, "STO");
                dVar.mo4577k1();
                return;
            case 2:
                this.mClient.terminateBill(ddsto.paymentId, "BILL");
                dVar.mo4577k1();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m105689q1(View view) {
        this.mClient.requestDDSTO(true);
    }

    /* renamed from: r1 */
    public static C35574a0 m105690r1(int i) {
        C35574a0 a0Var = new C35574a0();
        a0Var.f86025g = i;
        return a0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public void m105691t1() {
        boolean z;
        int i;
        RootEvent rootEvent;
        SwipeRefreshLayout swipeRefreshLayout = this.f86024f;
        int i2 = 0;
        if (this.f86027i.getState() == 10 || ((rootEvent = this.f86028j) != null && rootEvent.getState() == 10)) {
            z = true;
        } else {
            z = false;
        }
        swipeRefreshLayout.setRefreshing(z);
        View view = this.f86023e;
        if (this.f86027i.getState() == 30 || this.f86027i.getState() == 40) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        RecyclerView recyclerView = this.f86022d;
        if (!(this.f86027i.getState() == 20 || this.f86027i.getState() == 10)) {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
    }

    /* renamed from: l */
    public void mo86633l(DDSTO ddsto, int i) {
        if (ddsto != null && !this.f86024f.mo6147i()) {
            if (i == 10) {
                C13310d dVar = new C13310d();
                dVar.mo35648c2(getResources().getString(C10328q.f28931K0));
                dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
                dVar.mo35639Q1(getResources().getString(C10328q.f28923E1));
                dVar.mo35646Z1(getResources().getString(C10328q.f28924F0));
                dVar.mo35645Y1(new C35684y(this, ddsto, dVar));
                dVar.mo35642U1(getResources().getString(C10328q.f28932M0));
                dVar.mo35641T1(new C35686z(dVar));
                dVar.mo4576A1(requireActivity().getSupportFragmentManager(), "Alert");
            } else if (i == 20) {
                String str = ddsto.productCode;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case 67553:
                        if (str.equals("DEB")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 82446:
                        if (str.equals("STO")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 2038791:
                        if (str.equals("BILL")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        C33624a.m98714b(this).mo79806f(DDFormActivity.class).mo79811k(ddsto).mo79825y();
                        return;
                    case 1:
                    case 2:
                        mo86636p0(ddsto);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_dd_sto_list;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @C41452l
    public void onDDSTOList(DDSTOListEvent dDSTOListEvent) {
        if (dDSTOListEvent != this.f86027i) {
            this.f86027i = dDSTOListEvent;
            int state = dDSTOListEvent.getState();
            if (state != 10) {
                if (state == 20) {
                    m105686n1(dDSTOListEvent.getList());
                } else if (state == 40) {
                    C32297d.m95154b(getActivity(), C27950a.m86284a(dDSTOListEvent.getErrorKey()));
                }
            } else if (dDSTOListEvent.getList() != null) {
                m105686n1(dDSTOListEvent.getList());
            }
        }
        m105691t1();
    }

    @C41452l
    public void onDDSTOTerminateEvent(TerminateDDSTOEvent terminateDDSTOEvent) {
        int state = terminateDDSTOEvent.getState();
        if (state == 20) {
            C32297d.m95160h(getActivity(), getString(C10328q.f28956f2));
            this.mClient.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
        } else if (state == 30) {
            this.mClient.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
        } else if (state == 40) {
            C32297d.m95154b(getActivity(), C27950a.m86284a(terminateDDSTOEvent.getErrorKey()));
            this.mClient.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
        }
    }

    public void onStart() {
        super.onStart();
        this.mEventBus.mo96185q(this);
        this.mClient.requestDDSTO(false);
        this.mClient.requestTerminateDDSTOEvent();
    }

    public void onStop() {
        super.onStop();
        this.mEventBus.mo96186s(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86022d = (RecyclerView) view.findViewById(C10322k.f28712Br);
        this.f86023e = view.findViewById(C10322k.f28776Oc);
        this.f86024f = (SwipeRefreshLayout) view.findViewById(C10322k.f28739Gw);
        view.findViewById(C10322k.horizontal_error_retry_button).setOnClickListener(new C35680x(this));
        this.f86026h = new C32187i(getContext(), this, this.f86025g);
        this.f86022d.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.f86022d.setAdapter(this.f86026h);
        this.f86024f.setOnRefreshListener(new C35575a());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r2.equals("STO") == false) goto L_0x0014;
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86636p0(p341ge.bog.mobilebank.model.ddsto.DDSTO r10) {
        /*
            r9 = this;
            r0 = 10019(0x2723, float:1.404E-41)
            r1 = 1
            if (r10 == 0) goto L_0x005b
            java.lang.String r2 = r10.productCode
            r2.hashCode()
            int r3 = r2.hashCode()
            java.lang.String r4 = "STO"
            r5 = -1
            switch(r3) {
                case 67553: goto L_0x0028;
                case 82446: goto L_0x0021;
                case 2038791: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r1 = r5
            goto L_0x0032
        L_0x0016:
            java.lang.String r1 = "BILL"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r1 = 2
            goto L_0x0032
        L_0x0021:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0032
            goto L_0x0014
        L_0x0028:
            java.lang.String r1 = "DEB"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0031
            goto L_0x0014
        L_0x0031:
            r1 = 0
        L_0x0032:
            switch(r1) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0037;
                case 2: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x00aa
        L_0x0037:
            java.lang.String r1 = "VIEW"
            ge.bog.mobilebank.transfers.model.TransferForm$I r1 = p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((androidx.fragment.app.Fragment) r9, (java.lang.String) r4, (java.lang.String) r1)
            ge.bog.mobilebank.transfers.model.TransferForm$I r10 = r1.setSto(r10)
            ge.bog.mobilebank.transfers.model.TransferForm$I r10 = r10.setRequestCode(r0)
            r10.start()
            goto L_0x00aa
        L_0x0049:
            ge.bog.mobilebank.payment.model.a$a r0 = p341ge.bog.mobilebank.payment.model.C33624a.m98714b(r9)
            java.lang.Class<ge.bog.mobilebank.payment.activities.DDFormActivity> r1 = p341ge.bog.mobilebank.payment.activities.DDFormActivity.class
            ge.bog.mobilebank.payment.model.a$a r0 = r0.mo79806f(r1)
            ge.bog.mobilebank.payment.model.a$a r10 = r0.mo79811k(r10)
            r10.mo79825y()
            goto L_0x00aa
        L_0x005b:
            int r10 = r9.f86025g
            r2 = 10
            if (r10 == r2) goto L_0x0085
            r1 = 20
            if (r10 == r1) goto L_0x0066
            goto L_0x00aa
        L_0x0066:
            ck.g r2 = iu0.C36546y.m108282F()
            java.lang.String r3 = "more_automatic_services"
            java.lang.String r4 = "click"
            java.lang.String r5 = "add_transfer"
            r6 = 0
            ck.h$a r7 = p380ck.C10464h.C10465a.FACEBOOKANDFIREBASE
            r2.mo27137H(r3, r4, r5, r6, r7)
            android.content.Intent r10 = new android.content.Intent
            android.content.Context r1 = r9.getContext()
            java.lang.Class<ge.bog.mobilebank.ui.activities.STOTypeListActivity> r2 = p341ge.bog.mobilebank.p975ui.activities.STOTypeListActivity.class
            r10.<init>(r1, r2)
            r9.startActivityForResult(r10, r0)
            goto L_0x00aa
        L_0x0085:
            ck.g r3 = iu0.C36546y.m108282F()
            java.lang.String r4 = "more_automatic_services"
            java.lang.String r5 = "click"
            java.lang.String r6 = "add_payment"
            r7 = 0
            ck.h$a r8 = p380ck.C10464h.C10465a.FACEBOOKANDFIREBASE
            r3.mo27137H(r4, r5, r6, r7, r8)
            android.content.Intent r10 = new android.content.Intent
            android.content.Context r0 = r9.getContext()
            java.lang.Class<ge.bog.mobilebank.ui.activities.ProviderListActivity> r2 = p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity.class
            r10.<init>(r0, r2)
            java.lang.String r0 = "PROVIDER_LIST_SHOW_DD"
            r10.putExtra(r0, r1)
            r0 = 10020(0x2724, float:1.4041E-41)
            r9.startActivityForResult(r10, r0)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.fragments.C35574a0.mo86636p0(ge.bog.mobilebank.model.ddsto.DDSTO):void");
    }

    /* renamed from: s1 */
    public void mo86637s1() {
        RootEvent rootEvent = new RootEvent();
        this.f86028j = rootEvent;
        rootEvent.setState(10);
        this.mBankApi.getDDSTOList(new C35576b());
    }
}
