package b70;

import c70.C19520a;
import e70.C20182a;
import ed1.C40762x;
import f70.C20446a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.qrscanner.data.entity.QrMerchantInfoEntity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p707as.C19273c;
import ue1.C43075l;

/* renamed from: b70.b */
public final class C19339b implements C20446a {

    /* renamed from: c */
    public static final C19340a f53565c = new C19340a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final IRetrofitService f53566a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C19520a f53567b;

    /* renamed from: b70.b$a */
    public static final class C19340a {
        private C19340a() {
        }

        public /* synthetic */ C19340a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b70.b$b */
    static final class C19341b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19339b f53568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19341b(C19339b bVar) {
            super(1);
            this.f53568d = bVar;
        }

        /* renamed from: a */
        public final C20182a invoke(QrMerchantInfoEntity qrMerchantInfoEntity) {
            C41536l.m120489i(qrMerchantInfoEntity, "it");
            return this.f53568d.f53567b.mo47766a(qrMerchantInfoEntity);
        }
    }

    public C19339b(IRetrofitService iRetrofitService, C19520a aVar) {
        C41536l.m120489i(iRetrofitService, "service");
        C41536l.m120489i(aVar, "mapper");
        this.f53566a = iRetrofitService;
        this.f53567b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C20182a m64794d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C20182a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo47540a(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "qrId");
        C41536l.m120489i(str2, "qrVersion");
        C41536l.m120489i(str3, "qrType");
        C41536l.m120489i(str4, "paymentType");
        C41536l.m120489i(str5, "qrStandard");
        C40762x<BankApiResponse<QrMerchantInfoEntity>> merchantInfo = this.f53566a.getMerchantInfo("QRPAY_GET_MERCHANT_INFO", str, str2, str3, str4, str5);
        C41536l.m120488h(merchantInfo, "service.getMerchantInfo(…     qrStandard\n        )");
        C40762x A = C19273c.m64722h(merchantInfo).mo95062A(new C19338a(new C19341b(this)));
        C41536l.m120488h(A, "override fun getMerchant…per.transform(it) }\n    }");
        return A;
    }
}
