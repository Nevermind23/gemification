package p341ge.bog.mobilebank.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import org.parceler.C42027a;
import org.parceler.C42034d;
import org.parceler.ParcelerRuntimeException;

/* renamed from: ge.bog.mobilebank.model.BogCountry$$Parcelable */
public class BogCountry$$Parcelable implements Parcelable, C42034d {
    public static final Parcelable.Creator<BogCountry$$Parcelable> CREATOR = new Parcelable.Creator<BogCountry$$Parcelable>() {
        public BogCountry$$Parcelable createFromParcel(Parcel parcel) {
            return new BogCountry$$Parcelable(BogCountry$$Parcelable.read(parcel, new C42027a()));
        }

        public BogCountry$$Parcelable[] newArray(int i) {
            return new BogCountry$$Parcelable[i];
        }
    };
    private BogCountry bogCountry$$0;

    public BogCountry$$Parcelable(BogCountry bogCountry) {
        this.bogCountry$$0 = bogCountry;
    }

    public static BogCountry read(Parcel parcel, C42027a aVar) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        if (!aVar.mo97496a(readInt)) {
            int g = aVar.mo97502g();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            if (readInt2 < 0) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList2.add((BogRegion) parcel.readParcelable(BogCountry$$Parcelable.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            BogCountry bogCountry = new BogCountry(readString, readString2, readString3, arrayList);
            aVar.mo97501f(g, bogCountry);
            aVar.mo97501f(readInt, bogCountry);
            return bogCountry;
        } else if (!aVar.mo97499d(readInt)) {
            return (BogCountry) aVar.mo97497b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(BogCountry bogCountry, Parcel parcel, int i, C42027a aVar) {
        int c = aVar.mo97498c(bogCountry);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        parcel.writeInt(aVar.mo97500e(bogCountry));
        parcel.writeString(bogCountry.getCountryCode());
        parcel.writeString(bogCountry.getCountryName());
        parcel.writeString(bogCountry.getCountryNameInt());
        if (bogCountry.getRegions() == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(bogCountry.getRegions().size());
        Iterator<BogRegion> it = bogCountry.getRegions().iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.bogCountry$$0, parcel, i, new C42027a());
    }

    public BogCountry getParcel() {
        return this.bogCountry$$0;
    }
}
