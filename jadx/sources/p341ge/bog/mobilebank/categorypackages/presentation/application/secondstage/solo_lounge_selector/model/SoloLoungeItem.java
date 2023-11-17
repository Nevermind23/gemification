package p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SoloLoungeItem */
public final class SoloLoungeItem implements Parcelable {
    public static final Parcelable.Creator<SoloLoungeItem> CREATOR = new C14567a();

    /* renamed from: d */
    private final long f42443d;

    /* renamed from: e */
    private final String f42444e;

    /* renamed from: f */
    private final String f42445f;

    /* renamed from: g */
    private final String f42446g;

    /* renamed from: h */
    private final String f42447h;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.secondstage.solo_lounge_selector.model.SoloLoungeItem$a */
    public static final class C14567a implements Parcelable.Creator {
        /* renamed from: a */
        public final SoloLoungeItem createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SoloLoungeItem(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final SoloLoungeItem[] newArray(int i) {
            return new SoloLoungeItem[i];
        }
    }

    public SoloLoungeItem(long j, String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "name");
        this.f42443d = j;
        this.f42444e = str;
        this.f42445f = str2;
        this.f42446g = str3;
        this.f42447h = str4;
    }

    /* renamed from: a */
    public final String mo40891a() {
        return this.f42447h;
    }

    /* renamed from: b */
    public final String mo40892b() {
        return this.f42446g;
    }

    /* renamed from: d */
    public final long mo40893d() {
        return this.f42443d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo40895e() {
        return this.f42444e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoloLoungeItem)) {
            return false;
        }
        SoloLoungeItem soloLoungeItem = (SoloLoungeItem) obj;
        return this.f42443d == soloLoungeItem.f42443d && C41536l.m120484d(this.f42444e, soloLoungeItem.f42444e) && C41536l.m120484d(this.f42445f, soloLoungeItem.f42445f) && C41536l.m120484d(this.f42446g, soloLoungeItem.f42446g) && C41536l.m120484d(this.f42447h, soloLoungeItem.f42447h);
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f42443d) * 31) + this.f42444e.hashCode()) * 31;
        String str = this.f42445f;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42446g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42447h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        long j = this.f42443d;
        String str = this.f42444e;
        String str2 = this.f42445f;
        String str3 = this.f42446g;
        String str4 = this.f42447h;
        return "SoloLoungeItem(id=" + j + ", name=" + str + ", desc=" + str2 + ", childKey=" + str3 + ", childDesc=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f42443d);
        parcel.writeString(this.f42444e);
        parcel.writeString(this.f42445f);
        parcel.writeString(this.f42446g);
        parcel.writeString(this.f42447h);
    }
}
