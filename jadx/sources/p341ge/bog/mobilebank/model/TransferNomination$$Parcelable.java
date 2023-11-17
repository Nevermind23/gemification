package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.TransferNomination$$Parcelable */
public class TransferNomination$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<TransferNomination$$Parcelable> CREATOR = new Parcelable.Creator<TransferNomination$$Parcelable>() {
        public TransferNomination$$Parcelable createFromParcel(Parcel parcel) {
            return new TransferNomination$$Parcelable(TransferNomination$$Parcelable.read(parcel, new C42027a()));
        }

        public TransferNomination$$Parcelable[] newArray(int i) {
            return new TransferNomination$$Parcelable[i];
        }
    };
    private TransferNomination transferNomination$$0;

    public TransferNomination$$Parcelable(TransferNomination transferNomination) {
        this.transferNomination$$0 = transferNomination;
    }

    public static TransferNomination read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            TransferNomination transferNomination = new TransferNomination();
            aVar.mo97501f(g, transferNomination);
            transferNomination.orderNo = parcel.readInt();
            transferNomination.docType = parcel.readString();
            transferNomination.additionalNomFlag = parcel.readString();
            transferNomination.dstCliType = parcel.readString();
            transferNomination.ccyType = parcel.readString();
            transferNomination.nomination = parcel.readString();
            aVar.mo97501f(readInt, transferNomination);
            return transferNomination;
        } else if (!aVar.mo97499d(readInt)) {
            return (TransferNomination) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(TransferNomination transferNomination, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(transferNomination);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(transferNomination));
        parcel.writeInt(transferNomination.orderNo);
        parcel.writeString(transferNomination.docType);
        parcel.writeString(transferNomination.additionalNomFlag);
        parcel.writeString(transferNomination.dstCliType);
        parcel.writeString(transferNomination.ccyType);
        parcel.writeString(transferNomination.nomination);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.transferNomination$$0, parcel, i, new C42027a());
    }

    public TransferNomination getParcel() {
        return this.transferNomination$$0;
    }
}
