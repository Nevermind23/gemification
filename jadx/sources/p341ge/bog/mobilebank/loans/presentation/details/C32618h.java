package p341ge.bog.mobilebank.loans.presentation.details;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.salesforce.marketingcloud.C11398b;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import j70.C25346f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import js0.C36787a;
import k70.C25683g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import md0.C26191f;
import o31.C37614q;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.details.C32587a;
import p341ge.bog.mobilebank.loans.presentation.details.C32597e;
import p341ge.bog.mobilebank.loans.presentation.details.C32608g;
import p341ge.bog.mobilebank.loans.presentation.installmentStatus.LoanInstallmentStatusData;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData;
import p341ge.bog.mobilebank.loans.presentation.renameloan.model.RenameLoanData;
import p341ge.bog.mobilebank.model.RepaymentAccount;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.model.loans.MerchantDetails;
import p341ge.bog.mobilebank.model.loans.PLNDetails;
import p380ck.C10463g;
import ue1.C43075l;
import vr0.C39440c;
import vr0.C39441d;
import yr0.C40047a;

/* renamed from: ge.bog.mobilebank.loans.presentation.details.h */
public final class C32618h extends C21481a {

    /* renamed from: o */
    public static final C32619a f80310o = new C32619a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final LoansFlow.Details f80311d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25346f f80312e;

    /* renamed from: f */
    private final C25683g f80313f;

    /* renamed from: g */
    private final C10463g f80314g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C32605f f80315h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public LoansWrapper f80316i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map f80317j = new LinkedHashMap();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Loan f80318k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public LoanDetailsWrapper f80319l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f80320m = new C1644x();

    /* renamed from: n */
    private final C1644x f80321n = new C1644x();

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.h$a */
    public static final class C32619a {
        private C32619a() {
        }

        public /* synthetic */ C32619a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.h$b */
    public interface C32620b {
        /* renamed from: a */
        C32618h mo32817a(LoansFlow.Details details);
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.h$d */
    static final class C32622d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32618h f80332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32622d(C32618h hVar) {
            super(1);
            this.f80332d = hVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            return this.f80332d.f80312e.mo63912a(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.h$e */
    static final class C32623e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32618h f80333d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32623e(C32618h hVar) {
            super(1);
            this.f80333d = hVar;
        }

        /* renamed from: a */
        public final void mo74197a(C26191f fVar) {
            if (fVar instanceof C26191f.C26192a) {
                this.f80333d.f80320m.mo4823o(new C32621c((Long) null, (C32608g.C32616h) null, (C32608g.C32609a) null, (C32608g.C32613e) null, (C32608g.C32617i) null, (C32608g.C32615g) null, (C32608g.C32612d) null, (C32608g.C32610b) null, (C32608g.C32614f) null, C32608g.C32611c.f80290a, 511, (DefaultConstructorMarker) null));
            } else if (fVar instanceof C26191f.C26193b) {
                this.f80333d.f80320m.mo4823o(new C32621c((Long) null, (C32608g.C32616h) null, (C32608g.C32609a) null, (C32608g.C32613e) null, (C32608g.C32617i) null, (C32608g.C32615g) null, (C32608g.C32612d) null, (C32608g.C32610b) null, C32608g.C32614f.f80301a, (C32608g.C32611c) null, 767, (DefaultConstructorMarker) null));
            } else if (fVar instanceof C26191f.C26194c) {
                this.f80333d.m96394rw((LoansWrapper) ((C26191f.C26194c) fVar).mo65223a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74197a((C26191f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.h$f */
    static final class C32624f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32618h f80334d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32624f(C32618h hVar) {
            super(1);
            this.f80334d = hVar;
        }

        /* renamed from: a */
        public final List invoke(C32621c cVar) {
            C32618h hVar = this.f80334d;
            C41536l.m120488h(cVar, "it");
            return hVar.m96393ow(cVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.h$g */
    static final class C32625g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f80335d;

        /* renamed from: e */
        final /* synthetic */ C32618h f80336e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32625g(long j, C32618h hVar) {
            super(1);
            this.f80335d = j;
            this.f80336e = hVar;
        }

        /* renamed from: a */
        public final C32621c invoke(C32621c cVar) {
            List list;
            String str;
            String str2;
            String str3;
            String str4;
            Long l;
            ArrayList<String> productFunctions;
            C41536l.m120489i(cVar, "viewState");
            Long valueOf = Long.valueOf(this.f80335d);
            C32605f jw = this.f80336e.f80315h;
            LoanDetailsWrapper lw = this.f80336e.f80319l;
            Loan kw = this.f80336e.f80318k;
            String str5 = null;
            if (kw == null || (productFunctions = kw.getProductFunctions()) == null) {
                list = null;
            } else {
                list = C41358y.m120036z0(productFunctions);
            }
            if (list == null) {
                list = C41341q.m119907j();
            }
            Loan kw2 = this.f80336e.f80318k;
            if (kw2 != null) {
                str = kw2.getLoanType();
            } else {
                str = null;
            }
            boolean d = C41536l.m120484d(str, "PLN");
            Loan kw3 = this.f80336e.f80318k;
            if (kw3 != null) {
                str2 = kw3.getCcy();
            } else {
                str2 = null;
            }
            C32608g.C32609a h = jw.mo74113h(lw, list, d, str2);
            C32608g.C32613e n = this.f80336e.f80315h.mo74118n(this.f80336e.f80319l, this.f80336e.f80318k);
            C32605f jw2 = this.f80336e.f80315h;
            LoanDetailsWrapper lw2 = this.f80336e.f80319l;
            Loan kw4 = this.f80336e.f80318k;
            if (kw4 != null) {
                str3 = kw4.getCcy();
            } else {
                str3 = null;
            }
            Loan kw5 = this.f80336e.f80318k;
            boolean z = false;
            if (kw5 != null && kw5.isMortgage()) {
                z = true;
            }
            C32608g.C32617i o = jw2.mo74119o(lw2, str3, z);
            C32605f jw3 = this.f80336e.f80315h;
            LoanDetailsWrapper lw3 = this.f80336e.f80319l;
            Loan kw6 = this.f80336e.f80318k;
            if (kw6 != null) {
                str4 = kw6.getCcy();
            } else {
                str4 = null;
            }
            C32608g.C32615g l2 = jw3.mo74116l(lw3, str4);
            C32608g.C32612d k = this.f80336e.f80315h.mo74115k(this.f80336e.f80319l);
            C32605f jw4 = this.f80336e.f80315h;
            Map iw = this.f80336e.f80317j;
            Loan kw7 = this.f80336e.f80318k;
            if (kw7 != null) {
                l = Long.valueOf(kw7.getLoanKey());
            } else {
                l = null;
            }
            String str6 = (String) iw.get(l);
            if (str6 == null) {
                Loan kw8 = this.f80336e.f80318k;
                if (kw8 != null) {
                    str6 = kw8.getLoanName();
                } else {
                    str6 = null;
                }
            }
            LoanDetailsWrapper lw4 = this.f80336e.f80319l;
            Loan kw9 = this.f80336e.f80318k;
            Loan kw10 = this.f80336e.f80318k;
            if (kw10 != null) {
                str5 = kw10.getCcy();
            }
            return C32621c.m96410b(cVar, valueOf, (C32608g.C32616h) null, h, n, o, l2, k, jw4.mo74114i(str6, lw4, kw9, str5), (C32608g.C32614f) null, (C32608g.C32611c) null, 770, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.h$h */
    static final class C32626h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32618h f80337d;

        /* renamed from: e */
        final /* synthetic */ String f80338e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32626h(C32618h hVar, String str) {
            super(1);
            this.f80337d = hVar;
            this.f80338e = str;
        }

        /* renamed from: a */
        public final C32621c invoke(C32621c cVar) {
            Long l;
            C41536l.m120489i(cVar, "viewState");
            C32605f jw = this.f80337d.f80315h;
            Map iw = this.f80337d.f80317j;
            LoansWrapper hw = this.f80337d.f80316i;
            String str = null;
            if (hw == null) {
                C41536l.m120506z("loans");
                hw = null;
            }
            Loan kw = this.f80337d.f80318k;
            if (kw != null) {
                l = Long.valueOf(kw.getLoanKey());
            } else {
                l = null;
            }
            C32608g.C32616h m = jw.mo74117m(iw, hw, l);
            C32605f jw2 = this.f80337d.f80315h;
            String str2 = this.f80338e;
            LoanDetailsWrapper lw = this.f80337d.f80319l;
            Loan kw2 = this.f80337d.f80318k;
            Loan kw3 = this.f80337d.f80318k;
            if (kw3 != null) {
                str = kw3.getCcy();
            }
            return C32621c.m96410b(cVar, (Long) null, m, (C32608g.C32609a) null, (C32608g.C32613e) null, (C32608g.C32617i) null, (C32608g.C32615g) null, (C32608g.C32612d) null, jw2.mo74114i(str2, lw, kw2, str), (C32608g.C32614f) null, (C32608g.C32611c) null, 893, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32618h(LoansFlow.Details details, C25346f fVar, C25683g gVar, C10463g gVar2, C32605f fVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(details, "data");
        C41536l.m120489i(fVar, "getLoanWithDetails");
        C41536l.m120489i(gVar, "refreshLoansWithDetails");
        C41536l.m120489i(gVar2, "analytics");
        C41536l.m120489i(fVar2, "mapper");
        this.f80311d = details;
        this.f80312e = fVar;
        this.f80313f = gVar;
        this.f80314g = gVar2;
        this.f80315h = fVar2;
        m96395sw();
    }

    /* renamed from: Aw */
    private final void m96377Aw() {
        Loan loan = this.f80318k;
        if (loan != null) {
            C1644x xVar = this.f80321n;
            long loanKey = loan.getLoanKey();
            String prodType = loan.getProdType();
            C41536l.m120488h(prodType, "loan.prodType");
            String loanName = loan.getLoanName();
            if (loanName == null) {
                loanName = C32343x.m95388F(loan.getProductDictionaryKey(), new Object[0]);
            } else {
                C41536l.m120488h(loanName, "loan.loanName ?: loan.pr…DictionaryKey.dictValue()");
            }
            C37224b.m109965d(xVar, new C32597e.C32600c(new InstallmentReversalCancelData(loanKey, prodType, loanName)));
        }
    }

    /* renamed from: Bw */
    private final void m96378Bw() {
        String str;
        LoanDetailsWrapper loanDetailsWrapper = this.f80319l;
        if (loanDetailsWrapper != null) {
            C1644x xVar = this.f80321n;
            String reversalStatusDictionaryKey = loanDetailsWrapper.getDetails().getReversalStatusDictionaryKey();
            C41536l.m120488h(reversalStatusDictionaryKey, "details.details.reversalStatusDictionaryKey");
            String loanNo = loanDetailsWrapper.getSchedule().getLoanNo();
            C41536l.m120488h(loanNo, "details.schedule.loanNo");
            MerchantDetails merchantDetails = loanDetailsWrapper.mmsDetails;
            if (merchantDetails != null) {
                str = merchantDetails.merchantPhoneNumber;
            } else {
                str = null;
            }
            C37224b.m109965d(xVar, new C32597e.C32601d(new LoanInstallmentStatusData(reversalStatusDictionaryKey, loanNo, str)));
        }
    }

    /* renamed from: Cw */
    private final void m96379Cw() {
        PLNDetails pLNDetails;
        Loan loan = this.f80318k;
        LoanDetailsWrapper loanDetailsWrapper = this.f80319l;
        if (loanDetailsWrapper != null) {
            pLNDetails = loanDetailsWrapper.getPlnDetails();
        } else {
            pLNDetails = null;
        }
        if (loan != null && pLNDetails != null) {
            C1644x xVar = this.f80321n;
            BigDecimal initialPrincipal = pLNDetails.getInitialPrincipal();
            C41536l.m120488h(initialPrincipal, "details.initialPrincipal");
            BigDecimal intAmount = pLNDetails.getIntAmount();
            C41536l.m120488h(intAmount, "details.intAmount");
            BigDecimal penalty = pLNDetails.getPenalty();
            C41536l.m120488h(penalty, "details.penalty");
            String acctNo = pLNDetails.getAcctNo();
            C41536l.m120488h(acctNo, "details.acctNo");
            BigDecimal availableAmount = pLNDetails.getAvailableAmount();
            C41536l.m120488h(availableAmount, "details.availableAmount");
            String ccy = loan.getCcy();
            C41536l.m120488h(ccy, "loan.ccy");
            long loanKey = loan.getLoanKey();
            BigDecimal amount = pLNDetails.getAmount();
            C41536l.m120488h(amount, "details.amount");
            String productDictionaryKey = pLNDetails.getProductDictionaryKey();
            C41536l.m120488h(productDictionaryKey, "details.productDictionaryKey");
            LoansFlow.PawnLoanPayment pawnLoanPayment = r5;
            LoansFlow.PawnLoanPayment pawnLoanPayment2 = new LoansFlow.PawnLoanPayment(initialPrincipal, intAmount, penalty, acctNo, availableAmount, ccy, loanKey, amount, productDictionaryKey);
            C37224b.m109965d(xVar, new C32597e.C32602e(pawnLoanPayment));
        }
    }

    /* renamed from: Dw */
    private final void m96380Dw(boolean z) {
        Loan loan = this.f80318k;
        LoanDetailsWrapper loanDetailsWrapper = this.f80319l;
        if (loan != null && loanDetailsWrapper != null) {
            C1644x xVar = this.f80321n;
            String loanName = loan.getLoanName();
            if (loanName == null) {
                loanName = C32343x.m95388F(loan.getProductDictionaryKey(), new Object[0]);
            }
            long loanKey = loan.getLoanKey();
            String ccy = loan.getCcy();
            C41536l.m120488h(ccy, "loan.ccy");
            String prodType = loan.getProdType();
            C41536l.m120488h(prodType, "loan.prodType");
            String repaymentFlag = loanDetailsWrapper.getDetails().getRepaymentFlag();
            C41536l.m120488h(repaymentFlag, "details.details.repaymentFlag");
            ArrayList<RepaymentAccount> repaymentAccounts = loanDetailsWrapper.getRepaymentAccounts();
            C41536l.m120488h(repaymentAccounts, "details.repaymentAccounts");
            LoansFlow.Repayment repayment = r5;
            LoansFlow.Repayment repayment2 = new LoansFlow.Repayment(loanName, loanKey, ccy, prodType, repaymentFlag, repaymentAccounts, false, z, 64, (DefaultConstructorMarker) null);
            C37224b.m109965d(xVar, new C32597e.C32604g(repayment));
        }
    }

    /* renamed from: Ew */
    static /* synthetic */ void m96381Ew(C32618h hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        hVar.m96380Dw(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public final List m96393ow(C32621c cVar) {
        ArrayList arrayList = new ArrayList();
        C37614q.m110615a(arrayList, cVar.mo74186e());
        C37614q.m110615a(arrayList, cVar.mo74190h());
        C37614q.m110615a(arrayList, cVar.mo74193j());
        C37614q.m110615a(arrayList, cVar.mo74184c());
        C37614q.m110615a(arrayList, cVar.mo74189g());
        C37614q.m110615a(arrayList, cVar.mo74194k());
        C37614q.m110615a(arrayList, cVar.mo74192i());
        C37614q.m110615a(arrayList, cVar.mo74188f());
        C37614q.m110615a(arrayList, cVar.mo74185d());
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public final void m96394rw(LoansWrapper loansWrapper) {
        Integer num;
        boolean z;
        Loan loanByPos;
        LoansWrapper loansWrapper2 = loansWrapper;
        this.f80316i = loansWrapper2;
        Long a = this.f80311d.mo74022a();
        if (a == null) {
            Integer b = this.f80311d.mo74023b();
            if (b == null || (loanByPos = loansWrapper2.getLoanByPos(b.intValue())) == null) {
                a = null;
            } else {
                a = Long.valueOf(loanByPos.getLoanKey());
            }
        }
        C1644x xVar = this.f80320m;
        C32621c cVar = r4;
        C32621c cVar2 = new C32621c(a, this.f80315h.mo74117m(this.f80317j, loansWrapper2, a), (C32608g.C32609a) null, (C32608g.C32613e) null, (C32608g.C32617i) null, (C32608g.C32615g) null, (C32608g.C32612d) null, (C32608g.C32610b) null, (C32608g.C32614f) null, (C32608g.C32611c) null, 1020, (DefaultConstructorMarker) null);
        xVar.mo4826r(cVar);
        ArrayList<Loan> loans = loansWrapper.getLoans();
        int i = 0;
        if (loans != null) {
            Iterator<Loan> it = loans.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                long loanKey = it.next().getLoanKey();
                if (a != null && loanKey == a.longValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            }
            num = Integer.valueOf(i2);
        } else {
            num = null;
        }
        C41536l.m120486f(a);
        long longValue = a.longValue();
        if (!(num == null && (num = this.f80311d.mo74023b()) == null)) {
            i = num.intValue();
        }
        mo74174Q0(longValue, i);
    }

    /* renamed from: sw */
    private final void m96395sw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C39440c(new C32622d(this)));
        C41536l.m120488h(L0, "private fun initLoansWit…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C39441d(new C32623e(this)));
        C41536l.m120488h(F0, "private fun initLoansWit…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final C40754t m96396tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: uw */
    public static final void m96397uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Fw */
    public void mo74172Fw() {
        m96395sw();
    }

    /* renamed from: Gw */
    public void mo74173Gw(String str) {
        boolean z;
        String str2;
        C41536l.m120489i(str, "loanName");
        Loan loan = this.f80318k;
        if (loan != null) {
            Map map = this.f80317j;
            Long valueOf = Long.valueOf(loan.getLoanKey());
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = C32343x.m95388F(loan.getProductDictionaryKey(), new Object[0]);
            } else {
                str2 = str;
            }
            map.put(valueOf, str2);
        }
        C37224b.m109967f(this.f80320m, new C32626h(this, str));
    }

    /* renamed from: Q0 */
    public void mo74174Q0(long j, int i) {
        C32608g.C32616h hVar;
        T t;
        boolean z;
        boolean z2;
        C32621c cVar = (C32621c) this.f80320m.mo4814f();
        T t2 = null;
        if (cVar != null) {
            hVar = cVar.mo74193j();
        } else {
            hVar = null;
        }
        if (hVar != null) {
            hVar.mo74163c(i);
        }
        LoansWrapper loansWrapper = this.f80316i;
        if (loansWrapper == null) {
            C41536l.m120506z("loans");
            loansWrapper = null;
        }
        ArrayList<LoanDetailsWrapper> details = loansWrapper.getDetails();
        C41536l.m120488h(details, "loans.details");
        Iterator<T> it = details.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((LoanDetailsWrapper) t).getLoanKey() == j) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        this.f80319l = (LoanDetailsWrapper) t;
        LoansWrapper loansWrapper2 = this.f80316i;
        if (loansWrapper2 == null) {
            C41536l.m120506z("loans");
            loansWrapper2 = null;
        }
        ArrayList<Loan> loans = loansWrapper2.getLoans();
        C41536l.m120488h(loans, "loans.loans");
        Iterator<T> it2 = loans.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (((Loan) next).getLoanKey() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t2 = next;
                break;
            }
        }
        this.f80318k = (Loan) t2;
        C37224b.m109967f(this.f80320m, new C32625g(j, this));
    }

    /* renamed from: l */
    public void mo74175l() {
        if (!this.f80317j.isEmpty()) {
            this.f80313f.invoke();
        }
    }

    /* renamed from: pw */
    public LiveData mo74176pw() {
        return this.f80321n;
    }

    /* renamed from: qw */
    public LiveData mo74177qw() {
        return C1607m0.m5655c(this.f80320m, new C32624f(this));
    }

    /* renamed from: vw */
    public void mo74178vw(C32587a aVar) {
        C41536l.m120489i(aVar, "actionButton");
        if (aVar instanceof C32587a.C32589b) {
            C40047a.C40051d.f95180d.mo93924c(this.f80314g);
            m96380Dw(true);
        } else if (aVar instanceof C32587a.C32590c) {
            C40047a.C40053f.f95182d.mo93924c(this.f80314g);
            m96381Ew(this, false, 1, (Object) null);
        } else if (aVar instanceof C32587a.C32591d) {
            C40047a.C40053f.f95182d.mo93924c(this.f80314g);
            m96381Ew(this, false, 1, (Object) null);
        } else if (aVar instanceof C32587a.C32592e) {
            m96379Cw();
        } else if (aVar instanceof C32587a.C32593f) {
            m96378Bw();
        } else if (aVar instanceof C32587a.C32588a) {
            m96377Aw();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* renamed from: ww */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74179ww() {
        /*
            r5 = this;
            ge.bog.mobilebank.model.loans.Loan r0 = r5.f80318k
            r1 = 0
            if (r0 == 0) goto L_0x000e
            long r2 = r0.getLoanKey()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ".pdf"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            ge.bog.mobilebank.model.loans.LoanDetailsWrapper r2 = r5.f80319l
            if (r2 == 0) goto L_0x002d
            ge.bog.mobilebank.model.loans.PLNDetails r2 = r2.getPlnDetails()
            if (r2 == 0) goto L_0x002d
            java.lang.String r2 = r2.fileId
            goto L_0x002e
        L_0x002d:
            r2 = r1
        L_0x002e:
            if (r2 == 0) goto L_0x0043
            ge.bog.mobilebank.model.loans.LoanDetailsWrapper r2 = r5.f80319l
            if (r2 == 0) goto L_0x003d
            ge.bog.mobilebank.model.loans.PLNDetails r2 = r2.getPlnDetails()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r2.fileUrl
            goto L_0x003e
        L_0x003d:
            r2 = r1
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "LOANS_GET_PLN_AGREEMENT_PDF"
            goto L_0x0045
        L_0x0043:
            java.lang.String r2 = "LOANS_GET_AGREEMENT_PDF"
        L_0x0045:
            ge.bog.mobilebank.model.loans.Loan r3 = r5.f80318k
            if (r3 == 0) goto L_0x0051
            long r3 = r3.getLoanKey()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
        L_0x0051:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "loanKey"
            he1.m r1 = he1.C41233s.m119492a(r3, r1)
            java.util.Map r1 = ie1.C41342q0.m119922g(r1)
            java.lang.String r1 = p341ge.bog.mobilebank.rest.model.RetrofitClient.getUrlWithExtras(r2, r1)
            androidx.lifecycle.x r2 = r5.f80321n
            ge.bog.mobilebank.loans.presentation.details.e$a r3 = new ge.bog.mobilebank.loans.presentation.details.e$a
            he1.m r4 = new he1.m
            r4.<init>(r1, r0)
            r3.<init>(r4)
            m41.a r0 = g91.C32343x.m95466m(r3)
            r2.mo4823o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.details.C32618h.mo74179ww():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r7 == true) goto L_0x0039;
     */
    /* renamed from: xw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74180xw() {
        /*
            r10 = this;
            ge.bog.mobilebank.model.loans.Loan r0 = r10.f80318k
            if (r0 == 0) goto L_0x0058
            androidx.lifecycle.x r1 = r10.f80321n
            ge.bog.mobilebank.loans.presentation.details.e$b r2 = new ge.bog.mobilebank.loans.presentation.details.e$b
            ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel r3 = new ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel
            long r4 = r0.getLoanKey()
            ge.bog.mobilebank.model.loans.LoanDetailsWrapper r6 = r10.f80319l
            if (r6 == 0) goto L_0x0017
            ge.bog.mobilebank.model.loans.PLNDetails r6 = r6.getPlnDetails()
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            if (r6 == 0) goto L_0x001d
            bs0.a r6 = bs0.C31181a.PLN_HISTORY
            goto L_0x001f
        L_0x001d:
            bs0.a r6 = bs0.C31181a.HISTORY
        L_0x001f:
            java.lang.String r7 = r0.getLoanName()
            r8 = 0
            if (r7 == 0) goto L_0x0038
            java.lang.String r9 = "loanName"
            kotlin.jvm.internal.C41536l.m120488h(r7, r9)
            int r7 = r7.length()
            r9 = 1
            if (r7 <= 0) goto L_0x0034
            r7 = r9
            goto L_0x0035
        L_0x0034:
            r7 = r8
        L_0x0035:
            if (r7 != r9) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r9 = r8
        L_0x0039:
            if (r9 == 0) goto L_0x0040
            java.lang.String r0 = r0.getLoanName()
            goto L_0x004a
        L_0x0040:
            java.lang.String r0 = r0.getProductDictionaryKey()
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r0 = g91.C32343x.m95388F(r0, r7)
        L_0x004a:
            java.lang.String r7 = "if (loan.loanName?.isNot…DictionaryKey.dictValue()"
            kotlin.jvm.internal.C41536l.m120488h(r0, r7)
            r3.<init>(r4, r6, r0)
            r2.<init>(r3)
            m41.C37224b.m109965d(r1, r2)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.details.C32618h.mo74180xw():void");
    }

    /* renamed from: yw */
    public void mo74181yw(String str) {
        C36787a aVar;
        C41536l.m120489i(str, "loanName");
        Loan loan = this.f80318k;
        if (loan != null) {
            C1644x xVar = this.f80321n;
            long loanKey = loan.getLoanKey();
            if (C41536l.m120484d(loan.getLoanType(), "PLN")) {
                aVar = C36787a.PLN;
            } else {
                aVar = C36787a.LND;
            }
            C37224b.m109965d(xVar, new C32597e.C32603f(new RenameLoanData(loanKey, aVar), str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == true) goto L_0x002a;
     */
    /* renamed from: zw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74182zw() {
        /*
            r10 = this;
            ge.bog.mobilebank.model.loans.Loan r0 = r10.f80318k
            if (r0 == 0) goto L_0x0049
            androidx.lifecycle.x r1 = r10.f80321n
            ge.bog.mobilebank.loans.presentation.details.e$b r2 = new ge.bog.mobilebank.loans.presentation.details.e$b
            ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel r3 = new ge.bog.mobilebank.loans.presentation.historygraphics.model.HistoryScheduleDataModel
            long r4 = r0.getLoanKey()
            bs0.a r6 = bs0.C31181a.SCHEDULE
            java.lang.String r7 = r0.getLoanName()
            r8 = 0
            if (r7 == 0) goto L_0x0029
            java.lang.String r9 = "loanName"
            kotlin.jvm.internal.C41536l.m120488h(r7, r9)
            int r7 = r7.length()
            r9 = 1
            if (r7 <= 0) goto L_0x0025
            r7 = r9
            goto L_0x0026
        L_0x0025:
            r7 = r8
        L_0x0026:
            if (r7 != r9) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r9 = r8
        L_0x002a:
            if (r9 == 0) goto L_0x0031
            java.lang.String r0 = r0.getLoanName()
            goto L_0x003b
        L_0x0031:
            java.lang.String r0 = r0.getProductDictionaryKey()
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r0 = g91.C32343x.m95388F(r0, r7)
        L_0x003b:
            java.lang.String r7 = "if (loan.loanName?.isNot…DictionaryKey.dictValue()"
            kotlin.jvm.internal.C41536l.m120488h(r0, r7)
            r3.<init>(r4, r6, r0)
            r2.<init>(r3)
            m41.C37224b.m109965d(r1, r2)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.details.C32618h.mo74182zw():void");
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.h$c */
    private static final class C32621c {

        /* renamed from: a */
        private final Long f80322a;

        /* renamed from: b */
        private final C32608g.C32616h f80323b;

        /* renamed from: c */
        private final C32608g.C32609a f80324c;

        /* renamed from: d */
        private final C32608g.C32613e f80325d;

        /* renamed from: e */
        private final C32608g.C32617i f80326e;

        /* renamed from: f */
        private final C32608g.C32615g f80327f;

        /* renamed from: g */
        private final C32608g.C32612d f80328g;

        /* renamed from: h */
        private final C32608g.C32610b f80329h;

        /* renamed from: i */
        private final C32608g.C32614f f80330i;

        /* renamed from: j */
        private final C32608g.C32611c f80331j;

        public C32621c(Long l, C32608g.C32616h hVar, C32608g.C32609a aVar, C32608g.C32613e eVar, C32608g.C32617i iVar, C32608g.C32615g gVar, C32608g.C32612d dVar, C32608g.C32610b bVar, C32608g.C32614f fVar, C32608g.C32611c cVar) {
            this.f80322a = l;
            this.f80323b = hVar;
            this.f80324c = aVar;
            this.f80325d = eVar;
            this.f80326e = iVar;
            this.f80327f = gVar;
            this.f80328g = dVar;
            this.f80329h = bVar;
            this.f80330i = fVar;
            this.f80331j = cVar;
        }

        /* renamed from: b */
        public static /* synthetic */ C32621c m96410b(C32621c cVar, Long l, C32608g.C32616h hVar, C32608g.C32609a aVar, C32608g.C32613e eVar, C32608g.C32617i iVar, C32608g.C32615g gVar, C32608g.C32612d dVar, C32608g.C32610b bVar, C32608g.C32614f fVar, C32608g.C32611c cVar2, int i, Object obj) {
            C32621c cVar3 = cVar;
            int i2 = i;
            return cVar.mo74183a((i2 & 1) != 0 ? cVar3.f80322a : l, (i2 & 2) != 0 ? cVar3.f80323b : hVar, (i2 & 4) != 0 ? cVar3.f80324c : aVar, (i2 & 8) != 0 ? cVar3.f80325d : eVar, (i2 & 16) != 0 ? cVar3.f80326e : iVar, (i2 & 32) != 0 ? cVar3.f80327f : gVar, (i2 & 64) != 0 ? cVar3.f80328g : dVar, (i2 & 128) != 0 ? cVar3.f80329h : bVar, (i2 & C11398b.f33139r) != 0 ? cVar3.f80330i : fVar, (i2 & C11398b.f33140s) != 0 ? cVar3.f80331j : cVar2);
        }

        /* renamed from: a */
        public final C32621c mo74183a(Long l, C32608g.C32616h hVar, C32608g.C32609a aVar, C32608g.C32613e eVar, C32608g.C32617i iVar, C32608g.C32615g gVar, C32608g.C32612d dVar, C32608g.C32610b bVar, C32608g.C32614f fVar, C32608g.C32611c cVar) {
            return new C32621c(l, hVar, aVar, eVar, iVar, gVar, dVar, bVar, fVar, cVar);
        }

        /* renamed from: c */
        public final C32608g.C32609a mo74184c() {
            return this.f80324c;
        }

        /* renamed from: d */
        public final C32608g.C32610b mo74185d() {
            return this.f80329h;
        }

        /* renamed from: e */
        public final C32608g.C32611c mo74186e() {
            return this.f80331j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32621c)) {
                return false;
            }
            C32621c cVar = (C32621c) obj;
            return C41536l.m120484d(this.f80322a, cVar.f80322a) && C41536l.m120484d(this.f80323b, cVar.f80323b) && C41536l.m120484d(this.f80324c, cVar.f80324c) && C41536l.m120484d(this.f80325d, cVar.f80325d) && C41536l.m120484d(this.f80326e, cVar.f80326e) && C41536l.m120484d(this.f80327f, cVar.f80327f) && C41536l.m120484d(this.f80328g, cVar.f80328g) && C41536l.m120484d(this.f80329h, cVar.f80329h) && C41536l.m120484d(this.f80330i, cVar.f80330i) && C41536l.m120484d(this.f80331j, cVar.f80331j);
        }

        /* renamed from: f */
        public final C32608g.C32612d mo74188f() {
            return this.f80328g;
        }

        /* renamed from: g */
        public final C32608g.C32613e mo74189g() {
            return this.f80325d;
        }

        /* renamed from: h */
        public final C32608g.C32614f mo74190h() {
            return this.f80330i;
        }

        public int hashCode() {
            Long l = this.f80322a;
            int i = 0;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            C32608g.C32616h hVar = this.f80323b;
            int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            C32608g.C32609a aVar = this.f80324c;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C32608g.C32613e eVar = this.f80325d;
            int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            C32608g.C32617i iVar = this.f80326e;
            int hashCode5 = (hashCode4 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            C32608g.C32615g gVar = this.f80327f;
            int hashCode6 = (hashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            C32608g.C32612d dVar = this.f80328g;
            int hashCode7 = (hashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            C32608g.C32610b bVar = this.f80329h;
            int hashCode8 = (hashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            C32608g.C32614f fVar = this.f80330i;
            int hashCode9 = (hashCode8 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            C32608g.C32611c cVar = this.f80331j;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode9 + i;
        }

        /* renamed from: i */
        public final C32608g.C32615g mo74192i() {
            return this.f80327f;
        }

        /* renamed from: j */
        public final C32608g.C32616h mo74193j() {
            return this.f80323b;
        }

        /* renamed from: k */
        public final C32608g.C32617i mo74194k() {
            return this.f80326e;
        }

        public String toString() {
            Long l = this.f80322a;
            C32608g.C32616h hVar = this.f80323b;
            C32608g.C32609a aVar = this.f80324c;
            C32608g.C32613e eVar = this.f80325d;
            C32608g.C32617i iVar = this.f80326e;
            C32608g.C32615g gVar = this.f80327f;
            C32608g.C32612d dVar = this.f80328g;
            C32608g.C32610b bVar = this.f80329h;
            C32608g.C32614f fVar = this.f80330i;
            C32608g.C32611c cVar = this.f80331j;
            return "ViewState(selectedLoanKey=" + l + ", productHeader=" + hVar + ", actionButtons=" + aVar + ", installmentProgress=" + eVar + ", scheduleAndHistory=" + iVar + ", plnHistory=" + gVar + ", infoBox=" + dVar + ", details=" + bVar + ", loadingState=" + fVar + ", errorState=" + cVar + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C32621c(java.lang.Long r12, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32616h r13, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32609a r14, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32613e r15, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32617i r16, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32615g r17, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32612d r18, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32610b r19, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32614f r20, p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32611c r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r11 = this;
                r0 = r22
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r12
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r13
            L_0x0011:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0017
                r4 = r2
                goto L_0x0018
            L_0x0017:
                r4 = r14
            L_0x0018:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001e
                r5 = r2
                goto L_0x001f
            L_0x001e:
                r5 = r15
            L_0x001f:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0025
                r6 = r2
                goto L_0x0027
            L_0x0025:
                r6 = r16
            L_0x0027:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002d
                r7 = r2
                goto L_0x002f
            L_0x002d:
                r7 = r17
            L_0x002f:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0035
                r8 = r2
                goto L_0x0037
            L_0x0035:
                r8 = r18
            L_0x0037:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x003d
                r9 = r2
                goto L_0x003f
            L_0x003d:
                r9 = r19
            L_0x003f:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0045
                r10 = r2
                goto L_0x0047
            L_0x0045:
                r10 = r20
            L_0x0047:
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 == 0) goto L_0x004c
                goto L_0x004e
            L_0x004c:
                r2 = r21
            L_0x004e:
                r12 = r11
                r13 = r1
                r14 = r3
                r15 = r4
                r16 = r5
                r17 = r6
                r18 = r7
                r19 = r8
                r20 = r9
                r21 = r10
                r22 = r2
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.details.C32618h.C32621c.<init>(java.lang.Long, ge.bog.mobilebank.loans.presentation.details.g$h, ge.bog.mobilebank.loans.presentation.details.g$a, ge.bog.mobilebank.loans.presentation.details.g$e, ge.bog.mobilebank.loans.presentation.details.g$i, ge.bog.mobilebank.loans.presentation.details.g$g, ge.bog.mobilebank.loans.presentation.details.g$d, ge.bog.mobilebank.loans.presentation.details.g$b, ge.bog.mobilebank.loans.presentation.details.g$f, ge.bog.mobilebank.loans.presentation.details.g$c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
