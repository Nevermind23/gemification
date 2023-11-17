package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.OpenBankProductApiModel */
public final class OpenBankProductApiModel {
    private final String aspspId;
    private final String aspspName;
    private final String bankBic;
    private final String consentId;
    private final List<OpenBankAccountApiModel> data;
    private final long expirationDate;
    private final boolean isExpired;
    private final long lastUpdateTime;

    public OpenBankProductApiModel(String str, String str2, String str3, String str4, long j, long j2, boolean z, List<OpenBankAccountApiModel> list) {
        C41536l.m120489i(str, "aspspId");
        C41536l.m120489i(str3, "bankBic");
        C41536l.m120489i(str4, "consentId");
        C41536l.m120489i(list, "data");
        this.aspspId = str;
        this.aspspName = str2;
        this.bankBic = str3;
        this.consentId = str4;
        this.lastUpdateTime = j;
        this.expirationDate = j2;
        this.isExpired = z;
        this.data = list;
    }

    public static /* synthetic */ OpenBankProductApiModel copy$default(OpenBankProductApiModel openBankProductApiModel, String str, String str2, String str3, String str4, long j, long j2, boolean z, List list, int i, Object obj) {
        OpenBankProductApiModel openBankProductApiModel2 = openBankProductApiModel;
        int i2 = i;
        return openBankProductApiModel.copy((i2 & 1) != 0 ? openBankProductApiModel2.aspspId : str, (i2 & 2) != 0 ? openBankProductApiModel2.aspspName : str2, (i2 & 4) != 0 ? openBankProductApiModel2.bankBic : str3, (i2 & 8) != 0 ? openBankProductApiModel2.consentId : str4, (i2 & 16) != 0 ? openBankProductApiModel2.lastUpdateTime : j, (i2 & 32) != 0 ? openBankProductApiModel2.expirationDate : j2, (i2 & 64) != 0 ? openBankProductApiModel2.isExpired : z, (i2 & 128) != 0 ? openBankProductApiModel2.data : list);
    }

    public final String component1() {
        return this.aspspId;
    }

    public final String component2() {
        return this.aspspName;
    }

    public final String component3() {
        return this.bankBic;
    }

    public final String component4() {
        return this.consentId;
    }

    public final long component5() {
        return this.lastUpdateTime;
    }

    public final long component6() {
        return this.expirationDate;
    }

    public final boolean component7() {
        return this.isExpired;
    }

    public final List<OpenBankAccountApiModel> component8() {
        return this.data;
    }

    public final OpenBankProductApiModel copy(String str, String str2, String str3, String str4, long j, long j2, boolean z, List<OpenBankAccountApiModel> list) {
        C41536l.m120489i(str, "aspspId");
        C41536l.m120489i(str3, "bankBic");
        String str5 = str4;
        C41536l.m120489i(str5, "consentId");
        List<OpenBankAccountApiModel> list2 = list;
        C41536l.m120489i(list2, "data");
        return new OpenBankProductApiModel(str, str2, str3, str5, j, j2, z, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenBankProductApiModel)) {
            return false;
        }
        OpenBankProductApiModel openBankProductApiModel = (OpenBankProductApiModel) obj;
        return C41536l.m120484d(this.aspspId, openBankProductApiModel.aspspId) && C41536l.m120484d(this.aspspName, openBankProductApiModel.aspspName) && C41536l.m120484d(this.bankBic, openBankProductApiModel.bankBic) && C41536l.m120484d(this.consentId, openBankProductApiModel.consentId) && this.lastUpdateTime == openBankProductApiModel.lastUpdateTime && this.expirationDate == openBankProductApiModel.expirationDate && this.isExpired == openBankProductApiModel.isExpired && C41536l.m120484d(this.data, openBankProductApiModel.data);
    }

    public final String getAspspId() {
        return this.aspspId;
    }

    public final String getAspspName() {
        return this.aspspName;
    }

    public final String getBankBic() {
        return this.bankBic;
    }

    public final String getConsentId() {
        return this.consentId;
    }

    public final List<OpenBankAccountApiModel> getData() {
        return this.data;
    }

    public final long getExpirationDate() {
        return this.expirationDate;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public int hashCode() {
        int hashCode = this.aspspId.hashCode() * 31;
        String str = this.aspspName;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bankBic.hashCode()) * 31) + this.consentId.hashCode()) * 31) + C7397t.m28148a(this.lastUpdateTime)) * 31) + C7397t.m28148a(this.expirationDate)) * 31;
        boolean z = this.isExpired;
        if (z) {
            z = true;
        }
        return ((hashCode2 + (z ? 1 : 0)) * 31) + this.data.hashCode();
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public String toString() {
        String str = this.aspspId;
        String str2 = this.aspspName;
        String str3 = this.bankBic;
        String str4 = this.consentId;
        long j = this.lastUpdateTime;
        long j2 = this.expirationDate;
        boolean z = this.isExpired;
        List<OpenBankAccountApiModel> list = this.data;
        return "OpenBankProductApiModel(aspspId=" + str + ", aspspName=" + str2 + ", bankBic=" + str3 + ", consentId=" + str4 + ", lastUpdateTime=" + j + ", expirationDate=" + j2 + ", isExpired=" + z + ", data=" + list + ")";
    }
}
