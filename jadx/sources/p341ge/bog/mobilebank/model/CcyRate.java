package p341ge.bog.mobilebank.model;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.CcyRate */
public class CcyRate {
    private BigDecimal buyRate;
    private String ccy;
    private BigDecimal currentRate;
    private Boolean defaultCcy;
    private BigDecimal dgtlBuyRate;
    private BigDecimal dgtlSellRate;
    private String dictionaryKey;
    private BigDecimal difference;
    private BigDecimal midBuyRate;
    private BigDecimal midSellRate;
    private BigDecimal previousRate;
    private int rateWeight;
    private BigDecimal sellRate;

    public CcyRate() {
    }

    public BigDecimal getBuyRate() {
        return this.buyRate;
    }

    public String getCcy() {
        return this.ccy;
    }

    public BigDecimal getCurrentRate() {
        return this.currentRate;
    }

    public BigDecimal getDgtlBuyRate() {
        return this.dgtlBuyRate;
    }

    public BigDecimal getDgtlSellRate() {
        return this.dgtlSellRate;
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public BigDecimal getDifference() {
        return this.difference;
    }

    public BigDecimal getMidBuyRate() {
        return this.midBuyRate;
    }

    public BigDecimal getMidSellRate() {
        return this.midSellRate;
    }

    public int getRateWeight() {
        return this.rateWeight;
    }

    public BigDecimal getSellRate() {
        return this.sellRate;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setDgtlBuyRate(BigDecimal bigDecimal) {
        this.dgtlBuyRate = bigDecimal;
    }

    public void setDgtlSellRate(BigDecimal bigDecimal) {
        this.dgtlSellRate = bigDecimal;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setMidBuyRate(BigDecimal bigDecimal) {
        this.midBuyRate = bigDecimal;
    }

    public void setMidSellRate(BigDecimal bigDecimal) {
        this.midSellRate = bigDecimal;
    }

    public void setSellRate(BigDecimal bigDecimal) {
        this.sellRate = bigDecimal;
    }

    public String toString() {
        return this.ccy;
    }

    public CcyRate(String str) {
        this.ccy = str;
    }
}
