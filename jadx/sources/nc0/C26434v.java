package nc0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import com.salesforce.marketingcloud.UrlHandler;
import ec0.C20206a;
import ec0.C20210b;
import ec0.C20211c;
import ec0.C20213e;
import ec0.C20214f;
import ec0.C20215g;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32319m;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hc0.C24974b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import ic0.C25164d;
import ic0.C25168f;
import j31.C36725a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.C37014a;
import ky0.C37018e;
import ky0.C37021h;
import ly0.C37184b;
import ly0.C37185c;
import m41.C37224b;
import my0.C37298b;
import ny0.C37499a;
import ny0.C37500b;
import ny0.C37501c;
import ny0.C37508i;
import oc0.C26921a;
import oc0.C26922b;
import oc0.C26926f;
import oy0.C37838d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.deposits.presentation.model.C23182a;
import p341ge.bog.mobilebank.deposits.presentation.model.DepositBreakOptions;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p380ck.C10463g;
import p784hw.C25074c;
import p793iw.C25264c;
import p891su.C28261a;
import ue1.C43075l;
import zb0.C30284f;
import zs0.C40253f;

/* renamed from: nc0.v */
public final class C26434v extends C21481a implements C26424l, C26427o, C26921a, C26922b {

    /* renamed from: A */
    private final C1644x f66957A = new C1644x();

    /* renamed from: B */
    private final C1644x f66958B = new C1644x();

    /* renamed from: C */
    private final C1644x f66959C = new C1644x();

    /* renamed from: D */
    private final C1644x f66960D = new C1644x();

    /* renamed from: E */
    private final C1644x f66961E = new C1644x();

    /* renamed from: F */
    private final C1644x f66962F = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C1644x f66963G = new C1644x();

    /* renamed from: H */
    private final C1644x f66964H = new C1644x();

    /* renamed from: I */
    private final C1644x f66965I = new C1644x();

    /* renamed from: J */
    private final C1644x f66966J = new C1644x();

    /* renamed from: K */
    private final C1644x f66967K = new C1644x();

    /* renamed from: L */
    private final C1644x f66968L = new C1644x();

    /* renamed from: M */
    private final C1644x f66969M = new C1644x();

    /* renamed from: N */
    private final C1644x f66970N = new C1644x();

    /* renamed from: O */
    private final C1644x f66971O = new C1644x();

    /* renamed from: P */
    private final C1644x f66972P = new C1644x();

    /* renamed from: Q */
    private final C1644x f66973Q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C1644x f66974R = new C1644x();

    /* renamed from: S */
    private final C1644x f66975S = new C1644x();

    /* renamed from: T */
    private final C1644x f66976T = new C1644x();

    /* renamed from: U */
    private final C1644x f66977U = new C1644x();

    /* renamed from: V */
    private final C40767b f66978V;

    /* renamed from: W */
    private final C40767b f66979W;

    /* renamed from: X */
    private final C40767b f66980X;

    /* renamed from: Y */
    private final C40767b f66981Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public C23182a f66982Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public final List f66983a0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C30284f f66984d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37021h f66985e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C37018e f66986f;

    /* renamed from: g */
    private final C37185c f66987g;

    /* renamed from: h */
    private final C37184b f66988h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C37298b f66989i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C25074c f66990j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C24974b f66991k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C26926f f66992l;

    /* renamed from: m */
    private final C37014a f66993m;

    /* renamed from: n */
    private final C10463g f66994n;

    /* renamed from: o */
    private final /* synthetic */ C26921a f66995o;

    /* renamed from: p */
    private final /* synthetic */ C26922b f66996p;

    /* renamed from: q */
    private final C26424l f66997q = this;

    /* renamed from: r */
    private final C26427o f66998r = this;

    /* renamed from: s */
    private final C1644x f66999s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f67000t = new C1644x();

    /* renamed from: u */
    private final C1644x f67001u = new C1644x();

    /* renamed from: v */
    private final C1644x f67002v = new C1644x();

    /* renamed from: w */
    private final C1644x f67003w = new C1644x();

    /* renamed from: x */
    private final C1644x f67004x = new C1644x();

    /* renamed from: y */
    private final C1644x f67005y = new C1644x();

    /* renamed from: z */
    private final C1644x f67006z = new C1644x();

    /* renamed from: nc0.v$a */
    public /* synthetic */ class C26435a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67007a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f67008b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f67009c;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ec0.b[] r0 = ec0.C20210b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ec0.b r2 = ec0.C20210b.PIGGY_BANK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ec0.b r2 = ec0.C20210b.AUTOMATIC_TRANSFER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f67007a = r0
                ic0.f[] r0 = ic0.C25168f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ic0.f r2 = ic0.C25168f.DONT_WANT_TO_RENEW     // Catch:{ NoSuchFieldError -> 0x002a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                f67008b = r0
                ec0.e[] r0 = ec0.C20213e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ec0.e r2 = ec0.C20213e.OPERATIONS     // Catch:{ NoSuchFieldError -> 0x003b }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f67009c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nc0.C26434v.C26435a.<clinit>():void");
        }
    }

    /* renamed from: nc0.v$b */
    static final class C26436b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26436b f67010d = new C26436b();

        C26436b() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo65741a(boolean z) {
            return Boolean.valueOf(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo65741a(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: nc0.v$c */
    static final class C26437c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26434v f67011d;

        /* renamed from: nc0.v$c$a */
        static final class C26438a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26434v f67012d;

            /* renamed from: e */
            final /* synthetic */ Long f67013e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26438a(C26434v vVar, Long l) {
                super(1);
                this.f67012d = vVar;
                this.f67013e = l;
            }

            /* renamed from: a */
            public final void mo65743a(C37838d dVar) {
                StringSource.Dictionary dictionary;
                C24974b kw = this.f67012d.f66991k;
                C41536l.m120488h(dVar, "it");
                List s = kw.mo63380s(dVar);
                C26434v vVar = this.f67012d;
                Long l = this.f67013e;
                C1644x tw = vVar.f66974R;
                C41536l.m120488h(l, "agreeKey");
                long longValue = l.longValue();
                String b = dVar.mo91179b();
                if (b != null) {
                    dictionary = C34646b.m101748b(b, new Object[0]);
                } else {
                    dictionary = null;
                }
                C37224b.m109965d(tw, new DepositBreakOptions(s, longValue, dictionary));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo65743a((C37838d) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26437c(C26434v vVar) {
            super(1);
            this.f67011d = vVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m82726c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "agreeKey");
            C40734b y = this.f67011d.f66989i.mo90406b(l.longValue()).mo95084m(new C26447w(new C26438a(this.f67011d, l))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToD…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* renamed from: nc0.v$d */
    static final class C26439d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26434v f67014d;

        /* renamed from: e */
        final /* synthetic */ long f67015e;

        /* renamed from: nc0.v$d$a */
        static final class C26440a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26434v f67016d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26440a(C26434v vVar) {
                super(1);
                this.f67016d = vVar;
            }

            /* renamed from: a */
            public final List invoke(C41224m mVar) {
                C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
                return this.f67016d.f66991k.mo63377o((C37508i) mVar.mo95675a(), (List) mVar.mo95676b());
            }
        }

        /* renamed from: nc0.v$d$b */
        static final class C26441b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26434v f67017d;

            /* renamed from: e */
            final /* synthetic */ long f67018e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26441b(C26434v vVar, long j) {
                super(1);
                this.f67017d = vVar;
                this.f67018e = j;
            }

            /* renamed from: a */
            public final void mo65746a(List list) {
                long j;
                boolean z;
                Long g;
                List qw = this.f67017d.f66983a0;
                C41536l.m120488h(list, "it");
                C32343x.m95475p(qw, list);
                C26434v vVar = this.f67017d;
                long j2 = this.f67018e;
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Long g2 = ((C23182a) it.next()).mo57882g();
                    C23182a jw = vVar.f66982Z;
                    if (jw == null || (g = jw.mo57882g()) == null) {
                        j = j2;
                    } else {
                        j = g.longValue();
                    }
                    if (g2 != null && g2.longValue() == j) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i++;
                }
                C1644x sw = this.f67017d.f67000t;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C23182a) it2.next()).mo57881f());
                }
                sw.mo4823o(new C20211c(arrayList, i, false, 4, (DefaultConstructorMarker) null));
                this.f67017d.mo65681mt(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo65746a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26439d(C26434v vVar, long j) {
            super(1);
            this.f67014d = vVar;
            this.f67015e = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m82731d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40749p k0 = this.f67014d.f66984d.mo70621d(C41341q.m119910m(2, 6).contains(num)).mo95026k0(new C26448x(new C26440a(this.f67014d)));
            C41536l.m120488h(k0, "private fun subscribeToI…ndToLifecycle()\n        }");
            C40749p E = C32343x.m95413R0(C32343x.m95453h1(k0)).mo94978E(new C26449y(new C26441b(this.f67014d, this.f67015e)));
            C41536l.m120488h(E, "private fun subscribeToI…ndToLifecycle()\n        }");
            return C31270e.m92879h(E, num.intValue());
        }
    }

    /* renamed from: nc0.v$e */
    static final class C26442e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26434v f67019d;

        /* renamed from: nc0.v$e$a */
        /* synthetic */ class C26443a extends C41535k implements C43075l {
            C26443a(Object obj) {
                super(1, obj, C24974b.class, "transform", "transformTransactions(Lge/bog/mobilebank/cleanarch/domain/pfm/transactions/model/Transactions;)Ljava/util/List;", 0);
            }

            /* renamed from: b */
            public final List invoke(C25264c cVar) {
                C41536l.m120489i(cVar, "p0");
                return ((C24974b) this.receiver).mo63382v(cVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26442e(C26434v vVar) {
            super(1);
            this.f67019d = vVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "acctKey");
            Calendar instance = Calendar.getInstance();
            instance.add(2, -3);
            C40762x A = C25074c.m80040d(this.f67019d.f66990j, Long.valueOf(instance.getTimeInMillis()), Long.valueOf(Calendar.getInstance().getTimeInMillis()), (Integer) null, (Integer) null, 10, C41339p.m119900e(l), (List) null, (List) null, (String) null, (List) null, (List) null, false, (C28261a) null, false, 16332, (Object) null).mo95062A(new C26450z(new C26443a(this.f67019d.f66991k)));
            C41536l.m120488h(A, "getTransactions(\n       …ositsUiMapper::transform)");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: nc0.v$f */
    static final class C26444f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26434v f67020d;

        /* renamed from: nc0.v$f$a */
        static final class C26445a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C26434v f67021d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C26445a(C26434v vVar) {
                super(1);
                this.f67021d = vVar;
            }

            /* renamed from: a */
            public final void mo65750a(List list) {
                Object obj;
                C23182a jw = this.f67021d.f66982Z;
                C37500b bVar = null;
                if (jw != null) {
                    obj = jw.mo57886j();
                } else {
                    obj = null;
                }
                if (obj instanceof C37500b) {
                    bVar = (C37500b) obj;
                }
                if (bVar != null) {
                    C26434v vVar = this.f67021d;
                    vVar.f66992l.mo66216o();
                    C26926f pw = vVar.f66992l;
                    C24974b kw = vVar.f66991k;
                    C41536l.m120488h(list, "purposes");
                    pw.mo66219w(kw.mo63381u(list), bVar);
                }
                C37224b.m109962a(this.f67021d.f66963G);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo65750a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26444f(C26434v vVar) {
            super(1);
            this.f67020d = vVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m82739c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "prodType");
            C40734b y = this.f67020d.f66986f.mo89941a(str).mo95063B(C40992a.m118827a()).mo95084m(new C26405a0(new C26445a(this.f67020d))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToR…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* renamed from: nc0.v$g */
    static final class C26446g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26434v f67022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26446g(C26434v vVar) {
            super(1);
            this.f67022d = vVar;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            Object obj;
            long j;
            C41536l.m120489i(str, "name");
            C37021h rw = this.f67022d.f66985e;
            C23182a jw = this.f67022d.f66982Z;
            C37500b bVar = null;
            if (jw != null) {
                obj = jw.mo57886j();
            } else {
                obj = null;
            }
            if (obj instanceof C37500b) {
                bVar = (C37500b) obj;
            }
            if (bVar != null) {
                j = bVar.mo90668d();
            } else {
                j = -1;
            }
            return C31270e.m92878g(rw.mo89944a(j, str), -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26434v(C30284f fVar, C37021h hVar, C37018e eVar, C37185c cVar, C37184b bVar, C37298b bVar2, C25074c cVar2, C24974b bVar3, C26926f fVar2, C37014a aVar, C10463g gVar, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(fVar, "getDepositsAndBonds");
        C41536l.m120489i(hVar, "setDepositName");
        C41536l.m120489i(eVar, "getDepositPurposes");
        C41536l.m120489i(cVar, "getSTOBannerVisibility");
        C41536l.m120489i(bVar, "piggyBankBannerVisibility");
        C41536l.m120489i(bVar2, "getDepositBreakPossibilities");
        C41536l.m120489i(cVar2, "getTransactions");
        C41536l.m120489i(bVar3, "depositsUiMapper");
        C41536l.m120489i(fVar2, "goalHandler");
        C41536l.m120489i(aVar, "changeProlStateUseCase");
        C41536l.m120489i(gVar, "analytics");
        this.f66984d = fVar;
        this.f66985e = hVar;
        this.f66986f = eVar;
        this.f66987g = cVar;
        this.f66988h = bVar;
        this.f66989i = bVar2;
        this.f66990j = cVar2;
        this.f66991k = bVar3;
        this.f66992l = fVar2;
        this.f66993m = aVar;
        this.f66994n = gVar;
        this.f66995o = fVar2.mo66217p();
        this.f66996p = fVar2.mo66218q();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f66978V = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f66979W = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Long>()");
        this.f66980X = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Long>()");
        this.f66981Y = h14;
        this.f66983a0 = new ArrayList();
        m82636Gw(j);
        m82642Mw();
        m82640Kw();
        m82638Iw();
        m82634Ew();
    }

    /* renamed from: Aw */
    private final void m82631Aw(C37500b bVar) {
        if (bVar.mo90663D()) {
            C37224b.m109962a(this.f66968L);
        } else {
            C37224b.m109965d(this.f66967K, Long.valueOf(bVar.mo90682p()));
        }
    }

    /* renamed from: Cw */
    private final void m82632Cw(C37501c cVar) {
        C40253f fVar;
        C1644x xVar = this.f66957A;
        List c = C41339p.m119898c();
        if (cVar instanceof C37500b) {
            C23182a aVar = this.f66982Z;
            if (aVar != null) {
                fVar = aVar.mo57876b();
            } else {
                fVar = null;
            }
            if (fVar == null) {
                C37500b bVar = (C37500b) cVar;
                if (bVar.mo90692y().contains("CAS") && this.f66988h.mo90203b(bVar.mo90668d())) {
                    c.add(C20210b.PIGGY_BANK);
                }
            }
            C37500b bVar2 = (C37500b) cVar;
            if (bVar2.mo90692y().contains("STO") && !bVar2.mo90663D() && this.f66987g.mo90205b(bVar2.mo90668d())) {
                c.add(C20210b.AUTOMATIC_TRANSFER);
            }
        }
        xVar.mo4823o(C41339p.m119896a(c));
    }

    /* renamed from: Dw */
    private final void m82633Dw(C23182a aVar) {
        C37500b bVar;
        this.f66992l.mo66216o();
        this.f66982Z = aVar;
        m82632Cw(aVar.mo57886j());
        this.f67001u.mo4823o(aVar.mo57877c());
        this.f67005y.mo4823o(aVar.mo57879e());
        this.f67002v.mo4823o(aVar.mo57883h());
        this.f66965I.mo4823o(aVar.mo57885i());
        this.f67003w.mo4823o(aVar.mo57875a());
        this.f67004x.mo4823o(aVar.mo57878d());
        C37501c j = aVar.mo57886j();
        if (j instanceof C37500b) {
            bVar = (C37500b) j;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            this.f66980X.onNext(Long.valueOf(bVar.mo90682p()));
        }
    }

    /* renamed from: Ew */
    private final void m82634Ew() {
        C40749p L0 = this.f66981Y.mo94989L0(new C26429q(new C26437c(this)));
        C41536l.m120488h(L0, "private fun subscribeToD…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f66964H));
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final C40754t m82635Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Gw */
    private final void m82636Gw(long j) {
        C40749p Q = C40749p.m118047l0(onInit(), onRefresh()).mo94998Q(new C26432t(new C26439d(this, j)));
        C41536l.m120488h(Q, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(Q, this.f66999s));
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final C40754t m82637Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Iw */
    private final void m82638Iw() {
        C40749p L0 = this.f66980X.mo94989L0(new C26430r(new C26442e(this)));
        C41536l.m120488h(L0, "private fun subscribeToR…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f67006z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final C40754t m82639Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Kw */
    private final void m82640Kw() {
        C40749p L0 = this.f66979W.mo94989L0(new C26433u(new C26444f(this)));
        C41536l.m120488h(L0, "private fun subscribeToR…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f66964H));
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final C40754t m82641Lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Mw */
    private final void m82642Mw() {
        C40749p L0 = this.f66978V.mo94989L0(new C26431s(new C26446g(this)));
        C41536l.m120488h(L0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f66962F));
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final C40754t m82643Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final void m82644Ow(C26434v vVar, C25168f fVar, long j) {
        C41536l.m120489i(vVar, "this$0");
        C41536l.m120489i(fVar, "$type");
        vVar.onRefresh(6);
        C37224b.m109965d(vVar.f66976T, new C26426n(fVar, j));
    }

    /* renamed from: vw */
    private final void m82663vw(String str) {
        if (str != null) {
            C32359z0.m95596x(str);
            C37224b.m109962a(this.f66971O);
        }
    }

    /* renamed from: ww */
    private final void m82664ww(C37501c cVar) {
        C41232r rVar;
        if (cVar instanceof C37499a) {
            C37499a aVar = (C37499a) cVar;
            Map m = C41344r0.m119931m(C41233s.m119492a("cdGroupId", String.valueOf(aVar.mo90644g())), C41233s.m119492a("prodType", String.valueOf(aVar.mo90658t())));
            long g = aVar.mo90644g();
            rVar = new C41232r(m, BankApi.BONDS_GET_AGREEMENT_PDF, g + ".pdf");
        } else if (cVar instanceof C37500b) {
            C37500b bVar = (C37500b) cVar;
            Map g2 = C41342q0.m119922g(C41233s.m119492a("agreeKey", String.valueOf(bVar.mo90668d())));
            long d = bVar.mo90668d();
            rVar = new C41232r(g2, BankApi.DEPOSITS_GET_AGREEMENT_PDF, d + ".pdf");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        String urlWithExtras = RetrofitClient.getUrlWithExtras((String) rVar.mo95689b(), (Map) rVar.mo95688a());
        C41536l.m120488h(urlWithExtras, "getUrlWithExtras(serviceId, params)");
        C37224b.m109965d(this.f66972P, new C20215g(urlWithExtras, (String) rVar.mo95690c()));
    }

    /* renamed from: zw */
    private final void m82665zw(C37500b bVar) {
        C40253f fVar;
        C40253f b;
        C23182a aVar = this.f66982Z;
        if (aVar != null) {
            fVar = aVar.mo57876b();
        } else {
            fVar = null;
        }
        if (fVar != null) {
            C1644x xVar = this.f66969M;
            C23182a aVar2 = this.f66982Z;
            if (aVar2 != null && (b = aVar2.mo57876b()) != null) {
                C37224b.m109965d(xVar, Long.valueOf(b.mo94250j()));
                return;
            }
            return;
        }
        C37224b.m109965d(this.f66970N, Long.valueOf(bVar.mo90668d()));
    }

    /* renamed from: A2 */
    public LiveData mo65693A2() {
        return this.f66972P;
    }

    /* renamed from: A3 */
    public void mo65722A3() {
        this.f66995o.mo65722A3();
    }

    /* renamed from: B7 */
    public void mo65673B7(C25168f fVar) {
        Object obj;
        long j;
        C41536l.m120489i(fVar, "type");
        C23182a aVar = this.f66982Z;
        C37500b bVar = null;
        if (aVar != null) {
            obj = aVar.mo57886j();
        } else {
            obj = null;
        }
        if (obj instanceof C37500b) {
            bVar = (C37500b) obj;
        }
        if (bVar != null) {
            if (C26435a.f67008b[fVar.ordinal()] == 1) {
                C1644x xVar = this.f66977U;
                long currentTimeMillis = System.currentTimeMillis();
                Long q = bVar.mo90683q();
                if (q != null) {
                    j = q.longValue();
                } else {
                    j = Long.MAX_VALUE;
                }
                C37224b.m109965d(xVar, new C26425m(fVar, C32319m.m95313t(currentTimeMillis, j)));
                return;
            }
            C37224b.m109965d(this.f66976T, new C26426n(fVar, bVar.mo90668d()));
        }
    }

    /* renamed from: Bw */
    public void mo65723Bw(C20213e eVar) {
        Object obj;
        C41536l.m120489i(eVar, "section");
        if (C26435a.f67009c[eVar.ordinal()] == 1) {
            C23182a aVar = this.f66982Z;
            C37500b bVar = null;
            if (aVar != null) {
                obj = aVar.mo57886j();
            } else {
                obj = null;
            }
            if (obj instanceof C37500b) {
                bVar = (C37500b) obj;
            }
            if (bVar != null) {
                this.f66980X.onNext(Long.valueOf(bVar.mo90682p()));
            }
        }
    }

    /* renamed from: Cs */
    public void mo65674Cs(C20206a aVar) {
        Object obj;
        Object obj2;
        Long g;
        C41536l.m120489i(aVar, UrlHandler.ACTION);
        if (aVar instanceof C20206a.C20207a) {
            C23182a aVar2 = this.f66982Z;
            if (aVar2 != null && (g = aVar2.mo57882g()) != null) {
                C37224b.m109965d(this.f66958B, Long.valueOf(g.longValue()));
                return;
            }
            return;
        }
        C37500b bVar = null;
        if (aVar instanceof C20206a.C20208b) {
            C23182a aVar3 = this.f66982Z;
            if (aVar3 != null) {
                obj2 = aVar3.mo57886j();
            } else {
                obj2 = null;
            }
            if (obj2 instanceof C37500b) {
                bVar = (C37500b) obj2;
            }
            if (bVar != null) {
                C37224b.m109965d(this.f66959C, Long.valueOf(bVar.mo90667c()));
            }
        } else if (aVar instanceof C20206a.C20209c) {
            C23182a aVar4 = this.f66982Z;
            if (aVar4 != null) {
                obj = aVar4.mo57886j();
            } else {
                obj = null;
            }
            if (obj instanceof C37500b) {
                bVar = (C37500b) obj;
            }
            if (bVar != null) {
                C37224b.m109965d(this.f66960D, Long.valueOf(bVar.mo90667c()));
            }
        }
    }

    /* renamed from: Cu */
    public LiveData mo65724Cu() {
        return this.f66996p.mo65724Cu();
    }

    /* renamed from: Dj */
    public LiveData mo65725Dj() {
        return this.f66996p.mo65725Dj();
    }

    /* renamed from: Em */
    public LiveData mo65694Em() {
        return this.f67004x;
    }

    /* renamed from: F0 */
    public LiveData mo65726F0() {
        return this.f66996p.mo65726F0();
    }

    /* renamed from: Hb */
    public LiveData mo65695Hb() {
        return this.f66959C;
    }

    /* renamed from: Id */
    public LiveData mo65696Id() {
        return this.f66961E;
    }

    /* renamed from: Jf */
    public LiveData mo65697Jf() {
        return this.f66970N;
    }

    /* renamed from: Oi */
    public LiveData mo65727Oi() {
        return this.f66996p.mo65727Oi();
    }

    /* renamed from: Ot */
    public void mo65728Ot(String str) {
        C41536l.m120489i(str, "input");
        this.f66995o.mo65728Ot(str);
    }

    /* renamed from: Qg */
    public void mo65675Qg(String str) {
        C41536l.m120489i(str, "name");
        this.f66978V.onNext(str);
    }

    /* renamed from: S6 */
    public LiveData mo65698S6() {
        return this.f66962F;
    }

    /* renamed from: Ta */
    public LiveData mo65699Ta() {
        return this.f66973Q;
    }

    /* renamed from: Ug */
    public LiveData mo65700Ug() {
        return this.f66999s;
    }

    /* renamed from: Wa */
    public LiveData mo65701Wa() {
        return this.f66976T;
    }

    /* renamed from: Wb */
    public void mo65729Wb(SavingGoalUiModel savingGoalUiModel) {
        C41536l.m120489i(savingGoalUiModel, "goal");
        this.f66995o.mo65729Wb(savingGoalUiModel);
    }

    /* renamed from: Xj */
    public LiveData mo65702Xj() {
        return this.f66975S;
    }

    /* renamed from: Xu */
    public LiveData mo65703Xu() {
        return this.f66971O;
    }

    /* renamed from: Yg */
    public LiveData mo65730Yg() {
        return this.f66996p.mo65730Yg();
    }

    /* renamed from: at */
    public LiveData mo65704at() {
        return this.f67003w;
    }

    /* renamed from: b5 */
    public LiveData mo65705b5() {
        return this.f66969M;
    }

    /* renamed from: bb */
    public void mo65731bb(long j) {
        this.f66995o.mo65731bb(j);
    }

    /* renamed from: bk */
    public LiveData mo65706bk() {
        return this.f66958B;
    }

    /* renamed from: cd */
    public LiveData mo65707cd() {
        return this.f67006z;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [ny0.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo65676d7(p341ge.bog.mobilebank.deposits.presentation.model.C23183b r5) {
        /*
            r4 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            ge.bog.mobilebank.deposits.presentation.model.a r0 = r4.f66982Z
            r1 = 0
            if (r0 == 0) goto L_0x000f
            ny0.c r0 = r0.mo57886j()
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            boolean r2 = r0 instanceof ny0.C37500b
            if (r2 == 0) goto L_0x0017
            ny0.b r0 = (ny0.C37500b) r0
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            ge.bog.mobilebank.deposits.presentation.model.a r2 = r4.f66982Z
            if (r2 == 0) goto L_0x0021
            ny0.c r2 = r2.mo57886j()
            goto L_0x0022
        L_0x0021:
            r2 = r1
        L_0x0022:
            boolean r3 = r2 instanceof ny0.C37499a
            if (r3 == 0) goto L_0x0029
            ny0.a r2 = (ny0.C37499a) r2
            goto L_0x002a
        L_0x0029:
            r2 = r1
        L_0x002a:
            boolean r3 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23217w
            if (r3 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0036
            java.lang.String r5 = r0.mo90685s()
            if (r5 != 0) goto L_0x0038
        L_0x0036:
            java.lang.String r5 = ""
        L_0x0038:
            androidx.lifecycle.x r0 = r4.f66961E
            m41.C37224b.m109965d(r0, r5)
            goto L_0x00d8
        L_0x003f:
            boolean r3 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23185a0
            if (r3 == 0) goto L_0x0058
            if (r0 == 0) goto L_0x00d8
            ny0.h r5 = r0.mo90691x()
            if (r5 == 0) goto L_0x00d8
            java.lang.String r5 = r5.mo90718b()
            if (r5 == 0) goto L_0x00d8
            ee1.b r0 = r4.f66979W
            r0.onNext(r5)
            goto L_0x00d8
        L_0x0058:
            boolean r3 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23188c
            if (r3 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x00d8
            r4.m82631Aw(r0)
            goto L_0x00d8
        L_0x0063:
            boolean r3 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23195f0
            if (r3 == 0) goto L_0x006e
            if (r0 == 0) goto L_0x00d8
            r4.m82665zw(r0)
            goto L_0x00d8
        L_0x006e:
            boolean r3 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23210p
            if (r3 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = r2
        L_0x0076:
            if (r0 == 0) goto L_0x007c
            java.lang.String r1 = r0.mo90637a()
        L_0x007c:
            r4.m82663vw(r1)
            goto L_0x00d8
        L_0x0080:
            boolean r1 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23211q
            if (r1 == 0) goto L_0x008f
            if (r0 == 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            if (r2 == 0) goto L_0x008e
            r0 = r2
        L_0x008a:
            r4.m82664ww(r0)
            goto L_0x00d8
        L_0x008e:
            return
        L_0x008f:
            boolean r1 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23212r
            if (r1 == 0) goto L_0x0095
            r1 = 1
            goto L_0x009b
        L_0x0095:
            ge.bog.mobilebank.deposits.presentation.model.b$u r1 = p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23215u.f60774k
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r5, r1)
        L_0x009b:
            if (r1 == 0) goto L_0x00ad
            if (r0 == 0) goto L_0x00d8
            long r0 = r0.mo90668d()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            ee1.b r0 = r4.f66981Y
            r0.onNext(r5)
            goto L_0x00d8
        L_0x00ad:
            boolean r0 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23201i0
            if (r0 == 0) goto L_0x00c9
            ge.bog.mobilebank.deposits.presentation.model.a r5 = r4.f66982Z
            if (r5 == 0) goto L_0x00d8
            java.lang.Long r5 = r5.mo57882g()
            if (r5 == 0) goto L_0x00d8
            androidx.lifecycle.x r0 = r4.f66958B
            long r1 = r5.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            m41.C37224b.m109965d(r0, r5)
            goto L_0x00d8
        L_0x00c9:
            boolean r0 = r5 instanceof p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23219y
            if (r0 == 0) goto L_0x00d8
            androidx.lifecycle.x r0 = r4.f66973Q
            ge.bog.mobilebank.deposits.presentation.model.b$y r5 = (p341ge.bog.mobilebank.deposits.presentation.model.C23183b.C23219y) r5
            ge.bog.mobilebank.model.account.AccountOperation r5 = r5.mo57934c()
            m41.C37224b.m109965d(r0, r5)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc0.C26434v.mo65676d7(ge.bog.mobilebank.deposits.presentation.model.b):void");
    }

    /* renamed from: d8 */
    public void mo65677d8(C20210b bVar) {
        Object obj;
        C41536l.m120489i(bVar, "item");
        C23182a aVar = this.f66982Z;
        C37500b bVar2 = null;
        if (aVar != null) {
            obj = aVar.mo57886j();
        } else {
            obj = null;
        }
        if (obj instanceof C37500b) {
            bVar2 = (C37500b) obj;
        }
        if (bVar2 != null) {
            int i = C26435a.f67007a[bVar.ordinal()];
            if (i == 1) {
                m82665zw(bVar2);
            } else if (i == 2) {
                m82631Aw(bVar2);
            }
        }
    }

    /* renamed from: da */
    public LiveData mo65732da() {
        return this.f66996p.mo65732da();
    }

    /* renamed from: dv */
    public LiveData mo65708dv() {
        return this.f66960D;
    }

    /* renamed from: gh */
    public void mo65733gh() {
        this.f66995o.mo65733gh();
    }

    /* renamed from: gq */
    public LiveData mo65709gq() {
        return this.f66965I;
    }

    /* renamed from: gr */
    public LiveData mo65710gr() {
        return this.f67001u;
    }

    /* renamed from: ho */
    public void mo65678ho() {
        C20214f e;
        C23182a aVar = this.f66982Z;
        if (aVar != null && (e = aVar.mo57879e()) != null) {
            new C25164d.C25166b(e.mo48636a()).mo63704a(this.f66994n);
            C37224b.m109965d(this.f66975S, e);
        }
    }

    /* renamed from: i */
    public LiveData mo65711i() {
        return this.f66964H;
    }

    /* renamed from: id */
    public LiveData mo65712id() {
        return this.f66963G;
    }

    /* renamed from: ii */
    public void mo65679ii(C20210b bVar) {
        Object obj;
        C41536l.m120489i(bVar, "item");
        C23182a aVar = this.f66982Z;
        C37500b bVar2 = null;
        if (aVar != null) {
            obj = aVar.mo57886j();
        } else {
            obj = null;
        }
        if (obj instanceof C37500b) {
            bVar2 = (C37500b) obj;
        }
        if (bVar2 != null) {
            int i = C26435a.f67007a[bVar.ordinal()];
            if (i == 1) {
                this.f66988h.mo90202a(bVar2.mo90668d());
            } else if (i == 2) {
                this.f66987g.mo90204a(bVar2.mo90668d());
            }
            m82632Cw(bVar2);
        }
    }

    /* renamed from: j2 */
    public void mo65680j2() {
        Boolean bool;
        C37501c j;
        C36725a b;
        C23182a aVar = this.f66982Z;
        if (aVar == null || (j = aVar.mo57886j()) == null || (b = j.mo90638b()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(b.mo89542e());
        }
        this.f66966J.mo4823o(Boolean.valueOf(C32343x.m95491u0(bool, C26436b.f67010d)));
    }

    /* renamed from: l0 */
    public LiveData mo65713l0() {
        return this.f67000t;
    }

    /* renamed from: mt */
    public void mo65681mt(int i) {
        C23182a aVar = (C23182a) C41358y.m120010Z(this.f66983a0, i);
        if (aVar != null) {
            m82633Dw(aVar);
        }
    }

    /* renamed from: oj */
    public LiveData mo65714oj() {
        return this.f66977U;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f66992l.mo66216o();
    }

    /* renamed from: ot */
    public LiveData mo65715ot() {
        return this.f66968L;
    }

    /* renamed from: ou */
    public LiveData mo65716ou() {
        return this.f66974R;
    }

    /* renamed from: pe */
    public LiveData mo65734pe() {
        return this.f66996p.mo65734pe();
    }

    /* renamed from: pp */
    public LiveData mo65735pp() {
        return this.f66996p.mo65735pp();
    }

    /* renamed from: qf */
    public void mo65736qf() {
        this.f66995o.mo65736qf();
    }

    /* renamed from: s4 */
    public void mo65737s4() {
        this.f66995o.mo65737s4();
    }

    /* renamed from: sb */
    public void mo65682sb(C25168f fVar) {
        Object obj;
        C41536l.m120489i(fVar, "type");
        C23182a aVar = this.f66982Z;
        C37500b bVar = null;
        if (aVar != null) {
            obj = aVar.mo57886j();
        } else {
            obj = null;
        }
        if (obj instanceof C37500b) {
            bVar = (C37500b) obj;
        }
        if (bVar != null) {
            long d = bVar.mo90668d();
            C41205b F = C32343x.m95450g1(C37014a.m109522b(this.f66993m, d, false, 2, (Object) null)).mo94887F(new C26428p(this, fVar, d));
            C41536l.m120488h(F, "changeProlStateUseCase(\n…      )\n                }");
            bindToLifecycle(F);
        }
    }

    /* renamed from: sh */
    public LiveData mo65717sh() {
        return this.f66957A;
    }

    /* renamed from: sn */
    public LiveData mo65718sn() {
        return this.f67005y;
    }

    /* renamed from: sq */
    public LiveData mo65738sq() {
        return this.f66996p.mo65738sq();
    }

    /* renamed from: u1 */
    public LiveData mo65719u1() {
        return this.f66966J;
    }

    /* renamed from: xw */
    public final C26424l mo65739xw() {
        return this.f66997q;
    }

    /* renamed from: ye */
    public LiveData mo65720ye() {
        return this.f66967K;
    }

    /* renamed from: yw */
    public final C26427o mo65740yw() {
        return this.f66998r;
    }

    /* renamed from: zc */
    public LiveData mo65721zc() {
        return this.f67002v;
    }
}
