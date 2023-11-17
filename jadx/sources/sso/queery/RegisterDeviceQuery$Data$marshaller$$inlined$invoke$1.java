package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.RegisterDeviceQuery;

public final class RegisterDeviceQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ RegisterDeviceQuery.Data this$0;

    public RegisterDeviceQuery$Data$marshaller$$inlined$invoke$1(RegisterDeviceQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = RegisterDeviceQuery.Data.RESPONSE_FIELDS[0];
        RegisterDeviceQuery.DeviceManagementServices deviceManagementServices = this.this$0.getDeviceManagementServices();
        if (deviceManagementServices != null) {
            nVar = deviceManagementServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
