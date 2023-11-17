package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetClientInfoQuery;
import sso.type.UserContactType;

public final class GetClientInfoQuery$ClientContact$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetClientInfoQuery.ClientContact this$0;

    public GetClientInfoQuery$ClientContact$marshaller$$inlined$invoke$1(GetClientInfoQuery.ClientContact clientContact) {
        this.this$0 = clientContact;
    }

    public void marshal(C8135p pVar) {
        String str;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetClientInfoQuery.ClientContact.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetClientInfoQuery.ClientContact.RESPONSE_FIELDS[1], this.this$0.getId());
        C7846k kVar = GetClientInfoQuery.ClientContact.RESPONSE_FIELDS[2];
        UserContactType type = this.this$0.getType();
        if (type != null) {
            str = type.getRawValue();
        } else {
            str = null;
        }
        pVar.mo23319d(kVar, str);
        pVar.mo23320e(GetClientInfoQuery.ClientContact.RESPONSE_FIELDS[3], this.this$0.getPreSelected());
        pVar.mo23320e(GetClientInfoQuery.ClientContact.RESPONSE_FIELDS[4], this.this$0.getFinancial());
        pVar.mo23319d(GetClientInfoQuery.ClientContact.RESPONSE_FIELDS[5], this.this$0.getContact());
    }
}
