package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.CardDebitDetails$$Parcelable */
public class CardDebitDetails$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<CardDebitDetails$$Parcelable> CREATOR = new Parcelable.Creator<CardDebitDetails$$Parcelable>() {
        public CardDebitDetails$$Parcelable createFromParcel(Parcel parcel) {
            return new CardDebitDetails$$Parcelable(CardDebitDetails$$Parcelable.read(parcel, new C42027a()));
        }

        public CardDebitDetails$$Parcelable[] newArray(int i) {
            return new CardDebitDetails$$Parcelable[i];
        }
    };
    private CardDebitDetails cardDebitDetails$$0;

    public CardDebitDetails$$Parcelable(CardDebitDetails cardDebitDetails) {
        this.cardDebitDetails$$0 = cardDebitDetails;
    }

    public static CardDebitDetails read(Parcel parcel, C42027a aVar) {
        ArrayList<CardDebitAccount> arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            CardDebitDetails cardDebitDetails = new CardDebitDetails();
            aVar.mo97501f(g, cardDebitDetails);
            cardDebitDetails.dictionaryKey = parcel.readString();
            cardDebitDetails.creditCardAcctKey = parcel.readLong();
            cardDebitDetails.creditCardAcctNo = parcel.readString();
            cardDebitDetails.closeDate = parcel.readLong();
            cardDebitDetails.phoneNumber = parcel.readString();
            cardDebitDetails.clientKey = parcel.readLong();
            cardDebitDetails.acctKey1 = parcel.readLong();
            cardDebitDetails.acctKey2 = parcel.readLong();
            cardDebitDetails.acctKey = parcel.readLong();
            cardDebitDetails.f81311id = parcel.readLong();
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList<CardDebitAccount> arrayList2 = new ArrayList<>(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add(CardDebitAccount$$Parcelable.read(parcel, aVar));
                }
                arrayList = arrayList2;
            }
            cardDebitDetails.accounts = arrayList;
            cardDebitDetails.openDate = parcel.readLong();
            cardDebitDetails.billPayName = parcel.readString();
            cardDebitDetails.status = parcel.readString();
            aVar.mo97501f(readInt, cardDebitDetails);
            return cardDebitDetails;
        } else if (!aVar.mo97499d(readInt)) {
            return (CardDebitDetails) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(CardDebitDetails cardDebitDetails, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(cardDebitDetails);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(cardDebitDetails));
        parcel.writeString(cardDebitDetails.dictionaryKey);
        parcel.writeLong(cardDebitDetails.creditCardAcctKey);
        parcel.writeString(cardDebitDetails.creditCardAcctNo);
        parcel.writeLong(cardDebitDetails.closeDate);
        parcel.writeString(cardDebitDetails.phoneNumber);
        parcel.writeLong(cardDebitDetails.clientKey);
        parcel.writeLong(cardDebitDetails.acctKey1);
        parcel.writeLong(cardDebitDetails.acctKey2);
        parcel.writeLong(cardDebitDetails.acctKey);
        parcel.writeLong(cardDebitDetails.f81311id);
        ArrayList<CardDebitAccount> arrayList = cardDebitDetails.accounts;
        if (arrayList == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(arrayList.size());
            Iterator<CardDebitAccount> it = cardDebitDetails.accounts.iterator();
            while (it.hasNext()) {
                CardDebitAccount$$Parcelable.write(it.next(), parcel, i, aVar);
            }
        }
        parcel.writeLong(cardDebitDetails.openDate);
        parcel.writeString(cardDebitDetails.billPayName);
        parcel.writeString(cardDebitDetails.status);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.cardDebitDetails$$0, parcel, i, new C42027a());
    }

    public CardDebitDetails getParcel() {
        return this.cardDebitDetails$$0;
    }
}
