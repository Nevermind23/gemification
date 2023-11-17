package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.ChangeFavouriteContactParams */
public final class ChangeFavouriteContactParams extends OtpParams {
    private final String contact;
    private final String isFinancial;
    private final String operationId;
    private final String operationReference;
    private final String route;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChangeFavouriteContactParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public final String getContact() {
        return this.contact;
    }

    public String getOperationId() {
        return this.operationId;
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

    public final String isFinancial() {
        return this.isFinancial;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChangeFavouriteContactParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str4, str5, str6, str7);
        C41536l.m120489i(str, "route");
        C41536l.m120489i(str2, "contact");
        C41536l.m120489i(str3, "isFinancial");
        C41536l.m120489i(str4, IRetrofitService.SERVICE_ID);
        this.route = str;
        this.contact = str2;
        this.isFinancial = str3;
        this.serviceId = str4;
        this.operationId = str5;
        this.operationReference = str6;
        this.scaAuthCode = str7;
    }
}
