package p341ge.bog.mobilebank.cardapplications.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData */
public final class OrderDebitCardData implements Parcelable {
    public static final Parcelable.Creator<OrderDebitCardData> CREATOR = new C14228a();

    /* renamed from: d */
    private final String f41747d;

    /* renamed from: e */
    private final boolean f41748e;

    /* renamed from: f */
    private final boolean f41749f;

    /* renamed from: g */
    private final CardApplicationTypeData f41750g;

    /* renamed from: h */
    private final String f41751h;

    /* renamed from: i */
    private final String f41752i;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData$a */
    public static final class C14228a implements Parcelable.Creator {
        /* renamed from: a */
        public final OrderDebitCardData createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new OrderDebitCardData(readString, z2, z, (CardApplicationTypeData) parcel.readParcelable(OrderDebitCardData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final OrderDebitCardData[] newArray(int i) {
            return new OrderDebitCardData[i];
        }
    }

    public OrderDebitCardData(String str, boolean z, boolean z2, CardApplicationTypeData cardApplicationTypeData, String str2, String str3) {
        C41536l.m120489i(str, "subProductCode");
        C41536l.m120489i(cardApplicationTypeData, "appType");
        C41536l.m120489i(str3, "product");
        this.f41747d = str;
        this.f41748e = z;
        this.f41749f = z2;
        this.f41750g = cardApplicationTypeData;
        this.f41751h = str2;
        this.f41752i = str3;
    }

    /* renamed from: a */
    public final CardApplicationTypeData mo39780a() {
        return this.f41750g;
    }

    /* renamed from: b */
    public final String mo39781b() {
        return this.f41752i;
    }

    /* renamed from: d */
    public final String mo39782d() {
        return this.f41747d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo39784e() {
        return this.f41751h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDebitCardData)) {
            return false;
        }
        OrderDebitCardData orderDebitCardData = (OrderDebitCardData) obj;
        return C41536l.m120484d(this.f41747d, orderDebitCardData.f41747d) && this.f41748e == orderDebitCardData.f41748e && this.f41749f == orderDebitCardData.f41749f && C41536l.m120484d(this.f41750g, orderDebitCardData.f41750g) && C41536l.m120484d(this.f41751h, orderDebitCardData.f41751h) && C41536l.m120484d(this.f41752i, orderDebitCardData.f41752i);
    }

    /* renamed from: f */
    public final boolean mo39786f() {
        return this.f41748e;
    }

    /* renamed from: g */
    public final boolean mo39787g() {
        return this.f41749f;
    }

    /* renamed from: h */
    public final boolean mo39788h() {
        return this.f41750g.mo39289e();
    }

    public int hashCode() {
        int hashCode = this.f41747d.hashCode() * 31;
        boolean z = this.f41748e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f41749f;
        if (!z3) {
            z2 = z3;
        }
        int hashCode2 = (((i + (z2 ? 1 : 0)) * 31) + this.f41750g.hashCode()) * 31;
        String str = this.f41751h;
        return ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.f41752i.hashCode();
    }

    /* renamed from: i */
    public final boolean mo39790i() {
        return this.f41750g.mo39290f();
    }

    /* renamed from: j */
    public final boolean mo39791j() {
        return this.f41750g.mo39291g();
    }

    /* renamed from: k */
    public final boolean mo39792k() {
        return this.f41750g.mo39292h();
    }

    public String toString() {
        String str = this.f41747d;
        boolean z = this.f41748e;
        boolean z2 = this.f41749f;
        CardApplicationTypeData cardApplicationTypeData = this.f41750g;
        String str2 = this.f41751h;
        String str3 = this.f41752i;
        return "OrderDebitCardData(subProductCode=" + str + ", isDigital=" + z + ", isJuniorFlow=" + z2 + ", appType=" + cardApplicationTypeData + ", tmxSessionId=" + str2 + ", product=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f41747d);
        parcel.writeInt(this.f41748e ? 1 : 0);
        parcel.writeInt(this.f41749f ? 1 : 0);
        parcel.writeParcelable(this.f41750g, i);
        parcel.writeString(this.f41751h);
        parcel.writeString(this.f41752i);
    }
}
