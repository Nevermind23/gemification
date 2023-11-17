package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetRegionsQuery;

/* renamed from: sso.queery.GetRegionsQuery$RegistrationServices$marshaller$$inlined$invoke$1 */
public final class C42717x9739e641 implements C8122n {
    final /* synthetic */ GetRegionsQuery.RegistrationServices this$0;

    public C42717x9739e641(GetRegionsQuery.RegistrationServices registrationServices) {
        this.this$0 = registrationServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetRegionsQuery.RegistrationServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetRegionsQuery.RegistrationServices.RESPONSE_FIELDS[1];
        GetRegionsQuery.GetRegions getRegions = this.this$0.getGetRegions();
        if (getRegions != null) {
            nVar = getRegions.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
