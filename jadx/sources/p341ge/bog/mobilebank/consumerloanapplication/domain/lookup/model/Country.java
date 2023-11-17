package p341ge.bog.mobilebank.consumerloanapplication.domain.lookup.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country */
public final class Country implements Parcelable {
    public static final Parcelable.Creator<Country> CREATOR = new C22547a();

    /* renamed from: d */
    private final String f59638d;

    /* renamed from: e */
    private final String f59639e;

    /* renamed from: f */
    private final String f59640f;

    /* renamed from: g */
    private final Integer f59641g;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.domain.lookup.model.Country$a */
    public static final class C22547a implements Parcelable.Creator {
        /* renamed from: a */
        public final Country createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new Country(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* renamed from: b */
        public final Country[] newArray(int i) {
            return new Country[i];
        }
    }

    public Country(String str, String str2, String str3, Integer num) {
        this.f59638d = str;
        this.f59639e = str2;
        this.f59640f = str3;
        this.f59641g = num;
    }

    /* renamed from: a */
    public final String mo55935a() {
        return this.f59640f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return C41536l.m120484d(this.f59638d, country.f59638d) && C41536l.m120484d(this.f59639e, country.f59639e) && C41536l.m120484d(this.f59640f, country.f59640f) && C41536l.m120484d(this.f59641g, country.f59641g);
    }

    public int hashCode() {
        String str = this.f59638d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59639e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59640f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f59641g;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f59638d;
        String str2 = this.f59639e;
        String str3 = this.f59640f;
        Integer num = this.f59641g;
        return "Country(code=" + str + ", code2=" + str2 + ", name=" + str3 + ", order=" + num + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f59638d);
        parcel.writeString(this.f59639e);
        parcel.writeString(this.f59640f);
        Integer num = this.f59641g;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }
}
