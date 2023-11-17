package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.DispatchType$$Parcelable */
public class DispatchType$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<DispatchType$$Parcelable> CREATOR = new Parcelable.Creator<DispatchType$$Parcelable>() {
        public DispatchType$$Parcelable createFromParcel(Parcel parcel) {
            return new DispatchType$$Parcelable(DispatchType$$Parcelable.read(parcel, new C42027a()));
        }

        public DispatchType$$Parcelable[] newArray(int i) {
            return new DispatchType$$Parcelable[i];
        }
    };
    private DispatchType dispatchType$$0;

    public DispatchType$$Parcelable(DispatchType dispatchType) {
        this.dispatchType$$0 = dispatchType;
    }

    public static DispatchType read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            DispatchType dispatchType = new DispatchType();
            aVar.mo97501f(g, dispatchType);
            dispatchType.dictionaryKey = parcel.readString();
            dispatchType.dispatchType = parcel.readString();
            dispatchType.tooltipDictionaryKey = parcel.readString();
            aVar.mo97501f(readInt, dispatchType);
            return dispatchType;
        } else if (!aVar.mo97499d(readInt)) {
            return (DispatchType) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(DispatchType dispatchType, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(dispatchType);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(dispatchType));
        parcel.writeString(dispatchType.dictionaryKey);
        parcel.writeString(dispatchType.dispatchType);
        parcel.writeString(dispatchType.tooltipDictionaryKey);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.dispatchType$$0, parcel, i, new C42027a());
    }

    public DispatchType getParcel() {
        return this.dispatchType$$0;
    }
}
