package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.VerifyOTPQuery;

public final class VerifyOTPQuery$CommonServices$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ VerifyOTPQuery.CommonServices this$0;

    public VerifyOTPQuery$CommonServices$marshaller$$inlined$invoke$1(VerifyOTPQuery.CommonServices commonServices) {
        this.this$0 = commonServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(VerifyOTPQuery.CommonServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(VerifyOTPQuery.CommonServices.RESPONSE_FIELDS[1], this.this$0.getVerifyOTP());
    }
}
