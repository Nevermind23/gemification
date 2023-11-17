package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.PaymentsBatchExecuteParams */
public final class PaymentsBatchExecuteParams extends OtpParams {
    private final String executeParameters;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;
    private final Long serviceOperationId;
    private final String tmxSessionId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentsBatchExecuteParams(Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public final String getExecuteParameters() {
        return this.executeParameters;
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

    public final Long getServiceOperationId() {
        return this.serviceOperationId;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsBatchExecuteParams(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        super(str3, str5, str6, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "executeParameters");
        C41536l.m120489i(str3, IRetrofitService.SERVICE_ID);
        this.serviceOperationId = l;
        this.executeParameters = str;
        this.tmxSessionId = str2;
        this.serviceId = str3;
        this.operationId = str4;
        this.operationReference = str5;
        this.scaAuthCode = str6;
    }
}
