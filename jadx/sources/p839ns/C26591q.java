package p839ns;

import ed1.C40734b;
import ed1.C40744k;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import he1.C41224m;
import he1.C41238w;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.moneyrequest.entity.MoneyRequestApiModel;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p380ck.C10468i;
import p707as.C19273c;
import p812kv.C25779b;
import p822lv.C26093a;
import p849os.C27074a;
import p859ps.C27618a;
import ue1.C43075l;

/* renamed from: ns.q */
public final class C26591q implements C26093a {

    /* renamed from: k */
    public static final C26592a f67214k = new C26592a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final IRetrofitService f67215d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C27618a f67216e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C27074a f67217f;

    /* renamed from: g */
    private C40767b f67218g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AtomicBoolean f67219h = new AtomicBoolean(false);

    /* renamed from: i */
    private AtomicInteger f67220i = new AtomicInteger(-1);

    /* renamed from: j */
    private C40749p f67221j = m83039k4();

    /* renamed from: ns.q$a */
    public static final class C26592a {
        private C26592a() {
        }

        public /* synthetic */ C26592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ns.q$b */
    /* synthetic */ class C26593b extends C41535k implements C43075l {
        C26593b(Object obj) {
            super(1, obj, C27618a.class, "toMoneyRequest", "toMoneyRequest(Lge/bog/mobilebank/cleanarch/data/moneyrequest/entity/MoneyRequestApiModel;)Lge/bog/mobilebank/cleanarch/domain/moneyrequest/getrequest/model/MoneyRequest;", 0);
        }

        /* renamed from: b */
        public final C25779b invoke(MoneyRequestApiModel moneyRequestApiModel) {
            C41536l.m120489i(moneyRequestApiModel, "p0");
            return ((C27618a) this.receiver).mo66990e(moneyRequestApiModel);
        }
    }

    /* renamed from: ns.q$c */
    static final class C26594c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26594c f67222d = new C26594c();

        C26594c() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "it");
            return (List) mVar.mo95678e();
        }
    }

    /* renamed from: ns.q$d */
    static final class C26595d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26591q f67223d;

        /* renamed from: ns.q$d$a */
        /* synthetic */ class C26596a extends C41535k implements C43075l {
            C26596a(Object obj) {
                super(1, obj, C27618a.class, "toMoneyRequestList", "toMoneyRequestList(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27618a) this.receiver).mo66991f(list);
            }
        }

        /* renamed from: ns.q$d$b */
        /* synthetic */ class C26597b extends C41535k implements C43075l {
            C26597b(Object obj) {
                super(1, obj, C27074a.class, "save", "save(Ljava/util/List;)V", 0);
            }

            /* renamed from: b */
            public final void mo65854b(List list) {
                C41536l.m120489i(list, "p0");
                ((C27074a) this.receiver).mo66328i3(list);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo65854b((List) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ns.q$d$c */
        static final class C26598c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26591q f67224d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26598c(C26591q qVar) {
                super(1);
                this.f67224d = qVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f67224d.f67219h.set(true);
            }
        }

        /* renamed from: ns.q$d$d */
        static final class C26599d extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ Integer f67225d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26599d(Integer num) {
                super(1);
                this.f67225d = num;
            }

            /* renamed from: a */
            public final C41224m invoke(List list) {
                C41536l.m120489i(list, "it");
                Integer num = this.f67225d;
                C41536l.m120488h(num, "refreshCount");
                return new C41224m(list, num);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26595d(C26591q qVar) {
            super(1);
            this.f67223d = qVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public static final void m83056g(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public static final void m83057h(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final C40749p m83058i(C26591q qVar, Throwable th) {
            C41536l.m120489i(qVar, "this$0");
            C41536l.m120489i(th, "t");
            C10468i.m38038b(th);
            return qVar.f67217f.getAll().mo94945B().mo95036u(C41341q.m119907j());
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final C41224m m83059k(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: f */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "refreshCount");
            C40762x<BankApiResponse<List<MoneyRequestApiModel>>> moneyRequests = this.f67223d.f67215d.getMoneyRequests("TRANSFERS_GET_MONEY_REQUESTS");
            C41536l.m120488h(moneyRequests, "service.getMoneyRequests…SFERS_GET_MONEY_REQUESTS)");
            return C19273c.m64722h(moneyRequests).mo95075O().mo95026k0(new C26601r(new C26596a(this.f67223d.f67216e))).mo94978E(new C26602s(new C26597b(this.f67223d.f67217f))).mo94974C(new C26603t(new C26598c(this.f67223d))).mo95033s0(new C26604u(this.f67223d)).mo95026k0(new C26605v(new C26599d(num)));
        }
    }

    /* renamed from: ns.q$e */
    static final class C26600e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f67226d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26600e(int i) {
            super(1);
            this.f67226d = i;
        }

        /* renamed from: a */
        public final Boolean invoke(C41224m mVar) {
            boolean z;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            if (((Number) mVar.mo95676b()).intValue() >= this.f67226d) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C26591q(IRetrofitService iRetrofitService, C27618a aVar, C27074a aVar2) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(aVar2, "localDataSource");
        this.f67215d = iRetrofitService;
        this.f67216e = aVar;
        this.f67217f = aVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f67218g = h1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final C25779b m83037i4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25779b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final List m83038j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: k4 */
    private final C40749p m83039k4() {
        C40749p f1 = this.f67218g.mo94977D0(Integer.valueOf(this.f67220i.incrementAndGet())).mo94989L0(new C26587m(new C26595d(this))).mo95042x0(1).mo102091f1();
        C41536l.m120488h(f1, "private fun initMoneyReq…ay(1).autoConnect()\n    }");
        return f1;
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final C40754t m83040l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final boolean m83041m4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final void m83042n4(C26591q qVar, int i) {
        C41536l.m120489i(qVar, "this$0");
        qVar.f67218g.onNext(Integer.valueOf(i));
    }

    /* renamed from: A2 */
    public C40734b mo65006A2() {
        int incrementAndGet = this.f67220i.incrementAndGet();
        C40734b D = this.f67221j.mo94990M(new C26589o(new C26600e(incrementAndGet))).mo94995O0(1).mo95019d0().mo94885D(C40734b.m117924t(new C26590p(this, incrementAndGet)));
        C41536l.m120488h(D, "refreshCount = refreshCo…Count)\n                })");
        return D;
    }

    /* renamed from: C1 */
    public C40762x mo65007C1(long j, String str) {
        C41536l.m120489i(str, "participantId");
        C40762x<BankApiResponse<MoneyRequestApiModel>> confirmReceivingMoney = this.f67215d.confirmReceivingMoney("TRANSFERS_MONEY_REQUEST_PARTICIPANT_CHANGE_STATUS", j, str);
        C41536l.m120488h(confirmReceivingMoney, "service.confirmReceiving…  participantId\n        )");
        C40762x A = C19273c.m64722h(confirmReceivingMoney).mo95062A(new C26586l(new C26593b(this.f67216e)));
        C41536l.m120488h(A, "service.confirmReceiving…p(mapper::toMoneyRequest)");
        return A;
    }

    /* renamed from: Z2 */
    public C40734b mo65008Z2(long j, boolean z) {
        String str;
        IRetrofitService iRetrofitService = this.f67215d;
        if (z) {
            str = "D";
        } else {
            str = PensionStatusResult.STATUS_ACTIVE;
        }
        C40762x<BankApiResponse<Object>> completeMoneyRequest = iRetrofitService.completeMoneyRequest("TRANSFERS_MONEY_REQUEST_GROUP_CHANGE_STATUS", j, str);
        C41536l.m120488h(completeMoneyRequest, "service.completeMoneyReq…l) \"D\" else \"A\"\n        )");
        return C19273c.m64720f(completeMoneyRequest);
    }

    public void clean() {
        this.f67218g.onComplete();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create()");
        this.f67218g = h1;
        this.f67219h = new AtomicBoolean(false);
        this.f67220i = new AtomicInteger(-1);
        this.f67221j = m83039k4();
    }

    /* renamed from: i2 */
    public C40744k mo65009i2(long j) {
        C40744k z = this.f67217f.mo66326V3(j).mo94964z(mo65006A2().mo94896e(this.f67217f.mo66326V3(j)));
        C41536l.m120488h(z, "localDataSource.get(id).…Source.get(id))\n        )");
        return z;
    }

    /* renamed from: v1 */
    public C40734b mo65010v1(long j) {
        C40762x<BankApiResponse<Object>> declineRequest = this.f67215d.declineRequest("TRANSFERS_MONEY_REQUEST_PARTICIPANT_CHANGE_STATUS", j);
        C41536l.m120488h(declineRequest, "service.declineRequest(\n…      requestId\n        )");
        return C19273c.m64720f(declineRequest);
    }

    /* renamed from: y1 */
    public C40749p mo65011y1() {
        if (this.f67219h.compareAndSet(true, false)) {
            this.f67218g.onNext(Integer.valueOf(this.f67220i.incrementAndGet()));
        }
        C40749p k0 = this.f67221j.mo95026k0(new C26588n(C26594c.f67222d));
        C41536l.m120488h(k0, "getMoneyRequestObservable.map { it.first }");
        return k0;
    }
}
