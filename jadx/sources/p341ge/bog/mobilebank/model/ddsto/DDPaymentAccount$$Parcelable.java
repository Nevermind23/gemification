package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.DDPaymentAccount$$Parcelable */
public class DDPaymentAccount$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DDPaymentAccount$$Parcelable> CREATOR = new Parcelable.Creator<DDPaymentAccount$$Parcelable>() {
        public DDPaymentAccount$$Parcelable createFromParcel(Parcel parcel) {
            return new DDPaymentAccount$$Parcelable(DDPaymentAccount$$Parcelable.read(parcel, new C42027a()));
        }

        public DDPaymentAccount$$Parcelable[] newArray(int i) {
            return new DDPaymentAccount$$Parcelable[i];
        }
    };
    private DDPaymentAccount dDPaymentAccount$$0;

    public DDPaymentAccount$$Parcelable(DDPaymentAccount dDPaymentAccount) {
        this.dDPaymentAccount$$0 = dDPaymentAccount;
    }

    public static DDPaymentAccount read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DDPaymentAccount dDPaymentAccount = new DDPaymentAccount();
            aVar.mo97501f(g, dDPaymentAccount);
            dDPaymentAccount.orderNo = parcel.readInt();
            dDPaymentAccount.acctNo = parcel.readString();
            dDPaymentAccount.clientKey = parcel.readString();
            dDPaymentAccount.paymentId = parcel.readLong();
            dDPaymentAccount.ccy = parcel.readString();
            dDPaymentAccount.acctKey = parcel.readLong();
            dDPaymentAccount.acctDesc = parcel.readString();
            dDPaymentAccount.f81312id = parcel.readLong();
            dDPaymentAccount.acctName = parcel.readString();
            aVar.mo97501f(readInt, dDPaymentAccount);
            return dDPaymentAccount;
        } else if (!aVar.mo97499d(readInt)) {
            return (DDPaymentAccount) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DDPaymentAccount dDPaymentAccount, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(dDPaymentAccount);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(dDPaymentAccount));
        parcel.writeInt(dDPaymentAccount.orderNo);
        parcel.writeString(dDPaymentAccount.acctNo);
        parcel.writeString(dDPaymentAccount.clientKey);
        parcel.writeLong(dDPaymentAccount.paymentId);
        parcel.writeString(dDPaymentAccount.ccy);
        parcel.writeLong(dDPaymentAccount.acctKey);
        parcel.writeString(dDPaymentAccount.acctDesc);
        parcel.writeLong(dDPaymentAccount.f81312id);
        parcel.writeString(dDPaymentAccount.acctName);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.dDPaymentAccount$$0, parcel, i, new C42027a());
    }

    public DDPaymentAccount getParcel() {
        return this.dDPaymentAccount$$0;
    }
}
