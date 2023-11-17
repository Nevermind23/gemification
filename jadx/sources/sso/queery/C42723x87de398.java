package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetRelatedCompaniesQuery;

/* renamed from: sso.queery.GetRelatedCompaniesQuery$LoginServices$marshaller$$inlined$invoke$1 */
public final class C42723x87de398 implements C8122n {
    final /* synthetic */ GetRelatedCompaniesQuery.LoginServices this$0;

    public C42723x87de398(GetRelatedCompaniesQuery.LoginServices loginServices) {
        this.this$0 = loginServices;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetRelatedCompaniesQuery.LoginServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23316a(GetRelatedCompaniesQuery.LoginServices.RESPONSE_FIELDS[1], this.this$0.getGetRelatedCompanies(), GetRelatedCompaniesQuery$LoginServices$marshaller$1$1.INSTANCE);
    }
}
