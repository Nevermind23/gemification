package p341ge.bog.mobilebank.model.credit;

import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import l50.C25838r;
import p341ge.bog.mobilebank.eventbus.events.CreditAccountOperationsEvent;
import p341ge.bog.mobilebank.model.CreditMRInsurance;
import p341ge.bog.mobilebank.model.account.ManageableAccount;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.model.credit.CreditCardAccount */
public class CreditCardAccount extends ManageableAccount {
    private ArrayList<C25838r> accountCreditCards = new ArrayList<>();
    public BigDecimal amount;
    public BigDecimal atmPercent;
    public String attachmentUrl;
    public BillInfo billInfo;
    public long cardId;
    public String cardPdfUrl;
    public String cardSubProduct;
    public ArrayList<String> cardSubProductGroupList;
    public String cardSubProductGroups;
    public ArrayList<String> cardTypeList;
    public String cardTypes;
    public String fileId;
    public String fileUrl;
    public boolean hasCashback;
    public boolean hasInstallment;
    public boolean hasMR;
    public ArrayList<CreditMRInsurance> mrInsurance;
    public String nameDictionaryKey;
    public CreditAccountOperationsEvent operationsEvent;
    public int orderNo;
    public BigDecimal overdraftLimit;
    public BigDecimal posPercent;
    public String productCode;
    public String productDictionaryKey;
    public ArrayList<String> productFunctions;
    public long productId;
    public ArrayList<String> widgetList;

    public ArrayList<C25838r> getAccountCreditCards() {
        return this.accountCreditCards;
    }

    public String getAccountTitle() {
        if (!TextUtils.isEmpty(getAcctName())) {
            return getAcctName();
        }
        return C27950a.m86286c(getProductDictionaryKey(), false);
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public BigDecimal getAtmPercent() {
        return this.atmPercent;
    }

    public String getAttachmentUrl() {
        return this.attachmentUrl;
    }

    public BillInfo getBillInfo() {
        return this.billInfo;
    }

    public long getCardId() {
        return this.cardId;
    }

    public String getCardPdfUrl() {
        ArrayList<C25838r> arrayList = this.accountCreditCards;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return this.accountCreditCards.get(0).mo64586k();
    }

    public ArrayList<CreditMRInsurance> getMrInsurance() {
        return this.mrInsurance;
    }

    public String getNameDictionaryKey() {
        return this.nameDictionaryKey;
    }

    public CreditAccountOperationsEvent getOperationsEvent() {
        return this.operationsEvent;
    }

    public BigDecimal getOverdraftLimit() {
        return this.overdraftLimit;
    }

    public BigDecimal getPosPercent() {
        return this.posPercent;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public ArrayList<String> getProductFunctions() {
        return this.productFunctions;
    }

    public long getProductId() {
        return this.productId;
    }

    public boolean isHasMR() {
        return this.hasMR;
    }

    public void setAccountCreditCards(ArrayList<C25838r> arrayList) {
        this.accountCreditCards = arrayList;
    }

    public void setAmount(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public void setAtmPercent(BigDecimal bigDecimal) {
        this.atmPercent = bigDecimal;
    }

    public void setBillInfo(BillInfo billInfo2) {
        this.billInfo = billInfo2;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setOperationsEvent(CreditAccountOperationsEvent creditAccountOperationsEvent) {
        this.operationsEvent = creditAccountOperationsEvent;
    }

    public void setOverdraftLimit(BigDecimal bigDecimal) {
        this.overdraftLimit = bigDecimal;
    }

    public void setPosPercent(BigDecimal bigDecimal) {
        this.posPercent = bigDecimal;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }
}
