package p341ge.bog.mobilebank.categorypackages.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;

@Keep
/* renamed from: ge.bog.mobilebank.categorypackages.data.entity.PackageActivationParamsObject */
public final class PackageActivationParamsObject extends OtpParams {
    private final String UTMCampaign;
    private final String UTMMedium;
    private final String UTMSource;
    private final String depositAmount;
    private final String email;
    private final String existingPackageName;
    private final String feePeriod;
    private final String income;
    private final String loanAmount;
    private final String newPackageName;
    private final String operationId;
    private final String operationReference;
    private final String phone;
    private final String preContractText;
    private final String prodGroup;
    private final String regMailBank;
    private final String scaAuthCode;
    private final String serviceCenterDesc;
    private final String serviceCenterKey;
    private final String serviceId;
    private final String workplace;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PackageActivationParamsObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, (i & 131072) != 0 ? "CLIENTS_PACKAGE_ACTIVATION_V2" : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21);
    }

    public final String getDepositAmount() {
        return this.depositAmount;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getExistingPackageName() {
        return this.existingPackageName;
    }

    public final String getFeePeriod() {
        return this.feePeriod;
    }

    public final String getIncome() {
        return this.income;
    }

    public final String getLoanAmount() {
        return this.loanAmount;
    }

    public final String getNewPackageName() {
        return this.newPackageName;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPreContractText() {
        return this.preContractText;
    }

    public final String getProdGroup() {
        return this.prodGroup;
    }

    public final String getRegMailBank() {
        return this.regMailBank;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public final String getServiceCenterDesc() {
        return this.serviceCenterDesc;
    }

    public final String getServiceCenterKey() {
        return this.serviceCenterKey;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final String getUTMCampaign() {
        return this.UTMCampaign;
    }

    public final String getUTMMedium() {
        return this.UTMMedium;
    }

    public final String getUTMSource() {
        return this.UTMSource;
    }

    public final String getWorkplace() {
        return this.workplace;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PackageActivationParamsObject(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r34
            java.lang.String r0 = "regMailBank"
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.lang.String r0 = "email"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.lang.String r0 = "prodGroup"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "feePeriod"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "phone"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "workplace"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            java.lang.String r0 = "income"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            java.lang.String r0 = "serviceCenterKey"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            java.lang.String r0 = "serviceCenterDesc"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            java.lang.String r0 = "preContractText"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            java.lang.String r0 = "depositAmount"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            java.lang.String r0 = "existingPackageName"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            java.lang.String r0 = "newPackageName"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            java.lang.String r0 = "loanAmount"
            kotlin.jvm.internal.C41536l.m120489i(r14, r0)
            java.lang.String r0 = "serviceId"
            kotlin.jvm.internal.C41536l.m120489i(r15, r0)
            r0 = r16
            r14 = r35
            r13 = r36
            r12 = r37
            r0.<init>(r15, r14, r13, r12)
            r0.regMailBank = r1
            r0.email = r2
            r0.prodGroup = r3
            r0.feePeriod = r4
            r0.phone = r5
            r0.workplace = r6
            r0.income = r7
            r0.serviceCenterKey = r8
            r0.serviceCenterDesc = r9
            r0.preContractText = r10
            r0.depositAmount = r11
            r1 = r28
            r2 = r12
            r0.existingPackageName = r1
            r1 = r29
            r3 = r13
            r0.newPackageName = r1
            r1 = r30
            r4 = r14
            r0.loanAmount = r1
            r1 = r31
            r0.UTMMedium = r1
            r1 = r32
            r0.UTMSource = r1
            r1 = r33
            r0.UTMCampaign = r1
            r0.serviceId = r15
            r0.operationId = r4
            r0.operationReference = r3
            r0.scaAuthCode = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.data.entity.PackageActivationParamsObject.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
