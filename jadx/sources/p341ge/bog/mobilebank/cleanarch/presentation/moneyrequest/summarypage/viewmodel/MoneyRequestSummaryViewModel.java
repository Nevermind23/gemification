package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel;

import a30.C19159d;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import com.github.mikephil.charting.utils.Utils;
import d30.C19891b;
import d30.C19892c;
import d30.C19896d;
import d30.C19897e;
import d30.C19898f;
import d30.C19899g;
import g30.C20658o;
import g30.C20659p;
import g30.C20660q;
import g30.C20661r;
import g30.C20662s;
import g30.C20663t;
import g30.C20664u;
import g30.C20665v;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41212c;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.MoneyRequestSuccessItem;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10328q;
import p773gv.C24819m;
import p773gv.C24822o;
import p773gv.C24824q;
import p773gv.C24830w;
import p775gx.C24836a;
import p816kz.C25795b;
import ue1.C43075l;
import z20.C30142c;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel */
public final class MoneyRequestSummaryViewModel extends C21481a {

    /* renamed from: r */
    public static final C21923h f58362r = new C21923h((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C25795b f58363d;

    /* renamed from: e */
    private final C24830w f58364e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C30142c f58365f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C19896d f58366g;

    /* renamed from: h */
    private final C24822o f58367h;

    /* renamed from: i */
    private final C24819m f58368i;

    /* renamed from: j */
    private boolean f58369j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f58370k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f58371l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f58372m = new C1644x();

    /* renamed from: n */
    private final C1644x f58373n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1639v f58374o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f58375p;

    /* renamed from: q */
    private final C1644x f58376q;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$a */
    static final class C21916a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryViewModel f58377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21916a(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
            super(1);
            this.f58377d = moneyRequestSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54535a(C41205b bVar) {
            C21484c.m69417i(this.f58377d.f58371l, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54535a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$b */
    static final class C21917b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryViewModel f58378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21917b(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
            super(1);
            this.f58378d = moneyRequestSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54536a(TransferAccounts transferAccounts) {
            Object obj;
            AccountLov accountLov;
            C25795b rw = this.f58378d.f58363d;
            TransferAccount e = transferAccounts.mo52165e();
            C41536l.m120486f(e);
            List b = rw.mo64418b(e.mo52123b());
            C19891b bVar = null;
            if (b.size() == 1) {
                accountLov = (AccountLov) C41358y.m120007W(b);
            } else {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((AccountLov) obj).isDefault()) {
                        break;
                    }
                }
                accountLov = (AccountLov) obj;
            }
            AccountLov accountLov2 = accountLov;
            C19891b bVar2 = (C19891b) this.f58378d.f58370k.mo4814f();
            if (bVar2 != null) {
                bVar = C19891b.m65743b(bVar2, (BigDecimal) null, accountLov2, (String) null, (BigDecimal) null, 0, 29, (Object) null);
            }
            this.f58378d.f58370k.mo4823o(bVar);
            C21484c.m69418j(this.f58378d.f58371l, b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54536a((TransferAccounts) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$c */
    static final class C21918c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryViewModel f58379d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21918c(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
            super(1);
            this.f58379d = moneyRequestSummaryViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58379d.f58371l, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$d */
    static final class C21919d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryViewModel f58380d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21919d(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
            super(1);
            this.f58380d = moneyRequestSummaryViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
            if (r12 == null) goto L_0x003c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo54538a(java.util.List r12) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel r1 = r11.f58380d
                z20.c r1 = r1.f58365f
                java.lang.String r2 = "it"
                kotlin.jvm.internal.C41536l.m120488h(r12, r2)
                java.util.List r12 = r1.mo70496b(r12)
                r0.<init>(r12)
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel r12 = r11.f58380d
                androidx.lifecycle.x r12 = r12.f58370k
                java.lang.Object r12 = r12.mo4814f()
                d30.b r12 = (d30.C19891b) r12
                if (r12 == 0) goto L_0x003c
                java.math.BigDecimal r12 = r12.mo48238f()
                if (r12 == 0) goto L_0x003c
                java.math.BigDecimal r1 = new java.math.BigDecimal
                int r2 = r0.size()
                r1.<init>(r2)
                java.math.BigDecimal r12 = r12.multiply(r1)
                java.lang.String r1 = "this.multiply(other)"
                kotlin.jvm.internal.C41536l.m120488h(r12, r1)
                if (r12 != 0) goto L_0x0043
            L_0x003c:
                java.math.BigDecimal r12 = new java.math.BigDecimal
                r1 = 0
                r12.<init>(r1)
            L_0x0043:
                r7 = r12
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel r12 = r11.f58380d
                androidx.lifecycle.x r12 = r12.f58370k
                java.lang.Object r12 = r12.mo4814f()
                r3 = r12
                d30.b r3 = (d30.C19891b) r3
                if (r3 == 0) goto L_0x0061
                r4 = 0
                r5 = 0
                r6 = 0
                int r8 = r0.size()
                r9 = 7
                r10 = 0
                d30.b r12 = d30.C19891b.m65743b(r3, r4, r5, r6, r7, r8, r9, r10)
                goto L_0x0062
            L_0x0061:
                r12 = 0
            L_0x0062:
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel r1 = r11.f58380d
                androidx.lifecycle.x r1 = r1.f58375p
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel r2 = r11.f58380d
                d30.d r2 = r2.f58366g
                java.util.List r0 = r2.mo48256b(r0)
                r1.mo4826r(r0)
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel r0 = r11.f58380d
                androidx.lifecycle.x r0 = r0.f58370k
                r0.mo4826r(r12)
                ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel r12 = r11.f58380d
                r12.m70936Qw()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel.C21919d.mo54538a(java.util.List):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54538a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$e */
    static final class C21920e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21920e f58381d = new C21920e();

        C21920e() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$f */
    static final class C21921f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryViewModel f58382d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21921f(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
            super(1);
            this.f58382d = moneyRequestSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54540a(C19891b bVar) {
            List list;
            C1639v ww = this.f58382d.f58374o;
            List list2 = (List) this.f58382d.f58375p.mo4814f();
            if (list2 != null) {
                MoneyRequestSummaryViewModel moneyRequestSummaryViewModel = this.f58382d;
                C41536l.m120488h(bVar, "it");
                list = moneyRequestSummaryViewModel.m70959zw(bVar, list2);
            } else {
                list = null;
            }
            ww.mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54540a((C19891b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$g */
    static final class C21922g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryViewModel f58383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21922g(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
            super(1);
            this.f58383d = moneyRequestSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54541a(List list) {
            List list2;
            C1639v ww = this.f58383d.f58374o;
            C19891b bVar = (C19891b) this.f58383d.f58370k.mo4814f();
            if (bVar != null) {
                MoneyRequestSummaryViewModel moneyRequestSummaryViewModel = this.f58383d;
                C41536l.m120488h(list, "it");
                list2 = moneyRequestSummaryViewModel.m70959zw(bVar, list);
            } else {
                list2 = null;
            }
            ww.mo4826r(list2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54541a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$h */
    public static final class C21923h {
        private C21923h() {
        }

        public /* synthetic */ C21923h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$i */
    static final class C21924i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryViewModel f58384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21924i(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
            super(1);
            this.f58384d = moneyRequestSummaryViewModel;
        }

        /* renamed from: a */
        public final void mo54542a(C41205b bVar) {
            C21484c.m69417i(this.f58384d.f58372m, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54542a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$j */
    static final class C21925j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyRequestSummaryViewModel f58385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21925j(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
            super(1);
            this.f58385d = moneyRequestSummaryViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58385d.f58372m, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel$k */
    static final class C21926k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f58386a;

        C21926k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f58386a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f58386a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f58386a.invoke(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoneyRequestSummaryViewModel(C24836a aVar, C25795b bVar, C24830w wVar, C24824q qVar, C30142c cVar, C19896d dVar, C24822o oVar, C24819m mVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C25795b bVar2 = bVar;
        C24830w wVar2 = wVar;
        C30142c cVar2 = cVar;
        C19896d dVar2 = dVar;
        C24822o oVar2 = oVar;
        C24819m mVar2 = mVar;
        C41536l.m120489i(aVar, "transferAccountsUseCase");
        C41536l.m120489i(bVar2, "mapper");
        C41536l.m120489i(wVar2, "removeReceiver");
        C41536l.m120489i(qVar, "getMoneyRequestReceiversUseCase");
        C41536l.m120489i(cVar2, "itemMapper");
        C41536l.m120489i(dVar2, "summaryItemMapper");
        C41536l.m120489i(oVar2, "createMoneyRequestUseCase");
        C41536l.m120489i(mVar2, "clearMoneyRequestReceiversUseCase");
        this.f58363d = bVar2;
        this.f58364e = wVar2;
        this.f58365f = cVar2;
        this.f58366g = dVar2;
        this.f58367h = oVar2;
        this.f58368i = mVar2;
        C1644x xVar = new C1644x(new C19891b((BigDecimal) null, (AccountLov) null, (String) null, (BigDecimal) null, 0, 31, (DefaultConstructorMarker) null));
        this.f58370k = xVar;
        C1639v vVar = new C1639v();
        vVar.mo4826r(C41341q.m119910m(new C19892c.C19895c(new C19899g(C19898f.AMOUNT_INPUT, (BigDecimal) null, (AccountLov) null, (String) null, 14, (DefaultConstructorMarker) null)), new C19892c.C19894b(new C19897e((String) null, 0, (BigDecimal) null, 7, (DefaultConstructorMarker) null)), new C19892c.C19895c(new C19899g(C19898f.ACCOUNT_COMMENT_INPUT, (BigDecimal) null, (AccountLov) null, (String) null, 14, (DefaultConstructorMarker) null))));
        this.f58374o = vVar;
        C1644x xVar2 = new C1644x(C41341q.m119907j());
        this.f58375p = xVar2;
        this.f58376q = new C1644x(Boolean.FALSE);
        C41205b I = aVar.mo63245a().mo95083l(new C20658o(new C21916a(this))).mo95070I(new C20659p(new C21917b(this)), new C20660q(new C21918c(this)));
        C41536l.m120488h(I, "transferAccountsUseCase.…          }\n            )");
        addDisposable(I);
        C41205b G0 = qVar.mo63235a().mo95027o0(C40992a.m118827a()).mo94983G0(new C20661r(new C21919d(this)), new C20662s(C21920e.f58381d));
        C41536l.m120488h(G0, "getMoneyRequestReceivers…race()\n                })");
        addDisposable(G0);
        vVar.mo4956s(xVar, new C21926k(new C21921f(this)));
        vVar.mo4956s(xVar2, new C21926k(new C21922g(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m70931Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m70932Cw(MoneyRequestSummaryViewModel moneyRequestSummaryViewModel) {
        C41536l.m120489i(moneyRequestSummaryViewModel, "this$0");
        C21484c.m69418j(moneyRequestSummaryViewModel.f58372m, moneyRequestSummaryViewModel.m70934Hw());
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m70933Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Hw */
    private final MoneyRequestSuccessItem m70934Hw() {
        String str;
        int i;
        AccountLov accountLov;
        String str2;
        BigDecimal g;
        C19891b bVar = (C19891b) this.f58370k.mo4814f();
        if (bVar == null || (g = bVar.mo48239g()) == null || (str = C32343x.m95408P(g, "GEL")) == null) {
            str = C32343x.m95410Q(Utils.DOUBLE_EPSILON, "GEL", false, 2, (Object) null);
        }
        String str3 = str;
        C19891b bVar2 = (C19891b) this.f58370k.mo4814f();
        if (bVar2 != null) {
            i = bVar2.mo48234c();
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(i);
        C19891b bVar3 = (C19891b) this.f58370k.mo4814f();
        if (bVar3 != null) {
            accountLov = bVar3.mo48236e();
        } else {
            accountLov = null;
        }
        AccountLov accountLov2 = accountLov;
        C19891b bVar4 = (C19891b) this.f58370k.mo4814f();
        if (bVar4 == null || (str2 = bVar4.mo48235d()) == null) {
            str2 = "";
        }
        return new MoneyRequestSuccessItem(true, str3, valueOf, accountLov2, str2);
    }

    /* renamed from: Jw */
    private final int m70935Jw() {
        String str;
        AccountLov e;
        int i = 0;
        for (AccountLov acctNo : mo54523Ew()) {
            String acctNo2 = acctNo.getAcctNo();
            C19891b bVar = (C19891b) this.f58370k.mo4814f();
            if (bVar == null || (e = bVar.mo48236e()) == null) {
                str = null;
            } else {
                str = e.getAcctNo();
            }
            if (C41536l.m120484d(acctNo2, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if ((!r0) != false) goto L_0x0034;
     */
    /* renamed from: Qw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m70936Qw() {
        /*
            r7 = this;
            androidx.lifecycle.x r0 = r7.f58370k
            java.lang.Object r0 = r0.mo4814f()
            d30.b r0 = (d30.C19891b) r0
            androidx.lifecycle.x r1 = r7.f58375p
            java.lang.Object r1 = r1.mo4814f()
            java.util.List r1 = (java.util.List) r1
            androidx.lifecycle.x r2 = r7.f58376q
            if (r1 == 0) goto L_0x0033
            if (r0 == 0) goto L_0x0033
            java.math.BigDecimal r3 = r0.mo48238f()
            double r3 = r3.doubleValue()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0033
            ge.bog.mobilebank.model.account.AccountLov r0 = r0.mo48236e()
            if (r0 == 0) goto L_0x0033
            boolean r0 = r1.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.mo4826r(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel.m70936Qw():void");
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final void m70945lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final void m70946mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public static final void m70947nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public static final void m70948ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final List m70959zw(C19891b bVar, List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19892c.C19895c(new C19899g(C19898f.AMOUNT_INPUT, bVar.mo48238f(), bVar.mo48236e(), bVar.mo48235d())));
        arrayList.add(new C19892c.C19894b(new C19897e((String) null, bVar.mo48234c(), bVar.mo48239g(), 1, (DefaultConstructorMarker) null)));
        arrayList.addAll(list);
        arrayList.add(new C19892c.C19895c(new C19899g(C19898f.ACCOUNT_COMMENT_INPUT, bVar.mo48238f(), bVar.mo48236e(), bVar.mo48235d())));
        return arrayList;
    }

    /* renamed from: Aw */
    public final void mo54522Aw() {
        double d;
        Integer num;
        String str;
        String str2;
        long j;
        BigDecimal f;
        AccountLov e;
        AccountLov e2;
        String d2;
        BigDecimal g;
        C1644x xVar = this.f58373n;
        C19891b bVar = (C19891b) this.f58370k.mo4814f();
        double d3 = Utils.DOUBLE_EPSILON;
        if (bVar == null || (g = bVar.mo48239g()) == null) {
            d = 0.0d;
        } else {
            d = g.doubleValue();
        }
        String Q = C32343x.m95410Q(d, "GEL", false, 2, (Object) null);
        C19891b bVar2 = (C19891b) this.f58370k.mo4814f();
        String str3 = null;
        if (bVar2 != null) {
            num = Integer.valueOf(bVar2.mo48234c());
        } else {
            num = null;
        }
        xVar.mo4826r(new C41224m("money_request_type_request_approve_click", "Total - " + Q + ", Quantity - " + num));
        C24822o oVar = this.f58367h;
        C19891b bVar3 = (C19891b) this.f58370k.mo4814f();
        if (bVar3 == null || (d2 = bVar3.mo48235d()) == null) {
            str = "";
        } else {
            str = d2;
        }
        C19891b bVar4 = (C19891b) this.f58370k.mo4814f();
        if (!(bVar4 == null || (e2 = bVar4.mo48236e()) == null)) {
            str3 = e2.getAcctNo();
        }
        if (str3 == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        C19891b bVar5 = (C19891b) this.f58370k.mo4814f();
        if (bVar5 == null || (e = bVar5.mo48236e()) == null) {
            j = -1;
        } else {
            j = e.getMainAcctKey();
        }
        long j2 = j;
        C19891b bVar6 = (C19891b) this.f58370k.mo4814f();
        if (!(bVar6 == null || (f = bVar6.mo48238f()) == null)) {
            d3 = f.doubleValue();
        }
        C41205b G = oVar.mo63233a(str, str2, j2, d3).mo94906z(C40992a.m118827a()).mo94904r(new C20663t(new C21924i(this))).mo94888G(new C20664u(this), new C20665v(new C21925j(this)));
        C41536l.m120488h(G, "fun createMoneyRequest()…).bindToLifecycle()\n    }");
        bindToLifecycle(G);
    }

    /* renamed from: Ew */
    public final List mo54523Ew() {
        List list;
        C21503d dVar = (C21503d) mo54528Lw().mo4814f();
        boolean z = false;
        if (dVar != null && dVar.mo53704d()) {
            z = true;
        }
        if (!z) {
            return C41341q.m119907j();
        }
        C21503d dVar2 = (C21503d) mo54528Lw().mo4814f();
        if (dVar2 == null || (list = (List) dVar2.mo53701a()) == null) {
            return C41341q.m119907j();
        }
        return list;
    }

    /* renamed from: Fw */
    public final LiveData mo54524Fw() {
        return this.f58373n;
    }

    /* renamed from: Gw */
    public final LiveData mo54525Gw() {
        return this.f58372m;
    }

    /* renamed from: Iw */
    public final LiveData mo54526Iw() {
        return this.f58370k;
    }

    /* renamed from: Kw */
    public final LiveData mo54527Kw() {
        return this.f58374o;
    }

    /* renamed from: Lw */
    public final LiveData mo54528Lw() {
        return this.f58371l;
    }

    /* renamed from: Mw */
    public final int mo54529Mw(String str) {
        C41536l.m120489i(str, "id");
        int i = 0;
        for (WizardObject id : mo54530Nw()) {
            if (C41536l.m120484d(id.getId(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Nw */
    public final ArrayList mo54530Nw() {
        BigDecimal bigDecimal;
        Double d;
        String str;
        boolean z;
        String str2;
        ArrayList arrayList = new ArrayList();
        C19891b bVar = (C19891b) this.f58370k.mo4814f();
        String str3 = null;
        if (bVar != null) {
            bigDecimal = bVar.mo48238f();
        } else {
            bigDecimal = null;
        }
        WizardObject nonSelectableString = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_NUM_REAL).setInputTitle(C32343x.m95452h0(C10328q.money_request_money_header, new Object[0])).setPageTitle(C32343x.m95452h0(C10328q.money_request_requested_amount_wizard_title, new Object[0])).setNonSelectableString(" ₾");
        if (bigDecimal != null) {
            d = Double.valueOf(bigDecimal.doubleValue());
        } else {
            d = null;
        }
        C41536l.m120486f(d);
        String str4 = "";
        if (d.doubleValue() > Utils.DOUBLE_EPSILON) {
            str = C32343x.m95408P(bigDecimal, "GEL");
        } else {
            str = str4;
        }
        arrayList.add(nonSelectableString.setValue(str).setId("REQUESTED_AMOUNT_WIZARD_ID"));
        WizardObject pageTitle = new WizardObject().setInputStyle(4).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setInputTitle(C32343x.m95452h0(C10328q.money_request_account_header, new Object[0])).setSelectorType(20).setPageTitle(C32343x.m95452h0(C10328q.money_request_account_wizard_title, new Object[0]));
        Integer valueOf = Integer.valueOf(m70935Jw());
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            str2 = valueOf.toString();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str4 = str2;
        }
        arrayList.add(pageTitle.setValue(str4).setSkippableIfFilled(true).setId("ACCOUNT_WIZARD_ID"));
        WizardObject inputTitle = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS).setInputTitle(C32343x.m95452h0(C10328q.money_request_comment_header, new Object[0]));
        C19891b bVar2 = (C19891b) this.f58370k.mo4814f();
        if (bVar2 != null) {
            str3 = bVar2.mo48235d();
        }
        arrayList.add(inputTitle.setValue(str3).setSkippable(true).setId("COMMENT_WIZARD_ID"));
        return arrayList;
    }

    /* renamed from: Ow */
    public final LiveData mo54531Ow() {
        return this.f58376q;
    }

    /* renamed from: Pw */
    public final void mo54532Pw(C19159d dVar) {
        C41536l.m120489i(dVar, "receiver");
        C41205b E = this.f58364e.mo63241a(dVar.mo47379c()).mo94886E();
        C41536l.m120488h(E, "removeReceiver(receiver.…\n            .subscribe()");
        bindToLifecycle(E);
    }

    /* renamed from: Rw */
    public final void mo54533Rw(boolean z) {
        this.f58369j = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (r4.mo53704d() == true) goto L_0x008b;
     */
    /* renamed from: Sw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54534Sw(android.content.Intent r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x000a
            java.lang.String r1 = "WIZARD_DATA"
            java.util.ArrayList r12 = r12.getStringArrayListExtra(r1)
            goto L_0x000b
        L_0x000a:
            r12 = r0
        L_0x000b:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r3 = 0
            if (r12 == 0) goto L_0x0038
            java.lang.String r1 = "REQUESTED_AMOUNT_WIZARD_ID"
            int r1 = r11.mo54529Mw(r1)
            java.lang.Object r1 = r12.get(r1)
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0038
            java.lang.String r6 = " ₾"
            java.lang.String r7 = ""
            r8 = 0
            r9 = 4
            r10 = 0
            java.lang.String r1 = cf1.C40439w.m117103B(r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x0038
            java.lang.Double r1 = g91.C32343x.m95421V0(r1)
            if (r1 == 0) goto L_0x0038
            double r5 = r1.doubleValue()
            goto L_0x0039
        L_0x0038:
            r5 = r3
        L_0x0039:
            r2.<init>(r5)
            if (r12 == 0) goto L_0x0056
            java.lang.String r1 = "ACCOUNT_WIZARD_ID"
            int r1 = r11.mo54529Mw(r1)
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0056
            java.lang.String r5 = "get(getWizardObjectIndex(ACCOUNT_WIZARD_ID))"
            kotlin.jvm.internal.C41536l.m120488h(r1, r5)
            java.lang.Integer r1 = cf1.C40438v.m117098j(r1)
            goto L_0x0057
        L_0x0056:
            r1 = r0
        L_0x0057:
            if (r12 == 0) goto L_0x0067
            java.lang.String r5 = "COMMENT_WIZARD_ID"
            int r5 = r11.mo54529Mw(r5)
            java.lang.Object r12 = r12.get(r5)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L_0x0069
        L_0x0067:
            java.lang.String r12 = ""
        L_0x0069:
            java.lang.String r5 = "it?.get(getWizardObjectI…COMMENT_WIZARD_ID)) ?: \"\""
            kotlin.jvm.internal.C41536l.m120488h(r12, r5)
            java.math.BigDecimal r5 = new java.math.BigDecimal
            r5.<init>(r3)
            r3 = 0
            if (r1 == 0) goto L_0x00ad
            androidx.lifecycle.LiveData r4 = r11.mo54528Lw()
            java.lang.Object r4 = r4.mo4814f()
            ge.bog.mobilebank.cleanarch.presentation.common.d r4 = (p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d) r4
            if (r4 == 0) goto L_0x008a
            boolean r4 = r4.mo53704d()
            r6 = 1
            if (r4 != r6) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r6 = r3
        L_0x008b:
            if (r6 == 0) goto L_0x00ad
            androidx.lifecycle.LiveData r4 = r11.mo54528Lw()
            java.lang.Object r4 = r4.mo4814f()
            ge.bog.mobilebank.cleanarch.presentation.common.d r4 = (p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d) r4
            if (r4 == 0) goto L_0x00a0
            java.lang.Object r4 = r4.mo53701a()
            java.util.List r4 = (java.util.List) r4
            goto L_0x00a1
        L_0x00a0:
            r4 = r0
        L_0x00a1:
            if (r4 == 0) goto L_0x00ad
            int r0 = r1.intValue()
            java.lang.Object r0 = ie1.C41358y.m120010Z(r4, r0)
            ge.bog.mobilebank.model.account.AccountLov r0 = (p341ge.bog.mobilebank.model.account.AccountLov) r0
        L_0x00ad:
            androidx.lifecycle.x r1 = r11.f58375p
            java.lang.Object r1 = r1.mo4814f()
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x00cc
            int r1 = r1.size()
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r1)
            java.math.BigDecimal r3 = r2.multiply(r3)
            java.lang.String r4 = "this.multiply(other)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            r6 = r1
            r5 = r3
            goto L_0x00cd
        L_0x00cc:
            r6 = r3
        L_0x00cd:
            androidx.lifecycle.x r7 = r11.f58370k
            d30.b r8 = new d30.b
            r1 = r8
            r3 = r0
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.mo4826r(r8)
            r11.m70936Qw()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.summarypage.viewmodel.MoneyRequestSummaryViewModel.mo54534Sw(android.content.Intent):void");
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        if (this.f58369j) {
            this.f58368i.mo63230a();
        }
    }
}
