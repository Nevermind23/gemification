package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasStatementEntity */
public final class CasStatementEntity {
    private final Double amount;
    private final String ccy;
    private final long clientId;
    private final long clientKey;
    private final long runDate;
    private final int totalCount;
    private final int transactions;

    public CasStatementEntity(long j, long j2, long j3, Double d, String str, int i, int i2) {
        this.clientId = j;
        this.clientKey = j2;
        this.runDate = j3;
        this.amount = d;
        this.ccy = str;
        this.transactions = i;
        this.totalCount = i2;
    }

    public static /* synthetic */ CasStatementEntity copy$default(CasStatementEntity casStatementEntity, long j, long j2, long j3, Double d, String str, int i, int i2, int i3, Object obj) {
        CasStatementEntity casStatementEntity2 = casStatementEntity;
        return casStatementEntity.copy((i3 & 1) != 0 ? casStatementEntity2.clientId : j, (i3 & 2) != 0 ? casStatementEntity2.clientKey : j2, (i3 & 4) != 0 ? casStatementEntity2.runDate : j3, (i3 & 8) != 0 ? casStatementEntity2.amount : d, (i3 & 16) != 0 ? casStatementEntity2.ccy : str, (i3 & 32) != 0 ? casStatementEntity2.transactions : i, (i3 & 64) != 0 ? casStatementEntity2.totalCount : i2);
    }

    public final long component1() {
        return this.clientId;
    }

    public final long component2() {
        return this.clientKey;
    }

    public final long component3() {
        return this.runDate;
    }

    public final Double component4() {
        return this.amount;
    }

    public final String component5() {
        return this.ccy;
    }

    public final int component6() {
        return this.transactions;
    }

    public final int component7() {
        return this.totalCount;
    }

    public final CasStatementEntity copy(long j, long j2, long j3, Double d, String str, int i, int i2) {
        return new CasStatementEntity(j, j2, j3, d, str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasStatementEntity)) {
            return false;
        }
        CasStatementEntity casStatementEntity = (CasStatementEntity) obj;
        return this.clientId == casStatementEntity.clientId && this.clientKey == casStatementEntity.clientKey && this.runDate == casStatementEntity.runDate && C41536l.m120484d(this.amount, casStatementEntity.amount) && C41536l.m120484d(this.ccy, casStatementEntity.ccy) && this.transactions == casStatementEntity.transactions && this.totalCount == casStatementEntity.totalCount;
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientId() {
        return this.clientId;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getRunDate() {
        return this.runDate;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.clientId) * 31) + C7397t.m28148a(this.clientKey)) * 31) + C7397t.m28148a(this.runDate)) * 31;
        Double d = this.amount;
        int i = 0;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.ccy;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((hashCode + i) * 31) + this.transactions) * 31) + this.totalCount;
    }

    public String toString() {
        long j = this.clientId;
        long j2 = this.clientKey;
        long j3 = this.runDate;
        Double d = this.amount;
        String str = this.ccy;
        int i = this.transactions;
        int i2 = this.totalCount;
        return "CasStatementEntity(clientId=" + j + ", clientKey=" + j2 + ", runDate=" + j3 + ", amount=" + d + ", ccy=" + str + ", transactions=" + i + ", totalCount=" + i2 + ")";
    }
}
