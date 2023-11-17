package p341ge.bog.mobilebank.depositapplication.presentation.applicationresult;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultArgs */
public final class DepositApplicationResultArgs implements Parcelable {
    public static final Parcelable.Creator<DepositApplicationResultArgs> CREATOR = new C22839a();

    /* renamed from: d */
    private final String f60188d;

    /* renamed from: e */
    private final String f60189e;

    /* renamed from: f */
    private final String f60190f;

    /* renamed from: g */
    private final String f60191g;

    /* renamed from: h */
    private final String f60192h;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultArgs$a */
    public static final class C22839a implements Parcelable.Creator {
        /* renamed from: a */
        public final DepositApplicationResultArgs createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new DepositApplicationResultArgs(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final DepositApplicationResultArgs[] newArray(int i) {
            return new DepositApplicationResultArgs[i];
        }
    }

    public DepositApplicationResultArgs(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "mainTextKey");
        C41536l.m120489i(str2, "homeButtonKey");
        C41536l.m120489i(str3, "amount");
        C41536l.m120489i(str4, "interest");
        C41536l.m120489i(str5, "terms");
        this.f60188d = str;
        this.f60189e = str2;
        this.f60190f = str3;
        this.f60191g = str4;
        this.f60192h = str5;
    }

    /* renamed from: a */
    public final String mo56895a() {
        return this.f60190f;
    }

    /* renamed from: b */
    public final String mo56896b() {
        return this.f60189e;
    }

    /* renamed from: d */
    public final String mo56897d() {
        return this.f60191g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo56899e() {
        return this.f60188d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositApplicationResultArgs)) {
            return false;
        }
        DepositApplicationResultArgs depositApplicationResultArgs = (DepositApplicationResultArgs) obj;
        return C41536l.m120484d(this.f60188d, depositApplicationResultArgs.f60188d) && C41536l.m120484d(this.f60189e, depositApplicationResultArgs.f60189e) && C41536l.m120484d(this.f60190f, depositApplicationResultArgs.f60190f) && C41536l.m120484d(this.f60191g, depositApplicationResultArgs.f60191g) && C41536l.m120484d(this.f60192h, depositApplicationResultArgs.f60192h);
    }

    /* renamed from: f */
    public final String mo56901f() {
        return this.f60192h;
    }

    public int hashCode() {
        return (((((((this.f60188d.hashCode() * 31) + this.f60189e.hashCode()) * 31) + this.f60190f.hashCode()) * 31) + this.f60191g.hashCode()) * 31) + this.f60192h.hashCode();
    }

    public String toString() {
        String str = this.f60188d;
        String str2 = this.f60189e;
        String str3 = this.f60190f;
        String str4 = this.f60191g;
        String str5 = this.f60192h;
        return "DepositApplicationResultArgs(mainTextKey=" + str + ", homeButtonKey=" + str2 + ", amount=" + str3 + ", interest=" + str4 + ", terms=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f60188d);
        parcel.writeString(this.f60189e);
        parcel.writeString(this.f60190f);
        parcel.writeString(this.f60191g);
        parcel.writeString(this.f60192h);
    }
}
