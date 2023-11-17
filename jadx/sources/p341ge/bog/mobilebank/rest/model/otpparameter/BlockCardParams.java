package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.BlockCardParams */
public final class BlockCardParams extends OtpParams {
    private final String cardId;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockCardParams(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public final String getCardId() {
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
    public BlockCardParams(String str, String str2, String str3, String str4, String str5) {
        super(str2, str4, str5, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "cardId");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.cardId = str;
        this.serviceId = str2;
        this.operationId = str3;
        this.operationReference = str4;
        this.scaAuthCode = str5;
    }
}
