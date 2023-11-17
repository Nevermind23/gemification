package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.ActivateChannelParams */
public final class ActivateChannelParams extends OtpParams {
    private final String channelId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;
    private final long userKey;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivateChannelParams(long j, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final String getChannelId() {
        return this.channelId;
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

    public final long getUserKey() {
        return this.userKey;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivateChannelParams(long j, String str, String str2, String str3, String str4) {
        super(str2, str3, str4, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "channelId");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.userKey = j;
        this.channelId = str;
        this.serviceId = str2;
        this.operationReference = str3;
        this.scaAuthCode = str4;
    }
}
