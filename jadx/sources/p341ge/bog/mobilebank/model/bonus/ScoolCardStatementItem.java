package p341ge.bog.mobilebank.model.bonus;

import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.bonus.ScoolCardStatementItem */
public class ScoolCardStatementItem {
    @C8664c("bonus")
    private int addBonus;
    private long addDate;
    private long cardId;
    private String comment;
    private String commentKey;
    private String entryCommentEn;
    private String entryCommentGe;

    /* renamed from: id */
    private String f81304id;

    public int getAddBonus() {
        return this.addBonus;
    }

    public long getAddDate() {
        return this.addDate;
    }

    public long getCardId() {
        return this.cardId;
    }

    public String getComment() {
        return this.comment;
    }

    public String getId() {
        return this.f81304id;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setId(String str) {
        this.f81304id = str;
    }
}
