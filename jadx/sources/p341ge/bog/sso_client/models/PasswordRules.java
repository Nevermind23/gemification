package p341ge.bog.sso_client.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.PasswordRules */
public final class PasswordRules implements Parcelable {
    public static final Parcelable.Creator<PasswordRules> CREATOR = new C35927a();

    /* renamed from: d */
    private final List f86897d;

    /* renamed from: e */
    private final List f86898e;

    /* renamed from: ge.bog.sso_client.models.PasswordRules$a */
    public static final class C35927a implements Parcelable.Creator {
        /* renamed from: a */
        public final PasswordRules createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Level.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(Rule.CREATOR.createFromParcel(parcel));
            }
            return new PasswordRules(arrayList, arrayList2);
        }

        /* renamed from: b */
        public final PasswordRules[] newArray(int i) {
            return new PasswordRules[i];
        }
    }

    public PasswordRules(List list, List list2) {
        C41536l.m120489i(list, "levels");
        C41536l.m120489i(list2, "rules");
        this.f86897d = list;
        this.f86898e = list2;
    }

    /* renamed from: a */
    public final List mo88288a() {
        return this.f86897d;
    }

    /* renamed from: b */
    public final List mo88289b() {
        return this.f86898e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordRules)) {
            return false;
        }
        PasswordRules passwordRules = (PasswordRules) obj;
        return C41536l.m120484d(this.f86897d, passwordRules.f86897d) && C41536l.m120484d(this.f86898e, passwordRules.f86898e);
    }

    public int hashCode() {
        return (this.f86897d.hashCode() * 31) + this.f86898e.hashCode();
    }

    public String toString() {
        return "PasswordRules(levels=" + this.f86897d + ", rules=" + this.f86898e + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<Level> list = this.f86897d;
        parcel.writeInt(list.size());
        for (Level writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        List<Rule> list2 = this.f86898e;
        parcel.writeInt(list2.size());
        for (Rule writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
    }
}
