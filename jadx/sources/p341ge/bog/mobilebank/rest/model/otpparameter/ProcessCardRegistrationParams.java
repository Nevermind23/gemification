package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.ProcessCardRegistrationParams */
public final class ProcessCardRegistrationParams extends OtpParams {
    private final String confirmCode;
    private final long decNo;
    private final String decisionScheme;
    private final String department;
    private final String limitId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProcessCardRegistrationParams(java.lang.String r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r21
        L_0x000b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r22
        L_0x0013:
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.ProcessCardRegistrationParams.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getConfirmCode() {
        return this.confirmCode;
    }

    public final long getDecNo() {
        return this.decNo;
    }

    public final String getDecisionScheme() {
        return this.decisionScheme;
    }

    public final String getDepartment() {
        return this.department;
    }

    public final String getLimitId() {
        return this.limitId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProcessCardRegistrationParams(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str5, str6, str7, (String) null, 8, (DefaultConstructorMarker) null);
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        C41536l.m120489i(str, "limitId");
        C41536l.m120489i(str8, "decisionScheme");
        C41536l.m120489i(str9, "confirmCode");
        C41536l.m120489i(str10, "department");
        C41536l.m120489i(str11, IRetrofitService.SERVICE_ID);
        this.limitId = str;
        this.decNo = j;
        this.decisionScheme = str8;
        this.confirmCode = str9;
        this.department = str10;
        this.serviceId = str11;
        this.operationReference = str6;
        this.scaAuthCode = str7;
    }
}
