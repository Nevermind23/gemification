package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.CasTotalEntity */
public final class CasTotalEntity {
    private final String ccy;
    private final long clientKey;
    private final BigDecimal totalAmount;

    public CasTotalEntity() {
        this(0, (String) null, (BigDecimal) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CasTotalEntity copy$default(CasTotalEntity casTotalEntity, long j, String str, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            j = casTotalEntity.clientKey;
        }
        if ((i & 2) != 0) {
            str = casTotalEntity.ccy;
        }
        if ((i & 4) != 0) {
            bigDecimal = casTotalEntity.totalAmount;
        }
        return casTotalEntity.copy(j, str, bigDecimal);
    }

    public final long component1() {
        return this.clientKey;
    }

    public final String component2() {
        return this.ccy;
    }

    public final BigDecimal component3() {
        return this.totalAmount;
    }

    public final CasTotalEntity copy(long j, String str, BigDecimal bigDecimal) {
        return new CasTotalEntity(j, str, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasTotalEntity)) {
            return false;
        }
        CasTotalEntity casTotalEntity = (CasTotalEntity) obj;
        return this.clientKey == casTotalEntity.clientKey && C41536l.m120484d(this.ccy, casTotalEntity.ccy) && C41536l.m120484d(this.totalAmount, casTotalEntity.totalAmount);
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.clientKey) * 31;
        String str = this.ccy;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalAmount;
        if (bigDecimal != null) {
            i = bigDecimal.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        long j = this.clientKey;
        String str = this.ccy;
        BigDecimal bigDecimal = this.totalAmount;
        return "CasTotalEntity(clientKey=" + j + ", ccy=" + str + ", totalAmount=" + bigDecimal + ")";
    }

    public CasTotalEntity(long j, String str, BigDecimal bigDecimal) {
        this.clientKey = j;
        this.ccy = str;
        this.totalAmount = bigDecimal;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CasTotalEntity(long j, String str, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bigDecimal);
    }
}
