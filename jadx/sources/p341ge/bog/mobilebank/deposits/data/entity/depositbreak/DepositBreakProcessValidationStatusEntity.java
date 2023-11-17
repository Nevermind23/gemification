package p341ge.bog.mobilebank.deposits.data.entity.depositbreak;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakProcessValidationStatusEntity */
public enum DepositBreakProcessValidationStatusEntity {
    OKAY("Y"),
    WARNING(BankApiResponse.CODE_STATUS_WARNING);
    
    private final String status;

    private DepositBreakProcessValidationStatusEntity(String str) {
        this.status = str;
    }

    public final String getStatus() {
        return this.status;
    }
}
