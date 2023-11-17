package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C42027a;
import org.parceler.C42028b;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.BogRegion$$Parcelable */
public class BogRegion$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<BogRegion$$Parcelable> CREATOR = new Parcelable.Creator<BogRegion$$Parcelable>() {
        public BogRegion$$Parcelable createFromParcel(Parcel parcel) {
            return new BogRegion$$Parcelable(BogRegion$$Parcelable.read(parcel, new C42027a()));
        }

        public BogRegion$$Parcelable[] newArray(int i) {
            return new BogRegion$$Parcelable[i];
        }
    };
    private BogRegion bogRegion$$0;

    public BogRegion$$Parcelable(BogRegion bogRegion) {
        this.bogRegion$$0 = bogRegion;
    }

    public static BogRegion read(Parcel parcel, C42027a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            BogRegion bogRegion = new BogRegion();
            aVar.mo97501f(g, bogRegion);
            Class<BogRegion> cls = BogRegion.class;
            C42028b.m122113b(cls, bogRegion, "regionCode", parcel.readString());
            C42028b.m122113b(cls, bogRegion, "countryCode", parcel.readString());
            C42028b.m122113b(cls, bogRegion, "regionName", parcel.readString());
            aVar.mo97501f(readInt, bogRegion);
            return bogRegion;
        } else if (!aVar.mo97499d(readInt)) {
            return (BogRegion) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(BogRegion bogRegion, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(bogRegion);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(bogRegion));
        Class<String> cls = String.class;
        Class<BogRegion> cls2 = BogRegion.class;
        parcel.writeString((String) C42028b.m122112a(cls, cls2, bogRegion, "regionCode"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, bogRegion, "countryCode"));
        parcel.writeString((String) C42028b.m122112a(cls, cls2, bogRegion, "regionName"));
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.bogRegion$$0, parcel, i, new C42027a());
    }

    public BogRegion getParcel() {
        return this.bogRegion$$0;
    }
}
