package p341ge.bog.mobilebank.junior.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.junior.data.model.ApproveJuniorParams */
public final class ApproveJuniorParams extends OtpParams {
    private final Long childBirthDate;
    private final String childFirstName;
    private final String childLastName;
    private final String childMobileNumber;
    private final String childPhoneNumber;
    private final String childPin;
    private final Long childRequestId;
    private final String customerId;
    private final String operationId;
    private final String operationReference;
    private final String phoneNumber;
    private final String pin;
    private final String scaAuthCode;
    private final String serviceId;
    private final Long validationRequestId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApproveJuniorParams(java.lang.String r17, java.lang.Long r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.Long r23, java.lang.Long r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r13 = r2
            goto L_0x000b
        L_0x0009:
            r13 = r26
        L_0x000b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0011
            r14 = r2
            goto L_0x0013
        L_0x0011:
            r14 = r27
        L_0x0013:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0019
            r15 = r2
            goto L_0x001b
        L_0x0019:
            r15 = r28
        L_0x001b:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.junior.data.model.ApproveJuniorParams.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ ApproveJuniorParams copy$default(ApproveJuniorParams approveJuniorParams, String str, Long l, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6, String str7, String str8, String str9, int i, Object obj) {
        ApproveJuniorParams approveJuniorParams2 = approveJuniorParams;
        int i2 = i;
        return approveJuniorParams.copy((i2 & 1) != 0 ? approveJuniorParams2.customerId : str, (i2 & 2) != 0 ? approveJuniorParams2.childRequestId : l, (i2 & 4) != 0 ? approveJuniorParams2.phoneNumber : str2, (i2 & 8) != 0 ? approveJuniorParams2.pin : str3, (i2 & 16) != 0 ? approveJuniorParams2.childFirstName : str4, (i2 & 32) != 0 ? approveJuniorParams2.childLastName : str5, (i2 & 64) != 0 ? approveJuniorParams2.childBirthDate : l2, (i2 & 128) != 0 ? approveJuniorParams2.validationRequestId : l3, (i2 & C11398b.f33139r) != 0 ? approveJuniorParams2.serviceId : str6, (i2 & C11398b.f33140s) != 0 ? approveJuniorParams2.operationId : str7, (i2 & C11398b.f33141t) != 0 ? approveJuniorParams2.operationReference : str8, (i2 & C11398b.f33142u) != 0 ? approveJuniorParams2.scaAuthCode : str9);
    }

    public final String component1() {
        return this.customerId;
    }

    public final String component10() {
        return this.operationId;
    }

    public final String component11() {
        return this.operationReference;
    }

    public final String component12() {
        return this.scaAuthCode;
    }

    public final Long component2() {
        return this.childRequestId;
    }

    public final String component3() {
        return this.phoneNumber;
    }

    public final String component4() {
        return this.pin;
    }

    public final String component5() {
        return this.childFirstName;
    }

    public final String component6() {
        return this.childLastName;
    }

    public final Long component7() {
        return this.childBirthDate;
    }

    public final Long component8() {
        return this.validationRequestId;
    }

    public final String component9() {
        return this.serviceId;
    }

    public final ApproveJuniorParams copy(String str, Long l, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6, String str7, String str8, String str9) {
        C41536l.m120489i(str, "customerId");
        String str10 = str2;
        C41536l.m120489i(str10, "phoneNumber");
        String str11 = str3;
        C41536l.m120489i(str11, "pin");
        String str12 = str5;
        C41536l.m120489i(str12, "childLastName");
        String str13 = str6;
        C41536l.m120489i(str13, IRetrofitService.SERVICE_ID);
        return new ApproveJuniorParams(str, l, str10, str11, str4, str12, l2, l3, str13, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproveJuniorParams)) {
            return false;
        }
        ApproveJuniorParams approveJuniorParams = (ApproveJuniorParams) obj;
        return C41536l.m120484d(this.customerId, approveJuniorParams.customerId) && C41536l.m120484d(this.childRequestId, approveJuniorParams.childRequestId) && C41536l.m120484d(this.phoneNumber, approveJuniorParams.phoneNumber) && C41536l.m120484d(this.pin, approveJuniorParams.pin) && C41536l.m120484d(this.childFirstName, approveJuniorParams.childFirstName) && C41536l.m120484d(this.childLastName, approveJuniorParams.childLastName) && C41536l.m120484d(this.childBirthDate, approveJuniorParams.childBirthDate) && C41536l.m120484d(this.validationRequestId, approveJuniorParams.validationRequestId) && C41536l.m120484d(this.serviceId, approveJuniorParams.serviceId) && C41536l.m120484d(this.operationId, approveJuniorParams.operationId) && C41536l.m120484d(this.operationReference, approveJuniorParams.operationReference) && C41536l.m120484d(this.scaAuthCode, approveJuniorParams.scaAuthCode);
    }

    public final Long getChildBirthDate() {
        return this.childBirthDate;
    }

    public final String getChildFirstName() {
        return this.childFirstName;
    }

    public final String getChildLastName() {
        return this.childLastName;
    }

    public final String getChildMobileNumber() {
        return this.childMobileNumber;
    }

    public final String getChildPhoneNumber() {
        return this.childPhoneNumber;
    }

    public final String getChildPin() {
        return this.childPin;
    }

    public final Long getChildRequestId() {
        return this.childRequestId;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPin() {
        return this.pin;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final Long getValidationRequestId() {
        return this.validationRequestId;
    }

    public int hashCode() {
        int hashCode = this.customerId.hashCode() * 31;
        Long l = this.childRequestId;
        int i = 0;
        int hashCode2 = (((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.phoneNumber.hashCode()) * 31) + this.pin.hashCode()) * 31;
        String str = this.childFirstName;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.childLastName.hashCode()) * 31;
        Long l2 = this.childBirthDate;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.validationRequestId;
        int hashCode5 = (((hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31) + this.serviceId.hashCode()) * 31;
        String str2 = this.operationId;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.operationReference;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scaAuthCode;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        String str = this.customerId;
        Long l = this.childRequestId;
        String str2 = this.phoneNumber;
        String str3 = this.pin;
        String str4 = this.childFirstName;
        String str5 = this.childLastName;
        Long l2 = this.childBirthDate;
        Long l3 = this.validationRequestId;
        String str6 = this.serviceId;
        String str7 = this.operationId;
        String str8 = this.operationReference;
        String str9 = this.scaAuthCode;
        return "ApproveJuniorParams(customerId=" + str + ", childRequestId=" + l + ", phoneNumber=" + str2 + ", pin=" + str3 + ", childFirstName=" + str4 + ", childLastName=" + str5 + ", childBirthDate=" + l2 + ", validationRequestId=" + l3 + ", serviceId=" + str6 + ", operationId=" + str7 + ", operationReference=" + str8 + ", scaAuthCode=" + str9 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApproveJuniorParams(String str, Long l, String str2, String str3, String str4, String str5, Long l2, Long l3, String str6, String str7, String str8, String str9) {
        super(str6, str7, str8, str9);
        C41536l.m120489i(str, "customerId");
        C41536l.m120489i(str2, "phoneNumber");
        C41536l.m120489i(str3, "pin");
        C41536l.m120489i(str5, "childLastName");
        C41536l.m120489i(str6, IRetrofitService.SERVICE_ID);
        this.customerId = str;
        this.childRequestId = l;
        this.phoneNumber = str2;
        this.pin = str3;
        this.childFirstName = str4;
        this.childLastName = str5;
        this.childBirthDate = l2;
        this.validationRequestId = l3;
        this.serviceId = str6;
        this.operationId = str7;
        this.operationReference = str8;
        this.scaAuthCode = str9;
        this.childPin = str3;
        this.childPhoneNumber = str2;
        this.childMobileNumber = str2;
    }
}
