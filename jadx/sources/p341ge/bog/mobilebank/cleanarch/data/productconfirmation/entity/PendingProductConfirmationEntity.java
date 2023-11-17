package p341ge.bog.mobilebank.cleanarch.data.productconfirmation.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.productconfirmation.entity.PendingProductConfirmationEntity */
public final class PendingProductConfirmationEntity {
    private final String appDetails;
    private final String appType;
    private final String appTypeName;
    private final String iconUrl;
    private final boolean isVerificationRequired;
    private final String langCode;
    private final long responseDetId;
    private final long responseId;
    private final String responseKey;
    private final C24978b verificationRequired;

    public PendingProductConfirmationEntity(long j, long j2, String str, String str2, String str3, String str4, C24978b bVar, String str5, String str6) {
        boolean z;
        C41536l.m120489i(str, "responseKey");
        C41536l.m120489i(str2, "appType");
        C41536l.m120489i(str3, "appDetails");
        C41536l.m120489i(str4, "appTypeName");
        C41536l.m120489i(bVar, "verificationRequired");
        C41536l.m120489i(str5, "langCode");
        this.responseDetId = j;
        this.responseId = j2;
        this.responseKey = str;
        this.appType = str2;
        this.appDetails = str3;
        this.appTypeName = str4;
        this.verificationRequired = bVar;
        this.langCode = str5;
        this.iconUrl = str6;
        if (bVar == C24978b.YES) {
            z = true;
        } else {
            z = false;
        }
        this.isVerificationRequired = z;
    }

    private final C24978b component7() {
        return this.verificationRequired;
    }

    public static /* synthetic */ PendingProductConfirmationEntity copy$default(PendingProductConfirmationEntity pendingProductConfirmationEntity, long j, long j2, String str, String str2, String str3, String str4, C24978b bVar, String str5, String str6, int i, Object obj) {
        PendingProductConfirmationEntity pendingProductConfirmationEntity2 = pendingProductConfirmationEntity;
        int i2 = i;
        return pendingProductConfirmationEntity.copy((i2 & 1) != 0 ? pendingProductConfirmationEntity2.responseDetId : j, (i2 & 2) != 0 ? pendingProductConfirmationEntity2.responseId : j2, (i2 & 4) != 0 ? pendingProductConfirmationEntity2.responseKey : str, (i2 & 8) != 0 ? pendingProductConfirmationEntity2.appType : str2, (i2 & 16) != 0 ? pendingProductConfirmationEntity2.appDetails : str3, (i2 & 32) != 0 ? pendingProductConfirmationEntity2.appTypeName : str4, (i2 & 64) != 0 ? pendingProductConfirmationEntity2.verificationRequired : bVar, (i2 & 128) != 0 ? pendingProductConfirmationEntity2.langCode : str5, (i2 & C11398b.f33139r) != 0 ? pendingProductConfirmationEntity2.iconUrl : str6);
    }

    public final long component1() {
        return this.responseDetId;
    }

    public final long component2() {
        return this.responseId;
    }

    public final String component3() {
        return this.responseKey;
    }

    public final String component4() {
        return this.appType;
    }

    public final String component5() {
        return this.appDetails;
    }

    public final String component6() {
        return this.appTypeName;
    }

    public final String component8() {
        return this.langCode;
    }

    public final String component9() {
        return this.iconUrl;
    }

    public final PendingProductConfirmationEntity copy(long j, long j2, String str, String str2, String str3, String str4, C24978b bVar, String str5, String str6) {
        String str7 = str;
        C41536l.m120489i(str7, "responseKey");
        String str8 = str2;
        C41536l.m120489i(str8, "appType");
        String str9 = str3;
        C41536l.m120489i(str9, "appDetails");
        String str10 = str4;
        C41536l.m120489i(str10, "appTypeName");
        C24978b bVar2 = bVar;
        C41536l.m120489i(bVar2, "verificationRequired");
        String str11 = str5;
        C41536l.m120489i(str11, "langCode");
        return new PendingProductConfirmationEntity(j, j2, str7, str8, str9, str10, bVar2, str11, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingProductConfirmationEntity)) {
            return false;
        }
        PendingProductConfirmationEntity pendingProductConfirmationEntity = (PendingProductConfirmationEntity) obj;
        return this.responseDetId == pendingProductConfirmationEntity.responseDetId && this.responseId == pendingProductConfirmationEntity.responseId && C41536l.m120484d(this.responseKey, pendingProductConfirmationEntity.responseKey) && C41536l.m120484d(this.appType, pendingProductConfirmationEntity.appType) && C41536l.m120484d(this.appDetails, pendingProductConfirmationEntity.appDetails) && C41536l.m120484d(this.appTypeName, pendingProductConfirmationEntity.appTypeName) && this.verificationRequired == pendingProductConfirmationEntity.verificationRequired && C41536l.m120484d(this.langCode, pendingProductConfirmationEntity.langCode) && C41536l.m120484d(this.iconUrl, pendingProductConfirmationEntity.iconUrl);
    }

    public final String getAppDetails() {
        return this.appDetails;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final String getAppTypeName() {
        return this.appTypeName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final long getResponseDetId() {
        return this.responseDetId;
    }

    public final long getResponseId() {
        return this.responseId;
    }

    public final String getResponseKey() {
        return this.responseKey;
    }

    public int hashCode() {
        int a = ((((((((((((((C7397t.m28148a(this.responseDetId) * 31) + C7397t.m28148a(this.responseId)) * 31) + this.responseKey.hashCode()) * 31) + this.appType.hashCode()) * 31) + this.appDetails.hashCode()) * 31) + this.appTypeName.hashCode()) * 31) + this.verificationRequired.hashCode()) * 31) + this.langCode.hashCode()) * 31;
        String str = this.iconUrl;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final boolean isVerificationRequired() {
        return this.isVerificationRequired;
    }

    public String toString() {
        long j = this.responseDetId;
        long j2 = this.responseId;
        String str = this.responseKey;
        String str2 = this.appType;
        String str3 = this.appDetails;
        String str4 = this.appTypeName;
        C24978b bVar = this.verificationRequired;
        String str5 = this.langCode;
        String str6 = this.iconUrl;
        return "PendingProductConfirmationEntity(responseDetId=" + j + ", responseId=" + j2 + ", responseKey=" + str + ", appType=" + str2 + ", appDetails=" + str3 + ", appTypeName=" + str4 + ", verificationRequired=" + bVar + ", langCode=" + str5 + ", iconUrl=" + str6 + ")";
    }
}
