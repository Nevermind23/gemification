package lb0;

import androidx.lifecycle.C1644x;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import j70.C25339b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb0.C25376a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lt0.C37154c;
import m41.C37224b;
import m70.C26156i;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p843nw.C26633o;
import p863pw.C27637o;
import ue1.C43075l;
import ue1.C43081r;
import xs0.C39860h;
import xs0.C39889y;

/* renamed from: lb0.g */
public final class C25884g extends C21481a implements C25879b, C25880c {

    /* renamed from: s */
    public static final C25889c f65871s = new C25889c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39889y f65872d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C39860h f65873e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C26633o f65874f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C25339b f65875g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C37154c f65876h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C25376a f65877i;

    /* renamed from: j */
    private final C25879b f65878j = this;

    /* renamed from: k */
    private final C25880c f65879k = this;

    /* renamed from: l */
    private final C1644x f65880l = new C1644x();

    /* renamed from: m */
    private final C1644x f65881m = new C1644x();

    /* renamed from: n */
    private final C1644x f65882n = new C1644x();

    /* renamed from: o */
    private final C1644x f65883o = new C1644x();

    /* renamed from: p */
    private final C1644x f65884p = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List f65885q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public AccumulateOnPaymentModel f65886r;

    /* renamed from: lb0.g$a */
    static final class C25885a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25884g f65887d;

        /* renamed from: lb0.g$a$a */
        static final class C25886a extends C41537m implements C43081r {

            /* renamed from: d */
            final /* synthetic */ C25884g f65888d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25886a(C25884g gVar) {
                super(4);
                this.f65888d = gVar;
            }

            /* renamed from: a */
            public final C41224m invoke(List list, List list2, C27637o oVar, C26156i iVar) {
                C41536l.m120489i(list, "tariffs");
                C41536l.m120489i(list2, "casAccounts");
                C41536l.m120489i(oVar, "cards");
                C41536l.m120489i(iVar, "accounts");
                List d = C37154c.m109819d(this.f65888d.f65876h, list, (String) null, 2, (Object) null);
                C25376a hw = this.f65888d.f65877i;
                String g = this.f65888d.f65886r.mo57123g();
                if (g == null) {
                    g = "";
                }
                return C41233s.m119492a(d, hw.mo63963c(list2, oVar, iVar, g));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25885a(C25884g gVar) {
            super(1);
            this.f65887d = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m81357c(C43081r rVar, Object obj, Object obj2, Object obj3, Object obj4) {
            C41536l.m120489i(rVar, "$tmp0");
            return (C41224m) rVar.invoke(obj, obj2, obj3, obj4);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40749p O = C40762x.m118152R(this.f65887d.f65872d.mo93588a("CDS_T"), this.f65887d.f65873e.mo93566a(), C26633o.m83102d(this.f65887d.f65874f, false, 1, (Object) null).mo94996P(), C26186e.m81990h(C25339b.C25340a.m80512a(this.f65887d.f65875g, false, 1, (Object) null)), new C25883f(new C25886a(this.f65887d))).mo95075O();
            C41536l.m120488h(O, "class ViewModel @Assiste…= \"CDS_T\"\n        }\n    }");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: lb0.g$b */
    static final class C25887b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25884g f65889d;

        /* renamed from: lb0.g$b$a */
        static final class C25888a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25884g f65890d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25888a(C25884g gVar) {
                super(1);
                this.f65890d = gVar;
            }

            /* renamed from: a */
            public final void mo64698a(C41224m mVar) {
                Object obj;
                boolean z;
                this.f65890d.f65885q = (List) mVar.mo95680f();
                Long d = this.f65890d.f65886r.mo57118d();
                if (d != null) {
                    C25884g gVar = this.f65890d;
                    long longValue = d.longValue();
                    List iw = gVar.f65885q;
                    if (iw != null) {
                        Iterator it = iw.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((CardAccountSelectorUiModel) obj).mo84203a() == longValue) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        CardAccountSelectorUiModel cardAccountSelectorUiModel = (CardAccountSelectorUiModel) obj;
                        if (cardAccountSelectorUiModel != null) {
                            gVar.mo64693xw(cardAccountSelectorUiModel);
                        }
                    }
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo64698a((C41224m) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25887b(C25884g gVar) {
            super(1);
            this.f65889d = gVar;
        }

        /* renamed from: a */
        public final void mo64697a(C31128a aVar) {
            Object obj;
            Double d;
            C1644x sw = this.f65889d.mo64682Ye();
            C41536l.m120488h(aVar, "result");
            C25884g gVar = this.f65889d;
            try {
                if (aVar instanceof C31128a.C31131c) {
                    Iterable<MoneyBoxTariffUiModel> iterable = (Iterable) ((C41224m) ((C31128a.C31131c) aVar).mo71340a()).mo95678e();
                    ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
                    for (MoneyBoxTariffUiModel moneyBoxTariffUiModel : iterable) {
                        double e = moneyBoxTariffUiModel.mo75113e();
                        BigDecimal e2 = gVar.f65886r.mo57120e();
                        if (e2 != null) {
                            d = Double.valueOf(e2.doubleValue());
                        } else {
                            d = null;
                        }
                        arrayList.add(new C41224m(moneyBoxTariffUiModel, Boolean.valueOf(C41536l.m120481a(e, d))));
                    }
                    obj = new C31128a.C31131c(arrayList, aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    obj = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                } else if (aVar instanceof C31128a.C31130b) {
                    obj = new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                obj = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
            sw.mo4823o(obj);
            C31132b.m92648j(aVar, (int[]) null, new C25888a(this.f65889d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64697a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lb0.g$c */
    public static final class C25889c {
        private C25889c() {
        }

        public /* synthetic */ C25889c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25884g(AccumulateOnPaymentModel accumulateOnPaymentModel, C39889y yVar, C39860h hVar, C26633o oVar, C25339b bVar, C37154c cVar, C25376a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(accumulateOnPaymentModel, "args");
        C41536l.m120489i(yVar, "getTariffs");
        C41536l.m120489i(hVar, "getAvailableCasAccounts");
        C41536l.m120489i(oVar, "getCardsAndDetails");
        C41536l.m120489i(bVar, "getAccountsAndDetails");
        C41536l.m120489i(cVar, "mapper");
        C41536l.m120489i(aVar, "accountsMapper");
        this.f65872d = yVar;
        this.f65873e = hVar;
        this.f65874f = oVar;
        this.f65875g = bVar;
        this.f65876h = cVar;
        this.f65877i = aVar;
        this.f65886r = accumulateOnPaymentModel;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C25881d(new C25885a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…stCode)\n                }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C25882e(new C25887b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…      }\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m81327fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m81328gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: zw */
    private final void m81338zw(AccumulateOnPaymentModel accumulateOnPaymentModel) {
        this.f65886r = accumulateOnPaymentModel;
        mo64684rg().mo4823o(this.f65886r);
    }

    /* renamed from: F1 */
    public void mo64678F1() {
        C37224b.m109965d(mo64685zo(), this.f65886r);
    }

    /* renamed from: P0 */
    public void mo64679P0() {
        boolean z;
        long j;
        List list = this.f65885q;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C1644x tw = mo64683f3();
            Long d = this.f65886r.mo57118d();
            if (d != null) {
                j = d.longValue();
            } else {
                j = -1;
            }
            Long valueOf = Long.valueOf(j);
            List list2 = this.f65885q;
            if (list2 == null) {
                list2 = C41341q.m119907j();
            }
            tw.mo4823o(C32343x.m95466m(C41233s.m119492a(valueOf, list2)));
            return;
        }
        C37224b.m109965d(mo64681Gu(), C41233s.m119492a(C32343x.m95388F("text.activate.iic.card.choose.account", new Object[0]), C32343x.m95388F("applications.deposits.acc.from.not.found", new Object[0])));
    }

    /* renamed from: mv */
    public void mo64680mv(double d) {
        m81338zw(AccumulateOnPaymentModel.m74476b(this.f65886r, (String) null, new BigDecimal(String.valueOf(d)), (Long) null, (Integer) null, (String) null, false, 61, (Object) null));
    }

    /* renamed from: qw */
    public C1644x mo64685zo() {
        return this.f65884p;
    }

    /* renamed from: rw */
    public final C25879b mo64687rw() {
        return this.f65878j;
    }

    /* renamed from: sw */
    public C1644x mo64682Ye() {
        return this.f65880l;
    }

    /* renamed from: tw */
    public C1644x mo64683f3() {
        return this.f65881m;
    }

    /* renamed from: uw */
    public final C25880c mo64690uw() {
        return this.f65879k;
    }

    /* renamed from: vw */
    public C1644x mo64684rg() {
        return this.f65883o;
    }

    /* renamed from: ww */
    public C1644x mo64681Gu() {
        return this.f65882n;
    }

    /* renamed from: xw */
    public void mo64693xw(CardAccountSelectorUiModel cardAccountSelectorUiModel) {
        C41536l.m120489i(cardAccountSelectorUiModel, "account");
        m81338zw(AccumulateOnPaymentModel.m74476b(this.f65886r, (String) null, (BigDecimal) null, Long.valueOf(cardAccountSelectorUiModel.mo84203a()), Integer.valueOf(cardAccountSelectorUiModel.mo84207e()), cardAccountSelectorUiModel.mo84204b(), cardAccountSelectorUiModel.mo84215k(), 3, (Object) null));
    }

    /* renamed from: yw */
    public void mo64694yw() {
        C37224b.m109965d(mo64685zo(), new AccumulateOnPaymentModel((String) null, (BigDecimal) null, (Long) null, (Integer) null, (String) null, false, 63, (DefaultConstructorMarker) null));
    }
}
