package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class GetUserContactsQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ GetUserContactsQuery this$0;

    public GetUserContactsQuery$variables$1$marshaller$$inlined$invoke$1(GetUserContactsQuery getUserContactsQuery) {
        this.this$0 = getUserContactsQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        if (this.this$0.getPreSelectedContact().f22756b) {
            gVar.mo23291a("preSelectedContact", (String) this.this$0.getPreSelectedContact().f22755a);
        }
    }
}
