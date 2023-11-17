package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class SetPassCodeQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ SetPassCodeQuery this$0;

    public SetPassCodeQuery$variables$1$marshaller$$inlined$invoke$1(SetPassCodeQuery setPassCodeQuery) {
        this.this$0 = setPassCodeQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("passCode", this.this$0.getPassCode());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("userName", this.this$0.getUserName());
    }
}
