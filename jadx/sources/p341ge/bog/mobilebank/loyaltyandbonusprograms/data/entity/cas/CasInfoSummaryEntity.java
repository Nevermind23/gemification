package p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.cas.CasInfoSummaryEntity */
public final class CasInfoSummaryEntity {
    private final String ccy;
    private final double totalAmount;
    private final Double totalAmountAcct;

    public CasInfoSummaryEntity(String str, double d, Double d2) {
        C41536l.m120489i(str, "ccy");
        this.ccy = str;
        this.totalAmount = d;
        this.totalAmountAcct = d2;
    }

    public static /* synthetic */ CasInfoSummaryEntity copy$default(CasInfoSummaryEntity casInfoSummaryEntity, String str, double d, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = casInfoSummaryEntity.ccy;
        }
        if ((i & 2) != 0) {
            d = casInfoSummaryEntity.totalAmount;
        }
        if ((i & 4) != 0) {
            d2 = casInfoSummaryEntity.totalAmountAcct;
        }
        return casInfoSummaryEntity.copy(str, d, d2);
    }

    public final String component1() {
        return this.ccy;
    }

    public final double component2() {
        return this.totalAmount;
    }

    public final Double component3() {
        return this.totalAmountAcct;
    }

    public final CasInfoSummaryEntity copy(String str, double d, Double d2) {
        C41536l.m120489i(str, "ccy");
        return new CasInfoSummaryEntity(str, d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasInfoSummaryEntity)) {
            return false;
        }
        CasInfoSummaryEntity casInfoSummaryEntity = (CasInfoSummaryEntity) obj;
        return C41536l.m120484d(this.ccy, casInfoSummaryEntity.ccy) && Double.compare(this.totalAmount, casInfoSummaryEntity.totalAmount) == 0 && C41536l.m120484d(this.totalAmountAcct, casInfoSummaryEntity.totalAmountAcct);
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final Double getTotalAmountAcct() {
        return this.totalAmountAcct;
    }

    public int hashCode() {
        int hashCode = ((this.ccy.hashCode() * 31) + Double.doubleToLongBits(this.totalAmount)) * 31;
        Double d = this.totalAmountAcct;
        return hashCode + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        String str = this.ccy;
        double d = this.totalAmount;
        Double d2 = this.totalAmountAcct;
        return "CasInfoSummaryEntity(ccy=" + str + ", totalAmount=" + d + ", totalAmountAcct=" + d2 + ")";
    }
}
