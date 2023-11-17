package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.UntrustDeviceQuery;

/* renamed from: sso.queery.UntrustDeviceQuery$DeviceManagementServices$marshaller$$inlined$invoke$1 */
public final class C42877x8f53e435 implements C8122n {
    final /* synthetic */ UntrustDeviceQuery.DeviceManagementServices this$0;

    public C42877x8f53e435(UntrustDeviceQuery.DeviceManagementServices deviceManagementServices) {
        this.this$0 = deviceManagementServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(UntrustDeviceQuery.DeviceManagementServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(UntrustDeviceQuery.DeviceManagementServices.RESPONSE_FIELDS[1], this.this$0.getUnTrustDeviceV1());
    }
}
