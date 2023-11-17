package p820lt;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import hd0.C24978b;
import he1.C41238w;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import k70.C25681e;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.AmexOfferInfoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardBlockStatusApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.products.entity.CardsAndDetailsApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardBlockStatus;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p810kt.C25766b;
import p810kt.C25767c;
import p810kt.C25768d;
import p863pw.C27634l;
import p863pw.C27637o;
import p873qw.C27868b;
import ue1.C43075l;

/* renamed from: lt.n */
public final class C26082n implements C27868b {

    /* renamed from: m */
    public static final C26083a f66189m = new C26083a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f66190d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25768d f66191e;

    /* renamed from: f */
    private final C25767c f66192f;

    /* renamed from: g */
    private final C25766b f66193g;

    /* renamed from: h */
    private final RetrofitClient f66194h;

    /* renamed from: i */
    private final RootBankApiManager f66195i;

    /* renamed from: j */
    private final C25681e f66196j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public AtomicBoolean f66197k = new AtomicBoolean(false);

    /* renamed from: l */
    private C40765a f66198l;

    /* renamed from: lt.n$a */
    public static final class C26083a {
        private C26083a() {
        }

        public /* synthetic */ C26083a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lt.n$b */
    static final class C26084b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26082n f66199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26084b(C26082n nVar) {
            super(1);
            this.f66199d = nVar;
        }

        /* renamed from: a */
        public final CardBlockStatus invoke(CardBlockStatusApiEntity cardBlockStatusApiEntity) {
            C41536l.m120489i(cardBlockStatusApiEntity, "it");
            return this.f66199d.f66191e.mo64359a(cardBlockStatusApiEntity);
        }
    }

    /* renamed from: lt.n$c */
    /* synthetic */ class C26085c extends C41535k implements C43075l {
        C26085c(Object obj) {
            super(1, obj, C25766b.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/data/products/entity/AmexOfferInfoApiEntity;)Lge/bog/mobilebank/cleanarch/domain/products/model/AmexOfferInfo;", 0);
        }

        /* renamed from: b */
        public final C27634l invoke(AmexOfferInfoApiEntity amexOfferInfoApiEntity) {
            C41536l.m120489i(amexOfferInfoApiEntity, "p0");
            return ((C25766b) this.receiver).mo64358a(amexOfferInfoApiEntity);
        }
    }

    /* renamed from: lt.n$d */
    static final class C26086d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26082n f66200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26086d(C26082n nVar) {
            super(1);
            this.f66200d = nVar;
        }

        /* renamed from: a */
        public final C27637o invoke(CardsAndDetailsApiEntity cardsAndDetailsApiEntity) {
            C41536l.m120489i(cardsAndDetailsApiEntity, "it");
            return this.f66200d.f66191e.mo64363e(cardsAndDetailsApiEntity);
        }
    }

    /* renamed from: lt.n$e */
    static final class C26087e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26082n f66201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26087e(C26082n nVar) {
            super(1);
            this.f66201d = nVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f66201d.f66197k.set(true);
        }
    }

    public C26082n(IRetrofitService iRetrofitService, C25768d dVar, C25767c cVar, C25766b bVar, RetrofitClient retrofitClient, RootBankApiManager rootBankApiManager, C25681e eVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(dVar, "cardsMapper");
        C41536l.m120489i(cVar, "cardExtraDetailsDataMapper");
        C41536l.m120489i(bVar, "amexOfferDataMapper");
        C41536l.m120489i(retrofitClient, "retrofitClient");
        C41536l.m120489i(rootBankApiManager, "bankApiManager");
        C41536l.m120489i(eVar, "refreshCards");
        this.f66190d = iRetrofitService;
        this.f66191e = dVar;
        this.f66192f = cVar;
        this.f66193g = bVar;
        this.f66194h = retrofitClient;
        this.f66195i = rootBankApiManager;
        this.f66196j = eVar;
        C40765a i1 = C40765a.m118199i1(m81765m4());
        C41536l.m120488h(i1, "createDefault(getCardsObservable())");
        this.f66198l = i1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final void m81761i4(C26082n nVar) {
        C41536l.m120489i(nVar, "this$0");
        nVar.mo64996r4();
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m81762j4(C26082n nVar) {
        C41536l.m120489i(nVar, "this$0");
        nVar.mo64996r4();
        nVar.f66195i.getAccountsLov(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final CardBlockStatus m81763k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (CardBlockStatus) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final C27634l m81764l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27634l) lVar.invoke(obj);
    }

    /* renamed from: m4 */
    private final C40749p m81765m4() {
        C40762x<BankApiResponse<CardsAndDetailsApiEntity>> cardsAndDetails = this.f66190d.getCardsAndDetails("CARDS_GET_CARDS_AND_DETAILS");
        C41536l.m120488h(cardsAndDetails, "service.getCardsAndDetai…DS_GET_CARDS_AND_DETAILS)");
        C40749p g = C19273c.m64722h(cardsAndDetails).mo95062A(new C26075g(new C26086d(this))).mo95082k(new C26076h(new C26087e(this))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getCardsObse…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final C27637o m81766n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C27637o) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public static final void m81767p4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final void m81768q4(C26082n nVar) {
        C41536l.m120489i(nVar, "this$0");
        nVar.mo64996r4();
    }

    /* renamed from: W2 */
    public C40734b mo64991W2(long j, String str) {
        C40762x<BankApiResponse<Object>> changeCardName = this.f66190d.changeCardName("CARDS_SET_CARD_NAME", j, str);
        C41536l.m120488h(changeCardName, "service.changeCardName(\n…           name\n        )");
        C40734b o = C19273c.m64720f(changeCardName).mo94902o(new C26077i(this));
        C41536l.m120488h(o, "service.changeCardName(\n…dateCards()\n            }");
        return o;
    }

    /* renamed from: Z1 */
    public C40734b mo64992Z1(String str, String str2, C24978b bVar) {
        String str3;
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(str2, "productKey");
        C41536l.m120489i(bVar, "isDefault");
        IRetrofitService iRetrofitService = this.f66190d;
        if (bVar == C24978b.YES) {
            str3 = "Y";
        } else {
            str3 = "N";
        }
        C40762x<BankApiResponse<Object>> changeProductDefaultState = iRetrofitService.changeProductDefaultState("COMMON_CHANGE_CLIENT_PRODUCT_DEFAULT", str, str2, str3);
        C41536l.m120488h(changeProductDefaultState, "service.changeProductDef…\"\n            }\n        )");
        C40734b o = C19273c.m64720f(changeProductDefaultState).mo94902o(new C26080l(this));
        C41536l.m120488h(o, "service.changeProductDef…sLov(false)\n            }");
        return o;
    }

    public void clean() {
        this.f66197k = new AtomicBoolean(false);
        this.f66198l.onComplete();
        C40765a i1 = C40765a.m118199i1(m81765m4());
        C41536l.m120488h(i1, "createDefault(getCardsObservable())");
        this.f66198l = i1;
    }

    public C40762x getCardBlockStatus(long j) {
        C40762x<BankApiResponse<CardBlockStatusApiEntity>> cardBlockStatus = this.f66190d.getCardBlockStatus("CARDS_IS_CARD_BLOCKED", j);
        C41536l.m120488h(cardBlockStatus, "service.getCardBlockStat…_IS_CARD_BLOCKED, cardId)");
        C40762x A = C19273c.m64722h(cardBlockStatus).mo95062A(new C26079k(new C26084b(this)));
        C41536l.m120488h(A, "override fun getCardBloc…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: l0 */
    public C40762x mo64994l0() {
        C40762x<BankApiResponse<AmexOfferInfoApiEntity>> cardCampaignOfferInfo = this.f66190d.getCardCampaignOfferInfo("CARDS_GET_OFFER_POPUP");
        C41536l.m120488h(cardCampaignOfferInfo, "service.getCardCampaignO…ARDS_CAMPAIGN_OFFER_INFO)");
        C40762x A = C19273c.m64722h(cardCampaignOfferInfo).mo95062A(new C26078j(new C26085c(this.f66193g)));
        C41536l.m120488h(A, "service.getCardCampaignO…ferDataMapper::transform)");
        return A;
    }

    /* renamed from: l1 */
    public C40734b mo64995l1(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x<BankApiResponse<HashMap<String, String>>> useOtpForActionSingle = this.f66190d.useOtpForActionSingle(hashMap);
        C41536l.m120488h(useOtpForActionSingle, "service.useOtpForActionS…         params\n        )");
        C40734b o = C19273c.m64720f(useOtpForActionSingle).mo94902o(new C26081m(this));
        C41536l.m120488h(o, "service.useOtpForActionS…dateCards()\n            }");
        return o;
    }

    /* renamed from: r4 */
    public void mo64996r4() {
        this.f66198l.onNext(m81765m4());
        this.f66196j.invoke();
    }
}
