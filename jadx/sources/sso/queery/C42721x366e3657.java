package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetRelatedCompaniesQuery;
import sso.type.StrongAuthMethod;

/* renamed from: sso.queery.GetRelatedCompaniesQuery$GetRelatedCompany$marshaller$$inlined$invoke$1 */
public final class C42721x366e3657 implements C8122n {
    final /* synthetic */ GetRelatedCompaniesQuery.GetRelatedCompany this$0;

    public C42721x366e3657(GetRelatedCompaniesQuery.GetRelatedCompany getRelatedCompany) {
        this.this$0 = getRelatedCompany;
    }

    public void marshal(C8135p pVar) {
        String str;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetRelatedCompaniesQuery.GetRelatedCompany.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23322g((C7846k.C7848b) GetRelatedCompaniesQuery.GetRelatedCompany.RESPONSE_FIELDS[1], this.this$0.getClientKey());
        pVar.mo23319d(GetRelatedCompaniesQuery.GetRelatedCompany.RESPONSE_FIELDS[2], this.this$0.getClientName());
        pVar.mo23319d(GetRelatedCompaniesQuery.GetRelatedCompany.RESPONSE_FIELDS[3], this.this$0.getIcon());
        pVar.mo23320e(GetRelatedCompaniesQuery.GetRelatedCompany.RESPONSE_FIELDS[4], this.this$0.isStrongAuthRequired());
        C7846k kVar = GetRelatedCompaniesQuery.GetRelatedCompany.RESPONSE_FIELDS[5];
        StrongAuthMethod strongAuthMethod = this.this$0.getStrongAuthMethod();
        if (strongAuthMethod != null) {
            str = strongAuthMethod.getRawValue();
        } else {
            str = null;
        }
        pVar.mo23319d(kVar, str);
    }
}
