package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.ChangeUserNameAndPasswordQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42600x880de0c1 implements C8106f {
    final /* synthetic */ ChangeUserNameAndPasswordQuery this$0;

    public C42600x880de0c1(ChangeUserNameAndPasswordQuery changeUserNameAndPasswordQuery) {
        this.this$0 = changeUserNameAndPasswordQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("userName", this.this$0.getUserName());
        gVar.mo23291a("password", this.this$0.getPassword());
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        gVar.mo23291a("tmxSessionId", this.this$0.getTmxSessionId());
    }
}
