package p341ge.bog.mobilebank.p975ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import de1.C40640a;
import g91.C32303f;
import gd1.C40992a;
import hd1.C41205b;
import iu0.C36546y;
import java.util.HashMap;
import java.util.Iterator;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.deposits.DepositDetails;
import p341ge.bog.mobilebank.model.deposits.DepositMaximaDetailsInfo;
import p341ge.bog.mobilebank.model.deposits.DepositMaximaWrapper;
import p341ge.bog.mobilebank.p975ui.activities.RenameAccountActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p895sy.C28290a;
import p90.C27410r3;
import p906ty.C28530h;
import p961yy.C30123a;
import q31.C38122f;
import q31.C38125h;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.h0 */
public class C35606h0 extends C35650n0 {

    /* renamed from: g */
    protected C30123a f86091g;

    /* renamed from: h */
    protected C28290a f86092h;

    /* renamed from: i */
    private C27410r3 f86093i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Deposit f86094j;

    /* renamed from: k */
    private DepositDetails f86095k;

    /* renamed from: l */
    private DepositMaximaWrapper f86096l;

    /* renamed from: m */
    private BonusWrapperUiModel f86097m;

    /* renamed from: ge.bog.mobilebank.ui.fragments.h0$a */
    class C35607a implements View.OnClickListener {
        C35607a() {
        }

        public void onClick(View view) {
            C36546y.m108282F().mo27152s("deposits", "", "edit_name");
            C35606h0 h0Var = C35606h0.this;
            RenameAccountActivity.m104745K2(h0Var, h0Var.f86094j.getName(), C35606h0.this.f86094j.getProdType(), 4, C35606h0.this.f86094j.getAgreeKey(), C10328q.common_text_deposit_name);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.h0$b */
    class C35608b implements View.OnClickListener {
        C35608b() {
        }

        public void onClick(View view) {
            C35606h0.this.m105758q1();
        }
    }

    /* renamed from: o1 */
    private void m105756o1() {
        boolean z;
        this.f86093i.f69672C.removeAllViews();
        BonusWrapperUiModel bonusWrapperUiModel = this.f86097m;
        if (bonusWrapperUiModel == null || bonusWrapperUiModel.mo52794e() == null) {
            z = false;
        } else {
            z = false;
            int i = 0;
            for (BonusCasServiceUiModel bonusCasServiceUiModel : this.f86097m.mo52794e()) {
                if (bonusCasServiceUiModel.mo52711b().longValue() == this.f86094j.getAgreeKey()) {
                    View inflate = LayoutInflater.from(getContext()).inflate(C10324m.account_deposit_loan_item, (ViewGroup) null);
                    String a = C27950a.m86284a(bonusCasServiceUiModel.mo52712d());
                    String k = C32303f.m95200k(bonusCasServiceUiModel.mo52721j().doubleValue(), bonusCasServiceUiModel.mo52718h());
                    ((BogTextView) inflate.findViewById(C10322k.account_deposit_loan_item_name)).setText(a);
                    ((BogTextView) inflate.findViewById(C10322k.account_deposit_loan_item_amount)).setText(k);
                    inflate.setTag(Integer.valueOf(i));
                    inflate.setOnClickListener(new C35592d0(this, bonusCasServiceUiModel));
                    this.f86093i.f69672C.addView(inflate);
                    z = true;
                }
                i++;
            }
        }
        if (z) {
            this.f86093i.f69671B.setVisibility(0);
        } else {
            this.f86093i.f69671B.setVisibility(8);
        }
    }

    /* renamed from: p1 */
    private void m105757p1() {
        this.f86093i.f69675F.removeAllViews();
        Iterator<DepositMaximaDetailsInfo> it = this.f86094j.getMaximaDetails().getDetailsInfo().iterator();
        while (it.hasNext()) {
            DepositMaximaDetailsInfo next = it.next();
            View inflate = LayoutInflater.from(getContext()).inflate(C10324m.layout_maxima_details_info, (ViewGroup) null);
            String i = C32303f.m95198i(next.getCcy(), true);
            ((BogTextView) inflate.findViewById(C10322k.maxima_details_info_percent_tv)).setText(C32303f.m95204o(next.getInterestRate().doubleValue()) + " %");
            ((BogTextView) inflate.findViewById(C10322k.maxima_details_info_amount_tv)).setText(C32303f.m95204o(next.getCurrentBalance().doubleValue()) + i);
            ((BogTextView) inflate.findViewById(C10322k.maxima_details_info_added_amount_tv)).setText(C32303f.m95204o(next.getIntAccrued().doubleValue()) + i);
            this.f86093i.f69675F.addView(inflate);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public void m105758q1() {
        HashMap hashMap = new HashMap();
        hashMap.put("agreeKey", String.valueOf(this.f86094j.getAgreeKey()));
        C32303f.m95195f(RetrofitClient.getUrlWithExtras(BankApi.DEPOSITS_GET_AGREEMENT_PDF, hashMap), getActivity(), String.valueOf(this.f86094j.getAgreeKey()) + ".pdf", "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public /* synthetic */ void m105759r1(BonusCasServiceUiModel bonusCasServiceUiModel, View view) {
        long j;
        Long e = bonusCasServiceUiModel.mo52714e();
        C38122f c = C38125h.m112238c(requireActivity());
        Context requireContext = requireContext();
        if (e == null) {
            j = -1;
        } else {
            j = e.longValue();
        }
        c.mo91609i0(requireContext, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public void m105760s1(C28530h hVar) {
        this.f86097m = this.f86091g.mo70417h(hVar);
        m105756o1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public void m105761t1(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public void m105762u1(C41205b bVar) {
    }

    /* renamed from: v1 */
    private void m105763v1() {
        C27410r3 r3Var = this.f86093i;
        r3Var.mo66707D(" " + C32303f.m95197h(this.f86094j.getCcy()));
        this.f86093i.mo66708E(this.f86094j);
        this.f86093i.mo66709F(this.f86095k);
        this.f86093i.mo66710G(this.f86096l);
        DepositMaximaWrapper depositMaximaWrapper = this.f86096l;
        if (depositMaximaWrapper == null || depositMaximaWrapper.getDetailsInfo() == null || this.f86096l.getDetailsInfo().size() <= 0) {
            this.f86093i.f69674E.setVisibility(8);
        } else {
            this.f86093i.f69674E.setVisibility(0);
        }
        if (this.f86093i.f69674E.getVisibility() == 0) {
            m105757p1();
        }
        m105756o1();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            this.f86094j.setName(intent.getStringExtra("ACCOUNT_NAME"));
            this.mClient.refreshDepositsEvent();
            this.mClient.requestDepositBonds(false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27410r3 B = C27410r3.m84944B(layoutInflater, viewGroup, false);
        this.f86093i = B;
        this.rootView = B.mo3946b();
        if (!(this.f86094j == null || (this.f86095k == null && this.f86096l == null))) {
            m105763v1();
        }
        return this.rootView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86093i = null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016 && C32303f.m95190a(iArr)) {
            m105758q1();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86093i.f69673D.setOnClickListener(new C35607a());
        this.f86093i.f69676G.setOnClickListener(new C35608b());
        addDisposable(this.f86092h.mo67918a(false).mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94980F(new C35595e0(this)).mo94983G0(new C35598f0(this), new C35603g0(this)));
    }
}
