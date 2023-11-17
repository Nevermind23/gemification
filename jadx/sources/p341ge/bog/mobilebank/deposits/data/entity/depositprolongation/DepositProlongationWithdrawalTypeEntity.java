package p341ge.bog.mobilebank.deposits.data.entity.depositprolongation;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositprolongation.DepositProlongationWithdrawalTypeEntity */
public final class DepositProlongationWithdrawalTypeEntity {
    private final String dictionaryKey;
    private final String value;

    public DepositProlongationWithdrawalTypeEntity(String str, String str2) {
        this.value = str;
        this.dictionaryKey = str2;
    }

    public static /* synthetic */ DepositProlongationWithdrawalTypeEntity copy$default(DepositProlongationWithdrawalTypeEntity depositProlongationWithdrawalTypeEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositProlongationWithdrawalTypeEntity.value;
        }
        if ((i & 2) != 0) {
            str2 = depositProlongationWithdrawalTypeEntity.dictionaryKey;
        }
        return depositProlongationWithdrawalTypeEntity.copy(str, str2);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.dictionaryKey;
    }

    public final DepositProlongationWithdrawalTypeEntity copy(String str, String str2) {
        return new DepositProlongationWithdrawalTypeEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositProlongationWithdrawalTypeEntity)) {
            return false;
        }
        DepositProlongationWithdrawalTypeEntity depositProlongationWithdrawalTypeEntity = (DepositProlongationWithdrawalTypeEntity) obj;
        return C41536l.m120484d(this.value, depositProlongationWithdrawalTypeEntity.value) && C41536l.m120484d(this.dictionaryKey, depositProlongationWithdrawalTypeEntity.dictionaryKey);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dictionaryKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.value;
        String str2 = this.dictionaryKey;
        return "DepositProlongationWithdrawalTypeEntity(value=" + str + ", dictionaryKey=" + str2 + ")";
    }
}
