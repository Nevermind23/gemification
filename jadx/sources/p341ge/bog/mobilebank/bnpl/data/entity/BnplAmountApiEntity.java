package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplAmountApiEntity */
public final class BnplAmountApiEntity {
    private final double bcAmount;
    private final String ccy;

    public BnplAmountApiEntity(String str, double d) {
        C41536l.m120489i(str, "ccy");
        this.ccy = str;
        this.bcAmount = d;
    }

    public static /* synthetic */ BnplAmountApiEntity copy$default(BnplAmountApiEntity bnplAmountApiEntity, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bnplAmountApiEntity.ccy;
        }
        if ((i & 2) != 0) {
            d = bnplAmountApiEntity.bcAmount;
        }
        return bnplAmountApiEntity.copy(str, d);
    }

    public final String component1() {
        return this.ccy;
    }

    public final double component2() {
        return this.bcAmount;
    }

    public final BnplAmountApiEntity copy(String str, double d) {
        C41536l.m120489i(str, "ccy");
        return new BnplAmountApiEntity(str, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplAmountApiEntity)) {
            return false;
        }
        BnplAmountApiEntity bnplAmountApiEntity = (BnplAmountApiEntity) obj;
        return C41536l.m120484d(this.ccy, bnplAmountApiEntity.ccy) && Double.compare(this.bcAmount, bnplAmountApiEntity.bcAmount) == 0;
    }

    public final double getBcAmount() {
        return this.bcAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public int hashCode() {
        return (this.ccy.hashCode() * 31) + Double.doubleToLongBits(this.bcAmount);
    }

    public String toString() {
        String str = this.ccy;
        double d = this.bcAmount;
        return "BnplAmountApiEntity(ccy=" + str + ", bcAmount=" + d + ")";
    }
}
