package sso.queery;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;

/* renamed from: sso.queery.ValidateOnboardingDataQuery$variables$1$marshaller$$inlined$invoke$1 */
public final class C42908xaf4780f0 implements C8106f {
    final /* synthetic */ ValidateOnboardingDataQuery this$0;

    public C42908xaf4780f0(ValidateOnboardingDataQuery validateOnboardingDataQuery) {
        this.this$0 = validateOnboardingDataQuery;
    }

    public void marshal(C8108g gVar) {
        C42912x4637335f r2;
        C42911xdd380e1c r22;
        C42910x7438e8d9 r23;
        C41536l.m120490j(gVar, "writer");
        gVar.mo23291a("xDeviceKey", this.this$0.getXDeviceKey());
        gVar.mo23291a("xUserAgent", this.this$0.getXUserAgent());
        gVar.mo23291a("accessToken", this.this$0.getAccessToken());
        C42909x61b4dfb7 r1 = null;
        if (this.this$0.getDocumentBackAuditTrailImages().f22756b) {
            List list = (List) this.this$0.getDocumentBackAuditTrailImages().f22755a;
            if (list != null) {
                C8108g.C8112c.C8113a aVar = C8108g.C8112c.f23265a;
                r23 = new C42910x7438e8d9(list);
            } else {
                r23 = null;
            }
            gVar.mo23296f("documentBackAuditTrailImages", r23);
        }
        if (this.this$0.getDocumentFrontAuditTrailImages().f22756b) {
            List list2 = (List) this.this$0.getDocumentFrontAuditTrailImages().f22755a;
            if (list2 != null) {
                C8108g.C8112c.C8113a aVar2 = C8108g.C8112c.f23265a;
                r22 = new C42911xdd380e1c(list2);
            } else {
                r22 = null;
            }
            gVar.mo23296f("documentFrontAuditTrailImages", r22);
        }
        if (this.this$0.getDocumentScan().f22756b) {
            gVar.mo23291a("documentScan", (String) this.this$0.getDocumentScan().f22755a);
        }
        if (this.this$0.getFaceAuditTrailImages().f22756b) {
            List list3 = (List) this.this$0.getFaceAuditTrailImages().f22755a;
            if (list3 != null) {
                C8108g.C8112c.C8113a aVar3 = C8108g.C8112c.f23265a;
                r2 = new C42912x4637335f(list3);
            } else {
                r2 = null;
            }
            gVar.mo23296f("faceAuditTrailImages", r2);
        }
        if (this.this$0.getFaceData().f22756b) {
            gVar.mo23291a("faceData", (String) this.this$0.getFaceData().f22755a);
        }
        if (this.this$0.getFaceLowQualityAuditTrailImages().f22756b) {
            List list4 = (List) this.this$0.getFaceLowQualityAuditTrailImages().f22755a;
            if (list4 != null) {
                C8108g.C8112c.C8113a aVar4 = C8108g.C8112c.f23265a;
                r1 = new C42909x61b4dfb7(list4);
            }
            gVar.mo23296f("faceLowQualityAuditTrailImages", r1);
        }
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getOperationReference().f22756b) {
            gVar.mo23291a("operationReference", (String) this.this$0.getOperationReference().f22755a);
        }
    }
}
