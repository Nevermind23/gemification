package p341ge.bog.mobilebank.model.ddsto;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.ddsto.STOPeriodType$$Parcelable */
public class STOPeriodType$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<STOPeriodType$$Parcelable> CREATOR = new Parcelable.Creator<STOPeriodType$$Parcelable>() {
        public STOPeriodType$$Parcelable createFromParcel(Parcel parcel) {
            return new STOPeriodType$$Parcelable(STOPeriodType$$Parcelable.read(parcel, new C42027a()));
        }

        public STOPeriodType$$Parcelable[] newArray(int i) {
            return new STOPeriodType$$Parcelable[i];
        }
    };
    private STOPeriodType sTOPeriodType$$0;

    public STOPeriodType$$Parcelable(STOPeriodType sTOPeriodType) {
        this.sTOPeriodType$$0 = sTOPeriodType;
    }

    public static STOPeriodType read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            STOPeriodType sTOPeriodType = new STOPeriodType();
            aVar.mo97501f(g, sTOPeriodType);
            sTOPeriodType.dictionaryKey = parcel.readString();
            sTOPeriodType.needDay = parcel.readString();
            sTOPeriodType.periodType = parcel.readString();
            sTOPeriodType.periodDesc = parcel.readString();
            sTOPeriodType.periodLength = parcel.readInt();
            sTOPeriodType.dictionaryKeyId = parcel.readLong();
            sTOPeriodType.periodUnit = parcel.readString();
            aVar.mo97501f(readInt, sTOPeriodType);
            return sTOPeriodType;
        } else if (!aVar.mo97499d(readInt)) {
            return (STOPeriodType) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(STOPeriodType sTOPeriodType, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(sTOPeriodType);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(sTOPeriodType));
        parcel.writeString(sTOPeriodType.dictionaryKey);
        parcel.writeString(sTOPeriodType.needDay);
        parcel.writeString(sTOPeriodType.periodType);
        parcel.writeString(sTOPeriodType.periodDesc);
        parcel.writeInt(sTOPeriodType.periodLength);
        parcel.writeLong(sTOPeriodType.dictionaryKeyId);
        parcel.writeString(sTOPeriodType.periodUnit);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.sTOPeriodType$$0, parcel, i, new C42027a());
    }

    public STOPeriodType getParcel() {
        return this.sTOPeriodType$$0;
    }
}
