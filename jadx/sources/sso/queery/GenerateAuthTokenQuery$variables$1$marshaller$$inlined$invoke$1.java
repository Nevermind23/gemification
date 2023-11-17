package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class GenerateAuthTokenQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ GenerateAuthTokenQuery this$0;

    public GenerateAuthTokenQuery$variables$1$marshaller$$inlined$invoke$1(GenerateAuthTokenQuery generateAuthTokenQuery) {
        this.this$0 = generateAuthTokenQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("extCustomerId", this.this$0.getExtCustomerId());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("username", this.this$0.getUsername());
        gVar.mo23291a("authTokenType", this.this$0.getAuthTokenType().getRawValue());
    }
}
