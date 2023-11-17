package sso.fragment;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;

public final class Token$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ Token this$0;

    public Token$marshaller$$inlined$invoke$1(Token token) {
        this.this$0 = token;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(Token.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(Token.RESPONSE_FIELDS[1], this.this$0.getKeycloakRefreshToken());
        pVar.mo23319d(Token.RESPONSE_FIELDS[2], this.this$0.getKeycloakToken());
    }
}
