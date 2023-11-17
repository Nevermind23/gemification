package p341ge.bog.mobilebank.galtandtaggart.presentation.landing;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$GTLandingData */
public final class GTLandingViewModel$GTLandingData implements Parcelable {
    public static final Parcelable.Creator<GTLandingViewModel$GTLandingData> CREATOR = new C23478a();

    /* renamed from: d */
    private final String f61338d;

    /* renamed from: e */
    private final String f61339e;

    /* renamed from: f */
    private final boolean f61340f;

    /* renamed from: g */
    private final boolean f61341g;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.GTLandingViewModel$GTLandingData$a */
    public static final class C23478a implements Parcelable.Creator {
        /* renamed from: a */
        public final GTLandingViewModel$GTLandingData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new GTLandingViewModel$GTLandingData(readString, readString2, z2, z);
        }

        /* renamed from: b */
        public final GTLandingViewModel$GTLandingData[] newArray(int i) {
            return new GTLandingViewModel$GTLandingData[i];
        }
    }

    public GTLandingViewModel$GTLandingData() {
        this((String) null, (String) null, false, false, 15, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final boolean mo60296a() {
        return this.f61340f;
    }

    /* renamed from: b */
    public final String mo60297b() {
        return this.f61338d;
    }

    /* renamed from: d */
    public final String mo60298d() {
        return this.f61339e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTLandingViewModel$GTLandingData)) {
            return false;
        }
        GTLandingViewModel$GTLandingData gTLandingViewModel$GTLandingData = (GTLandingViewModel$GTLandingData) obj;
        return C41536l.m120484d(this.f61338d, gTLandingViewModel$GTLandingData.f61338d) && C41536l.m120484d(this.f61339e, gTLandingViewModel$GTLandingData.f61339e) && this.f61340f == gTLandingViewModel$GTLandingData.f61340f && this.f61341g == gTLandingViewModel$GTLandingData.f61341g;
    }

    public int hashCode() {
        String str = this.f61338d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f61339e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f61340f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f61341g;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f61338d;
        String str2 = this.f61339e;
        boolean z = this.f61340f;
        boolean z2 = this.f61341g;
        return "GTLandingData(pushType=" + str + ", tickerCode=" + str2 + ", askForIdentification=" + z + ", goToHistory=" + z2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f61338d);
        parcel.writeString(this.f61339e);
        parcel.writeInt(this.f61340f ? 1 : 0);
        parcel.writeInt(this.f61341g ? 1 : 0);
    }

    public GTLandingViewModel$GTLandingData(String str, String str2, boolean z, boolean z2) {
        this.f61338d = str;
        this.f61339e = str2;
        this.f61340f = z;
        this.f61341g = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GTLandingViewModel$GTLandingData(String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
