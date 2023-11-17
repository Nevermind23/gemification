package p341ge.bog.mobilebank.model.bonus;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.bonus.BonusStatementItem */
public class BonusStatementItem {
    private long addDate;
    private BigDecimal amount;
    private long bonus;
    private String bonusType;
    private String cardLastFour;
    private String ccy;
    private long clientKey;
    private String commentDictionaryKey;
    private String commentKey;
    private String entryComment;
    private String generatedComment;

    /* renamed from: id */
    private String f81303id;
    private String langCode;
    private String prizeName;
    private String prizeNo;
    private String productDictionaryKey;
    private double rate;
    private String subProductGroup;
    private int totalCount;

    public long getAddDate() {
        return this.addDate;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public long getBonus() {
        return this.bonus;
    }

    public String getBonusType() {
        return this.bonusType;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public String getCommentDictionaryKey() {
        return this.commentDictionaryKey;
    }

    public String getGeneratedComment() {
        return this.generatedComment;
    }

    public String getId() {
        return this.f81303id;
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public double getRate() {
        return this.rate;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setBonus(long j) {
        this.bonus = j;
    }

    public void setBonusType(String str) {
        this.bonusType = str;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setClientKey(long j) {
        this.clientKey = j;
    }

    public void setId(String str) {
        this.f81303id = str;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }

    public void setRate(double d) {
        this.rate = d;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }
}
