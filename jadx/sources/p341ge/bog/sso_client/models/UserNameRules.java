package p341ge.bog.sso_client.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.UserNameRules */
public final class UserNameRules implements Parcelable {
    public static final Parcelable.Creator<UserNameRules> CREATOR = new C35932a();

    /* renamed from: d */
    private final List f86916d;

    /* renamed from: ge.bog.sso_client.models.UserNameRules$a */
    public static final class C35932a implements Parcelable.Creator {
        /* renamed from: a */
        public final UserNameRules createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Rule.CREATOR.createFromParcel(parcel));
            }
            return new UserNameRules(arrayList);
        }

        /* renamed from: b */
        public final UserNameRules[] newArray(int i) {
            return new UserNameRules[i];
        }
    }

    public UserNameRules(List list) {
        C41536l.m120489i(list, "rules");
        this.f86916d = list;
    }

    /* renamed from: a */
    public final List mo88432a() {
        return this.f86916d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserNameRules) && C41536l.m120484d(this.f86916d, ((UserNameRules) obj).f86916d);
    }

    public int hashCode() {
        return this.f86916d.hashCode();
    }

    public String toString() {
        return "UserNameRules(rules=" + this.f86916d + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<Rule> list = this.f86916d;
        parcel.writeInt(list.size());
        for (Rule writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
