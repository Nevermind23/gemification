package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountSubAccountsApiModel */
public final class AccountSubAccountsApiModel {
    private final long acctKey;
    private final BigDecimal availableAmount;
    private final String ccy;
    private final boolean hasOverdraft;
    private final Long pfmAcctId;
    private final String printAcctNo;
    private final BigDecimal realAmount;

    public AccountSubAccountsApiModel(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l) {
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

    public static /* synthetic */ AccountSubAccountsApiModel copy$default(AccountSubAccountsApiModel accountSubAccountsApiModel, long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l, int i, Object obj) {
        AccountSubAccountsApiModel accountSubAccountsApiModel2 = accountSubAccountsApiModel;
        return accountSubAccountsApiModel.copy((i & 1) != 0 ? accountSubAccountsApiModel2.acctKey : j, (i & 2) != 0 ? accountSubAccountsApiModel2.printAcctNo : str, (i & 4) != 0 ? accountSubAccountsApiModel2.availableAmount : bigDecimal, (i & 8) != 0 ? accountSubAccountsApiModel2.realAmount : bigDecimal2, (i & 16) != 0 ? accountSubAccountsApiModel2.ccy : str2, (i & 32) != 0 ? accountSubAccountsApiModel2.hasOverdraft : z, (i & 64) != 0 ? accountSubAccountsApiModel2.pfmAcctId : l);
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

    public final AccountSubAccountsApiModel copy(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l) {
        C41536l.m120489i(str, "printAcctNo");
        C41536l.m120489i(bigDecimal, "availableAmount");
        String str3 = str2;
        C41536l.m120489i(str3, "ccy");
        return new AccountSubAccountsApiModel(j, str, bigDecimal, bigDecimal2, str3, z, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSubAccountsApiModel)) {
            return false;
        }
        AccountSubAccountsApiModel accountSubAccountsApiModel = (AccountSubAccountsApiModel) obj;
        return this.acctKey == accountSubAccountsApiModel.acctKey && C41536l.m120484d(this.printAcctNo, accountSubAccountsApiModel.printAcctNo) && C41536l.m120484d(this.availableAmount, accountSubAccountsApiModel.availableAmount) && C41536l.m120484d(this.realAmount, accountSubAccountsApiModel.realAmount) && C41536l.m120484d(this.ccy, accountSubAccountsApiModel.ccy) && this.hasOverdraft == accountSubAccountsApiModel.hasOverdraft && C41536l.m120484d(this.pfmAcctId, accountSubAccountsApiModel.pfmAcctId);
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
        return "AccountSubAccountsApiModel(acctKey=" + j + ", printAcctNo=" + str + ", availableAmount=" + bigDecimal + ", realAmount=" + bigDecimal2 + ", ccy=" + str2 + ", hasOverdraft=" + z + ", pfmAcctId=" + l + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountSubAccountsApiModel(long j, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str2, boolean z, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, bigDecimal, bigDecimal2, str2, z, (i & 64) != 0 ? null : l);
    }
}
