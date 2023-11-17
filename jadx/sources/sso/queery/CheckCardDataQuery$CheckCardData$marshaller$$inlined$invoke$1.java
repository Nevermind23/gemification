package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.CheckCardDataQuery;

public final class CheckCardDataQuery$CheckCardData$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ CheckCardDataQuery.CheckCardData this$0;

    public CheckCardDataQuery$CheckCardData$marshaller$$inlined$invoke$1(CheckCardDataQuery.CheckCardData checkCardData) {
        this.this$0 = checkCardData;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(CheckCardDataQuery.CheckCardData.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(CheckCardDataQuery.CheckCardData.RESPONSE_FIELDS[1], this.this$0.getProcessReference());
        pVar.mo23322g((C7846k.C7848b) CheckCardDataQuery.CheckCardData.RESPONSE_FIELDS[2], this.this$0.getUserId());
    }
}
