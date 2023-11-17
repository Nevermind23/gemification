package p341ge.bog.mobilebank.cleanarch.data.offer.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.offer.entity.OfferInfoApiEntity */
public final class OfferInfoApiEntity {
    private final String attachmentFileBase64;
    private final Boolean displayBannerOnHome;
    private final String effectiveInterestRate;
    private final String extraCode;
    private final String hasPromotion;

    /* renamed from: id */
    private final long f56451id;
    private final String langCode;
    private final String offerAmount;
    private final String offerCcy;
    private final String offerNo;
    private final String offerProduct;
    private final String offerScheme;
    private final String offerText;
    private final String operType;
    private final Integer orderNo;
    private final String productCode;
    private final String productName;
    private final String productText;
    private final String productType;
    private final String productUrl;

    public OfferInfoApiEntity(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16, Boolean bool, String str17) {
        String str18 = str12;
        String str19 = str13;
        String str20 = str15;
        String str21 = str16;
        C41536l.m120489i(str3, "productCode");
        C41536l.m120489i(str18, "offerNo");
        C41536l.m120489i(str19, "effectiveInterestRate");
        C41536l.m120489i(str20, "offerAmount");
        C41536l.m120489i(str21, "offerCcy");
        this.f56451id = j;
        this.langCode = str;
        this.productType = str2;
        this.productCode = str3;
        this.productName = str4;
        this.productText = str5;
        this.offerText = str6;
        this.offerProduct = str7;
        this.operType = str8;
        this.extraCode = str9;
        this.productUrl = str10;
        this.attachmentFileBase64 = str11;
        this.offerNo = str18;
        this.orderNo = num;
        this.effectiveInterestRate = str19;
        this.hasPromotion = str14;
        this.offerAmount = str20;
        this.offerCcy = str21;
        this.displayBannerOnHome = bool;
        this.offerScheme = str17;
    }

    public static /* synthetic */ OfferInfoApiEntity copy$default(OfferInfoApiEntity offerInfoApiEntity, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16, Boolean bool, String str17, int i, Object obj) {
        OfferInfoApiEntity offerInfoApiEntity2 = offerInfoApiEntity;
        int i2 = i;
        return offerInfoApiEntity.copy((i2 & 1) != 0 ? offerInfoApiEntity2.f56451id : j, (i2 & 2) != 0 ? offerInfoApiEntity2.langCode : str, (i2 & 4) != 0 ? offerInfoApiEntity2.productType : str2, (i2 & 8) != 0 ? offerInfoApiEntity2.productCode : str3, (i2 & 16) != 0 ? offerInfoApiEntity2.productName : str4, (i2 & 32) != 0 ? offerInfoApiEntity2.productText : str5, (i2 & 64) != 0 ? offerInfoApiEntity2.offerText : str6, (i2 & 128) != 0 ? offerInfoApiEntity2.offerProduct : str7, (i2 & C11398b.f33139r) != 0 ? offerInfoApiEntity2.operType : str8, (i2 & C11398b.f33140s) != 0 ? offerInfoApiEntity2.extraCode : str9, (i2 & C11398b.f33141t) != 0 ? offerInfoApiEntity2.productUrl : str10, (i2 & C11398b.f33142u) != 0 ? offerInfoApiEntity2.attachmentFileBase64 : str11, (i2 & C11398b.f33143v) != 0 ? offerInfoApiEntity2.offerNo : str12, (i2 & 8192) != 0 ? offerInfoApiEntity2.orderNo : num, (i2 & 16384) != 0 ? offerInfoApiEntity2.effectiveInterestRate : str13, (i2 & 32768) != 0 ? offerInfoApiEntity2.hasPromotion : str14, (i2 & 65536) != 0 ? offerInfoApiEntity2.offerAmount : str15, (i2 & 131072) != 0 ? offerInfoApiEntity2.offerCcy : str16, (i2 & 262144) != 0 ? offerInfoApiEntity2.displayBannerOnHome : bool, (i2 & 524288) != 0 ? offerInfoApiEntity2.offerScheme : str17);
    }

    public final long component1() {
        return this.f56451id;
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

    public final String component16() {
        return this.hasPromotion;
    }

    public final String component17() {
        return this.offerAmount;
    }

    public final String component18() {
        return this.offerCcy;
    }

    public final Boolean component19() {
        return this.displayBannerOnHome;
    }

    public final String component2() {
        return this.langCode;
    }

    public final String component20() {
        return this.offerScheme;
    }

    public final String component3() {
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

    public final OfferInfoApiEntity copy(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, String str15, String str16, Boolean bool, String str17) {
        long j2 = j;
        C41536l.m120489i(str3, "productCode");
        C41536l.m120489i(str12, "offerNo");
        C41536l.m120489i(str13, "effectiveInterestRate");
        C41536l.m120489i(str15, "offerAmount");
        C41536l.m120489i(str16, "offerCcy");
        return new OfferInfoApiEntity(j, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, num, str13, str14, str15, str16, bool, str17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferInfoApiEntity)) {
            return false;
        }
        OfferInfoApiEntity offerInfoApiEntity = (OfferInfoApiEntity) obj;
        return this.f56451id == offerInfoApiEntity.f56451id && C41536l.m120484d(this.langCode, offerInfoApiEntity.langCode) && C41536l.m120484d(this.productType, offerInfoApiEntity.productType) && C41536l.m120484d(this.productCode, offerInfoApiEntity.productCode) && C41536l.m120484d(this.productName, offerInfoApiEntity.productName) && C41536l.m120484d(this.productText, offerInfoApiEntity.productText) && C41536l.m120484d(this.offerText, offerInfoApiEntity.offerText) && C41536l.m120484d(this.offerProduct, offerInfoApiEntity.offerProduct) && C41536l.m120484d(this.operType, offerInfoApiEntity.operType) && C41536l.m120484d(this.extraCode, offerInfoApiEntity.extraCode) && C41536l.m120484d(this.productUrl, offerInfoApiEntity.productUrl) && C41536l.m120484d(this.attachmentFileBase64, offerInfoApiEntity.attachmentFileBase64) && C41536l.m120484d(this.offerNo, offerInfoApiEntity.offerNo) && C41536l.m120484d(this.orderNo, offerInfoApiEntity.orderNo) && C41536l.m120484d(this.effectiveInterestRate, offerInfoApiEntity.effectiveInterestRate) && C41536l.m120484d(this.hasPromotion, offerInfoApiEntity.hasPromotion) && C41536l.m120484d(this.offerAmount, offerInfoApiEntity.offerAmount) && C41536l.m120484d(this.offerCcy, offerInfoApiEntity.offerCcy) && C41536l.m120484d(this.displayBannerOnHome, offerInfoApiEntity.displayBannerOnHome) && C41536l.m120484d(this.offerScheme, offerInfoApiEntity.offerScheme);
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

    public final String getExtraCode() {
        return this.extraCode;
    }

    public final String getHasPromotion() {
        return this.hasPromotion;
    }

    public final long getId() {
        return this.f56451id;
    }

    public final String getLangCode() {
        return this.langCode;
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

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductText() {
        return this.productText;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final String getProductUrl() {
        return this.productUrl;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f56451id) * 31;
        String str = this.langCode;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productType;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.productCode.hashCode()) * 31;
        String str3 = this.productName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productText;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offerText;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offerProduct;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.operType;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.extraCode;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.productUrl;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.attachmentFileBase64;
        int hashCode10 = (((hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31) + this.offerNo.hashCode()) * 31;
        Integer num = this.orderNo;
        int hashCode11 = (((hashCode10 + (num == null ? 0 : num.hashCode())) * 31) + this.effectiveInterestRate.hashCode()) * 31;
        String str11 = this.hasPromotion;
        int hashCode12 = (((((hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.offerAmount.hashCode()) * 31) + this.offerCcy.hashCode()) * 31;
        Boolean bool = this.displayBannerOnHome;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str12 = this.offerScheme;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        long j = this.f56451id;
        String str = this.langCode;
        String str2 = this.productType;
        String str3 = this.productCode;
        String str4 = this.productName;
        String str5 = this.productText;
        String str6 = this.offerText;
        String str7 = this.offerProduct;
        String str8 = this.operType;
        String str9 = this.extraCode;
        String str10 = this.productUrl;
        String str11 = this.attachmentFileBase64;
        String str12 = this.offerNo;
        Integer num = this.orderNo;
        String str13 = this.effectiveInterestRate;
        String str14 = this.hasPromotion;
        String str15 = this.offerAmount;
        String str16 = this.offerCcy;
        Boolean bool = this.displayBannerOnHome;
        String str17 = this.offerScheme;
        return "OfferInfoApiEntity(id=" + j + ", langCode=" + str + ", productType=" + str2 + ", productCode=" + str3 + ", productName=" + str4 + ", productText=" + str5 + ", offerText=" + str6 + ", offerProduct=" + str7 + ", operType=" + str8 + ", extraCode=" + str9 + ", productUrl=" + str10 + ", attachmentFileBase64=" + str11 + ", offerNo=" + str12 + ", orderNo=" + num + ", effectiveInterestRate=" + str13 + ", hasPromotion=" + str14 + ", offerAmount=" + str15 + ", offerCcy=" + str16 + ", displayBannerOnHome=" + bool + ", offerScheme=" + str17 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OfferInfoApiEntity(long r26, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.Boolean r45, java.lang.String r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r25 = this;
            r0 = r47
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r28
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r29
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r31
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r32
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r33
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r34
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r13 = r2
            goto L_0x003b
        L_0x0039:
            r13 = r35
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r14 = r2
            goto L_0x0043
        L_0x0041:
            r14 = r36
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r15 = r2
            goto L_0x004b
        L_0x0049:
            r15 = r37
        L_0x004b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0052
            r16 = r2
            goto L_0x0054
        L_0x0052:
            r16 = r38
        L_0x0054:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x005b
            r18 = r2
            goto L_0x005d
        L_0x005b:
            r18 = r40
        L_0x005d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0066
            r20 = r2
            goto L_0x0068
        L_0x0066:
            r20 = r42
        L_0x0068:
            r3 = r25
            r4 = r26
            r8 = r30
            r17 = r39
            r19 = r41
            r21 = r43
            r22 = r44
            r23 = r45
            r24 = r46
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.offer.entity.OfferInfoApiEntity.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
