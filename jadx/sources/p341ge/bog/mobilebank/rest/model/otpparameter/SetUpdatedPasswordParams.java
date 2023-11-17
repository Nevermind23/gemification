package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.SetUpdatedPasswordParams */
public final class SetUpdatedPasswordParams extends OtpParams {
    private final String newPassword;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;
    private final String userName;
    private final String videoId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetUpdatedPasswordParams(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public final String getNewPassword() {
        return this.newPassword;
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

    public final String getUserName() {
        return this.userName;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetUpdatedPasswordParams(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str4, str5, str6, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str4, IRetrofitService.SERVICE_ID);
        this.newPassword = str;
        this.userName = str2;
        this.videoId = str3;
        this.serviceId = str4;
        this.operationReference = str5;
        this.scaAuthCode = str6;
    }
}
