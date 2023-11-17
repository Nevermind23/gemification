package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.RegisterDeviceQuery;

/* renamed from: sso.queery.RegisterDeviceQuery$DeviceManagementServices$marshaller$$inlined$invoke$1 */
public final class C42825x49e8e131 implements C8122n {
    final /* synthetic */ RegisterDeviceQuery.DeviceManagementServices this$0;

    public C42825x49e8e131(RegisterDeviceQuery.DeviceManagementServices deviceManagementServices) {
        this.this$0 = deviceManagementServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(RegisterDeviceQuery.DeviceManagementServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = RegisterDeviceQuery.DeviceManagementServices.RESPONSE_FIELDS[1];
        RegisterDeviceQuery.RegisterDevice registerDevice = this.this$0.getRegisterDevice();
        if (registerDevice != null) {
            nVar = registerDevice.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
