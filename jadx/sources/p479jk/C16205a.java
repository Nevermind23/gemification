package p479jk;

import g91.C32289b0;
import g91.C32343x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.AutoLiabilityInsuranceProviderApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.LimitAmountApiModel;
import p563pk.C17371a;
import p563pk.C17377g;

/* renamed from: jk.a */
public final class C16205a {
    /* renamed from: a */
    public final List mo43220a(List list) {
        List list2 = list;
        C41536l.m120489i(list2, "providers");
        int i = 10;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AutoLiabilityInsuranceProviderApiModel autoLiabilityInsuranceProviderApiModel = (AutoLiabilityInsuranceProviderApiModel) it.next();
            String providerId = autoLiabilityInsuranceProviderApiModel.getProviderId();
            String F = C32343x.m95388F(autoLiabilityInsuranceProviderApiModel.getProviderName(), new Object[0]);
            String c = C32289b0.m95091c(autoLiabilityInsuranceProviderApiModel.getProviderLogoUrl());
            Double monthlyPayment = autoLiabilityInsuranceProviderApiModel.getMonthlyPayment();
            List<LimitAmountApiModel> limitAmounts = autoLiabilityInsuranceProviderApiModel.getLimitAmounts();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(limitAmounts, i));
            for (LimitAmountApiModel limitAmountApiModel : limitAmounts) {
                C17377g gVar = r10;
                C17377g gVar2 = new C17377g(limitAmountApiModel.getLimitAmount(), limitAmountApiModel.getPremiumAmount(), limitAmountApiModel.getPremiumCcy(), limitAmountApiModel.getMonthlyPremiumAmount(), limitAmountApiModel.getFirstMonthPremiumAmount());
                arrayList2.add(gVar);
            }
            arrayList.add(new C17371a(providerId, F, c, monthlyPayment, arrayList2));
            i = 10;
        }
        return arrayList;
    }
}
