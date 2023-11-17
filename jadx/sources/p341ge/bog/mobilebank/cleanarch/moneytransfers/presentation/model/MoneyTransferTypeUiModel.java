package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel */
public final class MoneyTransferTypeUiModel implements Parcelable {
    public static final Parcelable.Creator<MoneyTransferTypeUiModel> CREATOR = new C21223a();

    /* renamed from: d */
    private final String f56978d;

    /* renamed from: e */
    private final String f56979e;

    /* renamed from: f */
    private final String f56980f;

    /* renamed from: g */
    private final List f56981g;

    /* renamed from: h */
    private final boolean f56982h;

    /* renamed from: i */
    private final boolean f56983i;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel$a */
    public static final class C21223a implements Parcelable.Creator {
        /* renamed from: a */
        public final MoneyTransferTypeUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new MoneyTransferTypeUiModel(readString, readString2, readString3, createStringArrayList, z2, z);
        }

        /* renamed from: b */
        public final MoneyTransferTypeUiModel[] newArray(int i) {
            return new MoneyTransferTypeUiModel[i];
        }
    }

    public MoneyTransferTypeUiModel(String str, String str2, String str3, List list, boolean z, boolean z2) {
        C41536l.m120489i(str, "mtSystem");
        C41536l.m120489i(str2, "transferName");
        this.f56978d = str;
        this.f56979e = str2;
        this.f56980f = str3;
        this.f56981g = list;
        this.f56982h = z;
        this.f56983i = z2;
    }

    /* renamed from: a */
    public final List mo53143a() {
        return this.f56981g;
    }

    /* renamed from: b */
    public final String mo53144b() {
        return this.f56980f;
    }

    /* renamed from: d */
    public final String mo53145d() {
        return this.f56978d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo53147e() {
        return this.f56982h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferTypeUiModel)) {
            return false;
        }
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = (MoneyTransferTypeUiModel) obj;
        return C41536l.m120484d(this.f56978d, moneyTransferTypeUiModel.f56978d) && C41536l.m120484d(this.f56979e, moneyTransferTypeUiModel.f56979e) && C41536l.m120484d(this.f56980f, moneyTransferTypeUiModel.f56980f) && C41536l.m120484d(this.f56981g, moneyTransferTypeUiModel.f56981g) && this.f56982h == moneyTransferTypeUiModel.f56982h && this.f56983i == moneyTransferTypeUiModel.f56983i;
    }

    /* renamed from: f */
    public final String mo53149f() {
        return this.f56979e;
    }

    public int hashCode() {
        int hashCode = ((this.f56978d.hashCode() * 31) + this.f56979e.hashCode()) * 31;
        String str = this.f56980f;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f56981g;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f56982h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f56983i;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.f56978d;
        String str2 = this.f56979e;
        String str3 = this.f56980f;
        List list = this.f56981g;
        boolean z = this.f56982h;
        boolean z2 = this.f56983i;
        return "MoneyTransferTypeUiModel(mtSystem=" + str + ", transferName=" + str2 + ", logoUrl=" + str3 + ", currencies=" + list + ", requiresSenderCountry=" + z + ", hasUniversalFind=" + z2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f56978d);
        parcel.writeString(this.f56979e);
        parcel.writeString(this.f56980f);
        parcel.writeStringList(this.f56981g);
        parcel.writeInt(this.f56982h ? 1 : 0);
        parcel.writeInt(this.f56983i ? 1 : 0);
    }
}
