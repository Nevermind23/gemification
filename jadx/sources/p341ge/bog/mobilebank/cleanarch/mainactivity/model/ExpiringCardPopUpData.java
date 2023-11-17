package p341ge.bog.mobilebank.cleanarch.mainactivity.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData */
public final class ExpiringCardPopUpData implements Parcelable {
    public static final Parcelable.Creator<ExpiringCardPopUpData> CREATOR = new C21156a();

    /* renamed from: d */
    private final long f56830d;

    /* renamed from: e */
    private final String f56831e;

    /* renamed from: f */
    private final int f56832f;

    /* renamed from: g */
    private final String f56833g;

    /* renamed from: h */
    private final boolean f56834h;

    /* renamed from: ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData$a */
    public static final class C21156a implements Parcelable.Creator {
        /* renamed from: a */
        public final ExpiringCardPopUpData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ExpiringCardPopUpData(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final ExpiringCardPopUpData[] newArray(int i) {
            return new ExpiringCardPopUpData[i];
        }
    }

    public ExpiringCardPopUpData(long j, String str, int i, String str2, boolean z) {
        C41536l.m120489i(str, "title");
        this.f56830d = j;
        this.f56831e = str;
        this.f56832f = i;
        this.f56833g = str2;
        this.f56834h = z;
    }

    /* renamed from: a */
    public final long mo52881a() {
        return this.f56830d;
    }

    /* renamed from: b */
    public final String mo52882b() {
        return this.f56833g;
    }

    /* renamed from: d */
    public final int mo52883d() {
        return this.f56832f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo52885e() {
        return this.f56834h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpiringCardPopUpData)) {
            return false;
        }
        ExpiringCardPopUpData expiringCardPopUpData = (ExpiringCardPopUpData) obj;
        return this.f56830d == expiringCardPopUpData.f56830d && C41536l.m120484d(this.f56831e, expiringCardPopUpData.f56831e) && this.f56832f == expiringCardPopUpData.f56832f && C41536l.m120484d(this.f56833g, expiringCardPopUpData.f56833g) && this.f56834h == expiringCardPopUpData.f56834h;
    }

    /* renamed from: f */
    public final String mo52887f() {
        return this.f56831e;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f56830d) * 31) + this.f56831e.hashCode()) * 31) + this.f56832f) * 31;
        String str = this.f56833g;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f56834h;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        long j = this.f56830d;
        String str = this.f56831e;
        int i = this.f56832f;
        String str2 = this.f56833g;
        boolean z = this.f56834h;
        return "ExpiringCardPopUpData(cardId=" + j + ", title=" + str + ", placeHolderImageRes=" + i + ", imageUrl=" + str2 + ", showPopup=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f56830d);
        parcel.writeString(this.f56831e);
        parcel.writeInt(this.f56832f);
        parcel.writeString(this.f56833g);
        parcel.writeInt(this.f56834h ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpiringCardPopUpData(long j, String str, int i, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? false : z);
    }
}
