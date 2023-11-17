package p341ge.bog.mobilebank.cleanarch.data.transferaccounts.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.data.transferaccounts.entity.TransferCurrencyItemApiEntity */
public final class TransferCurrencyItemApiEntity {
    private final String ccy;
    private final String ccyDictionaryKey;
    private final int orderId;
    private final BigDecimal rate;
    private final BigDecimal rateDisplay;
    private final BigDecimal remittanceRate;
    private final BigDecimal remittanceRateDisplay;
    private final BigDecimal totalAmount;

    public TransferCurrencyItemApiEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2, int i) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(bigDecimal5, "totalAmount");
        C41536l.m120489i(str2, "ccyDictionaryKey");
        this.ccy = str;
        this.rate = bigDecimal;
        this.remittanceRate = bigDecimal2;
        this.rateDisplay = bigDecimal3;
        this.remittanceRateDisplay = bigDecimal4;
        this.totalAmount = bigDecimal5;
        this.ccyDictionaryKey = str2;
        this.orderId = i;
    }

    public static /* synthetic */ TransferCurrencyItemApiEntity copy$default(TransferCurrencyItemApiEntity transferCurrencyItemApiEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2, int i, int i2, Object obj) {
        TransferCurrencyItemApiEntity transferCurrencyItemApiEntity2 = transferCurrencyItemApiEntity;
        int i3 = i2;
        return transferCurrencyItemApiEntity.copy((i3 & 1) != 0 ? transferCurrencyItemApiEntity2.ccy : str, (i3 & 2) != 0 ? transferCurrencyItemApiEntity2.rate : bigDecimal, (i3 & 4) != 0 ? transferCurrencyItemApiEntity2.remittanceRate : bigDecimal2, (i3 & 8) != 0 ? transferCurrencyItemApiEntity2.rateDisplay : bigDecimal3, (i3 & 16) != 0 ? transferCurrencyItemApiEntity2.remittanceRateDisplay : bigDecimal4, (i3 & 32) != 0 ? transferCurrencyItemApiEntity2.totalAmount : bigDecimal5, (i3 & 64) != 0 ? transferCurrencyItemApiEntity2.ccyDictionaryKey : str2, (i3 & 128) != 0 ? transferCurrencyItemApiEntity2.orderId : i);
    }

    public final String component1() {
        return this.ccy;
    }

    public final BigDecimal component2() {
        return this.rate;
    }

    public final BigDecimal component3() {
        return this.remittanceRate;
    }

    public final BigDecimal component4() {
        return this.rateDisplay;
    }

    public final BigDecimal component5() {
        return this.remittanceRateDisplay;
    }

    public final BigDecimal component6() {
        return this.totalAmount;
    }

    public final String component7() {
        return this.ccyDictionaryKey;
    }

    public final int component8() {
        return this.orderId;
    }

    public final TransferCurrencyItemApiEntity copy(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str2, int i) {
        C41536l.m120489i(str, "ccy");
        BigDecimal bigDecimal6 = bigDecimal5;
        C41536l.m120489i(bigDecimal6, "totalAmount");
        String str3 = str2;
        C41536l.m120489i(str3, "ccyDictionaryKey");
        return new TransferCurrencyItemApiEntity(str, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal6, str3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferCurrencyItemApiEntity)) {
            return false;
        }
        TransferCurrencyItemApiEntity transferCurrencyItemApiEntity = (TransferCurrencyItemApiEntity) obj;
        return C41536l.m120484d(this.ccy, transferCurrencyItemApiEntity.ccy) && C41536l.m120484d(this.rate, transferCurrencyItemApiEntity.rate) && C41536l.m120484d(this.remittanceRate, transferCurrencyItemApiEntity.remittanceRate) && C41536l.m120484d(this.rateDisplay, transferCurrencyItemApiEntity.rateDisplay) && C41536l.m120484d(this.remittanceRateDisplay, transferCurrencyItemApiEntity.remittanceRateDisplay) && C41536l.m120484d(this.totalAmount, transferCurrencyItemApiEntity.totalAmount) && C41536l.m120484d(this.ccyDictionaryKey, transferCurrencyItemApiEntity.ccyDictionaryKey) && this.orderId == transferCurrencyItemApiEntity.orderId;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final String getCcyDictionaryKey() {
        return this.ccyDictionaryKey;
    }

    public final int getOrderId() {
        return this.orderId;
    }

    public final BigDecimal getRate() {
        return this.rate;
    }

    public final BigDecimal getRateDisplay() {
        return this.rateDisplay;
    }

    public final BigDecimal getRemittanceRate() {
        return this.remittanceRate;
    }

    public final BigDecimal getRemittanceRateDisplay() {
        return this.remittanceRateDisplay;
    }

    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        int hashCode = this.ccy.hashCode() * 31;
        BigDecimal bigDecimal = this.rate;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.remittanceRate;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.rateDisplay;
        int hashCode4 = (hashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.remittanceRateDisplay;
        if (bigDecimal4 != null) {
            i = bigDecimal4.hashCode();
        }
        return ((((((hashCode4 + i) * 31) + this.totalAmount.hashCode()) * 31) + this.ccyDictionaryKey.hashCode()) * 31) + this.orderId;
    }

    public String toString() {
        String str = this.ccy;
        BigDecimal bigDecimal = this.rate;
        BigDecimal bigDecimal2 = this.remittanceRate;
        BigDecimal bigDecimal3 = this.rateDisplay;
        BigDecimal bigDecimal4 = this.remittanceRateDisplay;
        BigDecimal bigDecimal5 = this.totalAmount;
        String str2 = this.ccyDictionaryKey;
        int i = this.orderId;
        return "TransferCurrencyItemApiEntity(ccy=" + str + ", rate=" + bigDecimal + ", remittanceRate=" + bigDecimal2 + ", rateDisplay=" + bigDecimal3 + ", remittanceRateDisplay=" + bigDecimal4 + ", totalAmount=" + bigDecimal5 + ", ccyDictionaryKey=" + str2 + ", orderId=" + i + ")";
    }
}
