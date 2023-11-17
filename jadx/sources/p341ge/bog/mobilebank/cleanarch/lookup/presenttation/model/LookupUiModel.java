package p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel */
public final class LookupUiModel implements Parcelable {
    public static final Parcelable.Creator<LookupUiModel> CREATOR = new C21121a();

    /* renamed from: d */
    private final String f56687d;

    /* renamed from: e */
    private final String f56688e;

    /* renamed from: f */
    private final String f56689f;

    /* renamed from: g */
    private final int f56690g;

    /* renamed from: ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel$a */
    public static final class C21121a implements Parcelable.Creator {
        /* renamed from: a */
        public final LookupUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new LookupUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* renamed from: b */
        public final LookupUiModel[] newArray(int i) {
            return new LookupUiModel[i];
        }
    }

    public LookupUiModel(String str, String str2, String str3, int i) {
        C41536l.m120489i(str, "lookupName");
        C41536l.m120489i(str2, "lookupValue");
        C41536l.m120489i(str3, "dictionaryKey");
        this.f56687d = str;
        this.f56688e = str2;
        this.f56689f = str3;
        this.f56690g = i;
    }

    /* renamed from: a */
    public final String mo52391a() {
        return this.f56689f;
    }

    /* renamed from: b */
    public final String mo52392b() {
        return this.f56687d;
    }

    /* renamed from: d */
    public final String mo52393d() {
        return this.f56688e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo52395e() {
        return this.f56690g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LookupUiModel)) {
            return false;
        }
        LookupUiModel lookupUiModel = (LookupUiModel) obj;
        return C41536l.m120484d(this.f56687d, lookupUiModel.f56687d) && C41536l.m120484d(this.f56688e, lookupUiModel.f56688e) && C41536l.m120484d(this.f56689f, lookupUiModel.f56689f) && this.f56690g == lookupUiModel.f56690g;
    }

    public int hashCode() {
        return (((((this.f56687d.hashCode() * 31) + this.f56688e.hashCode()) * 31) + this.f56689f.hashCode()) * 31) + this.f56690g;
    }

    public String toString() {
        String str = this.f56687d;
        String str2 = this.f56688e;
        String str3 = this.f56689f;
        int i = this.f56690g;
        return "LookupUiModel(lookupName=" + str + ", lookupValue=" + str2 + ", dictionaryKey=" + str3 + ", orderNumber=" + i + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f56687d);
        parcel.writeString(this.f56688e);
        parcel.writeString(this.f56689f);
        parcel.writeInt(this.f56690g);
    }
}
