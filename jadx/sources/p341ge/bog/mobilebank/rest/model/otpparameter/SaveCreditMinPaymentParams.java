package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.SaveCreditMinPaymentParams */
public final class SaveCreditMinPaymentParams extends OtpParams {
    private final String acctKey;
    private final String acctKey2;
    private final String acctKey3;
    private final String creditCardAcctKey;
    private final String endDate;
    private final String name;
    private final String operationId;
    private final String operationReference;
    private final String phoneNumber;
    private final String scaAuthCode;
    private final String serviceId;
    private final String termPaymentId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SaveCreditMinPaymentParams(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r13 = r2
            goto L_0x000b
        L_0x0009:
            r13 = r26
        L_0x000b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0011
            r14 = r2
            goto L_0x0013
        L_0x0011:
            r14 = r27
        L_0x0013:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0019
            r15 = r2
            goto L_0x001b
        L_0x0019:
            r15 = r28
        L_0x001b:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.SaveCreditMinPaymentParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctKey2() {
        return this.acctKey2;
    }

    public final String getAcctKey3() {
        return this.acctKey3;
    }

    public final String getCreditCardAcctKey() {
        return this.creditCardAcctKey;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getName() {
        return this.name;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getTermPaymentId() {
        return this.termPaymentId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveCreditMinPaymentParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        super(str9, str11, str12, (String) null, 8, (DefaultConstructorMarker) null);
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        C41536l.m120489i(str13, "creditCardAcctKey");
        C41536l.m120489i(str14, "termPaymentId");
        C41536l.m120489i(str15, "acctKey");
        C41536l.m120489i(str16, "acctKey2");
        C41536l.m120489i(str17, "acctKey3");
        C41536l.m120489i(str18, "phoneNumber");
        C41536l.m120489i(str19, "endDate");
        C41536l.m120489i(str20, "name");
        C41536l.m120489i(str9, IRetrofitService.SERVICE_ID);
        this.creditCardAcctKey = str13;
        this.termPaymentId = str14;
        this.acctKey = str15;
        this.acctKey2 = str16;
        this.acctKey3 = str17;
        this.phoneNumber = str18;
        this.endDate = str19;
        this.name = str20;
        this.serviceId = str9;
        this.operationId = str10;
        this.operationReference = str11;
        this.scaAuthCode = str12;
    }
}
