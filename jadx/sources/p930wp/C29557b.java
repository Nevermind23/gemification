package p930wp;

import ed1.C40749p;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p729cv.C19799c;
import p941xp.C29821a;
import p941xp.C29822b;
import p952yp.C30105a;
import ue1.C43079p;

/* renamed from: wp.b */
public final class C29557b {

    /* renamed from: c */
    public static final C29558a f74669c = new C29558a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C30105a f74670a;

    /* renamed from: b */
    private final C19799c f74671b;

    /* renamed from: wp.b$a */
    public static final class C29558a {
        private C29558a() {
        }

        public /* synthetic */ C29558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wp.b$b */
    static final class C29559b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C29559b f74672d = new C29559b();

        C29559b() {
            super(2);
        }

        /* renamed from: a */
        public final List invoke(List list, List list2) {
            String str;
            Object obj;
            C41536l.m120489i(list, "productTypes");
            C41536l.m120489i(list2, "appTypeList");
            Iterator it = list.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((ProductType) obj).getProduct(), "GTP_TRADING")) {
                    break;
                }
            }
            ProductType productType = (ProductType) obj;
            if (productType != null) {
                str = productType.getStatus();
            }
            if (str != null && !C41536l.m120484d(str, ProductType.PRODUCT_STATUS_NEW) && !C41536l.m120484d(str, ProductType.PRODUCT_STATUS_REJECTED)) {
                return list2;
            }
            List B0 = C41358y.m119991B0(list2);
            B0.add(new C29822b(C29821a.GT, "amm.app.types.GT_TRAIDING"));
            return B0;
        }
    }

    public C29557b(C30105a aVar, C19799c cVar) {
        C41536l.m120489i(aVar, "applicationTypesRepository");
        C41536l.m120489i(cVar, "getProductTypes");
        this.f74670a = aVar;
        this.f74671b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m89741c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (List) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40749p mo69402b() {
        C40749p d1 = C40749p.m118037d1(this.f74671b.mo48088d(false), this.f74670a.mo68100a().mo95075O(), new C29556a(C29559b.f74672d));
        C41536l.m120488h(d1, "zip(\n            getProd…t\n            }\n        }");
        return d1;
    }
}
