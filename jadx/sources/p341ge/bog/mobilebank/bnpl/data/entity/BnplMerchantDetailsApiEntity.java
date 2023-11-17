package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplMerchantDetailsApiEntity */
public final class BnplMerchantDetailsApiEntity {
    private final Integer actionLoanTerm;
    private final String brandNameEN;
    private final String brandNameGE;
    private final Long clientId;
    private final String installmentType;
    private final String logoFileId;
    private final String logoFileUrl;
    private final Long merchantId;
    private final String webPageUrl;

    public BnplMerchantDetailsApiEntity(Long l, Long l2, String str, String str2, Integer num, String str3, String str4, String str5, String str6) {
        this.merchantId = l;
        this.clientId = l2;
        this.brandNameGE = str;
        this.brandNameEN = str2;
        this.actionLoanTerm = num;
        this.installmentType = str3;
        this.webPageUrl = str4;
        this.logoFileId = str5;
        this.logoFileUrl = str6;
    }

    public static /* synthetic */ BnplMerchantDetailsApiEntity copy$default(BnplMerchantDetailsApiEntity bnplMerchantDetailsApiEntity, Long l, Long l2, String str, String str2, Integer num, String str3, String str4, String str5, String str6, int i, Object obj) {
        BnplMerchantDetailsApiEntity bnplMerchantDetailsApiEntity2 = bnplMerchantDetailsApiEntity;
        int i2 = i;
        return bnplMerchantDetailsApiEntity.copy((i2 & 1) != 0 ? bnplMerchantDetailsApiEntity2.merchantId : l, (i2 & 2) != 0 ? bnplMerchantDetailsApiEntity2.clientId : l2, (i2 & 4) != 0 ? bnplMerchantDetailsApiEntity2.brandNameGE : str, (i2 & 8) != 0 ? bnplMerchantDetailsApiEntity2.brandNameEN : str2, (i2 & 16) != 0 ? bnplMerchantDetailsApiEntity2.actionLoanTerm : num, (i2 & 32) != 0 ? bnplMerchantDetailsApiEntity2.installmentType : str3, (i2 & 64) != 0 ? bnplMerchantDetailsApiEntity2.webPageUrl : str4, (i2 & 128) != 0 ? bnplMerchantDetailsApiEntity2.logoFileId : str5, (i2 & C11398b.f33139r) != 0 ? bnplMerchantDetailsApiEntity2.logoFileUrl : str6);
    }

    public final Long component1() {
        return this.merchantId;
    }

    public final Long component2() {
        return this.clientId;
    }

    public final String component3() {
        return this.brandNameGE;
    }

    public final String component4() {
        return this.brandNameEN;
    }

    public final Integer component5() {
        return this.actionLoanTerm;
    }

    public final String component6() {
        return this.installmentType;
    }

    public final String component7() {
        return this.webPageUrl;
    }

    public final String component8() {
        return this.logoFileId;
    }

    public final String component9() {
        return this.logoFileUrl;
    }

    public final BnplMerchantDetailsApiEntity copy(Long l, Long l2, String str, String str2, Integer num, String str3, String str4, String str5, String str6) {
        return new BnplMerchantDetailsApiEntity(l, l2, str, str2, num, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplMerchantDetailsApiEntity)) {
            return false;
        }
        BnplMerchantDetailsApiEntity bnplMerchantDetailsApiEntity = (BnplMerchantDetailsApiEntity) obj;
        return C41536l.m120484d(this.merchantId, bnplMerchantDetailsApiEntity.merchantId) && C41536l.m120484d(this.clientId, bnplMerchantDetailsApiEntity.clientId) && C41536l.m120484d(this.brandNameGE, bnplMerchantDetailsApiEntity.brandNameGE) && C41536l.m120484d(this.brandNameEN, bnplMerchantDetailsApiEntity.brandNameEN) && C41536l.m120484d(this.actionLoanTerm, bnplMerchantDetailsApiEntity.actionLoanTerm) && C41536l.m120484d(this.installmentType, bnplMerchantDetailsApiEntity.installmentType) && C41536l.m120484d(this.webPageUrl, bnplMerchantDetailsApiEntity.webPageUrl) && C41536l.m120484d(this.logoFileId, bnplMerchantDetailsApiEntity.logoFileId) && C41536l.m120484d(this.logoFileUrl, bnplMerchantDetailsApiEntity.logoFileUrl);
    }

    public final Integer getActionLoanTerm() {
        return this.actionLoanTerm;
    }

    public final String getBrandNameEN() {
        return this.brandNameEN;
    }

    public final String getBrandNameGE() {
        return this.brandNameGE;
    }

    public final Long getClientId() {
        return this.clientId;
    }

    public final String getInstallmentType() {
        return this.installmentType;
    }

    public final String getLogoFileId() {
        return this.logoFileId;
    }

    public final String getLogoFileUrl() {
        return this.logoFileUrl;
    }

    public final Long getMerchantId() {
        return this.merchantId;
    }

    public final String getWebPageUrl() {
        return this.webPageUrl;
    }

    public int hashCode() {
        Long l = this.merchantId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.clientId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.brandNameGE;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.brandNameEN;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.actionLoanTerm;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.installmentType;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.webPageUrl;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.logoFileId;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.logoFileUrl;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        Long l = this.merchantId;
        Long l2 = this.clientId;
        String str = this.brandNameGE;
        String str2 = this.brandNameEN;
        Integer num = this.actionLoanTerm;
        String str3 = this.installmentType;
        String str4 = this.webPageUrl;
        String str5 = this.logoFileId;
        String str6 = this.logoFileUrl;
        return "BnplMerchantDetailsApiEntity(merchantId=" + l + ", clientId=" + l2 + ", brandNameGE=" + str + ", brandNameEN=" + str2 + ", actionLoanTerm=" + num + ", installmentType=" + str3 + ", webPageUrl=" + str4 + ", logoFileId=" + str5 + ", logoFileUrl=" + str6 + ")";
    }
}
