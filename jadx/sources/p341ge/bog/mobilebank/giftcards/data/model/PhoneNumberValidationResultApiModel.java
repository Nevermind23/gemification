package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.PhoneNumberValidationResultApiModel */
public final class PhoneNumberValidationResultApiModel {
    private final Long clientKey;
    private final boolean isBankCustomer;
    private final String owner;
    private final int resultCode;
    private final String resultMessage;

    public PhoneNumberValidationResultApiModel(int i, String str, boolean z, String str2, Long l) {
        this.resultCode = i;
        this.resultMessage = str;
        this.isBankCustomer = z;
        this.owner = str2;
        this.clientKey = l;
    }

    public static /* synthetic */ PhoneNumberValidationResultApiModel copy$default(PhoneNumberValidationResultApiModel phoneNumberValidationResultApiModel, int i, String str, boolean z, String str2, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = phoneNumberValidationResultApiModel.resultCode;
        }
        if ((i2 & 2) != 0) {
            str = phoneNumberValidationResultApiModel.resultMessage;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            z = phoneNumberValidationResultApiModel.isBankCustomer;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            str2 = phoneNumberValidationResultApiModel.owner;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            l = phoneNumberValidationResultApiModel.clientKey;
        }
        return phoneNumberValidationResultApiModel.copy(i, str3, z2, str4, l);
    }

    public final int component1() {
        return this.resultCode;
    }

    public final String component2() {
        return this.resultMessage;
    }

    public final boolean component3() {
        return this.isBankCustomer;
    }

    public final String component4() {
        return this.owner;
    }

    public final Long component5() {
        return this.clientKey;
    }

    public final PhoneNumberValidationResultApiModel copy(int i, String str, boolean z, String str2, Long l) {
        return new PhoneNumberValidationResultApiModel(i, str, z, str2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumberValidationResultApiModel)) {
            return false;
        }
        PhoneNumberValidationResultApiModel phoneNumberValidationResultApiModel = (PhoneNumberValidationResultApiModel) obj;
        return this.resultCode == phoneNumberValidationResultApiModel.resultCode && C41536l.m120484d(this.resultMessage, phoneNumberValidationResultApiModel.resultMessage) && this.isBankCustomer == phoneNumberValidationResultApiModel.isBankCustomer && C41536l.m120484d(this.owner, phoneNumberValidationResultApiModel.owner) && C41536l.m120484d(this.clientKey, phoneNumberValidationResultApiModel.clientKey);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final String getResultMessage() {
        return this.resultMessage;
    }

    public int hashCode() {
        int i = this.resultCode * 31;
        String str = this.resultMessage;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isBankCustomer;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.owner;
        int hashCode2 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.clientKey;
        if (l != null) {
            i2 = l.hashCode();
        }
        return hashCode2 + i2;
    }

    public final boolean isBankCustomer() {
        return this.isBankCustomer;
    }

    public String toString() {
        int i = this.resultCode;
        String str = this.resultMessage;
        boolean z = this.isBankCustomer;
        String str2 = this.owner;
        Long l = this.clientKey;
        return "PhoneNumberValidationResultApiModel(resultCode=" + i + ", resultMessage=" + str + ", isBankCustomer=" + z + ", owner=" + str2 + ", clientKey=" + l + ")";
    }
}
