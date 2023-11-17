package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;
import sso.type.CustomType;

public final class TrustDeviceQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ TrustDeviceQuery this$0;

    public TrustDeviceQuery$variables$1$marshaller$$inlined$invoke$1(TrustDeviceQuery trustDeviceQuery) {
        this.this$0 = trustDeviceQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("deviceId", this.this$0.getDeviceId());
        if (this.this$0.getDeviceReference().f22756b) {
            gVar.mo23292b("deviceReference", CustomType.LONG, this.this$0.getDeviceReference().f22755a);
        }
        gVar.mo23295e("isAlreadyAuthorized", Boolean.valueOf(this.this$0.isAlreadyAuthorized()));
        if (this.this$0.getOperationId().f22756b) {
            gVar.mo23291a("operationId", (String) this.this$0.getOperationId().f22755a);
        }
        if (this.this$0.getOperationReference().f22756b) {
            gVar.mo23291a("operationReference", (String) this.this$0.getOperationReference().f22755a);
        }
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        if (this.this$0.getScaAuthCode().f22756b) {
            gVar.mo23291a("scaAuthCode", (String) this.this$0.getScaAuthCode().f22755a);
        }
    }
}
