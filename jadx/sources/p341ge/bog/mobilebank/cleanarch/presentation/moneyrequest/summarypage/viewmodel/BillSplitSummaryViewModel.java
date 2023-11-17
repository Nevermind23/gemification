package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel;

import a30.C19151a;
import a30.C19159d;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.utils.Utils;
import d30.C19878a;
import d30.C19898f;
import d30.C19899g;
import g30.C20644a;
import g30.C20645b;
import g30.C20646c;
import g30.C20647d;
import g30.C20648e;
import g30.C20649f;
import g30.C20650g;
import g30.C20651h;
import g30.C20652i;
import g30.C20653j;
import g30.C20654k;
import g30.C20655l;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import j51.C36730b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestSuccessItem;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10328q;
import p380ck.C10468i;
import p773gv.C24818l0;
import p773gv.C24820m0;
import p773gv.C24821n;
import p773gv.C24823p;
import p773gv.C24825r;
import p773gv.C24826s;
import p773gv.C24829v;
import p773gv.C24830w;
import p773gv.C24831x;
import p775gx.C24836a;
import p783hv.C25070b;
import p816kz.C25795b;
import p832mv.C26305b;
import ue1.C43075l;
import z20.C30140a;
import z20.C30142c;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel */
public final class BillSplitSummaryViewModel extends C21481a {

    /* renamed from: d */
    private final C24818l0 f58329d;

    /* renamed from: e */
    private final C24829v f58330e;

    /* renamed from: f */
    private final C24830w f58331f;

    /* renamed from: g */
    private final C24820m0 f58332g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C30140a f58333h;

    /* renamed from: i */
    private final C24831x f58334i;

    /* renamed from: j */
    private final C30142c f58335j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C25795b f58336k;

    /* renamed from: l */
    private final C24821n f58337l;

    /* renamed from: m */
    private final C36730b f58338m;

    /* renamed from: n */
    private final Client f58339n;

    /* renamed from: o */
    private final C24826s f58340o;

    /* renamed from: p */
    private final PreferencesApiManager f58341p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public AccountLov f58342q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public List f58343r = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f58344s = new C1644x();

    /* renamed from: t */
    private String f58345t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C25070b f58346u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C1644x f58347v = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public List f58348w = C41341q.m119907j();

    /* renamed from: x */
    private final C1644x f58349x = new C1644x();

    /* renamed from: y */
    private final C1644x f58350y = new C1644x();

    /* renamed from: z */
    private final C1644x f58351z = new C1644x(new C21913g(false, (Double) null, 2, (DefaultConstructorMarker) null));

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$a */
    static final class C21907a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryViewModel f58352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21907a(BillSplitSummaryViewModel billSplitSummaryViewModel) {
            super(1);
            this.f58352d = billSplitSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54509a(C41205b bVar) {
            C21484c.m69417i(this.f58352d.f58344s, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54509a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$b */
    static final class C21908b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryViewModel f58353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21908b(BillSplitSummaryViewModel billSplitSummaryViewModel) {
            super(1);
            this.f58353d = billSplitSummaryViewModel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: ge.bog.mobilebank.model.account.AccountLov} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ge.bog.mobilebank.model.account.AccountLov} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: ge.bog.mobilebank.model.account.AccountLov} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: ge.bog.mobilebank.model.account.AccountLov} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo54510a(p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts r4) {
            /*
                r3 = this;
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel r0 = r3.f58353d
                kz.b r1 = r0.f58336k
                ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r4 = r4.mo52165e()
                kotlin.jvm.internal.C41536l.m120486f(r4)
                java.util.List r4 = r4.mo52123b()
                java.util.List r4 = r1.mo64418b(r4)
                r0.f58343r = r4
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel r4 = r3.f58353d
                java.util.List r4 = r4.f58343r
                int r4 = r4.size()
                r0 = 1
                if (r4 != r0) goto L_0x0032
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel r4 = r3.f58353d
                java.util.List r4 = r4.mo54494Jw()
                java.lang.Object r4 = ie1.C41358y.m120007W(r4)
                ge.bog.mobilebank.model.account.AccountLov r4 = (p341ge.bog.mobilebank.model.account.AccountLov) r4
                goto L_0x0054
            L_0x0032:
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel r4 = r3.f58353d
                java.util.List r4 = r4.f58343r
                java.util.Iterator r4 = r4.iterator()
            L_0x003c:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x0050
                java.lang.Object r1 = r4.next()
                r2 = r1
                ge.bog.mobilebank.model.account.AccountLov r2 = (p341ge.bog.mobilebank.model.account.AccountLov) r2
                boolean r2 = r2.isDefault()
                if (r2 == 0) goto L_0x003c
                goto L_0x0051
            L_0x0050:
                r1 = 0
            L_0x0051:
                r4 = r1
                ge.bog.mobilebank.model.account.AccountLov r4 = (p341ge.bog.mobilebank.model.account.AccountLov) r4
            L_0x0054:
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel r1 = r3.f58353d
                r1.f58342q = r4
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel r4 = r3.f58353d
                androidx.lifecycle.x r4 = r4.f58344s
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel r1 = r3.f58353d
                ge.bog.mobilebank.model.account.AccountLov r1 = r1.f58342q
                if (r1 != 0) goto L_0x0068
                goto L_0x0069
            L_0x0068:
                r0 = 0
            L_0x0069:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                m41.a r0 = g91.C32343x.m95466m(r0)
                p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c.m69418j(r4, r0)
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel r4 = r3.f58353d
                r4.m70880Uw()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel.C21908b.mo54510a(ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54510a((TransferAccounts) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$c */
    static final class C21909c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryViewModel f58354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21909c(BillSplitSummaryViewModel billSplitSummaryViewModel) {
            super(1);
            this.f58354d = billSplitSummaryViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58354d.f58344s, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$d */
    static final class C21910d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryViewModel f58355d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21910d(BillSplitSummaryViewModel billSplitSummaryViewModel) {
            super(1);
            this.f58355d = billSplitSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54512a(List list) {
            BillSplitSummaryViewModel billSplitSummaryViewModel = this.f58355d;
            C30140a vw = billSplitSummaryViewModel.f58333h;
            C41536l.m120488h(list, "it");
            billSplitSummaryViewModel.f58348w = vw.mo70492d(list);
            this.f58355d.m70880Uw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54512a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$e */
    static final class C21911e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21911e f58356d = new C21911e();

        C21911e() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C10468i.m38038b(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$f */
    static final class C21912f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryViewModel f58357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21912f(BillSplitSummaryViewModel billSplitSummaryViewModel) {
            super(1);
            this.f58357d = billSplitSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54514a(C25070b bVar) {
            this.f58357d.f58346u = bVar;
            this.f58357d.m70880Uw();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54514a((C25070b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$g */
    public static final class C21913g {

        /* renamed from: a */
        private final boolean f58358a;

        /* renamed from: b */
        private final Double f58359b;

        public C21913g(boolean z, Double d) {
            this.f58358a = z;
            this.f58359b = d;
        }

        /* renamed from: a */
        public final Double mo54515a() {
            return this.f58359b;
        }

        /* renamed from: b */
        public final boolean mo54516b() {
            return this.f58358a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21913g)) {
                return false;
            }
            C21913g gVar = (C21913g) obj;
            return this.f58358a == gVar.f58358a && C41536l.m120484d(this.f58359b, gVar.f58359b);
        }

        public int hashCode() {
            boolean z = this.f58358a;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            Double d = this.f58359b;
            return i + (d == null ? 0 : d.hashCode());
        }

        public String toString() {
            boolean z = this.f58358a;
            Double d = this.f58359b;
            return "NextButtonViewState(isActive=" + z + ", amount=" + d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C21913g(boolean z, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : d);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$h */
    static final class C21914h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryViewModel f58360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21914h(BillSplitSummaryViewModel billSplitSummaryViewModel) {
            super(1);
            this.f58360d = billSplitSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54520a(C41205b bVar) {
            C21484c.m69417i(this.f58360d.f58347v, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54520a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$i */
    static final class C21915i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BillSplitSummaryViewModel f58361d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21915i(BillSplitSummaryViewModel billSplitSummaryViewModel) {
            super(1);
            this.f58361d = billSplitSummaryViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58361d.f58347v, th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillSplitSummaryViewModel(C24836a aVar, C24825r rVar, C24818l0 l0Var, C24829v vVar, C24830w wVar, C24820m0 m0Var, C30140a aVar2, C24831x xVar, C30142c cVar, C25795b bVar, C24821n nVar, C36730b bVar2, Client client, C24826s sVar, C24823p pVar, PreferencesApiManager preferencesApiManager) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C24818l0 l0Var2 = l0Var;
        C24829v vVar2 = vVar;
        C24830w wVar2 = wVar;
        C24820m0 m0Var2 = m0Var;
        C30140a aVar3 = aVar2;
        C24831x xVar2 = xVar;
        C30142c cVar2 = cVar;
        C25795b bVar3 = bVar;
        C24821n nVar2 = nVar;
        C36730b bVar4 = bVar2;
        Client client2 = client;
        C24826s sVar2 = sVar;
        PreferencesApiManager preferencesApiManager2 = preferencesApiManager;
        C41536l.m120489i(aVar, "getTransferAccountsUseCase");
        C41536l.m120489i(rVar, "getOperations");
        C41536l.m120489i(l0Var2, "setSelfRequestAmountUseCase");
        C41536l.m120489i(vVar2, "removeOperationByIdUseCase");
        C41536l.m120489i(wVar2, "removeReceiver");
        C41536l.m120489i(m0Var2, "updateRequestedAmount");
        C41536l.m120489i(aVar3, "operationsMapper");
        C41536l.m120489i(xVar2, "resetReceiverRequestAmountsUseCase");
        C41536l.m120489i(cVar2, "contactsMapper");
        C41536l.m120489i(bVar3, "bankAccountMapper");
        C41536l.m120489i(nVar2, "createBillSplitUseCase");
        C41536l.m120489i(bVar4, "getClientAvatarUrl");
        C41536l.m120489i(client2, "client");
        C41536l.m120489i(sVar2, "includeCurrentUser");
        C41536l.m120489i(pVar, "getBillSplitDetails");
        C41536l.m120489i(preferencesApiManager2, "preferencesApiManager");
        this.f58329d = l0Var2;
        this.f58330e = vVar2;
        this.f58331f = wVar2;
        this.f58332g = m0Var2;
        this.f58333h = aVar3;
        this.f58334i = xVar2;
        this.f58335j = cVar2;
        this.f58336k = bVar3;
        this.f58337l = nVar2;
        this.f58338m = bVar4;
        this.f58339n = client2;
        this.f58340o = sVar2;
        this.f58341p = preferencesApiManager2;
        C41205b I = aVar.mo63245a().mo95063B(C40992a.m118827a()).mo95083l(new C20647d(new C21907a(this))).mo95070I(new C20648e(new C21908b(this)), new C20649f(new C21909c(this)));
        C41536l.m120488h(I, "getTransferAccountsUseCa…          }\n            )");
        bindToLifecycle(I);
        C41205b G0 = C32343x.m95413R0(rVar.mo63236a()).mo94983G0(new C20650g(new C21910d(this)), new C20651h(C21911e.f58356d));
        C41536l.m120488h(G0, "getOperations()\n        …report(it)\n            })");
        bindToLifecycle(G0);
        C41205b F0 = C32343x.m95413R0(pVar.mo63234a()).mo94981F0(new C20652i(new C21912f(this)));
        C41536l.m120488h(F0, "getBillSplitDetails()\n  …taChanged()\n            }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public static final void m70875Gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m70876Hw(BillSplitSummaryViewModel billSplitSummaryViewModel) {
        C41536l.m120489i(billSplitSummaryViewModel, "this$0");
        C21484c.m69418j(billSplitSummaryViewModel.f58347v, billSplitSummaryViewModel.m70878Ow());
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m70877Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ow */
    private final MoneyRequestSuccessItem m70878Ow() {
        C25070b bVar = this.f58346u;
        C41536l.m120486f(bVar);
        String Q = C32343x.m95410Q(bVar.mo63522i(), "GEL", false, 2, (Object) null);
        C25070b bVar2 = this.f58346u;
        C41536l.m120486f(bVar2);
        String valueOf = String.valueOf(bVar2.mo63520h());
        AccountLov accountLov = this.f58342q;
        String str = this.f58345t;
        if (str == null) {
            str = "";
        }
        return new MoneyRequestSuccessItem(true, Q, valueOf, accountLov, str);
    }

    /* renamed from: Pw */
    private final int m70879Pw() {
        String str;
        int i = 0;
        for (AccountLov acctNo : this.f58343r) {
            String acctNo2 = acctNo.getAcctNo();
            AccountLov accountLov = this.f58342q;
            if (accountLov != null) {
                str = accountLov.getAcctNo();
            } else {
                str = null;
            }
            if (C41536l.m120484d(acctNo2, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public final void m70880Uw() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C19878a.C19880b.f54368b);
        arrayList.add(C19878a.C19885g.f54376b);
        if (this.f58348w.isEmpty() || this.f58348w.size() > 2) {
            arrayList.add(new C19878a.C19886h(this.f58348w, 0, 2, (DefaultConstructorMarker) null));
        } else {
            List<C19151a> list = this.f58348w;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
            for (C19151a fVar : list) {
                arrayList2.add(new C19878a.C19884f(fVar, 0, 2, (DefaultConstructorMarker) null));
            }
            arrayList.addAll(arrayList2);
        }
        arrayList.add(C19878a.C19889k.f54386b);
        C25070b bVar = this.f58346u;
        if (bVar != null) {
            if (!bVar.mo63523j() || bVar.mo63515d()) {
                z = false;
            } else {
                z = true;
            }
            arrayList.add(new C19878a.C19879a(bVar.mo63518f(), bVar.mo63522i(), z, 0, 8, (DefaultConstructorMarker) null));
            arrayList.add(C19878a.C19880b.f54368b);
            arrayList.add(new C19878a.C19883e(bVar.mo63520h(), 0, 2, (DefaultConstructorMarker) null));
            arrayList.add(new C19878a.C19887i(true ^ bVar.mo63523j(), 0, 2, (DefaultConstructorMarker) null));
            arrayList.add(new C19878a.C19888j(this.f58339n.getUserInfo().getClient().getName(this.f58341p.getLanguage()), this.f58338m.mo89557a(), bVar.mo63516e(), bVar.mo63514c(), 0, 16, (DefaultConstructorMarker) null));
            List<C26305b> g = bVar.mo63519g();
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(g, 10));
            for (C26305b bVar2 : g) {
                arrayList3.add(new C19878a.C19882d(this.f58335j.mo70495a(bVar2), bVar2.mo65472c(), 0, 4, (DefaultConstructorMarker) null));
            }
            arrayList.addAll(arrayList3);
        }
        arrayList.add(C19878a.C19880b.f54368b);
        C19898f fVar2 = C19898f.ACCOUNT_COMMENT_INPUT;
        String str = this.f58345t;
        if (str == null) {
            str = "";
        }
        arrayList.add(new C19878a.C19890l(new C19899g(fVar2, (BigDecimal) null, this.f58342q, str, 2, (DefaultConstructorMarker) null), 0, 2, (DefaultConstructorMarker) null));
        this.f58349x.mo4826r(arrayList);
        m70883ax();
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final void m70881Ww() {
    }

    /* access modifiers changed from: private */
    /* renamed from: Yw */
    public static final void m70882Yw() {
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if ((!r6.f58348w.isEmpty()) != false) goto L_0x0031;
     */
    /* renamed from: ax */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m70883ax() {
        /*
            r6 = this;
            hv.b r0 = r6.f58346u
            if (r0 == 0) goto L_0x0030
            double r1 = r0.mo63518f()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0030
            double r1 = r0.mo63522i()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0030
            ge.bog.mobilebank.model.account.AccountLov r1 = r6.f58342q
            if (r1 == 0) goto L_0x0030
            java.util.List r1 = r0.mo63519g()
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0030
            java.util.List r1 = r6.f58348w
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            androidx.lifecycle.x r1 = r6.f58351z
            ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$g r3 = new ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel$g
            if (r0 == 0) goto L_0x0040
            double r4 = r0.mo63522i()
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r3.<init>(r2, r0)
            r1.mo4826r(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel.m70883ax():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public static final void m70886ex() {
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m70897pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m70898qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m70899rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: sw */
    public static final void m70900sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: tw */
    public static final void m70901tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Fw */
    public final void mo54493Fw() {
        double d;
        Integer num;
        long j;
        C1644x xVar = this.f58350y;
        C25070b bVar = this.f58346u;
        if (bVar != null) {
            d = bVar.mo63522i();
        } else {
            d = Utils.DOUBLE_EPSILON;
        }
        String Q = C32343x.m95410Q(d, "GEL", false, 2, (Object) null);
        C25070b bVar2 = this.f58346u;
        String str = null;
        if (bVar2 != null) {
            num = Integer.valueOf(bVar2.mo63520h());
        } else {
            num = null;
        }
        xVar.mo4826r(new C41224m("money_request_type_split_approve_click", "Total - " + Q + ", Quantity - " + num));
        C24821n nVar = this.f58337l;
        String str2 = this.f58345t;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        AccountLov accountLov = this.f58342q;
        if (accountLov != null) {
            str = accountLov.getAcctNo();
        }
        if (str != null) {
            str3 = str;
        }
        AccountLov accountLov2 = this.f58342q;
        if (accountLov2 != null) {
            j = accountLov2.getMainAcctKey();
        } else {
            j = -1;
        }
        C41205b G = C32343x.m95411Q0(nVar.mo63232a(str2, str3, j)).mo94904r(new C20655l(new C21914h(this))).mo94888G(new C20645b(this), new C20646c(new C21915i(this)));
        C41536l.m120488h(G, "fun createBillSplit() {\n…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: Jw */
    public final List mo54494Jw() {
        return this.f58343r;
    }

    /* renamed from: Kw */
    public final LiveData mo54495Kw() {
        return this.f58344s;
    }

    /* renamed from: Lw */
    public final LiveData mo54496Lw() {
        return this.f58350y;
    }

    /* renamed from: Mw */
    public final LiveData mo54497Mw() {
        return this.f58349x;
    }

    /* renamed from: Nw */
    public final LiveData mo54498Nw() {
        return this.f58347v;
    }

    /* renamed from: Qw */
    public final int mo54499Qw(String str) {
        C41536l.m120489i(str, "id");
        int i = 0;
        for (WizardObject id : mo54500Rw()) {
            if (C41536l.m120484d(id.getId(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Rw */
    public final ArrayList mo54500Rw() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        WizardObject pageTitle = new WizardObject().setInputStyle(4).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setInputTitle(C32343x.m95452h0(C10328q.money_request_account_header, new Object[0])).setSelectorType(20).setPageTitle(C32343x.m95452h0(C10328q.money_request_account_wizard_title, new Object[0]));
        Integer valueOf = Integer.valueOf(m70879Pw());
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            str = valueOf.toString();
        }
        if (str == null) {
            str = "";
        }
        arrayList.add(pageTitle.setValue(str).setId("ACCOUNT_WIZARD_ID"));
        arrayList.add(new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setInputTitle(C32343x.m95452h0(C10328q.money_request_comment_header, new Object[0])).setValue(this.f58345t).setId("COMMENT_WIZARD_ID").setSkippable(true));
        return arrayList;
    }

    /* renamed from: Sw */
    public final void mo54501Sw(boolean z) {
        C41205b E = this.f58340o.mo63237a(z).mo94886E();
        C41536l.m120488h(E, "includeCurrentUser(include).subscribe()");
        bindToLifecycle(E);
    }

    /* renamed from: Tw */
    public final LiveData mo54502Tw() {
        return this.f58351z;
    }

    /* renamed from: Vw */
    public final void mo54503Vw(C19159d dVar) {
        C41536l.m120489i(dVar, "receiver");
        C41205b F = this.f58331f.mo63241a(dVar.mo47379c()).mo94887F(new C20644a());
        C41536l.m120488h(F, "removeReceiver(receiver.…           .subscribe { }");
        bindToLifecycle(F);
    }

    /* renamed from: Xw */
    public final void mo54504Xw(C19151a aVar) {
        C41536l.m120489i(aVar, "operation");
        C41205b F = C32343x.m95411Q0(this.f58330e.mo63240a(aVar.mo47359e())).mo94887F(new C20654k());
        C41536l.m120488h(F, "removeOperationByIdUseCa…           .subscribe { }");
        addDisposable(F);
    }

    /* renamed from: Zw */
    public final void mo54505Zw() {
        C41205b E = C32343x.m95411Q0(this.f58334i.mo63242a()).mo94886E();
        C41536l.m120488h(E, "resetReceiverRequestAmou…             .subscribe()");
        addDisposable(E);
    }

    /* renamed from: bx */
    public final void mo54506bx(double d) {
        C41205b E = C32343x.m95411Q0(this.f58329d.mo63229a(d)).mo94886E();
        C41536l.m120488h(E, "setSelfRequestAmountUseC…             .subscribe()");
        addDisposable(E);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: ge.bog.mobilebank.model.account.AccountLov} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: cx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54507cx(android.content.Intent r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x000a
            java.lang.String r1 = "WIZARD_DATA"
            java.util.ArrayList r3 = r3.getStringArrayListExtra(r1)
            goto L_0x000b
        L_0x000a:
            r3 = r0
        L_0x000b:
            if (r3 == 0) goto L_0x001a
            java.lang.String r1 = "COMMENT_WIZARD_ID"
            int r1 = r2.mo54499Qw(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = r0
        L_0x001b:
            if (r1 != 0) goto L_0x001f
            java.lang.String r1 = ""
        L_0x001f:
            r2.f58345t = r1
            if (r3 == 0) goto L_0x0044
            java.lang.String r1 = "ACCOUNT_WIZARD_ID"
            int r1 = r2.mo54499Qw(r1)
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0044
            java.lang.Integer r3 = cf1.C40438v.m117098j(r3)
            if (r3 == 0) goto L_0x0044
            int r3 = r3.intValue()
            java.util.List r0 = r2.f58343r
            java.lang.Object r3 = ie1.C41358y.m120010Z(r0, r3)
            r0 = r3
            ge.bog.mobilebank.model.account.AccountLov r0 = (p341ge.bog.mobilebank.model.account.AccountLov) r0
        L_0x0044:
            r2.f58342q = r0
            r2.m70880Uw()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.BillSplitSummaryViewModel.mo54507cx(android.content.Intent):void");
    }

    /* renamed from: dx */
    public final void mo54508dx(C19159d dVar, double d) {
        C41536l.m120489i(dVar, "receiver");
        C41205b F = this.f58332g.mo63231a(dVar.mo47379c(), d).mo94887F(new C20653j());
        C41536l.m120488h(F, "updateRequestedAmount(re…           .subscribe { }");
        bindToLifecycle(F);
    }
}
