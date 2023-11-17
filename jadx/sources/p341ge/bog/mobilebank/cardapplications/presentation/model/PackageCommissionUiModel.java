package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.PackageCommissionUiModel */
public final class PackageCommissionUiModel extends OrderCardFeesAdapterUiModel {
    public static final Parcelable.Creator<PackageCommissionUiModel> CREATOR = new C14229a();

    /* renamed from: d */
    private final double f41753d;

    /* renamed from: e */
    private final String f41754e;

    /* renamed from: f */
    private final boolean f41755f;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.PackageCommissionUiModel$a */
    public static final class C14229a implements Parcelable.Creator {
        /* renamed from: a */
        public final PackageCommissionUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new PackageCommissionUiModel(parcel.readDouble(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final PackageCommissionUiModel[] newArray(int i) {
            return new PackageCommissionUiModel[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PackageCommissionUiModel(double d, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, str, (i & 4) != 0 ? false : z);
    }

    /* renamed from: a */
    public final boolean mo39799a() {
        return this.f41755f;
    }

    /* renamed from: b */
    public final double mo39800b() {
        return this.f41753d;
    }

    /* renamed from: d */
    public final String mo39801d() {
        return this.f41754e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageCommissionUiModel)) {
            return false;
        }
        PackageCommissionUiModel packageCommissionUiModel = (PackageCommissionUiModel) obj;
        return Double.compare(this.f41753d, packageCommissionUiModel.f41753d) == 0 && C41536l.m120484d(this.f41754e, packageCommissionUiModel.f41754e) && this.f41755f == packageCommissionUiModel.f41755f;
    }

    public int hashCode() {
        int a = ((Double.doubleToLongBits(this.f41753d) * 31) + this.f41754e.hashCode()) * 31;
        boolean z = this.f41755f;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public String toString() {
        double d = this.f41753d;
        String str = this.f41754e;
        boolean z = this.f41755f;
        return "PackageCommissionUiModel(packageFeeAmount=" + d + ", packageFeeCcy=" + str + ", forDigital=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeDouble(this.f41753d);
        parcel.writeString(this.f41754e);
        parcel.writeInt(this.f41755f ? 1 : 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PackageCommissionUiModel(double d, String str, boolean z) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(str, "packageFeeCcy");
        this.f41753d = d;
        this.f41754e = str;
        this.f41755f = z;
    }
}
