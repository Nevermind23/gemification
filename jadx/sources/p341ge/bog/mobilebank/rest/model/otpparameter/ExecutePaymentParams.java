package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.ExecutePaymentParams */
public final class ExecutePaymentParams {
    private final String essParameters;
    private final String essServiceId;
    private final String serviceId;

    public ExecutePaymentParams(String str, String str2, String str3) {
        C41536l.m120489i(str, "essServiceId");
        C41536l.m120489i(str2, "essParameters");
        C41536l.m120489i(str3, IRetrofitService.SERVICE_ID);
        this.essServiceId = str;
        this.essParameters = str2;
        this.serviceId = str3;
    }

    public final String getEssParameters() {
        return this.essParameters;
    }

    public final String getEssServiceId() {
        return this.essServiceId;
    }

    public final String getServiceId() {
        return this.serviceId;
    }
}
