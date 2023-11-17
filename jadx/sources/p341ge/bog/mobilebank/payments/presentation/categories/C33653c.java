package p341ge.bog.mobilebank.payments.presentation.categories;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.salesforce.marketingcloud.UrlHandler;
import cx0.C31456c;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import ex0.C31876e;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41232r;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nx0.C37497e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.payments.presentation.categories.C33649b;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p380ck.C10463g;
import p748eu.C20292b;
import p758fu.C20557a;
import px0.C38029d;
import px0.C38035e;
import px0.C38036f;
import px0.C38037g;
import px0.C38038h;
import px0.C38039i;
import px0.C38040j;
import px0.C38041k;
import px0.C38042l;
import px0.C38043m;
import px0.C38044n;
import px0.C38045o;
import ue1.C43075l;
import ue1.C43079p;
import v61.C39239d;
import v61.C39241f;

/* renamed from: ge.bog.mobilebank.payments.presentation.categories.c */
public abstract class C33653c extends C21481a {

    /* renamed from: d */
    private final C31876e f82035d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C37497e f82036e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C39241f f82037f;

    /* renamed from: g */
    private final C38029d f82038g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C10463g f82039h;

    /* renamed from: i */
    private final C1644x f82040i = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f82041j = new C1644x();

    /* renamed from: k */
    private final C1644x f82042k = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f82043l;

    /* renamed from: m */
    private final C40767b f82044m;

    /* renamed from: n */
    private final C40767b f82045n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final List f82046o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C31456c f82047p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f82048q;

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$a */
    static final class C33654a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33654a f82049d = new C33654a();

        C33654a() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "it");
            return C40749p.m118043h0(str);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$b */
    static final class C33655b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33655b(C33653c cVar) {
            super(1);
            this.f82050d = cVar;
        }

        /* renamed from: a */
        public final void mo80238a(String str) {
            boolean z;
            C41536l.m120488h(str, "searchWord");
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f82050d.f82039h.mo27156w("payment_tree", "search_word", "click", str);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80238a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$c */
    static final class C33656c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82051d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$c$a */
        static final class C33657a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ String f82052d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33657a(String str) {
                super(2);
                this.f82052d = str;
            }

            /* renamed from: a */
            public final C41232r invoke(List list, List list2) {
                C41536l.m120489i(list, "payments");
                C41536l.m120489i(list2, "templates");
                return new C41232r(list, list2, this.f82052d);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33656c(C33653c cVar) {
            super(1);
            this.f82051d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41232r m98872c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41232r) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C38035e eVar;
            C41536l.m120489i(str, "query");
            this.f82051d.m98823Fw(str);
            if (!this.f82051d.f82048q) {
                return C40749p.m118027J();
            }
            C31456c cVar = null;
            if (!this.f82051d.f82043l && (eVar = (C38035e) C41358y.m120020j0(this.f82051d.f82046o)) != null) {
                cVar = eVar.mo91409b();
            }
            return C40749p.m118037d1(C37497e.C37498a.m110424a(this.f82051d.f82036e, str, cVar, false, 4, (Object) null), this.f82051d.f82037f.mo92863b(str).mo95075O(), new C33665d(new C33657a(str)));
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$d */
    static final class C33658d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82053d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33658d(C33653c cVar) {
            super(1);
            this.f82053d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f82053d.f82041j.mo4823o(C32343x.m95466m(th));
            this.f82053d.m98832Ow();
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$e */
    static final class C33659e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82054d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33659e(C33653c cVar) {
            super(1);
            this.f82054d = cVar;
        }

        /* renamed from: a */
        public final void mo80242a(C41232r rVar) {
            List list = (List) rVar.mo95688a();
            List list2 = (List) rVar.mo95689b();
            String str = (String) rVar.mo95690c();
            C33653c cVar = this.f82054d;
            C41536l.m120488h(list, "payments");
            C41536l.m120488h(list2, "templates");
            C41536l.m120488h(str, "query");
            cVar.m98835Xw(list, list2, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80242a((C41232r) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$f */
    static final class C33660f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33660f(C33653c cVar) {
            super(1);
            this.f82055d = cVar;
        }

        /* renamed from: a */
        public final void mo80243a(C31456c cVar) {
            this.f82055d.f82047p = null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80243a((C31456c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$g */
    static final class C33661g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33661g(C33653c cVar) {
            super(1);
            this.f82056d = cVar;
        }

        /* renamed from: a */
        public final void mo80244a(C31456c cVar) {
            this.f82056d.f82047p = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80244a((C31456c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$h */
    static final class C33662h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82057d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33662h(C33653c cVar) {
            super(1);
            this.f82057d = cVar;
        }

        /* renamed from: a */
        public final void mo80245a(C31456c cVar) {
            C33653c cVar2 = this.f82057d;
            C41536l.m120488h(cVar, "it");
            cVar2.m98829Lw(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80245a((C31456c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$i */
    static final class C33663i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82058d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33663i(C33653c cVar) {
            super(1);
            this.f82058d = cVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f82058d.f82041j.mo4823o(C32343x.m95466m(th));
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.categories.c$j */
    static final class C33664j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33653c f82059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33664j(C33653c cVar) {
            super(1);
            this.f82059d = cVar;
        }

        /* renamed from: a */
        public final void mo80247a(List list) {
            C41536l.m120488h(list, "lst");
            C31456c cVar = (C31456c) C41358y.m120009Y(list);
            if (cVar != null) {
                this.f82059d.f82039h.mo27156w("payment_tree", "search_result_template", "click", C32343x.m95386E(cVar.mo71852c().mo71837t(), true, new Object[0]));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80247a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33653c(C31876e eVar, C37497e eVar2, C39241f fVar, C38029d dVar, C10463g gVar, C20292b bVar, C39239d dVar2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        boolean z;
        Boolean a;
        C41536l.m120489i(eVar, "getPaymentConfigTree");
        C41536l.m120489i(eVar2, "searchPaymentConfigTree");
        C41536l.m120489i(fVar, "searchTemplates");
        C41536l.m120489i(dVar, "mapper");
        C41536l.m120489i(gVar, "analytics");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(dVar2, "loadTemplates");
        this.f82035d = eVar;
        this.f82036e = eVar2;
        this.f82037f = fVar;
        this.f82038g = dVar;
        this.f82039h = gVar;
        C20557a b = bVar.mo48775b("PAYMENTS_SEARCH_IN_ROOT");
        if (b == null || (a = b.mo49084a()) == null) {
            z = false;
        } else {
            z = a.booleanValue();
        }
        this.f82043l = z;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f82044m = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f82045n = h12;
        this.f82046o = new ArrayList();
        m98824Gw();
        m98860zw();
        dVar2.mo92862a();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final C40754t m98818Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public static final void m98819Bw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final C40754t m98820Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m98821Dw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m98822Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* renamed from: Fw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m98823Fw(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3.f82048q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0015
            int r0 = r4.length()
            if (r0 != 0) goto L_0x000e
            r0 = r1
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 == 0) goto L_0x0015
            r3.m98836Yw()
            goto L_0x0029
        L_0x0015:
            boolean r0 = r3.f82048q
            if (r0 == 0) goto L_0x0029
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0021
            r0 = r1
            goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = r3.f82046o
            java.lang.Object unused = ie1.C41352v.m119963H(r0)
        L_0x0029:
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r1 = r2
        L_0x0031:
            r3.f82048q = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.payments.presentation.categories.C33653c.m98823Fw(java.lang.String):void");
    }

    /* renamed from: Gw */
    private final void m98824Gw() {
        C40762x P = this.f82035d.invoke().mo94996P();
        C41536l.m120488h(P, "getPaymentConfigTree()\n …          .firstOrError()");
        C41205b I = C32343x.m95465l1(P).mo95084m(new C38042l(new C33660f(this))).mo95084m(new C38043m(new C33661g(this))).mo95070I(new C38044n(new C33662h(this)), new C38045o(new C33663i(this)));
        C41536l.m120488h(I, "private fun configureTre…ndToLifecycle()\n        }");
        bindToLifecycle(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m98825Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m98826Iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m98827Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public static final void m98828Kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public final void m98829Lw(C31456c cVar) {
        m98837Zw(this.f82038g.mo91400a(cVar));
    }

    /* renamed from: Mw */
    private final void m98830Mw(C31456c cVar) {
        m98837Zw(this.f82038g.mo91401b(cVar));
    }

    /* renamed from: Nw */
    private final void m98831Nw(C31456c cVar) {
        m98837Zw(this.f82038g.mo91403d(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public final void m98832Ow() {
        this.f82048q = false;
        this.f82040i.mo4823o(C41358y.m120019i0(this.f82046o));
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final void m98833Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Tw */
    private final void m98834Tw(C31456c cVar) {
        if (C41536l.m120484d(cVar.mo71852c().mo71836s(), "category.transport_pass.key.for.mbank")) {
            this.f82042k.mo4823o(C32343x.m95466m(C33649b.C33652c.f82034a));
        } else {
            this.f82042k.mo4823o(C32343x.m95466m(new C33649b.C33651b(cVar)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public final void m98835Xw(List list, List list2, String str) {
        C31456c b;
        C38035e eVar = (C38035e) C41358y.m120020j0(this.f82046o);
        if (eVar != null && (b = eVar.mo91409b()) != null) {
            m98837Zw(this.f82038g.mo91402c(list, list2, str, b));
        }
    }

    /* renamed from: Yw */
    private final void m98836Yw() {
        String d;
        Object unused = C41352v.m119962G(this.f82046o);
        C38035e eVar = (C38035e) C41358y.m120020j0(this.f82046o);
        boolean z = false;
        if (!(eVar == null || (d = eVar.mo91411d()) == null || d.length() <= 0)) {
            z = true;
        }
        this.f82048q = z;
        this.f82040i.mo4823o(C41358y.m120019i0(this.f82046o));
    }

    /* renamed from: Zw */
    private final void m98837Zw(C38035e eVar) {
        this.f82046o.add(eVar);
        this.f82040i.mo4823o(C41358y.m120019i0(this.f82046o));
    }

    /* renamed from: zw */
    private final void m98860zw() {
        C40767b bVar = this.f82045n;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C40749p L0 = bVar.mo95032s(1000, timeUnit).mo95043y().mo94989L0(new C38036f(C33654a.f82049d));
        C41536l.m120488h(L0, "searchLoggingSubject\n   …ust(it)\n                }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C38037g(new C33655b(this)));
        C41536l.m120488h(F0, "private fun configureSea…dToLifecycle()\n\n        }");
        bindToLifecycle(F0);
        C40749p L02 = this.f82044m.mo95032s(400, timeUnit).mo95043y().mo94989L0(new C38038h(new C33656c(this)));
        C41536l.m120488h(L02, "private fun configureSea…dToLifecycle()\n\n        }");
        C41205b F02 = C32343x.m95413R0(L02).mo94974C(new C38039i(new C33658d(this))).mo94981F0(new C38040j(new C33659e(this)));
        C41536l.m120488h(F02, "private fun configureSea…dToLifecycle()\n\n        }");
        bindToLifecycle(F02);
    }

    /* renamed from: Pw */
    public void mo80228Pw(String str, String str2, String str3) {
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, "label");
        C41536l.m120489i(str3, UrlHandler.ACTION);
        this.f82039h.mo27152s(str, str2, str3);
    }

    /* renamed from: Qw */
    public void mo80229Qw(String str) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41205b F0 = C32343x.m95462k1(this.f82036e.mo90634a(str, (C31456c) null, true)).mo94981F0(new C38041k(new C33664j(this)));
        C41536l.m120488h(F0, "override fun logTemplate…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* renamed from: Sw */
    public void mo80230Sw() {
        if (this.f82046o.size() <= 1) {
            this.f82042k.mo4823o(C32343x.m95466m(C33649b.C33650a.f82032a));
        } else {
            m98836Yw();
        }
    }

    /* renamed from: Uw */
    public void mo80231Uw(C31456c cVar, int i) {
        C41536l.m120489i(cVar, "node");
        C38035e eVar = (C38035e) C41358y.m120020j0(this.f82046o);
        if (eVar != null) {
            eVar.mo91412e(i);
        }
        if (!cVar.mo71854e()) {
            m98834Tw(cVar);
            return;
        }
        boolean z = false;
        this.f82048q = false;
        Collection values = cVar.mo71851b().values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C31456c) it.next()).mo71854e()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (!z || values.size() < 2) {
            m98831Nw(cVar);
        } else {
            m98830Mw(cVar);
        }
    }

    /* renamed from: Vw */
    public void mo80232Vw(C31456c cVar, String str) {
        C41536l.m120489i(str, "serviceID");
        if (cVar == null) {
            cVar = this.f82047p;
        }
        if (cVar != null) {
            for (C31456c cVar2 : cVar.mo71851b().values()) {
                if (C41536l.m120484d(cVar2.mo71852c().mo71836s(), str)) {
                    mo80231Uw(cVar2, 0);
                    return;
                }
            }
            if (!cVar.mo71851b().isEmpty()) {
                for (C31456c Vw : cVar.mo71851b().values()) {
                    mo80232Vw(Vw, str);
                }
            }
        }
    }

    /* renamed from: Ww */
    public void mo80233Ww(String str, int i) {
        C41536l.m120489i(str, "query");
        C38035e eVar = (C38035e) C41358y.m120020j0(this.f82046o);
        if (eVar != null) {
            eVar.mo91412e(i);
        }
        this.f82045n.onNext(str);
        this.f82044m.onNext(str);
    }

    public LiveData getState() {
        return this.f82040i;
    }

    /* renamed from: me */
    public LiveData mo80235me() {
        return this.f82042k;
    }

    /* renamed from: o3 */
    public LiveData mo80236o3() {
        return this.f82041j;
    }
}
