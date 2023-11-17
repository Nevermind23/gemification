package p341ge.bog.mobilebank.bnpl.presentation.details;

import a41.C30483b;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41233s;
import he1.C41238w;
import ie1.C41324h0;
import j70.C25352k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import md0.C26186e;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13838d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RetrofitClient;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import p578ql.C17534g;
import p578ql.C17535h;
import p578ql.C17536i;
import p606sl.C17837c;
import p606sl.C17838d;
import p606sl.C17843i;
import p606sl.C17847m;
import p606sl.C17850p;
import p659wl.C18624n;
import p659wl.C18625o;
import p659wl.C18626p;
import p659wl.C18627q;
import p659wl.C18628r;
import p659wl.C18629s;
import p659wl.C18630t;
import p659wl.C18631u;
import p659wl.C18632v;
import p659wl.C18633w;
import p659wl.C18634x;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f */
public final class C13851f extends C21481a implements C18625o, C18624n {

    /* renamed from: B */
    public static final C13852a f41139B = new C13852a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C40767b f41140A;

    /* renamed from: d */
    private final C25352k f41141d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C17535h f41142e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C17536i f41143f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C17534g f41144g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C13849e f41145h;

    /* renamed from: i */
    private final TargetEnvironment f41146i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final long f41147j;

    /* renamed from: k */
    private final C18625o f41148k = this;

    /* renamed from: l */
    private final C18624n f41149l = this;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1644x f41150m = new C1644x();

    /* renamed from: n */
    private final C1644x f41151n = new C1644x();

    /* renamed from: o */
    private final C1644x f41152o = new C1644x();

    /* renamed from: p */
    private final C1644x f41153p = new C1644x();

    /* renamed from: q */
    private final C1644x f41154q = new C1644x();

    /* renamed from: r */
    private final C1644x f41155r = new C1644x();

    /* renamed from: s */
    private final C1644x f41156s = new C1644x();

    /* renamed from: t */
    private final C1644x f41157t = new C1644x();

    /* renamed from: u */
    private final C1644x f41158u = new C1644x();

    /* renamed from: v */
    private final C1644x f41159v = new C1644x();

    /* renamed from: w */
    private final C40767b f41160w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f41161x;

    /* renamed from: y */
    private final LiveData f41162y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C17847m f41163z;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$a */
    public static final class C13852a {
        private C13852a() {
        }

        public /* synthetic */ C13852a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$b */
    public interface C13853b {
        /* renamed from: a */
        C13851f mo32543a(long j);
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$c */
    static final class C13854c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13854c f41164d = new C13854c();

        C13854c() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C13877l lVar) {
            C41536l.m120488h(lVar, "it");
            return C13869h.m51688b(lVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$d */
    static final class C13855d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13855d f41165d = new C13855d();

        C13855d() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return 6;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$e */
    static final class C13856e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13851f f41166d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13856e(C13851f fVar) {
            super(1);
            this.f41166d = fVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            boolean z;
            C41536l.m120489i(num, "it");
            C17535h nw = this.f41166d.f41142e;
            if (num.intValue() == 6) {
                z = true;
            } else {
                z = false;
            }
            return C26186e.m81987e(nw.mo45052a(z));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$f */
    static final class C13857f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13851f f41167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13857f(C13851f fVar) {
            super(1);
            this.f41167d = fVar;
        }

        /* renamed from: a */
        public final void mo38254a(C41205b bVar) {
            this.f41167d.f41150m.mo4823o(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38254a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$g */
    static final class C13858g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13851f f41168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13858g(C13851f fVar) {
            super(1);
            this.f41168d = fVar;
        }

        /* renamed from: a */
        public final void mo38255a(C17847m mVar) {
            Object obj;
            Integer num;
            DefaultConstructorMarker defaultConstructorMarker;
            long j;
            int i;
            boolean z;
            C17847m mVar2 = mVar;
            C13851f fVar = this.f41168d;
            C41536l.m120488h(mVar2, "bnplObj");
            fVar.f41163z = mVar2;
            C1644x tw = this.f41168d.f41161x;
            C13851f fVar2 = this.f41168d;
            C13877l lVar = (C13877l) tw.mo4814f();
            C13849e qw = fVar2.f41145h;
            C17847m mw = fVar2.f41163z;
            C13877l lVar2 = null;
            if (mw == null) {
                C41536l.m120506z("bnplObject");
                mw = null;
            }
            List c = qw.mo38214c(mw);
            Iterator it = C41358y.m119995F0(c).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long a = ((C30483b) ((C41324h0) obj).mo95946d()).mo70820a();
                Long sw = fVar2.m51603Jw();
                if (sw != null && a == sw.longValue()) {
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
            C41324h0 h0Var = (C41324h0) obj;
            if (h0Var != null) {
                num = Integer.valueOf(h0Var.mo95945c());
            } else {
                num = null;
            }
            if (lVar != null) {
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                C13838d.C13842d dVar = new C13838d.C13842d(c, i);
                defaultConstructorMarker = null;
                lVar2 = C13877l.m51703b(lVar, dVar, (C13838d.C13841c) null, (C13838d.C13839a) null, 0, (Boolean) null, (Boolean) null, (List) null, (C13838d.C13848j) null, 254, (Object) null);
            } else {
                defaultConstructorMarker = null;
            }
            tw.mo4826r(lVar2);
            this.f41168d.f41150m.mo4823o(new C31128a.C31131c(C41238w.f97225a, 0, 2, defaultConstructorMarker));
            C13851f fVar3 = this.f41168d;
            Long sw2 = fVar3.m51603Jw();
            if (sw2 != null) {
                j = sw2.longValue();
            } else {
                j = this.f41168d.f41147j;
            }
            fVar3.m51604Lw(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38255a((C17847m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$h */
    static final class C13859h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13851f f41169d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13859h(C13851f fVar) {
            super(1);
            this.f41169d = fVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C1644x uw = this.f41169d.f41150m;
            C41536l.m120488h(th, "it");
            uw.mo4823o(new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$i */
    static final class C13860i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13851f f41170d;

        /* renamed from: e */
        final /* synthetic */ long f41171e;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$i$a */
        static final class C13861a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C13861a f41172d = new C13861a();

            C13861a() {
                super(1);
            }

            /* renamed from: a */
            public final C31128a invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                return new C31128a.C31129a(th, 0, (Object) null, 6, (DefaultConstructorMarker) null);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13860i(C13851f fVar, long j) {
            super(1);
            this.f41170d = fVar;
            this.f41171e = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C31128a m51679c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C31128a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "newName");
            return this.f41170d.f41143f.mo45053a(this.f41171e, str).mo94893M(new C31128a.C31131c(C41238w.f97225a, 0, 2, (DefaultConstructorMarker) null)).mo95075O().mo94977D0(new C31128a.C31130b(0, (Object) null, 3, (DefaultConstructorMarker) null)).mo95035t0(new C13868g(C13861a.f41172d));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$j */
    static final class C13862j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13851f f41173d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13862j(C13851f fVar) {
            super(1);
            this.f41173d = fVar;
        }

        /* renamed from: a */
        public final void mo38259a(C31128a aVar) {
            this.f41173d.onRefresh(6);
            this.f41173d.mo38235X4().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38259a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$k */
    static final class C13863k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13851f f41174d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13863k(C13851f fVar) {
            super(1);
            this.f41174d = fVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Long l) {
            C41536l.m120489i(l, "it");
            return C31270e.m92880i(this.f41174d.f41144g.mo45051a(l.longValue()), 1);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$l */
    static final class C13864l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13851f f41175d;

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$l$a */
        static final class C13865a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f41176d;

            /* renamed from: e */
            final /* synthetic */ C13877l f41177e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13865a(C1644x xVar, C13877l lVar) {
                super(1);
                this.f41176d = xVar;
                this.f41177e = lVar;
            }

            /* renamed from: a */
            public final void mo38262a(C17850p pVar) {
                C13877l lVar;
                C1644x xVar = this.f41176d;
                C13877l lVar2 = this.f41177e;
                if (lVar2 != null) {
                    lVar = C13877l.m51703b(lVar2, (C13838d.C13842d) null, (C13838d.C13841c) null, (C13838d.C13839a) null, 0, Boolean.TRUE, Boolean.FALSE, (List) null, (C13838d.C13848j) null, 207, (Object) null);
                } else {
                    lVar = null;
                }
                xVar.mo4826r(lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo38262a((C17850p) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$l$b */
        static final class C13866b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f41178d;

            /* renamed from: e */
            final /* synthetic */ C13877l f41179e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13866b(C1644x xVar, C13877l lVar) {
                super(1);
                this.f41178d = xVar;
                this.f41179e = lVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                C1644x xVar = this.f41178d;
                C13877l lVar = this.f41179e;
                xVar.mo4826r(lVar != null ? C13877l.m51703b(lVar, (C13838d.C13842d) null, (C13838d.C13841c) null, (C13838d.C13839a) null, 0, Boolean.FALSE, Boolean.TRUE, (List) null, (C13838d.C13848j) null, 207, (Object) null) : null);
            }
        }

        /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.f$l$c */
        static final class C13867c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C1644x f41180d;

            /* renamed from: e */
            final /* synthetic */ C13877l f41181e;

            /* renamed from: f */
            final /* synthetic */ C13851f f41182f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13867c(C1644x xVar, C13877l lVar, C13851f fVar) {
                super(1);
                this.f41180d = xVar;
                this.f41181e = lVar;
                this.f41182f = fVar;
            }

            /* renamed from: a */
            public final void mo38264a(C17850p pVar) {
                C13877l lVar;
                C41536l.m120489i(pVar, "scheduleHistoryItem");
                C1644x xVar = this.f41180d;
                C13877l lVar2 = this.f41181e;
                if (lVar2 != null) {
                    List d = this.f41182f.f41145h.mo38215d(pVar);
                    Boolean bool = Boolean.FALSE;
                    lVar = C13877l.m51703b(lVar2, (C13838d.C13842d) null, (C13838d.C13841c) null, (C13838d.C13839a) null, 0, bool, bool, d, (C13838d.C13848j) null, 143, (Object) null);
                } else {
                    lVar = null;
                }
                xVar.mo4826r(lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo38264a((C17850p) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13864l(C13851f fVar) {
            super(1);
            this.f41175d = fVar;
        }

        /* renamed from: a */
        public final void mo38261a(C31128a aVar) {
            C1644x tw = this.f41175d.f41161x;
            C13851f fVar = this.f41175d;
            C13877l lVar = (C13877l) tw.mo4814f();
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C13865a(tw, lVar), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C13866b(tw, lVar), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C13867c(tw, lVar, fVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38261a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13851f(C25352k kVar, C17535h hVar, C17536i iVar, C17534g gVar, C13849e eVar, TargetEnvironment targetEnvironment, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C25352k kVar2 = kVar;
        C17535h hVar2 = hVar;
        C17536i iVar2 = iVar;
        C17534g gVar2 = gVar;
        C13849e eVar2 = eVar;
        TargetEnvironment targetEnvironment2 = targetEnvironment;
        C41536l.m120489i(kVar2, "reloadProductsUseCase");
        C41536l.m120489i(hVar2, "getBnplListUseCase");
        C41536l.m120489i(iVar2, "renameBnplUseCase");
        C41536l.m120489i(gVar2, "getBnplScheduleAndHistoryUseCase");
        C41536l.m120489i(eVar2, "mapper");
        C41536l.m120489i(targetEnvironment2, "environment");
        this.f41141d = kVar2;
        this.f41142e = hVar2;
        this.f41143f = iVar2;
        this.f41144g = gVar2;
        this.f41145h = eVar2;
        this.f41146i = targetEnvironment2;
        this.f41147j = j;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Long>()");
        this.f41160w = h1;
        C1644x xVar = new C1644x(new C13877l((C13838d.C13842d) null, (C13838d.C13841c) null, (C13838d.C13839a) null, j, (Boolean) null, (Boolean) null, (List) null, (C13838d.C13848j) null, 247, (DefaultConstructorMarker) null));
        this.f41161x = xVar;
        this.f41162y = C1607m0.m5655c(xVar, C13854c.f41164d);
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f41140A = h12;
        m51605Mw();
        m51611Sw();
        m51614Vw();
    }

    /* renamed from: Gw */
    private final String m51601Gw(Long l, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("loanKey", String.valueOf(l));
        String urlWithExtras = RetrofitClient.getUrlWithExtras(str, hashMap);
        C41536l.m120488h(urlWithExtras, "getUrlWithExtras(serviceId, params)");
        return urlWithExtras;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: sl.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: sl.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: sl.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: sl.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Iw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p606sl.C17843i m51602Iw() {
        /*
            r7 = this;
            sl.m r0 = r7.f41163z
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "bnplObject"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            java.util.List r0 = r0.mo45506b()
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r0.next()
            r3 = r2
            sl.i r3 = (p606sl.C17843i) r3
            long r3 = r3.mo45476c()
            java.lang.Long r5 = r7.m51603Jw()
            if (r5 != 0) goto L_0x002b
            goto L_0x0035
        L_0x002b:
            long r5 = r5.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0035
            r3 = 1
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            if (r3 == 0) goto L_0x0013
            r1 = r2
        L_0x0039:
            sl.i r1 = (p606sl.C17843i) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.bnpl.presentation.details.C13851f.m51602Iw():sl.i");
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public final Long m51603Jw() {
        C13877l lVar = (C13877l) this.f41161x.mo4814f();
        if (lVar != null) {
            return Long.valueOf(lVar.mo38277i());
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: ge.bog.mobilebank.bnpl.presentation.details.d$j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Lw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m51604Lw(long r19) {
        /*
            r18 = this;
            r0 = r18
            androidx.lifecycle.x r1 = r0.f41161x
            java.lang.Object r2 = r1.mo4814f()
            r3 = r2
            ge.bog.mobilebank.bnpl.presentation.details.l r3 = (p341ge.bog.mobilebank.bnpl.presentation.details.C13877l) r3
            r2 = 0
            if (r3 == 0) goto L_0x001f
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 247(0xf7, float:3.46E-43)
            r14 = 0
            r7 = r19
            ge.bog.mobilebank.bnpl.presentation.details.l r3 = p341ge.bog.mobilebank.bnpl.presentation.details.C13877l.m51703b(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            goto L_0x0020
        L_0x001f:
            r3 = r2
        L_0x0020:
            r1.mo4826r(r3)
            sl.m r1 = r0.f41163z
            java.lang.String r3 = "bnplObject"
            if (r1 != 0) goto L_0x002d
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r1 = r2
        L_0x002d:
            java.util.List r1 = r1.mo45506b()
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r1.next()
            r5 = r4
            sl.i r5 = (p606sl.C17843i) r5
            long r5 = r5.mo45476c()
            java.lang.Long r7 = r18.m51603Jw()
            if (r7 != 0) goto L_0x004d
            goto L_0x0057
        L_0x004d:
            long r7 = r7.longValue()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0057
            r5 = 1
            goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            if (r5 == 0) goto L_0x0035
            goto L_0x005c
        L_0x005b:
            r4 = r2
        L_0x005c:
            sl.i r4 = (p606sl.C17843i) r4
            sl.m r1 = r0.f41163z
            if (r1 != 0) goto L_0x0066
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r1 = r2
        L_0x0066:
            java.util.List r1 = r1.mo45505a()
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x008a
            java.lang.Object r3 = r1.next()
            r5 = r3
            sl.d r5 = (p606sl.C17838d) r5
            java.lang.Long r5 = r5.mo45446b()
            java.lang.Long r6 = r18.m51603Jw()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
            if (r5 == 0) goto L_0x006e
            goto L_0x008b
        L_0x008a:
            r3 = r2
        L_0x008b:
            sl.d r3 = (p606sl.C17838d) r3
            if (r4 == 0) goto L_0x0094
            java.util.List r1 = r4.mo45481g()
            goto L_0x0095
        L_0x0094:
            r1 = r2
        L_0x0095:
            if (r1 == 0) goto L_0x00d3
            androidx.lifecycle.x r1 = r0.f41161x
            java.lang.Object r5 = r1.mo4814f()
            r6 = r5
            ge.bog.mobilebank.bnpl.presentation.details.l r6 = (p341ge.bog.mobilebank.bnpl.presentation.details.C13877l) r6
            if (r6 == 0) goto L_0x00cf
            r7 = 0
            ge.bog.mobilebank.bnpl.presentation.details.e r5 = r0.f41145h
            java.util.List r8 = r4.mo45481g()
            if (r3 == 0) goto L_0x00b8
            sl.c r9 = r3.mo45445a()
            if (r9 == 0) goto L_0x00b8
            sl.s r9 = r9.mo45441e()
            r10 = r19
            goto L_0x00bb
        L_0x00b8:
            r10 = r19
            r9 = r2
        L_0x00bb:
            ge.bog.mobilebank.bnpl.presentation.details.d$c r8 = r5.mo38213b(r8, r10, r9)
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 253(0xfd, float:3.55E-43)
            r17 = 0
            ge.bog.mobilebank.bnpl.presentation.details.l r5 = p341ge.bog.mobilebank.bnpl.presentation.details.C13877l.m51703b(r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            goto L_0x00d0
        L_0x00cf:
            r5 = r2
        L_0x00d0:
            r1.mo4826r(r5)
        L_0x00d3:
            if (r4 == 0) goto L_0x010b
            if (r3 == 0) goto L_0x010b
            androidx.lifecycle.x r1 = r0.f41161x
            java.lang.Object r5 = r1.mo4814f()
            r6 = r5
            ge.bog.mobilebank.bnpl.presentation.details.l r6 = (p341ge.bog.mobilebank.bnpl.presentation.details.C13877l) r6
            if (r6 == 0) goto L_0x0108
            r7 = 0
            r8 = 0
            ge.bog.mobilebank.bnpl.presentation.details.e r5 = r0.f41145h
            ge.bog.mobilebank.bnpl.presentation.details.d$a r9 = r5.mo38212a(r4, r3)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            sl.c r3 = r3.mo45445a()
            if (r3 == 0) goto L_0x00fa
            java.lang.String r3 = r3.mo45437a()
            goto L_0x00fb
        L_0x00fa:
            r3 = r2
        L_0x00fb:
            if (r3 == 0) goto L_0x00ff
            ge.bog.mobilebank.bnpl.presentation.details.d$j r2 = p341ge.bog.mobilebank.bnpl.presentation.details.C13838d.C13848j.f41136a
        L_0x00ff:
            r15 = r2
            r16 = 123(0x7b, float:1.72E-43)
            r17 = 0
            ge.bog.mobilebank.bnpl.presentation.details.l r2 = p341ge.bog.mobilebank.bnpl.presentation.details.C13877l.m51703b(r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
        L_0x0108:
            r1.mo4826r(r2)
        L_0x010b:
            ee1.b r1 = r0.f41160w
            java.lang.Long r2 = r18.m51603Jw()
            if (r2 == 0) goto L_0x0118
            long r2 = r2.longValue()
            goto L_0x011a
        L_0x0118:
            long r2 = r0.f41147j
        L_0x011a:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.onNext(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.bnpl.presentation.details.C13851f.m51604Lw(long):void");
    }

    /* renamed from: Mw */
    private final void m51605Mw() {
        C40749p F = C40749p.m118049m0(onInit(), onRefresh(), this.f41141d.mo63917a().mo95026k0(new C18626p(C13855d.f41165d))).mo94989L0(new C18627q(new C13856e(this))).mo94980F(new C18628r(new C13857f(this)));
        C41536l.m120488h(F, "private fun subscribeToB…ndToLifecycle()\n        }");
        C41205b G0 = C32343x.m95413R0(F).mo94983G0(new C18629s(new C13858g(this)), new C18630t(new C13859h(this)));
        C41536l.m120488h(G0, "private fun subscribeToB…ndToLifecycle()\n        }");
        bindToLifecycle(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final Integer m51606Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final C40754t m51607Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Pw */
    public static final void m51608Pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final void m51609Qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final void m51610Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Sw */
    private final void m51611Sw() {
        Long Jw = m51603Jw();
        if (Jw != null) {
            C40749p Q = this.f41140A.mo94998Q(new C18633w(new C13860i(this, Jw.longValue())));
            C41536l.m120488h(Q, "private fun subscribeToR…ndToLifecycle()\n        }");
            C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C18634x(new C13862j(this)));
            C41536l.m120488h(F0, "private fun subscribeToR…ndToLifecycle()\n        }");
            bindToLifecycle(F0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Tw */
    public static final C40754t m51612Tw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final void m51613Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Vw */
    private final void m51614Vw() {
        C40749p Q = this.f41160w.mo94998Q(new C18631u(new C13863k(this)));
        C41536l.m120488h(Q, "private fun subscribeToS…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C18632v(new C13864l(this)));
        C41536l.m120488h(F0, "private fun subscribeToS…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final C40754t m51615Ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public static final void m51616Xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Aw */
    public C1644x mo38241hd() {
        return this.f41158u;
    }

    /* renamed from: Bb */
    public void mo38217Bb(long j, int i, int i2) {
    }

    /* renamed from: Bw */
    public C1644x mo38247o7() {
        return this.f41159v;
    }

    /* renamed from: Cw */
    public C1644x mo38225Kg() {
        return this.f41157t;
    }

    /* renamed from: Dw */
    public final C18624n mo38220Dw() {
        return this.f41149l;
    }

    /* renamed from: Ew */
    public final C18625o mo38221Ew() {
        return this.f41148k;
    }

    /* renamed from: Fw */
    public C1644x mo38231Nu() {
        return this.f41154q;
    }

    /* renamed from: Hw */
    public C1644x mo38246nj() {
        return this.f41151n;
    }

    /* renamed from: Kw */
    public C1644x mo38244m5() {
        return this.f41152o;
    }

    /* renamed from: L9 */
    public void mo38227L9() {
        boolean z;
        C17843i Iw = m51602Iw();
        if (Iw != null) {
            C1644x Hw = mo38246nj();
            C17847m mVar = this.f41163z;
            Object obj = null;
            if (mVar == null) {
                C41536l.m120506z("bnplObject");
                mVar = null;
            }
            Iterator it = mVar.mo45505a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Long b = ((C17838d) next).mo45446b();
                long c = Iw.mo45476c();
                if (b != null && b.longValue() == c) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            Hw.mo4823o(C32343x.m95466m(C41233s.m119492a(Iw, obj)));
        }
    }

    /* renamed from: Lt */
    public LiveData mo38228Lt() {
        return this.f41150m;
    }

    /* renamed from: Mq */
    public void mo38229Mq(String str) {
        C41536l.m120489i(str, "name");
        this.f41140A.onNext(str);
    }

    /* renamed from: N7 */
    public void mo38230N7(AccountOperation accountOperation) {
        C41536l.m120489i(accountOperation, "accountOperation");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: sl.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: sl.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: sl.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: sl.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: P9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38232P9() {
        /*
            r9 = this;
            sl.i r0 = r9.m51602Iw()
            if (r0 == 0) goto L_0x004e
            sl.m r1 = r9.f41163z
            r2 = 0
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = "bnplObject"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r1 = r2
        L_0x0011:
            java.util.List r1 = r1.mo45505a()
            java.util.Iterator r1 = r1.iterator()
        L_0x0019:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003f
            java.lang.Object r3 = r1.next()
            r4 = r3
            sl.d r4 = (p606sl.C17838d) r4
            java.lang.Long r4 = r4.mo45446b()
            long r5 = r0.mo45476c()
            if (r4 != 0) goto L_0x0031
            goto L_0x003b
        L_0x0031:
            long r7 = r4.longValue()
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x003b
            r4 = 1
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x0019
            r2 = r3
        L_0x003f:
            sl.d r2 = (p606sl.C17838d) r2
            if (r2 == 0) goto L_0x004e
            androidx.lifecycle.x r0 = r9.mo38244m5()
            m41.a r1 = g91.C32343x.m95466m(r2)
            r0.mo4823o(r1)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.bnpl.presentation.details.C13851f.mo38232P9():void");
    }

    /* renamed from: Q0 */
    public void mo38233Q0(long j, int i) {
        C13838d.C13842d dVar;
        m51604Lw(j);
        C13877l lVar = (C13877l) this.f41161x.mo4814f();
        if (lVar != null) {
            dVar = lVar.mo38271e();
        } else {
            dVar = null;
        }
        if (dVar != null) {
            dVar.mo38207c(i);
        }
    }

    /* renamed from: X6 */
    public void mo38236X6() {
        Long l;
        C17843i Iw = m51602Iw();
        C1644x Aw = mo38241hd();
        if (Iw != null) {
            l = Long.valueOf(Iw.mo45476c());
        } else {
            l = null;
        }
        String Gw = m51601Gw(l, BankApi.LOANS_GET_LND_REPAYMENTS_PDF);
        Aw.mo4823o(C32343x.m95466m(Gw + "&from=0&count=1000000&extras=1"));
    }

    /* renamed from: Y7 */
    public void mo38237Y7() {
        C40767b bVar = this.f41160w;
        Long Jw = m51603Jw();
        bVar.onNext(Long.valueOf(Jw != null ? Jw.longValue() : this.f41147j));
    }

    /* renamed from: Zj */
    public void mo38238Zj() {
        String str;
        String str2;
        C1644x yw = mo38234Wj();
        C17843i Iw = m51602Iw();
        if (Iw == null || (str = Iw.mo45477d()) == null) {
            C17843i Iw2 = m51602Iw();
            if (Iw2 != null) {
                str2 = Iw2.mo45480f();
            } else {
                str2 = null;
            }
            str = C32343x.m95388F(str2, new Object[0]);
        }
        yw.mo4823o(new C37223a(str));
    }

    /* renamed from: as */
    public void mo38239as() {
        C17843i Iw = m51602Iw();
        if (Iw != null) {
            mo38223Gn().mo4823o(C32343x.m95466m(Iw));
        }
    }

    /* renamed from: fp */
    public void mo38240fp() {
        Long l;
        C17843i Iw = m51602Iw();
        C1644x Bw = mo38247o7();
        if (Iw != null) {
            l = Long.valueOf(Iw.mo45476c());
        } else {
            l = null;
        }
        String Gw = m51601Gw(l, BankApi.LOANS_GET_LND_SCHEDULE_PDF);
        Bw.mo4823o(C32343x.m95466m(Gw + "&from=0&count=1000000&extras=1"));
    }

    /* renamed from: hi */
    public void mo38242hi() {
        Object obj;
        C17837c a;
        m51602Iw();
        C17847m mVar = this.f41163z;
        String str = null;
        if (mVar == null) {
            C41536l.m120506z("bnplObject");
            mVar = null;
        }
        Iterator it = mVar.mo45505a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C17838d) obj).mo45446b(), m51603Jw())) {
                break;
            }
        }
        C17838d dVar = (C17838d) obj;
        if (!(dVar == null || (a = dVar.mo45445a()) == null)) {
            str = a.mo45437a();
        }
        if (str != null) {
            mo38225Kg().mo4823o(C32343x.m95466m(RetrofitClient.populateUrlWithExtraData(this.f41146i.getRbMiddleware() + "?" + dVar.mo45445a().mo45437a())));
        }
    }

    /* renamed from: j */
    public LiveData mo38243j() {
        return this.f41162y;
    }

    /* renamed from: ne */
    public void mo38245ne() {
        boolean z;
        C17843i Iw = m51602Iw();
        if (Iw != null) {
            C1644x Fw = mo38231Nu();
            C17847m mVar = this.f41163z;
            Object obj = null;
            if (mVar == null) {
                C41536l.m120506z("bnplObject");
                mVar = null;
            }
            Iterator it = mVar.mo45505a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Long b = ((C17838d) next).mo45446b();
                long c = Iw.mo45476c();
                if (b != null && b.longValue() == c) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            Fw.mo4823o(C32343x.m95466m(C41233s.m119492a(Iw, obj)));
        }
    }

    /* renamed from: xw */
    public C1644x mo38223Gn() {
        return this.f41153p;
    }

    /* renamed from: yw */
    public C1644x mo38234Wj() {
        return this.f41155r;
    }

    /* renamed from: zw */
    public C1644x mo38235X4() {
        return this.f41156s;
    }
}
