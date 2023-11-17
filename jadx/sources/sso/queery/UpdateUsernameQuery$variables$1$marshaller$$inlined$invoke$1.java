package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;
import sso.type.InputUpdateUsernameRequest;

public final class UpdateUsernameQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ UpdateUsernameQuery this$0;

    public UpdateUsernameQuery$variables$1$marshaller$$inlined$invoke$1(UpdateUsernameQuery updateUsernameQuery) {
        this.this$0 = updateUsernameQuery;
    }

    public void marshal(C8108g gVar) {
        C8106f fVar;
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getRequest().f22756b) {
            InputUpdateUsernameRequest inputUpdateUsernameRequest = (InputUpdateUsernameRequest) this.this$0.getRequest().f22755a;
            if (inputUpdateUsernameRequest != null) {
                fVar = inputUpdateUsernameRequest.marshaller();
            } else {
                fVar = null;
            }
            gVar.mo23293c("request", fVar);
        }
    }
}
