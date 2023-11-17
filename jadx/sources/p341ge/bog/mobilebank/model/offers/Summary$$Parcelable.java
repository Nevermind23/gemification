package p341ge.bog.mobilebank.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.offers.Summary$$Parcelable */
public class Summary$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<Summary$$Parcelable> CREATOR = new Parcelable.Creator<Summary$$Parcelable>() {
        public Summary$$Parcelable createFromParcel(Parcel parcel) {
            return new Summary$$Parcelable(Summary$$Parcelable.read(parcel, new C42027a()));
        }

        public Summary$$Parcelable[] newArray(int i) {
            return new Summary$$Parcelable[i];
        }
    };
    private Summary summary$$0;

    public Summary$$Parcelable(Summary summary) {
        this.summary$$0 = summary;
    }

    public static Summary read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            Summary summary = new Summary();
            aVar.mo97501f(g, summary);
            summary.intAmount = (BigDecimal) parcel.readSerializable();
            summary.ccy = parcel.readString();
            summary.priAmount = (BigDecimal) parcel.readSerializable();
            summary.fullAmount = (BigDecimal) parcel.readSerializable();
            aVar.mo97501f(readInt, summary);
            return summary;
        } else if (!aVar.mo97499d(readInt)) {
            return (Summary) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(Summary summary, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(summary);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(summary));
        parcel.writeSerializable(summary.intAmount);
        parcel.writeString(summary.ccy);
        parcel.writeSerializable(summary.priAmount);
        parcel.writeSerializable(summary.fullAmount);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.summary$$0, parcel, i, new C42027a());
    }

    public Summary getParcel() {
        return this.summary$$0;
    }
}
