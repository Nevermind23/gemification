package p341ge.bog.mobilebank.payments.presentation.form.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData */
public final class SelectElementViewData implements Parcelable {
    public static final Parcelable.Creator<SelectElementViewData> CREATOR = new C33705a();

    /* renamed from: d */
    private final boolean f82124d;

    /* renamed from: e */
    private final String f82125e;

    /* renamed from: f */
    private final String f82126f;

    /* renamed from: g */
    private final String f82127g;

    /* renamed from: h */
    private final String f82128h;

    /* renamed from: i */
    private final String f82129i;

    /* renamed from: j */
    private final int f82130j;

    /* renamed from: k */
    private final String f82131k;

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData$a */
    public static final class C33705a implements Parcelable.Creator {
        /* renamed from: a */
        public final SelectElementViewData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new SelectElementViewData(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* renamed from: b */
        public final SelectElementViewData[] newArray(int i) {
            return new SelectElementViewData[i];
        }
    }

    public SelectElementViewData(boolean z, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "id");
        C41536l.m120489i(str6, IRetrofitService.SERVICE_ID);
        this.f82124d = z;
        this.f82125e = str;
        this.f82126f = str2;
        this.f82127g = str3;
        this.f82128h = str4;
        this.f82129i = str5;
        this.f82130j = i;
        this.f82131k = str6;
    }

    /* renamed from: a */
    public final String mo80340a() {
        return this.f82128h;
    }

    /* renamed from: b */
    public final String mo80341b() {
        return this.f82127g;
    }

    /* renamed from: d */
    public final String mo80342d() {
        return this.f82126f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo80344e() {
        return this.f82129i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectElementViewData)) {
            return false;
        }
        SelectElementViewData selectElementViewData = (SelectElementViewData) obj;
        return this.f82124d == selectElementViewData.f82124d && C41536l.m120484d(this.f82125e, selectElementViewData.f82125e) && C41536l.m120484d(this.f82126f, selectElementViewData.f82126f) && C41536l.m120484d(this.f82127g, selectElementViewData.f82127g) && C41536l.m120484d(this.f82128h, selectElementViewData.f82128h) && C41536l.m120484d(this.f82129i, selectElementViewData.f82129i) && this.f82130j == selectElementViewData.f82130j && C41536l.m120484d(this.f82131k, selectElementViewData.f82131k);
    }

    /* renamed from: f */
    public final String mo80346f() {
        return this.f82131k;
    }

    /* renamed from: g */
    public final boolean mo80347g() {
        return this.f82124d;
    }

    /* renamed from: h */
    public final String mo80348h() {
        return this.f82125e;
    }

    public int hashCode() {
        boolean z = this.f82124d;
        if (z) {
            z = true;
        }
        int hashCode = (((((z ? 1 : 0) * true) + this.f82125e.hashCode()) * 31) + this.f82126f.hashCode()) * 31;
        String str = this.f82127g;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f82128h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82129i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((hashCode3 + i) * 31) + this.f82130j) * 31) + this.f82131k.hashCode();
    }

    public String toString() {
        boolean z = this.f82124d;
        String str = this.f82125e;
        String str2 = this.f82126f;
        String str3 = this.f82127g;
        String str4 = this.f82128h;
        String str5 = this.f82129i;
        int i = this.f82130j;
        String str6 = this.f82131k;
        return "SelectElementViewData(smallData=" + z + ", title=" + str + ", id=" + str2 + ", desc=" + str3 + ", amountText=" + str4 + ", imageUrl=" + str5 + ", orderNo=" + i + ", serviceId=" + str6 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f82124d ? 1 : 0);
        parcel.writeString(this.f82125e);
        parcel.writeString(this.f82126f);
        parcel.writeString(this.f82127g);
        parcel.writeString(this.f82128h);
        parcel.writeString(this.f82129i);
        parcel.writeInt(this.f82130j);
        parcel.writeString(this.f82131k);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectElementViewData(boolean z, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, i, str6);
    }
}
