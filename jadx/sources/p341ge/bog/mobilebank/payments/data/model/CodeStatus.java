package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.CodeStatus */
public enum CodeStatus {
    SUCCESS(PensionStatusResult.STATUS_ACTIVE),
    PENDING(BankApiResponse.CODE_STATUS_WARNING),
    REJECTED("E");
    
    private final String value;

    private CodeStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
