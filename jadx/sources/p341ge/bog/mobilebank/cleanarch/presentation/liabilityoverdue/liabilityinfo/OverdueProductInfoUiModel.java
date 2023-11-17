package p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import l20.C25801b;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.OverdueProductInfoUiModel */
public final class OverdueProductInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<OverdueProductInfoUiModel> CREATOR = new C21778a();

    /* renamed from: d */
    private final int f58132d;

    /* renamed from: e */
    private final C25801b f58133e;

    /* renamed from: f */
    private final String f58134f;

    /* renamed from: g */
    private final double f58135g;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.OverdueProductInfoUiModel$a */
    public static final class C21778a implements Parcelable.Creator {
        /* renamed from: a */
        public final OverdueProductInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new OverdueProductInfoUiModel(parcel.readInt(), C25801b.valueOf(parcel.readString()), parcel.readString(), parcel.readDouble());
        }

        /* renamed from: b */
        public final OverdueProductInfoUiModel[] newArray(int i) {
            return new OverdueProductInfoUiModel[i];
        }
    }

    public OverdueProductInfoUiModel(int i, C25801b bVar, String str, double d) {
        C41536l.m120489i(bVar, "type");
        C41536l.m120489i(str, "ccy");
        this.f58132d = i;
        this.f58133e = bVar;
        this.f58134f = str;
        this.f58135g = d;
    }

    /* renamed from: a */
    public final String mo54331a() {
        return this.f58134f;
    }

    /* renamed from: b */
    public final double mo54332b() {
        return this.f58135g;
    }

    /* renamed from: d */
    public final C25801b mo54333d() {
        return this.f58133e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverdueProductInfoUiModel)) {
            return false;
        }
        OverdueProductInfoUiModel overdueProductInfoUiModel = (OverdueProductInfoUiModel) obj;
        return this.f58132d == overdueProductInfoUiModel.f58132d && this.f58133e == overdueProductInfoUiModel.f58133e && C41536l.m120484d(this.f58134f, overdueProductInfoUiModel.f58134f) && Double.compare(this.f58135g, overdueProductInfoUiModel.f58135g) == 0;
    }

    public int hashCode() {
        return (((((this.f58132d * 31) + this.f58133e.hashCode()) * 31) + this.f58134f.hashCode()) * 31) + Double.doubleToLongBits(this.f58135g);
    }

    public String toString() {
        int i = this.f58132d;
        C25801b bVar = this.f58133e;
        String str = this.f58134f;
        double d = this.f58135g;
        return "OverdueProductInfoUiModel(id=" + i + ", type=" + bVar + ", ccy=" + str + ", overdueAmount=" + d + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f58132d);
        parcel.writeString(this.f58133e.name());
        parcel.writeString(this.f58134f);
        parcel.writeDouble(this.f58135g);
    }
}
