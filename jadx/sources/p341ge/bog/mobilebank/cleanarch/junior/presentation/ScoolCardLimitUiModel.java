package p341ge.bog.mobilebank.cleanarch.junior.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.junior.presentation.ScoolCardLimitUiModel */
public final class ScoolCardLimitUiModel implements Parcelable {
    public static final Parcelable.Creator<ScoolCardLimitUiModel> CREATOR = new C21112a();

    /* renamed from: d */
    private final int f56668d;

    /* renamed from: e */
    private final String f56669e;

    /* renamed from: f */
    private final String f56670f;

    /* renamed from: g */
    private final String f56671g;

    /* renamed from: h */
    private final boolean f56672h;

    /* renamed from: ge.bog.mobilebank.cleanarch.junior.presentation.ScoolCardLimitUiModel$a */
    public static final class C21112a implements Parcelable.Creator {
        /* renamed from: a */
        public final ScoolCardLimitUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ScoolCardLimitUiModel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final ScoolCardLimitUiModel[] newArray(int i) {
            return new ScoolCardLimitUiModel[i];
        }
    }

    public ScoolCardLimitUiModel(int i, String str, String str2, String str3, boolean z) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "dailyLimitType");
        C41536l.m120489i(str3, "limitTypeDesc");
        this.f56668d = i;
        this.f56669e = str;
        this.f56670f = str2;
        this.f56671g = str3;
        this.f56672h = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScoolCardLimitUiModel)) {
            return false;
        }
        ScoolCardLimitUiModel scoolCardLimitUiModel = (ScoolCardLimitUiModel) obj;
        return this.f56668d == scoolCardLimitUiModel.f56668d && C41536l.m120484d(this.f56669e, scoolCardLimitUiModel.f56669e) && C41536l.m120484d(this.f56670f, scoolCardLimitUiModel.f56670f) && C41536l.m120484d(this.f56671g, scoolCardLimitUiModel.f56671g) && this.f56672h == scoolCardLimitUiModel.f56672h;
    }

    public int hashCode() {
        int hashCode = ((((((this.f56668d * 31) + this.f56669e.hashCode()) * 31) + this.f56670f.hashCode()) * 31) + this.f56671g.hashCode()) * 31;
        boolean z = this.f56672h;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        int i = this.f56668d;
        String str = this.f56669e;
        String str2 = this.f56670f;
        String str3 = this.f56671g;
        boolean z = this.f56672h;
        return "ScoolCardLimitUiModel(id=" + i + ", prodType=" + str + ", dailyLimitType=" + str2 + ", limitTypeDesc=" + str3 + ", showFlag=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f56668d);
        parcel.writeString(this.f56669e);
        parcel.writeString(this.f56670f);
        parcel.writeString(this.f56671g);
        parcel.writeInt(this.f56672h ? 1 : 0);
    }
}
