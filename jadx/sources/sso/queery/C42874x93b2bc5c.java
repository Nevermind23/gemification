package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.TrustDeviceQuery;

/* renamed from: sso.queery.TrustDeviceQuery$DeviceManagementServices$marshaller$$inlined$invoke$1 */
public final class C42874x93b2bc5c implements C8122n {
    final /* synthetic */ TrustDeviceQuery.DeviceManagementServices this$0;

    public C42874x93b2bc5c(TrustDeviceQuery.DeviceManagementServices deviceManagementServices) {
        this.this$0 = deviceManagementServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(TrustDeviceQuery.DeviceManagementServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(TrustDeviceQuery.DeviceManagementServices.RESPONSE_FIELDS[1], this.this$0.getTrustDevice());
    }
}
