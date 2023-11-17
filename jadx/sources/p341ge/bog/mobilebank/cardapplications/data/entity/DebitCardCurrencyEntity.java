package p341ge.bog.mobilebank.cardapplications.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cardapplications.data.entity.DebitCardCurrencyEntity */
public final class DebitCardCurrencyEntity {
    private final String ccy;
    private final long linkId;

    public DebitCardCurrencyEntity(String str, long j) {
        C41536l.m120489i(str, "ccy");
        this.ccy = str;
        this.linkId = j;
    }

    public static /* synthetic */ DebitCardCurrencyEntity copy$default(DebitCardCurrencyEntity debitCardCurrencyEntity, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = debitCardCurrencyEntity.ccy;
        }
        if ((i & 2) != 0) {
            j = debitCardCurrencyEntity.linkId;
        }
        return debitCardCurrencyEntity.copy(str, j);
    }

    public final String component1() {
        return this.ccy;
    }

    public final long component2() {
        return this.linkId;
    }

    public final DebitCardCurrencyEntity copy(String str, long j) {
        C41536l.m120489i(str, "ccy");
        return new DebitCardCurrencyEntity(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardCurrencyEntity)) {
            return false;
        }
        DebitCardCurrencyEntity debitCardCurrencyEntity = (DebitCardCurrencyEntity) obj;
        return C41536l.m120484d(this.ccy, debitCardCurrencyEntity.ccy) && this.linkId == debitCardCurrencyEntity.linkId;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public int hashCode() {
        return (this.ccy.hashCode() * 31) + C7397t.m28148a(this.linkId);
    }

    public String toString() {
        String str = this.ccy;
        long j = this.linkId;
        return "DebitCardCurrencyEntity(ccy=" + str + ", linkId=" + j + ")";
    }
}
