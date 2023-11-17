package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasHistoryItemUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.DepositAccountUiModel;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel */
public final class CasDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<CasDetailsUiModel> CREATOR = new C33111a();

    /* renamed from: d */
    private final long f81087d;

    /* renamed from: e */
    private final boolean f81088e;

    /* renamed from: f */
    private final double f81089f;

    /* renamed from: g */
    private final double f81090g;

    /* renamed from: h */
    private final List f81091h;

    /* renamed from: i */
    private final DepositAccountUiModel f81092i;

    /* renamed from: j */
    private final List f81093j;

    /* renamed from: k */
    private final String f81094k;

    /* renamed from: l */
    private final long f81095l;

    /* renamed from: m */
    private final double f81096m;

    /* renamed from: n */
    private final String f81097n;

    /* renamed from: o */
    private final String f81098o;

    /* renamed from: p */
    private final String f81099p;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel$a */
    public static final class C33111a implements Parcelable.Creator {
        /* renamed from: a */
        public final CasDetailsUiModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            long readLong = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(CasAccountUiModel.CREATOR.createFromParcel(parcel2));
            }
            DepositAccountUiModel createFromParcel = DepositAccountUiModel.CREATOR.createFromParcel(parcel2);
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                arrayList2.add(CasHistoryItemUiModel.CREATOR.createFromParcel(parcel2));
            }
            return new CasDetailsUiModel(readLong, z, readDouble, readDouble2, arrayList, createFromParcel, arrayList2, parcel.readString(), parcel.readLong(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final CasDetailsUiModel[] newArray(int i) {
            return new CasDetailsUiModel[i];
        }
    }

    public CasDetailsUiModel(long j, boolean z, double d, double d2, List list, DepositAccountUiModel depositAccountUiModel, List list2, String str, long j2, double d3, String str2, String str3, String str4) {
        DepositAccountUiModel depositAccountUiModel2 = depositAccountUiModel;
        List list3 = list2;
        String str5 = str2;
        C41536l.m120489i(list, "attachedAccounts");
        C41536l.m120489i(depositAccountUiModel2, "piggyBankAccount");
        C41536l.m120489i(list3, "history");
        C41536l.m120489i(str5, "schemeTariffCcy");
        this.f81087d = j;
        this.f81088e = z;
        this.f81089f = d;
        this.f81090g = d2;
        this.f81091h = list;
        this.f81092i = depositAccountUiModel2;
        this.f81093j = list3;
        this.f81094k = str;
        this.f81095l = j2;
        this.f81096m = d3;
        this.f81097n = str5;
        this.f81098o = str3;
        this.f81099p = str4;
    }

    /* renamed from: a */
    public final List mo75122a() {
        return this.f81091h;
    }

    /* renamed from: b */
    public final double mo75123b() {
        return this.f81090g;
    }

    /* renamed from: d */
    public final String mo75124d() {
        return this.f81098o;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo75126e() {
        return this.f81093j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CasDetailsUiModel)) {
            return false;
        }
        CasDetailsUiModel casDetailsUiModel = (CasDetailsUiModel) obj;
        return this.f81087d == casDetailsUiModel.f81087d && this.f81088e == casDetailsUiModel.f81088e && Double.compare(this.f81089f, casDetailsUiModel.f81089f) == 0 && Double.compare(this.f81090g, casDetailsUiModel.f81090g) == 0 && C41536l.m120484d(this.f81091h, casDetailsUiModel.f81091h) && C41536l.m120484d(this.f81092i, casDetailsUiModel.f81092i) && C41536l.m120484d(this.f81093j, casDetailsUiModel.f81093j) && C41536l.m120484d(this.f81094k, casDetailsUiModel.f81094k) && this.f81095l == casDetailsUiModel.f81095l && Double.compare(this.f81096m, casDetailsUiModel.f81096m) == 0 && C41536l.m120484d(this.f81097n, casDetailsUiModel.f81097n) && C41536l.m120484d(this.f81098o, casDetailsUiModel.f81098o) && C41536l.m120484d(this.f81099p, casDetailsUiModel.f81099p);
    }

    /* renamed from: f */
    public final long mo75128f() {
        return this.f81087d;
    }

    /* renamed from: g */
    public final String mo75129g() {
        return this.f81099p;
    }

    /* renamed from: h */
    public final String mo75130h() {
        return this.f81094k;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f81087d) * 31;
        boolean z = this.f81088e;
        if (z) {
            z = true;
        }
        int a2 = (((((((((((a + (z ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f81089f)) * 31) + Double.doubleToLongBits(this.f81090g)) * 31) + this.f81091h.hashCode()) * 31) + this.f81092i.hashCode()) * 31) + this.f81093j.hashCode()) * 31;
        String str = this.f81094k;
        int i = 0;
        int hashCode = (((((((a2 + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.f81095l)) * 31) + Double.doubleToLongBits(this.f81096m)) * 31) + this.f81097n.hashCode()) * 31;
        String str2 = this.f81098o;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81099p;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final DepositAccountUiModel mo75132i() {
        return this.f81092i;
    }

    /* renamed from: j */
    public final String mo75133j() {
        return this.f81097n;
    }

    /* renamed from: k */
    public final long mo75134k() {
        return this.f81095l;
    }

    /* renamed from: l */
    public final double mo75135l() {
        return this.f81096m;
    }

    /* renamed from: m */
    public final double mo75136m() {
        return this.f81089f;
    }

    /* renamed from: p */
    public final boolean mo75137p() {
        return this.f81088e;
    }

    public String toString() {
        long j = this.f81087d;
        boolean z = this.f81088e;
        double d = this.f81089f;
        double d2 = this.f81090g;
        List list = this.f81091h;
        DepositAccountUiModel depositAccountUiModel = this.f81092i;
        List list2 = this.f81093j;
        String str = this.f81094k;
        long j2 = this.f81095l;
        double d3 = this.f81096m;
        String str2 = this.f81097n;
        String str3 = this.f81098o;
        String str4 = this.f81099p;
        return "CasDetailsUiModel(id=" + j + ", isActive=" + z + ", totalAmount=" + d + ", currentMonthAmount=" + d2 + ", attachedAccounts=" + list + ", piggyBankAccount=" + depositAccountUiModel + ", history=" + list2 + ", pauseDuration=" + str + ", schemeTariffId=" + j2 + ", schemeTariffValue=" + d3 + ", schemeTariffCcy=" + str2 + ", depositTypeDictionaryKey=" + str3 + ", name=" + str4 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeLong(this.f81087d);
        parcel.writeInt(this.f81088e ? 1 : 0);
        parcel.writeDouble(this.f81089f);
        parcel.writeDouble(this.f81090g);
        List<CasAccountUiModel> list = this.f81091h;
        parcel.writeInt(list.size());
        for (CasAccountUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        this.f81092i.writeToParcel(parcel, i);
        List<CasHistoryItemUiModel> list2 = this.f81093j;
        parcel.writeInt(list2.size());
        for (CasHistoryItemUiModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f81094k);
        parcel.writeLong(this.f81095l);
        parcel.writeDouble(this.f81096m);
        parcel.writeString(this.f81097n);
        parcel.writeString(this.f81098o);
        parcel.writeString(this.f81099p);
    }
}
