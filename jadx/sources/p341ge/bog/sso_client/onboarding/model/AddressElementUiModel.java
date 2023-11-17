package p341ge.bog.sso_client.onboarding.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.onboarding.model.AddressElementUiModel */
public final class AddressElementUiModel implements Parcelable {
    public static final Parcelable.Creator<AddressElementUiModel> CREATOR = new C35982a();

    /* renamed from: d */
    private final String f87050d;

    /* renamed from: e */
    private final String f87051e;

    /* renamed from: ge.bog.sso_client.onboarding.model.AddressElementUiModel$a */
    public static final class C35982a implements Parcelable.Creator {
        /* renamed from: a */
        public final AddressElementUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new AddressElementUiModel(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final AddressElementUiModel[] newArray(int i) {
            return new AddressElementUiModel[i];
        }
    }

    public AddressElementUiModel(String str, String str2) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        C41536l.m120489i(str2, "description");
        this.f87050d = str;
        this.f87051e = str2;
    }

    /* renamed from: a */
    public final String mo88603a() {
        return this.f87051e;
    }

    /* renamed from: b */
    public final String mo88604b() {
        return this.f87050d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressElementUiModel)) {
            return false;
        }
        AddressElementUiModel addressElementUiModel = (AddressElementUiModel) obj;
        return C41536l.m120484d(this.f87050d, addressElementUiModel.f87050d) && C41536l.m120484d(this.f87051e, addressElementUiModel.f87051e);
    }

    public int hashCode() {
        return (this.f87050d.hashCode() * 31) + this.f87051e.hashCode();
    }

    public String toString() {
        return "AddressElementUiModel(value=" + this.f87050d + ", description=" + this.f87051e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f87050d);
        parcel.writeString(this.f87051e);
    }
}
