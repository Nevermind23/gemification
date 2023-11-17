package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplAmountSumEntity */
public final class BnplAmountSumEntity {
    private final double bcAmount;
    private final String ccy;
    private final int orderNo;

    public BnplAmountSumEntity(String str, double d, int i) {
        C41536l.m120489i(str, "ccy");
        this.ccy = str;
        this.bcAmount = d;
        this.orderNo = i;
    }

    public static /* synthetic */ BnplAmountSumEntity copy$default(BnplAmountSumEntity bnplAmountSumEntity, String str, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bnplAmountSumEntity.ccy;
        }
        if ((i2 & 2) != 0) {
            d = bnplAmountSumEntity.bcAmount;
        }
        if ((i2 & 4) != 0) {
            i = bnplAmountSumEntity.orderNo;
        }
        return bnplAmountSumEntity.copy(str, d, i);
    }

    public final String component1() {
        return this.ccy;
    }

    public final double component2() {
        return this.bcAmount;
    }

    public final int component3() {
        return this.orderNo;
    }

    public final BnplAmountSumEntity copy(String str, double d, int i) {
        C41536l.m120489i(str, "ccy");
        return new BnplAmountSumEntity(str, d, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplAmountSumEntity)) {
            return false;
        }
        BnplAmountSumEntity bnplAmountSumEntity = (BnplAmountSumEntity) obj;
        return C41536l.m120484d(this.ccy, bnplAmountSumEntity.ccy) && Double.compare(this.bcAmount, bnplAmountSumEntity.bcAmount) == 0 && this.orderNo == bnplAmountSumEntity.orderNo;
    }

    public final double getBcAmount() {
        return this.bcAmount;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final int getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        return (((this.ccy.hashCode() * 31) + Double.doubleToLongBits(this.bcAmount)) * 31) + this.orderNo;
    }

    public String toString() {
        String str = this.ccy;
        double d = this.bcAmount;
        int i = this.orderNo;
        return "BnplAmountSumEntity(ccy=" + str + ", bcAmount=" + d + ", orderNo=" + i + ")";
    }
}
