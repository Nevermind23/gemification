package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.OrderMrPrizeParams */
public final class OrderMrPrizeParams extends OtpParams {
    private final String bonusType;
    private final String operationId;
    private final String operationReference;
    private final long prizeNo;
    private final int quantity;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderMrPrizeParams(long j, int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, str, str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }

    public final String getBonusType() {
        return this.bonusType;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final long getPrizeNo() {
        return this.prizeNo;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderMrPrizeParams(long j, int i, String str, String str2, String str3, String str4, String str5) {
        super(str2, str4, str5, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "bonusType");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.prizeNo = j;
        this.quantity = i;
        this.bonusType = str;
        this.serviceId = str2;
        this.operationId = str3;
        this.operationReference = str4;
        this.scaAuthCode = str5;
    }
}
