package p341ge.bog.mobilebank.model;

import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.BogRegion */
public final class BogRegion implements Parcelable {
    public static final Parcelable.Creator<BogRegion> CREATOR = new Creator();
    private String countryCode;
    private String regionCode;
    private String regionName;

    /* renamed from: ge.bog.mobilebank.model.BogRegion$Creator */
    public static final class Creator implements Parcelable.Creator<BogRegion> {
        public final BogRegion createFromParcel(android.os.Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BogRegion(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final BogRegion[] newArray(int i) {
            return new BogRegion[i];
        }
    }

    public BogRegion() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BogRegion copy$default(BogRegion bogRegion, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bogRegion.regionCode;
        }
        if ((i & 2) != 0) {
            str2 = bogRegion.regionName;
        }
        if ((i & 4) != 0) {
            str3 = bogRegion.countryCode;
        }
        return bogRegion.copy(str, str2, str3);
    }

    public final String component1() {
        return this.regionCode;
    }

    public final String component2() {
        return this.regionName;
    }

    public final String component3() {
        return this.countryCode;
    }

    public final BogRegion copy(String str, String str2, String str3) {
        return new BogRegion(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BogRegion)) {
            return false;
        }
        BogRegion bogRegion = (BogRegion) obj;
        return C41536l.m120484d(this.regionCode, bogRegion.regionCode) && C41536l.m120484d(this.regionName, bogRegion.regionName) && C41536l.m120484d(this.countryCode, bogRegion.countryCode);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getDisplayName() {
        String str = this.regionName;
        if (str == null) {
            return "";
        }
        C41536l.m120487g(str, "null cannot be cast to non-null type kotlin.String");
        return str;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final String getRegionName() {
        return this.regionName;
    }

    public int hashCode() {
        String str = this.regionCode;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.regionName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.countryCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setRegionCode(String str) {
        this.regionCode = str;
    }

    public final void setRegionName(String str) {
        this.regionName = str;
    }

    public String toString() {
        String str = this.regionCode;
        String str2 = this.regionName;
        String str3 = this.countryCode;
        return "BogRegion(regionCode=" + str + ", regionName=" + str2 + ", countryCode=" + str3 + ")";
    }

    public void writeToParcel(android.os.Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.regionCode);
        parcel.writeString(this.regionName);
        parcel.writeString(this.countryCode);
    }

    public BogRegion(String str, String str2, String str3) {
        this.regionCode = str;
        this.regionName = str2;
        this.countryCode = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BogRegion(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
