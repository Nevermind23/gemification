package p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferRefinanceEntity */
public final class CreditOfferRefinanceEntity {
    private final String desireRefFlag;
    private final YesNoApiEntity isCreditorIdentified;
    private final boolean isRefinanceMandatory;
    private final String oldCardIconBase64;
    private final String productAmount;
    private final String productCcy;
    private final String productClass;
    private final String productCode;
    private final String productCreditorName;
    private final String productDictionaryKey;
    private final String productInitAmt;
    private final String productKey;
    private final String productName;
    private final String productNo;
    private final String productPmt;
    private final YesNoApiEntity productRefFlag;
    private final ProductSourceEntity productSource;
    private final String productType;

    public CreditOfferRefinanceEntity(ProductSourceEntity productSourceEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, YesNoApiEntity yesNoApiEntity2, boolean z) {
        YesNoApiEntity yesNoApiEntity3 = yesNoApiEntity;
        YesNoApiEntity yesNoApiEntity4 = yesNoApiEntity2;
        C41536l.m120489i(str4, "productName");
        C41536l.m120489i(str6, "productAmount");
        C41536l.m120489i(yesNoApiEntity3, "productRefFlag");
        C41536l.m120489i(yesNoApiEntity4, "isCreditorIdentified");
        this.productSource = productSourceEntity;
        this.productClass = str;
        this.productKey = str2;
        this.productDictionaryKey = str3;
        this.productName = str4;
        this.productInitAmt = str5;
        this.productAmount = str6;
        this.desireRefFlag = str7;
        this.oldCardIconBase64 = str8;
        this.productCode = str9;
        this.productPmt = str10;
        this.productRefFlag = yesNoApiEntity3;
        this.productCcy = str11;
        this.productType = str12;
        this.productNo = str13;
        this.productCreditorName = str14;
        this.isCreditorIdentified = yesNoApiEntity4;
        this.isRefinanceMandatory = z;
    }

    public static /* synthetic */ CreditOfferRefinanceEntity copy$default(CreditOfferRefinanceEntity creditOfferRefinanceEntity, ProductSourceEntity productSourceEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, YesNoApiEntity yesNoApiEntity2, boolean z, int i, Object obj) {
        CreditOfferRefinanceEntity creditOfferRefinanceEntity2 = creditOfferRefinanceEntity;
        int i2 = i;
        return creditOfferRefinanceEntity.copy((i2 & 1) != 0 ? creditOfferRefinanceEntity2.productSource : productSourceEntity, (i2 & 2) != 0 ? creditOfferRefinanceEntity2.productClass : str, (i2 & 4) != 0 ? creditOfferRefinanceEntity2.productKey : str2, (i2 & 8) != 0 ? creditOfferRefinanceEntity2.productDictionaryKey : str3, (i2 & 16) != 0 ? creditOfferRefinanceEntity2.productName : str4, (i2 & 32) != 0 ? creditOfferRefinanceEntity2.productInitAmt : str5, (i2 & 64) != 0 ? creditOfferRefinanceEntity2.productAmount : str6, (i2 & 128) != 0 ? creditOfferRefinanceEntity2.desireRefFlag : str7, (i2 & C11398b.f33139r) != 0 ? creditOfferRefinanceEntity2.oldCardIconBase64 : str8, (i2 & C11398b.f33140s) != 0 ? creditOfferRefinanceEntity2.productCode : str9, (i2 & C11398b.f33141t) != 0 ? creditOfferRefinanceEntity2.productPmt : str10, (i2 & C11398b.f33142u) != 0 ? creditOfferRefinanceEntity2.productRefFlag : yesNoApiEntity, (i2 & C11398b.f33143v) != 0 ? creditOfferRefinanceEntity2.productCcy : str11, (i2 & 8192) != 0 ? creditOfferRefinanceEntity2.productType : str12, (i2 & 16384) != 0 ? creditOfferRefinanceEntity2.productNo : str13, (i2 & 32768) != 0 ? creditOfferRefinanceEntity2.productCreditorName : str14, (i2 & 65536) != 0 ? creditOfferRefinanceEntity2.isCreditorIdentified : yesNoApiEntity2, (i2 & 131072) != 0 ? creditOfferRefinanceEntity2.isRefinanceMandatory : z);
    }

    public final ProductSourceEntity component1() {
        return this.productSource;
    }

    public final String component10() {
        return this.productCode;
    }

    public final String component11() {
        return this.productPmt;
    }

    public final YesNoApiEntity component12() {
        return this.productRefFlag;
    }

    public final String component13() {
        return this.productCcy;
    }

    public final String component14() {
        return this.productType;
    }

    public final String component15() {
        return this.productNo;
    }

    public final String component16() {
        return this.productCreditorName;
    }

    public final YesNoApiEntity component17() {
        return this.isCreditorIdentified;
    }

    public final boolean component18() {
        return this.isRefinanceMandatory;
    }

    public final String component2() {
        return this.productClass;
    }

    public final String component3() {
        return this.productKey;
    }

    public final String component4() {
        return this.productDictionaryKey;
    }

    public final String component5() {
        return this.productName;
    }

    public final String component6() {
        return this.productInitAmt;
    }

    public final String component7() {
        return this.productAmount;
    }

    public final String component8() {
        return this.desireRefFlag;
    }

    public final String component9() {
        return this.oldCardIconBase64;
    }

    public final CreditOfferRefinanceEntity copy(ProductSourceEntity productSourceEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, YesNoApiEntity yesNoApiEntity, String str11, String str12, String str13, String str14, YesNoApiEntity yesNoApiEntity2, boolean z) {
        ProductSourceEntity productSourceEntity2 = productSourceEntity;
        C41536l.m120489i(str4, "productName");
        C41536l.m120489i(str6, "productAmount");
        C41536l.m120489i(yesNoApiEntity, "productRefFlag");
        C41536l.m120489i(yesNoApiEntity2, "isCreditorIdentified");
        return new CreditOfferRefinanceEntity(productSourceEntity, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, yesNoApiEntity, str11, str12, str13, str14, yesNoApiEntity2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditOfferRefinanceEntity)) {
            return false;
        }
        CreditOfferRefinanceEntity creditOfferRefinanceEntity = (CreditOfferRefinanceEntity) obj;
        return this.productSource == creditOfferRefinanceEntity.productSource && C41536l.m120484d(this.productClass, creditOfferRefinanceEntity.productClass) && C41536l.m120484d(this.productKey, creditOfferRefinanceEntity.productKey) && C41536l.m120484d(this.productDictionaryKey, creditOfferRefinanceEntity.productDictionaryKey) && C41536l.m120484d(this.productName, creditOfferRefinanceEntity.productName) && C41536l.m120484d(this.productInitAmt, creditOfferRefinanceEntity.productInitAmt) && C41536l.m120484d(this.productAmount, creditOfferRefinanceEntity.productAmount) && C41536l.m120484d(this.desireRefFlag, creditOfferRefinanceEntity.desireRefFlag) && C41536l.m120484d(this.oldCardIconBase64, creditOfferRefinanceEntity.oldCardIconBase64) && C41536l.m120484d(this.productCode, creditOfferRefinanceEntity.productCode) && C41536l.m120484d(this.productPmt, creditOfferRefinanceEntity.productPmt) && this.productRefFlag == creditOfferRefinanceEntity.productRefFlag && C41536l.m120484d(this.productCcy, creditOfferRefinanceEntity.productCcy) && C41536l.m120484d(this.productType, creditOfferRefinanceEntity.productType) && C41536l.m120484d(this.productNo, creditOfferRefinanceEntity.productNo) && C41536l.m120484d(this.productCreditorName, creditOfferRefinanceEntity.productCreditorName) && this.isCreditorIdentified == creditOfferRefinanceEntity.isCreditorIdentified && this.isRefinanceMandatory == creditOfferRefinanceEntity.isRefinanceMandatory;
    }

    public final String getDesireRefFlag() {
        return this.desireRefFlag;
    }

    public final String getOldCardIconBase64() {
        return this.oldCardIconBase64;
    }

    public final String getProductAmount() {
        return this.productAmount;
    }

    public final String getProductCcy() {
        return this.productCcy;
    }

    public final String getProductClass() {
        return this.productClass;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductCreditorName() {
        return this.productCreditorName;
    }

    public final String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public final String getProductInitAmt() {
        return this.productInitAmt;
    }

    public final String getProductKey() {
        return this.productKey;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductNo() {
        return this.productNo;
    }

    public final String getProductPmt() {
        return this.productPmt;
    }

    public final YesNoApiEntity getProductRefFlag() {
        return this.productRefFlag;
    }

    public final ProductSourceEntity getProductSource() {
        return this.productSource;
    }

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        ProductSourceEntity productSourceEntity = this.productSource;
        int i = 0;
        int hashCode = (productSourceEntity == null ? 0 : productSourceEntity.hashCode()) * 31;
        String str = this.productClass;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productKey;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productDictionaryKey;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.productName.hashCode()) * 31;
        String str4 = this.productInitAmt;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.productAmount.hashCode()) * 31;
        String str5 = this.desireRefFlag;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.oldCardIconBase64;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productCode;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productPmt;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.productRefFlag.hashCode()) * 31;
        String str9 = this.productCcy;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.productType;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.productNo;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.productCreditorName;
        if (str12 != null) {
            i = str12.hashCode();
        }
        int hashCode13 = (((hashCode12 + i) * 31) + this.isCreditorIdentified.hashCode()) * 31;
        boolean z = this.isRefinanceMandatory;
        if (z) {
            z = true;
        }
        return hashCode13 + (z ? 1 : 0);
    }

    public final YesNoApiEntity isCreditorIdentified() {
        return this.isCreditorIdentified;
    }

    public final boolean isRefinanceMandatory() {
        return this.isRefinanceMandatory;
    }

    public String toString() {
        ProductSourceEntity productSourceEntity = this.productSource;
        String str = this.productClass;
        String str2 = this.productKey;
        String str3 = this.productDictionaryKey;
        String str4 = this.productName;
        String str5 = this.productInitAmt;
        String str6 = this.productAmount;
        String str7 = this.desireRefFlag;
        String str8 = this.oldCardIconBase64;
        String str9 = this.productCode;
        String str10 = this.productPmt;
        YesNoApiEntity yesNoApiEntity = this.productRefFlag;
        String str11 = this.productCcy;
        String str12 = this.productType;
        String str13 = this.productNo;
        String str14 = this.productCreditorName;
        YesNoApiEntity yesNoApiEntity2 = this.isCreditorIdentified;
        boolean z = this.isRefinanceMandatory;
        return "CreditOfferRefinanceEntity(productSource=" + productSourceEntity + ", productClass=" + str + ", productKey=" + str2 + ", productDictionaryKey=" + str3 + ", productName=" + str4 + ", productInitAmt=" + str5 + ", productAmount=" + str6 + ", desireRefFlag=" + str7 + ", oldCardIconBase64=" + str8 + ", productCode=" + str9 + ", productPmt=" + str10 + ", productRefFlag=" + yesNoApiEntity + ", productCcy=" + str11 + ", productType=" + str12 + ", productNo=" + str13 + ", productCreditorName=" + str14 + ", isCreditorIdentified=" + yesNoApiEntity2 + ", isRefinanceMandatory=" + z + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreditOfferRefinanceEntity(p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.ProductSourceEntity r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r39, boolean r40, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r23
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r24
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r25
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r26
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0029
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r28
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r30
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r31
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r32
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r14 = r2
            goto L_0x004b
        L_0x0049:
            r14 = r33
        L_0x004b:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0052
            r16 = r2
            goto L_0x0054
        L_0x0052:
            r16 = r35
        L_0x0054:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x005b
            r17 = r2
            goto L_0x005d
        L_0x005b:
            r17 = r36
        L_0x005d:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0064
            r18 = r2
            goto L_0x0066
        L_0x0064:
            r18 = r37
        L_0x0066:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x006f
            r19 = r2
            goto L_0x0071
        L_0x006f:
            r19 = r38
        L_0x0071:
            r3 = r22
            r8 = r27
            r10 = r29
            r15 = r34
            r20 = r39
            r21 = r40
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.data.creditapplication.entity.CreditOfferRefinanceEntity.<init>(ge.bog.mobilebank.cleanarch.data.creditapplication.entity.ProductSourceEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
