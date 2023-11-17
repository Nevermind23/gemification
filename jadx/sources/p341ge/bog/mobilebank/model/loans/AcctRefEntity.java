package p341ge.bog.mobilebank.model.loans;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.model.PensionStatusResult;

@Keep
/* renamed from: ge.bog.mobilebank.model.loans.AcctRefEntity */
public enum AcctRefEntity {
    PRIMARY_SIGNER(PensionStatusResult.STATUS_ACTIVE),
    COSIGNER("C");
    
    private final String value;

    private AcctRefEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
