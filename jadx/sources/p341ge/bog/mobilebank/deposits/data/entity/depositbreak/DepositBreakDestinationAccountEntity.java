package p341ge.bog.mobilebank.deposits.data.entity.depositbreak;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakDestinationAccountEntity */
public final class DepositBreakDestinationAccountEntity {
    private final String acctDesc;
    private final long acctKey;
    private final String acctNo;
    private final String ccy;
    private final long clientKey;

    public DepositBreakDestinationAccountEntity(long j, long j2, String str, String str2, String str3) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "acctNo");
        C41536l.m120489i(str3, "acctDesc");
        this.clientKey = j;
        this.acctKey = j2;
        this.ccy = str;
        this.acctNo = str2;
        this.acctDesc = str3;
    }

    public static /* synthetic */ DepositBreakDestinationAccountEntity copy$default(DepositBreakDestinationAccountEntity depositBreakDestinationAccountEntity, long j, long j2, String str, String str2, String str3, int i, Object obj) {
        DepositBreakDestinationAccountEntity depositBreakDestinationAccountEntity2 = depositBreakDestinationAccountEntity;
        return depositBreakDestinationAccountEntity.copy((i & 1) != 0 ? depositBreakDestinationAccountEntity2.clientKey : j, (i & 2) != 0 ? depositBreakDestinationAccountEntity2.acctKey : j2, (i & 4) != 0 ? depositBreakDestinationAccountEntity2.ccy : str, (i & 8) != 0 ? depositBreakDestinationAccountEntity2.acctNo : str2, (i & 16) != 0 ? depositBreakDestinationAccountEntity2.acctDesc : str3);
    }

    public final long component1() {
        return this.clientKey;
    }

    public final long component2() {
        return this.acctKey;
    }

    public final String component3() {
        return this.ccy;
    }

    public final String component4() {
        return this.acctNo;
    }

    public final String component5() {
        return this.acctDesc;
    }

    public final DepositBreakDestinationAccountEntity copy(long j, long j2, String str, String str2, String str3) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "acctNo");
        String str4 = str3;
        C41536l.m120489i(str4, "acctDesc");
        return new DepositBreakDestinationAccountEntity(j, j2, str, str2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositBreakDestinationAccountEntity)) {
            return false;
        }
        DepositBreakDestinationAccountEntity depositBreakDestinationAccountEntity = (DepositBreakDestinationAccountEntity) obj;
        return this.clientKey == depositBreakDestinationAccountEntity.clientKey && this.acctKey == depositBreakDestinationAccountEntity.acctKey && C41536l.m120484d(this.ccy, depositBreakDestinationAccountEntity.ccy) && C41536l.m120484d(this.acctNo, depositBreakDestinationAccountEntity.acctNo) && C41536l.m120484d(this.acctDesc, depositBreakDestinationAccountEntity.acctDesc);
    }

    public final String getAcctDesc() {
        return this.acctDesc;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public int hashCode() {
        return (((((((C7397t.m28148a(this.clientKey) * 31) + C7397t.m28148a(this.acctKey)) * 31) + this.ccy.hashCode()) * 31) + this.acctNo.hashCode()) * 31) + this.acctDesc.hashCode();
    }

    public String toString() {
        long j = this.clientKey;
        long j2 = this.acctKey;
        String str = this.ccy;
        String str2 = this.acctNo;
        String str3 = this.acctDesc;
        return "DepositBreakDestinationAccountEntity(clientKey=" + j + ", acctKey=" + j2 + ", ccy=" + str + ", acctNo=" + str2 + ", acctDesc=" + str3 + ")";
    }
}
