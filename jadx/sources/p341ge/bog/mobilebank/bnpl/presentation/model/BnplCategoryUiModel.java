package p341ge.bog.mobilebank.bnpl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.model.BnplCategoryUiModel */
public final class BnplCategoryUiModel implements Parcelable {
    public static final Parcelable.Creator<BnplCategoryUiModel> CREATOR = new C13878a();

    /* renamed from: d */
    private long f41202d;

    /* renamed from: e */
    private String f41203e;

    /* renamed from: f */
    private String f41204f;

    /* renamed from: g */
    private String f41205g;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.model.BnplCategoryUiModel$a */
    public static final class C13878a implements Parcelable.Creator {
        /* renamed from: a */
        public final BnplCategoryUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BnplCategoryUiModel(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BnplCategoryUiModel[] newArray(int i) {
            return new BnplCategoryUiModel[i];
        }
    }

    public BnplCategoryUiModel(long j, String str, String str2, String str3) {
        C41536l.m120489i(str, "categoryDesc");
        C41536l.m120489i(str2, "categoryDescEn");
        C41536l.m120489i(str3, "categoryNameKey");
        this.f41202d = j;
        this.f41203e = str;
        this.f41204f = str2;
        this.f41205g = str3;
    }

    /* renamed from: a */
    public final String mo38280a() {
        return this.f41203e;
    }

    /* renamed from: b */
    public final String mo38281b() {
        return this.f41204f;
    }

    /* renamed from: d */
    public final long mo38282d() {
        return this.f41202d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplCategoryUiModel)) {
            return false;
        }
        BnplCategoryUiModel bnplCategoryUiModel = (BnplCategoryUiModel) obj;
        return this.f41202d == bnplCategoryUiModel.f41202d && C41536l.m120484d(this.f41203e, bnplCategoryUiModel.f41203e) && C41536l.m120484d(this.f41204f, bnplCategoryUiModel.f41204f) && C41536l.m120484d(this.f41205g, bnplCategoryUiModel.f41205g);
    }

    public int hashCode() {
        return (((((C7397t.m28148a(this.f41202d) * 31) + this.f41203e.hashCode()) * 31) + this.f41204f.hashCode()) * 31) + this.f41205g.hashCode();
    }

    public String toString() {
        long j = this.f41202d;
        String str = this.f41203e;
        String str2 = this.f41204f;
        String str3 = this.f41205g;
        return "BnplCategoryUiModel(categoryId=" + j + ", categoryDesc=" + str + ", categoryDescEn=" + str2 + ", categoryNameKey=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f41202d);
        parcel.writeString(this.f41203e);
        parcel.writeString(this.f41204f);
        parcel.writeString(this.f41205g);
    }
}
