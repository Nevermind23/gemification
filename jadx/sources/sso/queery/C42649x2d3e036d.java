package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.GetCustomerDeviceInfoQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42649x2d3e036d implements C8106f {
    final /* synthetic */ GetCustomerDeviceInfoQuery this$0;

    public C42649x2d3e036d(GetCustomerDeviceInfoQuery getCustomerDeviceInfoQuery) {
        this.this$0 = getCustomerDeviceInfoQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("username", this.this$0.getUsername());
    }
}
