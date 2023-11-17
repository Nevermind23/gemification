package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.SaveUserAddressParams */
public final class SaveUserAddressParams extends OtpParams {
    private final String addressLine;
    private final String countryCode;
    private final String operationReference;
    private final String regionCode;
    private final String scaAuthCode;
    private final String serviceId;
    private final String urbanType;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveUserAddressParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public final String getAddressLine() {
        return this.addressLine;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getUrbanType() {
        return this.urbanType;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveUserAddressParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str5, str6, str7, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str4, "addressLine");
        C41536l.m120489i(str5, IRetrofitService.SERVICE_ID);
        this.urbanType = str;
        this.countryCode = str2;
        this.regionCode = str3;
        this.addressLine = str4;
        this.serviceId = str5;
        this.operationReference = str6;
        this.scaAuthCode = str7;
    }
}
