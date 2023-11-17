package p341ge.bog.mobilebank.model.payment;

/* renamed from: ge.bog.mobilebank.model.payment.BasketPaymentResultItem */
public class BasketPaymentResultItem {
    public static final int RESULT_TYPE_BIG_DIVIDER = 3;
    public static final int RESULT_TYPE_BUTTON = 2;
    public static final int RESULT_TYPE_HEADER = 0;
    public static final int RESULT_TYPE_ITEM = 1;
    private String amount;
    private String iconUrl;
    private boolean isFailed;
    private int itemType;
    private String title;

    public BasketPaymentResultItem() {
    }

    public String getAmount() {
        return this.amount;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public int getItemType() {
        return this.itemType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isFailed() {
        return this.isFailed;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public BasketPaymentResultItem(int i, String str, String str2, String str3, boolean z) {
        this.itemType = i;
        this.title = str;
        this.amount = str2;
        this.iconUrl = str3;
        this.isFailed = z;
    }
}
