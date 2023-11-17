package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import java.util.HashMap;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import pc0.C27494a;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.SaveSMSNotifsParams */
public final class SaveSMSNotifsParams extends OtpParams {
    private final String notificationSets;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveSMSNotifsParams(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final String getNotificationSets() {
        return this.notificationSets;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final HashMap<String, Object> getParametersMapWithoutNotifications(C27494a aVar) {
        C41536l.m120489i(aVar, "otpParamsMapBuilder");
        HashMap<String, Object> a = aVar.mo66809a(this);
        a.remove("notificationSets");
        return a;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveSMSNotifsParams(String str, String str2, String str3, String str4, String str5) {
        super(str2, str4, str5, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "notificationSets");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.notificationSets = str;
        this.serviceId = str2;
        this.operationId = str3;
        this.operationReference = str4;
        this.scaAuthCode = str5;
    }
}
