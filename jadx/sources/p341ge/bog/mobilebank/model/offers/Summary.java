package p341ge.bog.mobilebank.model.offers;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.parceler.Parcel;

@Parcel
@Keep
/* renamed from: ge.bog.mobilebank.model.offers.Summary */
public class Summary {
    String ccy;
    BigDecimal fullAmount;
    BigDecimal intAmount;
    BigDecimal priAmount;

    public String getCcy() {
        return this.ccy;
    }

    public BigDecimal getFullAmount() {
        return this.fullAmount;
    }

    public BigDecimal getIntAmount() {
        return this.intAmount;
    }

    public BigDecimal getPriAmount() {
        return this.priAmount;
    }
}
