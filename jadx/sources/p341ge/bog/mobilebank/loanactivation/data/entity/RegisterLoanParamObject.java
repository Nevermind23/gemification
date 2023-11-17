package p341ge.bog.mobilebank.loanactivation.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.loanactivation.data.entity.RegisterLoanParamObject */
public final class RegisterLoanParamObject extends OtpParams {
    private final String UTMCampaign;
    private final String UTMMedium;
    private final String UTMSource;
    private final Long decNo;
    private final String decisionScheme;
    private final String limitId;
    private final String operationId;
    private final String operationReference;
    private final String preContractText;
    private final String providerId;
    private final String scaAuthCode;
    private final String serviceId;
    private final String terminal;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterLoanParamObject(java.lang.String r17, java.lang.String r18, java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r11 = r1
            goto L_0x000c
        L_0x000a:
            r11 = r25
        L_0x000c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = "OFFERS_PROCESS_LOAN_REGISTRATION"
            r12 = r1
            goto L_0x0016
        L_0x0014:
            r12 = r26
        L_0x0016:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x001d
            r13 = r2
            goto L_0x001f
        L_0x001d:
            r13 = r27
        L_0x001f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0025
            r14 = r2
            goto L_0x0027
        L_0x0025:
            r14 = r28
        L_0x0027:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x002d
            r15 = r2
            goto L_0x002f
        L_0x002d:
            r15 = r29
        L_0x002f:
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loanactivation.data.entity.RegisterLoanParamObject.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ RegisterLoanParamObject copy$default(RegisterLoanParamObject registerLoanParamObject, String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        RegisterLoanParamObject registerLoanParamObject2 = registerLoanParamObject;
        int i2 = i;
        return registerLoanParamObject.copy((i2 & 1) != 0 ? registerLoanParamObject2.limitId : str, (i2 & 2) != 0 ? registerLoanParamObject2.preContractText : str2, (i2 & 4) != 0 ? registerLoanParamObject2.decNo : l, (i2 & 8) != 0 ? registerLoanParamObject2.providerId : str3, (i2 & 16) != 0 ? registerLoanParamObject2.decisionScheme : str4, (i2 & 32) != 0 ? registerLoanParamObject2.UTMMedium : str5, (i2 & 64) != 0 ? registerLoanParamObject2.UTMSource : str6, (i2 & 128) != 0 ? registerLoanParamObject2.UTMCampaign : str7, (i2 & C11398b.f33139r) != 0 ? registerLoanParamObject2.terminal : str8, (i2 & C11398b.f33140s) != 0 ? registerLoanParamObject2.serviceId : str9, (i2 & C11398b.f33141t) != 0 ? registerLoanParamObject2.operationId : str10, (i2 & C11398b.f33142u) != 0 ? registerLoanParamObject2.operationReference : str11, (i2 & C11398b.f33143v) != 0 ? registerLoanParamObject2.scaAuthCode : str12);
    }

    public final String component1() {
        return this.limitId;
    }

    public final String component10() {
        return this.serviceId;
    }

    public final String component11() {
        return this.operationId;
    }

    public final String component12() {
        return this.operationReference;
    }

    public final String component13() {
        return this.scaAuthCode;
    }

    public final String component2() {
        return this.preContractText;
    }

    public final Long component3() {
        return this.decNo;
    }

    public final String component4() {
        return this.providerId;
    }

    public final String component5() {
        return this.decisionScheme;
    }

    public final String component6() {
        return this.UTMMedium;
    }

    public final String component7() {
        return this.UTMSource;
    }

    public final String component8() {
        return this.UTMCampaign;
    }

    public final String component9() {
        return this.terminal;
    }

    public final RegisterLoanParamObject copy(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        String str13 = str8;
        C41536l.m120489i(str13, IRetrofitService.TERMINAL);
        String str14 = str9;
        C41536l.m120489i(str14, IRetrofitService.SERVICE_ID);
        return new RegisterLoanParamObject(str, str2, l, str3, str4, str5, str6, str7, str13, str14, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterLoanParamObject)) {
            return false;
        }
        RegisterLoanParamObject registerLoanParamObject = (RegisterLoanParamObject) obj;
        return C41536l.m120484d(this.limitId, registerLoanParamObject.limitId) && C41536l.m120484d(this.preContractText, registerLoanParamObject.preContractText) && C41536l.m120484d(this.decNo, registerLoanParamObject.decNo) && C41536l.m120484d(this.providerId, registerLoanParamObject.providerId) && C41536l.m120484d(this.decisionScheme, registerLoanParamObject.decisionScheme) && C41536l.m120484d(this.UTMMedium, registerLoanParamObject.UTMMedium) && C41536l.m120484d(this.UTMSource, registerLoanParamObject.UTMSource) && C41536l.m120484d(this.UTMCampaign, registerLoanParamObject.UTMCampaign) && C41536l.m120484d(this.terminal, registerLoanParamObject.terminal) && C41536l.m120484d(this.serviceId, registerLoanParamObject.serviceId) && C41536l.m120484d(this.operationId, registerLoanParamObject.operationId) && C41536l.m120484d(this.operationReference, registerLoanParamObject.operationReference) && C41536l.m120484d(this.scaAuthCode, registerLoanParamObject.scaAuthCode);
    }

    public final Long getDecNo() {
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

    public final String getUTMCampaign() {
        return this.UTMCampaign;
    }

    public final String getUTMMedium() {
        return this.UTMMedium;
    }

    public final String getUTMSource() {
        return this.UTMSource;
    }

    public int hashCode() {
        String str = this.limitId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.preContractText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.decNo;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.providerId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.decisionScheme;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.UTMMedium;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.UTMSource;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.UTMCampaign;
        int hashCode8 = (((((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.terminal.hashCode()) * 31) + this.serviceId.hashCode()) * 31;
        String str8 = this.operationId;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.operationReference;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.scaAuthCode;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        String str = this.limitId;
        String str2 = this.preContractText;
        Long l = this.decNo;
        String str3 = this.providerId;
        String str4 = this.decisionScheme;
        String str5 = this.UTMMedium;
        String str6 = this.UTMSource;
        String str7 = this.UTMCampaign;
        String str8 = this.terminal;
        String str9 = this.serviceId;
        String str10 = this.operationId;
        String str11 = this.operationReference;
        String str12 = this.scaAuthCode;
        return "RegisterLoanParamObject(limitId=" + str + ", preContractText=" + str2 + ", decNo=" + l + ", providerId=" + str3 + ", decisionScheme=" + str4 + ", UTMMedium=" + str5 + ", UTMSource=" + str6 + ", UTMCampaign=" + str7 + ", terminal=" + str8 + ", serviceId=" + str9 + ", operationId=" + str10 + ", operationReference=" + str11 + ", scaAuthCode=" + str12 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterLoanParamObject(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        super(str9, str10, str11, str12);
        C41536l.m120489i(str8, IRetrofitService.TERMINAL);
        C41536l.m120489i(str9, IRetrofitService.SERVICE_ID);
        this.limitId = str;
        this.preContractText = str2;
        this.decNo = l;
        this.providerId = str3;
        this.decisionScheme = str4;
        this.UTMMedium = str5;
        this.UTMSource = str6;
        this.UTMCampaign = str7;
        this.terminal = str8;
        this.serviceId = str9;
        this.operationId = str10;
        this.operationReference = str11;
        this.scaAuthCode = str12;
    }
}
