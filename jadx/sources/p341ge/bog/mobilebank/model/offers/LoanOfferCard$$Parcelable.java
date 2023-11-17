package p341ge.bog.mobilebank.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;

/* renamed from: ge.bog.mobilebank.model.offers.LoanOfferCard$$Parcelable */
public class LoanOfferCard$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<LoanOfferCard$$Parcelable> CREATOR = new Parcelable.Creator<LoanOfferCard$$Parcelable>() {
        public LoanOfferCard$$Parcelable createFromParcel(Parcel parcel) {
            return new LoanOfferCard$$Parcelable(LoanOfferCard$$Parcelable.read(parcel, new C42027a()));
        }

        public LoanOfferCard$$Parcelable[] newArray(int i) {
            return new LoanOfferCard$$Parcelable[i];
        }
    };
    private LoanOfferCard loanOfferCard$$0;

    public LoanOfferCard$$Parcelable(LoanOfferCard loanOfferCard) {
        this.loanOfferCard$$0 = loanOfferCard;
    }

    public static LoanOfferCard read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            LoanOfferCard loanOfferCard = new LoanOfferCard();
            aVar.mo97501f(g, loanOfferCard);
            loanOfferCard.lastFour = parcel.readString();
            loanOfferCard.pan2 = parcel.readString();
            loanOfferCard.subProductCode = parcel.readString();
            loanOfferCard.cardName = parcel.readString();
            loanOfferCard.nameDictionaryKey = parcel.readString();
            loanOfferCard.productDictionaryKey = parcel.readString();
            loanOfferCard.acctName = parcel.readString();
            loanOfferCard.expDate = parcel.readLong();
            loanOfferCard.cardExternalFile = (CardExternalFile) parcel.readParcelable(LoanOfferCard$$Parcelable.class.getClassLoader());
            loanOfferCard.productCode = parcel.readString();
            loanOfferCard.acctNo = parcel.readString();
            loanOfferCard.clientKey = parcel.readLong();
            loanOfferCard.cardId = parcel.readLong();
            loanOfferCard.ccy = parcel.readString();
            loanOfferCard.acctKey = parcel.readLong();
            loanOfferCard.f81341id = parcel.readLong();
            aVar.mo97501f(readInt, loanOfferCard);
            return loanOfferCard;
        } else if (!aVar.mo97499d(readInt)) {
            return (LoanOfferCard) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(LoanOfferCard loanOfferCard, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(loanOfferCard);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(loanOfferCard));
        parcel.writeString(loanOfferCard.lastFour);
        parcel.writeString(loanOfferCard.pan2);
        parcel.writeString(loanOfferCard.subProductCode);
        parcel.writeString(loanOfferCard.cardName);
        parcel.writeString(loanOfferCard.nameDictionaryKey);
        parcel.writeString(loanOfferCard.productDictionaryKey);
        parcel.writeString(loanOfferCard.acctName);
        parcel.writeLong(loanOfferCard.expDate);
        parcel.writeParcelable(loanOfferCard.cardExternalFile, i);
        parcel.writeString(loanOfferCard.productCode);
        parcel.writeString(loanOfferCard.acctNo);
        parcel.writeLong(loanOfferCard.clientKey);
        parcel.writeLong(loanOfferCard.cardId);
        parcel.writeString(loanOfferCard.ccy);
        parcel.writeLong(loanOfferCard.acctKey);
        parcel.writeLong(loanOfferCard.f81341id);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.loanOfferCard$$0, parcel, i, new C42027a());
    }

    public LoanOfferCard getParcel() {
        return this.loanOfferCard$$0;
    }
}
