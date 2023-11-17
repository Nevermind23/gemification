package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.LiabilityOverdueInfoApiModel */
public final class LiabilityOverdueInfoApiModel {
    private final List<ManagerInfoApiModel> clientManagerInfo;
    private final List<OverdueProductInfoApiModel> overdueProductsInfo;

    public LiabilityOverdueInfoApiModel(List<ManagerInfoApiModel> list, List<OverdueProductInfoApiModel> list2) {
        this.clientManagerInfo = list;
        this.overdueProductsInfo = list2;
    }

    public static /* synthetic */ LiabilityOverdueInfoApiModel copy$default(LiabilityOverdueInfoApiModel liabilityOverdueInfoApiModel, List<ManagerInfoApiModel> list, List<OverdueProductInfoApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liabilityOverdueInfoApiModel.clientManagerInfo;
        }
        if ((i & 2) != 0) {
            list2 = liabilityOverdueInfoApiModel.overdueProductsInfo;
        }
        return liabilityOverdueInfoApiModel.copy(list, list2);
    }

    public final List<ManagerInfoApiModel> component1() {
        return this.clientManagerInfo;
    }

    public final List<OverdueProductInfoApiModel> component2() {
        return this.overdueProductsInfo;
    }

    public final LiabilityOverdueInfoApiModel copy(List<ManagerInfoApiModel> list, List<OverdueProductInfoApiModel> list2) {
        return new LiabilityOverdueInfoApiModel(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiabilityOverdueInfoApiModel)) {
            return false;
        }
        LiabilityOverdueInfoApiModel liabilityOverdueInfoApiModel = (LiabilityOverdueInfoApiModel) obj;
        return C41536l.m120484d(this.clientManagerInfo, liabilityOverdueInfoApiModel.clientManagerInfo) && C41536l.m120484d(this.overdueProductsInfo, liabilityOverdueInfoApiModel.overdueProductsInfo);
    }

    public final List<ManagerInfoApiModel> getClientManagerInfo() {
        return this.clientManagerInfo;
    }

    public final List<OverdueProductInfoApiModel> getOverdueProductsInfo() {
        return this.overdueProductsInfo;
    }

    public int hashCode() {
        List<ManagerInfoApiModel> list = this.clientManagerInfo;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<OverdueProductInfoApiModel> list2 = this.overdueProductsInfo;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        List<ManagerInfoApiModel> list = this.clientManagerInfo;
        List<OverdueProductInfoApiModel> list2 = this.overdueProductsInfo;
        return "LiabilityOverdueInfoApiModel(clientManagerInfo=" + list + ", overdueProductsInfo=" + list2 + ")";
    }
}
