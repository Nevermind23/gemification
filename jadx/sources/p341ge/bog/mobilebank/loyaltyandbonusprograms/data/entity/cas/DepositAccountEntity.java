package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.DepositAccountEntity */
public final class DepositAccountEntity {
    private final long acctKey;
    private final String acctNo;
    private final double availableAmount;

    public DepositAccountEntity(long j, String str, double d) {
        C41536l.m120489i(str, "acctNo");
        this.acctKey = j;
        this.acctNo = str;
        this.availableAmount = d;
    }

    public static /* synthetic */ DepositAccountEntity copy$default(DepositAccountEntity depositAccountEntity, long j, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            j = depositAccountEntity.acctKey;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = depositAccountEntity.acctNo;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            d = depositAccountEntity.availableAmount;
        }
        return depositAccountEntity.copy(j2, str2, d);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final String component2() {
        return this.acctNo;
    }

    public final double component3() {
        return this.availableAmount;
    }

    public final DepositAccountEntity copy(long j, String str, double d) {
        C41536l.m120489i(str, "acctNo");
        return new DepositAccountEntity(j, str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositAccountEntity)) {
            return false;
        }
        DepositAccountEntity depositAccountEntity = (DepositAccountEntity) obj;
        return this.acctKey == depositAccountEntity.acctKey && C41536l.m120484d(this.acctNo, depositAccountEntity.acctNo) && Double.compare(this.availableAmount, depositAccountEntity.availableAmount) == 0;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final double getAvailableAmount() {
        return this.availableAmount;
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.acctKey) * 31) + this.acctNo.hashCode()) * 31) + Double.doubleToLongBits(this.availableAmount);
    }

    public String toString() {
        long j = this.acctKey;
        String str = this.acctNo;
        double d = this.availableAmount;
        return "DepositAccountEntity(acctKey=" + j + ", acctNo=" + str + ", availableAmount=" + d + ")";
    }
}
