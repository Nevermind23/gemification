package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.CashInfoPair */
public final class CashInfoPair {
    private final BigDecimal cash;
    private final String utcTime;

    public CashInfoPair(String str, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "utcTime");
        C41536l.m120489i(bigDecimal, "cash");
        this.utcTime = str;
        this.cash = bigDecimal;
    }

    public static /* synthetic */ CashInfoPair copy$default(CashInfoPair cashInfoPair, String str, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cashInfoPair.utcTime;
        }
        if ((i & 2) != 0) {
            bigDecimal = cashInfoPair.cash;
        }
        return cashInfoPair.copy(str, bigDecimal);
    }

    public final String component1() {
        return this.utcTime;
    }

    public final BigDecimal component2() {
        return this.cash;
    }

    public final CashInfoPair copy(String str, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "utcTime");
        C41536l.m120489i(bigDecimal, "cash");
        return new CashInfoPair(str, bigDecimal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashInfoPair)) {
            return false;
        }
        CashInfoPair cashInfoPair = (CashInfoPair) obj;
        return C41536l.m120484d(this.utcTime, cashInfoPair.utcTime) && C41536l.m120484d(this.cash, cashInfoPair.cash);
    }

    public final BigDecimal getCash() {
        return this.cash;
    }

    public final String getUtcTime() {
        return this.utcTime;
    }

    public int hashCode() {
        return (this.utcTime.hashCode() * 31) + this.cash.hashCode();
    }

    public String toString() {
        String str = this.utcTime;
        BigDecimal bigDecimal = this.cash;
        return "CashInfoPair(utcTime=" + str + ", cash=" + bigDecimal + ")";
    }
}
