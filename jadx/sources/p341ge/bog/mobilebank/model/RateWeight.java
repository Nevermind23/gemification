package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.RateWeight */
public class RateWeight {
    String ccy1;
    String ccy2;
    BigDecimal rate;
    BigDecimal rateWeight;

    public String getCcy1() {
        return this.ccy1;
    }

    public String getCcy2() {
        return this.ccy2;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public BigDecimal getRateWeight() {
        return this.rateWeight;
    }

    public void setRate(BigDecimal bigDecimal) {
        this.rate = bigDecimal;
    }
}
