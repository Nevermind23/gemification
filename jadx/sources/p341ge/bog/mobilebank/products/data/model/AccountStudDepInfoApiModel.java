package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountStudDepInfoApiModel */
public final class AccountStudDepInfoApiModel {
    private final BigDecimal amount;
    private final String ccy;
    private final Double intAccrued;
    private final Double intRate;
    private final String intWithPeriodType;
    private final String intWithPeriodTypeKey;
    private final Long maturityDate;

    public AccountStudDepInfoApiModel(BigDecimal bigDecimal, String str, Double d, Double d2, String str2, Long l, String str3) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.amount = bigDecimal;
        this.ccy = str;
        this.intAccrued = d;
        this.intRate = d2;
        this.intWithPeriodType = str2;
        this.maturityDate = l;
        this.intWithPeriodTypeKey = str3;
    }

    public static /* synthetic */ AccountStudDepInfoApiModel copy$default(AccountStudDepInfoApiModel accountStudDepInfoApiModel, BigDecimal bigDecimal, String str, Double d, Double d2, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = accountStudDepInfoApiModel.amount;
        }
        if ((i & 2) != 0) {
            str = accountStudDepInfoApiModel.ccy;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            d = accountStudDepInfoApiModel.intAccrued;
        }
        Double d3 = d;
        if ((i & 8) != 0) {
            d2 = accountStudDepInfoApiModel.intRate;
        }
        Double d4 = d2;
        if ((i & 16) != 0) {
            str2 = accountStudDepInfoApiModel.intWithPeriodType;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            l = accountStudDepInfoApiModel.maturityDate;
        }
        Long l2 = l;
        if ((i & 64) != 0) {
            str3 = accountStudDepInfoApiModel.intWithPeriodTypeKey;
        }
        return accountStudDepInfoApiModel.copy(bigDecimal, str4, d3, d4, str5, l2, str3);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.ccy;
    }

    public final Double component3() {
        return this.intAccrued;
    }

    public final Double component4() {
        return this.intRate;
    }

    public final String component5() {
        return this.intWithPeriodType;
    }

    public final Long component6() {
        return this.maturityDate;
    }

    public final String component7() {
        return this.intWithPeriodTypeKey;
    }

    public final AccountStudDepInfoApiModel copy(BigDecimal bigDecimal, String str, Double d, Double d2, String str2, Long l, String str3) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        return new AccountStudDepInfoApiModel(bigDecimal, str, d, d2, str2, l, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountStudDepInfoApiModel)) {
            return false;
        }
        AccountStudDepInfoApiModel accountStudDepInfoApiModel = (AccountStudDepInfoApiModel) obj;
        return C41536l.m120484d(this.amount, accountStudDepInfoApiModel.amount) && C41536l.m120484d(this.ccy, accountStudDepInfoApiModel.ccy) && C41536l.m120484d(this.intAccrued, accountStudDepInfoApiModel.intAccrued) && C41536l.m120484d(this.intRate, accountStudDepInfoApiModel.intRate) && C41536l.m120484d(this.intWithPeriodType, accountStudDepInfoApiModel.intWithPeriodType) && C41536l.m120484d(this.maturityDate, accountStudDepInfoApiModel.maturityDate) && C41536l.m120484d(this.intWithPeriodTypeKey, accountStudDepInfoApiModel.intWithPeriodTypeKey);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final Double getIntAccrued() {
        return this.intAccrued;
    }

    public final Double getIntRate() {
        return this.intRate;
    }

    public final String getIntWithPeriodType() {
        return this.intWithPeriodType;
    }

    public final String getIntWithPeriodTypeKey() {
        return this.intWithPeriodTypeKey;
    }

    public final Long getMaturityDate() {
        return this.maturityDate;
    }

    public int hashCode() {
        int hashCode = ((this.amount.hashCode() * 31) + this.ccy.hashCode()) * 31;
        Double d = this.intAccrued;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.intRate;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.intWithPeriodType;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.maturityDate;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.intWithPeriodTypeKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.ccy;
        Double d = this.intAccrued;
        Double d2 = this.intRate;
        String str2 = this.intWithPeriodType;
        Long l = this.maturityDate;
        String str3 = this.intWithPeriodTypeKey;
        return "AccountStudDepInfoApiModel(amount=" + bigDecimal + ", ccy=" + str + ", intAccrued=" + d + ", intRate=" + d2 + ", intWithPeriodType=" + str2 + ", maturityDate=" + l + ", intWithPeriodTypeKey=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountStudDepInfoApiModel(BigDecimal bigDecimal, String str, Double d, Double d2, String str2, Long l, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, str2, l, str3);
    }
}
