package ne0;

import bf0.C19376a;
import bf0.C19377b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.termsandconditions.model.DisclosureTypeApiModel;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.termsandconditions.model.DisclosureTypesApiModel;

/* renamed from: ne0.a */
public final class C26456a {
    /* renamed from: a */
    public final C19377b mo65754a(DisclosureTypesApiModel disclosureTypesApiModel) {
        C41536l.m120489i(disclosureTypesApiModel, "data");
        List<DisclosureTypeApiModel> types = disclosureTypesApiModel.getTypes();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(types, 10));
        for (DisclosureTypeApiModel disclosureTypeApiModel : types) {
            arrayList.add(new C19376a(disclosureTypeApiModel.getType(), disclosureTypeApiModel.getName(), disclosureTypeApiModel.getLink()));
        }
        return new C19377b(arrayList, disclosureTypesApiModel.getCommissionsDisclosure());
    }
}
