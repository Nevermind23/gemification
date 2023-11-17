package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.ProcessLoanRegistrationParams */
public final class ProcessLoanRegistrationParams extends OtpParams {
    private final String cardPan;
    private final String confirmCode;
    private final String decNo;
    private final String decisionScheme;
    private final String limitId;
    private final String operationId;
    private final String operationReference;
    private final String preContractText;
    private final String providerId;
    private final String scaAuthCode;
    private final String serviceId;
    private final String terminal;
    private final String tmxSessionId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProcessLoanRegistrationParams(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r14 = r2
            goto L_0x000b
        L_0x0009:
            r14 = r28
        L_0x000b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0011
            r15 = r2
            goto L_0x0013
        L_0x0011:
            r15 = r29
        L_0x0013:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x001a
            r16 = r2
            goto L_0x001c
        L_0x001a:
            r16 = r30
        L_0x001c:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.ProcessLoanRegistrationParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCardPan() {
        return this.cardPan;
    }

    public final String getConfirmCode() {
        return this.confirmCode;
    }

    public final String getDecNo() {
        return this.decNo;
    }

    public final String getDecisionScheme() {
        return this.decisionScheme;
    }

    public final String getLimitId() {
        return this.limitId;
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

    public final String getProviderId() {
        return this.providerId;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getTerminal() {
        return this.terminal;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessLoanRegistrationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        super(str10, str12, str13, (String) null, 8, (DefaultConstructorMarker) null);
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str6;
        String str18 = str10;
        C41536l.m120489i(str, "limitId");
        C41536l.m120489i(str14, "decNo");
        C41536l.m120489i(str15, "decisionScheme");
        C41536l.m120489i(str16, "confirmCode");
        C41536l.m120489i(str17, IRetrofitService.TERMINAL);
        C41536l.m120489i(str18, IRetrofitService.SERVICE_ID);
        this.limitId = str;
        this.decNo = str14;
        this.decisionScheme = str15;
        this.confirmCode = str16;
        this.cardPan = str5;
        this.terminal = str17;
        this.providerId = str7;
        this.tmxSessionId = str8;
        this.preContractText = str9;
        this.serviceId = str18;
        this.operationId = str11;
        this.operationReference = str12;
        this.scaAuthCode = str13;
    }
}
