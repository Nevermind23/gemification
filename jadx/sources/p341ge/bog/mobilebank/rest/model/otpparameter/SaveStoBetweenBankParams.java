package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.SaveStoBetweenBankParams */
public final class SaveStoBetweenBankParams extends OtpParams {
    private final String amount;
    private final String benefAcctNo;
    private final String benefName;
    private final String ccy;
    private final String documentName;
    private final String endDate;
    private final String nomination;
    private final String operationId;
    private final String operationReference;
    private final String payerInn;
    private final String payerName;
    private final String periodType;
    private final String scaAuthCode;
    private final String serviceId;
    private final String srcAcctCcy;
    private final String srcAcctKey;
    private final String startDate;
    private final String termDocumentId;
    private final String tmxSessionId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SaveStoBetweenBankParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getBenefAcctNo() {
        return this.benefAcctNo;
    }

    public final String getBenefName() {
        return this.benefName;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final String getEndDate() {
        return this.endDate;
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

    public final String getPeriodType() {
        return this.periodType;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getSrcAcctCcy() {
        return this.srcAcctCcy;
    }

    public final String getSrcAcctKey() {
        return this.srcAcctKey;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getTermDocumentId() {
        return this.termDocumentId;
    }

    public final String getTmxSessionId() {
        return this.tmxSessionId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveStoBetweenBankParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19) {
        super(str16, str18, str19, (String) null, 8, (DefaultConstructorMarker) null);
        String str20 = str;
        String str21 = str2;
        String str22 = str3;
        String str23 = str4;
        String str24 = str5;
        String str25 = str6;
        String str26 = str7;
        String str27 = str8;
        String str28 = str9;
        String str29 = str10;
        C41536l.m120489i(str20, "termDocumentId");
        C41536l.m120489i(str21, "srcAcctKey");
        C41536l.m120489i(str22, "srcAcctCcy");
        C41536l.m120489i(str23, "benefAcctNo");
        C41536l.m120489i(str24, "benefName");
        C41536l.m120489i(str25, "payerName");
        C41536l.m120489i(str26, "payerInn");
        C41536l.m120489i(str27, "amount");
        C41536l.m120489i(str28, "ccy");
        C41536l.m120489i(str29, "nomination");
        C41536l.m120489i(str11, "documentName");
        C41536l.m120489i(str12, "periodType");
        C41536l.m120489i(str13, "startDate");
        C41536l.m120489i(str14, "endDate");
        C41536l.m120489i(str16, IRetrofitService.SERVICE_ID);
        String str30 = str29;
        this.termDocumentId = str20;
        this.srcAcctKey = str21;
        this.srcAcctCcy = str22;
        this.benefAcctNo = str23;
        this.benefName = str24;
        this.payerName = str25;
        this.payerInn = str26;
        this.amount = str27;
        this.ccy = str28;
        this.nomination = str10;
        this.documentName = str11;
        this.periodType = str12;
        this.startDate = str13;
        this.endDate = str14;
        this.tmxSessionId = str15;
        this.serviceId = str16;
        this.operationId = str17;
        this.operationReference = str18;
        this.scaAuthCode = str19;
    }
}
