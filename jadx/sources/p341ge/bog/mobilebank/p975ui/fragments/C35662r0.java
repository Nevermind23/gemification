package p341ge.bog.mobilebank.p975ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32303f;
import g91.C32343x;
import iu0.C36546y;
import java.util.HashMap;
import p341ge.bog.mobilebank.model.LoanInvoice;
import p341ge.bog.mobilebank.model.loans.AcctRefEntity;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.model.loans.PLNDetails;
import p341ge.bog.mobilebank.p975ui.activities.RenameAccountActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27428t3;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.r0 */
public class C35662r0 extends C35651n1 {

    /* renamed from: d */
    private C27428t3 f86215d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Loan f86216e;

    /* renamed from: f */
    private LoanDetailsWrapper f86217f;

    /* renamed from: ge.bog.mobilebank.ui.fragments.r0$a */
    class C35663a implements View.OnClickListener {
        C35663a() {
        }

        public void onClick(View view) {
            if (C35662r0.this.f86216e != null) {
                C36546y.m108282F().mo27152s("loans", "edit_name", "click");
                C35662r0 r0Var = C35662r0.this;
                RenameAccountActivity.m104745K2(r0Var, r0Var.f86216e.getLoanName(), C35662r0.this.f86216e.getLoanType(), 3, C35662r0.this.f86216e.getLoanKey(), C10328q.common_text_loan_name);
            }
        }
    }

    /* renamed from: k1 */
    private void m105898k1() {
        boolean z;
        if (this.f86216e.acctRef == AcctRefEntity.COSIGNER) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95477p1(this.f86215d.f69836F, z);
        C32343x.m95477p1(this.f86215d.f69843z, !z);
        C32343x.m95477p1(this.f86215d.f69831A, !z);
        C32343x.m95477p1(this.f86215d.f69832B, !z);
        this.f86215d.f69836F.setTitleText(C27950a.m86284a("text.loans.cosigner.info.title"));
        this.f86215d.f69836F.setCaptionText(C27950a.m86284a("text.loans.cosigner.info.desc"));
    }

    /* renamed from: m1 */
    private void m105899m1() {
        boolean z;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("loanKey", String.valueOf(this.f86216e.getLoanKey()));
        String str2 = this.f86216e.getLoanKey() + ".pdf";
        PLNDetails plnDetails = this.f86216e.getDetails().getPlnDetails();
        if (plnDetails == null || plnDetails.fileId == null || plnDetails.fileUrl == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = BankApi.LOANS_GET_PLN_AGREEMENT_PDF;
        } else {
            str = BankApi.LOANS_GET_AGREEMENT_PDF;
        }
        C32303f.m95196g(RetrofitClient.getUrlWithExtras(str, hashMap), this, str2, "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public /* synthetic */ void m105900n1(View view) {
        m105899m1();
    }

    /* renamed from: o1 */
    private void m105901o1() {
        this.f86215d.mo66728D(" " + C32303f.m95197h(this.f86216e.getCcy()));
        this.f86215d.mo66729E(this.f86217f);
        this.f86215d.mo66730F(this.f86216e);
        this.f86215d.f69837G.removeAllViews();
        if (this.f86217f.getInvoice() != null) {
            for (LoanInvoice loanInvoice : this.f86217f.getInvoice().getList()) {
                View inflate = LayoutInflater.from(getContext()).inflate(C10324m.product_details_key_value_layout, (ViewGroup) null);
                this.f86215d.f69837G.addView(inflate);
                ((BogTextView) inflate.findViewById(C10322k.details_key_tv)).setText(C27950a.m86286c(loanInvoice.getInvoiceTypeDictionaryKey(), false));
                ((BogTextView) inflate.findViewById(C10322k.details_value_tv)).setText(C32303f.m95204o(loanInvoice.getAmount().doubleValue()) + C32303f.m95198i(loanInvoice.getCcy(), true));
            }
        }
        m105898k1();
    }

    /* renamed from: l1 */
    public void mo86753l1(Loan loan, LoanDetailsWrapper loanDetailsWrapper) {
        this.f86216e = loan;
        this.f86217f = loanDetailsWrapper;
        if (this.f86215d != null) {
            m105901o1();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            this.f86216e.setLoanName(intent.getStringExtra("ACCOUNT_NAME"));
            this.mClient.refreshLoansEvent();
            this.mClient.requestLoans(false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f86215d = C27428t3.m85020B(layoutInflater, viewGroup, false);
        if (!(this.f86216e == null || this.f86217f == null)) {
            m105901o1();
        }
        return this.f86215d.mo3946b();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016) {
            m105899m1();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86215d.f69835E.setOnClickListener(new C35663a());
        this.f86215d.f69838H.setOnClickListener(new C35659q0(this));
    }
}
