package p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.RemittanceCreditInfoContractApiModel */
public final class RemittanceCreditInfoContractApiModel {
    private final String confirmationContractLogo;
    private final String confirmationContractText;
    private final String denyContractLogo;
    private final String denyContractText;
    private final String showContract;

    public RemittanceCreditInfoContractApiModel(String str, String str2, String str3, String str4, String str5) {
        this.showContract = str;
        this.confirmationContractLogo = str2;
        this.denyContractLogo = str3;
        this.confirmationContractText = str4;
        this.denyContractText = str5;
    }

    public static /* synthetic */ RemittanceCreditInfoContractApiModel copy$default(RemittanceCreditInfoContractApiModel remittanceCreditInfoContractApiModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remittanceCreditInfoContractApiModel.showContract;
        }
        if ((i & 2) != 0) {
            str2 = remittanceCreditInfoContractApiModel.confirmationContractLogo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = remittanceCreditInfoContractApiModel.denyContractLogo;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = remittanceCreditInfoContractApiModel.confirmationContractText;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = remittanceCreditInfoContractApiModel.denyContractText;
        }
        return remittanceCreditInfoContractApiModel.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.showContract;
    }

    public final String component2() {
        return this.confirmationContractLogo;
    }

    public final String component3() {
        return this.denyContractLogo;
    }

    public final String component4() {
        return this.confirmationContractText;
    }

    public final String component5() {
        return this.denyContractText;
    }

    public final RemittanceCreditInfoContractApiModel copy(String str, String str2, String str3, String str4, String str5) {
        return new RemittanceCreditInfoContractApiModel(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemittanceCreditInfoContractApiModel)) {
            return false;
        }
        RemittanceCreditInfoContractApiModel remittanceCreditInfoContractApiModel = (RemittanceCreditInfoContractApiModel) obj;
        return C41536l.m120484d(this.showContract, remittanceCreditInfoContractApiModel.showContract) && C41536l.m120484d(this.confirmationContractLogo, remittanceCreditInfoContractApiModel.confirmationContractLogo) && C41536l.m120484d(this.denyContractLogo, remittanceCreditInfoContractApiModel.denyContractLogo) && C41536l.m120484d(this.confirmationContractText, remittanceCreditInfoContractApiModel.confirmationContractText) && C41536l.m120484d(this.denyContractText, remittanceCreditInfoContractApiModel.denyContractText);
    }

    public final String getConfirmationContractLogo() {
        return this.confirmationContractLogo;
    }

    public final String getConfirmationContractText() {
        return this.confirmationContractText;
    }

    public final String getDenyContractLogo() {
        return this.denyContractLogo;
    }

    public final String getDenyContractText() {
        return this.denyContractText;
    }

    public final String getShowContract() {
        return this.showContract;
    }

    public int hashCode() {
        String str = this.showContract;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.confirmationContractLogo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.denyContractLogo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.confirmationContractText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.denyContractText;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.showContract;
        String str2 = this.confirmationContractLogo;
        String str3 = this.denyContractLogo;
        String str4 = this.confirmationContractText;
        String str5 = this.denyContractText;
        return "RemittanceCreditInfoContractApiModel(showContract=" + str + ", confirmationContractLogo=" + str2 + ", denyContractLogo=" + str3 + ", confirmationContractText=" + str4 + ", denyContractText=" + str5 + ")";
    }
}
