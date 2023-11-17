package qa1;

import bd1.C40326a;
import ed1.C40762x;
import hb1.C36175k;
import kotlin.jvm.internal.C41536l;
import p217q2.C7843j;
import sso.queery.GetTMXProfilingParametersQuery;
import ue1.C43075l;

/* renamed from: qa1.c1 */
public final class C27709c1 implements C40326a {

    /* renamed from: a */
    private final C36175k f70824a;

    public C27709c1(C36175k kVar) {
        C41536l.m120489i(kVar, "apolloRxFactory");
        this.f70824a = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final String m85731c(C7843j jVar) {
        String str;
        GetTMXProfilingParametersQuery.ScaServices scaServices;
        GetTMXProfilingParametersQuery.GetTMXProfilingParameters getTMXProfilingParameters;
        C41536l.m120489i(jVar, "it");
        GetTMXProfilingParametersQuery.Data data = (GetTMXProfilingParametersQuery.Data) jVar.mo22784b();
        if (data == null || (scaServices = data.getScaServices()) == null || (getTMXProfilingParameters = scaServices.getGetTMXProfilingParameters()) == null) {
            str = null;
        } else {
            str = getTMXProfilingParameters.getSessionId();
        }
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Invalid token".toString());
    }

    /* renamed from: a */
    public C40762x mo67257a() {
        C40762x A = C36175k.m107584j(this.f70824a, new GetTMXProfilingParametersQuery(), false, (C43075l) null, 6, (Object) null).mo95062A(new C27706b1());
        C41536l.m120488h(A, "apolloRxFactory.createSi…nvalid token\" }\n        }");
        return A;
    }
}
