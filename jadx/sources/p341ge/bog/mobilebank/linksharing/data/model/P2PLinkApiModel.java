package p341ge.bog.mobilebank.linksharing.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.linksharing.data.model.P2PLinkApiModel */
public final class P2PLinkApiModel {
    private final Long acctKey;
    private final String acctNo;
    private final Long clientKey;
    private final String isLinkActive;
    private final String isLinkValid;
    private final Long linkEndDate;
    private final String linkNickName;
    private final String linkStatus;
    private final String linkUrl;

    public P2PLinkApiModel(Long l, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6) {
        this.clientKey = l;
        this.linkNickName = str;
        this.linkUrl = str2;
        this.isLinkActive = str3;
        this.isLinkValid = str4;
        this.linkStatus = str5;
        this.linkEndDate = l2;
        this.acctKey = l3;
        this.acctNo = str6;
    }

    public static /* synthetic */ P2PLinkApiModel copy$default(P2PLinkApiModel p2PLinkApiModel, Long l, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6, int i, Object obj) {
        P2PLinkApiModel p2PLinkApiModel2 = p2PLinkApiModel;
        int i2 = i;
        return p2PLinkApiModel.copy((i2 & 1) != 0 ? p2PLinkApiModel2.clientKey : l, (i2 & 2) != 0 ? p2PLinkApiModel2.linkNickName : str, (i2 & 4) != 0 ? p2PLinkApiModel2.linkUrl : str2, (i2 & 8) != 0 ? p2PLinkApiModel2.isLinkActive : str3, (i2 & 16) != 0 ? p2PLinkApiModel2.isLinkValid : str4, (i2 & 32) != 0 ? p2PLinkApiModel2.linkStatus : str5, (i2 & 64) != 0 ? p2PLinkApiModel2.linkEndDate : l2, (i2 & 128) != 0 ? p2PLinkApiModel2.acctKey : l3, (i2 & C11398b.f33139r) != 0 ? p2PLinkApiModel2.acctNo : str6);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.linkNickName;
    }

    public final String component3() {
        return this.linkUrl;
    }

    public final String component4() {
        return this.isLinkActive;
    }

    public final String component5() {
        return this.isLinkValid;
    }

    public final String component6() {
        return this.linkStatus;
    }

    public final Long component7() {
        return this.linkEndDate;
    }

    public final Long component8() {
        return this.acctKey;
    }

    public final String component9() {
        return this.acctNo;
    }

    public final P2PLinkApiModel copy(Long l, String str, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6) {
        return new P2PLinkApiModel(l, str, str2, str3, str4, str5, l2, l3, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PLinkApiModel)) {
            return false;
        }
        P2PLinkApiModel p2PLinkApiModel = (P2PLinkApiModel) obj;
        return C41536l.m120484d(this.clientKey, p2PLinkApiModel.clientKey) && C41536l.m120484d(this.linkNickName, p2PLinkApiModel.linkNickName) && C41536l.m120484d(this.linkUrl, p2PLinkApiModel.linkUrl) && C41536l.m120484d(this.isLinkActive, p2PLinkApiModel.isLinkActive) && C41536l.m120484d(this.isLinkValid, p2PLinkApiModel.isLinkValid) && C41536l.m120484d(this.linkStatus, p2PLinkApiModel.linkStatus) && C41536l.m120484d(this.linkEndDate, p2PLinkApiModel.linkEndDate) && C41536l.m120484d(this.acctKey, p2PLinkApiModel.acctKey) && C41536l.m120484d(this.acctNo, p2PLinkApiModel.acctNo);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final Long getLinkEndDate() {
        return this.linkEndDate;
    }

    public final String getLinkNickName() {
        return this.linkNickName;
    }

    public final String getLinkStatus() {
        return this.linkStatus;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.linkNickName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.isLinkActive;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.isLinkValid;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkStatus;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.linkEndDate;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.acctKey;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.acctNo;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    public final String isLinkActive() {
        return this.isLinkActive;
    }

    public final String isLinkValid() {
        return this.isLinkValid;
    }

    public String toString() {
        Long l = this.clientKey;
        String str = this.linkNickName;
        String str2 = this.linkUrl;
        String str3 = this.isLinkActive;
        String str4 = this.isLinkValid;
        String str5 = this.linkStatus;
        Long l2 = this.linkEndDate;
        Long l3 = this.acctKey;
        String str6 = this.acctNo;
        return "P2PLinkApiModel(clientKey=" + l + ", linkNickName=" + str + ", linkUrl=" + str2 + ", isLinkActive=" + str3 + ", isLinkValid=" + str4 + ", linkStatus=" + str5 + ", linkEndDate=" + l2 + ", acctKey=" + l3 + ", acctNo=" + str6 + ")";
    }
}
