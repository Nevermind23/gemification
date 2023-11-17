package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CardInsSecCardApiModel */
public final class CardInsSecCardApiModel {
    private final long acctKey;
    private final String attachmentFileBase64;
    private final long cardId;
    private final String cardName;
    private final YesNoApiModel dgPassYN;
    private final String dictionaryKey;
    private final String dictionaryValue;
    private final YesNoApiModel digipassAllow;
    private final YesNoApiModel insAllow;
    private final String insuranceId;
    private final Long insuranceNo;
    private final String insuranceType;
    private final String insuranceTypeKey;
    private final YesNoApiModel isScoolcard;
    private final String lastFour;
    private final String mobile;
    private final Long nextChargeDate;
    private final YesNoApiModel sec3D;
    private final YesNoApiModel secAllow;
    private final String subProductCode;

    public CardInsSecCardApiModel(long j, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, String str8, YesNoApiModel yesNoApiModel3, YesNoApiModel yesNoApiModel4, YesNoApiModel yesNoApiModel5, String str9, YesNoApiModel yesNoApiModel6, String str10, Long l2) {
        YesNoApiModel yesNoApiModel7 = yesNoApiModel;
        YesNoApiModel yesNoApiModel8 = yesNoApiModel2;
        YesNoApiModel yesNoApiModel9 = yesNoApiModel3;
        YesNoApiModel yesNoApiModel10 = yesNoApiModel5;
        YesNoApiModel yesNoApiModel11 = yesNoApiModel6;
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(yesNoApiModel7, "insAllow");
        C41536l.m120489i(yesNoApiModel8, "sec3D");
        C41536l.m120489i(yesNoApiModel9, "dgPassYN");
        C41536l.m120489i(yesNoApiModel10, "isScoolcard");
        C41536l.m120489i(yesNoApiModel11, "digipassAllow");
        this.cardId = j;
        this.acctKey = j2;
        this.cardName = str;
        this.subProductCode = str2;
        this.lastFour = str3;
        this.dictionaryKey = str4;
        this.insuranceId = str5;
        this.insuranceNo = l;
        this.insuranceType = str6;
        this.insuranceTypeKey = str7;
        this.insAllow = yesNoApiModel7;
        this.sec3D = yesNoApiModel8;
        this.mobile = str8;
        this.dgPassYN = yesNoApiModel9;
        this.secAllow = yesNoApiModel4;
        this.isScoolcard = yesNoApiModel10;
        this.dictionaryValue = str9;
        this.digipassAllow = yesNoApiModel11;
        this.attachmentFileBase64 = str10;
        this.nextChargeDate = l2;
    }

    public static /* synthetic */ CardInsSecCardApiModel copy$default(CardInsSecCardApiModel cardInsSecCardApiModel, long j, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, String str8, YesNoApiModel yesNoApiModel3, YesNoApiModel yesNoApiModel4, YesNoApiModel yesNoApiModel5, String str9, YesNoApiModel yesNoApiModel6, String str10, Long l2, int i, Object obj) {
        CardInsSecCardApiModel cardInsSecCardApiModel2 = cardInsSecCardApiModel;
        int i2 = i;
        return cardInsSecCardApiModel.copy((i2 & 1) != 0 ? cardInsSecCardApiModel2.cardId : j, (i2 & 2) != 0 ? cardInsSecCardApiModel2.acctKey : j2, (i2 & 4) != 0 ? cardInsSecCardApiModel2.cardName : str, (i2 & 8) != 0 ? cardInsSecCardApiModel2.subProductCode : str2, (i2 & 16) != 0 ? cardInsSecCardApiModel2.lastFour : str3, (i2 & 32) != 0 ? cardInsSecCardApiModel2.dictionaryKey : str4, (i2 & 64) != 0 ? cardInsSecCardApiModel2.insuranceId : str5, (i2 & 128) != 0 ? cardInsSecCardApiModel2.insuranceNo : l, (i2 & C11398b.f33139r) != 0 ? cardInsSecCardApiModel2.insuranceType : str6, (i2 & C11398b.f33140s) != 0 ? cardInsSecCardApiModel2.insuranceTypeKey : str7, (i2 & C11398b.f33141t) != 0 ? cardInsSecCardApiModel2.insAllow : yesNoApiModel, (i2 & C11398b.f33142u) != 0 ? cardInsSecCardApiModel2.sec3D : yesNoApiModel2, (i2 & C11398b.f33143v) != 0 ? cardInsSecCardApiModel2.mobile : str8, (i2 & 8192) != 0 ? cardInsSecCardApiModel2.dgPassYN : yesNoApiModel3, (i2 & 16384) != 0 ? cardInsSecCardApiModel2.secAllow : yesNoApiModel4, (i2 & 32768) != 0 ? cardInsSecCardApiModel2.isScoolcard : yesNoApiModel5, (i2 & 65536) != 0 ? cardInsSecCardApiModel2.dictionaryValue : str9, (i2 & 131072) != 0 ? cardInsSecCardApiModel2.digipassAllow : yesNoApiModel6, (i2 & 262144) != 0 ? cardInsSecCardApiModel2.attachmentFileBase64 : str10, (i2 & 524288) != 0 ? cardInsSecCardApiModel2.nextChargeDate : l2);
    }

    public final long component1() {
        return this.cardId;
    }

    public final String component10() {
        return this.insuranceTypeKey;
    }

    public final YesNoApiModel component11() {
        return this.insAllow;
    }

    public final YesNoApiModel component12() {
        return this.sec3D;
    }

    public final String component13() {
        return this.mobile;
    }

    public final YesNoApiModel component14() {
        return this.dgPassYN;
    }

    public final YesNoApiModel component15() {
        return this.secAllow;
    }

    public final YesNoApiModel component16() {
        return this.isScoolcard;
    }

    public final String component17() {
        return this.dictionaryValue;
    }

    public final YesNoApiModel component18() {
        return this.digipassAllow;
    }

    public final String component19() {
        return this.attachmentFileBase64;
    }

    public final long component2() {
        return this.acctKey;
    }

    public final Long component20() {
        return this.nextChargeDate;
    }

    public final String component3() {
        return this.cardName;
    }

    public final String component4() {
        return this.subProductCode;
    }

    public final String component5() {
        return this.lastFour;
    }

    public final String component6() {
        return this.dictionaryKey;
    }

    public final String component7() {
        return this.insuranceId;
    }

    public final Long component8() {
        return this.insuranceNo;
    }

    public final String component9() {
        return this.insuranceType;
    }

    public final CardInsSecCardApiModel copy(long j, long j2, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, YesNoApiModel yesNoApiModel, YesNoApiModel yesNoApiModel2, String str8, YesNoApiModel yesNoApiModel3, YesNoApiModel yesNoApiModel4, YesNoApiModel yesNoApiModel5, String str9, YesNoApiModel yesNoApiModel6, String str10, Long l2) {
        long j3 = j;
        C41536l.m120489i(str2, "subProductCode");
        C41536l.m120489i(yesNoApiModel, "insAllow");
        C41536l.m120489i(yesNoApiModel2, "sec3D");
        C41536l.m120489i(yesNoApiModel3, "dgPassYN");
        C41536l.m120489i(yesNoApiModel5, "isScoolcard");
        C41536l.m120489i(yesNoApiModel6, "digipassAllow");
        return new CardInsSecCardApiModel(j, j2, str, str2, str3, str4, str5, l, str6, str7, yesNoApiModel, yesNoApiModel2, str8, yesNoApiModel3, yesNoApiModel4, yesNoApiModel5, str9, yesNoApiModel6, str10, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardInsSecCardApiModel)) {
            return false;
        }
        CardInsSecCardApiModel cardInsSecCardApiModel = (CardInsSecCardApiModel) obj;
        return this.cardId == cardInsSecCardApiModel.cardId && this.acctKey == cardInsSecCardApiModel.acctKey && C41536l.m120484d(this.cardName, cardInsSecCardApiModel.cardName) && C41536l.m120484d(this.subProductCode, cardInsSecCardApiModel.subProductCode) && C41536l.m120484d(this.lastFour, cardInsSecCardApiModel.lastFour) && C41536l.m120484d(this.dictionaryKey, cardInsSecCardApiModel.dictionaryKey) && C41536l.m120484d(this.insuranceId, cardInsSecCardApiModel.insuranceId) && C41536l.m120484d(this.insuranceNo, cardInsSecCardApiModel.insuranceNo) && C41536l.m120484d(this.insuranceType, cardInsSecCardApiModel.insuranceType) && C41536l.m120484d(this.insuranceTypeKey, cardInsSecCardApiModel.insuranceTypeKey) && this.insAllow == cardInsSecCardApiModel.insAllow && this.sec3D == cardInsSecCardApiModel.sec3D && C41536l.m120484d(this.mobile, cardInsSecCardApiModel.mobile) && this.dgPassYN == cardInsSecCardApiModel.dgPassYN && this.secAllow == cardInsSecCardApiModel.secAllow && this.isScoolcard == cardInsSecCardApiModel.isScoolcard && C41536l.m120484d(this.dictionaryValue, cardInsSecCardApiModel.dictionaryValue) && this.digipassAllow == cardInsSecCardApiModel.digipassAllow && C41536l.m120484d(this.attachmentFileBase64, cardInsSecCardApiModel.attachmentFileBase64) && C41536l.m120484d(this.nextChargeDate, cardInsSecCardApiModel.nextChargeDate);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final YesNoApiModel getDgPassYN() {
        return this.dgPassYN;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getDictionaryValue() {
        return this.dictionaryValue;
    }

    public final YesNoApiModel getDigipassAllow() {
        return this.digipassAllow;
    }

    public final YesNoApiModel getInsAllow() {
        return this.insAllow;
    }

    public final String getInsuranceId() {
        return this.insuranceId;
    }

    public final Long getInsuranceNo() {
        return this.insuranceNo;
    }

    public final String getInsuranceType() {
        return this.insuranceType;
    }

    public final String getInsuranceTypeKey() {
        return this.insuranceTypeKey;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final Long getNextChargeDate() {
        return this.nextChargeDate;
    }

    public final YesNoApiModel getSec3D() {
        return this.sec3D;
    }

    public final YesNoApiModel getSecAllow() {
        return this.secAllow;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.cardId) * 31) + C7397t.m28148a(this.acctKey)) * 31;
        String str = this.cardName;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.subProductCode.hashCode()) * 31;
        String str2 = this.lastFour;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dictionaryKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.insuranceId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.insuranceNo;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.insuranceType;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.insuranceTypeKey;
        int hashCode7 = (((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.insAllow.hashCode()) * 31) + this.sec3D.hashCode()) * 31;
        String str7 = this.mobile;
        int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.dgPassYN.hashCode()) * 31;
        YesNoApiModel yesNoApiModel = this.secAllow;
        int hashCode9 = (((hashCode8 + (yesNoApiModel == null ? 0 : yesNoApiModel.hashCode())) * 31) + this.isScoolcard.hashCode()) * 31;
        String str8 = this.dictionaryValue;
        int hashCode10 = (((hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.digipassAllow.hashCode()) * 31;
        String str9 = this.attachmentFileBase64;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l2 = this.nextChargeDate;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode11 + i;
    }

    public final YesNoApiModel isScoolcard() {
        return this.isScoolcard;
    }

    public String toString() {
        long j = this.cardId;
        long j2 = this.acctKey;
        String str = this.cardName;
        String str2 = this.subProductCode;
        String str3 = this.lastFour;
        String str4 = this.dictionaryKey;
        String str5 = this.insuranceId;
        Long l = this.insuranceNo;
        String str6 = this.insuranceType;
        String str7 = this.insuranceTypeKey;
        YesNoApiModel yesNoApiModel = this.insAllow;
        YesNoApiModel yesNoApiModel2 = this.sec3D;
        String str8 = this.mobile;
        YesNoApiModel yesNoApiModel3 = this.dgPassYN;
        YesNoApiModel yesNoApiModel4 = this.secAllow;
        YesNoApiModel yesNoApiModel5 = this.isScoolcard;
        String str9 = this.dictionaryValue;
        YesNoApiModel yesNoApiModel6 = this.digipassAllow;
        String str10 = this.attachmentFileBase64;
        Long l2 = this.nextChargeDate;
        return "CardInsSecCardApiModel(cardId=" + j + ", acctKey=" + j2 + ", cardName=" + str + ", subProductCode=" + str2 + ", lastFour=" + str3 + ", dictionaryKey=" + str4 + ", insuranceId=" + str5 + ", insuranceNo=" + l + ", insuranceType=" + str6 + ", insuranceTypeKey=" + str7 + ", insAllow=" + yesNoApiModel + ", sec3D=" + yesNoApiModel2 + ", mobile=" + str8 + ", dgPassYN=" + yesNoApiModel3 + ", secAllow=" + yesNoApiModel4 + ", isScoolcard=" + yesNoApiModel5 + ", dictionaryValue=" + str9 + ", digipassAllow=" + yesNoApiModel6 + ", attachmentFileBase64=" + str10 + ", nextChargeDate=" + l2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CardInsSecCardApiModel(long r27, long r29, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.Long r36, java.lang.String r37, java.lang.String r38, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r39, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r40, java.lang.String r41, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r42, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r43, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r44, java.lang.String r45, p341ge.bog.mobilebank.products.data.model.YesNoApiModel r46, java.lang.String r47, java.lang.Long r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r31
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r34
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r12 = r2
            goto L_0x001b
        L_0x0019:
            r12 = r35
        L_0x001b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0021
            r13 = r2
            goto L_0x0023
        L_0x0021:
            r13 = r36
        L_0x0023:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0029
            r14 = r2
            goto L_0x002b
        L_0x0029:
            r14 = r37
        L_0x002b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0031
            r15 = r2
            goto L_0x0033
        L_0x0031:
            r15 = r38
        L_0x0033:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x003a
            r18 = r2
            goto L_0x003c
        L_0x003a:
            r18 = r41
        L_0x003c:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0043
            r20 = r2
            goto L_0x0045
        L_0x0043:
            r20 = r43
        L_0x0045:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004d
            r22 = r2
            goto L_0x004f
        L_0x004d:
            r22 = r45
        L_0x004f:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0057
            r24 = r2
            goto L_0x0059
        L_0x0057:
            r24 = r47
        L_0x0059:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0061
            r25 = r2
            goto L_0x0063
        L_0x0061:
            r25 = r48
        L_0x0063:
            r3 = r26
            r4 = r27
            r6 = r29
            r9 = r32
            r10 = r33
            r16 = r39
            r17 = r40
            r19 = r42
            r21 = r44
            r23 = r46
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.products.data.model.CardInsSecCardApiModel.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.products.data.model.YesNoApiModel, java.lang.String, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.products.data.model.YesNoApiModel, ge.bog.mobilebank.products.data.model.YesNoApiModel, java.lang.String, ge.bog.mobilebank.products.data.model.YesNoApiModel, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
