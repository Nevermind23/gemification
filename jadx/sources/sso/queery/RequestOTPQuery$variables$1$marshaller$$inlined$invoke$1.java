package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8106f;
import p243s2.C8108g;
import sso.type.UserContactType;

public final class RequestOTPQuery$variables$1$marshaller$$inlined$invoke$1 implements C8106f {
    final /* synthetic */ RequestOTPQuery this$0;

    public RequestOTPQuery$variables$1$marshaller$$inlined$invoke$1(RequestOTPQuery requestOTPQuery) {
        this.this$0 = requestOTPQuery;
    }

    public void marshal(C8108g gVar) {
        String str;
        C41536l.m120490j(gVar, "writer");
        if (this.this$0.getContact().f22756b) {
            gVar.mo23291a("contact", (String) this.this$0.getContact().f22755a);
        }
        if (this.this$0.getContactId().f22756b) {
            gVar.mo23291a("contactId", (String) this.this$0.getContactId().f22755a);
        }
        String str2 = null;
        if (this.this$0.getContactType().f22756b) {
            UserContactType userContactType = (UserContactType) this.this$0.getContactType().f22755a;
            if (userContactType != null) {
                str = userContactType.getRawValue();
            } else {
                str = null;
            }
            gVar.mo23291a("contactType", str);
        }
        if (this.this$0.getProcessReference().f22756b) {
            gVar.mo23291a("processReference", (String) this.this$0.getProcessReference().f22755a);
        }
        if (this.this$0.getManuallyEnteredContact().f22756b) {
            gVar.mo23291a("manuallyEnteredContact", (String) this.this$0.getManuallyEnteredContact().f22755a);
        }
        if (this.this$0.getManuallyEnteredContactType().f22756b) {
            UserContactType userContactType2 = (UserContactType) this.this$0.getManuallyEnteredContactType().f22755a;
            if (userContactType2 != null) {
                str2 = userContactType2.getRawValue();
            }
            gVar.mo23291a("manuallyEnteredContactType", str2);
        }
        if (this.this$0.getScaOperationReference().f22756b) {
            gVar.mo23291a("scaOperationReference", (String) this.this$0.getScaOperationReference().f22755a);
        }
    }
}
