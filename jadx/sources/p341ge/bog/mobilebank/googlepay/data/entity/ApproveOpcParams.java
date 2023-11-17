package p341ge.bog.mobilebank.googlepay.data.entity;

import androidx.annotation.Keep;
import g91.C32300e0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;

@Keep
/* renamed from: ge.bog.mobilebank.googlepay.data.entity.ApproveOpcParams */
public final class ApproveOpcParams extends OtpParams {
    private final String cardId;
    private final String customerId;
    private final String hardwareId;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;
    private final String tmxSessionId;
    private final String walletId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApproveOpcParams(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r12 = this;
            r0 = r21
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r9 = r2
            goto L_0x000b
        L_0x0009:
            r9 = r18
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r19
        L_0x0013:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r20
        L_0x001b:
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.googlepay.data.entity.ApproveOpcParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ ApproveOpcParams copy$default(ApproveOpcParams approveOpcParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        ApproveOpcParams approveOpcParams2 = approveOpcParams;
        int i2 = i;
        return approveOpcParams.copy((i2 & 1) != 0 ? approveOpcParams2.hardwareId : str, (i2 & 2) != 0 ? approveOpcParams2.walletId : str2, (i2 & 4) != 0 ? approveOpcParams2.cardId : str3, (i2 & 8) != 0 ? approveOpcParams2.customerId : str4, (i2 & 16) != 0 ? approveOpcParams2.tmxSessionId : str5, (i2 & 32) != 0 ? approveOpcParams2.operationId : str6, (i2 & 64) != 0 ? approveOpcParams2.operationReference : str7, (i2 & 128) != 0 ? approveOpcParams2.scaAuthCode : str8);
    }

    public final String component1() {
        return this.hardwareId;
    }

    public final String component2() {
        return this.walletId;
    }

    public final String component3() {
        return this.cardId;
    }

    public final String component4() {
        return this.customerId;
    }

    public final String component5() {
        return this.tmxSessionId;
    }

    public final String component6() {
        return this.operationId;
    }

    public final String component7() {
        return this.operationReference;
    }

    public final String component8() {
        return this.scaAuthCode;
    }

    public final ApproveOpcParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C41536l.m120489i(str, "hardwareId");
        C41536l.m120489i(str2, "walletId");
        C41536l.m120489i(str3, "cardId");
        C41536l.m120489i(str4, "customerId");
        return new ApproveOpcParams(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproveOpcParams)) {
            return false;
        }
        ApproveOpcParams approveOpcParams = (ApproveOpcParams) obj;
        return C41536l.m120484d(this.hardwareId, approveOpcParams.hardwareId) && C41536l.m120484d(this.walletId, approveOpcParams.walletId) && C41536l.m120484d(this.cardId, approveOpcParams.cardId) && C41536l.m120484d(this.customerId, approveOpcParams.customerId) && C41536l.m120484d(this.tmxSessionId, approveOpcParams.tmxSessionId) && C41536l.m120484d(this.operationId, approveOpcParams.operationId) && C41536l.m120484d(this.operationReference, approveOpcParams.operationReference) && C41536l.m120484d(this.scaAuthCode, approveOpcParams.scaAuthCode);
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getHardwareId() {
        return this.hardwareId;
    }

    public String getOperationId() {
        return this.operationId;
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

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public final boolean hasScaParams() {
        return C32300e0.f79712a.mo72816a(getOperationId(), getOperationReference(), getScaAuthCode());
    }

    public int hashCode() {
        int hashCode = ((((((this.hardwareId.hashCode() * 31) + this.walletId.hashCode()) * 31) + this.cardId.hashCode()) * 31) + this.customerId.hashCode()) * 31;
        String str = this.tmxSessionId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operationId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operationReference;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scaAuthCode;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.hardwareId;
        String str2 = this.walletId;
        String str3 = this.cardId;
        String str4 = this.customerId;
        String str5 = this.tmxSessionId;
        String str6 = this.operationId;
        String str7 = this.operationReference;
        String str8 = this.scaAuthCode;
        return "ApproveOpcParams(hardwareId=" + str + ", walletId=" + str2 + ", cardId=" + str3 + ", customerId=" + str4 + ", tmxSessionId=" + str5 + ", operationId=" + str6 + ", operationReference=" + str7 + ", scaAuthCode=" + str8 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApproveOpcParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        super("CARD_GET_PUSH_TOKENIZE_DATA_V2", str6, str7, str8);
        C41536l.m120489i(str, "hardwareId");
        C41536l.m120489i(str2, "walletId");
        C41536l.m120489i(str3, "cardId");
        C41536l.m120489i(str4, "customerId");
        this.hardwareId = str;
        this.walletId = str2;
        this.cardId = str3;
        this.customerId = str4;
        this.tmxSessionId = str5;
        this.operationId = str6;
        this.operationReference = str7;
        this.scaAuthCode = str8;
        this.serviceId = "CARD_GET_PUSH_TOKENIZE_DATA_V2";
    }
}
