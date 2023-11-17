package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.SaveStosBetweenGeorgiaParams */
public final class SaveStosBetweenGeorgiaParams extends OtpParams {
    private final String amount;
    private final String benefAcctNo;
    private final String benefName;
    private final String ccy;
    private final String dispatchType;
    private final String documentName;
    private final String endDate;
    private final String nomination;
    private final String operationId;
    private final String operationReference;
    private final String payerInn;
    private final String payerName;
    private final String periodType;
    private final String scaAuthCode;
    private final String serviceId;
    private final String srcAcctCcy;
    private final String srcAcctKey;
    private final String startDate;
    private final String termDocumentId;
    private final String tmxSessionId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveStosBetweenGeorgiaParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBenefAcctNo() {
        return this.benefAcctNo;
    }

    public final String getBenefName() {
        return this.benefName;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDispatchType() {
        return this.dispatchType;
    }

    public final String getDocumentName() {
        return this.documentName;
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

    public final String getPayerInn() {
        return this.payerInn;
    }

    public final String getPayerName() {
        return this.payerName;
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

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SaveStosBetweenGeorgiaParams(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r13 = r24
            r14 = r25
            r15 = r26
            r6 = r27
            r5 = r28
            r4 = r29
            r3 = r30
            r2 = r31
            r1 = r32
            r0 = r33
            r7 = r35
            java.lang.String r7 = "termDocumentId"
            kotlin.jvm.internal.C41536l.m120489i(r8, r7)
            java.lang.String r7 = "srcAcctKey"
            kotlin.jvm.internal.C41536l.m120489i(r9, r7)
            java.lang.String r7 = "srcAcctCcy"
            kotlin.jvm.internal.C41536l.m120489i(r10, r7)
            java.lang.String r7 = "benefAcctNo"
            kotlin.jvm.internal.C41536l.m120489i(r11, r7)
            java.lang.String r7 = "benefName"
            kotlin.jvm.internal.C41536l.m120489i(r12, r7)
            java.lang.String r7 = "payerName"
            kotlin.jvm.internal.C41536l.m120489i(r13, r7)
            java.lang.String r7 = "payerInn"
            kotlin.jvm.internal.C41536l.m120489i(r14, r7)
            java.lang.String r7 = "amount"
            kotlin.jvm.internal.C41536l.m120489i(r15, r7)
            java.lang.String r7 = "ccy"
            kotlin.jvm.internal.C41536l.m120489i(r6, r7)
            java.lang.String r7 = "nomination"
            kotlin.jvm.internal.C41536l.m120489i(r5, r7)
            java.lang.String r7 = "documentName"
            kotlin.jvm.internal.C41536l.m120489i(r4, r7)
            java.lang.String r7 = "periodType"
            kotlin.jvm.internal.C41536l.m120489i(r3, r7)
            java.lang.String r7 = "startDate"
            kotlin.jvm.internal.C41536l.m120489i(r2, r7)
            java.lang.String r7 = "endDate"
            kotlin.jvm.internal.C41536l.m120489i(r1, r7)
            java.lang.String r7 = "dispatchType"
            kotlin.jvm.internal.C41536l.m120489i(r0, r7)
            java.lang.String r7 = "serviceId"
            r6 = r35
            kotlin.jvm.internal.C41536l.m120489i(r6, r7)
            r7 = 0
            r16 = 8
            r17 = 0
            r0 = r18
            r1 = r35
            r2 = r37
            r3 = r38
            r4 = r7
            r7 = r5
            r5 = r16
            r7 = r27
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.termDocumentId = r8
            r0.srcAcctKey = r9
            r0.srcAcctCcy = r10
            r0.benefAcctNo = r11
            r0.benefName = r12
            r0.payerName = r13
            r0.payerInn = r14
            r0.amount = r15
            r0.ccy = r7
            r2 = r28
            r0.nomination = r2
            r2 = r29
            r0.documentName = r2
            r2 = r30
            r0.periodType = r2
            r2 = r31
            r0.startDate = r2
            r2 = r32
            r0.endDate = r2
            r2 = r33
            r0.dispatchType = r2
            r2 = r34
            r0.tmxSessionId = r2
            r0.serviceId = r1
            r1 = r36
            r0.operationId = r1
            r1 = r37
            r0.operationReference = r1
            r1 = r38
            r0.scaAuthCode = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.SaveStosBetweenGeorgiaParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
