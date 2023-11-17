package p341ge.bog.mobilebank.cardproducts.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;

@Keep
/* renamed from: ge.bog.mobilebank.cardproducts.data.entity.PinResetParams */
public final class PinResetParams extends OtpParams {
    private final long cardId;
    private final Long customerId;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PinResetParams(long j, Long l, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, l, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public static /* synthetic */ PinResetParams copy$default(PinResetParams pinResetParams, long j, Long l, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pinResetParams.cardId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = pinResetParams.customerId;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            str = pinResetParams.operationId;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = pinResetParams.operationReference;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = pinResetParams.scaAuthCode;
        }
        return pinResetParams.copy(j2, l2, str4, str5, str3);
    }

    public final long component1() {
        return this.cardId;
    }

    public final Long component2() {
        return this.customerId;
    }

    public final String component3() {
        return this.operationId;
    }

    public final String component4() {
        return this.operationReference;
    }

    public final String component5() {
        return this.scaAuthCode;
    }

    public final PinResetParams copy(long j, Long l, String str, String str2, String str3) {
        return new PinResetParams(j, l, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinResetParams)) {
            return false;
        }
        PinResetParams pinResetParams = (PinResetParams) obj;
        return this.cardId == pinResetParams.cardId && C41536l.m120484d(this.customerId, pinResetParams.customerId) && C41536l.m120484d(this.operationId, pinResetParams.operationId) && C41536l.m120484d(this.operationReference, pinResetParams.operationReference) && C41536l.m120484d(this.scaAuthCode, pinResetParams.scaAuthCode);
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final Long getCustomerId() {
        return this.customerId;
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
        int a = C7397t.m28148a(this.cardId) * 31;
        Long l = this.customerId;
        int i = 0;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.operationId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operationReference;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scaAuthCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.cardId;
        Long l = this.customerId;
        String str = this.operationId;
        String str2 = this.operationReference;
        String str3 = this.scaAuthCode;
        return "PinResetParams(cardId=" + j + ", customerId=" + l + ", operationId=" + str + ", operationReference=" + str2 + ", scaAuthCode=" + str3 + ")";
    }

    public PinResetParams(long j, Long l, String str, String str2, String str3) {
        super("CARDS_SET_CARD_PIN_CODE", str, str2, str3);
        this.cardId = j;
        this.customerId = l;
        this.operationId = str;
        this.operationReference = str2;
        this.scaAuthCode = str3;
        this.serviceId = "CARDS_SET_CARD_PIN_CODE";
    }
}
