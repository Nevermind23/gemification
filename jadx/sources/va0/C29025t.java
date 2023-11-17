package va0;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import ed1.C40749p;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p775gx.C24836a;
import pa0.C27487a;
import ue1.C43064a;
import ue1.C43075l;
import xa0.C29664a;
import xa0.C29665b;
import y11.C39989a;
import z11.C40139a;

/* renamed from: va0.t */
public final class C29025t extends C21481a implements C29020o, C29022q, C29664a {

    /* renamed from: d */
    private final C29664a f73990d;

    /* renamed from: e */
    private final C24836a f73991e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final CombinedOfferModel f73992f;

    /* renamed from: g */
    private final DepositTypeDetailsUiModel f73993g;

    /* renamed from: h */
    private final C29020o f73994h = this;

    /* renamed from: i */
    private final C29022q f73995i = this;

    /* renamed from: j */
    private final C1644x f73996j = new C1644x();

    /* renamed from: k */
    private final C1644x f73997k = new C1644x();

    /* renamed from: l */
    private final C1644x f73998l = new C1644x();

    /* renamed from: m */
    private final C1644x f73999m = new C1644x();

    /* renamed from: n */
    private final C1644x f74000n = new C1644x();

    /* renamed from: o */
    private final C1644x f74001o = new C1644x();

    /* renamed from: p */
    private final C1644x f74002p = new C1644x();

    /* renamed from: q */
    private final LiveData f74003q = C1607m0.m5655c(mo56853f5(), new C29027b(this));
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AccumulateOnPaymentModel f74004r = new AccumulateOnPaymentModel((String) null, (BigDecimal) null, (Long) null, (Integer) null, (String) null, false, 63, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public AccumulateOnSpecificDateModel f74005s = new AccumulateOnSpecificDateModel((BigDecimal) null, (String) null, (String) null, (Long) null, (String) null, false, (String) null, (Long) null, (String) null, (String) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C40139a f74006t = C40139a.SRC;

    /* renamed from: u */
    private final C41217g f74007u = C41219i.m119470b(new C29028c(this));

    /* renamed from: va0.t$a */
    /* synthetic */ class C29026a extends C41535k implements C43075l {
        C29026a(Object obj) {
            super(1, obj, C29025t.class, "isValidAmount", "isValidAmount(Ljava/math/BigDecimal;)Z", 0);
        }

        /* renamed from: b */
        public final Boolean invoke(BigDecimal bigDecimal) {
            return Boolean.valueOf(((C29025t) this.receiver).mo56868ub(bigDecimal));
        }
    }

    /* renamed from: va0.t$b */
    static final class C29027b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29025t f74008d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29027b(C29025t tVar) {
            super(1);
            this.f74008d = tVar;
        }

        /* renamed from: a */
        public final C37223a invoke(C37223a aVar) {
            long j;
            Long j2;
            C41536l.m120489i(aVar, "it");
            DepositSubmissionNavData depositSubmissionNavData = (DepositSubmissionNavData) aVar.mo90299d();
            AccumulateOnPaymentModel jw = this.f74008d.f74004r;
            AccumulateOnSpecificDateModel kw = this.f74008d.f74005s;
            CombinedOfferModel lw = this.f74008d.f73992f;
            if (lw == null || (j2 = lw.mo56942j()) == null) {
                j = -1;
            } else {
                j = j2.longValue();
            }
            return C32343x.m95466m(new C29021p(depositSubmissionNavData, jw, kw, j));
        }
    }

    /* renamed from: va0.t$c */
    static final class C29028c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29025t f74009d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29028c(C29025t tVar) {
            super(0);
            this.f74009d = tVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m88844c(C29025t tVar, TransferAccountItem transferAccountItem) {
            String str;
            C41536l.m120489i(tVar, "this$0");
            C41536l.m120489i(transferAccountItem, "account");
            List<TransferAccountItem> t = transferAccountItem.mo52151t();
            if ((t instanceof Collection) && t.isEmpty()) {
                return false;
            }
            for (TransferAccountItem i : t) {
                String i2 = i.mo52142i();
                CombinedOfferModel lw = tVar.f73992f;
                if (lw != null) {
                    str = lw.mo56935e();
                } else {
                    str = null;
                }
                if (C41536l.m120484d(i2, str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final C39989a invoke() {
            return new C29032u(this.f74009d);
        }
    }

    /* renamed from: va0.t$d */
    static final class C29029d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f74010d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29029d(String str) {
            super(1);
            this.f74010d = str;
        }

        /* renamed from: a */
        public final C27487a invoke(C27487a aVar) {
            C41536l.m120489i(aVar, "$this$updateForm");
            return C27487a.m85254c(aVar, (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, (String) null, (Date) null, new WithdrawalTypeUiModel(this.f74010d, (String) null, (Boolean) null, (Boolean) null, 14, (DefaultConstructorMarker) null), 31, (Object) null);
        }
    }

    /* renamed from: va0.t$e */
    static final class C29030e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29025t f74011d;

        /* renamed from: e */
        final /* synthetic */ Long f74012e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29030e(C29025t tVar, Long l) {
            super(1);
            this.f74011d = tVar;
            this.f74012e = l;
        }

        /* renamed from: a */
        public final List invoke(TransferAccounts transferAccounts) {
            boolean z;
            C41536l.m120489i(transferAccounts, "list");
            C29025t tVar = this.f74011d;
            List gw = tVar.m88788nw(transferAccounts, tVar.f74006t);
            C39989a hw = this.f74011d.m88789ow();
            ArrayList arrayList = new ArrayList();
            for (Object next : gw) {
                if (hw.mo57048z((TransferAccountItem) next)) {
                    arrayList.add(next);
                }
            }
            Long l = this.f74012e;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                long m = ((TransferAccountItem) next2).mo52146m();
                if (l != null && m == l.longValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next2);
                }
            }
            return arrayList2;
        }
    }

    /* renamed from: va0.t$f */
    static final class C29031f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29025t f74013d;

        /* renamed from: e */
        final /* synthetic */ int f74014e;

        /* renamed from: f */
        final /* synthetic */ BigDecimal f74015f;

        /* renamed from: g */
        final /* synthetic */ Long f74016g;

        /* renamed from: h */
        final /* synthetic */ String f74017h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29031f(C29025t tVar, int i, BigDecimal bigDecimal, Long l, String str) {
            super(1);
            this.f74013d = tVar;
            this.f74014e = i;
            this.f74015f = bigDecimal;
            this.f74016g = l;
            this.f74017h = str;
        }

        /* renamed from: a */
        public final void mo68899a(List list) {
            C41536l.m120488h(list, "result");
            TransferAccountItem transferAccountItem = (TransferAccountItem) C41358y.m120009Y(list);
            if (transferAccountItem != null) {
                C29025t tVar = this.f74013d;
                int i = this.f74014e;
                BigDecimal bigDecimal = this.f74015f;
                Long l = this.f74016g;
                String str = this.f74017h;
                long fw = tVar.m88787mw(i);
                AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = r4;
                AccumulateOnSpecificDateModel accumulateOnSpecificDateModel2 = new AccumulateOnSpecificDateModel(bigDecimal, transferAccountItem.mo52134d(), (String) null, l, (String) null, false, str, Long.valueOf(fw), (String) null, (String) null, Integer.valueOf(i), 820, (DefaultConstructorMarker) null);
                tVar.mo68873jk(accumulateOnSpecificDateModel);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68899a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29025t(C29664a aVar, C24836a aVar2, CombinedOfferModel combinedOfferModel, DepositTypeDetailsUiModel depositTypeDetailsUiModel) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        String str;
        BigDecimal bigDecimal;
        C29664a aVar3 = aVar;
        C24836a aVar4 = aVar2;
        CombinedOfferModel combinedOfferModel2 = combinedOfferModel;
        DepositTypeDetailsUiModel depositTypeDetailsUiModel2 = depositTypeDetailsUiModel;
        C41536l.m120489i(aVar3, "depositFirstStepDelegate");
        C41536l.m120489i(aVar4, "getAccountsUseCase");
        C41536l.m120489i(depositTypeDetailsUiModel2, "depositTypeModel");
        this.f73990d = aVar3;
        this.f73991e = aVar4;
        this.f73992f = combinedOfferModel2;
        this.f73993g = depositTypeDetailsUiModel2;
        bindToLifecycle(init(aVar));
        mo56844P8();
        mo56843Oe();
        mo56857hk();
        if (mo56848Vt() == null) {
            if (combinedOfferModel2 != null) {
                str = combinedOfferModel.mo56935e();
            } else {
                str = null;
            }
            C29026a aVar5 = new C29026a(this);
            if (combinedOfferModel2 != null) {
                bigDecimal = combinedOfferModel.mo56932b();
            } else {
                bigDecimal = null;
            }
            mo56865mk(new C27487a(depositTypeDetailsUiModel, aVar5, bigDecimal, str, (Date) null, (WithdrawalTypeUiModel) null, 48, (DefaultConstructorMarker) null));
            mo56867nf(C27487a.m85254c(mo56869ur(), (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, (String) null, (Date) null, (WithdrawalTypeUiModel) null, 63, (Object) null));
        }
        mo56846Q6();
        if (combinedOfferModel2 != null) {
            m88790sw(combinedOfferModel2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public final long m88787mw(int i) {
        Calendar instance = Calendar.getInstance();
        if (instance.get(5) >= i) {
            instance.add(2, 1);
        }
        instance.set(5, i);
        return instance.getTimeInMillis();
    }

    /* access modifiers changed from: private */
    /* renamed from: nw */
    public final List m88788nw(TransferAccounts transferAccounts, C40139a aVar) {
        List list = null;
        if (aVar == C40139a.DST) {
            TransferAccount b = transferAccounts.mo52162b();
            if (b != null) {
                list = b.mo52122a();
            }
        } else {
            TransferAccount b2 = transferAccounts.mo52162b();
            if (b2 != null) {
                list = b2.mo52123b();
            }
        }
        if (list == null) {
            return C41341q.m119907j();
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public final C39989a m88789ow() {
        return (C39989a) this.f74007u.getValue();
    }

    /* renamed from: sw */
    private final void m88790sw(CombinedOfferModel combinedOfferModel) {
        String str = "applications.deposits.offer.bundle.conditions.info.with.accumulate";
        if (!combinedOfferModel.mo56937f() && !combinedOfferModel.mo56938g()) {
            str = "applications.deposits.offer.bundle.conditions.info.without.accumulate";
        }
        C1644x xVar = this.f74000n;
        BigDecimal q = combinedOfferModel.mo56947q();
        if (q == null) {
            q = BigDecimal.ZERO;
        }
        C41536l.m120488h(q, "totalAmount ?: BigDecimal.ZERO");
        String e = combinedOfferModel.mo56935e();
        if (e == null) {
            e = "GEL";
        }
        C37224b.m109965d(xVar, new C29019n(str, q, e, String.valueOf(combinedOfferModel.mo56946p())));
        Integer p = combinedOfferModel.mo56946p();
        if (p != null) {
            mo56841K(p.intValue());
        }
        if (combinedOfferModel.mo56937f()) {
            mo68871Kb(new AccumulateOnPaymentModel(combinedOfferModel.mo56935e(), combinedOfferModel.mo56933d(), combinedOfferModel.mo56931a(), (Integer) null, (String) null, false, 56, (DefaultConstructorMarker) null));
        }
        if (combinedOfferModel.mo56938g()) {
            m88794ww(combinedOfferModel.mo56943k(), combinedOfferModel.mo56935e(), combinedOfferModel.mo56945m(), combinedOfferModel.mo56944l());
        }
        String h = combinedOfferModel.mo56939h();
        if (h != null) {
            C29665b.C29666a.m90080c(this, new C29029d(h), false, 2, (Object) null);
            mo56845Pn();
        }
    }

    /* renamed from: tw */
    private final void m88791tw() {
        C37224b.m109965d(this.f74000n, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* renamed from: uw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m88792uw(p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel r5) {
        /*
            r4 = this;
            boolean r0 = r5.mo57127j()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x003d
            java.math.BigDecimal r0 = r5.mo57120e()
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0022
            java.lang.String r5 = r5.mo57123g()
            if (r5 != 0) goto L_0x0017
            r5 = r3
        L_0x0017:
            ge.bog.designsystem.components.Amount r5 = p615tg.C17959a.m61881e(r0, r5)
            if (r5 == 0) goto L_0x0022
            java.lang.String r5 = p615tg.C17959a.m61877a(r5)
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            if (r5 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r3 = r5
        L_0x0029:
            r0[r1] = r3
            java.lang.String r5 = "applications.deposits.accumulate.CAS.amount"
            java.lang.String r5 = g91.C32343x.m95388F(r5, r0)
            ge.bog.designsystem.components.common.Color$Resource r0 = new ge.bog.designsystem.components.common.Color$Resource
            int r1 = da0.C19948b.f54494d
            r0.<init>(r1)
            he1.m r5 = he1.C41233s.m119492a(r5, r0)
            goto L_0x0050
        L_0x003d:
            java.lang.String r5 = "applications.deposits.accumulate.CAS.empty.state.text"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r5 = g91.C32343x.m95388F(r5, r0)
            ge.bog.designsystem.components.common.Color$Resource r0 = new ge.bog.designsystem.components.common.Color$Resource
            int r1 = da0.C19948b.f54493c
            r0.<init>(r1)
            he1.m r5 = he1.C41233s.m119492a(r5, r0)
        L_0x0050:
            java.lang.Object r0 = r5.mo95675a()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r5.mo95676b()
            ge.bog.designsystem.components.common.Color$Resource r5 = (p341ge.bog.designsystem.components.common.Color.Resource) r5
            androidx.lifecycle.x r1 = r4.f73998l
            va0.l r2 = new va0.l
            r2.<init>(r0, r5)
            r1.mo4823o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va0.C29025t.m88792uw(ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* renamed from: vw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m88793vw(p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel r5) {
        /*
            r4 = this;
            boolean r0 = r5.mo57149q()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x003d
            java.math.BigDecimal r0 = r5.mo57135d()
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0022
            java.lang.String r5 = r5.mo57137e()
            if (r5 != 0) goto L_0x0017
            r5 = r3
        L_0x0017:
            ge.bog.designsystem.components.Amount r5 = p615tg.C17959a.m61881e(r0, r5)
            if (r5 == 0) goto L_0x0022
            java.lang.String r5 = p615tg.C17959a.m61877a(r5)
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            if (r5 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r3 = r5
        L_0x0029:
            r0[r1] = r3
            java.lang.String r5 = "applications.deposits.accumulate.CAS.amount"
            java.lang.String r5 = g91.C32343x.m95388F(r5, r0)
            ge.bog.designsystem.components.common.Color$Resource r0 = new ge.bog.designsystem.components.common.Color$Resource
            int r1 = da0.C19948b.f54494d
            r0.<init>(r1)
            he1.m r5 = he1.C41233s.m119492a(r5, r0)
            goto L_0x0050
        L_0x003d:
            java.lang.String r5 = "applications.deposits.accumulate.STO.empty.state.text"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r5 = g91.C32343x.m95388F(r5, r0)
            ge.bog.designsystem.components.common.Color$Resource r0 = new ge.bog.designsystem.components.common.Color$Resource
            int r1 = da0.C19948b.f54493c
            r0.<init>(r1)
            he1.m r5 = he1.C41233s.m119492a(r5, r0)
        L_0x0050:
            java.lang.Object r0 = r5.mo95675a()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r5.mo95676b()
            ge.bog.designsystem.components.common.Color$Resource r5 = (p341ge.bog.designsystem.components.common.Color.Resource) r5
            androidx.lifecycle.x r1 = r4.f73999m
            va0.l r2 = new va0.l
            r2.<init>(r0, r5)
            r1.mo4823o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va0.C29025t.m88793vw(ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel):void");
    }

    /* renamed from: ww */
    private final void m88794ww(BigDecimal bigDecimal, String str, int i, Long l) {
        C40749p O = this.f73991e.mo63245a().mo95062A(new C29023r(new C29030e(this, l))).mo95075O();
        C41536l.m120488h(O, "private fun validateSTOo…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95453h1(O).mo94981F0(new C29024s(new C29031f(this, i, bigDecimal, l, str)));
        C41536l.m120488h(F0, "private fun validateSTOo…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final List m88795xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m88796yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: B8 */
    public void mo56837B8(C31128a aVar) {
        C41536l.m120489i(aVar, "newValue");
        this.f73990d.mo56837B8(aVar);
    }

    /* renamed from: F2 */
    public LiveData mo68884F2() {
        return this.f73997k;
    }

    /* renamed from: Fv */
    public LiveData mo68885Fv() {
        return this.f74001o;
    }

    /* renamed from: Hc */
    public LiveData mo56839Hc() {
        return this.f73990d.mo56839Hc();
    }

    /* renamed from: Jk */
    public boolean mo56840Jk() {
        return this.f73990d.mo56840Jk();
    }

    /* renamed from: K */
    public void mo56841K(int i) {
        Integer p;
        CombinedOfferModel combinedOfferModel = this.f73992f;
        boolean z = false;
        if (!(combinedOfferModel == null || (p = combinedOfferModel.mo56946p()) == null || p.intValue() != i)) {
            z = true;
        }
        if (!z) {
            m88791tw();
        }
        this.f73990d.mo56841K(i);
    }

    /* renamed from: Kb */
    public void mo68871Kb(AccumulateOnPaymentModel accumulateOnPaymentModel) {
        BigDecimal bigDecimal;
        C41536l.m120489i(accumulateOnPaymentModel, "accumulateOnPaymentModel");
        this.f74004r = accumulateOnPaymentModel;
        m88792uw(accumulateOnPaymentModel);
        BigDecimal e = accumulateOnPaymentModel.mo57120e();
        CombinedOfferModel combinedOfferModel = this.f73992f;
        if (combinedOfferModel != null) {
            bigDecimal = combinedOfferModel.mo56933d();
        } else {
            bigDecimal = null;
        }
        if (!C41536l.m120484d(e, bigDecimal)) {
            m88791tw();
        }
    }

    /* renamed from: Nr */
    public void mo56842Nr(String str, boolean z) {
        String str2;
        BigDecimal b;
        CombinedOfferModel combinedOfferModel = this.f73992f;
        if (combinedOfferModel == null || (b = combinedOfferModel.mo56932b()) == null) {
            str2 = null;
        } else {
            str2 = b.toString();
        }
        if (!C41536l.m120484d(str2, str)) {
            m88791tw();
        }
        this.f73990d.mo56842Nr(str, z);
    }

    /* renamed from: Oe */
    public void mo56843Oe() {
        this.f73990d.mo56843Oe();
    }

    /* renamed from: P8 */
    public void mo56844P8() {
        this.f73990d.mo56844P8();
    }

    /* renamed from: Pe */
    public void mo68872Pe() {
        C31128a aVar = (C31128a) mo56874z1().mo4814f();
        if (aVar != null) {
            C37224b.m109965d(this.f74001o, aVar);
        }
    }

    /* renamed from: Pn */
    public void mo56845Pn() {
        this.f73990d.mo56845Pn();
    }

    /* renamed from: Q6 */
    public void mo56846Q6() {
        this.f73990d.mo56846Q6();
    }

    /* renamed from: Sc */
    public LiveData mo68886Sc() {
        return this.f74000n;
    }

    /* renamed from: Up */
    public void mo56847Up(C31128a aVar) {
        C41536l.m120489i(aVar, "newValue");
        this.f73990d.mo56847Up(aVar);
    }

    /* renamed from: Vt */
    public C27487a mo56848Vt() {
        return this.f73990d.mo56848Vt();
    }

    /* renamed from: X1 */
    public LiveData mo68887X1() {
        return this.f73998l;
    }

    /* renamed from: Yi */
    public Date mo56849Yi(int i) {
        return this.f73990d.mo56849Yi(i);
    }

    /* renamed from: Z3 */
    public LiveData mo56850Z3() {
        return this.f73990d.mo56850Z3();
    }

    /* renamed from: Z6 */
    public void mo56851Z6(String str) {
        this.f73990d.mo56851Z6(str);
    }

    /* renamed from: e */
    public LiveData mo56852e() {
        return this.f73990d.mo56852e();
    }

    /* renamed from: e0 */
    public LiveData mo68888e0() {
        return this.f73999m;
    }

    /* renamed from: f5 */
    public LiveData mo56853f5() {
        return this.f73990d.mo56853f5();
    }

    /* renamed from: gv */
    public void mo56855gv() {
        this.f73990d.mo56855gv();
    }

    /* renamed from: hk */
    public void mo56857hk() {
        this.f73990d.mo56857hk();
    }

    /* renamed from: i9 */
    public void mo56858i9(C43075l lVar, boolean z) {
        C41536l.m120489i(lVar, "update");
        this.f73990d.mo56858i9(lVar, z);
    }

    /* renamed from: in */
    public C40749p mo56859in(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        return this.f73990d.mo56859in(pVar);
    }

    /* renamed from: jg */
    public LiveData mo68889jg() {
        return this.f74002p;
    }

    /* renamed from: jk */
    public void mo68873jk(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
        BigDecimal bigDecimal;
        C41536l.m120489i(accumulateOnSpecificDateModel, "accumulateOnSpecificDateModel");
        this.f74005s = accumulateOnSpecificDateModel;
        m88793vw(accumulateOnSpecificDateModel);
        BigDecimal d = accumulateOnSpecificDateModel.mo57135d();
        CombinedOfferModel combinedOfferModel = this.f73992f;
        if (combinedOfferModel != null) {
            bigDecimal = combinedOfferModel.mo56943k();
        } else {
            bigDecimal = null;
        }
        if (!C41536l.m120484d(d, bigDecimal)) {
            m88791tw();
        }
    }

    /* renamed from: m */
    public LiveData mo56864m() {
        return this.f73990d.mo56864m();
    }

    /* renamed from: mk */
    public void mo56865mk(C27487a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f73990d.mo56865mk(aVar);
    }

    /* renamed from: nf */
    public void mo56867nf(C27487a aVar) {
        this.f73990d.mo56867nf(aVar);
    }

    /* renamed from: p3 */
    public LiveData mo68890p3() {
        return this.f73996j;
    }

    /* renamed from: pw */
    public final C29020o mo68891pw() {
        return this.f73994h;
    }

    /* renamed from: q1 */
    public void mo68874q1() {
        C37224b.m109965d(this.f73996j, this.f74004r);
    }

    /* renamed from: qw */
    public LiveData mo68892qw() {
        return this.f74003q;
    }

    /* renamed from: r0 */
    public void mo68875r0() {
        C37224b.m109965d(this.f73997k, this.f74005s);
    }

    /* renamed from: rw */
    public final C29022q mo68893rw() {
        return this.f73995i;
    }

    /* renamed from: ub */
    public boolean mo56868ub(BigDecimal bigDecimal) {
        return this.f73990d.mo56868ub(bigDecimal);
    }

    /* renamed from: ur */
    public C27487a mo56869ur() {
        return this.f73990d.mo56869ur();
    }

    /* renamed from: vi */
    public LiveData mo56870vi() {
        return this.f73990d.mo56870vi();
    }

    /* renamed from: ws */
    public void mo56871ws(long j) {
        this.f73990d.mo56871ws(j);
    }

    /* renamed from: yg */
    public void mo68876yg() {
        C41224m mVar = (C41224m) mo56870vi().mo4814f();
        if (mVar != null) {
            C37224b.m109965d(this.f74002p, mVar.mo95678e());
        }
    }

    /* renamed from: z1 */
    public LiveData mo56874z1() {
        return this.f73990d.mo56874z1();
    }
}
