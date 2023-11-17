package p341ge.bog.mobilebank.products.data.model.cardinsurance;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.cardinsurance.RemoveCardInsuranceParams */
public final class RemoveCardInsuranceParams extends OtpParams {
    private final String insuranceId;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RemoveCardInsuranceParams(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "CARDS_REMOVE_INSURANCE" : str5);
    }

    public final String getInsuranceId() {
        return this.insuranceId;
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RemoveCardInsuranceParams(String str, String str2, String str3, String str4, String str5) {
        super(str5, str3, str4, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "insuranceId");
        C41536l.m120489i(str5, IRetrofitService.SERVICE_ID);
        this.insuranceId = str;
        this.operationId = str2;
        this.operationReference = str3;
        this.scaAuthCode = str4;
        this.serviceId = str5;
    }
}
