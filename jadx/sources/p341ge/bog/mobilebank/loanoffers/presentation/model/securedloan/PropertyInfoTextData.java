package p341ge.bog.mobilebank.loanoffers.presentation.model.securedloan;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loanoffers.presentation.model.securedloan.PropertyInfoTextData */
public final class PropertyInfoTextData implements Parcelable {
    public static final Parcelable.Creator<PropertyInfoTextData> CREATOR = new C32568a();

    /* renamed from: d */
    private final String f80194d;

    /* renamed from: e */
    private final String f80195e;

    /* renamed from: f */
    private final String f80196f;

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.model.securedloan.PropertyInfoTextData$a */
    public static final class C32568a implements Parcelable.Creator {
        /* renamed from: a */
        public final PropertyInfoTextData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PropertyInfoTextData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final PropertyInfoTextData[] newArray(int i) {
            return new PropertyInfoTextData[i];
        }
    }

    public PropertyInfoTextData(String str, String str2, String str3) {
        C41536l.m120489i(str, "titleKey");
        C41536l.m120489i(str2, "descriptionKey");
        C41536l.m120489i(str3, "buttonTextKey");
        this.f80194d = str;
        this.f80195e = str2;
        this.f80196f = str3;
    }

    /* renamed from: a */
    public final String mo73714a() {
        return this.f80196f;
    }

    /* renamed from: b */
    public final String mo73715b() {
        return this.f80195e;
    }

    /* renamed from: d */
    public final String mo73716d() {
        return this.f80194d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyInfoTextData)) {
            return false;
        }
        PropertyInfoTextData propertyInfoTextData = (PropertyInfoTextData) obj;
        return C41536l.m120484d(this.f80194d, propertyInfoTextData.f80194d) && C41536l.m120484d(this.f80195e, propertyInfoTextData.f80195e) && C41536l.m120484d(this.f80196f, propertyInfoTextData.f80196f);
    }

    public int hashCode() {
        return (((this.f80194d.hashCode() * 31) + this.f80195e.hashCode()) * 31) + this.f80196f.hashCode();
    }

    public String toString() {
        String str = this.f80194d;
        String str2 = this.f80195e;
        String str3 = this.f80196f;
        return "PropertyInfoTextData(titleKey=" + str + ", descriptionKey=" + str2 + ", buttonTextKey=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80194d);
        parcel.writeString(this.f80195e);
        parcel.writeString(this.f80196f);
    }
}
