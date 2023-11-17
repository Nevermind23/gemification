package p341ge.bog.mobilebank.model.cards;

import java.math.BigDecimal;
import java.util.GregorianCalendar;
import org.parceler.Parcel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

@Parcel
/* renamed from: ge.bog.mobilebank.model.cards.PaymentsCard */
public class PaymentsCard {
    private static final long DAY_LONG = 86400000;
    long acctKey;
    String acctName;
    BigDecimal availableAmount;
    String availableAmountBaseCcy;
    String cardClass;
    String cardData;
    long cardId;
    String cardName;
    String cardType;
    String ccy;
    String clientKey;
    String cvv;
    long expDate;
    String extMerchantId;

    /* renamed from: id */
    long f81307id;
    String isDefault;
    String isLocalCard;
    boolean isTemporary;
    String lastFour;
    String mainCur;
    String nameDictionaryKey;
    boolean newCard;
    String pan;
    String pan2;
    String paymentCardType;
    String productCode;
    String productDictionaryKey;
    boolean shouldSave;
    String subProductCode;
    String tempCleanDate;
    String tempExpDate;

    public long getAcctKey() {
        return this.acctKey;
    }

    public String getAcctName() {
        return this.acctName;
    }

    public BigDecimal getAvailableAmount() {
        return this.availableAmount;
    }

    public String getCardClass() {
        return this.cardClass;
    }

    public String getCardData() {
        return this.cardData;
    }

    public long getCardId() {
        return this.cardId;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getCcy() {
        return this.ccy;
    }

    public String getClientKey() {
        return this.clientKey;
    }

    public String getCvv() {
        return this.cvv;
    }

    public long getExpDate() {
        return this.expDate;
    }

    public String getExpDateStr(boolean z) {
        String str;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(getExpDate());
        int i = gregorianCalendar.get(2) + 1;
        int i2 = gregorianCalendar.get(1);
        String str2 = "";
        if (i < 10) {
            str = BankApiResponse.SUCCESSFUL_RESPONSE_CODE + i;
        } else {
            str = i + str2;
        }
        String substring = String.valueOf(i2).substring(2);
        Object[] objArr = new Object[3];
        objArr[0] = str;
        if (z) {
            str2 = " / ";
        }
        objArr[1] = str2;
        objArr[2] = substring;
        return String.format("%s%s%s", objArr);
    }

    public long getId() {
        return this.f81307id;
    }

    public String getIsDefault() {
        return this.isDefault;
    }

    public String getLastFour() {
        return this.lastFour;
    }

    public String getPan() {
        return this.pan;
    }

    public String getPan2() {
        return this.pan2;
    }

    public String getPaymentCardType() {
        return this.paymentCardType;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProductDictionaryKey() {
        return this.productDictionaryKey;
    }

    public String getSubProductCode() {
        return this.subProductCode;
    }

    public String getTempCleanDate() {
        return this.tempCleanDate;
    }

    public String getTempExpDate() {
        return this.tempExpDate;
    }

    public boolean isDefault() {
        return "Y".equals(this.isDefault);
    }

    public boolean isExternalCard() {
        return "EXTERNAL".equals(this.paymentCardType);
    }

    public boolean isLocalCard() {
        return this.isLocalCard.equals("Y");
    }

    public boolean isNewCard() {
        return this.newCard;
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

    public void setCardClass(String str) {
        this.cardClass = str;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setClientKey(String str) {
        this.clientKey = str;
    }

    public void setCvv(String str) {
        this.cvv = str;
    }

    public void setExpDate(long j) {
        this.expDate = j;
    }

    public void setId(long j) {
        this.f81307id = j;
    }

    public void setIsDefault(String str) {
        this.isDefault = str;
    }

    public void setIsLocalCard(String str) {
        this.isLocalCard = str;
    }

    public void setLastFour(String str) {
        this.lastFour = str;
    }

    public void setNewCard(boolean z) {
        this.newCard = z;
    }

    public void setPan(String str) {
        this.pan = str;
    }

    public void setPan2(String str) {
        this.pan2 = str;
    }

    public void setPaymentCardType(String str) {
        this.paymentCardType = str;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setProductDictionaryKey(String str) {
        this.productDictionaryKey = str;
    }

    public void setShouldSave(boolean z) {
        this.shouldSave = z;
    }

    public void setSubProductCode(String str) {
        this.subProductCode = str;
    }

    public void setTempCleanDate(String str) {
        this.tempCleanDate = str;
    }

    public void setTempExpDate(String str) {
        this.tempExpDate = str;
    }

    public boolean shouldSave() {
        return this.shouldSave;
    }
}
