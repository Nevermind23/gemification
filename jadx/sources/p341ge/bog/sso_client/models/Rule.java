package p341ge.bog.sso_client.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.sso_client.models.Rule */
public final class Rule implements Parcelable {
    public static final Parcelable.Creator<Rule> CREATOR = new C35929a();

    /* renamed from: d */
    private final String f86905d;

    /* renamed from: e */
    private final Boolean f86906e;

    /* renamed from: f */
    private final String f86907f;

    /* renamed from: g */
    private final String f86908g;

    /* renamed from: h */
    private final Boolean f86909h;

    /* renamed from: ge.bog.sso_client.models.Rule$a */
    public static final class C35929a implements Parcelable.Creator {
        /* renamed from: a */
        public final Rule createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = true;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            }
            return new Rule(readString, bool, readString2, readString3, bool2);
        }

        /* renamed from: b */
        public final Rule[] newArray(int i) {
            return new Rule[i];
        }
    }

    public Rule(String str, Boolean bool, String str2, String str3, Boolean bool2) {
        this.f86905d = str;
        this.f86906e = bool;
        this.f86907f = str2;
        this.f86908g = str3;
        this.f86909h = bool2;
    }

    /* renamed from: a */
    public final String mo88313a() {
        return this.f86905d;
    }

    /* renamed from: b */
    public final String mo88314b() {
        return this.f86907f;
    }

    /* renamed from: d */
    public final String mo88315d() {
        return this.f86908g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Boolean mo88317e() {
        return this.f86909h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        return C41536l.m120484d(this.f86905d, rule.f86905d) && C41536l.m120484d(this.f86906e, rule.f86906e) && C41536l.m120484d(this.f86907f, rule.f86907f) && C41536l.m120484d(this.f86908g, rule.f86908g) && C41536l.m120484d(this.f86909h, rule.f86909h);
    }

    /* renamed from: f */
    public final Boolean mo88319f() {
        return this.f86906e;
    }

    public int hashCode() {
        String str = this.f86905d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f86906e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f86907f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86908g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f86909h;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "Rule(description=" + this.f86905d + ", isInversiveRegEx=" + this.f86906e + ", regEx=" + this.f86907f + ", ruleKey=" + this.f86908g + ", showCondition=" + this.f86909h + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f86905d);
        Boolean bool = this.f86906e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.f86907f);
        parcel.writeString(this.f86908g);
        Boolean bool2 = this.f86909h;
        if (bool2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool2.booleanValue() ? 1 : 0);
    }
}
