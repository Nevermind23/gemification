package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.TransferWithinGeorgiaParams */
public final class TransferWithinGeorgiaParams extends OtpParams {
    private final String amount;
    private final String attachmentIds;
    private final String benefAcctNo;
    private final String benefAddress;
    private final String benefCity;
    private final String benefCountry;
    private final String benefName;
    private final String cadastreCode;
    private final String ccy;
    private final String dispatchType;
    private final Long moneyRequestId;
    private final String nomination;
    private final String operationId;
    private final String operationReference;
    private final String payerInn;
    private final String payerName;
    private final String scaAuthCode;
    private final String serviceId;
    private final String srcAcctKey;
    private final String tmxSessionId;
    private final String treasureCode;
    private final Integer trustBeneficiar;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferWithinGeorgiaParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l, Integer num, String str16, String str17, String str18, String str19, String str20, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, l, num, str16, str17, (i & 524288) != 0 ? null : str18, (i & 1048576) != 0 ? null : str19, (i & 2097152) != 0 ? null : str20);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAttachmentIds() {
        return this.attachmentIds;
    }

    public final String getBenefAcctNo() {
        return this.benefAcctNo;
    }

    public final String getBenefAddress() {
        return this.benefAddress;
    }

    public final String getBenefCity() {
        return this.benefCity;
    }

    public final String getBenefCountry() {
        return this.benefCountry;
    }

    public final String getBenefName() {
        return this.benefName;
    }

    public final String getCadastreCode() {
        return this.cadastreCode;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDispatchType() {
        return this.dispatchType;
    }

    public final Long getMoneyRequestId() {
        return this.moneyRequestId;
    }

    public final String getNomination() {
        return this.nomination;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPayerInn() {
        return this.payerInn;
    }

    public final String getPayerName() {
        return this.payerName;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getSrcAcctKey() {
        return this.srcAcctKey;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    public final String getTreasureCode() {
        return this.treasureCode;
    }

    public final Integer getTrustBeneficiar() {
        return this.trustBeneficiar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferWithinGeorgiaParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l, Integer num, String str16, String str17, String str18, String str19, String str20) {
        super(str17, str19, str20, (String) null, 8, (DefaultConstructorMarker) null);
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str5;
        String str25 = str6;
        String str26 = str7;
        String str27 = str8;
        String str28 = str11;
        C41536l.m120489i(str21, "srcAcctKey");
        C41536l.m120489i(str22, "benefAcctNo");
        C41536l.m120489i(str23, "treasureCode");
        C41536l.m120489i(str24, "payerName");
        C41536l.m120489i(str25, "payerInn");
        C41536l.m120489i(str26, "amount");
        C41536l.m120489i(str27, "ccy");
        C41536l.m120489i(str28, "attachmentIds");
        C41536l.m120489i(str17, IRetrofitService.SERVICE_ID);
        this.srcAcctKey = str21;
        this.benefAcctNo = str22;
        this.treasureCode = str23;
        this.benefName = str4;
        this.payerName = str24;
        this.payerInn = str25;
        this.amount = str26;
        this.ccy = str27;
        this.nomination = str9;
        this.dispatchType = str10;
        this.attachmentIds = str28;
        this.benefCountry = str12;
        this.benefCity = str13;
        this.benefAddress = str14;
        this.cadastreCode = str15;
        this.moneyRequestId = l;
        this.trustBeneficiar = num;
        this.tmxSessionId = str16;
        this.serviceId = str17;
        this.operationId = str18;
        this.operationReference = str19;
        this.scaAuthCode = str20;
    }
}
