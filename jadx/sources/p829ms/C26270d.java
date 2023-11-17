package p829ms;

import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import he1.C41238w;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.home.entity.AssetLiabilityApiEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p739dv.C20102a;
import p749ev.C20296a;
import p819ls.C26061a;
import ue1.C43075l;

/* renamed from: ms.d */
public final class C26270d implements C20296a {

    /* renamed from: h */
    public static final C26271a f66604h = new C26271a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f66605d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C26061a f66606e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AtomicBoolean f66607f = new AtomicBoolean(false);

    /* renamed from: g */
    private C40765a f66608g;

    /* renamed from: ms.d$a */
    public static final class C26271a {
        private C26271a() {
        }

        public /* synthetic */ C26271a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ms.d$b */
    static final class C26272b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26272b f66609d = new C26272b();

        C26272b() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    /* renamed from: ms.d$c */
    static final class C26273c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26270d f66610d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26273c(C26270d dVar) {
            super(1);
            this.f66610d = dVar;
        }

        /* renamed from: a */
        public final C20102a invoke(AssetLiabilityApiEntity assetLiabilityApiEntity) {
            C41536l.m120489i(assetLiabilityApiEntity, "it");
            return this.f66610d.f66606e.mo64977a(assetLiabilityApiEntity);
        }
    }

    /* renamed from: ms.d$d */
    static final class C26274d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26270d f66611d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26274d(C26270d dVar) {
            super(1);
            this.f66611d = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f66611d.f66607f.set(true);
        }
    }

    public C26270d(IRetrofitService iRetrofitService, C26061a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "assetLiabilityMapper");
        this.f66605d = iRetrofitService;
        this.f66606e = aVar;
        C40765a i1 = C40765a.m118199i1(m82205f4());
        C41536l.m120488h(i1, "createDefault(getAssetLiabilityObservable())");
        this.f66608g = i1;
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final C40754t m82204e4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: f4 */
    private final C40749p m82205f4() {
        C40762x<BankApiResponse<AssetLiabilityApiEntity>> assetLiabilityDetails = this.f66605d.getAssetLiabilityDetails("ASSTLBLT_GET_CLIENT_ASST_LBLTS_WITH_DETAILS");
        C41536l.m120488h(assetLiabilityDetails, "service.getAssetLiabilit…_ASST_LBLTS_WITH_DETAILS)");
        C40749p g = C19273c.m64722h(assetLiabilityDetails).mo95062A(new C26267a(new C26273c(this))).mo95082k(new C26268b(new C26274d(this))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getAssetLiab…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: g4 */
    public static final C20102a m82206g4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C20102a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h4 */
    public static final void m82207h4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: H3 */
    public C40749p mo48779H3(boolean z) {
        if (this.f66607f.compareAndSet(true, false) || z) {
            mo48780I3();
        }
        C40749p L0 = this.f66608g.mo94989L0(new C26269c(C26272b.f66609d));
        C41536l.m120488h(L0, "assetLiabilitySubject.sw…\n            it\n        }");
        return L0;
    }

    /* renamed from: I3 */
    public void mo48780I3() {
        this.f66608g.onNext(m82205f4());
    }

    public void clean() {
        this.f66607f = new AtomicBoolean(false);
        this.f66608g.onComplete();
        C40765a i1 = C40765a.m118199i1(m82205f4());
        C41536l.m120488h(i1, "createDefault(getAssetLiabilityObservable())");
        this.f66608g = i1;
    }
}
