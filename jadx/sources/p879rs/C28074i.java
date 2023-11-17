package p879rs;

import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.CreditOfferLimitEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.LoanOfferLimitEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.OfferInfoApiEntity;
import p341ge.bog.mobilebank.cleanarch.data.offer.entity.OfferProductApiEntity;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.C21034a;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferInfo;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p852ov.C27086a;
import p852ov.C27087b;
import p862pv.C27622a;
import p869qs.C27861a;
import ue1.C43075l;

/* renamed from: rs.i */
public final class C28074i implements C27622a {

    /* renamed from: h */
    public static final C28075a f71421h = new C28075a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f71422d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C27861a f71423e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AtomicBoolean f71424f = new AtomicBoolean(false);

    /* renamed from: g */
    private C40765a f71425g;

    /* renamed from: rs.i$a */
    public static final class C28075a {
        private C28075a() {
        }

        public /* synthetic */ C28075a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: rs.i$b */
    static final class C28076b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28074i f71426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28076b(C28074i iVar) {
            super(1);
            this.f71426d = iVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f71426d.f71423e.mo67386f(list);
        }
    }

    /* renamed from: rs.i$c */
    static final class C28077c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28077c f71427d = new C28077c();

        C28077c() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "offerLimit");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                C27086a aVar = (C27086a) next;
                if (C21034a.m68055a(aVar.mo66341c()).contains(aVar.mo66342d().mo68796b())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: rs.i$d */
    static final class C28078d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28074i f71428d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28078d(C28074i iVar) {
            super(1);
            this.f71428d = iVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f71428d.f71423e.mo67387g(list);
        }
    }

    /* renamed from: rs.i$e */
    static final class C28079e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28079e f71429d = new C28079e();

        C28079e() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "loanLimit");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                C27087b bVar = (C27087b) next;
                if (C21034a.m68056b(bVar.mo66350c()).contains(bVar.mo66354f()) || bVar.mo66350c() == OfferProductCode.C21021PL.f56478f) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: rs.i$f */
    static final class C28080f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28074i f71430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28080f(C28074i iVar) {
            super(1);
            this.f71430d = iVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C28074i iVar = this.f71430d;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OfferProductApiEntity offerProductApiEntity = (OfferProductApiEntity) it.next();
                C27861a h4 = iVar.f71423e;
                C41536l.m120488h(offerProductApiEntity, "elem");
                arrayList.add(h4.mo67385e(offerProductApiEntity));
            }
            return arrayList;
        }
    }

    /* renamed from: rs.i$g */
    static final class C28081g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C28081g f71431d = new C28081g();

        C28081g() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    /* renamed from: rs.i$h */
    static final class C28082h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28074i f71432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28082h(C28074i iVar) {
            super(1);
            this.f71432d = iVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "offers");
            C27861a h4 = this.f71432d.f71423e;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OfferInfo b = h4.mo67382b((OfferInfoApiEntity) it.next());
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: rs.i$i */
    static final class C28083i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28074i f71433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28083i(C28074i iVar) {
            super(1);
            this.f71433d = iVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f71433d.f71424f.set(true);
        }
    }

    public C28074i(IRetrofitService iRetrofitService, C27861a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "offersDataMapper");
        this.f71422d = iRetrofitService;
        this.f71423e = aVar;
        C40765a i1 = C40765a.m118199i1(m86509q4());
        C41536l.m120488h(i1, "createDefault(getOffersInfoObservable())");
        this.f71425g = i1;
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final List m86503j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final List m86504k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final List m86505l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final List m86506m4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final List m86507n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public static final C40754t m86508p4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: q4 */
    private final C40749p m86509q4() {
        C40762x<BankApiResponse<List<OfferInfoApiEntity>>> offers = this.f71422d.getOffers(UserRestrictions.OFFERS_GET_OFFER_LIMIT_INFO);
        C41536l.m120488h(offers, "service.getOffers(OFFERS_GET_OFFERS_INFO)");
        C40749p g = C19273c.m64722h(offers).mo95062A(new C28072g(new C28082h(this))).mo95082k(new C28073h(new C28083i(this))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getOffersInf…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final List m86510r4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final void m86511s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: E1 */
    public C40762x mo66996E1(String str) {
        C41536l.m120489i(str, "offerNo");
        C40762x<BankApiResponse<List<CreditOfferLimitEntity>>> offerCardList = this.f71422d.getOfferCardList("OFFERS_GET_LIMIT_CARD_LIST", str);
        C41536l.m120488h(offerCardList, "service.getOfferCardList…LIMIT_CARD_LIST, offerNo)");
        C40762x A = C19273c.m64722h(offerCardList).mo95062A(new C28067b(new C28076b(this))).mo95062A(new C28068c(C28077c.f71427d));
        C41536l.m120488h(A, "override fun getCreditOf…    }\n            }\n    }");
        return A;
    }

    /* renamed from: M0 */
    public C40749p mo66997M0(boolean z) {
        if (this.f71424f.compareAndSet(true, false) || z) {
            mo66998S1();
        }
        C40749p L0 = this.f71425g.mo94989L0(new C28066a(C28081g.f71431d));
        C41536l.m120488h(L0, "offerInfoSubject.switchMap { it }");
        return L0;
    }

    /* renamed from: S1 */
    public void mo66998S1() {
        this.f71425g.onNext(m86509q4());
    }

    /* renamed from: V1 */
    public C40762x mo66999V1() {
        C40762x<BankApiResponse<List<OfferProductApiEntity>>> offerProducts = this.f71422d.getOfferProducts("OFFERS_GET_BY_CATEGORY");
        C41536l.m120488h(offerProducts, "service.getOfferProducts(OFFERS_GET_BY_CATEGORY)");
        C40762x A = C19273c.m64722h(offerProducts).mo95062A(new C28069d(new C28080f(this)));
        C41536l.m120488h(A, "override fun getOfferPro…em) }\n            }\n    }");
        return A;
    }

    public void clean() {
        this.f71424f = new AtomicBoolean(false);
        this.f71425g.onComplete();
        C40765a i1 = C40765a.m118199i1(m86509q4());
        C41536l.m120488h(i1, "createDefault(getOffersInfoObservable())");
        this.f71425g = i1;
    }

    /* renamed from: o1 */
    public C40762x mo67000o1(String str) {
        C41536l.m120489i(str, "offerNo");
        C40762x<BankApiResponse<List<LoanOfferLimitEntity>>> limitLoanList = this.f71422d.getLimitLoanList("OFFERS_GET_LIMIT_LOAN_LIST", str);
        C41536l.m120488h(limitLoanList, "service.getLimitLoanList…LIMIT_LOAN_LIST, offerNo)");
        C40762x A = C19273c.m64722h(limitLoanList).mo95062A(new C28070e(new C28078d(this))).mo95062A(new C28071f(C28079e.f71429d));
        C41536l.m120488h(A, "override fun getLoanOffe…    }\n            }\n    }");
        return A;
    }
}
