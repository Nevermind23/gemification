package wv0;

import bw0.C31208a;
import bw0.C31210c;
import bw0.C31211d;
import bw0.C31212e;
import bw0.C31213f;
import cw0.C31452b;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import g91.C32343x;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p2p.data.model.AmountLimitApiModel;
import p341ge.bog.mobilebank.p2p.data.model.CardsApiModel;
import p341ge.bog.mobilebank.p2p.data.model.CommissionApiModel;
import p341ge.bog.mobilebank.p2p.data.model.CreateInComeTopUpPaymentApiModel;
import p341ge.bog.mobilebank.p2p.data.model.MoneyTransferResponseApiModel;
import p341ge.bog.mobilebank.p2p.domain.customexceptions.CardsException;
import p341ge.bog.mobilebank.p2p.domain.customexceptions.PhoneNumberException;
import p341ge.bog.mobilebank.p2p.domain.model.MoneyTransferResponse;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import ue1.C43075l;
import vv0.C39475a;
import vv0.C39476b;
import vv0.C39477c;
import vv0.C39478d;
import vv0.C39479e;
import xv0.C39916a;

/* renamed from: wv0.m */
public final class C39691m implements C31452b {

    /* renamed from: h */
    public static final C39692a f94317h = new C39692a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C39916a f94318a;

    /* renamed from: b */
    private final C39477c f94319b;

    /* renamed from: c */
    private final C39479e f94320c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39476b f94321d;

    /* renamed from: e */
    private final C39475a f94322e;

    /* renamed from: f */
    private final C39478d f94323f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C40765a f94324g;

    /* renamed from: wv0.m$a */
    public static final class C39692a {
        private C39692a() {
        }

        public /* synthetic */ C39692a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wv0.m$b */
    static final class C39693b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39693b f94325d = new C39693b();

        C39693b() {
            super(1);
        }

        /* renamed from: a */
        public final C40739f invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            if (!(th instanceof ApiError)) {
                return C40734b.m117923s(th);
            }
            String a0 = C32343x.m95431a0(th, (String) null, 1, (Object) null);
            if (a0 == null) {
                a0 = "Invalid error";
            }
            return C40734b.m117923s(new PhoneNumberException(a0));
        }
    }

    /* renamed from: wv0.m$c */
    /* synthetic */ class C39694c extends C41535k implements C43075l {
        C39694c(Object obj) {
            super(1, obj, C39478d.class, "convert", "convert(Lge/bog/mobilebank/p2p/data/model/CreateInComeTopUpPaymentApiModel;)Lge/bog/mobilebank/p2p/domain/model/CreateInComeTopUpPayment;", 0);
        }

        /* renamed from: b */
        public final C31211d invoke(CreateInComeTopUpPaymentApiModel createInComeTopUpPaymentApiModel) {
            C41536l.m120489i(createInComeTopUpPaymentApiModel, "p0");
            return ((C39478d) this.receiver).mo93108a(createInComeTopUpPaymentApiModel);
        }
    }

    /* renamed from: wv0.m$d */
    static final class C39695d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39695d f94326d = new C39695d();

        C39695d() {
            super(1);
        }

        /* renamed from: a */
        public final C40739f invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            if (!(th instanceof ApiError)) {
                return C40734b.m117923s(th);
            }
            String a0 = C32343x.m95431a0(th, (String) null, 1, (Object) null);
            if (a0 == null) {
                a0 = "Invalid error";
            }
            return C40734b.m117923s(new CardsException(a0));
        }
    }

    /* renamed from: wv0.m$e */
    static final class C39696e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39691m f94327d;

        /* renamed from: e */
        final /* synthetic */ C31213f f94328e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39696e(C39691m mVar, C31213f fVar) {
            super(1);
            this.f94327d = mVar;
            this.f94328e = fVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "cards");
            C39476b t = this.f94327d.f94321d;
            if (this.f94328e == C31213f.TOP_UP) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object next : list) {
                    if (hashSet.add(((CardsApiModel) next).getAcctNo())) {
                        arrayList.add(next);
                    }
                }
                list = arrayList;
            }
            return t.mo93106b(list, this.f94328e == C31213f.TOP_UP);
        }
    }

    /* renamed from: wv0.m$f */
    static final class C39697f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39691m f94329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39697f(C39691m mVar) {
            super(1);
            this.f94329d = mVar;
        }

        /* renamed from: a */
        public final void mo93425a(List list) {
            this.f94329d.f94324g.onNext(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93425a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wv0.m$g */
    static final class C39698g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39691m f94330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39698g(C39691m mVar) {
            super(1);
            this.f94330d = mVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f94330d.f94324g.onNext(C41341q.m119907j());
        }
    }

    /* renamed from: wv0.m$h */
    /* synthetic */ class C39699h extends C41535k implements C43075l {
        C39699h(Object obj) {
            super(1, obj, C39477c.class, "convert", "convert(Lge/bog/mobilebank/p2p/data/model/CommissionApiModel;)Lge/bog/mobilebank/p2p/domain/model/Commission;", 0);
        }

        /* renamed from: b */
        public final C31210c invoke(CommissionApiModel commissionApiModel) {
            C41536l.m120489i(commissionApiModel, "p0");
            return ((C39477c) this.receiver).mo93107a(commissionApiModel);
        }
    }

    /* renamed from: wv0.m$i */
    static final class C39700i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39700i f94331d = new C39700i();

        C39700i() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(List list) {
            C41536l.m120489i(list, "it");
            return Boolean.valueOf(!list.isEmpty());
        }
    }

    /* renamed from: wv0.m$j */
    /* synthetic */ class C39701j extends C41535k implements C43075l {
        C39701j(Object obj) {
            super(1, obj, C39475a.class, "convert", "convert(Lge/bog/mobilebank/p2p/data/model/AmountLimitApiModel;)Lge/bog/mobilebank/p2p/domain/model/AmountLimit;", 0);
        }

        /* renamed from: b */
        public final C31208a invoke(AmountLimitApiModel amountLimitApiModel) {
            C41536l.m120489i(amountLimitApiModel, "p0");
            return ((C39475a) this.receiver).mo93105a(amountLimitApiModel);
        }
    }

    /* renamed from: wv0.m$k */
    /* synthetic */ class C39702k extends C41535k implements C43075l {
        C39702k(Object obj) {
            super(1, obj, C39479e.class, "convert", "convert(Lge/bog/mobilebank/p2p/data/model/MoneyTransferResponseApiModel;)Lge/bog/mobilebank/p2p/domain/model/MoneyTransferResponse;", 0);
        }

        /* renamed from: b */
        public final MoneyTransferResponse invoke(MoneyTransferResponseApiModel moneyTransferResponseApiModel) {
            C41536l.m120489i(moneyTransferResponseApiModel, "p0");
            return ((C39479e) this.receiver).mo93109a(moneyTransferResponseApiModel);
        }
    }

    /* renamed from: wv0.m$l */
    static final class C39703l extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39703l f94332d = new C39703l();

        C39703l() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
            if (r0.equals("-326") != false) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
            if (r0.equals("-325") == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
            if (r0.equals("-324") == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            if (r0.equals("-323") == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
            if (r0.equals("-321") == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
            r6 = g91.C32343x.m95431a0(r6, (java.lang.String) null, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
            if (r6 != null) goto L_0x0078;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
            r2 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
            if (r0.equals("312") == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
            if (r0.equals("311") == false) goto L_0x00c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ae, code lost:
            r6 = g91.C32343x.m95431a0(r6, (java.lang.String) null, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
            if (r6 != null) goto L_0x00b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
            r2 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return ed1.C40762x.m118158o(new p341ge.bog.mobilebank.p2p.domain.customexceptions.CardsException(r2));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            return ed1.C40762x.m118158o(new p341ge.bog.mobilebank.p2p.domain.customexceptions.DestinationException(r2));
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ed1.C40735b0 invoke(java.lang.Throwable r6) {
            /*
                r5 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120489i(r6, r0)
                boolean r0 = r6 instanceof p341ge.bog.mobilebank.shared2.network.ApiError
                if (r0 == 0) goto L_0x00c5
                r0 = r6
                ge.bog.mobilebank.shared2.network.ApiError r0 = (p341ge.bog.mobilebank.shared2.network.ApiError) r0
                ge.bog.mobilebank.shared2.network.BankApiResponse r0 = r0.mo84685a()
                java.lang.String r0 = r0.getError()
                if (r0 == 0) goto L_0x00c0
                int r1 = r0.hashCode()
                java.lang.String r2 = ""
                r3 = 1
                r4 = 0
                switch(r1) {
                    case 50579: goto L_0x00a5;
                    case 50580: goto L_0x009c;
                    case 50611: goto L_0x0081;
                    case 1391205: goto L_0x0066;
                    case 1391207: goto L_0x005d;
                    case 1391208: goto L_0x0053;
                    case 1391209: goto L_0x0049;
                    case 1391210: goto L_0x0040;
                    case 1391237: goto L_0x0023;
                    default: goto L_0x0021;
                }
            L_0x0021:
                goto L_0x00c0
            L_0x0023:
                java.lang.String r1 = "-332"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x002d
                goto L_0x00c0
            L_0x002d:
                ge.bog.mobilebank.p2p.domain.customexceptions.PhoneNumberException r0 = new ge.bog.mobilebank.p2p.domain.customexceptions.PhoneNumberException
                java.lang.String r6 = g91.C32343x.m95431a0(r6, r4, r3, r4)
                if (r6 != 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r2 = r6
            L_0x0037:
                r0.<init>(r2)
                ed1.x r6 = ed1.C40762x.m118158o(r0)
                goto L_0x00c9
            L_0x0040:
                java.lang.String r1 = "-326"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x00c0
                goto L_0x006f
            L_0x0049:
                java.lang.String r1 = "-325"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x006f
                goto L_0x00c0
            L_0x0053:
                java.lang.String r1 = "-324"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x006f
                goto L_0x00c0
            L_0x005d:
                java.lang.String r1 = "-323"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x006f
                goto L_0x00c0
            L_0x0066:
                java.lang.String r1 = "-321"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x006f
                goto L_0x00c0
            L_0x006f:
                ge.bog.mobilebank.p2p.domain.customexceptions.CardsException r0 = new ge.bog.mobilebank.p2p.domain.customexceptions.CardsException
                java.lang.String r6 = g91.C32343x.m95431a0(r6, r4, r3, r4)
                if (r6 != 0) goto L_0x0078
                goto L_0x0079
            L_0x0078:
                r2 = r6
            L_0x0079:
                r0.<init>(r2)
                ed1.x r6 = ed1.C40762x.m118158o(r0)
                goto L_0x00c9
            L_0x0081:
                java.lang.String r1 = "322"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x008a
                goto L_0x00c0
            L_0x008a:
                ge.bog.mobilebank.p2p.domain.customexceptions.AmountException r0 = new ge.bog.mobilebank.p2p.domain.customexceptions.AmountException
                java.lang.String r6 = g91.C32343x.m95431a0(r6, r4, r3, r4)
                if (r6 != 0) goto L_0x0093
                goto L_0x0094
            L_0x0093:
                r2 = r6
            L_0x0094:
                r0.<init>(r2)
                ed1.x r6 = ed1.C40762x.m118158o(r0)
                goto L_0x00c9
            L_0x009c:
                java.lang.String r1 = "312"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00ae
                goto L_0x00c0
            L_0x00a5:
                java.lang.String r1 = "311"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x00ae
                goto L_0x00c0
            L_0x00ae:
                ge.bog.mobilebank.p2p.domain.customexceptions.DestinationException r0 = new ge.bog.mobilebank.p2p.domain.customexceptions.DestinationException
                java.lang.String r6 = g91.C32343x.m95431a0(r6, r4, r3, r4)
                if (r6 != 0) goto L_0x00b7
                goto L_0x00b8
            L_0x00b7:
                r2 = r6
            L_0x00b8:
                r0.<init>(r2)
                ed1.x r6 = ed1.C40762x.m118158o(r0)
                goto L_0x00c9
            L_0x00c0:
                ed1.x r6 = ed1.C40762x.m118158o(r6)
                goto L_0x00c9
            L_0x00c5:
                ed1.x r6 = ed1.C40762x.m118158o(r6)
            L_0x00c9:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: wv0.C39691m.C39703l.invoke(java.lang.Throwable):ed1.b0");
        }
    }

    public C39691m(C39916a aVar, C39477c cVar, C39479e eVar, C39476b bVar, C39475a aVar2, C39478d dVar) {
        C41536l.m120489i(aVar, "p2PService");
        C41536l.m120489i(cVar, "commissionMapper");
        C41536l.m120489i(eVar, "moneyTransferResponseMapper");
        C41536l.m120489i(bVar, "cardsMapper");
        C41536l.m120489i(aVar2, "amountLimitMapper");
        C41536l.m120489i(dVar, "createInComeTopUpPaymentMapper");
        this.f94318a = aVar;
        this.f94319b = cVar;
        this.f94320c = eVar;
        this.f94321d = bVar;
        this.f94322e = aVar2;
        this.f94323f = dVar;
        C40765a i1 = C40765a.m118199i1(C41341q.m119907j());
        C41536l.m120488h(i1, "createDefault<List<Card>>(emptyList())");
        this.f94324g = i1;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m115273A(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final C31210c m115274B(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31210c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final boolean m115275C(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final C31208a m115276D(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31208a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static final MoneyTransferResponse m115277E(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (MoneyTransferResponse) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final C40735b0 m115278F(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final C40739f m115292v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final C31211d m115293w(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C31211d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final C40739f m115294x(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final List m115295y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m115296z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo71807a(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x C = this.f94318a.mo93604a(hashMap).mo95062A(new C39684f(new C39702k(this.f94320c))).mo95064C(new C39685g(C39703l.f94332d));
        C41536l.m120488h(C, "p2PService.moneyTransfer…          }\n            }");
        return C;
    }

    /* renamed from: b */
    public C40762x mo71808b(C31213f fVar) {
        C41536l.m120489i(fVar, "opType");
        C40762x A = C39916a.C39917a.m115710b(this.f94318a, fVar.mo71463b(), (String) null, 2, (Object) null).mo95062A(new C39689k(new C39701j(this.f94322e)));
        C41536l.m120488h(A, "p2PService.getOneTimeAmo…ountLimitMapper::convert)");
        return A;
    }

    /* renamed from: c */
    public C40749p mo71809c() {
        C40749p M = this.f94324g.mo94990M(new C39688j(C39700i.f94331d));
        C41536l.m120488h(M, "loadedCards.filter { it.isNotEmpty() }");
        return M;
    }

    /* renamed from: d */
    public C40762x mo71810d(C31212e eVar) {
        C41536l.m120489i(eVar, "createInComeTopUpPaymentRequest");
        C40762x A = this.f94318a.mo93609f(eVar.mo71458c(), eVar.mo71456a(), eVar.mo71457b(), eVar.mo71459d()).mo95062A(new C39686h(new C39694c(this.f94323f)));
        C41536l.m120488h(A, "p2PService.createInComeT…UpPaymentMapper::convert)");
        return A;
    }

    /* renamed from: e */
    public C40762x mo71811e(double d, String str) {
        C41536l.m120489i(str, "cardId");
        C40762x A = this.f94318a.mo93607d(C31213f.TRANSFER.mo71463b(), d, str).mo95062A(new C39687i(new C39699h(this.f94319b)));
        C41536l.m120488h(A, "p2PService.getCommission…ommissionMapper::convert)");
        return A;
    }

    /* renamed from: f */
    public C40762x mo71812f(C31213f fVar) {
        C41536l.m120489i(fVar, "opType");
        C40762x k = this.f94318a.mo93606c(fVar.mo71463b()).mo95062A(new C39680b(new C39696e(this, fVar))).mo95084m(new C39682d(new C39697f(this))).mo95082k(new C39683e(new C39698g(this)));
        C41536l.m120488h(k, "override fun getCards(op…tyList())\n        }\n    }");
        return k;
    }

    /* renamed from: g */
    public C40734b mo71813g(String str) {
        C41536l.m120489i(str, "phoneNumber");
        C40734b C = C39916a.C39917a.m115709a(this.f94318a, str, (String) null, 2, (Object) null).mo94884C(new C39690l(C39693b.f94325d));
        C41536l.m120488h(C, "p2PService.checkPhoneNum…)\n            }\n        }");
        return C;
    }

    /* renamed from: h */
    public C40734b mo71814h(long j) {
        C40734b C = this.f94318a.mo93610g(j, C31213f.TRANSFER.mo71463b()).mo94884C(new C39681c(C39695d.f94326d));
        C41536l.m120488h(C, "p2PService.getCardLimits…)\n            }\n        }");
        return C;
    }
}
