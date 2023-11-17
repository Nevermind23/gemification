package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetOnboardingAccessTokenQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetOnboardingAccessTokenQuery$RegistrationServices$Companion$invoke$1$getOnboardingAccessToken$1 */
final class C42677x31e8ab2b extends C41537m implements C43075l {
    public static final C42677x31e8ab2b INSTANCE = new C42677x31e8ab2b();

    C42677x31e8ab2b() {
        super(1);
    }

    public final GetOnboardingAccessTokenQuery.GetOnboardingAccessToken invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetOnboardingAccessTokenQuery.GetOnboardingAccessToken.Companion.invoke(oVar);
    }
}
