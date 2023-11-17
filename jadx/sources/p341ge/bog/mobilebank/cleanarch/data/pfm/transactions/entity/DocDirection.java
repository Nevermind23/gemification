package p341ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.pfm.transactions.entity.DocDirection */
public final class DocDirection {
    private final Double amount;
    private final String docDirection;

    public DocDirection() {
        this((String) null, (Double) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DocDirection copy$default(DocDirection docDirection2, String str, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = docDirection2.docDirection;
        }
        if ((i & 2) != 0) {
            d = docDirection2.amount;
        }
        return docDirection2.copy(str, d);
    }

    public final String component1() {
        return this.docDirection;
    }

    public final Double component2() {
        return this.amount;
    }

    public final DocDirection copy(String str, Double d) {
        return new DocDirection(str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocDirection)) {
            return false;
        }
        DocDirection docDirection2 = (DocDirection) obj;
        return C41536l.m120484d(this.docDirection, docDirection2.docDirection) && C41536l.m120484d(this.amount, docDirection2.amount);
    }

    public final Double getAmount() {
        return this.amount;
    }

    public final String getDocDirection() {
        return this.docDirection;
    }

    public int hashCode() {
        String str = this.docDirection;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.amount;
        if (d != null) {
            i = d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.docDirection;
        Double d = this.amount;
        return "DocDirection(docDirection=" + str + ", amount=" + d + ")";
    }

    public DocDirection(String str, Double d) {
        this.docDirection = str;
        this.amount = d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DocDirection(String str, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d);
    }
}
