package p341ge.bog.mobilebank.ddsto.data.sto;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.ddsto.data.sto.StoApiModel */
public final class StoApiModel {
    @C8664c("amount")
    private Double amount;
    @C8664c("ccy")
    private String ccy;
    @C8664c("debitType")
    private String debitType;
    @C8664c("details")
    private Details details;
    @C8664c("dictionaryKey")
    private String dictionaryKey;
    @C8664c("name")
    private String name;
    @C8664c("nextSentDate")
    private Long nextSentDate;
    @C8664c("paymentId")
    private Long paymentId;
    @C8664c("periodType")
    private String periodType;
    @C8664c("periodTypeDictionaryKey")
    private String periodTypeDictionaryKey;
    @C8664c("productCode")
    private String productCode;
    @C8664c("serviceCode")
    private String serviceCode;
    @C8664c("status")
    private String status;

    public StoApiModel() {
        this((Long) null, (String) null, (Double) null, (String) null, (Details) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StoApiModel copy$default(StoApiModel stoApiModel, Long l, String str, Double d, String str2, Details details2, String str3, String str4, String str5, String str6, Long l2, String str7, String str8, String str9, int i, Object obj) {
        StoApiModel stoApiModel2 = stoApiModel;
        int i2 = i;
        return stoApiModel.copy((i2 & 1) != 0 ? stoApiModel2.paymentId : l, (i2 & 2) != 0 ? stoApiModel2.name : str, (i2 & 4) != 0 ? stoApiModel2.amount : d, (i2 & 8) != 0 ? stoApiModel2.ccy : str2, (i2 & 16) != 0 ? stoApiModel2.details : details2, (i2 & 32) != 0 ? stoApiModel2.productCode : str3, (i2 & 64) != 0 ? stoApiModel2.serviceCode : str4, (i2 & 128) != 0 ? stoApiModel2.periodType : str5, (i2 & C11398b.f33139r) != 0 ? stoApiModel2.periodTypeDictionaryKey : str6, (i2 & C11398b.f33140s) != 0 ? stoApiModel2.nextSentDate : l2, (i2 & C11398b.f33141t) != 0 ? stoApiModel2.debitType : str7, (i2 & C11398b.f33142u) != 0 ? stoApiModel2.status : str8, (i2 & C11398b.f33143v) != 0 ? stoApiModel2.dictionaryKey : str9);
    }

    public final Long component1() {
        return this.paymentId;
    }

    public final Long component10() {
        return this.nextSentDate;
    }

    public final String component11() {
        return this.debitType;
    }

    public final String component12() {
        return this.status;
    }

    public final String component13() {
        return this.dictionaryKey;
    }

    public final String component2() {
        return this.name;
    }

    public final Double component3() {
        return this.amount;
    }

    public final String component4() {
        return this.ccy;
    }

    public final Details component5() {
        return this.details;
    }

    public final String component6() {
        return this.productCode;
    }

    public final String component7() {
        return this.serviceCode;
    }

    public final String component8() {
        return this.periodType;
    }

    public final String component9() {
        return this.periodTypeDictionaryKey;
    }

    public final StoApiModel copy(Long l, String str, Double d, String str2, Details details2, String str3, String str4, String str5, String str6, Long l2, String str7, String str8, String str9) {
        return new StoApiModel(l, str, d, str2, details2, str3, str4, str5, str6, l2, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoApiModel)) {
            return false;
        }
        StoApiModel stoApiModel = (StoApiModel) obj;
        return C41536l.m120484d(this.paymentId, stoApiModel.paymentId) && C41536l.m120484d(this.name, stoApiModel.name) && C41536l.m120484d(this.amount, stoApiModel.amount) && C41536l.m120484d(this.ccy, stoApiModel.ccy) && C41536l.m120484d(this.details, stoApiModel.details) && C41536l.m120484d(this.productCode, stoApiModel.productCode) && C41536l.m120484d(this.serviceCode, stoApiModel.serviceCode) && C41536l.m120484d(this.periodType, stoApiModel.periodType) && C41536l.m120484d(this.periodTypeDictionaryKey, stoApiModel.periodTypeDictionaryKey) && C41536l.m120484d(this.nextSentDate, stoApiModel.nextSentDate) && C41536l.m120484d(this.debitType, stoApiModel.debitType) && C41536l.m120484d(this.status, stoApiModel.status) && C41536l.m120484d(this.dictionaryKey, stoApiModel.dictionaryKey);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDebitType() {
        return this.debitType;
    }

    public final Details getDetails() {
        return this.details;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getNextSentDate() {
        return this.nextSentDate;
    }

    public final Long getPaymentId() {
        return this.paymentId;
    }

    public final String getPeriodType() {
        return this.periodType;
    }

    public final String getPeriodTypeDictionaryKey() {
        return this.periodTypeDictionaryKey;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getServiceCode() {
        return this.serviceCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Long l = this.paymentId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.amount;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.ccy;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Details details2 = this.details;
        int hashCode5 = (hashCode4 + (details2 == null ? 0 : details2.hashCode())) * 31;
        String str3 = this.productCode;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serviceCode;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.periodType;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.periodTypeDictionaryKey;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.nextSentDate;
        int hashCode10 = (hashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str7 = this.debitType;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.dictionaryKey;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode12 + i;
    }

    public final void setAmount(Double d) {
        this.amount = d;
    }

    public final void setCcy(String str) {
        this.ccy = str;
    }

    public final void setDebitType(String str) {
        this.debitType = str;
    }

    public final void setDetails(Details details2) {
        this.details = details2;
    }

    public final void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNextSentDate(Long l) {
        this.nextSentDate = l;
    }

    public final void setPaymentId(Long l) {
        this.paymentId = l;
    }

    public final void setPeriodType(String str) {
        this.periodType = str;
    }

    public final void setPeriodTypeDictionaryKey(String str) {
        this.periodTypeDictionaryKey = str;
    }

    public final void setProductCode(String str) {
        this.productCode = str;
    }

    public final void setServiceCode(String str) {
        this.serviceCode = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        Long l = this.paymentId;
        String str = this.name;
        Double d = this.amount;
        String str2 = this.ccy;
        Details details2 = this.details;
        String str3 = this.productCode;
        String str4 = this.serviceCode;
        String str5 = this.periodType;
        String str6 = this.periodTypeDictionaryKey;
        Long l2 = this.nextSentDate;
        String str7 = this.debitType;
        String str8 = this.status;
        String str9 = this.dictionaryKey;
        return "StoApiModel(paymentId=" + l + ", name=" + str + ", amount=" + d + ", ccy=" + str2 + ", details=" + details2 + ", productCode=" + str3 + ", serviceCode=" + str4 + ", periodType=" + str5 + ", periodTypeDictionaryKey=" + str6 + ", nextSentDate=" + l2 + ", debitType=" + str7 + ", status=" + str8 + ", dictionaryKey=" + str9 + ")";
    }

    public StoApiModel(Long l, String str, Double d, String str2, Details details2, String str3, String str4, String str5, String str6, Long l2, String str7, String str8, String str9) {
        this.paymentId = l;
        this.name = str;
        this.amount = d;
        this.ccy = str2;
        this.details = details2;
        this.productCode = str3;
        this.serviceCode = str4;
        this.periodType = str5;
        this.periodTypeDictionaryKey = str6;
        this.nextSentDate = l2;
        this.debitType = str7;
        this.status = str8;
        this.dictionaryKey = str9;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoApiModel(java.lang.Long r15, java.lang.String r16, java.lang.Double r17, java.lang.String r18, p341ge.bog.mobilebank.ddsto.data.sto.Details r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.Long r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002d
            ge.bog.mobilebank.ddsto.data.sto.Details r6 = new ge.bog.mobilebank.ddsto.data.sto.Details
            r7 = 1
            r6.<init>(r2, r7, r2)
            goto L_0x002f
        L_0x002d:
            r6 = r19
        L_0x002f:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0035
            r7 = r2
            goto L_0x0037
        L_0x0035:
            r7 = r20
        L_0x0037:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003d
            r8 = r2
            goto L_0x003f
        L_0x003d:
            r8 = r21
        L_0x003f:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0045
            r9 = r2
            goto L_0x0047
        L_0x0045:
            r9 = r22
        L_0x0047:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004d
            r10 = r2
            goto L_0x004f
        L_0x004d:
            r10 = r23
        L_0x004f:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0055
            r11 = r2
            goto L_0x0057
        L_0x0055:
            r11 = r24
        L_0x0057:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005d
            r12 = r2
            goto L_0x005f
        L_0x005d:
            r12 = r25
        L_0x005f:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0065
            r13 = r2
            goto L_0x0067
        L_0x0065:
            r13 = r26
        L_0x0067:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r2 = r27
        L_0x006e:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.ddsto.data.sto.StoApiModel.<init>(java.lang.Long, java.lang.String, java.lang.Double, java.lang.String, ge.bog.mobilebank.ddsto.data.sto.Details, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
