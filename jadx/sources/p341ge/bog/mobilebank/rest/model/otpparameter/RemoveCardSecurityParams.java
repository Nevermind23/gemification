package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.RemoveCardSecurityParams */
public final class RemoveCardSecurityParams extends OtpParams {
    private final long cardId;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RemoveCardSecurityParams(long j, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final long getCardId() {
        return this.cardId;
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
    public RemoveCardSecurityParams(long j, String str, String str2, String str3, String str4) {
        super(str, str3, str4, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        this.cardId = j;
        this.serviceId = str;
        this.operationId = str2;
        this.operationReference = str3;
        this.scaAuthCode = str4;
    }
}
