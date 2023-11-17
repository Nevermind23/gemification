package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class AuthQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ AuthQuery this$0;

    public AuthQuery$variables$1$marshaller$$inlined$invoke$1(AuthQuery authQuery) {
        this.this$0 = authQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("channel", this.this$0.getChannel());
        gVar.mo23291a("secret", this.this$0.getSecret());
    }
}
