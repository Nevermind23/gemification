package ob1;

import com.salesforce.marketingcloud.storage.p385db.C11771j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.onboarding.model.AddressElementUiModel;
import p341ge.bog.sso_client.onboarding.model.AddressUiModel;
import p341ge.bog.sso_client.onboarding.model.LegalAddressUiModel;
import sso.queery.GetCountriesQuery;
import sso.queery.GetLegalAddressQuery;
import sso.queery.GetRegionsQuery;

/* renamed from: ob1.a */
public final class C37704a {
    /* renamed from: a */
    public final LegalAddressUiModel mo90898a(GetLegalAddressQuery.GetLegalAddress getLegalAddress) {
        AddressUiModel addressUiModel;
        if (getLegalAddress != null) {
            addressUiModel = new AddressUiModel(new AddressElementUiModel(String.valueOf(getLegalAddress.getCountry()), String.valueOf(getLegalAddress.getCountryDesc())), new AddressElementUiModel(String.valueOf(getLegalAddress.getRegion()), String.valueOf(getLegalAddress.getRegionDesc())), String.valueOf(getLegalAddress.getAddressLine()));
        } else {
            addressUiModel = null;
        }
        return new LegalAddressUiModel(addressUiModel);
    }

    /* renamed from: b */
    public final List mo90899b(GetCountriesQuery.GetCountries getCountries) {
        C41536l.m120489i(getCountries, "countries");
        List<GetCountriesQuery.Country> countries = getCountries.getCountries();
        if (countries == null) {
            countries = C41341q.m119907j();
        }
        List<GetCountriesQuery.Country> T = C41358y.m120004T(countries);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(T, 10));
        for (GetCountriesQuery.Country country : T) {
            arrayList.add(new AddressElementUiModel(String.valueOf(country.getCountry()), String.valueOf(country.getDescription())));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List mo90900c(GetRegionsQuery.GetRegions getRegions) {
        C41536l.m120489i(getRegions, C11771j.f34163e);
        List<GetRegionsQuery.Region> regions = getRegions.getRegions();
        if (regions == null) {
            regions = C41341q.m119907j();
        }
        List<GetRegionsQuery.Region> T = C41358y.m120004T(regions);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(T, 10));
        for (GetRegionsQuery.Region region : T) {
            arrayList.add(new AddressElementUiModel(String.valueOf(region.getRegion()), String.valueOf(region.getDescription())));
        }
        return arrayList;
    }
}
