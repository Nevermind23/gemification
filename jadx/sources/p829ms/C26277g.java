package p829ms;

import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import he1.C41238w;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ProductTypeApiEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p819ls.C26063b;
import qd0.C27774a;
import ue1.C43075l;

/* renamed from: ms.g */
public final class C26277g implements C27774a {

    /* renamed from: h */
    public static final C26278a f66614h = new C26278a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f66615d;

    /* renamed from: e */
    private final C26063b f66616e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AtomicBoolean f66617f = new AtomicBoolean(false);

    /* renamed from: g */
    private C40765a f66618g;

    /* renamed from: ms.g$a */
    public static final class C26278a {
        private C26278a() {
        }

        public /* synthetic */ C26278a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ms.g$b */
    static final class C26279b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26277g f66619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26279b(C26277g gVar) {
            super(1);
            this.f66619d = gVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f66619d.mo65430c4().mo64982b(list);
        }
    }

    /* renamed from: ms.g$c */
    static final class C26280c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26277g f66620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26280c(C26277g gVar) {
            super(1);
            this.f66620d = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f66620d.f66617f.set(true);
        }
    }

    public C26277g(IRetrofitService iRetrofitService, C26063b bVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(bVar, "mapper");
        this.f66615d = iRetrofitService;
        this.f66616e = bVar;
        C40765a i1 = C40765a.m118199i1(m82215d4());
        C41536l.m120488h(i1, "createDefault(getProductTypeListObservable())");
        this.f66618g = i1;
    }

    /* renamed from: d4 */
    private final C40749p m82215d4() {
        C40762x<BankApiResponse<List<ProductTypeApiEntity>>> productTypeList = this.f66615d.getProductTypeList("CLIENTS_GET_PRODUCT_TYPES");
        C41536l.m120488h(productTypeList, "service.getProductTypeLi…LIENTS_GET_PRODUCT_TYPES)");
        C40749p g = C19273c.m64722h(productTypeList).mo95062A(new C26275e(new C26279b(this))).mo95082k(new C26276f(new C26280c(this))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getProductTy…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final List m82216e4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public static final void m82217f4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: c4 */
    public final C26063b mo65430c4() {
        return this.f66616e;
    }

    public void clean() {
        this.f66617f = new AtomicBoolean(false);
        this.f66618g.onComplete();
        C40765a i1 = C40765a.m118199i1(m82215d4());
        C41536l.m120488h(i1, "createDefault(getProductTypeListObservable())");
        this.f66618g = i1;
    }
}
