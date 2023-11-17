package p341ge.bog.chat.presentation.actionsheet;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.chat.presentation.actionsheet.AccountSelectorComponentData */
public final class AccountSelectorComponentData implements Parcelable {
    public static final Parcelable.Creator<AccountSelectorComponentData> CREATOR = new C12991a();

    /* renamed from: d */
    private final int f38321d;

    /* renamed from: e */
    private final String f38322e;

    /* renamed from: f */
    private final String f38323f;

    /* renamed from: g */
    private final String f38324g;

    /* renamed from: h */
    private final BigDecimal f38325h;

    /* renamed from: i */
    private final String f38326i;

    /* renamed from: j */
    private final Boolean f38327j;

    /* renamed from: k */
    private final boolean f38328k;

    /* renamed from: ge.bog.chat.presentation.actionsheet.AccountSelectorComponentData$a */
    public static final class C12991a implements Parcelable.Creator {
        /* renamed from: a */
        public final AccountSelectorComponentData createFromParcel(Parcel parcel) {
            Boolean valueOf;
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String readString4 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = valueOf;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new AccountSelectorComponentData(readInt, readString, readString2, readString3, bigDecimal, readString4, bool, z);
        }

        /* renamed from: b */
        public final AccountSelectorComponentData[] newArray(int i) {
            return new AccountSelectorComponentData[i];
        }
    }

    public AccountSelectorComponentData(int i, String str, String str2, String str3, BigDecimal bigDecimal, String str4, Boolean bool, boolean z) {
        C41536l.m120489i(str2, "payload");
        C41536l.m120489i(str3, "currency");
        C41536l.m120489i(bigDecimal, "amount");
        this.f38321d = i;
        this.f38322e = str;
        this.f38323f = str2;
        this.f38324g = str3;
        this.f38325h = bigDecimal;
        this.f38326i = str4;
        this.f38327j = bool;
        this.f38328k = z;
    }

    /* renamed from: b */
    public static /* synthetic */ AccountSelectorComponentData m49045b(AccountSelectorComponentData accountSelectorComponentData, int i, String str, String str2, String str3, BigDecimal bigDecimal, String str4, Boolean bool, boolean z, int i2, Object obj) {
        AccountSelectorComponentData accountSelectorComponentData2 = accountSelectorComponentData;
        int i3 = i2;
        return accountSelectorComponentData.mo34188a((i3 & 1) != 0 ? accountSelectorComponentData2.f38321d : i, (i3 & 2) != 0 ? accountSelectorComponentData2.f38322e : str, (i3 & 4) != 0 ? accountSelectorComponentData2.f38323f : str2, (i3 & 8) != 0 ? accountSelectorComponentData2.f38324g : str3, (i3 & 16) != 0 ? accountSelectorComponentData2.f38325h : bigDecimal, (i3 & 32) != 0 ? accountSelectorComponentData2.f38326i : str4, (i3 & 64) != 0 ? accountSelectorComponentData2.f38327j : bool, (i3 & 128) != 0 ? accountSelectorComponentData2.f38328k : z);
    }

    /* renamed from: a */
    public final AccountSelectorComponentData mo34188a(int i, String str, String str2, String str3, BigDecimal bigDecimal, String str4, Boolean bool, boolean z) {
        C41536l.m120489i(str2, "payload");
        C41536l.m120489i(str3, "currency");
        C41536l.m120489i(bigDecimal, "amount");
        return new AccountSelectorComponentData(i, str, str2, str3, bigDecimal, str4, bool, z);
    }

    /* renamed from: d */
    public final BigDecimal mo34189d() {
        return this.f38325h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo34191e() {
        return this.f38326i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSelectorComponentData)) {
            return false;
        }
        AccountSelectorComponentData accountSelectorComponentData = (AccountSelectorComponentData) obj;
        return this.f38321d == accountSelectorComponentData.f38321d && C41536l.m120484d(this.f38322e, accountSelectorComponentData.f38322e) && C41536l.m120484d(this.f38323f, accountSelectorComponentData.f38323f) && C41536l.m120484d(this.f38324g, accountSelectorComponentData.f38324g) && C41536l.m120484d(this.f38325h, accountSelectorComponentData.f38325h) && C41536l.m120484d(this.f38326i, accountSelectorComponentData.f38326i) && C41536l.m120484d(this.f38327j, accountSelectorComponentData.f38327j) && this.f38328k == accountSelectorComponentData.f38328k;
    }

    /* renamed from: f */
    public final String mo34193f() {
        return this.f38324g;
    }

    /* renamed from: g */
    public final int mo34194g() {
        return this.f38321d;
    }

    /* renamed from: h */
    public final String mo34195h() {
        return this.f38323f;
    }

    public int hashCode() {
        int i = this.f38321d * 31;
        String str = this.f38322e;
        int i2 = 0;
        int hashCode = (((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.f38323f.hashCode()) * 31) + this.f38324g.hashCode()) * 31) + this.f38325h.hashCode()) * 31;
        String str2 = this.f38326i;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f38327j;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f38328k;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo34197i() {
        return this.f38328k;
    }

    /* renamed from: j */
    public final String mo34198j() {
        return this.f38322e;
    }

    /* renamed from: k */
    public final Boolean mo34199k() {
        return this.f38327j;
    }

    public String toString() {
        int i = this.f38321d;
        String str = this.f38322e;
        String str2 = this.f38323f;
        String str3 = this.f38324g;
        BigDecimal bigDecimal = this.f38325h;
        String str4 = this.f38326i;
        Boolean bool = this.f38327j;
        boolean z = this.f38328k;
        return "AccountSelectorComponentData(id=" + i + ", title=" + str + ", payload=" + str2 + ", currency=" + str3 + ", amount=" + bigDecimal + ", backgroundImage=" + str4 + ", isDark=" + bool + ", selected=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        C41536l.m120489i(parcel, "out");
        parcel.writeInt(this.f38321d);
        parcel.writeString(this.f38322e);
        parcel.writeString(this.f38323f);
        parcel.writeString(this.f38324g);
        parcel.writeSerializable(this.f38325h);
        parcel.writeString(this.f38326i);
        Boolean bool = this.f38327j;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
        parcel.writeInt(this.f38328k ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountSelectorComponentData(int i, String str, String str2, String str3, BigDecimal bigDecimal, String str4, Boolean bool, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, bigDecimal, str4, bool, (i2 & 128) != 0 ? false : z);
    }
}
