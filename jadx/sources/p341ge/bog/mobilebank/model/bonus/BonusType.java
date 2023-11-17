package p341ge.bog.mobilebank.model.bonus;

import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: ge.bog.mobilebank.model.bonus.BonusType */
public enum BonusType {
    EXPRES("EXPRESS"),
    CASHBACK(ProductType.BONUS_PROD_TYPE_CASHBACK),
    AMEX("AMEX"),
    PLUS("PLUS");
    
    private String stringValue;

    private BonusType(String str) {
        this.stringValue = str;
    }

    public String getStringValue() {
        return this.stringValue;
    }
}
