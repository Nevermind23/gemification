package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetSettingsQuery;

public final class GetSettingsQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetSettingsQuery.Data this$0;

    public GetSettingsQuery$Data$marshaller$$inlined$invoke$1(GetSettingsQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = GetSettingsQuery.Data.RESPONSE_FIELDS[0];
        GetSettingsQuery.CommonServices commonServices = this.this$0.getCommonServices();
        if (commonServices != null) {
            nVar = commonServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
