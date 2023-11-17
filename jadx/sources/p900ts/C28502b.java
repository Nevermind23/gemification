package p900ts;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.ProductTypeApiEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import p882rv.C28108a;
import p889ss.C28259a;
import ue1.C43075l;

/* renamed from: ts.b */
public final class C28502b implements C28108a {

    /* renamed from: f */
    public static final C28503a f72311f = new C28503a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final IRetrofitService f72312d;

    /* renamed from: e */
    private final C28259a f72313e;

    /* renamed from: ts.b$a */
    public static final class C28503a {
        private C28503a() {
        }

        public /* synthetic */ C28503a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ts.b$b */
    static final class C28504b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C28502b f72314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C28504b(C28502b bVar) {
            super(1);
            this.f72314d = bVar;
        }

        /* renamed from: a */
        public final String invoke(List list) {
            C41536l.m120489i(list, "it");
            return this.f72314d.mo68104b4().mo67842a(list);
        }
    }

    public C28502b(IRetrofitService iRetrofitService, C28259a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapperParameters");
        this.f72312d = iRetrofitService;
        this.f72313e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a4 */
    public static final String m87331a4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (String) lVar.invoke(obj);
    }

    /* renamed from: O2 */
    public C40762x mo67643O2() {
        C40762x<BankApiResponse<List<ProductTypeApiEntity>>> productTypeList = this.f72312d.getProductTypeList("CLIENTS_GET_PRODUCT_TYPES");
        C41536l.m120488h(productTypeList, "service.getProductTypeLi…LIENTS_GET_PRODUCT_TYPES)");
        C40762x A = C19273c.m64722h(productTypeList).mo95062A(new C28501a(new C28504b(this)));
        C41536l.m120488h(A, "override fun getGTStatus…ers.transform(it) }\n    }");
        return A;
    }

    /* renamed from: b4 */
    public final C28259a mo68104b4() {
        return this.f72313e;
    }

    public void clean() {
    }
}
