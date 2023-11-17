package p341ge.bog.mobilebank.junior.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.junior.data.model.VerifyChildFinancialPhoneParams */
public final class VerifyChildFinancialPhoneParams extends OtpParams {
    public static final C24656a Companion = new C24656a((DefaultConstructorMarker) null);
    private static final String IDENTITY_APPROVE_FINANCIAL_CONTACT_PARENT = "IDENTITY_APPROVE_FINANCIAL_CONTACT_PARENT";
    private final long childClientKey;
    private final String contact;
    private final String oneTimeCode;
    private final String operationId;
    private final String operationReference;
    private final String otpOperationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* renamed from: ge.bog.mobilebank.junior.data.model.VerifyChildFinancialPhoneParams$a */
    public static final class C24656a {
        private C24656a() {
        }

        public /* synthetic */ C24656a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ VerifyChildFinancialPhoneParams(java.lang.String r14, java.lang.String r15, long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r19
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r20
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r21
        L_0x001b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "IDENTITY_APPROVE_FINANCIAL_CONTACT_PARENT"
            r12 = r0
            goto L_0x0025
        L_0x0023:
            r12 = r22
        L_0x0025:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r18
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.junior.data.model.VerifyChildFinancialPhoneParams.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ VerifyChildFinancialPhoneParams copy$default(VerifyChildFinancialPhoneParams verifyChildFinancialPhoneParams, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        VerifyChildFinancialPhoneParams verifyChildFinancialPhoneParams2 = verifyChildFinancialPhoneParams;
        int i2 = i;
        return verifyChildFinancialPhoneParams.copy((i2 & 1) != 0 ? verifyChildFinancialPhoneParams2.contact : str, (i2 & 2) != 0 ? verifyChildFinancialPhoneParams2.oneTimeCode : str2, (i2 & 4) != 0 ? verifyChildFinancialPhoneParams2.childClientKey : j, (i2 & 8) != 0 ? verifyChildFinancialPhoneParams2.otpOperationReference : str3, (i2 & 16) != 0 ? verifyChildFinancialPhoneParams2.operationId : str4, (i2 & 32) != 0 ? verifyChildFinancialPhoneParams2.operationReference : str5, (i2 & 64) != 0 ? verifyChildFinancialPhoneParams2.scaAuthCode : str6, (i2 & 128) != 0 ? verifyChildFinancialPhoneParams2.serviceId : str7);
    }

    public final String component1() {
        return this.contact;
    }

    public final String component2() {
        return this.oneTimeCode;
    }

    public final long component3() {
        return this.childClientKey;
    }

    public final String component4() {
        return this.otpOperationReference;
    }

    public final String component5() {
        return this.operationId;
    }

    public final String component6() {
        return this.operationReference;
    }

    public final String component7() {
        return this.scaAuthCode;
    }

    public final String component8() {
        return this.serviceId;
    }

    public final VerifyChildFinancialPhoneParams copy(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "contact");
        C41536l.m120489i(str2, "oneTimeCode");
        String str8 = str3;
        C41536l.m120489i(str8, "otpOperationReference");
        String str9 = str7;
        C41536l.m120489i(str9, IRetrofitService.SERVICE_ID);
        return new VerifyChildFinancialPhoneParams(str, str2, j, str8, str4, str5, str6, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyChildFinancialPhoneParams)) {
            return false;
        }
        VerifyChildFinancialPhoneParams verifyChildFinancialPhoneParams = (VerifyChildFinancialPhoneParams) obj;
        return C41536l.m120484d(this.contact, verifyChildFinancialPhoneParams.contact) && C41536l.m120484d(this.oneTimeCode, verifyChildFinancialPhoneParams.oneTimeCode) && this.childClientKey == verifyChildFinancialPhoneParams.childClientKey && C41536l.m120484d(this.otpOperationReference, verifyChildFinancialPhoneParams.otpOperationReference) && C41536l.m120484d(this.operationId, verifyChildFinancialPhoneParams.operationId) && C41536l.m120484d(this.operationReference, verifyChildFinancialPhoneParams.operationReference) && C41536l.m120484d(this.scaAuthCode, verifyChildFinancialPhoneParams.scaAuthCode) && C41536l.m120484d(this.serviceId, verifyChildFinancialPhoneParams.serviceId);
    }

    public final long getChildClientKey() {
        return this.childClientKey;
    }

    public final String getContact() {
        return this.contact;
    }

    public final String getOneTimeCode() {
        return this.oneTimeCode;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getOtpOperationReference() {
        return this.otpOperationReference;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        int hashCode = ((((((this.contact.hashCode() * 31) + this.oneTimeCode.hashCode()) * 31) + C7397t.m28148a(this.childClientKey)) * 31) + this.otpOperationReference.hashCode()) * 31;
        String str = this.operationId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operationReference;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scaAuthCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.serviceId.hashCode();
    }

    public String toString() {
        String str = this.contact;
        String str2 = this.oneTimeCode;
        long j = this.childClientKey;
        String str3 = this.otpOperationReference;
        String str4 = this.operationId;
        String str5 = this.operationReference;
        String str6 = this.scaAuthCode;
        String str7 = this.serviceId;
        return "VerifyChildFinancialPhoneParams(contact=" + str + ", oneTimeCode=" + str2 + ", childClientKey=" + j + ", otpOperationReference=" + str3 + ", operationId=" + str4 + ", operationReference=" + str5 + ", scaAuthCode=" + str6 + ", serviceId=" + str7 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerifyChildFinancialPhoneParams(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7) {
        super(str7, str4, str5, str6);
        C41536l.m120489i(str, "contact");
        C41536l.m120489i(str2, "oneTimeCode");
        C41536l.m120489i(str3, "otpOperationReference");
        C41536l.m120489i(str7, IRetrofitService.SERVICE_ID);
        this.contact = str;
        this.oneTimeCode = str2;
        this.childClientKey = j;
        this.otpOperationReference = str3;
        this.operationId = str4;
        this.operationReference = str5;
        this.scaAuthCode = str6;
        this.serviceId = str7;
    }
}
