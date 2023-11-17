package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetOnboardingAppKeysQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetOnboardingAppKeysQuery$RegistrationServices$Companion$invoke$1$getOnboardingAppKeys$1 */
final class C42685xfd45d8ab extends C41537m implements C43075l {
    public static final C42685xfd45d8ab INSTANCE = new C42685xfd45d8ab();

    C42685xfd45d8ab() {
        super(1);
    }

    public final GetOnboardingAppKeysQuery.GetOnboardingAppKeys invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetOnboardingAppKeysQuery.GetOnboardingAppKeys.Companion.invoke(oVar);
    }
}
