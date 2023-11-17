package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.SaveDomesticTransferSTOParams */
public final class SaveDomesticTransferSTOParams extends OtpParams {
    private final String amount;
    private final String ccy;
    private final String documentName;
    private final String dstAcctKey;
    private final String endDate;
    private final String nomination;
    private final String operationId;
    private final String operationReference;
    private final String periodType;
    private final String scaAuthCode;
    private final String serviceId;
    private final String srcAcctCcy;
    private final String srcAcctKey;
    private final String startDate;
    private final String termDocumentId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SaveDomesticTransferSTOParams(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r16 = r2
            goto L_0x000c
        L_0x000a:
            r16 = r32
        L_0x000c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0013
            r17 = r2
            goto L_0x0015
        L_0x0013:
            r17 = r33
        L_0x0015:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x001c
            r18 = r2
            goto L_0x001e
        L_0x001c:
            r18 = r34
        L_0x001e:
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.SaveDomesticTransferSTOParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final String getDstAcctKey() {
        return this.dstAcctKey;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getNomination() {
        return this.nomination;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPeriodType() {
        return this.periodType;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getSrcAcctCcy() {
        return this.srcAcctCcy;
    }

    public final String getSrcAcctKey() {
        return this.srcAcctKey;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getTermDocumentId() {
        return this.termDocumentId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveDomesticTransferSTOParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        super(str12, str14, str15, (String) null, 8, (DefaultConstructorMarker) null);
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        C41536l.m120489i(str16, "termDocumentId");
        C41536l.m120489i(str17, "srcAcctKey");
        C41536l.m120489i(str18, "srcAcctCcy");
        C41536l.m120489i(str19, "dstAcctKey");
        C41536l.m120489i(str20, "amount");
        C41536l.m120489i(str21, "ccy");
        C41536l.m120489i(str22, "nomination");
        C41536l.m120489i(str23, "documentName");
        C41536l.m120489i(str9, "periodType");
        C41536l.m120489i(str10, "startDate");
        C41536l.m120489i(str11, "endDate");
        C41536l.m120489i(str12, IRetrofitService.SERVICE_ID);
        this.termDocumentId = str16;
        this.srcAcctKey = str17;
        this.srcAcctCcy = str18;
        this.dstAcctKey = str19;
        this.amount = str20;
        this.ccy = str21;
        this.nomination = str22;
        this.documentName = str23;
        this.periodType = str9;
        this.startDate = str10;
        this.endDate = str11;
        this.serviceId = str12;
        this.operationId = str13;
        this.operationReference = str14;
        this.scaAuthCode = str15;
    }
}
