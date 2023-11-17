package p341ge.bog.mobilebank.cleanarch.data.products.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.products.entity.AccountSubAccountsApiEntity */
public final class AccountSubAccountsApiEntity {
    private final long acctKey;
    private final BigDecimal availableAmount;
    private final String ccy;
    private final boolean hasOverdraft;
    private final Long pfmAcctId;
    private final String printAcctNo;
    private final BigDecimal realAmount;

    public AccountSubAccountsApiEntity(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l) {
        C41536l.m120489i(str, "printAcctNo");
        C41536l.m120489i(bigDecimal, "availableAmount");
        C41536l.m120489i(str2, "ccy");
        this.acctKey = j;
        this.printAcctNo = str;
        this.availableAmount = bigDecimal;
        this.realAmount = bigDecimal2;
        this.ccy = str2;
        this.hasOverdraft = z;
        this.pfmAcctId = l;
    }

    public static /* synthetic */ AccountSubAccountsApiEntity copy$default(AccountSubAccountsApiEntity accountSubAccountsApiEntity, long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l, int i, Object obj) {
        AccountSubAccountsApiEntity accountSubAccountsApiEntity2 = accountSubAccountsApiEntity;
        return accountSubAccountsApiEntity.copy((i & 1) != 0 ? accountSubAccountsApiEntity2.acctKey : j, (i & 2) != 0 ? accountSubAccountsApiEntity2.printAcctNo : str, (i & 4) != 0 ? accountSubAccountsApiEntity2.availableAmount : bigDecimal, (i & 8) != 0 ? accountSubAccountsApiEntity2.realAmount : bigDecimal2, (i & 16) != 0 ? accountSubAccountsApiEntity2.ccy : str2, (i & 32) != 0 ? accountSubAccountsApiEntity2.hasOverdraft : z, (i & 64) != 0 ? accountSubAccountsApiEntity2.pfmAcctId : l);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final String component2() {
        return this.printAcctNo;
    }

    public final BigDecimal component3() {
        return this.availableAmount;
    }

    public final BigDecimal component4() {
        return this.realAmount;
    }

    public final String component5() {
        return this.ccy;
    }

    public final boolean component6() {
        return this.hasOverdraft;
    }

    public final Long component7() {
        return this.pfmAcctId;
    }

    public final AccountSubAccountsApiEntity copy(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l) {
        C41536l.m120489i(str, "printAcctNo");
        C41536l.m120489i(bigDecimal, "availableAmount");
        String str3 = str2;
        C41536l.m120489i(str3, "ccy");
        return new AccountSubAccountsApiEntity(j, str, bigDecimal, bigDecimal2, str3, z, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSubAccountsApiEntity)) {
            return false;
        }
        AccountSubAccountsApiEntity accountSubAccountsApiEntity = (AccountSubAccountsApiEntity) obj;
        return this.acctKey == accountSubAccountsApiEntity.acctKey && C41536l.m120484d(this.printAcctNo, accountSubAccountsApiEntity.printAcctNo) && C41536l.m120484d(this.availableAmount, accountSubAccountsApiEntity.availableAmount) && C41536l.m120484d(this.realAmount, accountSubAccountsApiEntity.realAmount) && C41536l.m120484d(this.ccy, accountSubAccountsApiEntity.ccy) && this.hasOverdraft == accountSubAccountsApiEntity.hasOverdraft && C41536l.m120484d(this.pfmAcctId, accountSubAccountsApiEntity.pfmAcctId);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final boolean getHasOverdraft() {
        return this.hasOverdraft;
    }

    public final Long getPfmAcctId() {
        return this.pfmAcctId;
    }

    public final String getPrintAcctNo() {
        return this.printAcctNo;
    }

    public final BigDecimal getRealAmount() {
        return this.realAmount;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.acctKey) * 31) + this.printAcctNo.hashCode()) * 31) + this.availableAmount.hashCode()) * 31;
        BigDecimal bigDecimal = this.realAmount;
        int i = 0;
        int hashCode = (((a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.ccy.hashCode()) * 31;
        boolean z = this.hasOverdraft;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Long l = this.pfmAcctId;
        if (l != null) {
            i = l.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        long j = this.acctKey;
        String str = this.printAcctNo;
        BigDecimal bigDecimal = this.availableAmount;
        BigDecimal bigDecimal2 = this.realAmount;
        String str2 = this.ccy;
        boolean z = this.hasOverdraft;
        Long l = this.pfmAcctId;
        return "AccountSubAccountsApiEntity(acctKey=" + j + ", printAcctNo=" + str + ", availableAmount=" + bigDecimal + ", realAmount=" + bigDecimal2 + ", ccy=" + str2 + ", hasOverdraft=" + z + ", pfmAcctId=" + l + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountSubAccountsApiEntity(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, bigDecimal, bigDecimal2, str2, z, (i & 64) != 0 ? null : l);
    }
}
