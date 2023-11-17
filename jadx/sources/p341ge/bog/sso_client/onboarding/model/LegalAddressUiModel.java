package p341ge.bog.sso_client.onboarding.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.sso_client.onboarding.model.LegalAddressUiModel */
public final class LegalAddressUiModel implements Parcelable {
    public static final Parcelable.Creator<LegalAddressUiModel> CREATOR = new C35986a();

    /* renamed from: d */
    private final AddressUiModel f87071d;

    /* renamed from: ge.bog.sso_client.onboarding.model.LegalAddressUiModel$a */
    public static final class C35986a implements Parcelable.Creator {
        /* renamed from: a */
        public final LegalAddressUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new LegalAddressUiModel(parcel.readInt() == 0 ? null : AddressUiModel.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public final LegalAddressUiModel[] newArray(int i) {
            return new LegalAddressUiModel[i];
        }
    }

    public LegalAddressUiModel() {
        this((AddressUiModel) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final AddressUiModel mo88645a() {
        return this.f87071d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LegalAddressUiModel) && C41536l.m120484d(this.f87071d, ((LegalAddressUiModel) obj).f87071d);
    }

    public int hashCode() {
        AddressUiModel addressUiModel = this.f87071d;
        if (addressUiModel == null) {
            return 0;
        }
        return addressUiModel.hashCode();
    }

    public String toString() {
        return "LegalAddressUiModel(address=" + this.f87071d + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        AddressUiModel addressUiModel = this.f87071d;
        if (addressUiModel == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        addressUiModel.writeToParcel(parcel, i);
    }

    public LegalAddressUiModel(AddressUiModel addressUiModel) {
        this.f87071d = addressUiModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LegalAddressUiModel(AddressUiModel addressUiModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addressUiModel);
    }
}
