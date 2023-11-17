package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p537nm.C17081e0;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel */
public final class DebitCardPinDeliveryTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<DebitCardPinDeliveryTypeUiModel> CREATOR = new C14216a();

    /* renamed from: d */
    private final String f41701d;

    /* renamed from: e */
    private final String f41702e;

    /* renamed from: f */
    private final C17081e0 f41703f;

    /* renamed from: g */
    private final String f41704g;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel$a */
    public static final class C14216a implements Parcelable.Creator {
        /* renamed from: a */
        public final DebitCardPinDeliveryTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DebitCardPinDeliveryTypeUiModel(parcel.readString(), parcel.readString(), C17081e0.valueOf(parcel.readString()), parcel.readString());
        }

        /* renamed from: b */
        public final DebitCardPinDeliveryTypeUiModel[] newArray(int i) {
            return new DebitCardPinDeliveryTypeUiModel[i];
        }
    }

    public DebitCardPinDeliveryTypeUiModel(String str, String str2, C17081e0 e0Var, String str3) {
        C41536l.m120489i(str, "plcClass");
        C41536l.m120489i(str2, "plcType");
        C41536l.m120489i(e0Var, "deliveryType");
        C41536l.m120489i(str3, "dictionaryKey");
        this.f41701d = str;
        this.f41702e = str2;
        this.f41703f = e0Var;
        this.f41704g = str3;
    }

    /* renamed from: a */
    public final C17081e0 mo39561a() {
        return this.f41703f;
    }

    /* renamed from: b */
    public final String mo39562b() {
        return this.f41704g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebitCardPinDeliveryTypeUiModel)) {
            return false;
        }
        DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel = (DebitCardPinDeliveryTypeUiModel) obj;
        return C41536l.m120484d(this.f41701d, debitCardPinDeliveryTypeUiModel.f41701d) && C41536l.m120484d(this.f41702e, debitCardPinDeliveryTypeUiModel.f41702e) && this.f41703f == debitCardPinDeliveryTypeUiModel.f41703f && C41536l.m120484d(this.f41704g, debitCardPinDeliveryTypeUiModel.f41704g);
    }

    public int hashCode() {
        return (((((this.f41701d.hashCode() * 31) + this.f41702e.hashCode()) * 31) + this.f41703f.hashCode()) * 31) + this.f41704g.hashCode();
    }

    public String toString() {
        String str = this.f41701d;
        String str2 = this.f41702e;
        C17081e0 e0Var = this.f41703f;
        String str3 = this.f41704g;
        return "DebitCardPinDeliveryTypeUiModel(plcClass=" + str + ", plcType=" + str2 + ", deliveryType=" + e0Var + ", dictionaryKey=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41701d);
        parcel.writeString(this.f41702e);
        parcel.writeString(this.f41703f.name());
        parcel.writeString(this.f41704g);
    }
}
