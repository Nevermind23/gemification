package p341ge.bog.mobilebank.p975ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.C1505h;
import de1.C40640a;
import g91.C32297d;
import g91.C32303f;
import g91.C32307h;
import g91.C32319m;
import g91.C32355x0;
import g91.C32359z0;
import gd1.C40992a;
import hd1.C41205b;
import iu0.C36546y;
import java.util.Iterator;
import jg1.C41452l;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.eventbus.events.LoansEvent;
import p341ge.bog.mobilebank.model.CreditMRInsurance;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.p975ui.activities.RenameAccountActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p895sy.C28290a;
import p90.C27409r2;
import p906ty.C28530h;
import p961yy.C30123a;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.t */
public class C35669t extends C35642m0 implements View.OnClickListener {

    /* renamed from: g */
    private final View.OnClickListener f86231g = new C35641m(this);

    /* renamed from: h */
    private C27409r2 f86232h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public CreditCardAccount f86233i;

    /* renamed from: j */
    private LoansEvent f86234j;

    /* renamed from: k */
    private final View.OnClickListener f86235k = new C35649n(this);

    /* renamed from: l */
    protected C30123a f86236l;

    /* renamed from: m */
    protected C28290a f86237m;

    /* renamed from: n */
    private BonusWrapperUiModel f86238n;

    /* renamed from: o */
    TargetEnvironment f86239o;

    /* renamed from: ge.bog.mobilebank.ui.fragments.t$a */
    class C35670a implements View.OnClickListener {
        C35670a() {
        }

        public void onClick(View view) {
            if (C35669t.this.f86233i != null) {
                C36546y.m108282F().mo27152s("credit_cards", "edit_name", "click");
                C35669t tVar = C35669t.this;
                RenameAccountActivity.m104745K2(tVar, tVar.f86233i.getAcctName(), "", 2, C35669t.this.f86233i.getAcctKey(), C10328q.common_text_account_name);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public void m105920A1(C41205b bVar) {
    }

    /* renamed from: B1 */
    private void m105921B1() {
        this.f86232h.mo66706F(C32303f.m95198i(this.f86233i.getCcy(), true));
        this.f86232h.mo66704D(this.f86233i.getBillInfo());
        this.f86232h.mo66705E(this.f86233i);
        m105931r1();
        m105930q1();
        if (this.f86233i.isHasMR()) {
            if (!this.mEventBus.mo96183k(this)) {
                this.mEventBus.mo96185q(this);
            }
            addDisposable(this.f86237m.mo67918a(false).mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94980F(new C35652o(this)).mo94983G0(new C35655p(this), new C35658q(this)));
        }
        this.f86232h.f69655E.setOnClickListener(new C35661r(this));
        this.f86232h.f69661K.setOnClickListener(new C35667s(this));
    }

    /* renamed from: q1 */
    private void m105930q1() {
        boolean z;
        this.f86232h.f69669z.removeAllViews();
        if (this.f86233i.getMrInsurance() == null || this.f86233i.getMrInsurance().size() <= 0) {
            z = false;
        } else {
            Iterator<CreditMRInsurance> it = this.f86233i.getMrInsurance().iterator();
            while (it.hasNext()) {
                CreditMRInsurance next = it.next();
                View inflate = LayoutInflater.from(getContext()).inflate(C10324m.insurance_card_item, (ViewGroup) null);
                String cardTypeName = next.getCardTypeName();
                String A = C32319m.m95281A(next.getExpDate());
                int f = C32307h.m95229f(C32307h.m95227d(next.getCardClass()));
                ImageView imageView = (ImageView) inflate.findViewById(C10322k.insurance_icon_iv);
                imageView.setTag(next.getProductUrl());
                imageView.setOnClickListener(this.f86231g);
                ((BogTextView) inflate.findViewById(C10322k.insurance_card_name_tv)).setText(cardTypeName);
                ((BogTextView) inflate.findViewById(C10322k.card_no_tv)).setText(A);
                ((ImageView) inflate.findViewById(C10322k.insurance_card_icon_iv)).setImageResource(f);
                this.f86232h.f69669z.addView(inflate, new ViewGroup.LayoutParams(-1, C32355x0.m95511b(64.0f, getContext())));
            }
            z = true;
        }
        if (z) {
            this.f86232h.f69651A.setVisibility(0);
        } else {
            this.f86232h.f69651A.setVisibility(8);
        }
    }

    /* renamed from: r1 */
    private void m105931r1() {
        boolean z;
        this.f86232h.f69652B.removeAllViews();
        LoansEvent loansEvent = this.f86234j;
        if (loansEvent == null || loansEvent.getLoansWrapper().getLoans() == null || this.f86234j.getLoansWrapper().getLoans().size() <= 0) {
            z = false;
        } else {
            Iterator<Loan> it = this.f86234j.getLoansWrapper().getLoans().iterator();
            z = false;
            int i = 0;
            while (it.hasNext()) {
                Loan next = it.next();
                if (next.getDetails().getDetails().getLinkAcctKey() == this.f86233i.getAcctKey()) {
                    View inflate = LayoutInflater.from(getContext()).inflate(C10324m.account_deposit_loan_item, (ViewGroup) null);
                    String loanName = next.getLoanName();
                    if (TextUtils.isEmpty(loanName)) {
                        loanName = C27950a.m86284a(next.getProductDictionaryKey());
                    }
                    ((BogTextView) inflate.findViewById(C10322k.account_deposit_loan_item_name)).setText(loanName);
                    ((BogTextView) inflate.findViewById(C10322k.account_deposit_loan_item_amount)).setText(C32303f.m95204o(next.getAmount().doubleValue()) + C32303f.m95198i(next.getCcy(), true));
                    inflate.setOnClickListener(this.f86235k);
                    inflate.setTag(Integer.valueOf(i));
                    this.f86232h.f69652B.addView(inflate);
                    z = true;
                }
                i++;
            }
        }
        if (z) {
            this.f86232h.f69653C.setVisibility(0);
        } else {
            this.f86232h.f69653C.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m105932t1(View view) {
        C32303f.m95184D((String) view.getTag(), getContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public /* synthetic */ void m105933u1(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        Intent intent = new Intent(getContext(), ProductDetailedActivity.class);
        intent.putExtra("PRODUCT_TYPE_KEY", 3);
        intent.putExtra("PRODUCT_INDEX", intValue);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public /* synthetic */ void m105934v1(View view) {
        String populateUrlWithExtraData = RetrofitClient.populateUrlWithExtraData(this.f86239o.getRbMiddleware() + "?" + this.f86233i.fileUrl);
        C1505h requireActivity = requireActivity();
        C32303f.m95195f(populateUrlWithExtraData, requireActivity, "agreement-" + this.f86233i.fileId + ".pdf", "application/pdf");
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public /* synthetic */ void m105935x1(View view) {
        Intent intent = new Intent(getContext(), ProductDetailedActivity.class);
        intent.putExtra("PRODUCT_TYPE_KEY", 8);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public void m105936y1(C28530h hVar) {
        BonusWrapperUiModel h = this.f86236l.mo70417h(hVar);
        this.f86238n = h;
        this.f86232h.f69662L.setVisibility(0);
        BonusAmexUiModel a = h.mo52790a();
        this.f86232h.f69654D.setText(C32319m.m95297d(a.mo52701f().longValue(), "dd.MM.yyyy"));
        BogTextView bogTextView = this.f86232h.f69657G;
        StringBuilder sb = new StringBuilder();
        sb.append(C32303f.m95206q(a.mo52697d().doubleValue()));
        sb.append(" ");
        int i = C10328q.product_details_text_mr_points_suffix;
        sb.append(getString(i));
        bogTextView.setText(sb.toString());
        BogTextView bogTextView2 = this.f86232h.f69664N;
        bogTextView2.setText(C32303f.m95206q(a.mo52702g().doubleValue()) + " " + getString(i));
        BogTextView bogTextView3 = this.f86232h.f69656F;
        bogTextView3.setText(C32303f.m95206q(a.mo52696b().doubleValue()) + " " + getString(i));
        this.f86232h.f69663M.setText(String.valueOf(a.mo52699e()));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public void m105937z1(Throwable th) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            this.f86233i.setAcctName(intent.getStringExtra("ACCOUNT_NAME"));
            this.mClient.refreshCreditCardsEvent();
            this.mClient.requestCreditCards(false);
        }
    }

    public void onClick(View view) {
        C27409r2 r2Var = this.f86232h;
        BogTextView bogTextView = r2Var.f69668y;
        if (view == bogTextView) {
            C32359z0.m95596x(bogTextView.getText().toString());
            C32297d.m95157e(getActivity(), getString(C10328q.f28953c2));
        } else if (view == r2Var.f69659I) {
            C36546y.m108282F().mo27152s("credit_cards", "share", "click");
            C32359z0.m95583n0(getActivity(), this.f86232h.f69668y.getText().toString(), getString(C10328q.f28961m2));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27409r2 B = C27409r2.m84939B(layoutInflater, viewGroup, false);
        this.f86232h = B;
        this.rootView = B.mo3946b();
        if (this.f86233i != null) {
            m105921B1();
        }
        return this.rootView;
    }

    @C41452l
    public void onLoansResponse(LoansEvent loansEvent) {
        if (this.f86234j != loansEvent && loansEvent.getState() == 20) {
            this.f86234j = loansEvent;
            m105931r1();
        }
    }

    public void onStart() {
        super.onStart();
        if (!this.mEventBus.mo96183k(this)) {
            this.mEventBus.mo96185q(this);
        }
        this.mClient.requestLoans(false);
        if (this.f86238n == null) {
            this.f86232h.f69662L.setVisibility(8);
        }
    }

    public void onStop() {
        super.onStop();
        this.mEventBus.mo96186s(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86232h.f69658H.setOnClickListener(new C35670a());
        this.f86232h.f69659I.setOnClickListener(this);
        this.f86232h.f69668y.setOnClickListener(this);
    }

    /* renamed from: s1 */
    public void mo86766s1(CreditCardAccount creditCardAccount) {
        this.f86233i = creditCardAccount;
        if (this.f86232h != null) {
            m105921B1();
        }
    }
}
