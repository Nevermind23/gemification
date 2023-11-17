package p341ge.bog.mobilebank.cleanarch.cardactivation.domain.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.domain.model.CardActivationParams */
public final class CardActivationParams extends OtpParams {
    private final String operationId;
    private final String operationReference;
    private final String pan2;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardActivationParams(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? BankApi.CARDS_ACTIVATE_CARD : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ CardActivationParams copy$default(CardActivationParams cardActivationParams, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardActivationParams.pan2;
        }
        if ((i & 2) != 0) {
            str2 = cardActivationParams.serviceId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cardActivationParams.operationId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cardActivationParams.operationReference;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cardActivationParams.scaAuthCode;
        }
        return cardActivationParams.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.pan2;
    }

    public final String component2() {
        return this.serviceId;
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

    public final CardActivationParams copy(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "pan2");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        return new CardActivationParams(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardActivationParams)) {
            return false;
        }
        CardActivationParams cardActivationParams = (CardActivationParams) obj;
        return C41536l.m120484d(this.pan2, cardActivationParams.pan2) && C41536l.m120484d(this.serviceId, cardActivationParams.serviceId) && C41536l.m120484d(this.operationId, cardActivationParams.operationId) && C41536l.m120484d(this.operationReference, cardActivationParams.operationReference) && C41536l.m120484d(this.scaAuthCode, cardActivationParams.scaAuthCode);
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPan2() {
        return this.pan2;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        int hashCode = ((this.pan2.hashCode() * 31) + this.serviceId.hashCode()) * 31;
        String str = this.operationId;
        int i = 0;
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
        String str = this.pan2;
        String str2 = this.serviceId;
        String str3 = this.operationId;
        String str4 = this.operationReference;
        String str5 = this.scaAuthCode;
        return "CardActivationParams(pan2=" + str + ", serviceId=" + str2 + ", operationId=" + str3 + ", operationReference=" + str4 + ", scaAuthCode=" + str5 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardActivationParams(String str, String str2, String str3, String str4, String str5) {
        super(str2, str4, str5, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "pan2");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.pan2 = str;
        this.serviceId = str2;
        this.operationId = str3;
        this.operationReference = str4;
        this.scaAuthCode = str5;
    }
}
