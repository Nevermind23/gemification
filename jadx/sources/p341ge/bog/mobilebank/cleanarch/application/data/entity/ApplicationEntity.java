package p341ge.bog.mobilebank.cleanarch.application.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.model.CardApplicationDetails;
import p341ge.bog.mobilebank.model.deposits.DepositAppDetails;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.application.data.entity.ApplicationEntity */
public final class ApplicationEntity {
    private final long appId;
    private final String appType;
    private final CardApplicationDetails cardDetails;
    private final long clientKey;
    private final long createDate;
    private final String deleted;
    private final DepositAppDetails depositDetails;
    private final String dictionaryKey;
    private final Long expDate;
    private final CreditAppLoanDetailsEntity loanDetails;
    private final String prodType;
    private final long resultCode;
    private final String status;

    public ApplicationEntity(long j, String str, String str2, long j2, String str3, long j3, Long l, String str4, long j4, String str5, DepositAppDetails depositAppDetails, CardApplicationDetails cardApplicationDetails, CreditAppLoanDetailsEntity creditAppLoanDetailsEntity) {
        this.appId = j;
        this.appType = str;
        this.status = str2;
        this.resultCode = j2;
        this.deleted = str3;
        this.clientKey = j3;
        this.expDate = l;
        this.prodType = str4;
        this.createDate = j4;
        this.dictionaryKey = str5;
        this.depositDetails = depositAppDetails;
        this.cardDetails = cardApplicationDetails;
        this.loanDetails = creditAppLoanDetailsEntity;
    }

    public static /* synthetic */ ApplicationEntity copy$default(ApplicationEntity applicationEntity, long j, String str, String str2, long j2, String str3, long j3, Long l, String str4, long j4, String str5, DepositAppDetails depositAppDetails, CardApplicationDetails cardApplicationDetails, CreditAppLoanDetailsEntity creditAppLoanDetailsEntity, int i, Object obj) {
        ApplicationEntity applicationEntity2 = applicationEntity;
        int i2 = i;
        return applicationEntity.copy((i2 & 1) != 0 ? applicationEntity2.appId : j, (i2 & 2) != 0 ? applicationEntity2.appType : str, (i2 & 4) != 0 ? applicationEntity2.status : str2, (i2 & 8) != 0 ? applicationEntity2.resultCode : j2, (i2 & 16) != 0 ? applicationEntity2.deleted : str3, (i2 & 32) != 0 ? applicationEntity2.clientKey : j3, (i2 & 64) != 0 ? applicationEntity2.expDate : l, (i2 & 128) != 0 ? applicationEntity2.prodType : str4, (i2 & C11398b.f33139r) != 0 ? applicationEntity2.createDate : j4, (i2 & C11398b.f33140s) != 0 ? applicationEntity2.dictionaryKey : str5, (i2 & C11398b.f33141t) != 0 ? applicationEntity2.depositDetails : depositAppDetails, (i2 & C11398b.f33142u) != 0 ? applicationEntity2.cardDetails : cardApplicationDetails, (i2 & C11398b.f33143v) != 0 ? applicationEntity2.loanDetails : creditAppLoanDetailsEntity);
    }

    public final long component1() {
        return this.appId;
    }

    public final String component10() {
        return this.dictionaryKey;
    }

    public final DepositAppDetails component11() {
        return this.depositDetails;
    }

    public final CardApplicationDetails component12() {
        return this.cardDetails;
    }

    public final CreditAppLoanDetailsEntity component13() {
        return this.loanDetails;
    }

    public final String component2() {
        return this.appType;
    }

    public final String component3() {
        return this.status;
    }

    public final long component4() {
        return this.resultCode;
    }

    public final String component5() {
        return this.deleted;
    }

    public final long component6() {
        return this.clientKey;
    }

    public final Long component7() {
        return this.expDate;
    }

    public final String component8() {
        return this.prodType;
    }

    public final long component9() {
        return this.createDate;
    }

    public final ApplicationEntity copy(long j, String str, String str2, long j2, String str3, long j3, Long l, String str4, long j4, String str5, DepositAppDetails depositAppDetails, CardApplicationDetails cardApplicationDetails, CreditAppLoanDetailsEntity creditAppLoanDetailsEntity) {
        return new ApplicationEntity(j, str, str2, j2, str3, j3, l, str4, j4, str5, depositAppDetails, cardApplicationDetails, creditAppLoanDetailsEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationEntity)) {
            return false;
        }
        ApplicationEntity applicationEntity = (ApplicationEntity) obj;
        return this.appId == applicationEntity.appId && C41536l.m120484d(this.appType, applicationEntity.appType) && C41536l.m120484d(this.status, applicationEntity.status) && this.resultCode == applicationEntity.resultCode && C41536l.m120484d(this.deleted, applicationEntity.deleted) && this.clientKey == applicationEntity.clientKey && C41536l.m120484d(this.expDate, applicationEntity.expDate) && C41536l.m120484d(this.prodType, applicationEntity.prodType) && this.createDate == applicationEntity.createDate && C41536l.m120484d(this.dictionaryKey, applicationEntity.dictionaryKey) && C41536l.m120484d(this.depositDetails, applicationEntity.depositDetails) && C41536l.m120484d(this.cardDetails, applicationEntity.cardDetails) && C41536l.m120484d(this.loanDetails, applicationEntity.loanDetails);
    }

    public final long getAppId() {
        return this.appId;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final CardApplicationDetails getCardDetails() {
        return this.cardDetails;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getCreateDate() {
        return this.createDate;
    }

    public final String getDeleted() {
        return this.deleted;
    }

    public final DepositAppDetails getDepositDetails() {
        return this.depositDetails;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final Long getExpDate() {
        return this.expDate;
    }

    public final CreditAppLoanDetailsEntity getLoanDetails() {
        return this.loanDetails;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final long getResultCode() {
        return this.resultCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.appId) * 31;
        String str = this.appType;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.resultCode)) * 31;
        String str3 = this.deleted;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + C7397t.m28148a(this.clientKey)) * 31;
        Long l = this.expDate;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.prodType;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + C7397t.m28148a(this.createDate)) * 31;
        String str5 = this.dictionaryKey;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DepositAppDetails depositAppDetails = this.depositDetails;
        int hashCode7 = (hashCode6 + (depositAppDetails == null ? 0 : depositAppDetails.hashCode())) * 31;
        CardApplicationDetails cardApplicationDetails = this.cardDetails;
        int hashCode8 = (hashCode7 + (cardApplicationDetails == null ? 0 : cardApplicationDetails.hashCode())) * 31;
        CreditAppLoanDetailsEntity creditAppLoanDetailsEntity = this.loanDetails;
        if (creditAppLoanDetailsEntity != null) {
            i = creditAppLoanDetailsEntity.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        long j = this.appId;
        String str = this.appType;
        String str2 = this.status;
        long j2 = this.resultCode;
        String str3 = this.deleted;
        long j3 = this.clientKey;
        Long l = this.expDate;
        String str4 = this.prodType;
        long j4 = this.createDate;
        String str5 = this.dictionaryKey;
        DepositAppDetails depositAppDetails = this.depositDetails;
        CardApplicationDetails cardApplicationDetails = this.cardDetails;
        CreditAppLoanDetailsEntity creditAppLoanDetailsEntity = this.loanDetails;
        return "ApplicationEntity(appId=" + j + ", appType=" + str + ", status=" + str2 + ", resultCode=" + j2 + ", deleted=" + str3 + ", clientKey=" + j3 + ", expDate=" + l + ", prodType=" + str4 + ", createDate=" + j4 + ", dictionaryKey=" + str5 + ", depositDetails=" + depositAppDetails + ", cardDetails=" + cardApplicationDetails + ", loanDetails=" + creditAppLoanDetailsEntity + ")";
    }
}
