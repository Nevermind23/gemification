package w51;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p51.C37903d;
import p51.C37906g;
import p51.C37909h;
import q51.C38130a;
import ue1.C43075l;
import ue1.C43079p;
import w51.C39527c;
import xy0.C39934a;

/* renamed from: w51.c0 */
public final class C39532c0 extends C21481a implements C39587r, C39588s {

    /* renamed from: y */
    public static final C39535b f93982y = new C39535b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C37903d f93983d;

    /* renamed from: e */
    private final C37909h f93984e;

    /* renamed from: f */
    private final C37906g f93985f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f93986g;

    /* renamed from: h */
    private final long f93987h;

    /* renamed from: i */
    private final long f93988i;

    /* renamed from: j */
    private final boolean f93989j;

    /* renamed from: k */
    private final boolean f93990k;

    /* renamed from: l */
    private final boolean f93991l;

    /* renamed from: m */
    private final String f93992m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int f93993n = 5;

    /* renamed from: o */
    private final C39537d f93994o;

    /* renamed from: p */
    private final C39556f0 f93995p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List f93996q;

    /* renamed from: r */
    private final C40767b f93997r;

    /* renamed from: s */
    private final C40765a f93998s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f93999t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C39547d f94000u;

    /* renamed from: v */
    private final C1644x f94001v;

    /* renamed from: w */
    private final C1644x f94002w;

    /* renamed from: x */
    private final C1644x f94003x;

    /* renamed from: w51.c0$a */
    public static abstract class C39533a {

        /* renamed from: w51.c0$a$a */
        public static final class C39534a extends C39533a {

            /* renamed from: a */
            private final String f94004a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39534a(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "name");
                this.f94004a = str;
            }

            /* renamed from: a */
            public final String mo93201a() {
                return this.f94004a;
            }
        }

        private C39533a() {
        }

        public /* synthetic */ C39533a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: w51.c0$b */
    public static final class C39535b {
        private C39535b() {
        }

        public /* synthetic */ C39535b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: w51.c0$c */
    public interface C39536c {
        /* renamed from: a */
        C39532c0 mo32812a(long j, long j2, long j3, boolean z, boolean z2, boolean z3, String str);
    }

    /* renamed from: w51.c0$d */
    private static final class C39537d {

        /* renamed from: a */
        private int f94005a;

        /* renamed from: b */
        private long f94006b;

        /* renamed from: c */
        private long f94007c;

        public C39537d(int i, long j, long j2) {
            this.f94005a = i;
            this.f94006b = j;
            this.f94007c = j2;
        }

        /* renamed from: b */
        public static /* synthetic */ C39537d m114948b(C39537d dVar, int i, long j, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = dVar.f94005a;
            }
            if ((i2 & 2) != 0) {
                j = dVar.f94006b;
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = dVar.f94007c;
            }
            return dVar.mo93202a(i, j3, j2);
        }

        /* renamed from: a */
        public final C39537d mo93202a(int i, long j, long j2) {
            return new C39537d(i, j, j2);
        }

        /* renamed from: c */
        public final long mo93203c() {
            return this.f94007c;
        }

        /* renamed from: d */
        public final int mo93204d() {
            return this.f94005a;
        }

        /* renamed from: e */
        public final long mo93205e() {
            return this.f94006b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C39537d)) {
                return false;
            }
            C39537d dVar = (C39537d) obj;
            return this.f94005a == dVar.f94005a && this.f94006b == dVar.f94006b && this.f94007c == dVar.f94007c;
        }

        public int hashCode() {
            return (((this.f94005a * 31) + C7397t.m28148a(this.f94006b)) * 31) + C7397t.m28148a(this.f94007c);
        }

        public String toString() {
            int i = this.f94005a;
            long j = this.f94006b;
            long j2 = this.f94007c;
            return "StatementsSubjectData(requestCode=" + i + ", startDate=" + j + ", endDate=" + j2 + ")";
        }
    }

    /* renamed from: w51.c0$e */
    static final class C39538e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39532c0 f94008d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39538e(C39532c0 c0Var) {
            super(1);
            this.f94008d = c0Var;
        }

        /* renamed from: a */
        public final void mo93209a(C41205b bVar) {
            this.f94008d.mo93193V7().mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93209a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.c0$f */
    static final class C39539f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39532c0 f94009d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39539f(C39532c0 c0Var) {
            super(1);
            this.f94009d = c0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x Aw = this.f94009d.mo93193V7();
            C41536l.m120488h(th, "it");
            Aw.mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: w51.c0$g */
    static final class C39540g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39537d f94010d;

        /* renamed from: e */
        final /* synthetic */ C39532c0 f94011e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39540g(C39537d dVar, C39532c0 c0Var) {
            super(1);
            this.f94010d = dVar;
            this.f94011e = c0Var;
        }

        /* renamed from: a */
        public final void mo93211a(Long l) {
            String str;
            String str2;
            String str3;
            HashMap hashMap = new HashMap();
            hashMap.put("from", BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
            hashMap.put("count", "2147483647");
            hashMap.put("extras", "1");
            hashMap.put("startDate", String.valueOf(this.f94010d.mo93205e()));
            hashMap.put("endDate", String.valueOf(this.f94010d.mo93203c()));
            hashMap.put("searchWord", "");
            hashMap.put("acctKey", String.valueOf(this.f94011e.f93986g));
            hashMap.put("reportId", String.valueOf(l));
            if (this.f94011e.f94000u == C39547d.PDF) {
                str = "application/pdf";
                str3 = ".pdf";
                str2 = BankApi.ACCOUNTS_GET_STATEMENT_PDF;
            } else {
                str = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
                str3 = ".xls";
                str2 = BankApi.ACCOUNTS_GET_STATEMENT_EXCEL;
            }
            String urlWithExtras = RetrofitClient.getUrlWithExtras(str2, hashMap);
            C1644x Aw = this.f94011e.mo93193V7();
            C41536l.m120488h(urlWithExtras, C11769i.C11770a.f34149l);
            Aw.mo4823o(new C31128a.C31131c(new C39523a(urlWithExtras, str3, str), 0, 2, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93211a((Long) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.c0$h */
    static final class C39541h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39541h f94012d = new C39541h();

        C39541h() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.c0$i */
    static final class C39542i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39532c0 f94013d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39542i(C39532c0 c0Var) {
            super(1);
            this.f94013d = c0Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: q51.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: q51.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: q51.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: q51.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo93213a(java.util.List r10) {
            /*
                r9 = this;
                w51.c0 r0 = r9.f94013d
                java.lang.String r1 = "data"
                kotlin.jvm.internal.C41536l.m120488h(r10, r1)
                r0.f93996q = r10
                java.util.Iterator r0 = r10.iterator()
            L_0x000e:
                boolean r1 = r0.hasNext()
                r2 = 0
                if (r1 == 0) goto L_0x0023
                java.lang.Object r1 = r0.next()
                r3 = r1
                q51.a r3 = (q51.C38130a) r3
                boolean r3 = r3.mo91656f()
                if (r3 == 0) goto L_0x000e
                goto L_0x0024
            L_0x0023:
                r1 = r2
            L_0x0024:
                q51.a r1 = (q51.C38130a) r1
                w51.c0 r0 = r9.f94013d
                long r3 = r0.f93986g
                r5 = -1
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 != 0) goto L_0x0033
                goto L_0x005b
            L_0x0033:
                w51.c0 r0 = r9.f94013d
                java.util.Iterator r10 = r10.iterator()
            L_0x0039:
                boolean r1 = r10.hasNext()
                if (r1 == 0) goto L_0x0058
                java.lang.Object r1 = r10.next()
                r3 = r1
                q51.a r3 = (q51.C38130a) r3
                long r3 = r3.mo91650a()
                long r7 = r0.f93986g
                int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r3 != 0) goto L_0x0054
                r3 = 1
                goto L_0x0055
            L_0x0054:
                r3 = 0
            L_0x0055:
                if (r3 == 0) goto L_0x0039
                r2 = r1
            L_0x0058:
                r1 = r2
                q51.a r1 = (q51.C38130a) r1
            L_0x005b:
                if (r1 != 0) goto L_0x0074
                w51.c0 r10 = r9.f94013d
                androidx.lifecycle.x r10 = r10.mo93189D7()
                java.lang.Long r0 = java.lang.Long.valueOf(r5)
                m41.a r0 = g91.C32343x.m95466m(r0)
                r10.mo4823o(r0)
                w51.c0 r10 = r9.f94013d
                r10.m114899Fw()
                return
            L_0x0074:
                w51.c0 r10 = r9.f94013d
                long r2 = r1.mo91650a()
                r10.f93986g = r2
                w51.c0 r10 = r9.f94013d
                androidx.lifecycle.x r10 = r10.mo93194ah()
                w51.c0$a$a r0 = new w51.c0$a$a
                java.lang.String r1 = r1.mo91654e()
                r0.<init>(r1)
                r10.mo4823o(r0)
                w51.c0 r10 = r9.f94013d
                long r0 = r10.f93986g
                r10.mo93199yh(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w51.C39532c0.C39542i.mo93213a(java.util.List):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93213a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.c0$j */
    static final class C39543j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39543j f94014d = new C39543j();

        C39543j() {
            super(1);
        }

        public final void invoke(Throwable th) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.c0$k */
    static final class C39544k extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C39544k f94015d = new C39544k();

        C39544k() {
            super(2);
        }

        /* renamed from: a */
        public final C39537d invoke(Integer num, C39537d dVar) {
            C41536l.m120489i(num, "requestCode");
            C41536l.m120489i(dVar, "subjectData");
            return C39537d.m114948b(dVar, num.intValue(), 0, 0, 6, (Object) null);
        }
    }

    /* renamed from: w51.c0$l */
    static final class C39545l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39532c0 f94016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39545l(C39532c0 c0Var) {
            super(1);
            this.f94016d = c0Var;
        }

        /* renamed from: a */
        public final C40754t invoke(C39537d dVar) {
            int i;
            List list;
            C41536l.m120489i(dVar, "subjectData");
            if (dVar.mo93204d() == 3) {
                C39556f0 f0Var = (C39556f0) this.f94016d.f93999t.mo4814f();
                if (f0Var != null) {
                    list = f0Var.mo93234i();
                } else {
                    list = null;
                }
                if (list != null) {
                    i = list.size();
                    C40749p O = this.f94016d.f93983d.mo91246a(this.f94016d.f93986g, i, this.f94016d.f93993n, dVar.mo93205e(), dVar.mo93203c()).mo95075O();
                    C41536l.m120488h(O, "getAccountStatementsUseC…         ).toObservable()");
                    return C31270e.m92879h(O, dVar.mo93204d());
                }
            }
            i = 0;
            C40749p O2 = this.f94016d.f93983d.mo91246a(this.f94016d.f93986g, i, this.f94016d.f93993n, dVar.mo93205e(), dVar.mo93203c()).mo95075O();
            C41536l.m120488h(O2, "getAccountStatementsUseC…         ).toObservable()");
            return C31270e.m92879h(O2, dVar.mo93204d());
        }
    }

    /* renamed from: w51.c0$m */
    static final class C39546m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39532c0 f94017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39546m(C39532c0 c0Var) {
            super(1);
            this.f94017d = c0Var;
        }

        /* renamed from: a */
        public final void mo93217a(C31128a aVar) {
            if (this.f94017d.f93986g == -1) {
                this.f94017d.m114899Fw();
                return;
            }
            C39532c0 c0Var = this.f94017d;
            C41536l.m120488h(aVar, "result");
            c0Var.m114900Gw(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93217a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39532c0(C37903d dVar, C37909h hVar, C37906g gVar, long j, long j2, long j3, boolean z, boolean z2, boolean z3, String str) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        String str2 = str;
        C41536l.m120489i(dVar, "getAccountStatementsUseCase");
        C41536l.m120489i(hVar, "getStatementReportIdUseCase");
        C41536l.m120489i(gVar, "getSelectableAccountsUseCase");
        C41536l.m120489i(str2, "printNo");
        this.f93983d = dVar;
        this.f93984e = hVar;
        this.f93985f = gVar;
        this.f93986g = j;
        this.f93987h = j2;
        this.f93988i = j3;
        this.f93989j = z;
        this.f93990k = z2;
        this.f93991l = z3;
        this.f93992m = str2;
        C39537d dVar2 = new C39537d(1, j2, j3);
        this.f93994o = dVar2;
        C39556f0 f0Var = new C39556f0(true, true, false, false, false, true, C41341q.m119907j());
        this.f93995p = f0Var;
        this.f93996q = C41341q.m119907j();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f93997r = h1;
        C40765a i1 = C40765a.m118199i1(dVar2);
        C41536l.m120488h(i1, "createDefault(defaultSubjectData)");
        this.f93998s = i1;
        this.f93999t = new C1644x(f0Var);
        this.f94000u = C39547d.PDF;
        this.f94001v = new C1644x();
        this.f94002w = new C1644x();
        this.f94003x = new C1644x();
        m114898Ew();
        m114904Kw();
    }

    /* renamed from: Ew */
    private final void m114898Ew() {
        if (!this.f93991l) {
            mo93194ah().mo4823o(new C39533a.C39534a(this.f93992m));
            mo93199yh(this.f93986g);
            return;
        }
        m114901Hw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public final void m114899Fw() {
        this.f93999t.mo4823o(new C39556f0(false, false, false, false, true, false, C41341q.m119907j()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public final void m114900Gw(C31128a aVar) {
        boolean z;
        boolean z2;
        List list;
        boolean z3;
        boolean z4;
        List list2;
        C31128a aVar2 = aVar;
        if (aVar2 instanceof C31128a.C31131c) {
            C39556f0 f0Var = (C39556f0) this.f93999t.mo4814f();
            if (f0Var == null || (list2 = f0Var.mo93234i()) == null) {
                list2 = C41341q.m119907j();
            }
            if (aVar.mo71341b() == 1) {
                Iterable<C39934a> iterable = (Iterable) ((C31128a.C31131c) aVar2).mo71340a();
                list2 = new ArrayList(C41343r.m119925u(iterable, 10));
                for (C39934a cVar : iterable) {
                    list2.add(new C39527c.C39530c(cVar));
                }
            } else if (aVar.mo71341b() == 3) {
                Iterable<C39934a> iterable2 = (Iterable) ((C31128a.C31131c) aVar2).mo71340a();
                ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable2, 10));
                for (C39934a cVar2 : iterable2) {
                    arrayList.add(new C39527c.C39530c(cVar2));
                }
                list2 = C41358y.m120023m0(list2, arrayList);
            }
            List list3 = list2;
            this.f93999t.mo4823o(new C39556f0(false, false, false, false, list3.isEmpty(), !list3.isEmpty(), list3));
        } else if (aVar2 instanceof C31128a.C31130b) {
            C39556f0 f0Var2 = (C39556f0) this.f93999t.mo4814f();
            if (f0Var2 == null) {
                f0Var2 = this.f93995p;
            }
            C39556f0 f0Var3 = f0Var2;
            C41536l.m120488h(f0Var3, "_uiState.value ?: defaultUiState");
            C1644x xVar = this.f93999t;
            if (aVar.mo71341b() == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (aVar.mo71341b() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            xVar.mo4823o(C39556f0.m114968b(f0Var3, z3, z4, false, false, false, true, (List) null, 64, (Object) null));
        } else if (aVar2 instanceof C31128a.C31129a) {
            C39556f0 f0Var4 = (C39556f0) this.f93999t.mo4814f();
            if (f0Var4 == null) {
                f0Var4 = this.f93995p;
            }
            C39556f0 f0Var5 = f0Var4;
            C41536l.m120488h(f0Var5, "_uiState.value ?: defaultUiState");
            C1644x xVar2 = this.f93999t;
            if (aVar.mo71341b() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (aVar.mo71341b() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (aVar.mo71341b() == 3) {
                list = f0Var5.mo93234i();
            } else {
                list = C41341q.m119907j();
            }
            xVar2.mo4823o(f0Var5.mo93225a(false, false, z, z2, false, false, list));
        }
    }

    /* renamed from: Hw */
    private final void m114901Hw() {
        C41205b I = C37906g.m111393e(this.f93985f, this.f93990k, 0, false, 6, (Object) null).mo95070I(new C39589t(new C39542i(this)), new C39590u(C39543j.f94014d));
        C41536l.m120488h(I, "private fun subscribeToA…ndToLifecycle()\n        }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m114902Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m114903Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Kw */
    private final void m114904Kw() {
        C41205b F0 = C40749p.m118047l0(this.f93997r.mo95014Y0(this.f93998s, new C39595z(C39544k.f94015d)), this.f93998s).mo94989L0(new C39524a0(new C39545l(this))).mo95027o0(C40992a.m118827a()).mo94981F0(new C39526b0(new C39546m(this)));
        C41536l.m120488h(F0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public static final C39537d m114905Lw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C39537d) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final C40754t m114906Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m114907Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final void m114926vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m114927ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m114928xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m114929yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: A9 */
    public void mo93185A9() {
        C39537d dVar = (C39537d) this.f93998s.mo95100j1();
        if (dVar == null) {
            dVar = this.f93994o;
        }
        C41536l.m120488h(dVar, "statementsSubject.value ?: defaultSubjectData");
        C41205b I = this.f93984e.mo91250a(this.f93986g, dVar.mo93205e(), dVar.mo93203c()).mo95063B(C40992a.m118827a()).mo95083l(new C39591v(new C39538e(this))).mo95082k(new C39592w(new C39539f(this))).mo95070I(new C39593x(new C39540g(dVar, this)), new C39594y(C39541h.f94012d));
        C41536l.m120488h(I, "override fun downloadSta…ndToLifecycle()\n        }");
        bindToLifecycle(I);
    }

    /* renamed from: Aw */
    public C1644x mo93193V7() {
        return this.f94002w;
    }

    /* renamed from: Bw */
    public final C39587r mo93187Bw() {
        return this;
    }

    /* renamed from: Cw */
    public C1644x mo93189D7() {
        return this.f94003x;
    }

    /* renamed from: Dw */
    public final C39588s mo93190Dw() {
        return this;
    }

    /* renamed from: Ms */
    public void mo93191Ms(long j, long j2) {
        this.f93999t.mo4823o(this.f93995p);
        this.f93998s.onNext(new C39537d(1, j, j2));
    }

    /* renamed from: Sm */
    public void mo93192Sm(C39547d dVar) {
        C41536l.m120489i(dVar, "type");
        this.f94000u = dVar;
    }

    /* renamed from: b */
    public LiveData mo93195b() {
        return this.f93999t;
    }

    /* renamed from: c */
    public void mo93196c() {
        C39537d dVar = (C39537d) this.f93998s.mo95100j1();
        if (dVar == null) {
            dVar = this.f93994o;
        }
        C41536l.m120488h(dVar, "statementsSubject.value ?: defaultSubjectData");
        mo93191Ms(dVar.mo93205e(), dVar.mo93203c());
    }

    /* renamed from: if */
    public void mo93197if() {
        mo93189D7().mo4823o(C32343x.m95466m(Long.valueOf(this.f93986g)));
    }

    /* renamed from: qm */
    public void mo93198qm() {
        List list;
        C39556f0 f0Var = (C39556f0) this.f93999t.mo4814f();
        if (f0Var == null || (list = f0Var.mo93234i()) == null) {
            list = C41341q.m119907j();
        }
        if ((!list.isEmpty()) && list.size() % this.f93993n == 0) {
            this.f93997r.onNext(3);
        }
    }

    /* renamed from: yh */
    public void mo93199yh(long j) {
        Object obj;
        boolean z;
        this.f93986g = j;
        Iterator it = this.f93996q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C38130a) obj).mo91650a() == j) {
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
        C38130a aVar = (C38130a) obj;
        if (aVar != null) {
            mo93194ah().mo4823o(new C39533a.C39534a(aVar.mo91654e()));
        }
        mo93196c();
    }

    /* renamed from: zw */
    public C1644x mo93194ah() {
        return this.f94001v;
    }
}
