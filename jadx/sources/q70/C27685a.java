package q70;

import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;

/* renamed from: q70.a */
public enum C27685a {
    ACC_TYPE_ACCOUNT("ACCOUNT"),
    ACC_TYPE_CREDIT_CARD("CREDITCARDACCOUNT"),
    ACC_TYPE_DEPOSIT("DEPOSIT"),
    ACC_TYPE_LOAN("LOAN"),
    ACC_TYPE_GT("G&T"),
    ACC_TYPE_PENSION("PENSION_FUND"),
    ACC_TYPE_CASHBACK(ProductType.BONUS_PROD_TYPE_CASHBACK),
    TYPE_EXPRES("EXPRES"),
    TYPE_EL_MONEY_BOX("EL_MONEY_BOX"),
    BONUS_TYPE_PLUS("PLUS"),
    BONUS_TYPE_SCOOL("SCOOLA"),
    BONUS_TYPE_MEMBREWARD("AMEX"),
    BONUS_TYPE_CASHBACK("AMEX_CASHBACK"),
    BONUS_TYPE_PRLO("PRLLOT"),
    TYPE_GTP_TRADING("GTP_TRADING"),
    PIGGY_BANK("EL_MONEY_BOX_ACCT"),
    BNPL("BNPL"),
    BONUS_PROD_TYPE_SCOOL(ProductType.BONUS_PROD_TYPE_SCOOL),
    BONUS_PROD_TYPE_MEMBREWARD(ProductType.BONUS_PROD_TYPE_MEMBREWARD),
    GIFT_CARD_OWNER("GIFTCARD_OWNER");
    

    /* renamed from: d */
    private final String f70798d;

    private C27685a(String str) {
        this.f70798d = str;
    }

    /* renamed from: b */
    public final String mo67221b() {
        return this.f70798d;
    }
}
