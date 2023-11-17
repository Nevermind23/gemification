package p341ge.bog.mobilebank.model.offers;

import org.parceler.Parcel;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;

@Parcel
/* renamed from: ge.bog.mobilebank.model.offers.LoanOfferCard */
public class LoanOfferCard {
    long acctKey;
    String acctName;
    String acctNo;
    CardExternalFile cardExternalFile;
    long cardId;
    String cardName;
    String ccy;
    long clientKey;
    long expDate;

    /* renamed from: id */
    long f81341id;
    String lastFour;
    String nameDictionaryKey;
    String pan2;
    String productCode;
    String productDictionaryKey;
    String subProductCode;

    public long getAcctKey() {
        return this.acctKey;
    }

    public String getAcctName() {
        return this.acctName;
    }

    public String getAcctNo() {
        return this.acctNo;
    }

    public CardExternalFile getCardExternalFile() {
        return this.cardExternalFile;
    }

    public long getCardId() {
        return this.cardId;
    }

    public String getCardName() {
        return this.cardName;
    }

    public String getCcy() {
        return this.ccy;
    }

    public long getClientKey() {
        return this.clientKey;
    }

    public long getExpDate() {
        return this.expDate;
    }

    public long getId() {
        return this.f81341id;
    }

    public String getLastFour() {
        return this.lastFour;
    }

    public String getNameDictionaryKey() {
        return this.nameDictionaryKey;
    }

    public String getPan2() {
        return this.pan2;
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
}
