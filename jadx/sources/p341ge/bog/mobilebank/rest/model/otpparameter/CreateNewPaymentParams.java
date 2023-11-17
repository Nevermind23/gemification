package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.CreateNewPaymentParams */
public final class CreateNewPaymentParams extends OtpParams {
    private final Long acctKey;
    private final Long acctKey2;
    private final Long acctKey3;
    private final String amount;
    private final String customerIdentification;
    private final Long endDate;
    private final String name;
    private final String operationId;
    private final String operationReference;
    private final String overlimitAction;
    private final Long paymentDate;
    private final String paymentType;
    private final String periodType;
    private final Long providerId;
    private final String scaAuthCode;
    private final String serviceId;
    private final String subServiceId;
    private final Long termPaymentId;
    private final String thresholdAmount;
    private final String tmxSessionId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateNewPaymentParams(String str, Long l, String str2, String str3, Long l2, Long l3, Long l4, String str4, String str5, String str6, Long l5, Long l6, String str7, String str8, Long l7, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, str2, str3, l2, l3, l4, str4, str5, str6, l5, l6, str7, str8, l7, str9, str10, (i & 131072) != 0 ? null : str11, (i & 262144) != 0 ? null : str12, (i & 524288) != 0 ? null : str13);
    }

    public final Long getAcctKey() {
        return this.acctKey;
    }

    public final Long getAcctKey2() {
        return this.acctKey2;
    }

    public final Long getAcctKey3() {
        return this.acctKey3;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCustomerIdentification() {
        return this.customerIdentification;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getName() {
        return this.name;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getOverlimitAction() {
        return this.overlimitAction;
    }

    public final Long getPaymentDate() {
        return this.paymentDate;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public final String getPeriodType() {
        return this.periodType;
    }

    public final Long getProviderId() {
        return this.providerId;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getSubServiceId() {
        return this.subServiceId;
    }

    public final Long getTermPaymentId() {
        return this.termPaymentId;
    }

    public final String getThresholdAmount() {
        return this.thresholdAmount;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateNewPaymentParams(String str, Long l, String str2, String str3, Long l2, Long l3, Long l4, String str4, String str5, String str6, Long l5, Long l6, String str7, String str8, Long l7, String str9, String str10, String str11, String str12, String str13) {
        super(str10, str12, str13, (String) null, 8, (DefaultConstructorMarker) null);
        String str14 = str10;
        C41536l.m120489i(str14, IRetrofitService.SERVICE_ID);
        this.name = str;
        this.providerId = l;
        this.subServiceId = str2;
        this.customerIdentification = str3;
        this.acctKey = l2;
        this.acctKey2 = l3;
        this.acctKey3 = l4;
        this.paymentType = str4;
        this.amount = str5;
        this.periodType = str6;
        this.paymentDate = l5;
        this.endDate = l6;
        this.thresholdAmount = str7;
        this.overlimitAction = str8;
        this.termPaymentId = l7;
        this.tmxSessionId = str9;
        this.serviceId = str14;
        this.operationId = str11;
        this.operationReference = str12;
        this.scaAuthCode = str13;
    }
}
