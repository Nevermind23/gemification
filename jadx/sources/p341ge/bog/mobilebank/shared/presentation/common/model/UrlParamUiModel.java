package p341ge.bog.mobilebank.shared.presentation.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared.presentation.common.model.UrlParamUiModel */
public final class UrlParamUiModel implements Parcelable {
    public static final Parcelable.Creator<UrlParamUiModel> CREATOR = new C34649a();

    /* renamed from: d */
    private final String f83758d;

    /* renamed from: e */
    private final String f83759e;

    /* renamed from: ge.bog.mobilebank.shared.presentation.common.model.UrlParamUiModel$a */
    public static final class C34649a implements Parcelable.Creator {
        /* renamed from: a */
        public final UrlParamUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new UrlParamUiModel(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final UrlParamUiModel[] newArray(int i) {
            return new UrlParamUiModel[i];
        }
    }

    public UrlParamUiModel(String str, String str2) {
        C41536l.m120489i(str, "key");
        this.f83758d = str;
        this.f83759e = str2;
    }

    /* renamed from: a */
    public final String mo84587a() {
        return this.f83758d;
    }

    /* renamed from: b */
    public final String mo84588b() {
        return this.f83759e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlParamUiModel)) {
            return false;
        }
        UrlParamUiModel urlParamUiModel = (UrlParamUiModel) obj;
        return C41536l.m120484d(this.f83758d, urlParamUiModel.f83758d) && C41536l.m120484d(this.f83759e, urlParamUiModel.f83759e);
    }

    public int hashCode() {
        int hashCode = this.f83758d.hashCode() * 31;
        String str = this.f83759e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f83758d;
        String str2 = this.f83759e;
        return "UrlParamUiModel(key=" + str + ", value=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f83758d);
        parcel.writeString(this.f83759e);
    }
}
