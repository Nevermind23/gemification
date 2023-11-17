package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetOnboardingAppKeysQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetOnboardingAppKeysQuery$Data$Companion$invoke$1$registrationServices$1 */
final class C42684x76c15771 extends C41537m implements C43075l {
    public static final C42684x76c15771 INSTANCE = new C42684x76c15771();

    C42684x76c15771() {
        super(1);
    }

    public final GetOnboardingAppKeysQuery.RegistrationServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetOnboardingAppKeysQuery.RegistrationServices.Companion.invoke(oVar);
    }
}
