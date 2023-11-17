package bn0;

import hn0.C15538c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.kyc.data.network.model.KycDataApiModel;
import p341ge.bog.mobilebank.kyc.data.network.model.QuestCountry;

/* renamed from: bn0.b */
public final class C10341b {
    /* renamed from: a */
    public final List mo26948a(KycDataApiModel kycDataApiModel) {
        C41536l.m120489i(kycDataApiModel, "data");
        List<QuestCountry> questCountry = kycDataApiModel.getQuestCountry();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(questCountry, 10));
        for (QuestCountry questCountry2 : questCountry) {
            arrayList.add(new C15538c(questCountry2.getCountryCode(), questCountry2.getCountryName()));
        }
        return arrayList;
    }
}
