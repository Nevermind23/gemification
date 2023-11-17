package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountsAndCurrencies;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferCurrencyItem;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p763fz.C20579a;
import p763fz.C20580b;
import p763fz.C20582d;
import p763fz.C20585g;
import p777gz.C24838a;
import p777gz.C24841d;
import p796iz.C25275i;
import p796iz.C25276j;
import p796iz.C25277k;
import p796iz.C25278l;
import p796iz.C25279m;
import p796iz.C25280n;
import p816kz.C25794a;
import p816kz.C25795b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel */
public final class MoneyTransferWizardViewModel extends C21481a {

    /* renamed from: d */
    private final C20580b f56869d;

    /* renamed from: e */
    private final C20579a f56870e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C25795b f56871f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C25794a f56872g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C20585g f56873h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C20582d f56874i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f56875j = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1644x f56876k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f56877l = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f56878m = new C1644x();

    /* renamed from: n */
    private final C1644x f56879n = new C1644x();

    /* renamed from: o */
    private final C1644x f56880o = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f56881p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List f56882q;

    /* renamed from: r */
    private final C1644x f56883r = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1644x f56884s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C40767b f56885t;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$a */
    static final class C21174a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardViewModel f56886d;

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$a$a */
        static final class C21175a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MoneyTransferWizardViewModel f56887d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21175a(MoneyTransferWizardViewModel moneyTransferWizardViewModel) {
                super(1);
                this.f56887d = moneyTransferWizardViewModel;
            }

            /* renamed from: a */
            public final C41224m invoke(TransferAccountsAndCurrencies transferAccountsAndCurrencies) {
                C41536l.m120489i(transferAccountsAndCurrencies, "it");
                List b = this.f56887d.f56871f.mo64418b(transferAccountsAndCurrencies.mo52174a());
                String b2 = transferAccountsAndCurrencies.mo52175b();
                boolean e = transferAccountsAndCurrencies.mo52178e();
                List<TransferCurrencyItem> d = transferAccountsAndCurrencies.mo52176d();
                ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
                for (TransferCurrencyItem transferCurrencyItem : d) {
                    TransferCurrencyUiItem transferCurrencyUiItem = r7;
                    TransferCurrencyUiItem transferCurrencyUiItem2 = new TransferCurrencyUiItem(transferCurrencyItem.mo52187a(), transferCurrencyItem.mo52191e(), transferCurrencyItem.mo52194g(), transferCurrencyItem.mo52193f(), transferCurrencyItem.mo52195h(), transferCurrencyItem.mo52197i(), transferCurrencyItem.mo52188b(), transferCurrencyItem.mo52189d());
                    arrayList.add(transferCurrencyUiItem);
                }
                return new C41224m(b, new MoneyTransferCurrenciesUiModel(b2, e, arrayList));
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$a$b */
        static final class C21176b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24838a f56888d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21176b(C24838a aVar) {
                super(1);
                this.f56888d = aVar;
            }

            /* renamed from: a */
            public final C41232r invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "it");
                return new C41232r(this.f56888d, mVar.mo95678e(), mVar.mo95680f());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21174a(MoneyTransferWizardViewModel moneyTransferWizardViewModel) {
            super(1);
            this.f56886d = moneyTransferWizardViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C41224m m68604d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C41232r m68605e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41232r) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40735b0 invoke(C24838a aVar) {
            C41536l.m120489i(aVar, "moneyTransfer");
            return this.f56886d.f56873h.mo49122a(aVar.mo63247a(), aVar.mo63249c(), aVar.mo63251e()).mo95062A(new C21184a(new C21175a(this.f56886d))).mo95062A(new C21219b(new C21176b(aVar)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$b */
    static final class C21177b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardViewModel f56889d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21177b(MoneyTransferWizardViewModel moneyTransferWizardViewModel) {
            super(1);
            this.f56889d = moneyTransferWizardViewModel;
        }

        /* renamed from: a */
        public final void mo53085a(C41205b bVar) {
            this.f56889d.f56875j.mo4823o(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53085a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$c */
    static final class C21178c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardViewModel f56890d;

        /* renamed from: e */
        final /* synthetic */ Integer f56891e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21178c(MoneyTransferWizardViewModel moneyTransferWizardViewModel, Integer num) {
            super(1);
            this.f56890d = moneyTransferWizardViewModel;
            this.f56891e = num;
        }

        /* renamed from: a */
        public final void mo53086a(C41232r rVar) {
            String d;
            this.f56890d.f56875j.mo4823o(Boolean.FALSE);
            String pw = this.f56890d.f56881p;
            if (pw == null) {
                C41536l.m120506z("transferSystemName");
                pw = null;
            }
            if (!C41536l.m120484d(pw, ((C24838a) rVar.mo95691d()).mo63250d()) && (d = ((C24838a) rVar.mo95691d()).mo63250d()) != null) {
                this.f56890d.f56885t.onNext(d);
            }
            C1644x rw = this.f56890d.f56876k;
            MoneyTransferWizardData.C21225a aVar = MoneyTransferWizardData.f56984s;
            Object d2 = rVar.mo95691d();
            C41536l.m120488h(d2, "transferWithAccountsAndCurrencies.first");
            rw.mo4823o(aVar.mo53196a((C24838a) d2, (List) rVar.mo95692e(), this.f56890d.f56882q, this.f56891e, (MoneyTransferCurrenciesUiModel) rVar.mo95694f()));
            this.f56890d.f56877l.mo4823o(new C37223a(C41238w.f97225a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53086a((C41232r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$d */
    static final class C21179d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardViewModel f56892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21179d(MoneyTransferWizardViewModel moneyTransferWizardViewModel) {
            super(1);
            this.f56892d = moneyTransferWizardViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f56892d.f56878m.mo4823o(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
            this.f56892d.f56875j.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$e */
    static final class C21180e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardViewModel f56893d;

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$e$a */
        static final class C21181a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ String f56894d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21181a(String str) {
                super(1);
                this.f56894d = str;
            }

            /* renamed from: a */
            public final C24841d invoke(List list) {
                Object obj;
                C41536l.m120489i(list, "list");
                String str = this.f56894d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(((C24841d) obj).mo63271d(), str)) {
                        break;
                    }
                }
                return (C24841d) obj;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$e$b */
        /* synthetic */ class C21182b extends C41535k implements C43075l {
            C21182b(Object obj) {
                super(1, obj, C25794a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/moneytransfers/domain/model/MoneyTransferType;)Lge/bog/mobilebank/cleanarch/moneytransfers/presentation/model/MoneyTransferTypeUiModel;", 0);
            }

            /* renamed from: b */
            public final MoneyTransferTypeUiModel invoke(C24841d dVar) {
                C41536l.m120489i(dVar, "p0");
                return ((C25794a) this.receiver).mo64416a(dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21180e(MoneyTransferWizardViewModel moneyTransferWizardViewModel) {
            super(1);
            this.f56893d = moneyTransferWizardViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C24841d m68613d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C24841d) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final MoneyTransferTypeUiModel m68614e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (MoneyTransferTypeUiModel) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "mtSystem");
            return this.f56893d.f56874i.mo49119a().mo95026k0(new C21220c(new C21181a(str))).mo95026k0(new C21221d(new C21182b(this.f56893d.f56872g)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferWizardViewModel$f */
    static final class C21183f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferWizardViewModel f56895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21183f(MoneyTransferWizardViewModel moneyTransferWizardViewModel) {
            super(1);
            this.f56895d = moneyTransferWizardViewModel;
        }

        /* renamed from: a */
        public final void mo53091a(MoneyTransferTypeUiModel moneyTransferTypeUiModel) {
            this.f56895d.f56884s.mo4826r(moneyTransferTypeUiModel);
            this.f56895d.f56881p = moneyTransferTypeUiModel.mo53145d();
            this.f56895d.f56882q = moneyTransferTypeUiModel.mo53143a();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53091a((MoneyTransferTypeUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoneyTransferWizardViewModel(C20580b bVar, C20579a aVar, C25795b bVar2, C25794a aVar2, C20585g gVar, C20582d dVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "findMoneyTransferUseCase");
        C41536l.m120489i(aVar, "convertMoneyUseCase");
        C41536l.m120489i(bVar2, "acctMapper");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(gVar, "moneyTransferAccountsAndCurrenciesWithDetailsUseCase");
        C41536l.m120489i(dVar, "getLastLoadedProvidersUseCase");
        this.f56869d = bVar;
        this.f56870e = aVar;
        this.f56871f = bVar2;
        this.f56872g = aVar2;
        this.f56873h = gVar;
        this.f56874i = dVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f56885t = h1;
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m68565Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m68566Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m68567Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Lw */
    private final void m68568Lw() {
        C40749p L0 = this.f56885t.mo94989L0(new C25275i(new C21180e(this)));
        C41536l.m120488h(L0, "private fun observeProvi…}.bindToLifecycle()\n    }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C25276j(new C21183f(this)));
        C41536l.m120488h(F0, "private fun observeProvi…}.bindToLifecycle()\n    }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final C40754t m68569Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m68570Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: yw */
    public static /* synthetic */ void m68591yw(MoneyTransferWizardViewModel moneyTransferWizardViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        moneyTransferWizardViewModel.mo53081xw(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final C40735b0 m68592zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* renamed from: Dw */
    public final LiveData mo53073Dw() {
        return this.f56878m;
    }

    /* renamed from: Ew */
    public final LiveData mo53074Ew() {
        return this.f56876k;
    }

    /* renamed from: Fw */
    public final LiveData mo53075Fw() {
        return this.f56877l;
    }

    /* renamed from: Gw */
    public final LiveData mo53076Gw() {
        return this.f56875j;
    }

    /* renamed from: Hw */
    public final MoneyTransferTypeUiModel mo53077Hw() {
        return (MoneyTransferTypeUiModel) this.f56884s.mo4814f();
    }

    /* renamed from: Iw */
    public final LiveData mo53078Iw() {
        return this.f56884s;
    }

    /* renamed from: Jw */
    public final MoneyTransferWizardData mo53079Jw() {
        return (MoneyTransferWizardData) this.f56876k.mo4814f();
    }

    /* renamed from: Kw */
    public final void mo53080Kw(MoneyTransferWizardData moneyTransferWizardData, String str, List list) {
        C41536l.m120489i(str, "systemName");
        this.f56881p = str;
        this.f56882q = list;
        this.f56876k.mo4826r(moneyTransferWizardData);
        m68568Lw();
    }

    /* renamed from: xw */
    public final void mo53081xw(String str, String str2) {
        Integer num;
        String str3;
        Integer num2;
        C41536l.m120489i(str, "transferNumber");
        List list = this.f56882q;
        String str4 = null;
        if (list != null) {
            num = Integer.valueOf(C41358y.m120012b0(list, str2));
        } else {
            num = null;
        }
        MoneyTransferWizardData moneyTransferWizardData = (MoneyTransferWizardData) this.f56876k.mo4814f();
        if (moneyTransferWizardData != null) {
            str3 = moneyTransferWizardData.mo53183v();
        } else {
            str3 = null;
        }
        if (C41536l.m120484d(str3, str)) {
            MoneyTransferWizardData moneyTransferWizardData2 = (MoneyTransferWizardData) this.f56876k.mo4814f();
            if (moneyTransferWizardData2 != null) {
                num2 = Integer.valueOf(moneyTransferWizardData2.mo53179s());
            } else {
                num2 = null;
            }
            if (C41536l.m120484d(num2, num)) {
                this.f56877l.mo4826r(new C37223a(C41238w.f97225a));
                return;
            }
        }
        C20580b bVar = this.f56869d;
        String str5 = this.f56881p;
        if (str5 == null) {
            C41536l.m120506z("transferSystemName");
        } else {
            str4 = str5;
        }
        C41205b I = bVar.mo49117a(str4, str, str2).mo95087r(new C25277k(new C21174a(this))).mo95083l(new C25278l(new C21177b(this))).mo95070I(new C25279m(new C21178c(this, num)), new C25280n(new C21179d(this)));
        C41536l.m120488h(I, "fun findTransfer(transfe…ent(Unit)\n        }\n    }");
        addDisposable(I);
    }
}
