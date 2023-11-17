package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.RegisterDeviceQuery;

public final class RegisterDeviceQuery$RegisterDevice$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ RegisterDeviceQuery.RegisterDevice this$0;

    public RegisterDeviceQuery$RegisterDevice$marshaller$$inlined$invoke$1(RegisterDeviceQuery.RegisterDevice registerDevice) {
        this.this$0 = registerDevice;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(RegisterDeviceQuery.RegisterDevice.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(RegisterDeviceQuery.RegisterDevice.RESPONSE_FIELDS[1], this.this$0.getExtCustomerId());
        pVar.mo23319d(RegisterDeviceQuery.RegisterDevice.RESPONSE_FIELDS[2], this.this$0.getDeviceId());
    }
}
