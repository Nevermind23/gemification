package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.ResetApplicationQuery;

public final class ResetApplicationQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ ResetApplicationQuery.Data this$0;

    public ResetApplicationQuery$Data$marshaller$$inlined$invoke$1(ResetApplicationQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = ResetApplicationQuery.Data.RESPONSE_FIELDS[0];
        ResetApplicationQuery.DeviceManagementServices deviceManagementServices = this.this$0.getDeviceManagementServices();
        if (deviceManagementServices != null) {
            nVar = deviceManagementServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
