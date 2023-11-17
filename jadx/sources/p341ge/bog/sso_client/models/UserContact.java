package p341ge.bog.sso_client.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sso.type.UserContactType;

/* renamed from: ge.bog.sso_client.models.UserContact */
public final class UserContact implements Parcelable {
    public static final Parcelable.Creator<UserContact> CREATOR = new C35931a();

    /* renamed from: d */
    private final String f86911d;

    /* renamed from: e */
    private final UserContactType f86912e;

    /* renamed from: f */
    private final String f86913f;

    /* renamed from: g */
    private final Boolean f86914g;

    /* renamed from: h */
    private final Boolean f86915h;

    /* renamed from: ge.bog.sso_client.models.UserContact$a */
    public static final class C35931a implements Parcelable.Creator {
        /* renamed from: a */
        public final UserContact createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            UserContactType valueOf = parcel.readInt() == 0 ? null : UserContactType.valueOf(parcel.readString());
            String readString2 = parcel.readString();
            boolean z = true;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            return new UserContact(readString, valueOf, readString2, bool, bool2);
        }

        /* renamed from: b */
        public final UserContact[] newArray(int i) {
            return new UserContact[i];
        }
    }

    public UserContact(String str, UserContactType userContactType, String str2, Boolean bool, Boolean bool2) {
        this.f86911d = str;
        this.f86912e = userContactType;
        this.f86913f = str2;
        this.f86914g = bool;
        this.f86915h = bool2;
    }

    /* renamed from: a */
    public final String mo88418a() {
        return this.f86913f;
    }

    /* renamed from: b */
    public final Boolean mo88419b() {
        return this.f86914g;
    }

    /* renamed from: d */
    public final String mo88420d() {
        return this.f86911d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Boolean mo88422e() {
        return this.f86915h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserContact)) {
            return false;
        }
        UserContact userContact = (UserContact) obj;
        return C41536l.m120484d(this.f86911d, userContact.f86911d) && this.f86912e == userContact.f86912e && C41536l.m120484d(this.f86913f, userContact.f86913f) && C41536l.m120484d(this.f86914g, userContact.f86914g) && C41536l.m120484d(this.f86915h, userContact.f86915h);
    }

    /* renamed from: f */
    public final UserContactType mo88424f() {
        return this.f86912e;
    }

    public int hashCode() {
        String str = this.f86911d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserContactType userContactType = this.f86912e;
        int hashCode2 = (hashCode + (userContactType == null ? 0 : userContactType.hashCode())) * 31;
        String str2 = this.f86913f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f86914g;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f86915h;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "UserContact(id=" + this.f86911d + ", type=" + this.f86912e + ", contact=" + this.f86913f + ", financial=" + this.f86914g + ", preselected=" + this.f86915h + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f86911d);
        UserContactType userContactType = this.f86912e;
        if (userContactType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(userContactType.name());
        }
        parcel.writeString(this.f86913f);
        Boolean bool = this.f86914g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f86915h;
        if (bool2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool2.booleanValue() ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserContact(String str, UserContactType userContactType, String str2, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, userContactType, str2, bool, (i & 16) != 0 ? Boolean.FALSE : bool2);
    }
}
