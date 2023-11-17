package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.UpdateCardSecurityParams */
public final class UpdateCardSecurityParams extends OtpParams {
    private final long cardId;
    private final String dgPassFlag;
    private final String operationId;
    private final String operationReference;
    private final String phone;
    private final String scaAuthCode;
    private final String secSmsLang;
    private final String serviceId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UpdateCardSecurityParams(long r14, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r10 = r2
            goto L_0x000b
        L_0x0009:
            r10 = r20
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r21
        L_0x0013:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            r12 = r2
            goto L_0x001b
        L_0x0019:
            r12 = r22
        L_0x001b:
            r3 = r13
            r4 = r14
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.UpdateCardSecurityParams.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getDgPassFlag() {
        return this.dgPassFlag;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPhone() {
        return this.phone;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public final String getSecSmsLang() {
        return this.secSmsLang;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateCardSecurityParams(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str4, str6, str7, (String) null, 8, (DefaultConstructorMarker) null);
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        C41536l.m120489i(str, "phone");
        C41536l.m120489i(str8, "secSmsLang");
        C41536l.m120489i(str9, "dgPassFlag");
        C41536l.m120489i(str10, IRetrofitService.SERVICE_ID);
        this.cardId = j;
        this.phone = str;
        this.secSmsLang = str8;
        this.dgPassFlag = str9;
        this.serviceId = str10;
        this.operationId = str5;
        this.operationReference = str6;
        this.scaAuthCode = str7;
    }
}
