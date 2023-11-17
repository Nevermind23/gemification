package p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyConversionApiModel */
public final class MoneyConversionApiModel {
    private final BigDecimal dstAmount;
    private final BigDecimal rate;

    public MoneyConversionApiModel(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C41536l.m120489i(bigDecimal, "dstAmount");
        C41536l.m120489i(bigDecimal2, "rate");
        this.dstAmount = bigDecimal;
        this.rate = bigDecimal2;
    }

    public static /* synthetic */ MoneyConversionApiModel copy$default(MoneyConversionApiModel moneyConversionApiModel, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = moneyConversionApiModel.dstAmount;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = moneyConversionApiModel.rate;
        }
        return moneyConversionApiModel.copy(bigDecimal, bigDecimal2);
    }

    public final BigDecimal component1() {
        return this.dstAmount;
    }

    public final BigDecimal component2() {
        return this.rate;
    }

    public final MoneyConversionApiModel copy(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C41536l.m120489i(bigDecimal, "dstAmount");
        C41536l.m120489i(bigDecimal2, "rate");
        return new MoneyConversionApiModel(bigDecimal, bigDecimal2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyConversionApiModel)) {
            return false;
        }
        MoneyConversionApiModel moneyConversionApiModel = (MoneyConversionApiModel) obj;
        return C41536l.m120484d(this.dstAmount, moneyConversionApiModel.dstAmount) && C41536l.m120484d(this.rate, moneyConversionApiModel.rate);
    }

    public final BigDecimal getDstAmount() {
        return this.dstAmount;
    }

    public final BigDecimal getRate() {
        return this.rate;
    }

    public int hashCode() {
        return (this.dstAmount.hashCode() * 31) + this.rate.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.dstAmount;
        BigDecimal bigDecimal2 = this.rate;
        return "MoneyConversionApiModel(dstAmount=" + bigDecimal + ", rate=" + bigDecimal2 + ")";
    }
}
