package p341ge.bog.mobilebank.rest.model.otpparameter;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.rest.model.otpparameter.RegisterCardAppParams */
public final class RegisterCardAppParams extends OtpParams {
    private final String acctKey;
    private final String activationDepartment;
    private final String appType;
    private final String ccy;
    private final String designCode;
    private final String nameOnCard;
    private final String operationReference;
    private final String pinDeliveryPhone;
    private final String pinDeliveryType;
    private final String product;
    private final String regType;
    private final String scaAuthCode;
    private final String serviceId;
    private final Integer useNicknameOnCard;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RegisterCardAppParams(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r16 = r2
            goto L_0x000c
        L_0x000a:
            r16 = r31
        L_0x000c:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0013
            r17 = r2
            goto L_0x0015
        L_0x0013:
            r17 = r32
        L_0x0015:
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.rest.model.otpparameter.RegisterCardAppParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getAcctKey() {
        return this.acctKey;
    }

    public final String getActivationDepartment() {
        return this.activationDepartment;
    }

    public final String getAppType() {
        return this.appType;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getDesignCode() {
        return this.designCode;
    }

    public final String getNameOnCard() {
        return this.nameOnCard;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPinDeliveryPhone() {
        return this.pinDeliveryPhone;
    }

    public final String getPinDeliveryType() {
        return this.pinDeliveryType;
    }

    public final String getProduct() {
        return this.product;
    }

    public final String getRegType() {
        return this.regType;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final Integer getUseNicknameOnCard() {
        return this.useNicknameOnCard;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RegisterCardAppParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, String str13) {
        super(str11, str12, str13, (String) null, 8, (DefaultConstructorMarker) null);
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        C41536l.m120489i(str14, "appType");
        C41536l.m120489i(str15, "regType");
        C41536l.m120489i(str16, "product");
        C41536l.m120489i(str17, "nameOnCard");
        C41536l.m120489i(str18, "ccy");
        C41536l.m120489i(str19, "acctKey");
        C41536l.m120489i(str20, "designCode");
        C41536l.m120489i(str21, "activationDepartment");
        C41536l.m120489i(str9, "pinDeliveryType");
        C41536l.m120489i(str10, "pinDeliveryPhone");
        C41536l.m120489i(str11, IRetrofitService.SERVICE_ID);
        this.appType = str14;
        this.regType = str15;
        this.product = str16;
        this.nameOnCard = str17;
        this.ccy = str18;
        this.acctKey = str19;
        this.designCode = str20;
        this.activationDepartment = str21;
        this.pinDeliveryType = str9;
        this.pinDeliveryPhone = str10;
        this.useNicknameOnCard = num;
        this.serviceId = str11;
        this.operationReference = str12;
        this.scaAuthCode = str13;
    }
}
