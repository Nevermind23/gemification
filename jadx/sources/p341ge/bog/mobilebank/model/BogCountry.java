package p341ge.bog.mobilebank.model;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.BogCountry */
public final class BogCountry implements Parcelable {
    public static final Parcelable.Creator<BogCountry> CREATOR = new Creator();
    private String countryCode;
    private String countryName;
    private String countryNameInt;
    private ArrayList<BogRegion> regions;

    /* renamed from: ge.bog.mobilebank.model.BogCountry$Creator */
    public static final class Creator implements Parcelable.Creator<BogCountry> {
        public final BogCountry createFromParcel(android.os.Parcel parcel) {
            ArrayList arrayList;
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(BogRegion.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new BogCountry(readString, readString2, readString3, arrayList);
        }

        public final BogCountry[] newArray(int i) {
            return new BogCountry[i];
        }
    }

    public BogCountry(String str, String str2, String str3, ArrayList<BogRegion> arrayList) {
        this.countryCode = str;
        this.countryName = str2;
        this.countryNameInt = str3;
        this.regions = arrayList;
    }

    public static /* synthetic */ BogCountry copy$default(BogCountry bogCountry, String str, String str2, String str3, ArrayList<BogRegion> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bogCountry.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = bogCountry.countryName;
        }
        if ((i & 4) != 0) {
            str3 = bogCountry.countryNameInt;
        }
        if ((i & 8) != 0) {
            arrayList = bogCountry.regions;
        }
        return bogCountry.copy(str, str2, str3, arrayList);
    }

    public final String component1() {
        return this.countryCode;
    }

    public final String component2() {
        return this.countryName;
    }

    public final String component3() {
        return this.countryNameInt;
    }

    public final ArrayList<BogRegion> component4() {
        return this.regions;
    }

    public final BogCountry copy(String str, String str2, String str3, ArrayList<BogRegion> arrayList) {
        return new BogCountry(str, str2, str3, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BogCountry)) {
            return false;
        }
        BogCountry bogCountry = (BogCountry) obj;
        return C41536l.m120484d(this.countryCode, bogCountry.countryCode) && C41536l.m120484d(this.countryName, bogCountry.countryName) && C41536l.m120484d(this.countryNameInt, bogCountry.countryNameInt) && C41536l.m120484d(this.regions, bogCountry.regions);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final String getCountryNameInt() {
        return this.countryNameInt;
    }

    public final ArrayList<BogRegion> getRegions() {
        return this.regions;
    }

    public int hashCode() {
        String str = this.countryCode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.countryName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryNameInt;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList<BogRegion> arrayList = this.regions;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setCountryName(String str) {
        this.countryName = str;
    }

    public final void setCountryNameInt(String str) {
        this.countryNameInt = str;
    }

    public final void setRegions(ArrayList<BogRegion> arrayList) {
        this.regions = arrayList;
    }

    public String toString() {
        String str = this.countryCode;
        String str2 = this.countryName;
        String str3 = this.countryNameInt;
        ArrayList<BogRegion> arrayList = this.regions;
        return "BogCountry(countryCode=" + str + ", countryName=" + str2 + ", countryNameInt=" + str3 + ", regions=" + arrayList + ")";
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.countryCode);
        parcel.writeString(this.countryName);
        parcel.writeString(this.countryNameInt);
        ArrayList<BogRegion> arrayList = this.regions;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<BogRegion> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BogCountry(String str, String str2, String str3, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : arrayList);
    }
}
