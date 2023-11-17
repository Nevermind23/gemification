package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.CashAgreement */
public class CashAgreement {
    private String ccy;

    /* renamed from: id */
    private long f81287id;
    private String note;
    private BigDecimal quantity;
    private BigDecimal sumAmountInNatCcy;

    public String getCcy() {
        return this.ccy;
    }

    public long getId() {
        return this.f81287id;
    }

    public String getNote() {
        return this.note;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setId(long j) {
        this.f81287id = j;
    }

    public void setQuantity(BigDecimal bigDecimal) {
        this.quantity = bigDecimal;
    }
}
