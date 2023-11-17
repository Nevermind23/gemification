package p341ge.bog.mobilebank.loanactivation.presentation.subtypes.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.model.LoanSubtypeData */
public final class LoanSubtypeData implements Parcelable {
    public static final Parcelable.Creator<LoanSubtypeData> CREATOR = new C32513a();

    /* renamed from: d */
    private final String f80135d;

    /* renamed from: e */
    private final String f80136e;

    /* renamed from: f */
    private final String f80137f;

    /* renamed from: g */
    private final OfferProductCode f80138g;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.model.LoanSubtypeData$a */
    public static final class C32513a implements Parcelable.Creator {
        /* renamed from: a */
        public final LoanSubtypeData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new LoanSubtypeData(parcel.readString(), parcel.readString(), parcel.readString(), (OfferProductCode) parcel.readParcelable(LoanSubtypeData.class.getClassLoader()));
        }

        /* renamed from: b */
        public final LoanSubtypeData[] newArray(int i) {
            return new LoanSubtypeData[i];
        }
    }

    public LoanSubtypeData(String str, String str2, String str3, OfferProductCode offerProductCode) {
        C41536l.m120489i(str, "limitId");
        C41536l.m120489i(str3, "effectiveRate");
        C41536l.m120489i(offerProductCode, "productCode");
        this.f80135d = str;
        this.f80136e = str2;
        this.f80137f = str3;
        this.f80138g = offerProductCode;
    }

    /* renamed from: a */
    public final String mo73577a() {
        return this.f80137f;
    }

    /* renamed from: b */
    public final String mo73578b() {
        return this.f80135d;
    }

    /* renamed from: d */
    public final OfferProductCode mo73579d() {
        return this.f80138g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo73581e() {
        return this.f80136e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanSubtypeData)) {
            return false;
        }
        LoanSubtypeData loanSubtypeData = (LoanSubtypeData) obj;
        return C41536l.m120484d(this.f80135d, loanSubtypeData.f80135d) && C41536l.m120484d(this.f80136e, loanSubtypeData.f80136e) && C41536l.m120484d(this.f80137f, loanSubtypeData.f80137f) && C41536l.m120484d(this.f80138g, loanSubtypeData.f80138g);
    }

    public int hashCode() {
        int hashCode = this.f80135d.hashCode() * 31;
        String str = this.f80136e;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f80137f.hashCode()) * 31) + this.f80138g.hashCode();
    }

    public String toString() {
        String str = this.f80135d;
        String str2 = this.f80136e;
        String str3 = this.f80137f;
        OfferProductCode offerProductCode = this.f80138g;
        return "LoanSubtypeData(limitId=" + str + ", productName=" + str2 + ", effectiveRate=" + str3 + ", productCode=" + offerProductCode + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f80135d);
        parcel.writeString(this.f80136e);
        parcel.writeString(this.f80137f);
        parcel.writeParcelable(this.f80138g, i);
    }
}
