package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class BiometricLoginQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ BiometricLoginQuery this$0;

    public BiometricLoginQuery$variables$1$marshaller$$inlined$invoke$1(BiometricLoginQuery biometricLoginQuery) {
        this.this$0 = biometricLoginQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("username", this.this$0.getUsername());
        gVar.mo23291a("authToken", this.this$0.getAuthToken());
        gVar.mo23291a("deviceId", this.this$0.getDeviceId());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("tmxSessionId", this.this$0.getTmxSessionId());
    }
}
