package p341ge.bog.mobilebank.model.cards;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.cards.PaymentsCard$$Parcelable */
public class PaymentsCard$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<PaymentsCard$$Parcelable> CREATOR = new Parcelable.Creator<PaymentsCard$$Parcelable>() {
        public PaymentsCard$$Parcelable createFromParcel(Parcel parcel) {
            return new PaymentsCard$$Parcelable(PaymentsCard$$Parcelable.read(parcel, new C42027a()));
        }

        public PaymentsCard$$Parcelable[] newArray(int i) {
            return new PaymentsCard$$Parcelable[i];
        }
    };
    private PaymentsCard paymentsCard$$0;

    public PaymentsCard$$Parcelable(PaymentsCard paymentsCard) {
        this.paymentsCard$$0 = paymentsCard;
    }

    public static PaymentsCard read(Parcel parcel, C42027a aVar) {
        boolean z;
        boolean z2;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            PaymentsCard paymentsCard = new PaymentsCard();
            aVar.mo97501f(g, paymentsCard);
            paymentsCard.mainCur = parcel.readString();
            paymentsCard.pan2 = parcel.readString();
            paymentsCard.cardName = parcel.readString();
            paymentsCard.extMerchantId = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            paymentsCard.isTemporary = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            paymentsCard.shouldSave = z2;
            paymentsCard.tempCleanDate = parcel.readString();
            paymentsCard.expDate = parcel.readLong();
            paymentsCard.isLocalCard = parcel.readString();
            paymentsCard.paymentCardType = parcel.readString();
            paymentsCard.availableAmount = (BigDecimal) parcel.readSerializable();
            paymentsCard.clientKey = parcel.readString();
            paymentsCard.ccy = parcel.readString();
            paymentsCard.acctKey = parcel.readLong();
            paymentsCard.f81307id = parcel.readLong();
            paymentsCard.pan = parcel.readString();
            paymentsCard.cardClass = parcel.readString();
            paymentsCard.lastFour = parcel.readString();
            paymentsCard.cardData = parcel.readString();
            paymentsCard.subProductCode = parcel.readString();
            paymentsCard.cvv = parcel.readString();
            if (parcel.readInt() == 1) {
                z3 = true;
            }
            paymentsCard.newCard = z3;
            paymentsCard.nameDictionaryKey = parcel.readString();
            paymentsCard.cardType = parcel.readString();
            paymentsCard.tempExpDate = parcel.readString();
            paymentsCard.acctName = parcel.readString();
            paymentsCard.productDictionaryKey = parcel.readString();
            paymentsCard.availableAmountBaseCcy = parcel.readString();
            paymentsCard.isDefault = parcel.readString();
            paymentsCard.productCode = parcel.readString();
            paymentsCard.cardId = parcel.readLong();
            aVar.mo97501f(readInt, paymentsCard);
            return paymentsCard;
        } else if (!aVar.mo97499d(readInt)) {
            return (PaymentsCard) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(PaymentsCard paymentsCard, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(paymentsCard);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(paymentsCard));
        parcel.writeString(paymentsCard.mainCur);
        parcel.writeString(paymentsCard.pan2);
        parcel.writeString(paymentsCard.cardName);
        parcel.writeString(paymentsCard.extMerchantId);
        parcel.writeInt(paymentsCard.isTemporary ? 1 : 0);
        parcel.writeInt(paymentsCard.shouldSave ? 1 : 0);
        parcel.writeString(paymentsCard.tempCleanDate);
        parcel.writeLong(paymentsCard.expDate);
        parcel.writeString(paymentsCard.isLocalCard);
        parcel.writeString(paymentsCard.paymentCardType);
        parcel.writeSerializable(paymentsCard.availableAmount);
        parcel.writeString(paymentsCard.clientKey);
        parcel.writeString(paymentsCard.ccy);
        parcel.writeLong(paymentsCard.acctKey);
        parcel.writeLong(paymentsCard.f81307id);
        parcel.writeString(paymentsCard.pan);
        parcel.writeString(paymentsCard.cardClass);
        parcel.writeString(paymentsCard.lastFour);
        parcel.writeString(paymentsCard.cardData);
        parcel.writeString(paymentsCard.subProductCode);
        parcel.writeString(paymentsCard.cvv);
        parcel.writeInt(paymentsCard.newCard ? 1 : 0);
        parcel.writeString(paymentsCard.nameDictionaryKey);
        parcel.writeString(paymentsCard.cardType);
        parcel.writeString(paymentsCard.tempExpDate);
        parcel.writeString(paymentsCard.acctName);
        parcel.writeString(paymentsCard.productDictionaryKey);
        parcel.writeString(paymentsCard.availableAmountBaseCcy);
        parcel.writeString(paymentsCard.isDefault);
        parcel.writeString(paymentsCard.productCode);
        parcel.writeLong(paymentsCard.cardId);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.paymentsCard$$0, parcel, i, new C42027a());
    }

    public PaymentsCard getParcel() {
        return this.paymentsCard$$0;
    }
}
