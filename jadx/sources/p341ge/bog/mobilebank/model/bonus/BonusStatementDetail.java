package p341ge.bog.mobilebank.model.bonus;

import java.math.BigDecimal;
import p277ua.C8664c;
import p341ge.bog.mobilebank.model.AssetLiabListItemInterface;

/* renamed from: ge.bog.mobilebank.model.bonus.BonusStatementDetail */
public class BonusStatementDetail implements AssetLiabListItemInterface {
    @C8664c("addDate")
    private long addDate;
    @C8664c("amount")
    private BigDecimal amount;
    @C8664c("bonus")
    private BigDecimal bonus;
    @C8664c("bonusType")
    private String bonusType;
    @C8664c("cardLastFour")
    private String cardLastFour;
    @C8664c("ccy")
    private String ccy;
    @C8664c("clientKey")
    private long clientKey;
    @C8664c("commentDictionaryKey")
    private String commentDictionaryKey;
    @C8664c("commentKey")
    private String commentKey;
    @C8664c("entryComment")
    private String entryComment;
    @C8664c("generatedComment")
    private String generatedComment;
    @C8664c("id")

    /* renamed from: id */
    private String f81302id;
    @C8664c("langCode")
    private String langCode;
    @C8664c("prizeName")
    private String prizeName;
    @C8664c("prizeNo")
    private long prizeNo;
    @C8664c("productDictionaryKey")
    private String productDictionaryKey;
    @C8664c("rate")
    private BigDecimal rate;
    @C8664c("subProductGroup")
    private String subProductGroup;
    @C8664c("totalCount")
    private int totalCount;

    public long getAddDate() {
        return this.addDate;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getBonus() {
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

    public String getDescription() {
        return getCommentDictionaryKey();
    }

    public String getEntryComment() {
        return this.entryComment;
    }

    public String getGeneratedComment() {
        return this.generatedComment;
    }

    public String getHeader() {
        return "Date: " + getAddDate();
    }

    public String getId() {
        return this.f81302id;
    }

    public String getLeftAmount() {
        return getBonus() + "";
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean isCard() {
        return false;
    }

    public void setAddDate(long j) {
        this.addDate = j;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setBonus(BigDecimal bigDecimal) {
        this.bonus = bigDecimal;
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
        this.f81302id = str;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }

    public void setRate(BigDecimal bigDecimal) {
        this.rate = bigDecimal;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }
}
