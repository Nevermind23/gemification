package l60;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m60.C26147a;
import o60.C26761b;
import p341ge.bog.mobilebank.cleanarch.productdescription.data.enitity.ProductDescriptionTextEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p60.C27238a;
import p707as.C19273c;
import ue1.C43075l;

/* renamed from: l60.b */
public final class C25843b implements C27238a {

    /* renamed from: c */
    public static final C25844a f65810c = new C25844a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f65811a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C26147a f65812b;

    /* renamed from: l60.b$a */
    public static final class C25844a {
        private C25844a() {
        }

        public /* synthetic */ C25844a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: l60.b$b */
    static final class C25845b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25843b f65813d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25845b(C25843b bVar) {
            super(1);
            this.f65813d = bVar;
        }

        /* renamed from: a */
        public final C26761b invoke(ProductDescriptionTextEntity productDescriptionTextEntity) {
            C41536l.m120489i(productDescriptionTextEntity, "it");
            return this.f65813d.f65812b.mo65078b(productDescriptionTextEntity);
        }
    }

    public C25843b(IRetrofitService iRetrofitService, C26147a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f65811a = iRetrofitService;
        this.f65812b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C26761b m81247d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26761b) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo64626a(String str) {
        C41536l.m120489i(str, "lookUpName");
        C40762x<BankApiResponse<ProductDescriptionTextEntity>> lookUpTexts = this.f65811a.getLookUpTexts("COMMON_GET_TEXTS_BY_LOOKUP_DATA", str);
        C41536l.m120488h(lookUpTexts, "service.getLookUpTexts(C…_LOOKUP_DATA, lookUpName)");
        C40762x A = C19273c.m64722h(lookUpTexts).mo95062A(new C25842a(new C25845b(this)));
        C41536l.m120488h(A, "override fun getLookUpTe…per.transform(it) }\n    }");
        return A;
    }
}
