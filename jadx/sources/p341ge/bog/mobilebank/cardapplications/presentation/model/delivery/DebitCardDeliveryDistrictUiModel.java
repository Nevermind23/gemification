package p341ge.bog.mobilebank.cardapplications.presentation.model.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel */
public final class DebitCardDeliveryDistrictUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardDeliveryDistrictUiModel> CREATOR = new C14237a();

    /* renamed from: d */
    private final String f41828d;

    /* renamed from: e */
    private final long f41829e;

    /* renamed from: f */
    private final long f41830f;

    /* renamed from: g */
    private final String f41831g;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.delivery.DebitCardDeliveryDistrictUiModel$a */
    public static final class C14237a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardDeliveryDistrictUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardDeliveryDistrictUiModel(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardDeliveryDistrictUiModel[] newArray(int i) {
            return new DebitCardDeliveryDistrictUiModel[i];
        }
    }

    public DebitCardDeliveryDistrictUiModel(String str, long j, long j2, String str2) {
        C41536l.m120489i(str, "districtName");
        this.f41828d = str;
        this.f41829e = j;
        this.f41830f = j2;
        this.f41831g = str2;
    }

    /* renamed from: a */
    public final String mo39912a() {
        return this.f41831g;
    }

    /* renamed from: b */
    public final String mo39913b() {
        return this.f41828d;
    }

    /* renamed from: d */
    public final long mo39914d() {
        return this.f41829e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardDeliveryDistrictUiModel)) {
            return false;
        }
        DebitCardDeliveryDistrictUiModel debitCardDeliveryDistrictUiModel = (DebitCardDeliveryDistrictUiModel) obj;
        return C41536l.m120484d(this.f41828d, debitCardDeliveryDistrictUiModel.f41828d) && this.f41829e == debitCardDeliveryDistrictUiModel.f41829e && this.f41830f == debitCardDeliveryDistrictUiModel.f41830f && C41536l.m120484d(this.f41831g, debitCardDeliveryDistrictUiModel.f41831g);
    }

    public int hashCode() {
        int hashCode = ((((this.f41828d.hashCode() * 31) + C7397t.m28148a(this.f41829e)) * 31) + C7397t.m28148a(this.f41830f)) * 31;
        String str = this.f41831g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f41828d;
        long j = this.f41829e;
        long j2 = this.f41830f;
        String str2 = this.f41831g;
        return "DebitCardDeliveryDistrictUiModel(districtName=" + str + ", id=" + j + ", city=" + j2 + ", csDefaultDepartment=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41828d);
        parcel.writeLong(this.f41829e);
        parcel.writeLong(this.f41830f);
        parcel.writeString(this.f41831g);
    }
}
