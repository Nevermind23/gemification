package sso.queery;

import kotlin.jvm.internal.C41536l;
import p243s2.C8122n;
import p243s2.C8135p;
import sso.queery.LogOnboardingIdentificationErrorQuery;

/* renamed from: sso.queery.LogOnboardingIdentificationErrorQuery$LogOnboardingIdentificationError$marshaller$$inlined$invoke$1 */
public final class C42799x7cfe9c8b implements C8122n {
    final /* synthetic */ LogOnboardingIdentificationErrorQuery.LogOnboardingIdentificationError this$0;

    public C42799x7cfe9c8b(LogOnboardingIdentificationErrorQuery.LogOnboardingIdentificationError logOnboardingIdentificationError) {
        this.this$0 = logOnboardingIdentificationError;
    }

    public void marshal(C8135p pVar) {
        C41536l.m120490j(pVar, "writer");
        pVar.mo23319d(LogOnboardingIdentificationErrorQuery.LogOnboardingIdentificationError.RESPONSE_FIELDS[0], this.this$0.get__typename());
        pVar.mo23318c(LogOnboardingIdentificationErrorQuery.LogOnboardingIdentificationError.RESPONSE_FIELDS[1], this.this$0.getErrorCode());
        pVar.mo23319d(LogOnboardingIdentificationErrorQuery.LogOnboardingIdentificationError.RESPONSE_FIELDS[2], this.this$0.getErrorKey());
    }
}
