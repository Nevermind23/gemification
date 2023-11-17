package p341ge.bog.mobilebank.openbanking.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.openbanking.data.model.BankApiModel */
public final class BankApiModel {
    private final String adapterId;
    private final String bankCode;
    private final String bic;

    /* renamed from: id */
    private final String f81412id;
    private final String idpUrl;
    private final boolean isActive;
    private final String name;
    private final String url;

    public BankApiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C41536l.m120489i(str, "adapterId");
        C41536l.m120489i(str2, "bankCode");
        C41536l.m120489i(str3, "bic");
        C41536l.m120489i(str4, "id");
        C41536l.m120489i(str6, "name");
        C41536l.m120489i(str7, C11769i.C11770a.f34149l);
        this.adapterId = str;
        this.bankCode = str2;
        this.bic = str3;
        this.f81412id = str4;
        this.idpUrl = str5;
        this.name = str6;
        this.url = str7;
        this.isActive = z;
    }

    public static /* synthetic */ BankApiModel copy$default(BankApiModel bankApiModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
        BankApiModel bankApiModel2 = bankApiModel;
        int i2 = i;
        return bankApiModel.copy((i2 & 1) != 0 ? bankApiModel2.adapterId : str, (i2 & 2) != 0 ? bankApiModel2.bankCode : str2, (i2 & 4) != 0 ? bankApiModel2.bic : str3, (i2 & 8) != 0 ? bankApiModel2.f81412id : str4, (i2 & 16) != 0 ? bankApiModel2.idpUrl : str5, (i2 & 32) != 0 ? bankApiModel2.name : str6, (i2 & 64) != 0 ? bankApiModel2.url : str7, (i2 & 128) != 0 ? bankApiModel2.isActive : z);
    }

    public final String component1() {
        return this.adapterId;
    }

    public final String component2() {
        return this.bankCode;
    }

    public final String component3() {
        return this.bic;
    }

    public final String component4() {
        return this.f81412id;
    }

    public final String component5() {
        return this.idpUrl;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.url;
    }

    public final boolean component8() {
        return this.isActive;
    }

    public final BankApiModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        C41536l.m120489i(str, "adapterId");
        C41536l.m120489i(str2, "bankCode");
        C41536l.m120489i(str3, "bic");
        C41536l.m120489i(str4, "id");
        String str8 = str6;
        C41536l.m120489i(str8, "name");
        String str9 = str7;
        C41536l.m120489i(str9, C11769i.C11770a.f34149l);
        return new BankApiModel(str, str2, str3, str4, str5, str8, str9, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankApiModel)) {
            return false;
        }
        BankApiModel bankApiModel = (BankApiModel) obj;
        return C41536l.m120484d(this.adapterId, bankApiModel.adapterId) && C41536l.m120484d(this.bankCode, bankApiModel.bankCode) && C41536l.m120484d(this.bic, bankApiModel.bic) && C41536l.m120484d(this.f81412id, bankApiModel.f81412id) && C41536l.m120484d(this.idpUrl, bankApiModel.idpUrl) && C41536l.m120484d(this.name, bankApiModel.name) && C41536l.m120484d(this.url, bankApiModel.url) && this.isActive == bankApiModel.isActive;
    }

    public final String getAdapterId() {
        return this.adapterId;
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final String getBic() {
        return this.bic;
    }

    public final String getId() {
        return this.f81412id;
    }

    public final String getIdpUrl() {
        return this.idpUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((((((this.adapterId.hashCode() * 31) + this.bankCode.hashCode()) * 31) + this.bic.hashCode()) * 31) + this.f81412id.hashCode()) * 31;
        String str = this.idpUrl;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31;
        boolean z = this.isActive;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.adapterId;
        String str2 = this.bankCode;
        String str3 = this.bic;
        String str4 = this.f81412id;
        String str5 = this.idpUrl;
        String str6 = this.name;
        String str7 = this.url;
        boolean z = this.isActive;
        return "BankApiModel(adapterId=" + str + ", bankCode=" + str2 + ", bic=" + str3 + ", id=" + str4 + ", idpUrl=" + str5 + ", name=" + str6 + ", url=" + str7 + ", isActive=" + z + ")";
    }
}
