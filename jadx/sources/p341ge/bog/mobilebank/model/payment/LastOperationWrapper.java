package p341ge.bog.mobilebank.model.payment;

import g91.C32299e;
import j81.C36768j;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import r90.C27950a;
import r90.C27954d;

/* renamed from: ge.bog.mobilebank.model.payment.LastOperationWrapper */
public class LastOperationWrapper implements C36768j {
    private LastOperation lastOperation;
    private String title;
    private TransferHistoryItem transferHistoryItem;

    public String getAmountBottomText() {
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(3:5|6|7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getAmountText() {
        /*
            r8 = this;
            java.lang.String r0 = "commission"
            java.lang.String r1 = "amount"
            ge.bog.mobilebank.model.payment.LastOperation r2 = r8.getLastOperation()
            r3 = 1
            if (r2 == 0) goto L_0x004d
            ge.bog.mobilebank.model.payment.LastOperation r2 = r8.getLastOperation()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r2 = r2.getValueByKey(r1)     // Catch:{ Exception -> 0x0040 }
            double r4 = java.lang.Double.parseDouble(r2)     // Catch:{ Exception -> 0x0040 }
            ge.bog.mobilebank.model.payment.LastOperation r2 = r8.getLastOperation()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r2 = r2.getValueByKey(r0)     // Catch:{ Exception -> 0x0040 }
            if (r2 == 0) goto L_0x0037
            ge.bog.mobilebank.model.payment.LastOperation r2 = r8.getLastOperation()     // Catch:{ Exception -> 0x0037 }
            java.lang.String r0 = r2.getValueByKey(r0)     // Catch:{ Exception -> 0x0037 }
            double r6 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x0037 }
            double r4 = r4 + r6
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r0 = g91.C32359z0.m95545P(r0, r3)     // Catch:{ Exception -> 0x0037 }
            return r0
        L_0x0037:
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0040 }
            java.lang.String r0 = g91.C32359z0.m95545P(r0, r3)     // Catch:{ Exception -> 0x0040 }
            return r0
        L_0x0040:
            ge.bog.mobilebank.model.payment.LastOperation r0 = r8.getLastOperation()
            java.lang.String r0 = r0.getValueByKey(r1)
            java.lang.String r0 = g91.C32359z0.m95545P(r0, r3)
            return r0
        L_0x004d:
            ge.bog.mobilebank.model.TransferHistoryItem r0 = r8.getTransferHistoryItem()
            if (r0 == 0) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r8.getTransferHistoryItem()
            java.math.BigDecimal r1 = r1.getAmount()
            double r1 = r1.doubleValue()
            java.lang.String r1 = g91.C32303f.m95204o(r1)
            r0.append(r1)
            ge.bog.mobilebank.model.TransferHistoryItem r1 = r8.getTransferHistoryItem()
            java.lang.String r1 = r1.getCcy()
            java.lang.String r1 = g91.C32303f.m95198i(r1, r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x007f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.model.payment.LastOperationWrapper.getAmountText():java.lang.String");
    }

    public String getBottomText() {
        if (getLastOperation() != null) {
            return this.lastOperation.getFullCategoryName();
        }
        if (getTransferHistoryItem() != null) {
            return this.transferHistoryItem.getFullCategoryName();
        }
        return null;
    }

    public int getCategoryColor() {
        LastOperation lastOperation2 = this.lastOperation;
        if (lastOperation2 != null && lastOperation2.getPfmCategory() != null) {
            return this.lastOperation.getPfmCategory().mo55081f();
        }
        TransferHistoryItem transferHistoryItem2 = this.transferHistoryItem;
        if (transferHistoryItem2 == null || transferHistoryItem2.getPfmCategory() == null) {
            return -1;
        }
        return this.transferHistoryItem.getPfmCategory().mo55081f();
    }

    public int getImageRes() {
        if (getTransferHistoryItem() != null) {
            return C32299e.m95164b(this.transferHistoryItem.getBenefBic());
        }
        return 0;
    }

    public String getImageText() {
        if (getTransferHistoryItem() != null) {
            return getTransferHistoryItem().getTransferInitials();
        }
        return null;
    }

    public String getImageUrl() {
        if (getLastOperation() != null) {
            return getLastOperation().getLogo();
        }
        if (getTransferHistoryItem() != null) {
            return getTransferHistoryItem().benefProfilePicture;
        }
        return null;
    }

    public LastOperation getLastOperation() {
        return this.lastOperation;
    }

    public String getMainText() {
        if (getLastOperation() != null) {
            return this.title;
        }
        if (getTransferHistoryItem() != null) {
            return getTransferHistoryItem().getDisplayName();
        }
        return null;
    }

    public Long getOperationTime() {
        if (getLastOperation() != null) {
            return getLastOperation().getPostDate();
        }
        if (getTransferHistoryItem() != null) {
            return Long.valueOf(getTransferHistoryItem().getOperationDate());
        }
        return null;
    }

    public TransferHistoryItem getTransferHistoryItem() {
        return this.transferHistoryItem;
    }

    public void setLastOperation(LastOperation lastOperation2, String str) {
        this.lastOperation = lastOperation2;
        for (PaymentProviderConfiguration paymentProviderConfiguration : C27954d.m86303i()) {
            if (lastOperation2.getServiceId() != null && lastOperation2.getServiceId().equals(paymentProviderConfiguration.getPaymentServiceId())) {
                this.title = C27950a.m86286c(paymentProviderConfiguration.getServiceName(), true);
                return;
            }
        }
        this.title = str;
    }

    public void setTransferHistoryItem(TransferHistoryItem transferHistoryItem2) {
        this.transferHistoryItem = transferHistoryItem2;
    }
}
