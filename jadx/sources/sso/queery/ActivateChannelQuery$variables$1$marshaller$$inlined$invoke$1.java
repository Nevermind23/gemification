package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

public final class ActivateChannelQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ ActivateChannelQuery this$0;

    public ActivateChannelQuery$variables$1$marshaller$$inlined$invoke$1(ActivateChannelQuery activateChannelQuery) {
        this.this$0 = activateChannelQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getChannelId().f22756b) {
            gVar.mo23291a("channelId", (String) this.this$0.getChannelId().f22755a);
        }
        gVar.mo23291a("processReference", this.this$0.getProcessReference());
        if (this.this$0.getTmxSessionId().f22756b) {
            gVar.mo23291a("tmxSessionId", (String) this.this$0.getTmxSessionId().f22755a);
        }
    }
}
