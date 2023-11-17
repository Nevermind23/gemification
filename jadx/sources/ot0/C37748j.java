package ot0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import at0.C31065b;
import b41.C31128a;
import c41.C31270e;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import j51.C36735g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kt0.C36990a;
import m41.C37224b;
import m51.C37228a;
import mt0.C37261e;
import mt0.C37264h;
import ot0.C37728a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.SelectorChipData;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import xs0.C39844b;
import xs0.C39845b0;
import xs0.C39857g;
import xs0.C39868l;
import xs0.C39874n;
import zs0.C40249b;

/* renamed from: ot0.j */
public final class C37748j extends C21481a implements C37734c, C37736d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39845b0 f90650d;

    /* renamed from: e */
    private final C39868l f90651e;

    /* renamed from: f */
    private final C39874n f90652f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C36735g f90653g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C39844b f90654h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C39857g f90655i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C36990a f90656j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C37264h f90657k;

    /* renamed from: l */
    private final C37734c f90658l = this;

    /* renamed from: m */
    private final C37736d f90659m = this;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f90660n = new C1644x();

    /* renamed from: o */
    private final C1644x f90661o = new C1644x();

    /* renamed from: p */
    private final C1644x f90662p = new C1644x();

    /* renamed from: q */
    private final C1644x f90663q = new C1644x();

    /* renamed from: r */
    private final C1644x f90664r = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C40767b f90665s;

    /* renamed from: t */
    private final C40767b f90666t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C40767b f90667u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C40767b f90668v;

    /* renamed from: w */
    private final C40767b f90669w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public CasDetailsUiModel f90670x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C37261e f90671y;

    /* renamed from: ot0.j$a */
    static final class C37749a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C37749a f90672d = new C37749a();

        C37749a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return 6;
        }
    }

    /* renamed from: ot0.j$b */
    static final class C37750b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37748j f90673d;

        /* renamed from: e */
        final /* synthetic */ C37728a f90674e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37750b(C37748j jVar, C37728a aVar) {
            super(1);
            this.f90673d = jVar;
            this.f90674e = aVar;
        }

        /* renamed from: a */
        public final void mo91008a(Integer num) {
            if (num == null || num.intValue() != 6 || this.f90673d.f90671y == null) {
                this.f90673d.f90668v.onNext(num);
                return;
            }
            C40767b rw = this.f90673d.f90667u;
            C37728a aVar = this.f90674e;
            C41536l.m120488h(num, "it");
            rw.onNext(new C37751c(aVar, num.intValue()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91008a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ot0.j$c */
    private static final class C37751c {

        /* renamed from: a */
        private final C37728a f90675a;

        /* renamed from: b */
        private final int f90676b;

        public C37751c(C37728a aVar, int i) {
            C41536l.m120489i(aVar, "data");
            this.f90675a = aVar;
            this.f90676b = i;
        }

        /* renamed from: a */
        public final C37728a mo91009a() {
            return this.f90675a;
        }

        /* renamed from: b */
        public final int mo91010b() {
            return this.f90676b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37751c)) {
                return false;
            }
            C37751c cVar = (C37751c) obj;
            return C41536l.m120484d(this.f90675a, cVar.f90675a) && this.f90676b == cVar.f90676b;
        }

        public int hashCode() {
            return (this.f90675a.hashCode() * 31) + this.f90676b;
        }

        public String toString() {
            C37728a aVar = this.f90675a;
            int i = this.f90676b;
            return "CasSubjectData(data=" + aVar + ", requestCode=" + i + ")";
        }
    }

    /* renamed from: ot0.j$d */
    private static final class C37752d {

        /* renamed from: a */
        private final double f90677a;

        /* renamed from: b */
        private final List f90678b;

        public C37752d(double d, List list) {
            C41536l.m120489i(list, "accountKeys");
            this.f90677a = d;
            this.f90678b = list;
        }

        /* renamed from: a */
        public final String mo91014a() {
            List<Number> list = this.f90678b;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            for (Number longValue : list) {
                arrayList.add(Long.valueOf(longValue.longValue()));
            }
            return C41358y.m120017g0(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null);
        }

        /* renamed from: b */
        public final double mo91015b() {
            return this.f90677a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37752d)) {
                return false;
            }
            C37752d dVar = (C37752d) obj;
            return Double.compare(this.f90677a, dVar.f90677a) == 0 && C41536l.m120484d(this.f90678b, dVar.f90678b);
        }

        public int hashCode() {
            return (Double.doubleToLongBits(this.f90677a) * 31) + this.f90678b.hashCode();
        }

        public String toString() {
            double d = this.f90677a;
            List list = this.f90678b;
            return "EditCasData(amount=" + d + ", accountKeys=" + list + ")";
        }
    }

    /* renamed from: ot0.j$e */
    static final class C37753e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37748j f90679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37753e(C37748j jVar) {
            super(1);
            this.f90679d = jVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C39844b lw = this.f90679d.f90654h;
            CasDetailsUiModel mw = this.f90679d.f90670x;
            if (mw == null) {
                C41536l.m120506z("details");
                mw = null;
            }
            C40749p f = lw.mo93555b(mw.mo75128f()).mo94897f(C40749p.m118043h0(C41238w.f97225a));
            C41536l.m120488h(f, "closeMoneyBox(details.id…en(Observable.just(Unit))");
            return C31270e.m92879h(f, -1);
        }
    }

    /* renamed from: ot0.j$f */
    static final class C37754f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37748j f90680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37754f(C37748j jVar) {
            super(1);
            this.f90680d = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m110975c(C37748j jVar) {
            C41536l.m120489i(jVar, "this$0");
            jVar.f90665s.onNext(C41238w.f97225a);
        }

        /* renamed from: b */
        public final C40754t invoke(C37752d dVar) {
            Long l;
            C41536l.m120489i(dVar, "it");
            C39857g nw = this.f90680d.f90655i;
            C37228a a = this.f90680d.f90653g.mo89562a();
            CasDetailsUiModel casDetailsUiModel = null;
            if (a != null) {
                l = Long.valueOf(a.mo90305b());
            } else {
                l = null;
            }
            C41536l.m120486f(l);
            long longValue = l.longValue();
            CasDetailsUiModel mw = this.f90680d.f90670x;
            if (mw == null) {
                C41536l.m120506z("details");
                mw = null;
            }
            String valueOf = String.valueOf(mw.mo75128f());
            double b = dVar.mo91015b();
            CasDetailsUiModel mw2 = this.f90680d.f90670x;
            if (mw2 == null) {
                C41536l.m120506z("details");
            } else {
                casDetailsUiModel = mw2;
            }
            C40734b o = nw.mo93563b(longValue, valueOf, b, casDetailsUiModel.mo75133j(), dVar.mo91014a()).mo94902o(new C37762k(this.f90680d));
            C41536l.m120488h(o, "editCasAgreement(\n      …t(Unit)\n                }");
            return C31270e.m92878g(o, -1);
        }
    }

    /* renamed from: ot0.j$g */
    static final class C37755g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37748j f90681d;

        /* renamed from: ot0.j$g$a */
        /* synthetic */ class C37756a extends C41535k implements C43075l {
            C37756a(Object obj) {
                super(1, obj, C36990a.class, "transform", "transform(Lge/bog/mobilebank/loyaltyandbonusprograms/domain/model/cas/CasDetails;)Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/CasDetailsUiModel;", 0);
            }

            /* renamed from: b */
            public final CasDetailsUiModel invoke(C40249b bVar) {
                C41536l.m120489i(bVar, "p0");
                return ((C36990a) this.receiver).mo89932h(bVar);
            }
        }

        /* renamed from: ot0.j$g$b */
        static final class C37757b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C37748j f90682d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37757b(C37748j jVar) {
                super(1);
                this.f90682d = jVar;
            }

            /* renamed from: a */
            public final void mo91023a(CasDetailsUiModel casDetailsUiModel) {
                C37748j jVar = this.f90682d;
                C41536l.m120488h(casDetailsUiModel, "it");
                jVar.f90670x = casDetailsUiModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo91023a((CasDetailsUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37755g(C37748j jVar) {
            super(1);
            this.f90681d = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final CasDetailsUiModel m110979d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (CasDetailsUiModel) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m110980e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C37751c cVar) {
            C41536l.m120489i(cVar, "req");
            int b = cVar.mo91010b();
            C40749p O = this.f90681d.m110953yw(cVar.mo91009a(), C41341q.m119910m(153, 6).contains(Integer.valueOf(b))).mo95062A(new C37764l(new C37756a(this.f90681d.f90656j))).mo95084m(new C37766m(new C37757b(this.f90681d))).mo95075O();
            C41536l.m120488h(O, "private fun subscribeToP…ndToLifecycle()\n        }");
            if (b == 153) {
                b = 1;
            }
            return C31270e.m92879h(O, b);
        }
    }

    /* renamed from: ot0.j$h */
    static final class C37758h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37748j f90683d;

        /* renamed from: e */
        final /* synthetic */ C37728a f90684e;

        /* renamed from: ot0.j$h$a */
        static final class C37759a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C37748j f90685d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C37759a(C37748j jVar) {
                super(2);
                this.f90685d = jVar;
            }

            /* renamed from: a */
            public final C37261e invoke(C40249b bVar, C31065b bVar2) {
                C41536l.m120489i(bVar, "det");
                C41536l.m120489i(bVar2, "res");
                C37748j jVar = this.f90685d;
                jVar.f90671y = jVar.f90657k.mo90381c(bVar2, false);
                C37748j jVar2 = this.f90685d;
                jVar2.f90670x = jVar2.f90656j.mo89932h(bVar);
                C37261e uw = this.f90685d.f90671y;
                if (uw != null) {
                    return uw;
                }
                C41536l.m120506z("resources");
                return null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37758h(C37748j jVar, C37728a aVar) {
            super(1);
            this.f90683d = jVar;
            this.f90684e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C37261e m110985c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C37261e) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C37728a aVar;
            C41536l.m120489i(num, "it");
            C37748j jVar = this.f90683d;
            if (jVar.f90670x != null) {
                CasDetailsUiModel mw = this.f90683d.f90670x;
                if (mw == null) {
                    C41536l.m120506z("details");
                    mw = null;
                }
                aVar = new C37728a.C37729a(mw.mo75128f());
            } else {
                aVar = this.f90684e;
            }
            C40749p O = C40762x.m118154T(C37748j.m110954zw(jVar, aVar, false, 2, (Object) null), this.f90683d.f90650d.mo93556b(), new C37768n(new C37759a(this.f90683d))).mo95075O();
            C41536l.m120488h(O, "private fun subscribeToP…ndToLifecycle()\n        }");
            return C31270e.m92879h(O, 1);
        }
    }

    /* renamed from: ot0.j$i */
    static final class C37760i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37748j f90686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37760i(C37748j jVar) {
            super(1);
            this.f90686d = jVar;
        }

        /* JADX WARNING: type inference failed for: r2v3, types: [b41.a$b] */
        /* JADX WARNING: type inference failed for: r2v9, types: [b41.a$c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo91026a(b41.C31128a r11) {
            /*
                r10 = this;
                ot0.j r0 = r10.f90686d
                androidx.lifecycle.x r0 = r0.f90660n
                java.lang.String r1 = "result"
                kotlin.jvm.internal.C41536l.m120488h(r11, r1)
                ot0.j r1 = r10.f90686d
                boolean r2 = r11 instanceof b41.C31128a.C31131c     // Catch:{ all -> 0x0060 }
                r3 = 0
                if (r2 == 0) goto L_0x0032
                r2 = r11
                b41.a$c r2 = (b41.C31128a.C31131c) r2     // Catch:{ all -> 0x0060 }
                java.lang.Object r2 = r2.mo71340a()     // Catch:{ all -> 0x0060 }
                mt0.e r2 = (mt0.C37261e) r2     // Catch:{ all -> 0x0060 }
                ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel r1 = r1.f90670x     // Catch:{ all -> 0x0060 }
                if (r1 != 0) goto L_0x0027
                java.lang.String r1 = "details"
                kotlin.jvm.internal.C41536l.m120506z(r1)     // Catch:{ all -> 0x0060 }
                goto L_0x0028
            L_0x0027:
                r3 = r1
            L_0x0028:
                int r1 = r11.mo71341b()     // Catch:{ all -> 0x0060 }
                b41.a$c r2 = new b41.a$c     // Catch:{ all -> 0x0060 }
                r2.<init>(r3, r1)     // Catch:{ all -> 0x0060 }
                goto L_0x006f
            L_0x0032:
                boolean r1 = r11 instanceof b41.C31128a.C31129a     // Catch:{ all -> 0x0060 }
                if (r1 == 0) goto L_0x004b
                b41.a$a r2 = new b41.a$a     // Catch:{ all -> 0x0060 }
                r1 = r11
                b41.a$a r1 = (b41.C31128a.C31129a) r1     // Catch:{ all -> 0x0060 }
                java.lang.Throwable r5 = r1.mo71342c()     // Catch:{ all -> 0x0060 }
                int r6 = r11.mo71341b()     // Catch:{ all -> 0x0060 }
                r7 = 0
                r8 = 4
                r9 = 0
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0060 }
                goto L_0x006f
            L_0x004b:
                boolean r1 = r11 instanceof b41.C31128a.C31130b     // Catch:{ all -> 0x0060 }
                if (r1 == 0) goto L_0x005a
                b41.a$b r2 = new b41.a$b     // Catch:{ all -> 0x0060 }
                int r1 = r11.mo71341b()     // Catch:{ all -> 0x0060 }
                r4 = 2
                r2.<init>(r1, r3, r4, r3)     // Catch:{ all -> 0x0060 }
                goto L_0x006f
            L_0x005a:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0060 }
                r1.<init>()     // Catch:{ all -> 0x0060 }
                throw r1     // Catch:{ all -> 0x0060 }
            L_0x0060:
                r1 = move-exception
                r3 = r1
                b41.a$a r1 = new b41.a$a
                int r4 = r11.mo71341b()
                r5 = 0
                r6 = 4
                r7 = 0
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x006f:
                r0.mo4823o(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ot0.C37748j.C37760i.mo91026a(b41.a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91026a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37748j(C39845b0 b0Var, C39868l lVar, C39874n nVar, C36735g gVar, C39844b bVar, C39857g gVar2, C36990a aVar, C37264h hVar, C37728a aVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(b0Var, "getPiggyBankResources");
        C41536l.m120489i(lVar, "getCasDetailsByDepositKey");
        C41536l.m120489i(nVar, "getCasDetailsByCasService");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(bVar, "closeMoneyBox");
        C41536l.m120489i(gVar2, "editCasAgreement");
        C41536l.m120489i(aVar, "casMapper");
        C41536l.m120489i(hVar, "mapper");
        C41536l.m120489i(aVar2, "casData");
        this.f90650d = b0Var;
        this.f90651e = lVar;
        this.f90652f = nVar;
        this.f90653g = gVar;
        this.f90654h = bVar;
        this.f90655i = gVar2;
        this.f90656j = aVar;
        this.f90657k = hVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f90665s = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f90666t = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<CasSubjectData>()");
        this.f90667u = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<Int>()");
        this.f90668v = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<EditCasData>()");
        this.f90669w = h15;
        C40749p m0 = C40749p.m118049m0(onInit(), onRefresh(), h1.mo95026k0(new C37746i(C37749a.f90672d)));
        C41536l.m120488h(m0, "merge(onInit(), onRefres…Reload.map { RC_RELOAD })");
        bindToLifecycle(C32343x.m95487t(m0, (C43064a) null, (C43075l) null, new C37750b(this, aVar2), 3, (Object) null));
        m110928Gw();
        m110930Iw(aVar2);
        m110924Cw();
        m110926Ew();
    }

    /* renamed from: Cw */
    private final void m110924Cw() {
        C40749p L0 = this.f90666t.mo94989L0(new C37744h(new C37753e(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f90663q));
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final C40754t m110925Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Ew */
    private final void m110926Ew() {
        C40749p L0 = this.f90669w.mo94989L0(new C37742g(new C37754f(this)));
        C41536l.m120488h(L0, "private fun subscribeToE…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f90664r));
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public static final C40754t m110927Fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Gw */
    private final void m110928Gw() {
        C40749p L0 = this.f90667u.mo94989L0(new C37738e(new C37755g(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f90660n));
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final C40754t m110929Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Iw */
    private final void m110930Iw(C37728a aVar) {
        C40749p L0 = this.f90668v.mo94989L0(new C37740f(new C37758h(this, aVar)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C32343x.m95487t(L0, (C43064a) null, (C43075l) null, new C37760i(this), 3, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final C40754t m110931Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final Integer m110937iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public final C40762x m110953yw(C37728a aVar, boolean z) {
        if (aVar instanceof C37728a.C37730b) {
            return this.f90651e.mo93571c(((C37728a.C37730b) aVar).mo90991b(), z);
        }
        return this.f90652f.mo93576b(aVar.mo90987a(), z);
    }

    /* renamed from: zw */
    static /* synthetic */ C40762x m110954zw(C37748j jVar, C37728a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return jVar.m110953yw(aVar, z);
    }

    /* renamed from: Aw */
    public final C37734c mo91005Aw() {
        return this.f90658l;
    }

    /* renamed from: Bw */
    public final C37736d mo91006Bw() {
        return this.f90659m;
    }

    /* renamed from: I0 */
    public void mo90995I0(List list) {
        C41536l.m120489i(list, "selectedAccounts");
        C40767b bVar = this.f90669w;
        CasDetailsUiModel casDetailsUiModel = this.f90670x;
        if (casDetailsUiModel == null) {
            C41536l.m120506z("details");
            casDetailsUiModel = null;
        }
        double l = casDetailsUiModel.mo75135l();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((PiggyBankAccountUiModel) it.next()).mo75157a().mo75002a()));
        }
        bVar.onNext(new C37752d(l, arrayList));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: L2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90996L2() {
        /*
            r13 = this;
            mt0.e r0 = r13.f90671y
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "resources"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel r0 = r0.mo90362c()
            java.util.List r0 = r0.mo75182a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = ie1.C41343r.m119925u(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x009c
            java.lang.Object r3 = r0.next()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r3 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel) r3
            java.lang.String r5 = r3.mo75011j()
            if (r5 == 0) goto L_0x003f
            ge.bog.mobilebank.shared.helper.ImageSource$Url r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Url
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0056
        L_0x003f:
            java.lang.Integer r4 = r3.mo75006e()
            if (r4 == 0) goto L_0x004f
            int r4 = r4.intValue()
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            r10.<init>(r4)
            goto L_0x0056
        L_0x004f:
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            int r4 = rs0.C38335b.f91849a
            r10.<init>(r4)
        L_0x0056:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel r4 = r13.f90670x
            if (r4 != 0) goto L_0x0060
            java.lang.String r4 = "details"
            kotlin.jvm.internal.C41536l.m120506z(r4)
            r4 = r1
        L_0x0060:
            java.util.List r4 = r4.mo75122a()
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 0
            if (r5 == 0) goto L_0x0070
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0070
            goto L_0x0093
        L_0x0070:
            java.util.Iterator r4 = r4.iterator()
        L_0x0074:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0093
            java.lang.Object r5 = r4.next()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r5 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel) r5
            long r7 = r5.mo75002a()
            long r11 = r3.mo75002a()
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r7 = 1
            if (r5 != 0) goto L_0x008f
            r5 = r7
            goto L_0x0090
        L_0x008f:
            r5 = r6
        L_0x0090:
            if (r5 == 0) goto L_0x0074
            r6 = r7
        L_0x0093:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel r4 = new ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel
            r4.<init>(r3, r10, r6)
            r2.add(r4)
            goto L_0x0022
        L_0x009c:
            androidx.lifecycle.x r0 = r13.f90662p
            m41.C37224b.m109965d(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ot0.C37748j.mo90996L2():void");
    }

    /* renamed from: W */
    public void mo90997W(int i) {
        C37261e eVar = this.f90671y;
        CasDetailsUiModel casDetailsUiModel = null;
        if (eVar == null) {
            C41536l.m120506z("resources");
            eVar = null;
        }
        MoneyBoxTariffUiModel moneyBoxTariffUiModel = (MoneyBoxTariffUiModel) C41358y.m120010Z(eVar.mo90362c().mo75183b(), i);
        if (moneyBoxTariffUiModel != null) {
            C40767b bVar = this.f90669w;
            double e = moneyBoxTariffUiModel.mo75113e();
            CasDetailsUiModel casDetailsUiModel2 = this.f90670x;
            if (casDetailsUiModel2 == null) {
                C41536l.m120506z("details");
            } else {
                casDetailsUiModel = casDetailsUiModel2;
            }
            List<CasAccountUiModel> a = casDetailsUiModel.mo75122a();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
            for (CasAccountUiModel a2 : a) {
                arrayList.add(Long.valueOf(a2.mo75002a()));
            }
            bVar.onNext(new C37752d(e, arrayList));
        }
    }

    /* renamed from: Yl */
    public void mo90998Yl() {
        this.f90666t.onNext(C41238w.f97225a);
    }

    /* renamed from: b1 */
    public void mo90999b1() {
        boolean z;
        C37261e eVar = this.f90671y;
        if (eVar == null) {
            C41536l.m120506z("resources");
            eVar = null;
        }
        List<MoneyBoxTariffUiModel> b = eVar.mo90362c().mo75183b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (MoneyBoxTariffUiModel moneyBoxTariffUiModel : b) {
            CasDetailsUiModel casDetailsUiModel = this.f90670x;
            if (casDetailsUiModel == null) {
                C41536l.m120506z("details");
                casDetailsUiModel = null;
            }
            String b2 = moneyBoxTariffUiModel.mo75110b(casDetailsUiModel.mo75133j());
            C41536l.m120488h(b2, "it.getFormattedAmount(details.schemeTariffCcy)");
            long d = moneyBoxTariffUiModel.mo75111d();
            CasDetailsUiModel casDetailsUiModel2 = this.f90670x;
            if (casDetailsUiModel2 == null) {
                C41536l.m120506z("details");
                casDetailsUiModel2 = null;
            }
            if (d == casDetailsUiModel2.mo75134k()) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new SelectorChipData(b2, z));
        }
        C37224b.m109965d(this.f90661o, arrayList);
    }

    /* renamed from: cu */
    public LiveData mo91000cu() {
        return this.f90661o;
    }

    /* renamed from: km */
    public LiveData mo91001km() {
        return this.f90664r;
    }

    /* renamed from: l6 */
    public LiveData mo91002l6() {
        return this.f90663q;
    }

    /* renamed from: p4 */
    public LiveData mo91003p4() {
        return this.f90662p;
    }

    /* renamed from: ze */
    public LiveData mo91004ze() {
        return this.f90660n;
    }
}
