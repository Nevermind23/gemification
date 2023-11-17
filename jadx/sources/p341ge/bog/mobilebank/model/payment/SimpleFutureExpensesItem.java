package p341ge.bog.mobilebank.model.payment;

/* renamed from: ge.bog.mobilebank.model.payment.SimpleFutureExpensesItem */
public class SimpleFutureExpensesItem {
    String amountText;
    String detailText;
    String iconUrl;
    String title;

    public SimpleFutureExpensesItem(String str, String str2, String str3, String str4) {
        this.title = str;
        this.detailText = str2;
        this.amountText = str3;
        this.iconUrl = str4;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
