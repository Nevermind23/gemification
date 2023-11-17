package p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.ManagerInfoUiModel */
public final class ManagerInfoUiModel implements Parcelable {
    public static final Parcelable.Creator<ManagerInfoUiModel> CREATOR = new C21777a();

    /* renamed from: d */
    private final Long f58129d;

    /* renamed from: e */
    private final String f58130e;

    /* renamed from: f */
    private final String f58131f;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.ManagerInfoUiModel$a */
    public static final class C21777a implements Parcelable.Creator {
        /* renamed from: a */
        public final ManagerInfoUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ManagerInfoUiModel(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ManagerInfoUiModel[] newArray(int i) {
            return new ManagerInfoUiModel[i];
        }
    }

    public ManagerInfoUiModel(Long l, String str, String str2) {
        this.f58129d = l;
        this.f58130e = str;
        this.f58131f = str2;
    }

    /* renamed from: a */
    public final String mo54320a() {
        return this.f58130e;
    }

    /* renamed from: b */
    public final String mo54321b() {
        return this.f58131f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagerInfoUiModel)) {
            return false;
        }
        ManagerInfoUiModel managerInfoUiModel = (ManagerInfoUiModel) obj;
        return C41536l.m120484d(this.f58129d, managerInfoUiModel.f58129d) && C41536l.m120484d(this.f58130e, managerInfoUiModel.f58130e) && C41536l.m120484d(this.f58131f, managerInfoUiModel.f58131f);
    }

    public int hashCode() {
        Long l = this.f58129d;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f58130e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58131f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        Long l = this.f58129d;
        String str = this.f58130e;
        String str2 = this.f58131f;
        return "ManagerInfoUiModel(clientKey=" + l + ", managerFirstName=" + str + ", managerPhoneNumber=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        Long l = this.f58129d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.f58130e);
        parcel.writeString(this.f58131f);
    }
}
