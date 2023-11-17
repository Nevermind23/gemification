package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.VisaConciergeType */
public final class VisaConciergeType implements Parcelable {
    public static final Parcelable.Creator<VisaConciergeType> CREATOR = new C14638a();

    /* renamed from: d */
    private final String f42568d;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.VisaConciergeType$a */
    public static final class C14638a implements Parcelable.Creator {
        /* renamed from: a */
        public final VisaConciergeType createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new VisaConciergeType(parcel.readString());
        }

        /* renamed from: b */
        public final VisaConciergeType[] newArray(int i) {
            return new VisaConciergeType[i];
        }
    }

    public VisaConciergeType(String str) {
        C41536l.m120489i(str, "type");
        this.f42568d = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VisaConciergeType) && C41536l.m120484d(this.f42568d, ((VisaConciergeType) obj).f42568d);
    }

    public int hashCode() {
        return this.f42568d.hashCode();
    }

    public String toString() {
        String str = this.f42568d;
        return "VisaConciergeType(type=" + str + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f42568d);
    }
}
