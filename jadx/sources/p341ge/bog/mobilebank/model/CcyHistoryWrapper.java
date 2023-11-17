package p341ge.bog.mobilebank.model;

import androidx.collection.ArrayMap;
import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.CcyHistoryWrapper */
public class CcyHistoryWrapper {
    protected CcyRate[] ccy;
    protected ArrayMap<String, SimpleRate[]> rates;

    /* renamed from: ge.bog.mobilebank.model.CcyHistoryWrapper$SimpleRate */
    public class SimpleRate {
        private String date;
        private BigDecimal rate;

        public SimpleRate() {
        }

        public String getDate() {
            return this.date;
        }

        public BigDecimal getRate() {
            return this.rate;
        }

        public void setDate(String str) {
            this.date = str;
        }

        public void setRate(BigDecimal bigDecimal) {
            this.rate = bigDecimal;
        }
    }

    public CcyRate[] getCcy() {
        return this.ccy;
    }

    public ArrayMap<String, SimpleRate[]> getRates() {
        return this.rates;
    }

    public void setCcy(CcyRate[] ccyRateArr) {
        this.ccy = ccyRateArr;
    }

    public void setRates(ArrayMap<String, SimpleRate[]> arrayMap) {
        this.rates = arrayMap;
    }
}
