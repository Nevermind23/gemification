package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.plustransfer;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.plustransfer.ClientInitialsUIModel */
public final class ClientInitialsUIModel implements Parcelable {
    public static final Parcelable.Creator<ClientInitialsUIModel> CREATOR = new C33117a();

    /* renamed from: d */
    private final String f81117d;

    /* renamed from: e */
    private final String f81118e;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.plustransfer.ClientInitialsUIModel$a */
    public static final class C33117a implements Parcelable.Creator {
        /* renamed from: a */
        public final ClientInitialsUIModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ClientInitialsUIModel(parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ClientInitialsUIModel[] newArray(int i) {
            return new ClientInitialsUIModel[i];
        }
    }

    public ClientInitialsUIModel(String str, String str2) {
        C41536l.m120489i(str, "pin");
        C41536l.m120489i(str2, "initials");
        this.f81117d = str;
        this.f81118e = str2;
    }

    /* renamed from: a */
    public final String mo75204a() {
        return this.f81118e;
    }

    /* renamed from: b */
    public final String mo75205b() {
        return this.f81117d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientInitialsUIModel)) {
            return false;
        }
        ClientInitialsUIModel clientInitialsUIModel = (ClientInitialsUIModel) obj;
        return C41536l.m120484d(this.f81117d, clientInitialsUIModel.f81117d) && C41536l.m120484d(this.f81118e, clientInitialsUIModel.f81118e);
    }

    public int hashCode() {
        return (this.f81117d.hashCode() * 31) + this.f81118e.hashCode();
    }

    public String toString() {
        String str = this.f81117d;
        String str2 = this.f81118e;
        return "ClientInitialsUIModel(pin=" + str + ", initials=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81117d);
        parcel.writeString(this.f81118e);
    }
}
