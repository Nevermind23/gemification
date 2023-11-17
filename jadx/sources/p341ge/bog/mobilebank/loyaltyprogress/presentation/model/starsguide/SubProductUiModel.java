package p341ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide;

import android.os.Parcel;
import android.os.Parcelable;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide.SubProductUiModel */
public final class SubProductUiModel implements Parcelable {
    public static final Parcelable.Creator<SubProductUiModel> CREATOR = new C33171a();

    /* renamed from: d */
    private final int f81249d;

    /* renamed from: e */
    private final String f81250e;

    /* renamed from: f */
    private final C24978b f81251f;

    /* renamed from: g */
    private final int f81252g;

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.model.starsguide.SubProductUiModel$a */
    public static final class C33171a implements Parcelable.Creator {
        /* renamed from: a */
        public final SubProductUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SubProductUiModel(parcel.readInt(), parcel.readString(), C24978b.valueOf(parcel.readString()), parcel.readInt());
        }

        /* renamed from: b */
        public final SubProductUiModel[] newArray(int i) {
            return new SubProductUiModel[i];
        }
    }

    public SubProductUiModel(int i, String str, C24978b bVar, int i2) {
        C41536l.m120489i(str, "labelCategoryDesc");
        C41536l.m120489i(bVar, "isActive");
        this.f81249d = i;
        this.f81250e = str;
        this.f81251f = bVar;
        this.f81252g = i2;
    }

    /* renamed from: a */
    public final int mo75418a() {
        return this.f81249d;
    }

    /* renamed from: b */
    public final String mo75419b() {
        return this.f81250e;
    }

    /* renamed from: d */
    public final C24978b mo75420d() {
        return this.f81251f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubProductUiModel)) {
            return false;
        }
        SubProductUiModel subProductUiModel = (SubProductUiModel) obj;
        return this.f81249d == subProductUiModel.f81249d && C41536l.m120484d(this.f81250e, subProductUiModel.f81250e) && this.f81251f == subProductUiModel.f81251f && this.f81252g == subProductUiModel.f81252g;
    }

    public int hashCode() {
        return (((((this.f81249d * 31) + this.f81250e.hashCode()) * 31) + this.f81251f.hashCode()) * 31) + this.f81252g;
    }

    public String toString() {
        int i = this.f81249d;
        String str = this.f81250e;
        C24978b bVar = this.f81251f;
        int i2 = this.f81252g;
        return "SubProductUiModel(categoryCoefficient=" + i + ", labelCategoryDesc=" + str + ", isActive=" + bVar + ", orderId=" + i2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f81249d);
        parcel.writeString(this.f81250e);
        parcel.writeString(this.f81251f.name());
        parcel.writeInt(this.f81252g);
    }
}
