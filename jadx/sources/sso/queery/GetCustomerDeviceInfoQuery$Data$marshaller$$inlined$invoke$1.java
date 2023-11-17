package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetCustomerDeviceInfoQuery;

public final class GetCustomerDeviceInfoQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetCustomerDeviceInfoQuery.Data this$0;

    public GetCustomerDeviceInfoQuery$Data$marshaller$$inlined$invoke$1(GetCustomerDeviceInfoQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = GetCustomerDeviceInfoQuery.Data.RESPONSE_FIELDS[0];
        GetCustomerDeviceInfoQuery.DeviceManagementServices deviceManagementServices = this.this$0.getDeviceManagementServices();
        if (deviceManagementServices != null) {
            nVar = deviceManagementServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
