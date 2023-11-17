package p341ge.bog.mobilebank.giftcards.presentation.details;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import hj0.C25034b;
import ij0.C25218a;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li0.C26030c;
import li0.C26032d;
import li0.C26033e;
import li0.C26034f;
import li0.C26035g;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow;
import p341ge.bog.mobilebank.giftcards.presentation.chooseanimation.model.GiftCardsMerchantAnimationsModel;
import p341ge.bog.mobilebank.giftcards.presentation.details.C24186a;
import p341ge.bog.mobilebank.model.Client;
import pi0.C27534a;
import ue1.C43075l;
import wh0.C29396d;
import wh0.C29397e;
import xh0.C29789f;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c */
public final class C24193c extends C21481a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C26030c f62632d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final GiftCardsFlow.GiftCardDetails f62633e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C29397e f62634f;

    /* renamed from: g */
    private final C29396d f62635g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C25034b f62636h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Client f62637i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List f62638j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C29789f f62639k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C1644x f62640l;

    /* renamed from: m */
    private final LiveData f62641m;

    /* renamed from: n */
    private final C1644x f62642n = new C1644x();

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$a */
    static final class C24194a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24193c f62643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24194a(C24193c cVar) {
            super(1);
            this.f62643d = cVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C29397e mw = this.f62643d.f62634f;
            String clientKey = this.f62643d.f62637i.getUserInfo().getClient().getClientKey();
            C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
            return C31270e.m92879h(C29397e.m89485b(mw, clientKey, false, 2, (Object) null), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$b */
    static final class C24195b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24193c f62644d;

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$b$a */
        static final class C24196a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24193c f62645d;

            /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$b$a$a */
            /* synthetic */ class C24197a extends C41535k implements C43075l {
                C24197a(Object obj) {
                    super(1, obj, C24193c.class, "createInitialState", "createInitialState(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
                }

                /* renamed from: b */
                public final void mo61839b(C31128a aVar) {
                    C41536l.m120489i(aVar, "p0");
                    ((C24193c) this.receiver).m77948tw(aVar);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo61839b((C31128a) obj);
                    return C41238w.f97225a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24196a(C24193c cVar) {
                super(1);
                this.f62645d = cVar;
            }

            /* renamed from: a */
            public final void mo61838a(List list) {
                C41536l.m120489i(list, "cards");
                this.f62645d.f62638j = list;
                C24193c cVar = this.f62645d;
                cVar.m77949vw(cVar.f62633e.mo61621b(), new C24197a(this.f62645d));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61838a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$b$b */
        static final class C24198b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24193c f62646d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24198b(C24193c cVar) {
                super(1);
                this.f62646d = cVar;
            }

            /* renamed from: a */
            public final void mo61840a(List list) {
                C1644x qw = this.f62646d.f62640l;
                C26035g gVar = r2;
                C26035g gVar2 = new C26035g(C27534a.C27542g.f70442a, (C27534a.C27549n) null, (C25218a) null, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, (C27534a.C27536b) null, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 16382, (DefaultConstructorMarker) null);
                qw.mo4826r(gVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo61840a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$b$c */
        static final class C24199c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24193c f62647d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24199c(C24193c cVar) {
                super(1);
                this.f62647d = cVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1644x qw = this.f62647d.f62640l;
                C26035g gVar = r2;
                C26035g gVar2 = new C26035g((C27534a.C27542g) null, (C27534a.C27549n) null, C25218a.f64784a, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, (C27534a.C27536b) null, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 16379, (DefaultConstructorMarker) null);
                qw.mo4826r(gVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24195b(C24193c cVar) {
            super(1);
            this.f62644d = cVar;
        }

        /* renamed from: a */
        public final void mo61837a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C24196a(this.f62644d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C24198b(this.f62644d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C24199c(this.f62644d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61837a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$c */
    public interface C24200c {
        /* renamed from: a */
        C24193c mo32825a(GiftCardsFlow.GiftCardDetails giftCardDetails);
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$d */
    static final class C24201d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C43075l f62648d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24201d(C43075l lVar) {
            super(1);
            this.f62648d = lVar;
        }

        /* renamed from: a */
        public final void mo61842a(C31128a aVar) {
            C43075l lVar = this.f62648d;
            C41536l.m120488h(aVar, "result");
            lVar.invoke(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61842a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$e */
    static final class C24202e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C31128a f62649d;

        /* renamed from: e */
        final /* synthetic */ C24193c f62650e;

        /* renamed from: f */
        final /* synthetic */ C29789f f62651f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24202e(C31128a aVar, C24193c cVar, C29789f fVar) {
            super(1);
            this.f62649d = aVar;
            this.f62650e = cVar;
            this.f62651f = fVar;
        }

        /* renamed from: a */
        public final C26035g invoke(C26035g gVar) {
            C27534a.C27549n nVar;
            C27534a.C27547l lVar;
            C25218a aVar;
            List list;
            C27534a.C27538d dVar;
            C31128a aVar2 = this.f62649d;
            C27534a.C27535a aVar3 = null;
            if (aVar2 instanceof C31128a.C31130b) {
                nVar = C27534a.C27549n.f70455a;
            } else {
                nVar = null;
            }
            if (!(aVar2 instanceof C31128a.C31131c) || !(!((Collection) ((C31128a.C31131c) aVar2).mo71340a()).isEmpty())) {
                lVar = null;
            } else {
                lVar = this.f62650e.f62632d.mo64909e(this.f62651f);
            }
            C31128a aVar4 = this.f62649d;
            if (aVar4 instanceof C31128a.C31129a) {
                aVar = C25218a.f64784a;
            } else {
                aVar = null;
            }
            if (aVar4 instanceof C31128a.C31131c) {
                list = this.f62650e.f62632d.mo64910f((List) ((C31128a.C31131c) this.f62649d).mo71340a());
            } else {
                list = C41341q.m119907j();
            }
            List list2 = list;
            C31128a aVar5 = this.f62649d;
            if (!(aVar5 instanceof C31128a.C31131c) || !((List) ((C31128a.C31131c) aVar5).mo71340a()).isEmpty()) {
                dVar = null;
            } else {
                dVar = new C27534a.C27538d(this.f62650e.f62636h.mo63467a("giftcard.payment.list.transaction.not.found"));
            }
            C31128a aVar6 = this.f62649d;
            if ((aVar6 instanceof C31128a.C31131c) && (!((Collection) ((C31128a.C31131c) aVar6).mo71340a()).isEmpty())) {
                aVar3 = C27534a.C27535a.f70424a;
            }
            C41536l.m120488h(gVar, "state");
            return C26035g.m81666d(gVar, (C27534a.C27542g) null, nVar, aVar, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, (C27534a.C27536b) null, lVar, list2, aVar3, dVar, (C27534a.C27545j) null, 8697, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$f */
    static final class C24203f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24193c f62652d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24203f(C24193c cVar) {
            super(1);
            this.f62652d = cVar;
        }

        /* renamed from: a */
        public final C26035g invoke(C26035g gVar) {
            C26030c ow = this.f62652d.f62632d;
            C29789f kw = this.f62652d.f62639k;
            C29789f fVar = null;
            if (kw == null) {
                C41536l.m120506z("clientGiftCard");
                kw = null;
            }
            C27534a.C27536b c = ow.mo64907c(kw);
            C26030c ow2 = this.f62652d.f62632d;
            C29789f kw2 = this.f62652d.f62639k;
            if (kw2 == null) {
                C41536l.m120506z("clientGiftCard");
                kw2 = null;
            }
            C27534a.C27541f b = ow2.mo64906b(kw2);
            C26030c ow3 = this.f62652d.f62632d;
            C29789f kw3 = this.f62652d.f62639k;
            if (kw3 == null) {
                C41536l.m120506z("clientGiftCard");
            } else {
                fVar = kw3;
            }
            C27534a.C27546k d = ow3.mo64908d(fVar);
            C41536l.m120488h(gVar, "state");
            return C26035g.m81666d(gVar, (C27534a.C27542g) null, (C27534a.C27549n) null, (C25218a) null, (C27534a.C27539e) null, (C27534a.C27543h) null, b, (C27534a.C27544i) null, d, c, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 15967, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$g */
    static final class C24204g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24193c f62653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24204g(C24193c cVar) {
            super(1);
            this.f62653d = cVar;
        }

        /* renamed from: a */
        public final void mo61845a(C31128a aVar) {
            C41536l.m120489i(aVar, "result");
            C24193c cVar = this.f62653d;
            C29789f kw = cVar.f62639k;
            if (kw == null) {
                C41536l.m120506z("clientGiftCard");
                kw = null;
            }
            cVar.m77951zw(aVar, kw);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61845a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$h */
    static final class C24205h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24205h f62654d = new C24205h();

        C24205h() {
            super(1);
        }

        /* renamed from: a */
        public final C26035g invoke(C26035g gVar) {
            C27534a.C27536b bVar;
            C41536l.m120488h(gVar, "state");
            C27534a.C27536b e = gVar.mo64915e();
            if (e != null) {
                bVar = C27534a.C27536b.m85351b(e, 0, (String) null, (String) null, (String) null, (List) null, true, 31, (Object) null);
            } else {
                bVar = null;
            }
            return C26035g.m81666d(gVar, (C27534a.C27542g) null, (C27534a.C27549n) null, (C25218a) null, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, bVar, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 16127, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$i */
    static final class C24206i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24206i f62655d = new C24206i();

        C24206i() {
            super(1);
        }

        /* renamed from: a */
        public final C26035g invoke(C26035g gVar) {
            C27534a.C27536b bVar;
            C41536l.m120488h(gVar, "state");
            C27534a.C27536b e = gVar.mo64915e();
            if (e != null) {
                bVar = C27534a.C27536b.m85351b(e, 0, (String) null, (String) null, (String) null, (List) null, false, 31, (Object) null);
            } else {
                bVar = null;
            }
            return C26035g.m81666d(gVar, (C27534a.C27542g) null, (C27534a.C27549n) null, (C25218a) null, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, bVar, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 16127, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$j */
    static final class C24207j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24207j f62656d = new C24207j();

        C24207j() {
            super(1);
        }

        /* renamed from: a */
        public final C26035g invoke(C26035g gVar) {
            C41536l.m120488h(gVar, "it");
            return C26035g.m81666d(gVar, (C27534a.C27542g) null, (C27534a.C27549n) null, (C25218a) null, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, (C27534a.C27536b) null, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 16319, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.giftcards.presentation.details.c$k */
    static final class C24208k extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24208k f62657d = new C24208k();

        C24208k() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C26035g gVar) {
            return gVar.mo64913b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24193c(C26030c cVar, GiftCardsFlow.GiftCardDetails giftCardDetails, C29397e eVar, C29396d dVar, C25034b bVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C26030c cVar2 = cVar;
        GiftCardsFlow.GiftCardDetails giftCardDetails2 = giftCardDetails;
        C29397e eVar2 = eVar;
        C29396d dVar2 = dVar;
        C25034b bVar2 = bVar;
        Client client2 = client;
        C41536l.m120489i(cVar2, "stateMapper");
        C41536l.m120489i(giftCardDetails2, "detailsModel");
        C41536l.m120489i(eVar2, "getClientGiftCards");
        C41536l.m120489i(dVar2, "clientGiftCardTransactions");
        C41536l.m120489i(bVar2, "provideDictValue");
        C41536l.m120489i(client2, "client");
        this.f62632d = cVar2;
        this.f62633e = giftCardDetails2;
        this.f62634f = eVar2;
        this.f62635g = dVar2;
        this.f62636h = bVar2;
        this.f62637i = client2;
        C26035g gVar = r2;
        C26035g gVar2 = new C26035g(C27534a.C27542g.f70442a, (C27534a.C27549n) null, (C25218a) null, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, (C27534a.C27536b) null, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 16382, (DefaultConstructorMarker) null);
        C1644x xVar = new C1644x(gVar);
        this.f62640l = xVar;
        this.f62641m = C1607m0.m5655c(xVar, C24208k.f62657d);
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C26033e(new C24194a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C26034f(new C24195b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…          }\n            }");
        bindToLifecycle(F0);
    }

    /* renamed from: Jw */
    private final void m77931Jw(C24186a aVar) {
        C37224b.m109966e(this.f62642n, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m77935gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final void m77936hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [he1.w] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: tw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m77948tw(b41.C31128a r22) {
        /*
            r21 = this;
            r0 = r21
            java.util.List r1 = r0.f62638j
            java.lang.String r2 = "clientGiftCards"
            r3 = 0
            if (r1 != 0) goto L_0x000d
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x000d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r1.next()
            r5 = r4
            xh0.f r5 = (xh0.C29789f) r5
            long r5 = r5.mo69970e()
            ge.bog.mobilebank.giftcards.presentation.activity.GiftCardsFlow$GiftCardDetails r7 = r0.f62633e
            long r7 = r7.mo61621b()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x002e
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 == 0) goto L_0x0011
            goto L_0x0033
        L_0x0032:
            r4 = r3
        L_0x0033:
            xh0.f r4 = (xh0.C29789f) r4
            java.util.List r1 = r0.f62638j
            if (r1 != 0) goto L_0x003d
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r1 = r3
        L_0x003d:
            int r1 = ie1.C41358y.m120012b0(r1, r4)
            if (r4 == 0) goto L_0x005d
            androidx.lifecycle.x r5 = r0.f62640l
            li0.c r6 = r0.f62632d
            java.util.List r7 = r0.f62638j
            if (r7 != 0) goto L_0x0051
            kotlin.jvm.internal.C41536l.m120506z(r2)
            r2 = r22
            goto L_0x0054
        L_0x0051:
            r2 = r22
            r3 = r7
        L_0x0054:
            li0.g r2 = r6.mo64911k(r3, r1, r4, r2)
            r5.mo4826r(r2)
            he1.w r3 = he1.C41238w.f97225a
        L_0x005d:
            if (r3 != 0) goto L_0x0083
            androidx.lifecycle.x r2 = r0.f62640l
            li0.g r15 = new li0.g
            r3 = r15
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r20 = r15
            r15 = r16
            pi0.a$j r17 = pi0.C27534a.C27545j.f70446a
            r18 = 8191(0x1fff, float:1.1478E-41)
            r19 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3 = r20
            r2.mo4826r(r3)
        L_0x0083:
            r0.mo61826Cw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.presentation.details.C24193c.m77948tw(b41.a):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public final void m77949vw(long j, C43075l lVar) {
        C29396d dVar = this.f62635g;
        String clientKey = this.f62637i.getUserInfo().getClient().getClientKey();
        C41536l.m120488h(clientKey, "client.userInfo.client.clientKey");
        C41205b F0 = C32343x.m95413R0(C31270e.m92880i(dVar.mo69237a(clientKey, j), -1)).mo94981F0(new C26032d(new C24201d(lVar)));
        C41536l.m120488h(F0, "handleResult: HandleResu…eResult(result)\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m77950ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final void m77951zw(C31128a aVar, C29789f fVar) {
        C37224b.m109967f(this.f62640l, new C24202e(aVar, this, fVar));
    }

    /* renamed from: Aw */
    public void mo61824Aw(String str) {
        C41536l.m120489i(str, "giftCardCode");
        m77931Jw(new C24186a.C24187a(str, this.f62636h));
    }

    /* renamed from: Bw */
    public void mo61825Bw() {
    }

    /* renamed from: Cw */
    public void mo61826Cw(int i) {
        C27534a.C27539e eVar;
        List list = this.f62638j;
        C29789f fVar = null;
        if (list == null) {
            C41536l.m120506z("clientGiftCards");
            list = null;
        }
        this.f62639k = (C29789f) list.get(i);
        C26035g gVar = (C26035g) this.f62640l.mo4814f();
        if (gVar != null) {
            eVar = gVar.mo64917f();
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.mo66881c(i);
        }
        C37224b.m109967f(this.f62640l, new C24203f(this));
        C29789f fVar2 = this.f62639k;
        if (fVar2 == null) {
            C41536l.m120506z("clientGiftCard");
        } else {
            fVar = fVar2;
        }
        m77949vw(fVar.mo69970e(), new C24204g(this));
    }

    /* renamed from: Dw */
    public void mo61827Dw() {
        C37224b.m109967f(this.f62640l, C24205h.f62654d);
    }

    /* renamed from: Ew */
    public void mo61828Ew() {
        m77931Jw(new C24186a.C24191e(this.f62636h));
    }

    /* renamed from: Fw */
    public void mo61829Fw(List list) {
        C41536l.m120489i(list, "storesList");
        m77931Jw(new C24186a.C24189c(list));
        C37224b.m109967f(this.f62640l, C24206i.f62655d);
    }

    /* renamed from: Gw */
    public void mo61830Gw() {
        C29789f fVar = this.f62639k;
        if (fVar == null) {
            C41536l.m120506z("clientGiftCard");
            fVar = null;
        }
        m77931Jw(new C24186a.C24190d(fVar.mo69970e()));
    }

    /* renamed from: Hw */
    public void mo61831Hw() {
        C41238w wVar;
        C26035g gVar = (C26035g) this.f62640l.mo4814f();
        if (gVar != null) {
            C27534a.C27539e f = gVar.mo64917f();
            if (f != null) {
                mo61826Cw(f.mo66880b());
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                onRefresh(6);
            }
        }
    }

    /* renamed from: Iw */
    public void mo61832Iw() {
        C37224b.m109967f(this.f62640l, C24207j.f62656d);
    }

    /* renamed from: uw */
    public LiveData mo61833uw() {
        return this.f62642n;
    }

    /* renamed from: xw */
    public LiveData mo61834xw() {
        return this.f62641m;
    }

    /* renamed from: yw */
    public void mo61835yw() {
        C29789f fVar = this.f62639k;
        if (fVar == null) {
            C41536l.m120506z("clientGiftCard");
            fVar = null;
        }
        m77931Jw(new C24186a.C24188b(new GiftCardsMerchantAnimationsModel(Long.valueOf(fVar.mo69970e()), fVar.mo69966a(), fVar.mo69968c(), -1, fVar.mo69979l(), fVar.mo69978k(), fVar.mo69977j())));
    }
}
