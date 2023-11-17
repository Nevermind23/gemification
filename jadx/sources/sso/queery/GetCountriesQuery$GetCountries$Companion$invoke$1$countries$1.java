package sso.queery;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p243s2.C8124o;
import sso.queery.GetCountriesQuery;
import ue1.C43075l;

final class GetCountriesQuery$GetCountries$Companion$invoke$1$countries$1 extends C41537m implements C43075l {
    public static final GetCountriesQuery$GetCountries$Companion$invoke$1$countries$1 INSTANCE = new GetCountriesQuery$GetCountries$Companion$invoke$1$countries$1();

    GetCountriesQuery$GetCountries$Companion$invoke$1$countries$1() {
        super(1);
    }

    public final GetCountriesQuery.Country invoke(C8124o.C8129b bVar) {
        C41536l.m120489i(bVar, "reader");
        return (GetCountriesQuery.Country) bVar.mo19033b(C426381.INSTANCE);
    }
}
