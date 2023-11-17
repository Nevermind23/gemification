package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.AccountReportIdApiModel */
public final class AccountReportIdApiModel {
    private final long acctKey;
    private final long reportId;

    public AccountReportIdApiModel(long j, long j2) {
        this.reportId = j;
        this.acctKey = j2;
    }

    public static /* synthetic */ AccountReportIdApiModel copy$default(AccountReportIdApiModel accountReportIdApiModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = accountReportIdApiModel.reportId;
        }
        if ((i & 2) != 0) {
            j2 = accountReportIdApiModel.acctKey;
        }
        return accountReportIdApiModel.copy(j, j2);
    }

    public final long component1() {
        return this.reportId;
    }

    public final long component2() {
        return this.acctKey;
    }

    public final AccountReportIdApiModel copy(long j, long j2) {
        return new AccountReportIdApiModel(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountReportIdApiModel)) {
            return false;
        }
        AccountReportIdApiModel accountReportIdApiModel = (AccountReportIdApiModel) obj;
        return this.reportId == accountReportIdApiModel.reportId && this.acctKey == accountReportIdApiModel.acctKey;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final long getReportId() {
        return this.reportId;
    }

    public int hashCode() {
        return (C7397t.m28148a(this.reportId) * 31) + C7397t.m28148a(this.acctKey);
    }

    public String toString() {
        long j = this.reportId;
        long j2 = this.acctKey;
        return "AccountReportIdApiModel(reportId=" + j + ", acctKey=" + j2 + ")";
    }
}
