package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.GetOnboardingAccessTokenQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42675xa5bbfe39 implements C8106f {
    final /* synthetic */ GetOnboardingAccessTokenQuery this$0;

    public C42675xa5bbfe39(GetOnboardingAccessTokenQuery getOnboardingAccessTokenQuery) {
        this.this$0 = getOnboardingAccessTokenQuery;
    }

    public void marshal(C8108g gVar) {
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("contactValue", this.this$0.getContactValue());
        gVar.mo23291a("flowKey", this.this$0.getFlowKey());
        gVar.mo23291a("personalNumber", this.this$0.getPersonalNumber());
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getXDeviceKey().f22756b) {
            gVar.mo23291a("xDeviceKey", (String) this.this$0.getXDeviceKey().f22755a);
        }
        if (this.this$0.getXUserAgent().f22756b) {
            gVar.mo23291a("xUserAgent", (String) this.this$0.getXUserAgent().f22755a);
        }
    }
}
