package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetTurnoverTypesQuery;

/* renamed from: sso.queery.GetTurnoverTypesQuery$GetTurnoverType$marshaller$$inlined$invoke$1 */
public final class C42765xc20af06a implements C8122n {
    final /* synthetic */ GetTurnoverTypesQuery.GetTurnoverType this$0;

    public C42765xc20af06a(GetTurnoverTypesQuery.GetTurnoverType getTurnoverType) {
        this.this$0 = getTurnoverType;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetTurnoverTypesQuery.GetTurnoverType.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23322g((C7846k.C7848b) GetTurnoverTypesQuery.GetTurnoverType.RESPONSE_FIELDS[1], this.this$0.getId());
        pVar.mo23319d(GetTurnoverTypesQuery.GetTurnoverType.RESPONSE_FIELDS[2], this.this$0.getCode());
        pVar.mo23319d(GetTurnoverTypesQuery.GetTurnoverType.RESPONSE_FIELDS[3], this.this$0.getDescription());
        pVar.mo23319d(GetTurnoverTypesQuery.GetTurnoverType.RESPONSE_FIELDS[4], this.this$0.getType());
    }
}
