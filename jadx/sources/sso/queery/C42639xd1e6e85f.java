package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetCountriesQuery;
import ue1.C43075l;

/* renamed from: sso.queery.GetCountriesQuery$RegistrationServices$Companion$invoke$1$getCountries$1 */
final class C42639xd1e6e85f extends C41537m implements C43075l {
    public static final C42639xd1e6e85f INSTANCE = new C42639xd1e6e85f();

    C42639xd1e6e85f() {
        super(1);
    }

    public final GetCountriesQuery.GetCountries invoke(C8124o oVar) {
        C41536l.m120489i(oVar, "reader");
        return GetCountriesQuery.GetCountries.Companion.invoke(oVar);
    }
}
