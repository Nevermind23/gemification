package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.CreateNewDepositParams */
public final class CreateNewDepositParams extends OtpParams {
    private final String amount;
    private final String ccy;
    private final String depositName;
    private final Long endDate;
    private final String intWithPeriodType;
    private final String minInstallment;
    private final String operationReference;
    private final String prodType;
    private final String purpose;
    private final String scaAuthCode;
    private final String serviceId;
    private final long srcAcctKey;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreateNewDepositParams(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, java.lang.String r26, java.lang.Long r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r15 = r2
            goto L_0x000b
        L_0x0009:
            r15 = r29
        L_0x000b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0012
            r16 = r2
            goto L_0x0014
        L_0x0012:
            r16 = r30
        L_0x0014:
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r12 = r26
            r13 = r27
            r14 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.CreateNewDepositParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDepositName() {
        return this.depositName;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getIntWithPeriodType() {
        return this.intWithPeriodType;
    }

    public final String getMinInstallment() {
        return this.minInstallment;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final long getSrcAcctKey() {
        return this.srcAcctKey;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateNewDepositParams(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7, Long l, String str8, String str9, String str10) {
        super(str8, str9, str10, (String) null, 8, (DefaultConstructorMarker) null);
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        C41536l.m120489i(str11, "depositName");
        C41536l.m120489i(str12, "prodType");
        C41536l.m120489i(str13, "minInstallment");
        C41536l.m120489i(str14, "ccy");
        C41536l.m120489i(str15, "amount");
        C41536l.m120489i(str16, "purpose");
        C41536l.m120489i(str17, IRetrofitService.SERVICE_ID);
        this.depositName = str11;
        this.prodType = str12;
        this.minInstallment = str13;
        this.ccy = str14;
        this.intWithPeriodType = str5;
        this.amount = str15;
        this.srcAcctKey = j;
        this.purpose = str16;
        this.endDate = l;
        this.serviceId = str17;
        this.operationReference = str9;
        this.scaAuthCode = str10;
    }
}
