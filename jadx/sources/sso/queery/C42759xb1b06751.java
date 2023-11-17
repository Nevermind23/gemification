package sso.queery;

import kotlin.jvm.internal.C41536l;
import p217q2.C7846k;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetTMXProfilingParametersQuery;

/* renamed from: sso.queery.GetTMXProfilingParametersQuery$ScaServices$marshaller$$inlined$invoke$1 */
public final class C42759xb1b06751 implements C8122n {
    final /* synthetic */ GetTMXProfilingParametersQuery.ScaServices this$0;

    public C42759xb1b06751(GetTMXProfilingParametersQuery.ScaServices scaServices) {
        this.this$0 = scaServices;
    }

    public void marshal(C8135p pVar) {
        C8122n nVar;
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetTMXProfilingParametersQuery.ScaServices.RESPONSE_FIELDS[0], this.this$0.get__typename());
        C7846k kVar = GetTMXProfilingParametersQuery.ScaServices.RESPONSE_FIELDS[1];
        GetTMXProfilingParametersQuery.GetTMXProfilingParameters getTMXProfilingParameters = this.this$0.getGetTMXProfilingParameters();
        if (getTMXProfilingParameters != null) {
            nVar = getTMXProfilingParameters.marshaller();
        } else {
            nVar = null;
        }
        pVar.mo23321f(kVar, nVar);
    }
}
