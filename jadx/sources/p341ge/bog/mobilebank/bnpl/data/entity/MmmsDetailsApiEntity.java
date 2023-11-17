package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.MmmsDetailsApiEntity */
public final class MmmsDetailsApiEntity {
    private final Long clientKey;
    private final String merChantSourceType;
    private final String merchantId;
    private final String merchantLogoStorageId;
    private final String merchantLogoURL;
    private final String merchantName;
    private final String merchantPhoneNumber;
    private final Integer reversalExpireDays;

    public MmmsDetailsApiEntity(Long l, String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        this.clientKey = l;
        this.merchantName = str;
        this.merchantId = str2;
        this.merchantPhoneNumber = str3;
        this.reversalExpireDays = num;
        this.merchantLogoStorageId = str4;
        this.merChantSourceType = str5;
        this.merchantLogoURL = str6;
    }

    public static /* synthetic */ MmmsDetailsApiEntity copy$default(MmmsDetailsApiEntity mmmsDetailsApiEntity, Long l, String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i, Object obj) {
        MmmsDetailsApiEntity mmmsDetailsApiEntity2 = mmmsDetailsApiEntity;
        int i2 = i;
        return mmmsDetailsApiEntity.copy((i2 & 1) != 0 ? mmmsDetailsApiEntity2.clientKey : l, (i2 & 2) != 0 ? mmmsDetailsApiEntity2.merchantName : str, (i2 & 4) != 0 ? mmmsDetailsApiEntity2.merchantId : str2, (i2 & 8) != 0 ? mmmsDetailsApiEntity2.merchantPhoneNumber : str3, (i2 & 16) != 0 ? mmmsDetailsApiEntity2.reversalExpireDays : num, (i2 & 32) != 0 ? mmmsDetailsApiEntity2.merchantLogoStorageId : str4, (i2 & 64) != 0 ? mmmsDetailsApiEntity2.merChantSourceType : str5, (i2 & 128) != 0 ? mmmsDetailsApiEntity2.merchantLogoURL : str6);
    }

    public final Long component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.merchantName;
    }

    public final String component3() {
        return this.merchantId;
    }

    public final String component4() {
        return this.merchantPhoneNumber;
    }

    public final Integer component5() {
        return this.reversalExpireDays;
    }

    public final String component6() {
        return this.merchantLogoStorageId;
    }

    public final String component7() {
        return this.merChantSourceType;
    }

    public final String component8() {
        return this.merchantLogoURL;
    }

    public final MmmsDetailsApiEntity copy(Long l, String str, String str2, String str3, Integer num, String str4, String str5, String str6) {
        return new MmmsDetailsApiEntity(l, str, str2, str3, num, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MmmsDetailsApiEntity)) {
            return false;
        }
        MmmsDetailsApiEntity mmmsDetailsApiEntity = (MmmsDetailsApiEntity) obj;
        return C41536l.m120484d(this.clientKey, mmmsDetailsApiEntity.clientKey) && C41536l.m120484d(this.merchantName, mmmsDetailsApiEntity.merchantName) && C41536l.m120484d(this.merchantId, mmmsDetailsApiEntity.merchantId) && C41536l.m120484d(this.merchantPhoneNumber, mmmsDetailsApiEntity.merchantPhoneNumber) && C41536l.m120484d(this.reversalExpireDays, mmmsDetailsApiEntity.reversalExpireDays) && C41536l.m120484d(this.merchantLogoStorageId, mmmsDetailsApiEntity.merchantLogoStorageId) && C41536l.m120484d(this.merChantSourceType, mmmsDetailsApiEntity.merChantSourceType) && C41536l.m120484d(this.merchantLogoURL, mmmsDetailsApiEntity.merchantLogoURL);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getMerChantSourceType() {
        return this.merChantSourceType;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getMerchantLogoStorageId() {
        return this.merchantLogoStorageId;
    }

    public final String getMerchantLogoURL() {
        return this.merchantLogoURL;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getMerchantPhoneNumber() {
        return this.merchantPhoneNumber;
    }

    public final Integer getReversalExpireDays() {
        return this.reversalExpireDays;
    }

    public int hashCode() {
        Long l = this.clientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.merchantName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.merchantId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantPhoneNumber;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.reversalExpireDays;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.merchantLogoStorageId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.merChantSourceType;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.merchantLogoURL;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        Long l = this.clientKey;
        String str = this.merchantName;
        String str2 = this.merchantId;
        String str3 = this.merchantPhoneNumber;
        Integer num = this.reversalExpireDays;
        String str4 = this.merchantLogoStorageId;
        String str5 = this.merChantSourceType;
        String str6 = this.merchantLogoURL;
        return "MmmsDetailsApiEntity(clientKey=" + l + ", merchantName=" + str + ", merchantId=" + str2 + ", merchantPhoneNumber=" + str3 + ", reversalExpireDays=" + num + ", merchantLogoStorageId=" + str4 + ", merChantSourceType=" + str5 + ", merchantLogoURL=" + str6 + ")";
    }
}
