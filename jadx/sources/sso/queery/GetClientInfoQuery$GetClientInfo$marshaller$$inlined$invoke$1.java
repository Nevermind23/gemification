package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetClientInfoQuery;

public final class GetClientInfoQuery$GetClientInfo$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetClientInfoQuery.GetClientInfo this$0;

    public GetClientInfoQuery$GetClientInfo$marshaller$$inlined$invoke$1(GetClientInfoQuery.GetClientInfo getClientInfo) {
        this.this$0 = getClientInfo;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[1], this.this$0.getAddress());
        pVar.mo23319d(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[2], this.this$0.getFirstName());
        pVar.mo23319d(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[3], this.this$0.getLastName());
        pVar.mo23319d(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[4], this.this$0.getUsername());
        pVar.mo23319d(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[5], this.this$0.getImageURL());
        pVar.mo23320e(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[6], this.this$0.getProfilePictureStatus());
        pVar.mo23320e(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[7], this.this$0.isDefaultImage());
        pVar.mo23316a(GetClientInfoQuery.GetClientInfo.RESPONSE_FIELDS[8], this.this$0.getClientContacts(), GetClientInfoQuery$GetClientInfo$marshaller$1$1.INSTANCE);
    }
}
