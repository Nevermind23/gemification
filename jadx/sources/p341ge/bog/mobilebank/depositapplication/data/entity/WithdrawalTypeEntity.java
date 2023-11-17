package p341ge.bog.mobilebank.depositapplication.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.depositapplication.data.entity.WithdrawalTypeEntity */
public final class WithdrawalTypeEntity {
    private final String dictionaryKey;
    private final Boolean hasInterestAccount;
    private final Boolean hasPrimaryAccount;
    private final String value;

    public WithdrawalTypeEntity(String str, String str2, Boolean bool, Boolean bool2) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.value = str;
        this.dictionaryKey = str2;
        this.hasPrimaryAccount = bool;
        this.hasInterestAccount = bool2;
    }

    public static /* synthetic */ WithdrawalTypeEntity copy$default(WithdrawalTypeEntity withdrawalTypeEntity, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawalTypeEntity.value;
        }
        if ((i & 2) != 0) {
            str2 = withdrawalTypeEntity.dictionaryKey;
        }
        if ((i & 4) != 0) {
            bool = withdrawalTypeEntity.hasPrimaryAccount;
        }
        if ((i & 8) != 0) {
            bool2 = withdrawalTypeEntity.hasInterestAccount;
        }
        return withdrawalTypeEntity.copy(str, str2, bool, bool2);
    }

    public final String component1() {
        return this.value;
    }

    public final String component2() {
        return this.dictionaryKey;
    }

    public final Boolean component3() {
        return this.hasPrimaryAccount;
    }

    public final Boolean component4() {
        return this.hasInterestAccount;
    }

    public final WithdrawalTypeEntity copy(String str, String str2, Boolean bool, Boolean bool2) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        return new WithdrawalTypeEntity(str, str2, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawalTypeEntity)) {
            return false;
        }
        WithdrawalTypeEntity withdrawalTypeEntity = (WithdrawalTypeEntity) obj;
        return C41536l.m120484d(this.value, withdrawalTypeEntity.value) && C41536l.m120484d(this.dictionaryKey, withdrawalTypeEntity.dictionaryKey) && C41536l.m120484d(this.hasPrimaryAccount, withdrawalTypeEntity.hasPrimaryAccount) && C41536l.m120484d(this.hasInterestAccount, withdrawalTypeEntity.hasInterestAccount);
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final Boolean getHasInterestAccount() {
        return this.hasInterestAccount;
    }

    public final Boolean getHasPrimaryAccount() {
        return this.hasPrimaryAccount;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        String str = this.dictionaryKey;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.hasPrimaryAccount;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasInterestAccount;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.value;
        String str2 = this.dictionaryKey;
        Boolean bool = this.hasPrimaryAccount;
        Boolean bool2 = this.hasInterestAccount;
        return "WithdrawalTypeEntity(value=" + str + ", dictionaryKey=" + str2 + ", hasPrimaryAccount=" + bool + ", hasInterestAccount=" + bool2 + ")";
    }
}
