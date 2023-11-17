package p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationParams */
public final class PendingProductConfirmationParams extends OtpParams {
    private final boolean accept;
    private final String operationId;
    private final String operationReference;
    private final long responseDetId;
    private final String responseKey;
    private final String scaAuthCode;
    private final String serviceId;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PendingProductConfirmationParams(long r11, java.lang.String r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19 & 8
            if (r0 == 0) goto L_0x000d
            if (r14 == 0) goto L_0x0009
            java.lang.String r0 = "APPLICATIONS_RBS_PROCESS_RBS_RESPONSE"
            goto L_0x000b
        L_0x0009:
            java.lang.String r0 = "APPLICATIONS_RBS_REJECT_RESPONSE"
        L_0x000b:
            r6 = r0
            goto L_0x000e
        L_0x000d:
            r6 = r15
        L_0x000e:
            r0 = r19 & 16
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r7 = r1
            goto L_0x0017
        L_0x0015:
            r7 = r16
        L_0x0017:
            r0 = r19 & 32
            if (r0 == 0) goto L_0x001d
            r8 = r1
            goto L_0x001f
        L_0x001d:
            r8 = r17
        L_0x001f:
            r0 = r19 & 64
            if (r0 == 0) goto L_0x0025
            r9 = r1
            goto L_0x0027
        L_0x0025:
            r9 = r18
        L_0x0027:
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r14
            r1.<init>(r2, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationParams.<init>(long, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ PendingProductConfirmationParams copy$default(PendingProductConfirmationParams pendingProductConfirmationParams, long j, String str, boolean z, String str2, String str3, String str4, String str5, int i, Object obj) {
        PendingProductConfirmationParams pendingProductConfirmationParams2 = pendingProductConfirmationParams;
        return pendingProductConfirmationParams.copy((i & 1) != 0 ? pendingProductConfirmationParams2.responseDetId : j, (i & 2) != 0 ? pendingProductConfirmationParams2.responseKey : str, (i & 4) != 0 ? pendingProductConfirmationParams2.accept : z, (i & 8) != 0 ? pendingProductConfirmationParams2.serviceId : str2, (i & 16) != 0 ? pendingProductConfirmationParams2.operationId : str3, (i & 32) != 0 ? pendingProductConfirmationParams2.operationReference : str4, (i & 64) != 0 ? pendingProductConfirmationParams2.scaAuthCode : str5);
    }

    public final long component1() {
        return this.responseDetId;
    }

    public final String component2() {
        return this.responseKey;
    }

    public final boolean component3() {
        return this.accept;
    }

    public final String component4() {
        return this.serviceId;
    }

    public final String component5() {
        return this.operationId;
    }

    public final String component6() {
        return this.operationReference;
    }

    public final String component7() {
        return this.scaAuthCode;
    }

    public final PendingProductConfirmationParams copy(long j, String str, boolean z, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "responseKey");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        return new PendingProductConfirmationParams(j, str, z, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingProductConfirmationParams)) {
            return false;
        }
        PendingProductConfirmationParams pendingProductConfirmationParams = (PendingProductConfirmationParams) obj;
        return this.responseDetId == pendingProductConfirmationParams.responseDetId && C41536l.m120484d(this.responseKey, pendingProductConfirmationParams.responseKey) && this.accept == pendingProductConfirmationParams.accept && C41536l.m120484d(this.serviceId, pendingProductConfirmationParams.serviceId) && C41536l.m120484d(this.operationId, pendingProductConfirmationParams.operationId) && C41536l.m120484d(this.operationReference, pendingProductConfirmationParams.operationReference) && C41536l.m120484d(this.scaAuthCode, pendingProductConfirmationParams.scaAuthCode);
    }

    public final boolean getAccept() {
        return this.accept;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public final long getResponseDetId() {
        return this.responseDetId;
    }

    public final String getResponseKey() {
        return this.responseKey;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.responseDetId) * 31) + this.responseKey.hashCode()) * 31;
        boolean z = this.accept;
        if (z) {
            z = true;
        }
        int hashCode = (((a + (z ? 1 : 0)) * 31) + this.serviceId.hashCode()) * 31;
        String str = this.operationId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operationReference;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scaAuthCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.responseDetId;
        String str = this.responseKey;
        boolean z = this.accept;
        String str2 = this.serviceId;
        String str3 = this.operationId;
        String str4 = this.operationReference;
        String str5 = this.scaAuthCode;
        return "PendingProductConfirmationParams(responseDetId=" + j + ", responseKey=" + str + ", accept=" + z + ", serviceId=" + str2 + ", operationId=" + str3 + ", operationReference=" + str4 + ", scaAuthCode=" + str5 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingProductConfirmationParams(long j, String str, boolean z, String str2, String str3, String str4, String str5) {
        super(str2, str4, str5, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "responseKey");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.responseDetId = j;
        this.responseKey = str;
        this.accept = z;
        this.serviceId = str2;
        this.operationId = str3;
        this.operationReference = str4;
        this.scaAuthCode = str5;
    }
}
