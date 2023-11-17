package p341ge.bog.mobilebank.model.account;

import java.math.BigDecimal;

/* renamed from: ge.bog.mobilebank.model.account.ManageableAccount */
public class ManageableAccount {
    public long acctKey;
    public String acctName;
    public BigDecimal availableAmount;
    public String ccy;
    public String isDefault;
    public String isHidden;
    public String printAcctNo;
    public String productGroup;

    public long getAcctKey() {
        return this.acctKey;
    }

    public String getAcctName() {
        return this.acctName;
    }

    public BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public String getCcy() {
        return this.ccy;
    }

    public String getPrintAcctNo() {
        return this.printAcctNo;
    }

    public String getProductGroup() {
        return this.productGroup;
    }

    public boolean isDefault() {
        String str = this.isDefault;
        return str == null || str.equals("Y");
    }

    public boolean isHidden() {
        String str = this.isHidden;
        return str == null || str.equals("Y");
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }

    public void setAcctName(String str) {
        this.acctName = str;
    }

    public void setAvailableAmount(BigDecimal bigDecimal) {
        this.availableAmount = bigDecimal;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setDefault(boolean z) {
        String str;
        if (z) {
            str = "Y";
        } else {
            str = "N";
        }
        this.isDefault = str;
    }

    public void setHidden(boolean z) {
        String str;
        if (z) {
            str = "Y";
        } else {
            str = "N";
        }
        this.isHidden = str;
    }

    public void setPrintAcctNo(String str) {
        this.printAcctNo = str;
    }

    public void setProductGroup(String str) {
        this.productGroup = str;
    }
}
