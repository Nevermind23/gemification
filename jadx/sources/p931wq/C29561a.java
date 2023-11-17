package p931wq;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p706ar.C19269a;

/* renamed from: wq.a */
public final class C29561a implements C19269a {

    /* renamed from: a */
    private final IRetrofitService f74674a;

    public C29561a(IRetrofitService iRetrofitService) {
        C41536l.m120489i(iRetrofitService, "service");
        this.f74674a = iRetrofitService;
    }

    /* renamed from: a */
    public C40734b mo47493a(String str, String str2) {
        C41536l.m120489i(str, "customerId");
        C41536l.m120489i(str2, "rbcParameterName");
        C40734b requestAddCustomerNotification = this.f74674a.requestAddCustomerNotification("NOTIF_ADD_NOTIF_CUSTOMER", str, str2);
        C41536l.m120488h(requestAddCustomerNotification, "service.requestAddCustom…bcParameterName\n        )");
        return requestAddCustomerNotification;
    }
}
