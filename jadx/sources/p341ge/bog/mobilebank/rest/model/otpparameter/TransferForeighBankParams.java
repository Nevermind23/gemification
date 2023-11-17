package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.TransferForeighBankParams */
public final class TransferForeighBankParams extends OtpParams {
    private final String additionalInfo;
    private final String amount;
    private final String attachmentIds;
    private final String benefAcctNo;
    private final String benefAddress;
    private final String benefCity;
    private final String benefCountry;
    private final String benefName;
    private final String ccy;
    private final String dispatchType;
    private final String intBankCode;
    private final String intBankName;
    private final Long moneyRequestId;
    private final String nomination;
    private final String operationId;
    private final String operationReference;
    private final String recBankCode;
    private final String recBankName;
    private final String regReporting;
    private final String scaAuthCode;
    private final String serviceId;
    private final String srcAcctKey;
    private final String tmxSessionId;
    private final Integer trustBeneficiar;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferForeighBankParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Long l, Integer num, String str18, String str19, String str20, String str21, String str22, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, l, num, str18, str19, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22);
    }

    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAttachmentIds() {
        return this.attachmentIds;
    }

    public final String getBenefAcctNo() {
        return this.benefAcctNo;
    }

    public final String getBenefAddress() {
        return this.benefAddress;
    }

    public final String getBenefCity() {
        return this.benefCity;
    }

    public final String getBenefCountry() {
        return this.benefCountry;
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

    public final String getIntBankCode() {
        return this.intBankCode;
    }

    public final String getIntBankName() {
        return this.intBankName;
    }

    public final Long getMoneyRequestId() {
        return this.moneyRequestId;
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

    public final String getRecBankCode() {
        return this.recBankCode;
    }

    public final String getRecBankName() {
        return this.recBankName;
    }

    public final String getRegReporting() {
        return this.regReporting;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getSrcAcctKey() {
        return this.srcAcctKey;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    public final Integer getTrustBeneficiar() {
        return this.trustBeneficiar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TransferForeighBankParams(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.Long r37, java.lang.Integer r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r15 = r30
            r6 = r31
            r5 = r32
            r4 = r33
            r3 = r34
            r2 = r35
            r1 = r40
            java.lang.String r0 = "srcAcctKey"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            java.lang.String r0 = "benefAcctNo"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            java.lang.String r0 = "benefName"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            java.lang.String r0 = "benefCity"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            java.lang.String r0 = "benefAddress"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            java.lang.String r0 = "recBankName"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            java.lang.String r0 = "recBankCode"
            kotlin.jvm.internal.C41536l.m120489i(r14, r0)
            java.lang.String r0 = "amount"
            kotlin.jvm.internal.C41536l.m120489i(r15, r0)
            java.lang.String r0 = "ccy"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            java.lang.String r0 = "dispatchType"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "nomination"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "additionalInfo"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "attachmentIds"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.lang.String r0 = "serviceId"
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            r16 = 0
            r17 = 8
            r18 = 0
            r0 = r19
            r2 = r42
            r3 = r43
            r4 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.srcAcctKey = r8
            r7.benefAcctNo = r9
            r7.benefName = r10
            r0 = r23
            r7.benefCountry = r0
            r7.benefCity = r11
            r7.benefAddress = r12
            r7.recBankName = r13
            r7.recBankCode = r14
            r0 = r28
            r7.intBankCode = r0
            r0 = r29
            r7.intBankName = r0
            r7.amount = r15
            r0 = r31
            r7.ccy = r0
            r0 = r32
            r7.dispatchType = r0
            r0 = r33
            r7.nomination = r0
            r0 = r34
            r7.additionalInfo = r0
            r0 = r35
            r7.attachmentIds = r0
            r0 = r36
            r7.regReporting = r0
            r0 = r37
            r7.moneyRequestId = r0
            r0 = r38
            r7.trustBeneficiar = r0
            r0 = r39
            r7.tmxSessionId = r0
            r0 = r40
            r7.serviceId = r0
            r0 = r41
            r7.operationId = r0
            r0 = r42
            r7.operationReference = r0
            r0 = r43
            r7.scaAuthCode = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.TransferForeighBankParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
