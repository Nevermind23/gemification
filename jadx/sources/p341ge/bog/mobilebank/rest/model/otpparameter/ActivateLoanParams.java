package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.ActivateLoanParams */
public final class ActivateLoanParams extends OtpParams {
    private final Long cardId;
    private final String cardPan;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivateLoanParams(Long l, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(l, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public final Long getCardId() {
        return this.cardId;
    }

    public final String getCardPan() {
        return this.cardPan;
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
    public ActivateLoanParams(Long l, String str, String str2, String str3, String str4) {
        super(str2, str3, str4, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "cardPan");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.cardId = l;
        this.cardPan = str;
        this.serviceId = str2;
        this.operationReference = str3;
        this.scaAuthCode = str4;
    }
}
