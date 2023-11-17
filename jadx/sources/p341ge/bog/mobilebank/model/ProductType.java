package p341ge.bog.mobilebank.model;

/* renamed from: ge.bog.mobilebank.model.ProductType */
public class ProductType {
    public static final String ACC_TYPE_ACCOUNT = "ACCOUNT";
    public static final String ACC_TYPE_CREDIT_CARD = "CREDITCARDACCOUNT";
    public static final String ACC_TYPE_DEPOSIT = "DEPOSIT";
    public static final String ACC_TYPE_GT = "G&T";
    public static final String ACC_TYPE_GT_NEW = "GTP_TRADING";
    public static final String ACC_TYPE_LOAN = "LOAN";
    public static final String ACC_TYPE_PENSION = "PENSION_FUND";
    public static final String BONUS_TYPE_CASHBACK = "AMEX_CASHBACK";
    public static final String BONUS_TYPE_MEMBREWARD = "AMEX";
    public static final String BONUS_TYPE_PLUS = "PLUS";
    public static final String BONUS_TYPE_PRLO = "PRLLOT";
    public static final String BONUS_TYPE_SCOOL = "SCOOLA";
    private String clientKey;
    private String product;

    public String getClientKey() {
        return this.clientKey;
    }

    public String getProduct() {
        return this.product;
    }

    public void setClientKey(String str) {
        this.clientKey = str;
    }

    public void setProduct(String str) {
        this.product = str;
    }
}
