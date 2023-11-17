package nu0;

import android.os.Handler;
import android.os.Looper;
import ed1.C40749p;
import ee1.C40765a;
import he1.C41238w;
import j51.C36735g;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import lu0.C37155a;
import m51.C37228a;
import nd0.C26453c;
import od0.C26940a;
import od0.C26941b;
import ou0.C37804a;
import p341ge.bog.mobilebank.model.Client;
import pd0.C27503h;
import su0.C38536a;
import ue1.C43064a;
import ue1.C43075l;
import uu0.C39103a;
import vu0.C39474a;

/* renamed from: nu0.c */
public final class C37464c implements C39474a, C26941b {

    /* renamed from: d */
    private final C37804a f90070d;

    /* renamed from: e */
    private final C36735g f90071e;

    /* renamed from: f */
    private final C39103a f90072f;

    /* renamed from: g */
    private final C37155a f90073g;

    /* renamed from: h */
    private final Client f90074h;

    /* renamed from: i */
    private final /* synthetic */ C26940a f90075i = new C26940a();

    /* renamed from: j */
    private final C27503h f90076j = mo90613e4(new C27503h());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C40765a f90077k;

    /* renamed from: nu0.c$a */
    /* synthetic */ class C37465a extends C41535k implements C43075l {
        C37465a(Object obj) {
            super(1, obj, C37155a.class, "transform", "transformOffers(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C37155a) this.receiver).mo90147i(list);
        }
    }

    /* renamed from: nu0.c$b */
    static final class C37466b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37464c f90078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37466b(C37464c cVar) {
            super(1);
            this.f90078d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m110390c(C37464c cVar) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f90077k.onNext(C41238w.f97225a);
        }

        /* renamed from: b */
        public final void mo90616b(List list) {
            C37464c cVar = this.f90078d;
            C41536l.m120488h(list, "it");
            if (cVar.m110376f4(list)) {
                new Handler(Looper.getMainLooper()).postDelayed(new C37468d(this.f90078d), 10000);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90616b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nu0.c$c */
    /* synthetic */ class C37467c extends C41535k implements C43064a {
        C37467c(Object obj) {
            super(0, obj, C37464c.class, "getNboObservable", "getNboObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C37464c) this.receiver).m110377h4();
        }
    }

    public C37464c(C37804a aVar, C36735g gVar, C39103a aVar2, C37155a aVar3, Client client) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(aVar2, "nboPreferencesManager");
        C41536l.m120489i(aVar3, "mapper");
        C41536l.m120489i(client, "client");
        this.f90070d = aVar;
        this.f90071e = gVar;
        this.f90072f = aVar2;
        this.f90073g = aVar3;
        this.f90074h = client;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f90077k = h1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: f4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m110376f4(java.util.List r6) {
        /*
            r5 = this;
            xe1.c$a r0 = xe1.C43263c.f101019d
            r1 = 5
            int r0 = r0.mo101948d(r1)
            r1 = 0
            if (r0 != 0) goto L_0x005c
            ge.bog.mobilebank.model.Client r0 = r5.f90074h
            ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper r0 = r0.getUserInfo()
            r2 = 1
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isSolo()
            if (r0 != 0) goto L_0x001b
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            if (r0 == 0) goto L_0x005c
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x002a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x002a
        L_0x0028:
            r6 = r1
            goto L_0x0059
        L_0x002a:
            java.util.Iterator r6 = r6.iterator()
        L_0x002e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r6.next()
            su0.a r0 = (su0.C38536a) r0
            su0.b r3 = r0.mo92150y()
            su0.b$j r4 = su0.C38537b.C38547j.f92394c
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)
            if (r3 == 0) goto L_0x0055
            java.lang.Integer r0 = r0.mo92149x()
            if (r0 != 0) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0055
            r0 = r2
            goto L_0x0056
        L_0x0055:
            r0 = r1
        L_0x0056:
            if (r0 == 0) goto L_0x002e
            r6 = r2
        L_0x0059:
            if (r6 == 0) goto L_0x005c
            r1 = r2
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.C37464c.m110376f4(java.util.List):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public final C40749p m110377h4() {
        Long l;
        C37804a aVar = this.f90070d;
        C37228a a = this.f90071e.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        return aVar.mo91051a(String.valueOf(l)).mo95062A(new C37462a(new C37465a(this.f90073g))).mo95084m(new C37463b(new C37466b(this))).mo95075O();
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final List m110378i4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final void m110379j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: k4 */
    private final void m110380k4(boolean z) {
        this.f90076j.mo66814o(z, new C37467c(this)).mo94979E0();
    }

    /* renamed from: D3 */
    public boolean mo90607D3() {
        C37228a a = this.f90071e.mo89562a();
        if (a == null) {
            return false;
        }
        return this.f90072f.mo90383b(a.mo90305b());
    }

    /* renamed from: N1 */
    public long mo90608N1(C38536a aVar) {
        C41536l.m120489i(aVar, "offer");
        C37228a a = this.f90071e.mo89562a();
        if (a == null) {
            return -1;
        }
        return this.f90072f.mo90385d(aVar, a.mo90305b());
    }

    /* renamed from: S0 */
    public void mo90609S0() {
        C37228a a = this.f90071e.mo89562a();
        if (a != null) {
            this.f90072f.mo90384c(a.mo90305b());
        }
    }

    /* renamed from: W0 */
    public C40749p mo90610W0(boolean z) {
        C40749p e = C26453c.m82747e(this.f90076j.mo66812m());
        m110380k4(z);
        return e;
    }

    /* renamed from: X0 */
    public C40749p mo90611X0() {
        C40749p g1 = this.f90077k.mo95040w0().mo102092g1(0);
        C41536l.m120488h(g1, "chatBotNboOffersSubject.publish().autoConnect(0)");
        return g1;
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f90075i.addStore(hVar);
    }

    /* renamed from: b1 */
    public void mo90612b1(C38536a aVar) {
        C41536l.m120489i(aVar, "offer");
        C37228a a = this.f90071e.mo89562a();
        if (a != null) {
            this.f90072f.mo90382a(aVar, a.mo90305b());
        }
    }

    public void clean() {
        mo90614g4();
    }

    /* renamed from: e4 */
    public C27503h mo90613e4(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.f90075i.mo66226a(hVar);
    }

    /* renamed from: g4 */
    public void mo90614g4() {
        this.f90075i.mo66227b();
    }
}
