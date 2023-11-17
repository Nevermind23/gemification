package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCustomerDevicesQuery;

/* renamed from: sso.queery.GetCustomerDevicesQuery$DeviceManagementServices$marshaller$$inlined$invoke$1 */
public final class C42653xbf6db921 implements C8122n {
    final /* synthetic */ GetCustomerDevicesQuery.DeviceManagementServices this$0;

    public C42653xbf6db921(GetCustomerDevicesQuery.DeviceManagementServices deviceManagementServices) {
        this.this$0 = deviceManagementServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCustomerDevicesQuery.DeviceManagementServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetCustomerDevicesQuery.DeviceManagementServices.RESPONSE_FIELDS[1], this.this$0.getGetCustomerDevices(), GetCustomerDevicesQuery$DeviceManagementServices$marshaller$1$1.INSTANCE);
    }
}
