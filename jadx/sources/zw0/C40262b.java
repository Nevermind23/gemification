package zw0;

import ax0.C31097c;
import cx0.C31455b;
import ed1.C40744k;
import ed1.C40748o;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiModel;
import p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigApiResponse;
import p341ge.bog.mobilebank.paymentconfiguration.data.source.remote.network.model.PaymentConfigListApiResponse;
import ue1.C43075l;
import yw0.C40085a;

/* renamed from: zw0.b */
public final class C40262b implements C40085a {

    /* renamed from: a */
    private final C40264c f95699a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C31097c f95700b;

    /* renamed from: zw0.b$a */
    static final class C40263a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40262b f95701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40263a(C40262b bVar) {
            super(1);
            this.f95701d = bVar;
        }

        /* renamed from: a */
        public final C40748o invoke(PaymentConfigApiResponse paymentConfigApiResponse) {
            List<PaymentConfigApiModel> list;
            C41536l.m120489i(paymentConfigApiResponse, "it");
            PaymentConfigListApiResponse list2 = paymentConfigApiResponse.getList();
            if (list2 != null) {
                list = list2.getMobile();
            } else {
                list = null;
            }
            if (list == null || paymentConfigApiResponse.getList().getMobile().isEmpty()) {
                return C40744k.m117998k();
            }
            return C40744k.m118000q(new C31455b(paymentConfigApiResponse.getHashCode(), this.f95701d.f95700b.mo71296c(paymentConfigApiResponse.getList().getMobile())));
        }
    }

    public C40262b(C40264c cVar, C31097c cVar2) {
        C41536l.m120489i(cVar, "configsApi");
        C41536l.m120489i(cVar2, "mapper");
        this.f95699a = cVar;
        this.f95700b = cVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40748o m116635d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40748o) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40744k mo94023a(String str) {
        C40744k t = this.f95699a.mo94284a(str).mo95089t(new C40261a(new C40263a(this)));
        C41536l.m120488h(t, "override fun fetchConfig…)\n            }\n        }");
        return t;
    }
}
