package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCustomerDeviceInfoQuery;

/* renamed from: sso.queery.GetCustomerDeviceInfoQuery$GetCustomerDeviceInfo$marshaller$$inlined$invoke$1 */
public final class C42648xbb212b9 implements C8122n {
    final /* synthetic */ GetCustomerDeviceInfoQuery.GetCustomerDeviceInfo this$0;

    public C42648xbb212b9(GetCustomerDeviceInfoQuery.GetCustomerDeviceInfo getCustomerDeviceInfo) {
        this.this$0 = getCustomerDeviceInfo;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCustomerDeviceInfoQuery.GetCustomerDeviceInfo.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetCustomerDeviceInfoQuery.GetCustomerDeviceInfo.RESPONSE_FIELDS[1], this.this$0.isTrusted());
    }
}
