package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.ModifySmsAuthParams */
public final class ModifySmsAuthParams extends OtpParams {
    private final int allowWeakLogins;
    private final String operationReference;
    private final String phoneForSMS;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModifySmsAuthParams(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4);
    }

    public final int getAllowWeakLogins() {
        return this.allowWeakLogins;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPhoneForSMS() {
        return this.phoneForSMS;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModifySmsAuthParams(String str, int i, String str2, String str3, String str4) {
        super(str2, str3, str4, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.phoneForSMS = str;
        this.allowWeakLogins = i;
        this.serviceId = str2;
        this.operationReference = str3;
        this.scaAuthCode = str4;
    }
}
