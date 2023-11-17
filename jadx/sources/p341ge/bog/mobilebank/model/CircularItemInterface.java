package p341ge.bog.mobilebank.model;

import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateGroup;

/* renamed from: ge.bog.mobilebank.model.CircularItemInterface */
public class CircularItemInterface {
    private int imageId;
    private boolean isAddItem;
    private boolean isDD;
    private boolean isPeriodic;
    private boolean isPlus;
    private boolean isQr;
    private boolean isSumItem;
    private boolean isTransfer;
    private boolean isTransport;
    private PaymentProviderConfiguration paymentItem;
    private int searchItemType;
    private TemplateBasketItem templateBasketItem;
    private TemplateGroup templateGroup;
    private String title;
    private String transferType;

    public int getImageId() {
        return this.imageId;
    }

    public PaymentProviderConfiguration getPaymentItem() {
        return this.paymentItem;
    }

    public int getSearchItemType() {
        return this.searchItemType;
    }

    public TemplateBasketItem getTemplateBasketItem() {
        return this.templateBasketItem;
    }

    public TemplateGroup getTemplateGroup() {
        return this.templateGroup;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTransferType() {
        return this.transferType;
    }

    public boolean isAddItem() {
        return this.isAddItem;
    }

    public boolean isDD() {
        return this.isDD;
    }

    public boolean isPeriodic() {
        return this.isPeriodic;
    }

    public boolean isPlus() {
        return this.isPlus;
    }

    public boolean isQr() {
        return this.isQr;
    }

    public boolean isSumItem() {
        return this.isSumItem;
    }

    public boolean isTransfer() {
        return this.isTransfer;
    }

    public boolean isTransport() {
        return this.isTransport;
    }

    public void setAddItem(boolean z) {
        this.isAddItem = z;
    }

    public void setDD(boolean z) {
        this.isDD = z;
    }

    public void setImageId(int i) {
        this.imageId = i;
    }

    public void setPaymentItem(PaymentProviderConfiguration paymentProviderConfiguration) {
        this.paymentItem = paymentProviderConfiguration;
    }

    public void setPeriodic(boolean z) {
        this.isPeriodic = z;
    }

    public void setPlus(boolean z) {
        this.isPlus = z;
    }

    public void setQr(boolean z) {
        this.isQr = z;
    }

    public void setSearchItemType(int i) {
        this.searchItemType = i;
    }

    public void setSumItem(boolean z) {
        this.isSumItem = z;
    }

    public void setTemplateBasketItem(TemplateBasketItem templateBasketItem2) {
        this.templateBasketItem = templateBasketItem2;
    }

    public void setTemplateGroup(TemplateGroup templateGroup2) {
        this.templateGroup = templateGroup2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTransfer(boolean z) {
        this.isTransfer = z;
    }

    public void setTransferType(String str) {
        this.transferType = str;
    }

    public void setTransport(boolean z) {
        this.isTransport = z;
    }
}
