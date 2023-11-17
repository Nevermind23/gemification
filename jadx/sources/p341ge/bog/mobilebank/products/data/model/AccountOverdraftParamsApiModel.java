package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountOverdraftParamsApiModel */
public final class AccountOverdraftParamsApiModel {
    private final long acctKey;
    private final Long endDate;
    private final String fileId;
    private final String fileUrl;
    private final Double intAccruedOverdraft;
    private final Double interestRate;
    private final BigDecimal overdraftLimit;
    private final Double unusedOverdraftLimit;

    public AccountOverdraftParamsApiModel(long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l, String str, String str2) {
        this.acctKey = j;
        this.overdraftLimit = bigDecimal;
        this.unusedOverdraftLimit = d;
        this.interestRate = d2;
        this.intAccruedOverdraft = d3;
        this.endDate = l;
        this.fileId = str;
        this.fileUrl = str2;
    }

    public static /* synthetic */ AccountOverdraftParamsApiModel copy$default(AccountOverdraftParamsApiModel accountOverdraftParamsApiModel, long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l, String str, String str2, int i, Object obj) {
        AccountOverdraftParamsApiModel accountOverdraftParamsApiModel2 = accountOverdraftParamsApiModel;
        int i2 = i;
        return accountOverdraftParamsApiModel.copy((i2 & 1) != 0 ? accountOverdraftParamsApiModel2.acctKey : j, (i2 & 2) != 0 ? accountOverdraftParamsApiModel2.overdraftLimit : bigDecimal, (i2 & 4) != 0 ? accountOverdraftParamsApiModel2.unusedOverdraftLimit : d, (i2 & 8) != 0 ? accountOverdraftParamsApiModel2.interestRate : d2, (i2 & 16) != 0 ? accountOverdraftParamsApiModel2.intAccruedOverdraft : d3, (i2 & 32) != 0 ? accountOverdraftParamsApiModel2.endDate : l, (i2 & 64) != 0 ? accountOverdraftParamsApiModel2.fileId : str, (i2 & 128) != 0 ? accountOverdraftParamsApiModel2.fileUrl : str2);
    }

    public final long component1() {
        return this.acctKey;
    }

    public final BigDecimal component2() {
        return this.overdraftLimit;
    }

    public final Double component3() {
        return this.unusedOverdraftLimit;
    }

    public final Double component4() {
        return this.interestRate;
    }

    public final Double component5() {
        return this.intAccruedOverdraft;
    }

    public final Long component6() {
        return this.endDate;
    }

    public final String component7() {
        return this.fileId;
    }

    public final String component8() {
        return this.fileUrl;
    }

    public final AccountOverdraftParamsApiModel copy(long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l, String str, String str2) {
        return new AccountOverdraftParamsApiModel(j, bigDecimal, d, d2, d3, l, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountOverdraftParamsApiModel)) {
            return false;
        }
        AccountOverdraftParamsApiModel accountOverdraftParamsApiModel = (AccountOverdraftParamsApiModel) obj;
        return this.acctKey == accountOverdraftParamsApiModel.acctKey && C41536l.m120484d(this.overdraftLimit, accountOverdraftParamsApiModel.overdraftLimit) && C41536l.m120484d(this.unusedOverdraftLimit, accountOverdraftParamsApiModel.unusedOverdraftLimit) && C41536l.m120484d(this.interestRate, accountOverdraftParamsApiModel.interestRate) && C41536l.m120484d(this.intAccruedOverdraft, accountOverdraftParamsApiModel.intAccruedOverdraft) && C41536l.m120484d(this.endDate, accountOverdraftParamsApiModel.endDate) && C41536l.m120484d(this.fileId, accountOverdraftParamsApiModel.fileId) && C41536l.m120484d(this.fileUrl, accountOverdraftParamsApiModel.fileUrl);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final Double getIntAccruedOverdraft() {
        return this.intAccruedOverdraft;
    }

    public final Double getInterestRate() {
        return this.interestRate;
    }

    public final BigDecimal getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public final Double getUnusedOverdraftLimit() {
        return this.unusedOverdraftLimit;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.acctKey) * 31;
        BigDecimal bigDecimal = this.overdraftLimit;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Double d = this.unusedOverdraftLimit;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.interestRate;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.intAccruedOverdraft;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l = this.endDate;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.fileId;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        long j = this.acctKey;
        BigDecimal bigDecimal = this.overdraftLimit;
        Double d = this.unusedOverdraftLimit;
        Double d2 = this.interestRate;
        Double d3 = this.intAccruedOverdraft;
        Long l = this.endDate;
        String str = this.fileId;
        String str2 = this.fileUrl;
        return "AccountOverdraftParamsApiModel(acctKey=" + j + ", overdraftLimit=" + bigDecimal + ", unusedOverdraftLimit=" + d + ", interestRate=" + d2 + ", intAccruedOverdraft=" + d3 + ", endDate=" + l + ", fileId=" + str + ", fileUrl=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountOverdraftParamsApiModel(long j, BigDecimal bigDecimal, Double d, Double d2, Double d3, Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, bigDecimal, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? null : l, str, str2);
    }
}
