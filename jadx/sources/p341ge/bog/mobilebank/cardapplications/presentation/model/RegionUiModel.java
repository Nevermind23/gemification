package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel */
public final class RegionUiModel implements Parcelable {
    public static final Parcelable.Creator<RegionUiModel> CREATOR = new C14231a();

    /* renamed from: d */
    private final String f41780d;

    /* renamed from: e */
    private final String f41781e;

    /* renamed from: f */
    private final boolean f41782f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel$a */
    public static final class C14231a implements Parcelable.Creator {
        /* renamed from: a */
        public final RegionUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new RegionUiModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final RegionUiModel[] newArray(int i) {
            return new RegionUiModel[i];
        }
    }

    public RegionUiModel(String str, String str2, boolean z) {
        C41536l.m120489i(str, "regionId");
        C41536l.m120489i(str2, "regionName");
        this.f41780d = str;
        this.f41781e = str2;
        this.f41782f = z;
    }

    /* renamed from: a */
    public final boolean mo39834a() {
        return this.f41782f;
    }

    /* renamed from: b */
    public final String mo39835b() {
        return this.f41780d;
    }

    /* renamed from: d */
    public final String mo39836d() {
        return this.f41781e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionUiModel)) {
            return false;
        }
        RegionUiModel regionUiModel = (RegionUiModel) obj;
        return C41536l.m120484d(this.f41780d, regionUiModel.f41780d) && C41536l.m120484d(this.f41781e, regionUiModel.f41781e) && this.f41782f == regionUiModel.f41782f;
    }

    public int hashCode() {
        int hashCode = ((this.f41780d.hashCode() * 31) + this.f41781e.hashCode()) * 31;
        boolean z = this.f41782f;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.f41780d;
        String str2 = this.f41781e;
        boolean z = this.f41782f;
        return "RegionUiModel(regionId=" + str + ", regionName=" + str2 + ", regionFlag=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41780d);
        parcel.writeString(this.f41781e);
        parcel.writeInt(this.f41782f ? 1 : 0);
    }
}
