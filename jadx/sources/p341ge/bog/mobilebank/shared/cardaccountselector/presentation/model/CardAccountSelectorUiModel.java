package p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel */
public final class CardAccountSelectorUiModel implements Parcelable {
    public static final Parcelable.Creator<CardAccountSelectorUiModel> CREATOR = new C34631a();

    /* renamed from: d */
    private final long f83684d;

    /* renamed from: e */
    private final String f83685e;

    /* renamed from: f */
    private final double f83686f;

    /* renamed from: g */
    private final String f83687g;

    /* renamed from: h */
    private final int f83688h;

    /* renamed from: i */
    private final String f83689i;

    /* renamed from: j */
    private final String f83690j;

    /* renamed from: k */
    private final boolean f83691k;

    /* renamed from: l */
    private final boolean f83692l;

    /* renamed from: m */
    private final boolean f83693m;

    /* renamed from: ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel$a */
    public static final class C34631a implements Parcelable.Creator {
        /* renamed from: a */
        public final CardAccountSelectorUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new CardAccountSelectorUiModel(readLong, readString, readDouble, readString2, readInt, readString3, readString4, z2, z3, z);
        }

        /* renamed from: b */
        public final CardAccountSelectorUiModel[] newArray(int i) {
            return new CardAccountSelectorUiModel[i];
        }
    }

    public CardAccountSelectorUiModel(long j, String str, double d, String str2, int i, String str3, String str4, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(str, "acctName");
        C41536l.m120489i(str2, "ccy");
        this.f83684d = j;
        this.f83685e = str;
        this.f83686f = d;
        this.f83687g = str2;
        this.f83688h = i;
        this.f83689i = str3;
        this.f83690j = str4;
        this.f83691k = z;
        this.f83692l = z2;
        this.f83693m = z3;
    }

    /* renamed from: a */
    public final long mo84203a() {
        return this.f83684d;
    }

    /* renamed from: b */
    public final String mo84204b() {
        return this.f83685e;
    }

    /* renamed from: d */
    public final String mo84205d() {
        return this.f83690j;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo84207e() {
        return this.f83688h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardAccountSelectorUiModel)) {
            return false;
        }
        CardAccountSelectorUiModel cardAccountSelectorUiModel = (CardAccountSelectorUiModel) obj;
        return this.f83684d == cardAccountSelectorUiModel.f83684d && C41536l.m120484d(this.f83685e, cardAccountSelectorUiModel.f83685e) && Double.compare(this.f83686f, cardAccountSelectorUiModel.f83686f) == 0 && C41536l.m120484d(this.f83687g, cardAccountSelectorUiModel.f83687g) && this.f83688h == cardAccountSelectorUiModel.f83688h && C41536l.m120484d(this.f83689i, cardAccountSelectorUiModel.f83689i) && C41536l.m120484d(this.f83690j, cardAccountSelectorUiModel.f83690j) && this.f83691k == cardAccountSelectorUiModel.f83691k && this.f83692l == cardAccountSelectorUiModel.f83692l && this.f83693m == cardAccountSelectorUiModel.f83693m;
    }

    /* renamed from: f */
    public final double mo84209f() {
        return this.f83686f;
    }

    /* renamed from: g */
    public final String mo84210g() {
        return this.f83687g;
    }

    /* renamed from: h */
    public final boolean mo84211h() {
        return this.f83691k;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f83684d) * 31) + this.f83685e.hashCode()) * 31) + Double.doubleToLongBits(this.f83686f)) * 31) + this.f83687g.hashCode()) * 31) + this.f83688h) * 31;
        String str = this.f83689i;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83690j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f83691k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f83692l;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f83693m;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo84213i() {
        return this.f83692l;
    }

    /* renamed from: j */
    public final String mo84214j() {
        return this.f83689i;
    }

    /* renamed from: k */
    public final boolean mo84215k() {
        return this.f83693m;
    }

    public String toString() {
        long j = this.f83684d;
        String str = this.f83685e;
        double d = this.f83686f;
        String str2 = this.f83687g;
        int i = this.f83688h;
        String str3 = this.f83689i;
        String str4 = this.f83690j;
        boolean z = this.f83691k;
        boolean z2 = this.f83692l;
        boolean z3 = this.f83693m;
        return "CardAccountSelectorUiModel(acctKey=" + j + ", acctName=" + str + ", availableAmount=" + d + ", ccy=" + str2 + ", attachmentId=" + i + ", imageUrl=" + str3 + ", acctNo=" + str4 + ", hasDarkAttachment=" + z + ", hasDarkImageUrl=" + z2 + ", isDefault=" + z3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f83684d);
        parcel.writeString(this.f83685e);
        parcel.writeDouble(this.f83686f);
        parcel.writeString(this.f83687g);
        parcel.writeInt(this.f83688h);
        parcel.writeString(this.f83689i);
        parcel.writeString(this.f83690j);
        parcel.writeInt(this.f83691k ? 1 : 0);
        parcel.writeInt(this.f83692l ? 1 : 0);
        parcel.writeInt(this.f83693m ? 1 : 0);
    }
}
