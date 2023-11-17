package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.CardDebitAccount$$Parcelable */
public class CardDebitAccount$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<CardDebitAccount$$Parcelable> CREATOR = new Parcelable.Creator<CardDebitAccount$$Parcelable>() {
        public CardDebitAccount$$Parcelable createFromParcel(Parcel parcel) {
            return new CardDebitAccount$$Parcelable(CardDebitAccount$$Parcelable.read(parcel, new C42027a()));
        }

        public CardDebitAccount$$Parcelable[] newArray(int i) {
            return new CardDebitAccount$$Parcelable[i];
        }
    };
    private CardDebitAccount cardDebitAccount$$0;

    public CardDebitAccount$$Parcelable(CardDebitAccount cardDebitAccount) {
        this.cardDebitAccount$$0 = cardDebitAccount;
    }

    public static CardDebitAccount read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            CardDebitAccount cardDebitAccount = new CardDebitAccount();
            aVar.mo97501f(g, cardDebitAccount);
            cardDebitAccount.acctNo = parcel.readString();
            cardDebitAccount.ccy = parcel.readString();
            cardDebitAccount.acctKey = parcel.readLong();
            cardDebitAccount.acctDesc = parcel.readString();
            cardDebitAccount.acctName = parcel.readString();
            aVar.mo97501f(readInt, cardDebitAccount);
            return cardDebitAccount;
        } else if (!aVar.mo97499d(readInt)) {
            return (CardDebitAccount) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(CardDebitAccount cardDebitAccount, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(cardDebitAccount);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(cardDebitAccount));
        parcel.writeString(cardDebitAccount.acctNo);
        parcel.writeString(cardDebitAccount.ccy);
        parcel.writeLong(cardDebitAccount.acctKey);
        parcel.writeString(cardDebitAccount.acctDesc);
        parcel.writeString(cardDebitAccount.acctName);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.cardDebitAccount$$0, parcel, i, new C42027a());
    }

    public CardDebitAccount getParcel() {
        return this.cardDebitAccount$$0;
    }
}
