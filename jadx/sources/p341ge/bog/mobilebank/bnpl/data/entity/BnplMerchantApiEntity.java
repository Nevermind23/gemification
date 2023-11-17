package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplMerchantApiEntity */
public final class BnplMerchantApiEntity {
    @C8664c("brandNameEn")
    private String brandNameEn;
    @C8664c("brandNameGe")
    private String brandNameGe;
    @C8664c("clientKey")
    private String clientKey;
    @C8664c("logoFileId")
    private String logoFileId;
    @C8664c("logoFileUrl")
    private String logoFileUrl;
    @C8664c("merchantClientId")
    private Long merchantClientId;
    @C8664c("merchantCount")
    private Integer merchantCount;
    @C8664c("ofrCategoryId")
    private Long ofrCategoryId;

    public BnplMerchantApiEntity(Long l, String str, String str2, String str3, String str4, String str5, Long l2, Integer num) {
        this.merchantClientId = l;
        this.clientKey = str;
        this.brandNameGe = str2;
        this.brandNameEn = str3;
        this.logoFileId = str4;
        this.logoFileUrl = str5;
        this.ofrCategoryId = l2;
        this.merchantCount = num;
    }

    public static /* synthetic */ BnplMerchantApiEntity copy$default(BnplMerchantApiEntity bnplMerchantApiEntity, Long l, String str, String str2, String str3, String str4, String str5, Long l2, Integer num, int i, Object obj) {
        BnplMerchantApiEntity bnplMerchantApiEntity2 = bnplMerchantApiEntity;
        int i2 = i;
        return bnplMerchantApiEntity.copy((i2 & 1) != 0 ? bnplMerchantApiEntity2.merchantClientId : l, (i2 & 2) != 0 ? bnplMerchantApiEntity2.clientKey : str, (i2 & 4) != 0 ? bnplMerchantApiEntity2.brandNameGe : str2, (i2 & 8) != 0 ? bnplMerchantApiEntity2.brandNameEn : str3, (i2 & 16) != 0 ? bnplMerchantApiEntity2.logoFileId : str4, (i2 & 32) != 0 ? bnplMerchantApiEntity2.logoFileUrl : str5, (i2 & 64) != 0 ? bnplMerchantApiEntity2.ofrCategoryId : l2, (i2 & 128) != 0 ? bnplMerchantApiEntity2.merchantCount : num);
    }

    public final Long component1() {
        return this.merchantClientId;
    }

    public final String component2() {
        return this.clientKey;
    }

    public final String component3() {
        return this.brandNameGe;
    }

    public final String component4() {
        return this.brandNameEn;
    }

    public final String component5() {
        return this.logoFileId;
    }

    public final String component6() {
        return this.logoFileUrl;
    }

    public final Long component7() {
        return this.ofrCategoryId;
    }

    public final Integer component8() {
        return this.merchantCount;
    }

    public final BnplMerchantApiEntity copy(Long l, String str, String str2, String str3, String str4, String str5, Long l2, Integer num) {
        return new BnplMerchantApiEntity(l, str, str2, str3, str4, str5, l2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplMerchantApiEntity)) {
            return false;
        }
        BnplMerchantApiEntity bnplMerchantApiEntity = (BnplMerchantApiEntity) obj;
        return C41536l.m120484d(this.merchantClientId, bnplMerchantApiEntity.merchantClientId) && C41536l.m120484d(this.clientKey, bnplMerchantApiEntity.clientKey) && C41536l.m120484d(this.brandNameGe, bnplMerchantApiEntity.brandNameGe) && C41536l.m120484d(this.brandNameEn, bnplMerchantApiEntity.brandNameEn) && C41536l.m120484d(this.logoFileId, bnplMerchantApiEntity.logoFileId) && C41536l.m120484d(this.logoFileUrl, bnplMerchantApiEntity.logoFileUrl) && C41536l.m120484d(this.ofrCategoryId, bnplMerchantApiEntity.ofrCategoryId) && C41536l.m120484d(this.merchantCount, bnplMerchantApiEntity.merchantCount);
    }

    public final String getBrandNameEn() {
        return this.brandNameEn;
    }

    public final String getBrandNameGe() {
        return this.brandNameGe;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getLogoFileId() {
        return this.logoFileId;
    }

    public final String getLogoFileUrl() {
        return this.logoFileUrl;
    }

    public final Long getMerchantClientId() {
        return this.merchantClientId;
    }

    public final Integer getMerchantCount() {
        return this.merchantCount;
    }

    public final Long getOfrCategoryId() {
        return this.ofrCategoryId;
    }

    public int hashCode() {
        Long l = this.merchantClientId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.clientKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.brandNameGe;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brandNameEn;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logoFileId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.logoFileUrl;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l2 = this.ofrCategoryId;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.merchantCount;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode7 + i;
    }

    public final void setBrandNameEn(String str) {
        this.brandNameEn = str;
    }

    public final void setBrandNameGe(String str) {
        this.brandNameGe = str;
    }

    public final void setClientKey(String str) {
        this.clientKey = str;
    }

    public final void setLogoFileId(String str) {
        this.logoFileId = str;
    }

    public final void setLogoFileUrl(String str) {
        this.logoFileUrl = str;
    }

    public final void setMerchantClientId(Long l) {
        this.merchantClientId = l;
    }

    public final void setMerchantCount(Integer num) {
        this.merchantCount = num;
    }

    public final void setOfrCategoryId(Long l) {
        this.ofrCategoryId = l;
    }

    public String toString() {
        Long l = this.merchantClientId;
        String str = this.clientKey;
        String str2 = this.brandNameGe;
        String str3 = this.brandNameEn;
        String str4 = this.logoFileId;
        String str5 = this.logoFileUrl;
        Long l2 = this.ofrCategoryId;
        Integer num = this.merchantCount;
        return "BnplMerchantApiEntity(merchantClientId=" + l + ", clientKey=" + str + ", brandNameGe=" + str2 + ", brandNameEn=" + str3 + ", logoFileId=" + str4 + ", logoFileUrl=" + str5 + ", ofrCategoryId=" + l2 + ", merchantCount=" + num + ")";
    }
}
