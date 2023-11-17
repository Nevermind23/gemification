package sso.type;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class InputUpdateUsernameRequest$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ InputUpdateUsernameRequest this$0;

    public InputUpdateUsernameRequest$marshaller$$inlined$invoke$1(InputUpdateUsernameRequest inputUpdateUsernameRequest) {
        this.this$0 = inputUpdateUsernameRequest;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getTmxSessionId().f22756b) {
            gVar.mo23291a("tmxSessionId", (String) this.this$0.getTmxSessionId().f22755a);
        }
        if (this.this$0.getUsername().f22756b) {
            gVar.mo23291a("username", (String) this.this$0.getUsername().f22755a);
        }
    }
}
