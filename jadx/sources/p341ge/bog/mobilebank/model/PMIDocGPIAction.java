package p341ge.bog.mobilebank.model;

import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.parceler.Parcel;
import p277ua.C8662a;
import p277ua.C8664c;

@Parcel
/* renamed from: ge.bog.mobilebank.model.PMIDocGPIAction */
public final class PMIDocGPIAction {
    @C8664c("action")
    private String action;
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("ccy")
    private String ccy;
    @C8664c("dateTime")
    private String dateTime;
    @C8664c("description")
    private String description;
    @C8664c("docKey")
    private Long docKey;
    @C8662a
    @C8664c("id")

    /* renamed from: id */
    private final Long f81293id;
    @C8664c("localDate")
    private Long localDate;
    @C8664c("originalDate")
    private Long originalDate;
    @C8664c("referenceNumber")
    private String referenceNumber;
    @C8664c("relatedReference")
    private String relatedReference;
    @C8664c("rowNumber")
    private Long rowNumber;
    @C8664c("statusCode")
    private String statusCode;
    @C8664c("statusDesc")
    private String statusDesc;
    @C8664c("statusOriginarorCity")
    private String statusOriginarorCity;
    @C8664c("statusOriginatorBic")
    private String statusOriginatorBic;
    @C8664c("statusOriginatorCounty")
    private String statusOriginatorCounty;
    @C8664c("statusOriginatorName")
    private String statusOriginatorName;
    @C8664c("swtMt")
    private String swtMt;
    @C8664c("timeZn")
    private String timeZn;

    public PMIDocGPIAction() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (Long) null, 1048575, (DefaultConstructorMarker) null);
    }

    private final Long component1() {
        return this.f81293id;
    }

    public static /* synthetic */ PMIDocGPIAction copy$default(PMIDocGPIAction pMIDocGPIAction, Long l, Long l2, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l3, Long l4, String str13, String str14, Long l5, int i, Object obj) {
        PMIDocGPIAction pMIDocGPIAction2 = pMIDocGPIAction;
        int i2 = i;
        return pMIDocGPIAction.copy((i2 & 1) != 0 ? pMIDocGPIAction2.f81293id : l, (i2 & 2) != 0 ? pMIDocGPIAction2.docKey : l2, (i2 & 4) != 0 ? pMIDocGPIAction2.dateTime : str, (i2 & 8) != 0 ? pMIDocGPIAction2.statusCode : str2, (i2 & 16) != 0 ? pMIDocGPIAction2.description : str3, (i2 & 32) != 0 ? pMIDocGPIAction2.action : str4, (i2 & 64) != 0 ? pMIDocGPIAction2.swtMt : str5, (i2 & 128) != 0 ? pMIDocGPIAction2.amount : bigDecimal, (i2 & C11398b.f33139r) != 0 ? pMIDocGPIAction2.ccy : str6, (i2 & C11398b.f33140s) != 0 ? pMIDocGPIAction2.statusOriginatorBic : str7, (i2 & C11398b.f33141t) != 0 ? pMIDocGPIAction2.statusOriginatorName : str8, (i2 & C11398b.f33142u) != 0 ? pMIDocGPIAction2.statusOriginatorCounty : str9, (i2 & C11398b.f33143v) != 0 ? pMIDocGPIAction2.statusOriginarorCity : str10, (i2 & 8192) != 0 ? pMIDocGPIAction2.referenceNumber : str11, (i2 & 16384) != 0 ? pMIDocGPIAction2.relatedReference : str12, (i2 & 32768) != 0 ? pMIDocGPIAction2.localDate : l3, (i2 & 65536) != 0 ? pMIDocGPIAction2.originalDate : l4, (i2 & 131072) != 0 ? pMIDocGPIAction2.timeZn : str13, (i2 & 262144) != 0 ? pMIDocGPIAction2.statusDesc : str14, (i2 & 524288) != 0 ? pMIDocGPIAction2.rowNumber : l5);
    }

    public final String component10() {
        return this.statusOriginatorBic;
    }

    public final String component11() {
        return this.statusOriginatorName;
    }

    public final String component12() {
        return this.statusOriginatorCounty;
    }

    public final String component13() {
        return this.statusOriginarorCity;
    }

    public final String component14() {
        return this.referenceNumber;
    }

    public final String component15() {
        return this.relatedReference;
    }

    public final Long component16() {
        return this.localDate;
    }

    public final Long component17() {
        return this.originalDate;
    }

    public final String component18() {
        return this.timeZn;
    }

    public final String component19() {
        return this.statusDesc;
    }

    public final Long component2() {
        return this.docKey;
    }

    public final Long component20() {
        return this.rowNumber;
    }

    public final String component3() {
        return this.dateTime;
    }

    public final String component4() {
        return this.statusCode;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.action;
    }

    public final String component7() {
        return this.swtMt;
    }

    public final BigDecimal component8() {
        return this.amount;
    }

    public final String component9() {
        return this.ccy;
    }

    public final PMIDocGPIAction copy(Long l, Long l2, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l3, Long l4, String str13, String str14, Long l5) {
        return new PMIDocGPIAction(l, l2, str, str2, str3, str4, str5, bigDecimal, str6, str7, str8, str9, str10, str11, str12, l3, l4, str13, str14, l5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PMIDocGPIAction)) {
            return false;
        }
        PMIDocGPIAction pMIDocGPIAction = (PMIDocGPIAction) obj;
        return C41536l.m120484d(this.f81293id, pMIDocGPIAction.f81293id) && C41536l.m120484d(this.docKey, pMIDocGPIAction.docKey) && C41536l.m120484d(this.dateTime, pMIDocGPIAction.dateTime) && C41536l.m120484d(this.statusCode, pMIDocGPIAction.statusCode) && C41536l.m120484d(this.description, pMIDocGPIAction.description) && C41536l.m120484d(this.action, pMIDocGPIAction.action) && C41536l.m120484d(this.swtMt, pMIDocGPIAction.swtMt) && C41536l.m120484d(this.amount, pMIDocGPIAction.amount) && C41536l.m120484d(this.ccy, pMIDocGPIAction.ccy) && C41536l.m120484d(this.statusOriginatorBic, pMIDocGPIAction.statusOriginatorBic) && C41536l.m120484d(this.statusOriginatorName, pMIDocGPIAction.statusOriginatorName) && C41536l.m120484d(this.statusOriginatorCounty, pMIDocGPIAction.statusOriginatorCounty) && C41536l.m120484d(this.statusOriginarorCity, pMIDocGPIAction.statusOriginarorCity) && C41536l.m120484d(this.referenceNumber, pMIDocGPIAction.referenceNumber) && C41536l.m120484d(this.relatedReference, pMIDocGPIAction.relatedReference) && C41536l.m120484d(this.localDate, pMIDocGPIAction.localDate) && C41536l.m120484d(this.originalDate, pMIDocGPIAction.originalDate) && C41536l.m120484d(this.timeZn, pMIDocGPIAction.timeZn) && C41536l.m120484d(this.statusDesc, pMIDocGPIAction.statusDesc) && C41536l.m120484d(this.rowNumber, pMIDocGPIAction.rowNumber);
    }

    public final String getAction() {
        return this.action;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Long getDocKey() {
        return this.docKey;
    }

    public final Long getLocalDate() {
        return this.localDate;
    }

    public final Long getOriginalDate() {
        return this.originalDate;
    }

    public final String getReferenceNumber() {
        return this.referenceNumber;
    }

    public final String getRelatedReference() {
        return this.relatedReference;
    }

    public final Long getRowNumber() {
        return this.rowNumber;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final String getStatusOriginarorCity() {
        return this.statusOriginarorCity;
    }

    public final String getStatusOriginatorBic() {
        return this.statusOriginatorBic;
    }

    public final String getStatusOriginatorCounty() {
        return this.statusOriginatorCounty;
    }

    public final String getStatusOriginatorName() {
        return this.statusOriginatorName;
    }

    public final String getSwtMt() {
        return this.swtMt;
    }

    public final String getTimeZn() {
        return this.timeZn;
    }

    public int hashCode() {
        Long l = this.f81293id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.docKey;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.dateTime;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusCode;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.action;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.swtMt;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.amount;
        int hashCode8 = (hashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str6 = this.ccy;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.statusOriginatorBic;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.statusOriginatorName;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.statusOriginatorCounty;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.statusOriginarorCity;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.referenceNumber;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.relatedReference;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Long l3 = this.localDate;
        int hashCode16 = (hashCode15 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.originalDate;
        int hashCode17 = (hashCode16 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str13 = this.timeZn;
        int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.statusDesc;
        int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l5 = this.rowNumber;
        if (l5 != null) {
            i = l5.hashCode();
        }
        return hashCode19 + i;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final void setCcy(String str) {
        this.ccy = str;
    }

    public final void setDateTime(String str) {
        this.dateTime = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDocKey(Long l) {
        this.docKey = l;
    }

    public final void setLocalDate(Long l) {
        this.localDate = l;
    }

    public final void setOriginalDate(Long l) {
        this.originalDate = l;
    }

    public final void setReferenceNumber(String str) {
        this.referenceNumber = str;
    }

    public final void setRelatedReference(String str) {
        this.relatedReference = str;
    }

    public final void setRowNumber(Long l) {
        this.rowNumber = l;
    }

    public final void setStatusCode(String str) {
        this.statusCode = str;
    }

    public final void setStatusDesc(String str) {
        this.statusDesc = str;
    }

    public final void setStatusOriginarorCity(String str) {
        this.statusOriginarorCity = str;
    }

    public final void setStatusOriginatorBic(String str) {
        this.statusOriginatorBic = str;
    }

    public final void setStatusOriginatorCounty(String str) {
        this.statusOriginatorCounty = str;
    }

    public final void setStatusOriginatorName(String str) {
        this.statusOriginatorName = str;
    }

    public final void setSwtMt(String str) {
        this.swtMt = str;
    }

    public final void setTimeZn(String str) {
        this.timeZn = str;
    }

    public String toString() {
        Long l = this.f81293id;
        Long l2 = this.docKey;
        String str = this.dateTime;
        String str2 = this.statusCode;
        String str3 = this.description;
        String str4 = this.action;
        String str5 = this.swtMt;
        BigDecimal bigDecimal = this.amount;
        String str6 = this.ccy;
        String str7 = this.statusOriginatorBic;
        String str8 = this.statusOriginatorName;
        String str9 = this.statusOriginatorCounty;
        String str10 = this.statusOriginarorCity;
        String str11 = this.referenceNumber;
        String str12 = this.relatedReference;
        Long l3 = this.localDate;
        Long l4 = this.originalDate;
        String str13 = this.timeZn;
        String str14 = this.statusDesc;
        Long l5 = this.rowNumber;
        return "PMIDocGPIAction(id=" + l + ", docKey=" + l2 + ", dateTime=" + str + ", statusCode=" + str2 + ", description=" + str3 + ", action=" + str4 + ", swtMt=" + str5 + ", amount=" + bigDecimal + ", ccy=" + str6 + ", statusOriginatorBic=" + str7 + ", statusOriginatorName=" + str8 + ", statusOriginatorCounty=" + str9 + ", statusOriginarorCity=" + str10 + ", referenceNumber=" + str11 + ", relatedReference=" + str12 + ", localDate=" + l3 + ", originalDate=" + l4 + ", timeZn=" + str13 + ", statusDesc=" + str14 + ", rowNumber=" + l5 + ")";
    }

    public PMIDocGPIAction(Long l, Long l2, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l3, Long l4, String str13, String str14, Long l5) {
        this.f81293id = l;
        this.docKey = l2;
        this.dateTime = str;
        this.statusCode = str2;
        this.description = str3;
        this.action = str4;
        this.swtMt = str5;
        this.amount = bigDecimal;
        this.ccy = str6;
        this.statusOriginatorBic = str7;
        this.statusOriginatorName = str8;
        this.statusOriginatorCounty = str9;
        this.statusOriginarorCity = str10;
        this.referenceNumber = str11;
        this.relatedReference = str12;
        this.localDate = l3;
        this.originalDate = l4;
        this.timeZn = str13;
        this.statusDesc = str14;
        this.rowNumber = l5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PMIDocGPIAction(java.lang.Long r22, java.lang.Long r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.math.BigDecimal r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.Long r37, java.lang.Long r38, java.lang.String r39, java.lang.String r40, java.lang.Long r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r21 = this;
            r0 = r42
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r22
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = 0
            goto L_0x0012
        L_0x0010:
            r3 = r23
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = 0
            goto L_0x001a
        L_0x0018:
            r4 = r24
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0022
        L_0x0020:
            r5 = r25
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = 0
            goto L_0x002a
        L_0x0028:
            r6 = r26
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = 0
            goto L_0x0032
        L_0x0030:
            r7 = r27
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = 0
            goto L_0x003a
        L_0x0038:
            r8 = r28
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = 0
            goto L_0x0042
        L_0x0040:
            r9 = r29
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = 0
            goto L_0x004a
        L_0x0048:
            r10 = r30
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0050
            r11 = 0
            goto L_0x0052
        L_0x0050:
            r11 = r31
        L_0x0052:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0058
            r12 = 0
            goto L_0x005a
        L_0x0058:
            r12 = r32
        L_0x005a:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0060
            r13 = 0
            goto L_0x0062
        L_0x0060:
            r13 = r33
        L_0x0062:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x0068
            r14 = 0
            goto L_0x006a
        L_0x0068:
            r14 = r34
        L_0x006a:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0070
            r15 = 0
            goto L_0x0072
        L_0x0070:
            r15 = r35
        L_0x0072:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0078
            r2 = 0
            goto L_0x007a
        L_0x0078:
            r2 = r36
        L_0x007a:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0084
            r16 = 0
            goto L_0x0086
        L_0x0084:
            r16 = r37
        L_0x0086:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x008f
            r17 = 0
            goto L_0x0091
        L_0x008f:
            r17 = r38
        L_0x0091:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009a
            r18 = 0
            goto L_0x009c
        L_0x009a:
            r18 = r39
        L_0x009c:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a5
            r19 = 0
            goto L_0x00a7
        L_0x00a5:
            r19 = r40
        L_0x00a7:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00af
            r0 = 0
            goto L_0x00b1
        L_0x00af:
            r0 = r41
        L_0x00b1:
            r22 = r21
            r23 = r1
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r12
            r34 = r13
            r35 = r14
            r36 = r15
            r37 = r2
            r38 = r16
            r39 = r17
            r40 = r18
            r41 = r19
            r42 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.PMIDocGPIAction.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
