package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.RateWeight$$Parcelable */
public class RateWeight$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<RateWeight$$Parcelable> CREATOR = new Parcelable.Creator<RateWeight$$Parcelable>() {
        public RateWeight$$Parcelable createFromParcel(Parcel parcel) {
            return new RateWeight$$Parcelable(RateWeight$$Parcelable.read(parcel, new C42027a()));
        }

        public RateWeight$$Parcelable[] newArray(int i) {
            return new RateWeight$$Parcelable[i];
        }
    };
    private RateWeight rateWeight$$0;

    public RateWeight$$Parcelable(RateWeight rateWeight) {
        this.rateWeight$$0 = rateWeight;
    }

    public static RateWeight read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            RateWeight rateWeight = new RateWeight();
            aVar.mo97501f(g, rateWeight);
            rateWeight.rate = (BigDecimal) parcel.readSerializable();
            rateWeight.ccy1 = parcel.readString();
            rateWeight.ccy2 = parcel.readString();
            rateWeight.rateWeight = (BigDecimal) parcel.readSerializable();
            aVar.mo97501f(readInt, rateWeight);
            return rateWeight;
        } else if (!aVar.mo97499d(readInt)) {
            return (RateWeight) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(RateWeight rateWeight, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(rateWeight);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(rateWeight));
        parcel.writeSerializable(rateWeight.rate);
        parcel.writeString(rateWeight.ccy1);
        parcel.writeString(rateWeight.ccy2);
        parcel.writeSerializable(rateWeight.rateWeight);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.rateWeight$$0, parcel, i, new C42027a());
    }

    public RateWeight getParcel() {
        return this.rateWeight$$0;
    }
}
