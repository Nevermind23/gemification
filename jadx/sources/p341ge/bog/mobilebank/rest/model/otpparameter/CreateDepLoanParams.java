package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.CreateDepLoanParams */
public final class CreateDepLoanParams extends OtpParams {
    private final String cardPan;
    private final String ccy;
    private final Long contractId;
    private final String loanAmount;
    private final String operationId;
    private final String operationReference;
    private final String preContractText;
    private final String scaAuthCode;
    private final String serviceId;
    private final String tmxSessionId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreateDepLoanParams(java.lang.Long r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r22
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r23
        L_0x0013:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0019
            r13 = r2
            goto L_0x001b
        L_0x0019:
            r13 = r24
        L_0x001b:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.CreateDepLoanParams.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCardPan() {
        return this.cardPan;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Long getContractId() {
        return this.contractId;
    }

    public final String getLoanAmount() {
        return this.loanAmount;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPreContractText() {
        return this.preContractText;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateDepLoanParams(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(str6, str8, str9, (String) null, 8, (DefaultConstructorMarker) null);
        String str10 = str6;
        C41536l.m120489i(str2, "loanAmount");
        C41536l.m120489i(str3, "cardPan");
        C41536l.m120489i(str10, IRetrofitService.SERVICE_ID);
        this.contractId = l;
        this.ccy = str;
        this.loanAmount = str2;
        this.cardPan = str3;
        this.preContractText = str4;
        this.tmxSessionId = str5;
        this.serviceId = str10;
        this.operationId = str7;
        this.operationReference = str8;
        this.scaAuthCode = str9;
    }
}
