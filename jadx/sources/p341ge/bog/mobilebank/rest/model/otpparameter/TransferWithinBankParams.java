package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.TransferWithinBankParams */
public final class TransferWithinBankParams extends OtpParams {
    private final String amount;
    private final String attachmentIds;
    private final String benefAcctKey;
    private final String benefAcctNo;
    private final String benefName;
    private final String cadastreCode;
    private final String ccy;
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
    private final Integer trustBeneficiar;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransferWithinBankParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, Integer num, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, l, num, str12, str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAttachmentIds() {
        return this.attachmentIds;
    }

    public final String getBenefAcctKey() {
        return this.benefAcctKey;
    }

    public final String getBenefAcctNo() {
        return this.benefAcctNo;
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

    public final Integer getTrustBeneficiar() {
        return this.trustBeneficiar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransferWithinBankParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Long l, Integer num, String str12, String str13, String str14, String str15, String str16) {
        super(str13, str15, str16, (String) null, 8, (DefaultConstructorMarker) null);
        String str17 = str;
        String str18 = str2;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        String str24 = str9;
        C41536l.m120489i(str17, "srcAcctKey");
        C41536l.m120489i(str18, "benefAcctNo");
        C41536l.m120489i(str19, "benefName");
        C41536l.m120489i(str20, "payerName");
        C41536l.m120489i(str21, "payerInn");
        C41536l.m120489i(str22, "amount");
        C41536l.m120489i(str23, "ccy");
        C41536l.m120489i(str24, "nomination");
        C41536l.m120489i(str10, "attachmentIds");
        C41536l.m120489i(str13, IRetrofitService.SERVICE_ID);
        this.srcAcctKey = str17;
        this.benefAcctNo = str18;
        this.benefAcctKey = str3;
        this.benefName = str19;
        this.payerName = str20;
        this.payerInn = str21;
        this.amount = str22;
        this.ccy = str23;
        this.nomination = str24;
        this.attachmentIds = str10;
        this.cadastreCode = str11;
        this.moneyRequestId = l;
        this.trustBeneficiar = num;
        this.tmxSessionId = str12;
        this.serviceId = str13;
        this.operationId = str14;
        this.operationReference = str15;
        this.scaAuthCode = str16;
    }
}
