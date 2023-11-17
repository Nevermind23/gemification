package p341ge.bog.mobilebank.nbo.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.nbo.data.entity.NboOfferEntity */
public final class NboOfferEntity {
    private final String attachmentFileBase64;
    private final Boolean displayBannerOnHome;
    private final String effectiveInterestRate;
    private final ExternalFileEntity externalFile;
    private final String extraCode;
    private final String hasPromotion;

    /* renamed from: id */
    private final long f81389id;
    private final String langCode;
    private final String nboDesc;
    private final String nboDescKey;
    private final String nboTitle;
    private final String nboTitleKey;
    private final String offerAmount;
    private final String offerCcy;
    private final String offerNo;
    private final String offerProduct;
    private final String offerScheme;
    private final String offerText;
    private final String operType;
    private final Integer orderNo;
    private final Integer priority;
    private final String productCode;
    private final String productName;
    private final String productText;
    private final OfferProductTypeEntity productType;
    private final String productUrl;
    private final String requestedAmount;
    private final String responseId;

    public NboOfferEntity(long j, String str, OfferProductTypeEntity offerProductTypeEntity, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, Integer num2, String str13, String str14, String str15, Boolean bool, String str16, String str17, String str18, String str19, String str20, String str21, ExternalFileEntity externalFileEntity, String str22) {
        String str23 = str11;
        C41536l.m120489i(str23, "offerNo");
        this.f81389id = j;
        this.langCode = str;
        this.productType = offerProductTypeEntity;
        this.productCode = str2;
        this.productName = str3;
        this.productText = str4;
        this.offerText = str5;
        this.offerProduct = str6;
        this.operType = str7;
        this.extraCode = str8;
        this.productUrl = str9;
        this.attachmentFileBase64 = str10;
        this.offerNo = str23;
        this.orderNo = num;
        this.effectiveInterestRate = str12;
        this.priority = num2;
        this.hasPromotion = str13;
        this.offerAmount = str14;
        this.offerCcy = str15;
        this.displayBannerOnHome = bool;
        this.requestedAmount = str16;
        this.offerScheme = str17;
        this.nboTitle = str18;
        this.nboDesc = str19;
        this.nboTitleKey = str20;
        this.nboDescKey = str21;
        this.externalFile = externalFileEntity;
        this.responseId = str22;
    }

    public static /* synthetic */ NboOfferEntity copy$default(NboOfferEntity nboOfferEntity, long j, String str, OfferProductTypeEntity offerProductTypeEntity, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, Integer num2, String str13, String str14, String str15, Boolean bool, String str16, String str17, String str18, String str19, String str20, String str21, ExternalFileEntity externalFileEntity, String str22, int i, Object obj) {
        NboOfferEntity nboOfferEntity2 = nboOfferEntity;
        int i2 = i;
        return nboOfferEntity.copy((i2 & 1) != 0 ? nboOfferEntity2.f81389id : j, (i2 & 2) != 0 ? nboOfferEntity2.langCode : str, (i2 & 4) != 0 ? nboOfferEntity2.productType : offerProductTypeEntity, (i2 & 8) != 0 ? nboOfferEntity2.productCode : str2, (i2 & 16) != 0 ? nboOfferEntity2.productName : str3, (i2 & 32) != 0 ? nboOfferEntity2.productText : str4, (i2 & 64) != 0 ? nboOfferEntity2.offerText : str5, (i2 & 128) != 0 ? nboOfferEntity2.offerProduct : str6, (i2 & C11398b.f33139r) != 0 ? nboOfferEntity2.operType : str7, (i2 & C11398b.f33140s) != 0 ? nboOfferEntity2.extraCode : str8, (i2 & C11398b.f33141t) != 0 ? nboOfferEntity2.productUrl : str9, (i2 & C11398b.f33142u) != 0 ? nboOfferEntity2.attachmentFileBase64 : str10, (i2 & C11398b.f33143v) != 0 ? nboOfferEntity2.offerNo : str11, (i2 & 8192) != 0 ? nboOfferEntity2.orderNo : num, (i2 & 16384) != 0 ? nboOfferEntity2.effectiveInterestRate : str12, (i2 & 32768) != 0 ? nboOfferEntity2.priority : num2, (i2 & 65536) != 0 ? nboOfferEntity2.hasPromotion : str13, (i2 & 131072) != 0 ? nboOfferEntity2.offerAmount : str14, (i2 & 262144) != 0 ? nboOfferEntity2.offerCcy : str15, (i2 & 524288) != 0 ? nboOfferEntity2.displayBannerOnHome : bool, (i2 & 1048576) != 0 ? nboOfferEntity2.requestedAmount : str16, (i2 & 2097152) != 0 ? nboOfferEntity2.offerScheme : str17, (i2 & 4194304) != 0 ? nboOfferEntity2.nboTitle : str18, (i2 & 8388608) != 0 ? nboOfferEntity2.nboDesc : str19, (i2 & 16777216) != 0 ? nboOfferEntity2.nboTitleKey : str20, (i2 & 33554432) != 0 ? nboOfferEntity2.nboDescKey : str21, (i2 & 67108864) != 0 ? nboOfferEntity2.externalFile : externalFileEntity, (i2 & 134217728) != 0 ? nboOfferEntity2.responseId : str22);
    }

    public final long component1() {
        return this.f81389id;
    }

    public final String component10() {
        return this.extraCode;
    }

    public final String component11() {
        return this.productUrl;
    }

    public final String component12() {
        return this.attachmentFileBase64;
    }

    public final String component13() {
        return this.offerNo;
    }

    public final Integer component14() {
        return this.orderNo;
    }

    public final String component15() {
        return this.effectiveInterestRate;
    }

    public final Integer component16() {
        return this.priority;
    }

    public final String component17() {
        return this.hasPromotion;
    }

    public final String component18() {
        return this.offerAmount;
    }

    public final String component19() {
        return this.offerCcy;
    }

    public final String component2() {
        return this.langCode;
    }

    public final Boolean component20() {
        return this.displayBannerOnHome;
    }

    public final String component21() {
        return this.requestedAmount;
    }

    public final String component22() {
        return this.offerScheme;
    }

    public final String component23() {
        return this.nboTitle;
    }

    public final String component24() {
        return this.nboDesc;
    }

    public final String component25() {
        return this.nboTitleKey;
    }

    public final String component26() {
        return this.nboDescKey;
    }

    public final ExternalFileEntity component27() {
        return this.externalFile;
    }

    public final String component28() {
        return this.responseId;
    }

    public final OfferProductTypeEntity component3() {
        return this.productType;
    }

    public final String component4() {
        return this.productCode;
    }

    public final String component5() {
        return this.productName;
    }

    public final String component6() {
        return this.productText;
    }

    public final String component7() {
        return this.offerText;
    }

    public final String component8() {
        return this.offerProduct;
    }

    public final String component9() {
        return this.operType;
    }

    public final NboOfferEntity copy(long j, String str, OfferProductTypeEntity offerProductTypeEntity, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, String str12, Integer num2, String str13, String str14, String str15, Boolean bool, String str16, String str17, String str18, String str19, String str20, String str21, ExternalFileEntity externalFileEntity, String str22) {
        long j2 = j;
        C41536l.m120489i(str11, "offerNo");
        return new NboOfferEntity(j, str, offerProductTypeEntity, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, str12, num2, str13, str14, str15, bool, str16, str17, str18, str19, str20, str21, externalFileEntity, str22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NboOfferEntity)) {
            return false;
        }
        NboOfferEntity nboOfferEntity = (NboOfferEntity) obj;
        return this.f81389id == nboOfferEntity.f81389id && C41536l.m120484d(this.langCode, nboOfferEntity.langCode) && this.productType == nboOfferEntity.productType && C41536l.m120484d(this.productCode, nboOfferEntity.productCode) && C41536l.m120484d(this.productName, nboOfferEntity.productName) && C41536l.m120484d(this.productText, nboOfferEntity.productText) && C41536l.m120484d(this.offerText, nboOfferEntity.offerText) && C41536l.m120484d(this.offerProduct, nboOfferEntity.offerProduct) && C41536l.m120484d(this.operType, nboOfferEntity.operType) && C41536l.m120484d(this.extraCode, nboOfferEntity.extraCode) && C41536l.m120484d(this.productUrl, nboOfferEntity.productUrl) && C41536l.m120484d(this.attachmentFileBase64, nboOfferEntity.attachmentFileBase64) && C41536l.m120484d(this.offerNo, nboOfferEntity.offerNo) && C41536l.m120484d(this.orderNo, nboOfferEntity.orderNo) && C41536l.m120484d(this.effectiveInterestRate, nboOfferEntity.effectiveInterestRate) && C41536l.m120484d(this.priority, nboOfferEntity.priority) && C41536l.m120484d(this.hasPromotion, nboOfferEntity.hasPromotion) && C41536l.m120484d(this.offerAmount, nboOfferEntity.offerAmount) && C41536l.m120484d(this.offerCcy, nboOfferEntity.offerCcy) && C41536l.m120484d(this.displayBannerOnHome, nboOfferEntity.displayBannerOnHome) && C41536l.m120484d(this.requestedAmount, nboOfferEntity.requestedAmount) && C41536l.m120484d(this.offerScheme, nboOfferEntity.offerScheme) && C41536l.m120484d(this.nboTitle, nboOfferEntity.nboTitle) && C41536l.m120484d(this.nboDesc, nboOfferEntity.nboDesc) && C41536l.m120484d(this.nboTitleKey, nboOfferEntity.nboTitleKey) && C41536l.m120484d(this.nboDescKey, nboOfferEntity.nboDescKey) && C41536l.m120484d(this.externalFile, nboOfferEntity.externalFile) && C41536l.m120484d(this.responseId, nboOfferEntity.responseId);
    }

    public final String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public final Boolean getDisplayBannerOnHome() {
        return this.displayBannerOnHome;
    }

    public final String getEffectiveInterestRate() {
        return this.effectiveInterestRate;
    }

    public final ExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final String getExtraCode() {
        return this.extraCode;
    }

    public final String getHasPromotion() {
        return this.hasPromotion;
    }

    public final long getId() {
        return this.f81389id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final String getNboDesc() {
        return this.nboDesc;
    }

    public final String getNboDescKey() {
        return this.nboDescKey;
    }

    public final String getNboTitle() {
        return this.nboTitle;
    }

    public final String getNboTitleKey() {
        return this.nboTitleKey;
    }

    public final String getOfferAmount() {
        return this.offerAmount;
    }

    public final String getOfferCcy() {
        return this.offerCcy;
    }

    public final String getOfferNo() {
        return this.offerNo;
    }

    public final String getOfferProduct() {
        return this.offerProduct;
    }

    public final String getOfferScheme() {
        return this.offerScheme;
    }

    public final String getOfferText() {
        return this.offerText;
    }

    public final String getOperType() {
        return this.operType;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductText() {
        return this.productText;
    }

    public final OfferProductTypeEntity getProductType() {
        return this.productType;
    }

    public final String getProductUrl() {
        return this.productUrl;
    }

    public final String getRequestedAmount() {
        return this.requestedAmount;
    }

    public final String getResponseId() {
        return this.responseId;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f81389id) * 31;
        String str = this.langCode;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        OfferProductTypeEntity offerProductTypeEntity = this.productType;
        int hashCode2 = (hashCode + (offerProductTypeEntity == null ? 0 : offerProductTypeEntity.hashCode())) * 31;
        String str2 = this.productCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productText;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offerText;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offerProduct;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.operType;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.extraCode;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productUrl;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.attachmentFileBase64;
        int hashCode11 = (((hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.offerNo.hashCode()) * 31;
        Integer num = this.orderNo;
        int hashCode12 = (hashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str11 = this.effectiveInterestRate;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num2 = this.priority;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str12 = this.hasPromotion;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.offerAmount;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.offerCcy;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.displayBannerOnHome;
        int hashCode18 = (hashCode17 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str15 = this.requestedAmount;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.offerScheme;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.nboTitle;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.nboDesc;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.nboTitleKey;
        int hashCode23 = (hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.nboDescKey;
        int hashCode24 = (hashCode23 + (str20 == null ? 0 : str20.hashCode())) * 31;
        ExternalFileEntity externalFileEntity = this.externalFile;
        int hashCode25 = (hashCode24 + (externalFileEntity == null ? 0 : externalFileEntity.hashCode())) * 31;
        String str21 = this.responseId;
        if (str21 != null) {
            i = str21.hashCode();
        }
        return hashCode25 + i;
    }

    public String toString() {
        long j = this.f81389id;
        String str = this.langCode;
        OfferProductTypeEntity offerProductTypeEntity = this.productType;
        String str2 = this.productCode;
        String str3 = this.productName;
        String str4 = this.productText;
        String str5 = this.offerText;
        String str6 = this.offerProduct;
        String str7 = this.operType;
        String str8 = this.extraCode;
        String str9 = this.productUrl;
        String str10 = this.attachmentFileBase64;
        String str11 = this.offerNo;
        Integer num = this.orderNo;
        String str12 = this.effectiveInterestRate;
        Integer num2 = this.priority;
        String str13 = this.hasPromotion;
        String str14 = this.offerAmount;
        String str15 = this.offerCcy;
        Boolean bool = this.displayBannerOnHome;
        String str16 = this.requestedAmount;
        String str17 = this.offerScheme;
        String str18 = this.nboTitle;
        String str19 = this.nboDesc;
        String str20 = this.nboTitleKey;
        String str21 = this.nboDescKey;
        ExternalFileEntity externalFileEntity = this.externalFile;
        String str22 = this.responseId;
        return "NboOfferEntity(id=" + j + ", langCode=" + str + ", productType=" + offerProductTypeEntity + ", productCode=" + str2 + ", productName=" + str3 + ", productText=" + str4 + ", offerText=" + str5 + ", offerProduct=" + str6 + ", operType=" + str7 + ", extraCode=" + str8 + ", productUrl=" + str9 + ", attachmentFileBase64=" + str10 + ", offerNo=" + str11 + ", orderNo=" + num + ", effectiveInterestRate=" + str12 + ", priority=" + num2 + ", hasPromotion=" + str13 + ", offerAmount=" + str14 + ", offerCcy=" + str15 + ", displayBannerOnHome=" + bool + ", requestedAmount=" + str16 + ", offerScheme=" + str17 + ", nboTitle=" + str18 + ", nboDesc=" + str19 + ", nboTitleKey=" + str20 + ", nboDescKey=" + str21 + ", externalFile=" + externalFileEntity + ", responseId=" + str22 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NboOfferEntity(long r34, java.lang.String r36, p341ge.bog.mobilebank.nbo.data.entity.OfferProductTypeEntity r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.lang.Integer r48, java.lang.String r49, java.lang.Integer r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.Boolean r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, p341ge.bog.mobilebank.shared.data.ExternalFileEntity r61, java.lang.String r62, int r63, kotlin.jvm.internal.DefaultConstructorMarker r64) {
        /*
            r33 = this;
            r0 = r63
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r36
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r37
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r38
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r39
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r40
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r41
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r42
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r43
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0049
            r14 = r2
            goto L_0x004b
        L_0x0049:
            r14 = r44
        L_0x004b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0051
            r15 = r2
            goto L_0x0053
        L_0x0051:
            r15 = r45
        L_0x0053:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005a
            r16 = r2
            goto L_0x005c
        L_0x005a:
            r16 = r46
        L_0x005c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0063
            r18 = r2
            goto L_0x0065
        L_0x0063:
            r18 = r48
        L_0x0065:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006d
            r25 = r2
            goto L_0x006f
        L_0x006d:
            r25 = r55
        L_0x006f:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0077
            r26 = r2
            goto L_0x0079
        L_0x0077:
            r26 = r56
        L_0x0079:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0081
            r27 = r2
            goto L_0x0083
        L_0x0081:
            r27 = r57
        L_0x0083:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008b
            r28 = r2
            goto L_0x008d
        L_0x008b:
            r28 = r58
        L_0x008d:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0095
            r29 = r2
            goto L_0x0097
        L_0x0095:
            r29 = r59
        L_0x0097:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009f
            r30 = r2
            goto L_0x00a1
        L_0x009f:
            r30 = r60
        L_0x00a1:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a9
            r31 = r2
            goto L_0x00ab
        L_0x00a9:
            r31 = r61
        L_0x00ab:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00b3
            r32 = r2
            goto L_0x00b5
        L_0x00b3:
            r32 = r62
        L_0x00b5:
            r3 = r33
            r4 = r34
            r17 = r47
            r19 = r49
            r20 = r50
            r21 = r51
            r22 = r52
            r23 = r53
            r24 = r54
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.nbo.data.entity.NboOfferEntity.<init>(long, java.lang.String, ge.bog.mobilebank.nbo.data.entity.OfferProductTypeEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.shared.data.ExternalFileEntity, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
