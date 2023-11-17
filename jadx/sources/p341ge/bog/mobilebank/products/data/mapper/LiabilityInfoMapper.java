package p341ge.bog.mobilebank.products.data.mapper;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.products.data.model.LiabilityOverdueInfoApiModel;
import p341ge.bog.mobilebank.products.data.model.ManagerInfoApiModel;
import p341ge.bog.mobilebank.products.data.model.OverdueProductInfoApiModel;
import p70.C27239a;
import p70.C27240b;
import p70.C27241c;

/* renamed from: ge.bog.mobilebank.products.data.mapper.LiabilityInfoMapper */
public final class LiabilityInfoMapper {
    public final C27239a convert(LiabilityOverdueInfoApiModel liabilityOverdueInfoApiModel) {
        ArrayList arrayList;
        C41536l.m120489i(liabilityOverdueInfoApiModel, "data");
        List<ManagerInfoApiModel> clientManagerInfo = liabilityOverdueInfoApiModel.getClientManagerInfo();
        ArrayList arrayList2 = null;
        if (clientManagerInfo != null) {
            arrayList = new ArrayList(C41343r.m119925u(clientManagerInfo, 10));
            for (ManagerInfoApiModel convert : clientManagerInfo) {
                arrayList.add(convert(convert));
            }
        } else {
            arrayList = null;
        }
        List<OverdueProductInfoApiModel> overdueProductsInfo = liabilityOverdueInfoApiModel.getOverdueProductsInfo();
        if (overdueProductsInfo != null) {
            arrayList2 = new ArrayList(C41343r.m119925u(overdueProductsInfo, 10));
            for (OverdueProductInfoApiModel convert2 : overdueProductsInfo) {
                arrayList2.add(convert(convert2));
            }
        }
        return new C27239a(arrayList, arrayList2);
    }

    public final C27240b convert(ManagerInfoApiModel managerInfoApiModel) {
        C41536l.m120489i(managerInfoApiModel, "data");
        return new C27240b(managerInfoApiModel.getClientKey(), managerInfoApiModel.getManagerFirstName(), managerInfoApiModel.getManagerPhoneNumber());
    }

    public final C27241c convert(OverdueProductInfoApiModel overdueProductInfoApiModel) {
        C41536l.m120489i(overdueProductInfoApiModel, "data");
        return new C27241c(overdueProductInfoApiModel.getId(), overdueProductInfoApiModel.getProductCode(), overdueProductInfoApiModel.getCcy(), overdueProductInfoApiModel.getOverdueAmount());
    }
}
