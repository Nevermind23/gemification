package p341ge.bog.mobilebank.deposits.data.entity.depositbreak;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositbreak.ValidateDepositBreakParams */
public final class ValidateDepositBreakParams extends OtpParams {
    private final long agreeKey;
    private final long dstAcctKey;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ValidateDepositBreakParams(long j, long j2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? "DEPOSITS_VALIDATE_AND_PROCESS_DEPOSIT_BREAK" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    public static /* synthetic */ ValidateDepositBreakParams copy$default(ValidateDepositBreakParams validateDepositBreakParams, long j, long j2, String str, String str2, String str3, String str4, int i, Object obj) {
        ValidateDepositBreakParams validateDepositBreakParams2 = validateDepositBreakParams;
        return validateDepositBreakParams.copy((i & 1) != 0 ? validateDepositBreakParams2.agreeKey : j, (i & 2) != 0 ? validateDepositBreakParams2.dstAcctKey : j2, (i & 4) != 0 ? validateDepositBreakParams2.serviceId : str, (i & 8) != 0 ? validateDepositBreakParams2.operationId : str2, (i & 16) != 0 ? validateDepositBreakParams2.operationReference : str3, (i & 32) != 0 ? validateDepositBreakParams2.scaAuthCode : str4);
    }

    public final long component1() {
        return this.agreeKey;
    }

    public final long component2() {
        return this.dstAcctKey;
    }

    public final String component3() {
        return this.serviceId;
    }

    public final String component4() {
        return this.operationId;
    }

    public final String component5() {
        return this.operationReference;
    }

    public final String component6() {
        return this.scaAuthCode;
    }

    public final ValidateDepositBreakParams copy(long j, long j2, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        return new ValidateDepositBreakParams(j, j2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateDepositBreakParams)) {
            return false;
        }
        ValidateDepositBreakParams validateDepositBreakParams = (ValidateDepositBreakParams) obj;
        return this.agreeKey == validateDepositBreakParams.agreeKey && this.dstAcctKey == validateDepositBreakParams.dstAcctKey && C41536l.m120484d(this.serviceId, validateDepositBreakParams.serviceId) && C41536l.m120484d(this.operationId, validateDepositBreakParams.operationId) && C41536l.m120484d(this.operationReference, validateDepositBreakParams.operationReference) && C41536l.m120484d(this.scaAuthCode, validateDepositBreakParams.scaAuthCode);
    }

    public final long getAgreeKey() {
        return this.agreeKey;
    }

    public final long getDstAcctKey() {
        return this.dstAcctKey;
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

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.agreeKey) * 31) + C7397t.m28148a(this.dstAcctKey)) * 31) + this.serviceId.hashCode()) * 31;
        String str = this.operationId;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operationReference;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scaAuthCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.agreeKey;
        long j2 = this.dstAcctKey;
        String str = this.serviceId;
        String str2 = this.operationId;
        String str3 = this.operationReference;
        String str4 = this.scaAuthCode;
        return "ValidateDepositBreakParams(agreeKey=" + j + ", dstAcctKey=" + j2 + ", serviceId=" + str + ", operationId=" + str2 + ", operationReference=" + str3 + ", scaAuthCode=" + str4 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateDepositBreakParams(long j, long j2, String str, String str2, String str3, String str4) {
        super(str, str3, str4, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        this.agreeKey = j;
        this.dstAcctKey = j2;
        this.serviceId = str;
        this.operationId = str2;
        this.operationReference = str3;
        this.scaAuthCode = str4;
    }
}
