package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.FormOtpParams */
public final class FormOtpParams extends OtpParams {
    public static final C33626a Companion = new C33626a((DefaultConstructorMarker) null);
    public static final String PAYMENTS_PAY_SERVICE = "PAYMENTS_BATCH_EXECUTE_NEW";
    private final String executeParameters;
    private final String operationId;
    private final String operationReference;
    private final String scaAuthCode;
    private final String serviceId;
    private final long serviceOperationId;

    /* renamed from: ge.bog.mobilebank.payments.data.model.FormOtpParams$a */
    public static final class C33626a {
        private C33626a() {
        }

        public /* synthetic */ C33626a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormOtpParams(long j, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public static /* synthetic */ FormOtpParams copy$default(FormOtpParams formOtpParams, long j, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        FormOtpParams formOtpParams2 = formOtpParams;
        return formOtpParams.copy((i & 1) != 0 ? formOtpParams2.serviceOperationId : j, (i & 2) != 0 ? formOtpParams2.executeParameters : str, (i & 4) != 0 ? formOtpParams2.serviceId : str2, (i & 8) != 0 ? formOtpParams2.operationId : str3, (i & 16) != 0 ? formOtpParams2.operationReference : str4, (i & 32) != 0 ? formOtpParams2.scaAuthCode : str5);
    }

    public final long component1() {
        return this.serviceOperationId;
    }

    public final String component2() {
        return this.executeParameters;
    }

    public final String component3() {
        return this.serviceId;
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

    public final FormOtpParams copy(long j, String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "executeParameters");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        return new FormOtpParams(j, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormOtpParams)) {
            return false;
        }
        FormOtpParams formOtpParams = (FormOtpParams) obj;
        return this.serviceOperationId == formOtpParams.serviceOperationId && C41536l.m120484d(this.executeParameters, formOtpParams.executeParameters) && C41536l.m120484d(this.serviceId, formOtpParams.serviceId) && C41536l.m120484d(this.operationId, formOtpParams.operationId) && C41536l.m120484d(this.operationReference, formOtpParams.operationReference) && C41536l.m120484d(this.scaAuthCode, formOtpParams.scaAuthCode);
    }

    public final String getExecuteParameters() {
        return this.executeParameters;
    }

    public String getOperationId() {
        return this.operationId;
    }

    public String getOperationReference() {
        return this.operationReference;
    }

    public String getScaAuthCode() {
        return this.scaAuthCode;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public final long getServiceOperationId() {
        return this.serviceOperationId;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.serviceOperationId) * 31) + this.executeParameters.hashCode()) * 31) + this.serviceId.hashCode()) * 31;
        String str = this.operationId;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.operationReference;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scaAuthCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.serviceOperationId;
        String str = this.executeParameters;
        String str2 = this.serviceId;
        String str3 = this.operationId;
        String str4 = this.operationReference;
        String str5 = this.scaAuthCode;
        return "FormOtpParams(serviceOperationId=" + j + ", executeParameters=" + str + ", serviceId=" + str2 + ", operationId=" + str3 + ", operationReference=" + str4 + ", scaAuthCode=" + str5 + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FormOtpParams(long j, String str, String str2, String str3, String str4, String str5) {
        super(str2, str4, str5, (String) null, 8, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "executeParameters");
        C41536l.m120489i(str2, IRetrofitService.SERVICE_ID);
        this.serviceOperationId = j;
        this.executeParameters = str;
        this.serviceId = str2;
        this.operationId = str3;
        this.operationReference = str4;
        this.scaAuthCode = str5;
    }
}
