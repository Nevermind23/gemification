package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.google.gson.C5494h;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import ed1.C40735b0;
import ed1.C40754t;
import ee1.C40767b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41232r;
import he1.C41238w;
import i20.C25104d;
import j20.C25310c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.banner.presentation.model.NboBanners;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountsAndCurrencies;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferCurrencyItem;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p748eu.C20292b;
import p758fu.C20557a;
import p763fz.C20581c;
import p763fz.C20585g;
import p763fz.C20586h;
import p777gz.C24838a;
import p816kz.C25794a;
import p816kz.C25795b;
import p846nz.C26643b;
import p846nz.C26644c;
import p846nz.C26645d;
import p846nz.C26646e;
import p846nz.C26647f;
import p846nz.C26648g;
import p856oz.C27095a;
import p856oz.C27099b;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel */
public final class MoneyTransferListViewModel$ViewModel extends C21481a implements C26643b, C26644c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C20586h f57063d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C20581c f57064e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20585g f57065f;

    /* renamed from: g */
    private final C20292b f57066g;

    /* renamed from: h */
    private final Gson f57067h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C25794a f57068i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C25795b f57069j;

    /* renamed from: k */
    private final C25310c f57070k;

    /* renamed from: l */
    private final C26643b f57071l = this;

    /* renamed from: m */
    private final C26644c f57072m = this;

    /* renamed from: n */
    private final C40767b f57073n;

    /* renamed from: o */
    private final C40767b f57074o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f57075p;

    /* renamed from: q */
    private final C1644x f57076q;

    /* renamed from: r */
    private final C1644x f57077r;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$a */
    static final class C21262a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferListViewModel$ViewModel f57078d;

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$a$a */
        static final class C21263a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MoneyTransferListViewModel$ViewModel f57079d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21263a(MoneyTransferListViewModel$ViewModel moneyTransferListViewModel$ViewModel) {
                super(1);
                this.f57079d = moneyTransferListViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C27095a invoke(List list) {
                C41536l.m120489i(list, "it");
                return new C27095a.C27098c(this.f57079d.f57068i.mo64417b(list), this.f57079d.m68882ow(), (C27099b) null, 4, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$a$b */
        static final class C21264b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C21264b f57080d = new C21264b();

            C21264b() {
                super(1);
            }

            /* renamed from: a */
            public final C27095a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return C27095a.C27096a.f68060a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21262a(MoneyTransferListViewModel$ViewModel moneyTransferListViewModel$ViewModel) {
            super(1);
            this.f57078d = moneyTransferListViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C27095a m68901d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C27095a) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C27095a m68902e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C27095a) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f57078d.f57063d.mo49123a().mo95075O().mo95026k0(new C21288b(new C21263a(this.f57078d))).mo95035t0(new C21289c(C21264b.f57080d)).mo94977D0(C27095a.C27097b.f68061a);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$b */
    static final class C21265b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferListViewModel$ViewModel f57081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21265b(MoneyTransferListViewModel$ViewModel moneyTransferListViewModel$ViewModel) {
            super(1);
            this.f57081d = moneyTransferListViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo53259a(C27095a aVar) {
            this.f57081d.f57075p.mo4826r(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53259a((C27095a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$c */
    static final class C21266c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferListViewModel$ViewModel f57082d;

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$c$a */
        static final class C21267a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MoneyTransferListViewModel$ViewModel f57083d;

            /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$c$a$a */
            static final class C21268a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C24838a f57084d;

                /* renamed from: e */
                final /* synthetic */ MoneyTransferListViewModel$ViewModel f57085e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C21268a(C24838a aVar, MoneyTransferListViewModel$ViewModel moneyTransferListViewModel$ViewModel) {
                    super(1);
                    this.f57084d = aVar;
                    this.f57085e = moneyTransferListViewModel$ViewModel;
                }

                /* renamed from: a */
                public final C41232r invoke(TransferAccountsAndCurrencies transferAccountsAndCurrencies) {
                    C41536l.m120489i(transferAccountsAndCurrencies, "it");
                    C24838a aVar = this.f57084d;
                    List b = this.f57085e.f57069j.mo64418b(transferAccountsAndCurrencies.mo52174a());
                    String b2 = transferAccountsAndCurrencies.mo52175b();
                    boolean e = transferAccountsAndCurrencies.mo52178e();
                    List<TransferCurrencyItem> d = transferAccountsAndCurrencies.mo52176d();
                    ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
                    for (TransferCurrencyItem transferCurrencyItem : d) {
                        TransferCurrencyUiItem transferCurrencyUiItem = r8;
                        TransferCurrencyUiItem transferCurrencyUiItem2 = new TransferCurrencyUiItem(transferCurrencyItem.mo52187a(), transferCurrencyItem.mo52191e(), transferCurrencyItem.mo52194g(), transferCurrencyItem.mo52193f(), transferCurrencyItem.mo52195h(), transferCurrencyItem.mo52197i(), transferCurrencyItem.mo52188b(), transferCurrencyItem.mo52189d());
                        arrayList.add(transferCurrencyUiItem);
                    }
                    return new C41232r(aVar, b, new MoneyTransferCurrenciesUiModel(b2, e, arrayList));
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21267a(MoneyTransferListViewModel$ViewModel moneyTransferListViewModel$ViewModel) {
                super(1);
                this.f57083d = moneyTransferListViewModel$ViewModel;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final C41232r m68915c(C43075l lVar, Object obj) {
                C41536l.m120489i(lVar, "$tmp0");
                return (C41232r) lVar.invoke(obj);
            }

            /* renamed from: b */
            public final C40735b0 invoke(C24838a aVar) {
                C41536l.m120489i(aVar, "moneyTransfer");
                return this.f57083d.f57065f.mo49122a(aVar.mo63247a(), aVar.mo63249c(), aVar.mo63251e()).mo95062A(new C21293g(new C21268a(aVar, this.f57083d)));
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$c$b */
        static final class C21269b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ MoneyTransferListViewModel$ViewModel f57086d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C21269b(MoneyTransferListViewModel$ViewModel moneyTransferListViewModel$ViewModel) {
                super(1);
                this.f57086d = moneyTransferListViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C27099b invoke(C41232r rVar) {
                Object obj;
                C41536l.m120489i(rVar, "<name for destructuring parameter 0>");
                C24838a aVar = (C24838a) rVar.mo95688a();
                List list = (List) rVar.mo95689b();
                MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel = (MoneyTransferCurrenciesUiModel) rVar.mo95690c();
                Object f = this.f57086d.f57075p.mo4814f();
                C41536l.m120487g(f, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.model.RemittanceProvidersUiState.Success");
                Iterator it = ((C27095a.C27098c) f).mo66391d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(((MoneyTransferTypeUiModel) obj).mo53145d(), aVar.mo63250d())) {
                        break;
                    }
                }
                MoneyTransferTypeUiModel moneyTransferTypeUiModel = (MoneyTransferTypeUiModel) obj;
                if (moneyTransferTypeUiModel == null) {
                    return null;
                }
                MoneyTransferWizardData.C21225a aVar2 = MoneyTransferWizardData.f56984s;
                C41536l.m120488h(aVar, "moneyTransfer");
                return new C27099b.C27102c(moneyTransferTypeUiModel, aVar2.mo53196a(aVar, list, (List) null, (Integer) null, moneyTransferCurrenciesUiModel));
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$c$c */
        static final class C21270c extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C21270c f57087d = new C21270c();

            C21270c() {
                super(1);
            }

            /* renamed from: a */
            public final C27099b invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return C27099b.C27100a.f68065a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21266c(MoneyTransferListViewModel$ViewModel moneyTransferListViewModel$ViewModel) {
            super(1);
            this.f57082d = moneyTransferListViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C40735b0 m68910e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40735b0) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static final C27099b m68911f(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C27099b) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final C27099b m68912g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C27099b) lVar.invoke(obj);
        }

        /* renamed from: d */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "transferNumber");
            return this.f57082d.f57064e.mo49118a(str).mo95087r(new C21290d(new C21267a(this.f57082d))).mo95075O().mo95026k0(new C21291e(new C21269b(this.f57082d))).mo95035t0(new C21292f(C21270c.f57087d)).mo94977D0(C27099b.C27101b.f68066a);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel$d */
    static final class C21271d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferListViewModel$ViewModel f57088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21271d(MoneyTransferListViewModel$ViewModel moneyTransferListViewModel$ViewModel) {
            super(1);
            this.f57088d = moneyTransferListViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo53265a(C27099b bVar) {
            if (this.f57088d.f57075p.mo4814f() instanceof C27095a.C27098c) {
                C1644x nw = this.f57088d.f57075p;
                Object f = this.f57088d.f57075p.mo4814f();
                C41536l.m120487g(f, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.model.RemittanceProvidersUiState.Success");
                nw.mo4826r(C27095a.C27098c.m84007b((C27095a.C27098c) f, (List) null, (C25104d) null, bVar, 3, (Object) null));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53265a((C27099b) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoneyTransferListViewModel$ViewModel(C20586h hVar, C20581c cVar, C20585g gVar, C20292b bVar, Gson gson, C25794a aVar, C25795b bVar2, C25310c cVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "moneyTransferUseCase");
        C41536l.m120489i(cVar, "findUniversalMoneyTransferUseCase");
        C41536l.m120489i(gVar, "moneyTransferAccountsAndCurrenciesWithDetailsUseCase");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(bVar2, "acctMapper");
        C41536l.m120489i(cVar2, "bannerDataMapper");
        this.f57063d = hVar;
        this.f57064e = cVar;
        this.f57065f = gVar;
        this.f57066g = bVar;
        this.f57067h = gson;
        this.f57068i = aVar;
        this.f57069j = bVar2;
        this.f57070k = cVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f57073n = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f57074o = h12;
        this.f57075p = new C1644x();
        this.f57076q = new C1644x();
        this.f57077r = new C1644x();
        m68886xw();
        m68883uw();
        mo53255tw();
    }

    /* access modifiers changed from: private */
    /* renamed from: ow */
    public final C25104d m68882ow() {
        C5494h hVar;
        List a;
        Object obj;
        try {
            C20557a b = this.f57066g.mo48775b("NBO_BANNER");
            if (b != null) {
                hVar = b.mo49085b();
            } else {
                hVar = null;
            }
            NboBanners nboBanners = (NboBanners) this.f57067h.mo18165g(hVar, NboBanners.class);
            if (nboBanners == null || (a = C25310c.m80465f(this.f57070k, nboBanners, "MBANK_UMTS_PAGE", false, 4, (Object) null).mo63589a()) == null) {
                return null;
            }
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((C25104d) obj).mo63562c(), "UMTS_PAGE_CONVERTRATES")) {
                    break;
                }
            }
            return (C25104d) obj;
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    /* renamed from: uw */
    private final void m68883uw() {
        C41205b F0 = this.f57073n.mo94989L0(new C26645d(new C21262a(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26646e(new C21265b(this)));
        C41536l.m120488h(F0, "private fun subscribeToR…             })\n        }");
        addDisposable(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final C40754t m68884vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m68885ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: xw */
    private final void m68886xw() {
        C41205b F0 = this.f57074o.mo94989L0(new C26647f(new C21266c(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C26648g(new C21271d(this)));
        C41536l.m120488h(F0, "private fun subscribeToU…             })\n        }");
        addDisposable(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final C40754t m68887yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m68888zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Jc */
    public void mo53246Jc(MoneyTransferTypeUiModel moneyTransferTypeUiModel) {
        C41536l.m120489i(moneyTransferTypeUiModel, "transfer");
        if (C41536l.m120484d(moneyTransferTypeUiModel.mo53145d(), "ZOLOTAYA_KORONA")) {
            C37224b.m109966e(mo53247No(), moneyTransferTypeUiModel);
        } else {
            C37224b.m109966e(mo53249Wq(), moneyTransferTypeUiModel);
        }
    }

    /* renamed from: Qe */
    public LiveData mo53248Qe() {
        return this.f57075p;
    }

    /* renamed from: pw */
    public final C26643b mo53250pw() {
        return this.f57071l;
    }

    /* renamed from: qw */
    public C1644x mo53249Wq() {
        return this.f57077r;
    }

    /* renamed from: rp */
    public void mo53252rp(String str) {
        C41536l.m120489i(str, "transferNumber");
        this.f57074o.onNext(str);
    }

    /* renamed from: rw */
    public C1644x mo53247No() {
        return this.f57076q;
    }

    /* renamed from: sw */
    public final C26644c mo53254sw() {
        return this.f57072m;
    }

    /* renamed from: tw */
    public final void mo53255tw() {
        this.f57073n.onNext(C41238w.f97225a);
    }
}
