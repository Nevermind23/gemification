package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.CalculateTradeDataApiModel */
public final class CalculateTradeDataApiModel {
    private final BigDecimal amount;
    private final String amountCurrency;
    private final BigDecimal fee;
    private final String feeCurrency;
    private final int opUniqueId;
    private final BigDecimal price;
    private final double quantity;

    public CalculateTradeDataApiModel(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, double d, int i, BigDecimal bigDecimal3) {
        C41536l.m120489i(bigDecimal2, "fee");
        C41536l.m120489i(bigDecimal3, "price");
        this.amount = bigDecimal;
        this.amountCurrency = str;
        this.fee = bigDecimal2;
        this.feeCurrency = str2;
        this.quantity = d;
        this.opUniqueId = i;
        this.price = bigDecimal3;
    }

    public static /* synthetic */ CalculateTradeDataApiModel copy$default(CalculateTradeDataApiModel calculateTradeDataApiModel, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, double d, int i, BigDecimal bigDecimal3, int i2, Object obj) {
        CalculateTradeDataApiModel calculateTradeDataApiModel2 = calculateTradeDataApiModel;
        return calculateTradeDataApiModel.copy((i2 & 1) != 0 ? calculateTradeDataApiModel2.amount : bigDecimal, (i2 & 2) != 0 ? calculateTradeDataApiModel2.amountCurrency : str, (i2 & 4) != 0 ? calculateTradeDataApiModel2.fee : bigDecimal2, (i2 & 8) != 0 ? calculateTradeDataApiModel2.feeCurrency : str2, (i2 & 16) != 0 ? calculateTradeDataApiModel2.quantity : d, (i2 & 32) != 0 ? calculateTradeDataApiModel2.opUniqueId : i, (i2 & 64) != 0 ? calculateTradeDataApiModel2.price : bigDecimal3);
    }

    public final BigDecimal component1() {
        return this.amount;
    }

    public final String component2() {
        return this.amountCurrency;
    }

    public final BigDecimal component3() {
        return this.fee;
    }

    public final String component4() {
        return this.feeCurrency;
    }

    public final double component5() {
        return this.quantity;
    }

    public final int component6() {
        return this.opUniqueId;
    }

    public final BigDecimal component7() {
        return this.price;
    }

    public final CalculateTradeDataApiModel copy(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, double d, int i, BigDecimal bigDecimal3) {
        C41536l.m120489i(bigDecimal2, "fee");
        BigDecimal bigDecimal4 = bigDecimal3;
        C41536l.m120489i(bigDecimal4, "price");
        return new CalculateTradeDataApiModel(bigDecimal, str, bigDecimal2, str2, d, i, bigDecimal4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculateTradeDataApiModel)) {
            return false;
        }
        CalculateTradeDataApiModel calculateTradeDataApiModel = (CalculateTradeDataApiModel) obj;
        return C41536l.m120484d(this.amount, calculateTradeDataApiModel.amount) && C41536l.m120484d(this.amountCurrency, calculateTradeDataApiModel.amountCurrency) && C41536l.m120484d(this.fee, calculateTradeDataApiModel.fee) && C41536l.m120484d(this.feeCurrency, calculateTradeDataApiModel.feeCurrency) && Double.compare(this.quantity, calculateTradeDataApiModel.quantity) == 0 && this.opUniqueId == calculateTradeDataApiModel.opUniqueId && C41536l.m120484d(this.price, calculateTradeDataApiModel.price);
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final String getAmountCurrency() {
        return this.amountCurrency;
    }

    public final BigDecimal getFee() {
        return this.fee;
    }

    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    public final int getOpUniqueId() {
        return this.opUniqueId;
    }

    public final BigDecimal getPrice() {
        return this.price;
    }

    public final double getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.amountCurrency;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.fee.hashCode()) * 31;
        String str2 = this.feeCurrency;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode2 + i) * 31) + Double.doubleToLongBits(this.quantity)) * 31) + this.opUniqueId) * 31) + this.price.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.amount;
        String str = this.amountCurrency;
        BigDecimal bigDecimal2 = this.fee;
        String str2 = this.feeCurrency;
        double d = this.quantity;
        int i = this.opUniqueId;
        BigDecimal bigDecimal3 = this.price;
        return "CalculateTradeDataApiModel(amount=" + bigDecimal + ", amountCurrency=" + str + ", fee=" + bigDecimal2 + ", feeCurrency=" + str2 + ", quantity=" + d + ", opUniqueId=" + i + ", price=" + bigDecimal3 + ")";
    }
}
