package p341ge.bog.mobilebank.openbanking.presentation.details.list;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40754t;
import ee1.C40767b;
import hd1.C41204a;
import he1.C41224m;
import he1.C41238w;
import hv0.C36235h;
import iv0.C36553e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ov0.C37809c;
import ov0.C37813e;
import ov0.C37814f;
import ov0.C37815g;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.openbanking.presentation.ProductUiModel;
import pv0.C38024a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.ProductListViewModel$ViewModel */
public final class ProductListViewModel$ViewModel extends C21481a implements C37809c, C37813e {

    /* renamed from: d */
    private final C37809c f81642d = this;

    /* renamed from: e */
    private final C37813e f81643e = this;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f81644f = new C1644x();

    /* renamed from: g */
    private final C40767b f81645g;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.ProductListViewModel$ViewModel$a */
    static final class C33450a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36235h f81646d;

        /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.ProductListViewModel$ViewModel$a$a */
        static final class C33451a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ProductUiModel f81647d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33451a(ProductUiModel productUiModel) {
                super(1);
                this.f81647d = productUiModel;
            }

            /* renamed from: a */
            public final C41224m invoke(C36553e eVar) {
                C41536l.m120489i(eVar, "it");
                return new C41224m(this.f81647d.mo79105d().mo79091a(), eVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33450a(C36235h hVar) {
            super(1);
            this.f81646d = hVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m98212c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(ProductUiModel productUiModel) {
            C41536l.m120489i(productUiModel, "selectedProduct");
            return this.f81646d.mo88976b(productUiModel.mo79107e(), productUiModel.mo79110g()).mo95075O().mo95026k0(new C33453a(new C33451a(productUiModel)));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.list.ProductListViewModel$ViewModel$b */
    static final class C33452b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductListViewModel$ViewModel f81648d;

        /* renamed from: e */
        final /* synthetic */ C38024a f81649e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33452b(ProductListViewModel$ViewModel productListViewModel$ViewModel, C38024a aVar) {
            super(1);
            this.f81648d = productListViewModel$ViewModel;
            this.f81649e = aVar;
        }

        /* renamed from: a */
        public final void mo79273a(C41224m mVar) {
            C36553e eVar = (C36553e) mVar.mo95676b();
            C1644x hw = this.f81648d.f81644f;
            C38024a aVar = this.f81649e;
            C41536l.m120488h(eVar, "product");
            hw.mo4823o(aVar.mo91395a((String) mVar.mo95675a(), eVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79273a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductListViewModel$ViewModel(C36235h hVar, C38024a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(hVar, "getProduct");
        C41536l.m120489i(aVar, "mapper");
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ProductUiModel>()");
        this.f81645g = h1;
        h1.mo94989L0(new C37814f(new C33450a(hVar))).mo94981F0(new C37815g(new C33452b(this, aVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m98205fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m98206gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: f2 */
    public LiveData mo79268f2() {
        return this.f81644f;
    }

    /* renamed from: iw */
    public final C37813e mo79269iw() {
        return this.f81643e;
    }

    /* renamed from: jw */
    public void mo79270jw(ProductUiModel productUiModel) {
        C41536l.m120489i(productUiModel, "product");
        this.f81645g.onNext(productUiModel);
    }
}
