package p341ge.bog.mobilebank.cleanarch.presentation.smstopush;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.presentation.smstopush.SmsToPushParams */
public final class SmsToPushParams extends OtpParams {
    private final String deviceId;
    private final String notifSetIdsStr;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SmsToPushParams(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getNotifSetIdsStr() {
        return this.notifSetIdsStr;
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
    public SmsToPushParams(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str3, str5, str6, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str2, "deviceId");
        C41536l.m120489i(str3, IRetrofitService.SERVICE_ID);
        this.notifSetIdsStr = str;
        this.deviceId = str2;
        this.serviceId = str3;
        this.operationId = str4;
        this.operationReference = str5;
        this.scaAuthCode = str6;
    }
}
