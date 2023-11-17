package p341ge.bog.mobilebank.deposits.data.entity.depositbreak;

import androidx.annotation.Keep;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakErrorTypeEntity */
public enum DepositBreakErrorTypeEntity {
    WARNING(BankApiResponse.CODE_STATUS_WARNING),
    ERROR("E"),
    SUCCESS("N");
    
    private final String value;

    private DepositBreakErrorTypeEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
