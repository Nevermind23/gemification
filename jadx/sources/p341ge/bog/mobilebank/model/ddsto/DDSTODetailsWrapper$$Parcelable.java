package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.DDSTODetailsWrapper$$Parcelable */
public class DDSTODetailsWrapper$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DDSTODetailsWrapper$$Parcelable> CREATOR = new Parcelable.Creator<DDSTODetailsWrapper$$Parcelable>() {
        public DDSTODetailsWrapper$$Parcelable createFromParcel(Parcel parcel) {
            return new DDSTODetailsWrapper$$Parcelable(DDSTODetailsWrapper$$Parcelable.read(parcel, new C42027a()));
        }

        public DDSTODetailsWrapper$$Parcelable[] newArray(int i) {
            return new DDSTODetailsWrapper$$Parcelable[i];
        }
    };
    private DDSTODetailsWrapper dDSTODetailsWrapper$$0;

    public DDSTODetailsWrapper$$Parcelable(DDSTODetailsWrapper dDSTODetailsWrapper) {
        this.dDSTODetailsWrapper$$0 = dDSTODetailsWrapper;
    }

    public static DDSTODetailsWrapper read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DDSTODetailsWrapper dDSTODetailsWrapper = new DDSTODetailsWrapper();
            aVar.mo97501f(g, dDSTODetailsWrapper);
            dDSTODetailsWrapper.stoDetails = STODetails$$Parcelable.read(parcel, aVar);
            dDSTODetailsWrapper.paymentId = parcel.readLong();
            dDSTODetailsWrapper.cardDebitDetails = CardDebitDetails$$Parcelable.read(parcel, aVar);
            dDSTODetailsWrapper.paymentDetails = DDPaymentDetails$$Parcelable.read(parcel, aVar);
            aVar.mo97501f(readInt, dDSTODetailsWrapper);
            return dDSTODetailsWrapper;
        } else if (!aVar.mo97499d(readInt)) {
            return (DDSTODetailsWrapper) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DDSTODetailsWrapper dDSTODetailsWrapper, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(dDSTODetailsWrapper);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(dDSTODetailsWrapper));
        STODetails$$Parcelable.write(dDSTODetailsWrapper.stoDetails, parcel, i, aVar);
        parcel.writeLong(dDSTODetailsWrapper.paymentId);
        CardDebitDetails$$Parcelable.write(dDSTODetailsWrapper.cardDebitDetails, parcel, i, aVar);
        DDPaymentDetails$$Parcelable.write(dDSTODetailsWrapper.paymentDetails, parcel, i, aVar);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.dDSTODetailsWrapper$$0, parcel, i, new C42027a());
    }

    public DDSTODetailsWrapper getParcel() {
        return this.dDSTODetailsWrapper$$0;
    }
}
