package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.ManagerInfoApiModel */
public final class ManagerInfoApiModel {
    private final Long clientKey;
    private final String managerFirstName;
    private final String managerPhoneNumber;

    public ManagerInfoApiModel(Long l, String str, String str2) {
        this.clientKey = l;
        this.managerFirstName = str;
        this.managerPhoneNumber = str2;
    }

    public static /* synthetic */ ManagerInfoApiModel copy$default(ManagerInfoApiModel managerInfoApiModel, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = managerInfoApiModel.clientKey;
        }
        if ((i & 2) != 0) {
            str = managerInfoApiModel.managerFirstName;
        }
        if ((i & 4) != 0) {
            str2 = managerInfoApiModel.managerPhoneNumber;
        }
        return managerInfoApiModel.copy(l, str, str2);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.managerFirstName;
    }

    public final String component3() {
        return this.managerPhoneNumber;
    }

    public final ManagerInfoApiModel copy(Long l, String str, String str2) {
        return new ManagerInfoApiModel(l, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagerInfoApiModel)) {
            return false;
        }
        ManagerInfoApiModel managerInfoApiModel = (ManagerInfoApiModel) obj;
        return C41536l.m120484d(this.clientKey, managerInfoApiModel.clientKey) && C41536l.m120484d(this.managerFirstName, managerInfoApiModel.managerFirstName) && C41536l.m120484d(this.managerPhoneNumber, managerInfoApiModel.managerPhoneNumber);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getManagerFirstName() {
        return this.managerFirstName;
    }

    public final String getManagerPhoneNumber() {
        return this.managerPhoneNumber;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.managerFirstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.managerPhoneNumber;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.clientKey;
        String str = this.managerFirstName;
        String str2 = this.managerPhoneNumber;
        return "ManagerInfoApiModel(clientKey=" + l + ", managerFirstName=" + str + ", managerPhoneNumber=" + str2 + ")";
    }
}
