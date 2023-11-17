package p341ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails */
public final class ApplicationDetails implements Parcelable {
    public static final Parcelable.Creator<ApplicationDetails> CREATOR = new C22548a();

    /* renamed from: d */
    private final long f59642d;

    /* renamed from: e */
    private final long f59643e;

    /* renamed from: f */
    private final String f59644f;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.domain.prepareapplication.model.ApplicationDetails$a */
    public static final class C22548a implements Parcelable.Creator {
        /* renamed from: a */
        public final ApplicationDetails createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ApplicationDetails(parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        /* renamed from: b */
        public final ApplicationDetails[] newArray(int i) {
            return new ApplicationDetails[i];
        }
    }

    public ApplicationDetails(long j, long j2, String str) {
        this.f59642d = j;
        this.f59643e = j2;
        this.f59644f = str;
    }

    /* renamed from: a */
    public final long mo55945a() {
        return this.f59642d;
    }

    /* renamed from: b */
    public final String mo55946b() {
        return this.f59644f;
    }

    /* renamed from: d */
    public final long mo55947d() {
        return this.f59643e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationDetails)) {
            return false;
        }
        ApplicationDetails applicationDetails = (ApplicationDetails) obj;
        return this.f59642d == applicationDetails.f59642d && this.f59643e == applicationDetails.f59643e && C41536l.m120484d(this.f59644f, applicationDetails.f59644f);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f59642d) * 31) + C7397t.m28148a(this.f59643e)) * 31;
        String str = this.f59644f;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f59642d;
        long j2 = this.f59643e;
        String str = this.f59644f;
        return "ApplicationDetails(appId=" + j + ", createDate=" + j2 + ", condition=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f59642d);
        parcel.writeLong(this.f59643e);
        parcel.writeString(this.f59644f);
    }
}
