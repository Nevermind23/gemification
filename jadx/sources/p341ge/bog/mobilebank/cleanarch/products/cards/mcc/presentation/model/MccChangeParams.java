package p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model.MccChangeParams */
public final class MccChangeParams extends OtpParams {
    private final String cardMccOperations;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MccChangeParams(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "CARDS_CHANGE_CARD_MCC_STATE" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ MccChangeParams copy$default(MccChangeParams mccChangeParams, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mccChangeParams.cardMccOperations;
        }
        if ((i & 2) != 0) {
            str2 = mccChangeParams.serviceId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = mccChangeParams.operationId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = mccChangeParams.operationReference;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = mccChangeParams.scaAuthCode;
        }
        return mccChangeParams.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.cardMccOperations;
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

    public final MccChangeParams copy(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "cardMccOperations");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        return new MccChangeParams(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MccChangeParams)) {
            return false;
        }
        MccChangeParams mccChangeParams = (MccChangeParams) obj;
        return C41536l.m120484d(this.cardMccOperations, mccChangeParams.cardMccOperations) && C41536l.m120484d(this.serviceId, mccChangeParams.serviceId) && C41536l.m120484d(this.operationId, mccChangeParams.operationId) && C41536l.m120484d(this.operationReference, mccChangeParams.operationReference) && C41536l.m120484d(this.scaAuthCode, mccChangeParams.scaAuthCode);
    }

    public final String getCardMccOperations() {
        return this.cardMccOperations;
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
        int hashCode = ((this.cardMccOperations.hashCode() * 31) + this.serviceId.hashCode()) * 31;
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
        String str = this.cardMccOperations;
        String str2 = this.serviceId;
        String str3 = this.operationId;
        String str4 = this.operationReference;
        String str5 = this.scaAuthCode;
        return "MccChangeParams(cardMccOperations=" + str + ", serviceId=" + str2 + ", operationId=" + str3 + ", operationReference=" + str4 + ", scaAuthCode=" + str5 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MccChangeParams(String str, String str2, String str3, String str4, String str5) {
        super(str2, str3, str4, str5);
        C41536l.m120489i(str, "cardMccOperations");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.cardMccOperations = str;
        this.serviceId = str2;
        this.operationId = str3;
        this.operationReference = str4;
        this.scaAuthCode = str5;
    }
}
