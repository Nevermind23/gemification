package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetOnboardingIdentomatSessionTokenQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetOnboardingIdentomatSessionTokenQuery$Data$Companion$invoke$1$registrationServices$1 */
final class C42695x55b60820 extends C41537m implements C43075l {
    public static final C42695x55b60820 INSTANCE = new C42695x55b60820();

    C42695x55b60820() {
        super(1);
    }

    public final GetOnboardingIdentomatSessionTokenQuery.RegistrationServices invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetOnboardingIdentomatSessionTokenQuery.RegistrationServices.Companion.invoke(oVar);
    }
}
