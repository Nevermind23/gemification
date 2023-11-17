package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetResetFlowTransactionsQuery;

/* renamed from: sso.queery.GetResetFlowTransactionsQuery$Contact$marshaller$$inlined$invoke$1 */
public final class C42740x7292fd35 implements C8122n {
    final /* synthetic */ GetResetFlowTransactionsQuery.Contact this$0;

    public C42740x7292fd35(GetResetFlowTransactionsQuery.Contact contact) {
        this.this$0 = contact;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[1], this.this$0.getAmount());
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[2], this.this$0.getCcy());
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[3], this.this$0.getDescription());
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[4], this.this$0.getEntryGroup());
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[5], this.this$0.getGroupNameGe());
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[6], this.this$0.getGroupNameInt());
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[7], this.this$0.getIdHash());
        pVar.mo23322g((C7846k.C7848b) GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[8], this.this$0.getOperationDate());
        pVar.mo23319d(GetResetFlowTransactionsQuery.Contact.RESPONSE_FIELDS[9], this.this$0.getTitle());
    }
}
