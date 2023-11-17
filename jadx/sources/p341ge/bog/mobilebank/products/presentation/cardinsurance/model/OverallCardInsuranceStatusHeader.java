package p341ge.bog.mobilebank.products.presentation.cardinsurance.model;

import android.os.Parcel;
import android.os.Parcelable;
import ez0.C31898d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.model.OverallCardInsuranceStatusHeader */
public final class OverallCardInsuranceStatusHeader extends CardInsuranceStatusAdapterItem {
    public static final Parcelable.Creator<OverallCardInsuranceStatusHeader> CREATOR = new C33885a();

    /* renamed from: d */
    private final C31898d f82489d;

    /* renamed from: e */
    private final boolean f82490e;

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.model.OverallCardInsuranceStatusHeader$a */
    public static final class C33885a implements Parcelable.Creator {
        /* renamed from: a */
        public final OverallCardInsuranceStatusHeader createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new OverallCardInsuranceStatusHeader(C31898d.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final OverallCardInsuranceStatusHeader[] newArray(int i) {
            return new OverallCardInsuranceStatusHeader[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverallCardInsuranceStatusHeader(C31898d dVar, boolean z) {
        super((DefaultConstructorMarker) null);
        C41536l.m120489i(dVar, "overallStatus");
        this.f82489d = dVar;
        this.f82490e = z;
    }

    /* renamed from: a */
    public final C31898d mo82070a() {
        return this.f82489d;
    }

    /* renamed from: b */
    public final String mo82071b() {
        return this.f82489d.mo72331c(this.f82490e);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverallCardInsuranceStatusHeader)) {
            return false;
        }
        OverallCardInsuranceStatusHeader overallCardInsuranceStatusHeader = (OverallCardInsuranceStatusHeader) obj;
        return this.f82489d == overallCardInsuranceStatusHeader.f82489d && this.f82490e == overallCardInsuranceStatusHeader.f82490e;
    }

    public int hashCode() {
        int hashCode = this.f82489d.hashCode() * 31;
        boolean z = this.f82490e;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        C31898d dVar = this.f82489d;
        boolean z = this.f82490e;
        return "OverallCardInsuranceStatusHeader(overallStatus=" + dVar + ", isSingleCard=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f82489d.name());
        parcel.writeInt(this.f82490e ? 1 : 0);
    }
}
