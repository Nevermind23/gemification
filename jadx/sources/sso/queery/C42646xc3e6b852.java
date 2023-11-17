package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCustomerDeviceInfoQuery;

/* renamed from: sso.queery.GetCustomerDeviceInfoQuery$DeviceManagementServices$marshaller$$inlined$invoke$1 */
public final class C42646xc3e6b852 implements C8122n {
    final /* synthetic */ GetCustomerDeviceInfoQuery.DeviceManagementServices this$0;

    public C42646xc3e6b852(GetCustomerDeviceInfoQuery.DeviceManagementServices deviceManagementServices) {
        this.this$0 = deviceManagementServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetCustomerDeviceInfoQuery.DeviceManagementServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetCustomerDeviceInfoQuery.DeviceManagementServices.RESPONSE_FIELDS[1];
        GetCustomerDeviceInfoQuery.GetCustomerDeviceInfo getCustomerDeviceInfo = this.this$0.getGetCustomerDeviceInfo();
        if (getCustomerDeviceInfo != null) {
            nVar = getCustomerDeviceInfo.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
