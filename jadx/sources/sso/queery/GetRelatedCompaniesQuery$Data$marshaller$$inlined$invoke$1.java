package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetRelatedCompaniesQuery;

public final class GetRelatedCompaniesQuery$Data$marshaller$$inlined$invoke$1 implements C8122n {
    final /* synthetic */ GetRelatedCompaniesQuery.Data this$0;

    public GetRelatedCompaniesQuery$Data$marshaller$$inlined$invoke$1(GetRelatedCompaniesQuery.Data data) {
        this.this$0 = data;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        C7846k kVar = GetRelatedCompaniesQuery.Data.RESPONSE_FIELDS[0];
        GetRelatedCompaniesQuery.LoginServices loginServices = this.this$0.getLoginServices();
        if (loginServices != null) {
            nVar = loginServices.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
