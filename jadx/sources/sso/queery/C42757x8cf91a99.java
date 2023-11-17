package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.GetTMXProfilingParametersQuery;

/* renamed from: sso.queery.GetTMXProfilingParametersQuery$GetTMXProfilingParameters$marshaller$$inlined$invoke$1 */
public final class C42757x8cf91a99 implements C8122n {
    final /* synthetic */ GetTMXProfilingParametersQuery.GetTMXProfilingParameters this$0;

    public C42757x8cf91a99(GetTMXProfilingParametersQuery.GetTMXProfilingParameters getTMXProfilingParameters) {
        this.this$0 = getTMXProfilingParameters;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(GetTMXProfilingParametersQuery.GetTMXProfilingParameters.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23319d(GetTMXProfilingParametersQuery.GetTMXProfilingParameters.RESPONSE_FIELDS[1], this.this$0.getDomain());
        pVar.mo23319d(GetTMXProfilingParametersQuery.GetTMXProfilingParameters.RESPONSE_FIELDS[2], this.this$0.getOrgId());
        pVar.mo23319d(GetTMXProfilingParametersQuery.GetTMXProfilingParameters.RESPONSE_FIELDS[3], this.this$0.getSessionId());
    }
}
