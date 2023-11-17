package p341ge.bog.mobilebank.cardapplications.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.model.OrderCardPreContractParams */
public final class OrderCardPreContractParams extends OtpParams {
    private final String accRegType;
    private final String accountCurrency;
    private final String accountsPackage;
    private final String acctNumber;
    private final String cardLimitCheck;
    private final String csAddress;
    private final String csComAmount;
    private final String csComCcy;
    private final String csDepartment;
    private final String csOwnerFirstName;
    private final String csOwnerLastName;
    private final String csOwnerPhoneNumber;
    private final String insuranceFlag;
    private final String isArmyCard;
    private final String isPayroll;
    private final String mainCurrency;
    private final String operationId;
    private final String operationReference;
    private final String orgName;
    private final String packageRegFlag;
    private final String pinPhoneNumber;
    private final String plcSchoolFlag;
    private final String prodType;
    private final String product;
    private final String replaceCardId;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderCardPreContractParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, (i & 4194304) != 0 ? "Y" : str23, (i & 8388608) != 0 ? "CARDS_APPLICATIONS_GET_PRE_CONTRACT" : str24, (i & 16777216) != 0 ? null : str25, (i & 33554432) != 0 ? null : str26, (i & 67108864) != 0 ? null : str27);
    }

    public final String getAccRegType() {
        return this.accRegType;
    }

    public final String getAccountCurrency() {
        return this.accountCurrency;
    }

    public final String getAccountsPackage() {
        return this.accountsPackage;
    }

    public final String getAcctNumber() {
        return this.acctNumber;
    }

    public final String getCardLimitCheck() {
        return this.cardLimitCheck;
    }

    public final String getCsAddress() {
        return this.csAddress;
    }

    public final String getCsComAmount() {
        return this.csComAmount;
    }

    public final String getCsComCcy() {
        return this.csComCcy;
    }

    public final String getCsDepartment() {
        return this.csDepartment;
    }

    public final String getCsOwnerFirstName() {
        return this.csOwnerFirstName;
    }

    public final String getCsOwnerLastName() {
        return this.csOwnerLastName;
    }

    public final String getCsOwnerPhoneNumber() {
        return this.csOwnerPhoneNumber;
    }

    public final String getInsuranceFlag() {
        return this.insuranceFlag;
    }

    public final String getMainCurrency() {
        return this.mainCurrency;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getOrgName() {
        return this.orgName;
    }

    public final String getPackageRegFlag() {
        return this.packageRegFlag;
    }

    public final String getPinPhoneNumber() {
        return this.pinPhoneNumber;
    }

    public final String getPlcSchoolFlag() {
        return this.plcSchoolFlag;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getReplaceCardId() {
        return this.replaceCardId;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String isArmyCard() {
        return this.isArmyCard;
    }

    public final String isPayroll() {
        return this.isPayroll;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OrderCardPreContractParams(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38) {
        /*
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r29
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            java.lang.String r10 = "prodType"
            kotlin.jvm.internal.C41536l.m120489i(r12, r10)
            java.lang.String r10 = "product"
            kotlin.jvm.internal.C41536l.m120489i(r13, r10)
            java.lang.String r10 = "pinPhoneNumber"
            kotlin.jvm.internal.C41536l.m120489i(r14, r10)
            java.lang.String r10 = "isPayroll"
            kotlin.jvm.internal.C41536l.m120489i(r4, r10)
            java.lang.String r10 = "cardLimitCheck"
            kotlin.jvm.internal.C41536l.m120489i(r5, r10)
            java.lang.String r10 = "serviceId"
            kotlin.jvm.internal.C41536l.m120489i(r6, r10)
            r11.<init>(r6, r7, r8, r9)
            r0.prodType = r1
            r0.product = r2
            r0.pinPhoneNumber = r3
            r1 = r15
            r0.accRegType = r1
            r1 = r16
            r0.acctNumber = r1
            r1 = r17
            r0.mainCurrency = r1
            r1 = r18
            r0.accountCurrency = r1
            r1 = r19
            r0.accountsPackage = r1
            r1 = r20
            r0.packageRegFlag = r1
            r1 = r21
            r0.csAddress = r1
            r1 = r22
            r0.csOwnerFirstName = r1
            r1 = r23
            r0.csOwnerLastName = r1
            r1 = r24
            r0.csOwnerPhoneNumber = r1
            r1 = r25
            r0.csComAmount = r1
            r1 = r26
            r0.csComCcy = r1
            r1 = r27
            r0.csDepartment = r1
            r1 = r28
            r0.replaceCardId = r1
            r0.isPayroll = r4
            r1 = r30
            r0.orgName = r1
            r1 = r31
            r0.isArmyCard = r1
            r1 = r32
            r0.plcSchoolFlag = r1
            r1 = r33
            r0.insuranceFlag = r1
            r0.cardLimitCheck = r5
            r0.serviceId = r6
            r0.operationId = r7
            r0.operationReference = r8
            r0.scaAuthCode = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.data.model.OrderCardPreContractParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
