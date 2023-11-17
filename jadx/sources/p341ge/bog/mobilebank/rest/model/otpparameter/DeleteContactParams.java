package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.DeleteContactParams */
public final class DeleteContactParams extends OtpParams {
    private final String contact;
    private final String operationReference;
    private final String route;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeleteContactParams(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final String getContact() {
        return this.contact;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getRoute() {
        return this.route;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeleteContactParams(String str, String str2, String str3, String str4, String str5) {
        super(str3, str4, str5, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "route");
        C41536l.m120489i(str2, "contact");
        C41536l.m120489i(str3, IRetrofitService.SERVICE_ID);
        this.route = str;
        this.contact = str2;
        this.serviceId = str3;
        this.operationReference = str4;
        this.scaAuthCode = str5;
    }
}
