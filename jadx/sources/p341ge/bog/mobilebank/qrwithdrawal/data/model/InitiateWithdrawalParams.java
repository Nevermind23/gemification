package p341ge.bog.mobilebank.qrwithdrawal.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.qrwithdrawal.data.model.InitiateWithdrawalParams */
public final class InitiateWithdrawalParams extends OtpParams {
    private final String atmData;
    private final String atmEncryptedData;
    private final String atmId;
    private final String atmWithdrawalAmount;
    private final String atmWithdrawalCcy;
    private final String cardId;
    private final String operationId;
    private final String operationReference;
    private final String requestId;
    private final String scaAuthCode;
    private final String serviceId;
    private final String terminalId;
    private final String tmxSessionId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ InitiateWithdrawalParams(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
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
            java.lang.String r1 = "VALIDATE_AND_INITIATE_QR_WITHDRAWAL"
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
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.qrwithdrawal.data.model.InitiateWithdrawalParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ InitiateWithdrawalParams copy$default(InitiateWithdrawalParams initiateWithdrawalParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, Object obj) {
        InitiateWithdrawalParams initiateWithdrawalParams2 = initiateWithdrawalParams;
        int i2 = i;
        return initiateWithdrawalParams.copy((i2 & 1) != 0 ? initiateWithdrawalParams2.atmId : str, (i2 & 2) != 0 ? initiateWithdrawalParams2.atmEncryptedData : str2, (i2 & 4) != 0 ? initiateWithdrawalParams2.atmWithdrawalAmount : str3, (i2 & 8) != 0 ? initiateWithdrawalParams2.atmWithdrawalCcy : str4, (i2 & 16) != 0 ? initiateWithdrawalParams2.atmData : str5, (i2 & 32) != 0 ? initiateWithdrawalParams2.cardId : str6, (i2 & 64) != 0 ? initiateWithdrawalParams2.requestId : str7, (i2 & 128) != 0 ? initiateWithdrawalParams2.tmxSessionId : str8, (i2 & C11398b.f33139r) != 0 ? initiateWithdrawalParams2.terminalId : str9, (i2 & C11398b.f33140s) != 0 ? initiateWithdrawalParams2.serviceId : str10, (i2 & C11398b.f33141t) != 0 ? initiateWithdrawalParams2.operationId : str11, (i2 & C11398b.f33142u) != 0 ? initiateWithdrawalParams2.operationReference : str12, (i2 & C11398b.f33143v) != 0 ? initiateWithdrawalParams2.scaAuthCode : str13);
    }

    public final String component1() {
        return this.atmId;
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
        return this.atmEncryptedData;
    }

    public final String component3() {
        return this.atmWithdrawalAmount;
    }

    public final String component4() {
        return this.atmWithdrawalCcy;
    }

    public final String component5() {
        return this.atmData;
    }

    public final String component6() {
        return this.cardId;
    }

    public final String component7() {
        return this.requestId;
    }

    public final String component8() {
        return this.tmxSessionId;
    }

    public final String component9() {
        return this.terminalId;
    }

    public final InitiateWithdrawalParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        String str14 = str;
        C41536l.m120489i(str14, "atmId");
        String str15 = str2;
        C41536l.m120489i(str15, "atmEncryptedData");
        String str16 = str3;
        C41536l.m120489i(str16, "atmWithdrawalAmount");
        String str17 = str4;
        C41536l.m120489i(str17, "atmWithdrawalCcy");
        String str18 = str6;
        C41536l.m120489i(str18, "cardId");
        String str19 = str9;
        C41536l.m120489i(str19, "terminalId");
        String str20 = str10;
        C41536l.m120489i(str20, IRetrofitService.SERVICE_ID);
        return new InitiateWithdrawalParams(str14, str15, str16, str17, str5, str18, str7, str8, str19, str20, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiateWithdrawalParams)) {
            return false;
        }
        InitiateWithdrawalParams initiateWithdrawalParams = (InitiateWithdrawalParams) obj;
        return C41536l.m120484d(this.atmId, initiateWithdrawalParams.atmId) && C41536l.m120484d(this.atmEncryptedData, initiateWithdrawalParams.atmEncryptedData) && C41536l.m120484d(this.atmWithdrawalAmount, initiateWithdrawalParams.atmWithdrawalAmount) && C41536l.m120484d(this.atmWithdrawalCcy, initiateWithdrawalParams.atmWithdrawalCcy) && C41536l.m120484d(this.atmData, initiateWithdrawalParams.atmData) && C41536l.m120484d(this.cardId, initiateWithdrawalParams.cardId) && C41536l.m120484d(this.requestId, initiateWithdrawalParams.requestId) && C41536l.m120484d(this.tmxSessionId, initiateWithdrawalParams.tmxSessionId) && C41536l.m120484d(this.terminalId, initiateWithdrawalParams.terminalId) && C41536l.m120484d(this.serviceId, initiateWithdrawalParams.serviceId) && C41536l.m120484d(this.operationId, initiateWithdrawalParams.operationId) && C41536l.m120484d(this.operationReference, initiateWithdrawalParams.operationReference) && C41536l.m120484d(this.scaAuthCode, initiateWithdrawalParams.scaAuthCode);
    }

    public final String getAtmData() {
        return this.atmData;
    }

    public final String getAtmEncryptedData() {
        return this.atmEncryptedData;
    }

    public final String getAtmId() {
        return this.atmId;
    }

    public final String getAtmWithdrawalAmount() {
        return this.atmWithdrawalAmount;
    }

    public final String getAtmWithdrawalCcy() {
        return this.atmWithdrawalCcy;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getTerminalId() {
        return this.terminalId;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    public int hashCode() {
        int hashCode = ((((((this.atmId.hashCode() * 31) + this.atmEncryptedData.hashCode()) * 31) + this.atmWithdrawalAmount.hashCode()) * 31) + this.atmWithdrawalCcy.hashCode()) * 31;
        String str = this.atmData;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cardId.hashCode()) * 31;
        String str2 = this.requestId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tmxSessionId;
        int hashCode4 = (((((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.terminalId.hashCode()) * 31) + this.serviceId.hashCode()) * 31;
        String str4 = this.operationId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.operationReference;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.scaAuthCode;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        String str = this.atmId;
        String str2 = this.atmEncryptedData;
        String str3 = this.atmWithdrawalAmount;
        String str4 = this.atmWithdrawalCcy;
        String str5 = this.atmData;
        String str6 = this.cardId;
        String str7 = this.requestId;
        String str8 = this.tmxSessionId;
        String str9 = this.terminalId;
        String str10 = this.serviceId;
        String str11 = this.operationId;
        String str12 = this.operationReference;
        String str13 = this.scaAuthCode;
        return "InitiateWithdrawalParams(atmId=" + str + ", atmEncryptedData=" + str2 + ", atmWithdrawalAmount=" + str3 + ", atmWithdrawalCcy=" + str4 + ", atmData=" + str5 + ", cardId=" + str6 + ", requestId=" + str7 + ", tmxSessionId=" + str8 + ", terminalId=" + str9 + ", serviceId=" + str10 + ", operationId=" + str11 + ", operationReference=" + str12 + ", scaAuthCode=" + str13 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitiateWithdrawalParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        super(str10, str12, str13, (String) null, 8, (DefaultConstructorMarker) null);
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str6;
        String str19 = str9;
        String str20 = str10;
        C41536l.m120489i(str14, "atmId");
        C41536l.m120489i(str15, "atmEncryptedData");
        C41536l.m120489i(str16, "atmWithdrawalAmount");
        C41536l.m120489i(str17, "atmWithdrawalCcy");
        C41536l.m120489i(str18, "cardId");
        C41536l.m120489i(str19, "terminalId");
        C41536l.m120489i(str20, IRetrofitService.SERVICE_ID);
        this.atmId = str14;
        this.atmEncryptedData = str15;
        this.atmWithdrawalAmount = str16;
        this.atmWithdrawalCcy = str17;
        this.atmData = str5;
        this.cardId = str18;
        this.requestId = str7;
        this.tmxSessionId = str8;
        this.terminalId = str19;
        this.serviceId = str20;
        this.operationId = str11;
        this.operationReference = str12;
        this.scaAuthCode = str13;
    }
}
