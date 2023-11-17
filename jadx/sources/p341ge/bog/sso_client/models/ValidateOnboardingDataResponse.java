package p341ge.bog.sso_client.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.sso_client.models.ValidateOnboardingDataResponse */
public final class ValidateOnboardingDataResponse {
    private final boolean clientHasActualAddress;
    private final String customerId;
    private final String customerType;
    private final Integer errorCode;
    private final String errorKey;
    private final String scanResultBlob;

    public ValidateOnboardingDataResponse(String str, String str2, Integer num, String str3, boolean z, String str4) {
        this.customerId = str;
        this.customerType = str2;
        this.errorCode = num;
        this.errorKey = str3;
        this.clientHasActualAddress = z;
        this.scanResultBlob = str4;
    }

    public static /* synthetic */ ValidateOnboardingDataResponse copy$default(ValidateOnboardingDataResponse validateOnboardingDataResponse, String str, String str2, Integer num, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateOnboardingDataResponse.customerId;
        }
        if ((i & 2) != 0) {
            str2 = validateOnboardingDataResponse.customerType;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            num = validateOnboardingDataResponse.errorCode;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = validateOnboardingDataResponse.errorKey;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = validateOnboardingDataResponse.clientHasActualAddress;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = validateOnboardingDataResponse.scanResultBlob;
        }
        return validateOnboardingDataResponse.copy(str, str5, num2, str6, z2, str4);
    }

    public final String component1() {
        return this.customerId;
    }

    public final String component2() {
        return this.customerType;
    }

    public final Integer component3() {
        return this.errorCode;
    }

    public final String component4() {
        return this.errorKey;
    }

    public final boolean component5() {
        return this.clientHasActualAddress;
    }

    public final String component6() {
        return this.scanResultBlob;
    }

    public final ValidateOnboardingDataResponse copy(String str, String str2, Integer num, String str3, boolean z, String str4) {
        return new ValidateOnboardingDataResponse(str, str2, num, str3, z, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateOnboardingDataResponse)) {
            return false;
        }
        ValidateOnboardingDataResponse validateOnboardingDataResponse = (ValidateOnboardingDataResponse) obj;
        return C41536l.m120484d(this.customerId, validateOnboardingDataResponse.customerId) && C41536l.m120484d(this.customerType, validateOnboardingDataResponse.customerType) && C41536l.m120484d(this.errorCode, validateOnboardingDataResponse.errorCode) && C41536l.m120484d(this.errorKey, validateOnboardingDataResponse.errorKey) && this.clientHasActualAddress == validateOnboardingDataResponse.clientHasActualAddress && C41536l.m120484d(this.scanResultBlob, validateOnboardingDataResponse.scanResultBlob);
    }

    public final boolean getClientHasActualAddress() {
        return this.clientHasActualAddress;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getCustomerType() {
        return this.customerType;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorKey() {
        return this.errorKey;
    }

    public final String getScanResultBlob() {
        return this.scanResultBlob;
    }

    public int hashCode() {
        String str = this.customerId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customerType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.errorCode;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.errorKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.clientHasActualAddress;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str4 = this.scanResultBlob;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "ValidateOnboardingDataResponse(customerId=" + this.customerId + ", customerType=" + this.customerType + ", errorCode=" + this.errorCode + ", errorKey=" + this.errorKey + ", clientHasActualAddress=" + this.clientHasActualAddress + ", scanResultBlob=" + this.scanResultBlob + ')';
    }
}
