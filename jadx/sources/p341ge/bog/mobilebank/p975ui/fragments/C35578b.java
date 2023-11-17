package p341ge.bog.mobilebank.p975ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.content.C0767a;
import androidx.core.content.res.C0808h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.mikephil.charting.utils.Utils;
import g91.C32297d;
import g91.C32303f;
import g91.C32319m;
import g91.C32355x0;
import g91.C32359z0;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.Iterator;
import jg1.C41452l;
import l50.C25827g;
import l50.C25828h;
import l50.C25829i;
import l50.C25830j;
import l50.C25832l;
import l50.C25837q;
import p060e1.C5958l0;
import p341ge.bog.mobilebank.eventbus.events.DepositBondsEvent;
import p341ge.bog.mobilebank.eventbus.events.LoansEvent;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.p975ui.activities.RenameAccountActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10323l;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p90.C27297f3;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.fragments.b */
public class C35578b extends C35651n1 implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C27297f3 f86037d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C25832l f86038e;

    /* renamed from: f */
    private C25828h f86039f;

    /* renamed from: g */
    private LoansEvent f86040g;

    /* renamed from: h */
    private DepositBondsEvent f86041h;

    /* renamed from: i */
    private final View.OnClickListener f86042i = new C35579a();

    /* renamed from: j */
    private final View.OnClickListener f86043j = new C35580b();

    /* renamed from: k */
    private final View.OnClickListener f86044k = new C35581c();

    /* renamed from: l */
    private final View.OnClickListener f86045l = new C35582d();

    /* renamed from: ge.bog.mobilebank.ui.fragments.b$a */
    class C35579a implements View.OnClickListener {
        C35579a() {
        }

        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            Intent intent = new Intent(C35578b.this.getContext(), ProductDetailedActivity.class);
            intent.putExtra("PRODUCT_TYPE_KEY", 4);
            intent.putExtra("PRODUCT_INDEX", intValue);
            C35578b.this.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.b$b */
    class C35580b implements View.OnClickListener {
        C35580b() {
        }

        public void onClick(View view) {
            int intValue = ((Integer) view.getTag()).intValue();
            Intent intent = new Intent(C35578b.this.getContext(), ProductDetailedActivity.class);
            intent.putExtra("PRODUCT_TYPE_KEY", 3);
            intent.putExtra("PRODUCT_INDEX", intValue);
            C35578b.this.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.b$c */
    class C35581c implements View.OnClickListener {
        C35581c() {
        }

        public void onClick(View view) {
            int i;
            C25829i iVar = (C25829i) view.getTag();
            if (iVar.mo64505e() == null || iVar.mo64507f() == null) {
                i = 0;
            } else {
                i = iVar.mo64505e().subtract(new BigDecimal(iVar.mo64507f().doubleValue()));
            }
            TransferForm.startWith((Fragment) C35578b.this, "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(iVar.mo64501a()).setAmount(String.valueOf(i)).start();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.b$d */
    class C35582d implements View.OnClickListener {

        /* renamed from: ge.bog.mobilebank.ui.fragments.b$d$a */
        class C35583a implements Runnable {
            C35583a() {
            }

            public void run() {
                C35578b.this.f86037d.f68708G.smoothScrollTo(0, C35578b.this.f86037d.f68712K.getBottom());
            }
        }

        C35582d() {
        }

        public void onClick(View view) {
            boolean z;
            View findViewById = view.findViewById(C10322k.overdraft_item_arrow);
            View findViewById2 = view.findViewById(C10322k.overdraft_item_orange_arrow);
            ViewGroup viewGroup = (ViewGroup) view.getTag();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getTag();
            int integer = C35578b.this.getResources().getInteger(C10323l.transition_anim_duration);
            int i = 0;
            if (viewGroup.getVisibility() == 8) {
                findViewById2.animate().alpha(1.0f).setDuration((long) integer);
                findViewById.animate().rotation(180.0f);
                z = true;
            } else {
                findViewById2.animate().alpha(Utils.FLOAT_EPSILON).setDuration((long) integer);
                findViewById.animate().rotation(Utils.FLOAT_EPSILON);
                z = false;
            }
            C5958l0.m23910a(viewGroup2);
            if (!z) {
                i = 8;
            }
            viewGroup.setVisibility(i);
            if (z) {
                C35578b.this.f86037d.f68712K.post(new C35583a());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.fragments.b$e */
    class C35584e implements View.OnClickListener {
        C35584e() {
        }

        public void onClick(View view) {
            C36546y.m108282F().mo27152s("accounts", "edit_name", "click");
            C35578b bVar = C35578b.this;
            RenameAccountActivity.m104745K2(bVar, bVar.f86038e.mo64525d(), C35578b.this.f86038e.mo64534k(), 1, C35578b.this.f86038e.mo64529g(), C10328q.common_text_account_name);
        }
    }

    /* renamed from: k1 */
    private void m105711k1() {
        boolean z;
        this.f86037d.f68719y.removeAllViews();
        DepositBondsEvent depositBondsEvent = this.f86041h;
        if (depositBondsEvent == null || depositBondsEvent.getDepositBonds() == null || this.f86041h.getDepositBonds().getDeposits().getDeposits().size() <= 0) {
            z = false;
        } else {
            Iterator<Deposit> it = this.f86041h.getDepositBonds().getDeposits().getDeposits().iterator();
            z = false;
            int i = 0;
            while (it.hasNext()) {
                Deposit next = it.next();
                if (next.getTechAcctKey() == this.f86038e.mo64537n()) {
                    View inflate = LayoutInflater.from(getContext()).inflate(C10324m.account_deposit_loan_item, (ViewGroup) null);
                    String name = next.getName();
                    if (TextUtils.isEmpty(name)) {
                        name = C27950a.m86284a(next.getDictionaryKey());
                    }
                    ((BogTextView) inflate.findViewById(C10322k.account_deposit_loan_item_name)).setText(name);
                    ((BogTextView) inflate.findViewById(C10322k.account_deposit_loan_item_amount)).setText(next.getBalance() + C32303f.m95198i(next.getCcy(), true));
                    inflate.setOnClickListener(this.f86042i);
                    inflate.setTag(Integer.valueOf(i));
                    this.f86037d.f68719y.addView(inflate);
                    z = true;
                }
                i++;
            }
        }
        if (z) {
            this.f86037d.f68720z.setVisibility(0);
        } else {
            this.f86037d.f68720z.setVisibility(8);
        }
    }

    /* renamed from: l1 */
    private void m105712l1() {
        boolean z;
        this.f86037d.f68709H.removeAllViews();
        LoansEvent loansEvent = this.f86040g;
        if (loansEvent == null || loansEvent.getLoansWrapper().getLoans() == null || this.f86040g.getLoansWrapper().getLoans().size() <= 0) {
            z = false;
        } else {
            Iterator<Loan> it = this.f86040g.getLoansWrapper().getLoans().iterator();
            z = false;
            int i = 0;
            while (it.hasNext()) {
                Loan next = it.next();
                if (next.getDetails().getDetails().getLinkAcctKey() == this.f86038e.mo64537n()) {
                    View inflate = LayoutInflater.from(getContext()).inflate(C10324m.account_deposit_loan_item, (ViewGroup) null);
                    String loanName = next.getLoanName();
                    if (TextUtils.isEmpty(loanName)) {
                        loanName = C27950a.m86284a(next.getProductDictionaryKey());
                    }
                    ((BogTextView) inflate.findViewById(C10322k.account_deposit_loan_item_name)).setText(loanName);
                    ((BogTextView) inflate.findViewById(C10322k.account_deposit_loan_item_amount)).setText(C32303f.m95204o(next.getAmount().doubleValue()) + C32303f.m95198i(next.getCcy(), true));
                    inflate.setOnClickListener(this.f86043j);
                    inflate.setTag(Integer.valueOf(i));
                    this.f86037d.f68709H.addView(inflate);
                    z = true;
                }
                i++;
            }
        }
        if (z) {
            this.f86037d.f68710I.setVisibility(0);
        } else {
            this.f86037d.f68710I.setVisibility(8);
        }
    }

    /* renamed from: m1 */
    private void m105713m1() {
        double d;
        double d2;
        double d3;
        this.f86037d.f68711J.removeAllViews();
        boolean z = false;
        for (C25837q qVar : this.f86039f.mo64496e()) {
            if (qVar.mo64567c() && qVar.mo64568d() != null) {
                String i = C32303f.m95198i(qVar.mo64566b(), true);
                View inflate = LayoutInflater.from(getContext()).inflate(C10324m.overdraft_item, (ViewGroup) null);
                BigDecimal e = qVar.mo64568d().mo64505e();
                double d4 = Utils.DOUBLE_EPSILON;
                if (e == null) {
                    d = 0.0d;
                } else {
                    d = qVar.mo64568d().mo64505e().doubleValue();
                }
                ((BogTextView) inflate.findViewById(C10322k.overdraft_item_total_amount)).setText(C32303f.m95204o(d) + i);
                if (qVar.mo64568d().mo64505e() == null || qVar.mo64568d().mo64507f() == null) {
                    d2 = 0.0d;
                } else {
                    d2 = qVar.mo64568d().mo64505e().doubleValue() - qVar.mo64568d().mo64507f().doubleValue();
                }
                ((BogTextView) inflate.findViewById(C10322k.overdraft_item_first_tv)).setText(C32303f.m95204o(d2) + i);
                if (qVar.mo64568d().mo64504d() == null) {
                    d3 = 0.0d;
                } else {
                    d3 = qVar.mo64568d().mo64504d().doubleValue();
                }
                ((BogTextView) inflate.findViewById(C10322k.overdraft_item_second_tv)).setText(C32303f.m95204o(d3) + " %");
                if (qVar.mo64568d().mo64503c() != null) {
                    d4 = qVar.mo64568d().mo64503c().doubleValue();
                }
                ((BogTextView) inflate.findViewById(C10322k.overdraft_item_third_tv)).setText(C32303f.m95204o(d4) + i);
                Long b = qVar.mo64568d().mo64502b();
                if (b != null && C32319m.m95313t(System.currentTimeMillis(), b.longValue()) < 365) {
                    ((BogTextView) inflate.findViewById(C10322k.overdraft_item_forth_tv)).setText(C32319m.m95298e(qVar.mo64568d().mo64502b().longValue(), true, getContext()));
                }
                View findViewById = inflate.findViewById(C10322k.overdraft_item_header);
                View findViewById2 = inflate.findViewById(C10322k.loan_history_item_details);
                findViewById2.setTag(inflate);
                findViewById.setTag(findViewById2);
                findViewById.setOnClickListener(this.f86045l);
                Button button = (Button) inflate.findViewById(C10322k.overdraft_item_top_up);
                button.setTag(qVar.mo64568d());
                button.setOnClickListener(this.f86044k);
                this.f86037d.f68711J.addView(inflate);
                z = true;
            }
        }
        if (z) {
            this.f86037d.f68712K.setVisibility(0);
        } else {
            this.f86037d.f68712K.setVisibility(8);
        }
    }

    /* renamed from: o1 */
    private void m105714o1() {
        boolean z;
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f86039f.mo64496e().size()) {
                i2 = 0;
                z = false;
                break;
            } else if (((C25837q) this.f86039f.mo64496e().get(i2)).mo64565a() == this.f86038e.mo64537n()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            C10463g.m37989C("subAccount not fount with main key, acct key: " + this.f86038e.mo64529g());
        }
        if (i >= this.f86039f.mo64492a().size()) {
            C10463g.m37989C("App about to crash, acct key: " + this.f86038e.mo64529g());
        }
        this.f86037d.mo66589F(C32303f.m95198i(((C25827g) this.f86039f.mo64492a().get(i)).mo64488b(), true));
        this.f86037d.mo66590G((C25827g) this.f86039f.mo64492a().get(i));
        this.f86037d.mo66587D(this.f86038e);
        this.f86037d.mo66588E(this.f86039f);
        if ("UNIVERSAL".equals(this.f86038e.mo64538o())) {
            this.f86037d.f68706E.setVisibility(0);
            this.f86037d.f68706E.removeAllViews();
            for (int i3 = 0; i3 < this.f86039f.mo64496e().size(); i3++) {
                C25837q qVar = (C25837q) this.f86039f.mo64496e().get(i);
                BogTextView bogTextView = new BogTextView(getContext());
                bogTextView.setTypeface(C0808h.m3033h(C36546y.m108285N(), C10321j.bog_headline_light));
                if (qVar.mo64569e() != null) {
                    bogTextView.setText(qVar.mo64569e() + C32303f.m95198i(qVar.mo64566b(), true));
                } else {
                    bogTextView.setText(C32303f.m95198i(qVar.mo64566b(), true));
                }
                bogTextView.setTextColor(C0767a.m2893c(getContext(), C10318g.bog_default_text_color));
                bogTextView.setPadding(0, C32355x0.m95511b(3.0f, getContext()), 0, 0);
                this.f86037d.f68706E.addView(bogTextView);
                i++;
                if (i == this.f86039f.mo64496e().size()) {
                    i = 0;
                }
            }
        } else {
            this.f86037d.f68706E.setVisibility(8);
        }
        m105713m1();
        m105715p1();
        m105712l1();
        m105711k1();
    }

    /* renamed from: p1 */
    private void m105715p1() {
        double d;
        if (this.f86039f.mo64494c().size() > 0) {
            this.f86037d.f68704C.removeAllViews();
            this.f86037d.f68705D.setVisibility(0);
            for (C25830j jVar : this.f86039f.mo64494c()) {
                View inflate = LayoutInflater.from(getContext()).inflate(C10324m.student_dep_info_layout, (ViewGroup) null);
                Double d2 = jVar.mo64513d();
                double d3 = Utils.DOUBLE_EPSILON;
                if (d2 != null) {
                    d = jVar.mo64513d().doubleValue();
                } else {
                    d = 0.0d;
                }
                ((BogTextView) inflate.findViewById(C10322k.student_dep_info_first)).setText(C32303f.m95204o(d) + " %");
                double a = jVar.mo64510a();
                ((BogTextView) inflate.findViewById(C10322k.student_dep_info_second)).setText(C32303f.m95204o(a) + C32303f.m95198i(jVar.mo64511b(), true));
                if (jVar.mo64512c() != null) {
                    d3 = jVar.mo64512c().doubleValue();
                }
                ((BogTextView) inflate.findViewById(C10322k.student_dep_info_third)).setText(C32303f.m95204o(d3) + C32303f.m95198i(jVar.mo64511b(), true));
                this.f86037d.f68704C.addView(inflate);
            }
            return;
        }
        this.f86037d.f68705D.setVisibility(8);
    }

    /* renamed from: n1 */
    public void mo86646n1(C25832l lVar) {
        this.f86038e = lVar;
        this.f86039f = lVar.mo64523b();
        if (this.f86037d != null && getContext() != null) {
            m105714o1();
        }
    }

    public void onClick(View view) {
        C27297f3 f3Var = this.f86037d;
        BogTextView bogTextView = f3Var.f68707F;
        if (view == bogTextView) {
            C32359z0.m95596x(bogTextView.getText().toString());
            C32297d.m95157e(getActivity(), getString(C10328q.f28953c2));
        } else if (view == f3Var.f68714M) {
            C36546y.m108282F().mo27152s("accounts", "share", "click");
            C32359z0.m95583n0(getActivity(), this.f86037d.f68707F.getText().toString(), getString(C10328q.f28961m2));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C27297f3 B = C27297f3.m84491B(layoutInflater, viewGroup, false);
        this.f86037d = B;
        this.rootView = B.mo3946b();
        if (this.f86038e != null) {
            m105714o1();
        }
        this.f86037d.f68707F.setOnClickListener(this);
        this.f86037d.f68713L.setOnClickListener(this);
        this.f86037d.f68714M.setOnClickListener(this);
        return this.rootView;
    }

    @C41452l
    public void onDepositBondsEvent(DepositBondsEvent depositBondsEvent) {
        if (this.f86041h != depositBondsEvent && depositBondsEvent.getState() == 20) {
            this.f86041h = depositBondsEvent;
            m105711k1();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f86037d = null;
    }

    @C41452l
    public void onLoansResponse(LoansEvent loansEvent) {
        if (this.f86040g != loansEvent && loansEvent.getState() == 20) {
            this.f86040g = loansEvent;
            m105712l1();
        }
    }

    public void onStart() {
        super.onStart();
        this.mEventBus.mo96185q(this);
        this.mClient.requestDepositBonds(false);
        this.mClient.requestLoans(false);
    }

    public void onStop() {
        super.onStop();
        this.mEventBus.mo96186s(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86037d.f68702A.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f86037d.f68702A.getLayoutManager().mo5640L1(true);
        this.f86037d.f68702A.setNestedScrollingEnabled(false);
        this.f86037d.f68702A.setHasFixedSize(false);
        C1806i iVar = new C1806i(this.f86037d.f68702A.getContext(), 1);
        iVar.mo5985l(C0767a.m2895e(getActivity(), C10320i.divider));
        this.f86037d.f68702A.mo5351j(iVar);
        this.f86037d.f68713L.setOnClickListener(new C35584e());
    }
}
