package p341ge.bog.sso_client.onboarding.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.onboarding.model.AddressUiModel */
public final class AddressUiModel implements Parcelable {
    public static final Parcelable.Creator<AddressUiModel> CREATOR = new C35983a();

    /* renamed from: d */
    private final AddressElementUiModel f87052d;

    /* renamed from: e */
    private final AddressElementUiModel f87053e;

    /* renamed from: f */
    private final String f87054f;

    /* renamed from: ge.bog.sso_client.onboarding.model.AddressUiModel$a */
    public static final class C35983a implements Parcelable.Creator {
        /* renamed from: a */
        public final AddressUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            Parcelable.Creator<AddressElementUiModel> creator = AddressElementUiModel.CREATOR;
            return new AddressUiModel(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString());
        }

        /* renamed from: b */
        public final AddressUiModel[] newArray(int i) {
            return new AddressUiModel[i];
        }
    }

    public AddressUiModel(AddressElementUiModel addressElementUiModel, AddressElementUiModel addressElementUiModel2, String str) {
        C41536l.m120489i(addressElementUiModel, "country");
        C41536l.m120489i(addressElementUiModel2, "region");
        C41536l.m120489i(str, "addressLine");
        this.f87052d = addressElementUiModel;
        this.f87053e = addressElementUiModel2;
        this.f87054f = str;
    }

    /* renamed from: b */
    public static /* synthetic */ AddressUiModel m107111b(AddressUiModel addressUiModel, AddressElementUiModel addressElementUiModel, AddressElementUiModel addressElementUiModel2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            addressElementUiModel = addressUiModel.f87052d;
        }
        if ((i & 2) != 0) {
            addressElementUiModel2 = addressUiModel.f87053e;
        }
        if ((i & 4) != 0) {
            str = addressUiModel.f87054f;
        }
        return addressUiModel.mo88614a(addressElementUiModel, addressElementUiModel2, str);
    }

    /* renamed from: a */
    public final AddressUiModel mo88614a(AddressElementUiModel addressElementUiModel, AddressElementUiModel addressElementUiModel2, String str) {
        C41536l.m120489i(addressElementUiModel, "country");
        C41536l.m120489i(addressElementUiModel2, "region");
        C41536l.m120489i(str, "addressLine");
        return new AddressUiModel(addressElementUiModel, addressElementUiModel2, str);
    }

    /* renamed from: d */
    public final String mo88615d() {
        return this.f87054f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final AddressElementUiModel mo88617e() {
        return this.f87052d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressUiModel)) {
            return false;
        }
        AddressUiModel addressUiModel = (AddressUiModel) obj;
        return C41536l.m120484d(this.f87052d, addressUiModel.f87052d) && C41536l.m120484d(this.f87053e, addressUiModel.f87053e) && C41536l.m120484d(this.f87054f, addressUiModel.f87054f);
    }

    /* renamed from: f */
    public final AddressElementUiModel mo88619f() {
        return this.f87053e;
    }

    public int hashCode() {
        return (((this.f87052d.hashCode() * 31) + this.f87053e.hashCode()) * 31) + this.f87054f.hashCode();
    }

    public String toString() {
        return "AddressUiModel(country=" + this.f87052d + ", region=" + this.f87053e + ", addressLine=" + this.f87054f + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f87052d.writeToParcel(parcel, i);
        this.f87053e.writeToParcel(parcel, i);
        parcel.writeString(this.f87054f);
    }
}
