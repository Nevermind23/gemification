package p341ge.bog.mobilebank.rest.model.otpparameter;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.OtpParams */
public class OtpParams {
    private final transient String operationId;
    private final transient String operationReference;
    private final transient String scaAuthCode;
    private final transient String serviceId;

    public OtpParams(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        this.serviceId = str;
        this.operationId = str2;
        this.operationReference = str3;
        this.scaAuthCode = str4;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getOtpServiceId() {
        return getServiceId();
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtpParams(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
