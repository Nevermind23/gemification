package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetUserContactsQuery;
import sso.type.UserContactType;

public final class GetUserContactsQuery$GetUserContact$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetUserContactsQuery.GetUserContact this$0;

    public GetUserContactsQuery$GetUserContact$marshaller$$inlined$invoke$1(GetUserContactsQuery.GetUserContact getUserContact) {
        this.this$0 = getUserContact;
    }

    public void marshal(C8135p pVar) {
        String str;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetUserContactsQuery.GetUserContact.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23320e(GetUserContactsQuery.GetUserContact.RESPONSE_FIELDS[1], this.this$0.getPreSelected());
        pVar.mo23319d(GetUserContactsQuery.GetUserContact.RESPONSE_FIELDS[2], this.this$0.getContact());
        pVar.mo23320e(GetUserContactsQuery.GetUserContact.RESPONSE_FIELDS[3], this.this$0.getFinancial());
        pVar.mo23319d(GetUserContactsQuery.GetUserContact.RESPONSE_FIELDS[4], this.this$0.getId());
        C7846k kVar = GetUserContactsQuery.GetUserContact.RESPONSE_FIELDS[5];
        UserContactType type = this.this$0.getType();
        if (type != null) {
            str = type.getRawValue();
        } else {
            str = null;
        }
        pVar.mo23319d(kVar, str);
    }
}
