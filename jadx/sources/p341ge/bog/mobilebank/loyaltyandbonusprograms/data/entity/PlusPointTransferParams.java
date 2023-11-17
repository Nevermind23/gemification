package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.PlusPointTransferParams */
public final class PlusPointTransferParams extends OtpParams {
    private final String comment;
    private final String operationId;
    private final String operationReference;
    private final String pin;
    private final String scaAuthCode;
    private final String serviceId;
    private final String transferPoints;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlusPointTransferParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? BankApi.BONUSES_TRANSFER_PLUS_POINTS : str7);
    }

    public static /* synthetic */ PlusPointTransferParams copy$default(PlusPointTransferParams plusPointTransferParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plusPointTransferParams.pin;
        }
        if ((i & 2) != 0) {
            str2 = plusPointTransferParams.transferPoints;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = plusPointTransferParams.comment;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = plusPointTransferParams.operationId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = plusPointTransferParams.operationReference;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = plusPointTransferParams.scaAuthCode;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = plusPointTransferParams.serviceId;
        }
        return plusPointTransferParams.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.pin;
    }

    public final String component2() {
        return this.transferPoints;
    }

    public final String component3() {
        return this.comment;
    }

    public final String component4() {
        return this.operationId;
    }

    public final String component5() {
        return this.operationReference;
    }

    public final String component6() {
        return this.scaAuthCode;
    }

    public final String component7() {
        return this.serviceId;
    }

    public final PlusPointTransferParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "pin");
        C41536l.m120489i(str2, "transferPoints");
        C41536l.m120489i(str3, "comment");
        String str8 = str7;
        C41536l.m120489i(str8, IRetrofitService.SERVICE_ID);
        return new PlusPointTransferParams(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlusPointTransferParams)) {
            return false;
        }
        PlusPointTransferParams plusPointTransferParams = (PlusPointTransferParams) obj;
        return C41536l.m120484d(this.pin, plusPointTransferParams.pin) && C41536l.m120484d(this.transferPoints, plusPointTransferParams.transferPoints) && C41536l.m120484d(this.comment, plusPointTransferParams.comment) && C41536l.m120484d(this.operationId, plusPointTransferParams.operationId) && C41536l.m120484d(this.operationReference, plusPointTransferParams.operationReference) && C41536l.m120484d(this.scaAuthCode, plusPointTransferParams.scaAuthCode) && C41536l.m120484d(this.serviceId, plusPointTransferParams.serviceId);
    }

    public final String getComment() {
        return this.comment;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
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

    public final String getTransferPoints() {
        return this.transferPoints;
    }

    public int hashCode() {
        int hashCode = ((((this.pin.hashCode() * 31) + this.transferPoints.hashCode()) * 31) + this.comment.hashCode()) * 31;
        String str = this.operationId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operationReference;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scaAuthCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.serviceId.hashCode();
    }

    public String toString() {
        String str = this.pin;
        String str2 = this.transferPoints;
        String str3 = this.comment;
        String str4 = this.operationId;
        String str5 = this.operationReference;
        String str6 = this.scaAuthCode;
        String str7 = this.serviceId;
        return "PlusPointTransferParams(pin=" + str + ", transferPoints=" + str2 + ", comment=" + str3 + ", operationId=" + str4 + ", operationReference=" + str5 + ", scaAuthCode=" + str6 + ", serviceId=" + str7 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlusPointTransferParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(str7, str4, str5, str6);
        C41536l.m120489i(str, "pin");
        C41536l.m120489i(str2, "transferPoints");
        C41536l.m120489i(str3, "comment");
        C41536l.m120489i(str7, IRetrofitService.SERVICE_ID);
        this.pin = str;
        this.transferPoints = str2;
        this.comment = str3;
        this.operationId = str4;
        this.operationReference = str5;
        this.scaAuthCode = str6;
        this.serviceId = str7;
    }
}
