package lc0;

import ac0.C19220a;
import ac0.C19221b;
import ac0.C19223d;
import ac0.C19224e;
import ac0.C19226g;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import ed1.C40749p;
import g91.C32319m;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import ic0.C25167e;
import ic0.C25168f;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.actionsheet.depositperiod.DepositPeriodModel;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragmentArgs;
import p615tg.C17959a;
import py0.C38047a;
import py0.C38049c;
import py0.C38050d;
import ue1.C43075l;

/* renamed from: lc0.x */
public final class C25940x extends C21481a implements C25930o, C25933r {

    /* renamed from: x */
    public static final C25941a f65993x = new C25941a((DefaultConstructorMarker) null);

    /* renamed from: y */
    private static final int f65994y = 1;

    /* renamed from: d */
    private final DepositProlongationMainFragmentArgs f65995d;

    /* renamed from: e */
    private final C19223d f65996e;

    /* renamed from: f */
    private final C19224e f65997f;

    /* renamed from: g */
    private final C19220a f65998g;

    /* renamed from: h */
    private final C19226g f65999h;

    /* renamed from: i */
    private final C19221b f66000i;

    /* renamed from: j */
    private final C25167e f66001j;

    /* renamed from: k */
    private final C25930o f66002k = this;

    /* renamed from: l */
    private final C25933r f66003l = this;

    /* renamed from: m */
    private final C1644x f66004m = new C1644x();

    /* renamed from: n */
    private final C1644x f66005n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f66006o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f66007p;

    /* renamed from: q */
    private final C1644x f66008q;

    /* renamed from: r */
    private final C1644x f66009r;

    /* renamed from: s */
    private final C1644x f66010s;

    /* renamed from: t */
    private final C1644x f66011t;

    /* renamed from: u */
    private final C1644x f66012u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C1644x f66013v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C25934s f66014w;

    /* renamed from: lc0.x$a */
    public static final class C25941a {
        private C25941a() {
        }

        public /* synthetic */ C25941a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lc0.x$b */
    static final class C25942b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25940x f66015d;

        /* renamed from: lc0.x$b$a */
        static final class C25943a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25940x f66016d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25943a(C25940x xVar) {
                super(1);
                this.f66016d = xVar;
            }

            /* renamed from: a */
            public final void mo64853a(C38047a aVar) {
                C41536l.m120489i(aVar, "params");
                C25940x xVar = this.f66016d;
                xVar.m81541Dw(C25934s.m81517b(xVar.f66014w, (C25168f) null, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, aVar.mo91417a(), (Long) null, (String) null, (String) null, false, false, aVar.mo91419c(), aVar.mo91420d(), aVar.mo91418b(), 258047, (Object) null));
                double b = aVar.mo91418b();
                this.f66016d.m81542Ew(aVar.mo91419c(), b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo64853a((C38047a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25942b(C25940x xVar) {
            super(1);
            this.f66015d = xVar;
        }

        /* renamed from: a */
        public final void mo64852a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C25943a(this.f66015d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64852a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lc0.x$c */
    static final class C25944c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25940x f66017d;

        /* renamed from: lc0.x$c$a */
        static final class C25945a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25940x f66018d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25945a(C25940x xVar) {
                super(1);
                this.f66018d = xVar;
            }

            /* renamed from: a */
            public final void mo64855a(C38049c cVar) {
                C41536l.m120489i(cVar, "it");
                if (this.f66018d.f66014w.mo64832j() > cVar.mo91451d() && cVar.mo91449b() > this.f66018d.f66014w.mo64832j()) {
                    this.f66018d.mo64847Aw(new DepositPeriodModel.Deposit(this.f66018d.f66014w.mo64832j(), cVar.mo91450c(), cVar.mo91448a()));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo64855a((C38049c) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25944c(C25940x xVar) {
            super(1);
            this.f66017d = xVar;
        }

        /* JADX WARNING: type inference failed for: r1v8, types: [b41.a$b] */
        /* JADX WARNING: type inference failed for: r2v9, types: [b41.a$c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo64854a(b41.C31128a r10) {
            /*
                r9 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.C41536l.m120488h(r10, r0)
                lc0.x$c$a r0 = new lc0.x$c$a
                lc0.x r1 = r9.f66017d
                r0.<init>(r1)
                r1 = 1
                r2 = 0
                b41.C31132b.m92648j(r10, r2, r0, r1, r2)
                lc0.x r0 = r9.f66017d
                androidx.lifecycle.x r0 = r0.f66007p
                lc0.x r1 = r9.f66017d
                boolean r3 = r10 instanceof b41.C31128a.C31131c     // Catch:{ all -> 0x006c }
                if (r3 == 0) goto L_0x003d
                r2 = r10
                b41.a$c r2 = (b41.C31128a.C31131c) r2     // Catch:{ all -> 0x006c }
                java.lang.Object r2 = r2.mo71340a()     // Catch:{ all -> 0x006c }
                py0.c r2 = (py0.C38049c) r2     // Catch:{ all -> 0x006c }
                lc0.m r3 = new lc0.m     // Catch:{ all -> 0x006c }
                lc0.s r1 = r1.f66014w     // Catch:{ all -> 0x006c }
                int r1 = r1.mo64832j()     // Catch:{ all -> 0x006c }
                r3.<init>(r2, r1)     // Catch:{ all -> 0x006c }
                int r1 = r10.mo71341b()     // Catch:{ all -> 0x006c }
                b41.a$c r2 = new b41.a$c     // Catch:{ all -> 0x006c }
                r2.<init>(r3, r1)     // Catch:{ all -> 0x006c }
                goto L_0x007b
            L_0x003d:
                boolean r1 = r10 instanceof b41.C31128a.C31129a     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x0056
                b41.a$a r2 = new b41.a$a     // Catch:{ all -> 0x006c }
                r1 = r10
                b41.a$a r1 = (b41.C31128a.C31129a) r1     // Catch:{ all -> 0x006c }
                java.lang.Throwable r4 = r1.mo71342c()     // Catch:{ all -> 0x006c }
                int r5 = r10.mo71341b()     // Catch:{ all -> 0x006c }
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r2
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006c }
                goto L_0x007b
            L_0x0056:
                boolean r1 = r10 instanceof b41.C31128a.C31130b     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x0066
                b41.a$b r1 = new b41.a$b     // Catch:{ all -> 0x006c }
                int r3 = r10.mo71341b()     // Catch:{ all -> 0x006c }
                r4 = 2
                r1.<init>(r3, r2, r4, r2)     // Catch:{ all -> 0x006c }
                r2 = r1
                goto L_0x007b
            L_0x0066:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x006c }
                r1.<init>()     // Catch:{ all -> 0x006c }
                throw r1     // Catch:{ all -> 0x006c }
            L_0x006c:
                r1 = move-exception
                r3 = r1
                b41.a$a r1 = new b41.a$a
                int r4 = r10.mo71341b()
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x007b:
                r0.mo4823o(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lc0.C25940x.C25944c.mo64854a(b41.a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64854a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lc0.x$d */
    static final class C25946d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25940x f66019d;

        /* renamed from: lc0.x$d$a */
        static final class C25947a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C25940x f66020d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C25947a(C25940x xVar) {
                super(1);
                this.f66020d = xVar;
            }

            /* renamed from: a */
            public final void mo64857a(List list) {
                Object obj;
                C41536l.m120489i(list, "it");
                C25940x xVar = this.f66020d;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C41536l.m120484d(((C38050d) obj).mo91456b(), xVar.mo64849sw().mo58228i())) {
                        break;
                    }
                }
                C38050d dVar = (C38050d) obj;
                if (dVar != null) {
                    C25940x xVar2 = this.f66020d;
                    xVar2.m81541Dw(C25934s.m81517b(xVar2.f66014w, (C25168f) null, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, 0, 0, 0, dVar.mo91456b(), dVar.mo91455a(), (String) null, (Long) null, (String) null, (String) null, false, false, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 2094079, (Object) null));
                    xVar2.m81560vw(dVar.mo91456b());
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo64857a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25946d(C25940x xVar) {
            super(1);
            this.f66019d = xVar;
        }

        /* JADX WARNING: type inference failed for: r1v8, types: [b41.a$b] */
        /* JADX WARNING: type inference failed for: r2v9, types: [b41.a$c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo64856a(b41.C31128a r10) {
            /*
                r9 = this;
                java.lang.String r0 = "result"
                kotlin.jvm.internal.C41536l.m120488h(r10, r0)
                lc0.x$d$a r0 = new lc0.x$d$a
                lc0.x r1 = r9.f66019d
                r0.<init>(r1)
                r1 = 1
                r2 = 0
                b41.C31132b.m92648j(r10, r2, r0, r1, r2)
                lc0.x r0 = r9.f66019d
                androidx.lifecycle.x r0 = r0.f66006o
                lc0.x r1 = r9.f66019d
                boolean r3 = r10 instanceof b41.C31128a.C31131c     // Catch:{ all -> 0x006c }
                if (r3 == 0) goto L_0x003d
                r2 = r10
                b41.a$c r2 = (b41.C31128a.C31131c) r2     // Catch:{ all -> 0x006c }
                java.lang.Object r2 = r2.mo71340a()     // Catch:{ all -> 0x006c }
                java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x006c }
                lc0.y r3 = new lc0.y     // Catch:{ all -> 0x006c }
                lc0.s r1 = r1.f66014w     // Catch:{ all -> 0x006c }
                java.lang.String r1 = r1.mo64845v()     // Catch:{ all -> 0x006c }
                r3.<init>(r2, r1)     // Catch:{ all -> 0x006c }
                int r1 = r10.mo71341b()     // Catch:{ all -> 0x006c }
                b41.a$c r2 = new b41.a$c     // Catch:{ all -> 0x006c }
                r2.<init>(r3, r1)     // Catch:{ all -> 0x006c }
                goto L_0x007b
            L_0x003d:
                boolean r1 = r10 instanceof b41.C31128a.C31129a     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x0056
                b41.a$a r2 = new b41.a$a     // Catch:{ all -> 0x006c }
                r1 = r10
                b41.a$a r1 = (b41.C31128a.C31129a) r1     // Catch:{ all -> 0x006c }
                java.lang.Throwable r4 = r1.mo71342c()     // Catch:{ all -> 0x006c }
                int r5 = r10.mo71341b()     // Catch:{ all -> 0x006c }
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r2
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006c }
                goto L_0x007b
            L_0x0056:
                boolean r1 = r10 instanceof b41.C31128a.C31130b     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x0066
                b41.a$b r1 = new b41.a$b     // Catch:{ all -> 0x006c }
                int r3 = r10.mo71341b()     // Catch:{ all -> 0x006c }
                r4 = 2
                r1.<init>(r3, r2, r4, r2)     // Catch:{ all -> 0x006c }
                r2 = r1
                goto L_0x007b
            L_0x0066:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x006c }
                r1.<init>()     // Catch:{ all -> 0x006c }
                throw r1     // Catch:{ all -> 0x006c }
            L_0x006c:
                r1 = move-exception
                r3 = r1
                b41.a$a r1 = new b41.a$a
                int r4 = r10.mo71341b()
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x007b:
                r0.mo4823o(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lc0.C25940x.C25946d.mo64856a(b41.a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64856a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lc0.x$e */
    static final class C25948e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25940x f66021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25948e(C25940x xVar) {
            super(1);
            this.f66021d = xVar;
        }

        /* renamed from: a */
        public final void mo64858a(C31128a aVar) {
            Object obj;
            C31128a.C31129a aVar2;
            C1644x kw = this.f66021d.f66013v;
            C41536l.m120488h(aVar, "it");
            C25940x xVar = this.f66021d;
            try {
                if (aVar instanceof C31128a.C31131c) {
                    C41238w wVar = (C41238w) ((C31128a.C31131c) aVar).mo71340a();
                    obj = new C31128a.C31131c(xVar.m81557pw(), aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    aVar2 = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    obj = aVar2;
                } else if (aVar instanceof C31128a.C31130b) {
                    obj = new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar2 = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
            kw.mo4823o(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo64858a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25940x(DepositProlongationMainFragmentArgs depositProlongationMainFragmentArgs, C19223d dVar, C19224e eVar, C19220a aVar, C19226g gVar, C19221b bVar, C25167e eVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        DepositProlongationMainFragmentArgs depositProlongationMainFragmentArgs2 = depositProlongationMainFragmentArgs;
        C19223d dVar2 = dVar;
        C19224e eVar3 = eVar;
        C19220a aVar2 = aVar;
        C19226g gVar2 = gVar;
        C19221b bVar2 = bVar;
        C25167e eVar4 = eVar2;
        C41536l.m120489i(depositProlongationMainFragmentArgs2, "args");
        C41536l.m120489i(dVar2, "periodUseCase");
        C41536l.m120489i(eVar3, "withdrawalTypesUseCase");
        C41536l.m120489i(aVar2, "changeProlongationParametersUseCase");
        C41536l.m120489i(gVar2, "setProlongationInfoUseCase");
        C41536l.m120489i(bVar2, "getDepositPreContract");
        C41536l.m120489i(eVar4, "prolongationMapper");
        this.f65995d = depositProlongationMainFragmentArgs2;
        this.f65996e = dVar2;
        this.f65997f = eVar3;
        this.f65998g = aVar2;
        this.f65999h = gVar2;
        this.f66000i = bVar2;
        this.f66001j = eVar4;
        C1644x xVar = new C1644x();
        this.f66005n = xVar;
        this.f66006o = new C1644x();
        this.f66007p = new C1644x();
        this.f66008q = new C1644x();
        this.f66009r = new C1644x();
        this.f66010s = new C1644x();
        C1644x xVar2 = new C1644x();
        this.f66011t = xVar2;
        this.f66012u = new C1644x();
        this.f66013v = new C1644x();
        this.f66014w = new C25934s((C25168f) null, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, false, false, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 2097151, (DefaultConstructorMarker) null);
        xVar2.mo4823o(depositProlongationMainFragmentArgs.mo58241w());
        m81541Dw(eVar4.mo63709b(depositProlongationMainFragmentArgs2));
        m81543Fw(this.f66014w.mo64839q());
        m81542Ew(depositProlongationMainFragmentArgs.mo58230k(), depositProlongationMainFragmentArgs.mo58229j());
        m81562xw();
        xVar.mo4823o(eVar4.mo63708a(depositProlongationMainFragmentArgs2));
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m81540Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final void m81541Dw(C25934s sVar) {
        this.f66014w = sVar;
        this.f66004m.mo4823o(Boolean.valueOf(sVar.mo64846w()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public final void m81542Ew(double d, double d2) {
        this.f66010s.mo4823o(new C25931p(d - 0.25d, 0.25d, d, d2, this.f66014w.mo64828g()));
    }

    /* renamed from: Fw */
    private final void m81543Fw(double d) {
        m81541Dw(C25934s.m81517b(this.f66014w, (C25168f) null, Utils.DOUBLE_EPSILON, d, Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, false, false, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 2097147, (Object) null));
        this.f66009r.mo4823o(new C25932q(d, this.f66014w.mo64833k() - d, this.f66014w.mo64828g()));
    }

    /* renamed from: Rd */
    private final void m81544Rd() {
        C19221b bVar = this.f66000i;
        String p = this.f66014w.mo64838p();
        String s = this.f66014w.mo64841s();
        double d = this.f66014w.mo64824d();
        double d2 = this.f66014w.mo64824d();
        String g = this.f66014w.mo64828g();
        long t = C32319m.m95313t(this.f66014w.mo64842t(), this.f66014w.mo64837o());
        long t2 = this.f66014w.mo64842t();
        long o = this.f66014w.mo64837o();
        String r = this.f66014w.mo64840r();
        C19221b bVar2 = bVar;
        C40749p O = bVar2.mo47456a(p, s, d, g, t, t2, o, this.f66014w.mo64844u(), C32343x.m95388F(this.f66014w.mo64845v(), new Object[0]), d2, this.f66014w.mo64835m(), this.f66014w.mo64836n(), r, f65994y, this.f66014w.mo64834l()).mo95075O();
        C41536l.m120488h(O, "getDepositPreContract(\n …         ).toObservable()");
        bindToLifecycle(C31270e.m92876e(C32343x.m95462k1(C31270e.m92879h(O, -1)), this.f66012u));
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public final LinkedHashMap m81557pw() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C32343x.m95388F("deposit.prolong.success.deposit.details.amount", new Object[0]), C17959a.m61877a(C17959a.m61879c(this.f66014w.mo64824d(), this.f66014w.mo64828g())));
        String F = C32343x.m95388F("deposit.prolong.success.deposit.details.term", new Object[0]);
        int j = this.f66014w.mo64832j();
        String F2 = C32343x.m95388F("deposit.prolong.page.term.label.month", new Object[0]);
        linkedHashMap.put(F, j + " " + F2);
        String F3 = C32343x.m95388F("deposit.prolong.success.deposit.details.effective", new Object[0]);
        double m = this.f66014w.mo64835m();
        linkedHashMap.put(F3, m + " %");
        return linkedHashMap;
    }

    /* renamed from: qw */
    private final void m81558qw() {
        if (this.f66014w.mo64846w()) {
            C41205b F0 = C32343x.m95462k1(C31270e.m92880i(this.f65998g.mo47455a(this.f66014w.mo64824d(), this.f66014w.mo64840r(), this.f66014w.mo64828g(), this.f66014w.mo64842t(), this.f66014w.mo64837o(), this.f66014w.mo64844u()), -1)).mo94981F0(new C25937u(new C25942b(this)));
            C41536l.m120488h(F0, "private fun changeProlon…ndToLifecycle()\n        }");
            bindToLifecycle(F0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m81559rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public final void m81560vw(String str) {
        C41205b F0 = C32343x.m95462k1(C31270e.m92880i(this.f65996e.mo47458a(this.f66014w.mo64840r(), this.f66014w.mo64833k(), this.f66014w.mo64828g(), this.f66014w.mo64842t(), str), -1)).mo94981F0(new C25939w(new C25944c(this)));
        C41536l.m120488h(F0, "private fun loadDepositP…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: ww */
    public static final void m81561ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: xw */
    private final void m81562xw() {
        m81563yw();
    }

    /* renamed from: yw */
    private final void m81563yw() {
        C41205b F0 = C32343x.m95462k1(C31270e.m92880i(this.f65997f.mo47459a(this.f66014w.mo64840r(), this.f66014w.mo64833k(), this.f66014w.mo64828g(), C32319m.m95313t(this.f66014w.mo64842t(), this.f66014w.mo64837o())), -1)).mo94981F0(new C25936t(new C25946d(this)));
        C41536l.m120488h(F0, "private fun loadWithdraw…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m81564zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public void mo64847Aw(DepositPeriodModel.Deposit deposit) {
        C41536l.m120489i(deposit, "data");
        long time = C32319m.m95291K(new Date(this.f66014w.mo64842t()), deposit.mo58147d()).getTime();
        if (time < deposit.mo58146b()) {
            deposit.mo58146b();
        } else if (time > deposit.mo58145a()) {
            deposit.mo58145a();
        }
        m81541Dw(C25934s.m81517b(this.f66014w, (C25168f) null, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, time, deposit.mo58147d(), 0, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, false, false, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 2096767, (Object) null));
        m81558qw();
    }

    /* renamed from: Bq */
    public void mo64794Bq(C25168f fVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(fVar, "type");
        m81541Dw(C25934s.m81517b(this.f66014w, fVar, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, false, false, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 2097150, (Object) null));
        C1644x xVar = this.f66008q;
        boolean z3 = true;
        C25168f fVar2 = fVar;
        if (fVar2 == C25168f.INITIAL_AMOUNT) {
            z = true;
        } else {
            z = false;
        }
        if (fVar2 == C25168f.INITIAL_AMOUNT_WITH_INTEREST) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fVar2 != C25168f.LOWER_THAN_INITIAL_AMOUNT) {
            z3 = false;
        }
        xVar.mo4823o(new C25926k(z2, z3, z));
        m81558qw();
    }

    /* renamed from: Cw */
    public void mo64848Cw(String str, String str2) {
        C41536l.m120489i(str, "type");
        C41536l.m120489i(str2, "key");
        m81541Dw(C25934s.m81517b(this.f66014w, (C25168f) null, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, (String) null, (String) null, 0, 0, 0, 0, str, str2, (String) null, (Long) null, (String) null, (String) null, false, false, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON, 2094079, (Object) null));
        m81558qw();
    }

    /* renamed from: P2 */
    public LiveData mo64812P2() {
        return this.f66012u;
    }

    /* renamed from: Pr */
    public LiveData mo64813Pr() {
        return this.f66008q;
    }

    /* renamed from: T2 */
    public LiveData mo64814T2() {
        return this.f66004m;
    }

    /* renamed from: Z */
    public void mo64795Z() {
        C19226g gVar = this.f65999h;
        C19226g gVar2 = gVar;
        C41205b F0 = C32343x.m95462k1(C31270e.m92878g(C19226g.m64664b(gVar2, this.f66014w.mo64824d(), this.f66014w.mo64838p(), this.f66014w.mo64841s(), this.f66014w.mo64831i(), this.f66014w.mo64829h(), this.f66014w.mo64823c(), this.f66014w.mo64827f(), this.f66014w.mo64825e(), this.f66014w.mo64842t(), this.f66014w.mo64837o(), this.f66014w.mo64844u(), false, C11398b.f33142u, (Object) null), -1)).mo94981F0(new C25938v(new C25948e(this)));
        C41536l.m120488h(F0, "override fun onPreContra…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: Z4 */
    public LiveData mo64815Z4() {
        return this.f66011t;
    }

    /* renamed from: db */
    public LiveData mo64816db() {
        return this.f66007p;
    }

    /* renamed from: fe */
    public LiveData mo64817fe() {
        return this.f66005n;
    }

    /* renamed from: ga */
    public LiveData mo64818ga() {
        return this.f66013v;
    }

    /* renamed from: od */
    public LiveData mo64819od() {
        return this.f66010s;
    }

    /* renamed from: on */
    public LiveData mo64820on() {
        return this.f66009r;
    }

    /* renamed from: s2 */
    public void mo64796s2() {
        m81544Rd();
    }

    /* renamed from: sw */
    public final DepositProlongationMainFragmentArgs mo64849sw() {
        return this.f65995d;
    }

    /* renamed from: tw */
    public final C25930o mo64850tw() {
        return this.f66002k;
    }

    /* renamed from: uw */
    public final C25933r mo64851uw() {
        return this.f66003l;
    }

    /* renamed from: z1 */
    public LiveData mo64821z1() {
        return this.f66006o;
    }

    /* renamed from: z3 */
    public void mo64797z3(double d) {
        m81543Fw(d);
        m81558qw();
    }
}
