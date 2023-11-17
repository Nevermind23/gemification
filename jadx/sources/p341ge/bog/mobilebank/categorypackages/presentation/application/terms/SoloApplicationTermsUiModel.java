package p341ge.bog.mobilebank.categorypackages.presentation.application.terms;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.terms.SoloApplicationTermsUiModel */
public final class SoloApplicationTermsUiModel implements Parcelable {
    public static final Parcelable.Creator<SoloApplicationTermsUiModel> CREATOR = new C14569a();

    /* renamed from: d */
    private final String f42469d;

    /* renamed from: e */
    private final String f42470e;

    /* renamed from: f */
    private final String f42471f;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.terms.SoloApplicationTermsUiModel$a */
    public static final class C14569a implements Parcelable.Creator {
        /* renamed from: a */
        public final SoloApplicationTermsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SoloApplicationTermsUiModel(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final SoloApplicationTermsUiModel[] newArray(int i) {
            return new SoloApplicationTermsUiModel[i];
        }
    }

    public SoloApplicationTermsUiModel(String str, String str2, String str3) {
        C41536l.m120489i(str, "lookupValue");
        C41536l.m120489i(str2, "titleKey");
        C41536l.m120489i(str3, "valueKey");
        this.f42469d = str;
        this.f42470e = str2;
        this.f42471f = str3;
    }

    /* renamed from: a */
    public final String mo40945a() {
        return this.f42469d;
    }

    /* renamed from: b */
    public final String mo40946b() {
        return this.f42470e;
    }

    /* renamed from: d */
    public final String mo40947d() {
        return this.f42471f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoloApplicationTermsUiModel)) {
            return false;
        }
        SoloApplicationTermsUiModel soloApplicationTermsUiModel = (SoloApplicationTermsUiModel) obj;
        return C41536l.m120484d(this.f42469d, soloApplicationTermsUiModel.f42469d) && C41536l.m120484d(this.f42470e, soloApplicationTermsUiModel.f42470e) && C41536l.m120484d(this.f42471f, soloApplicationTermsUiModel.f42471f);
    }

    public int hashCode() {
        return (((this.f42469d.hashCode() * 31) + this.f42470e.hashCode()) * 31) + this.f42471f.hashCode();
    }

    public String toString() {
        String str = this.f42469d;
        String str2 = this.f42470e;
        String str3 = this.f42471f;
        return "SoloApplicationTermsUiModel(lookupValue=" + str + ", titleKey=" + str2 + ", valueKey=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f42469d);
        parcel.writeString(this.f42470e);
        parcel.writeString(this.f42471f);
    }
}
