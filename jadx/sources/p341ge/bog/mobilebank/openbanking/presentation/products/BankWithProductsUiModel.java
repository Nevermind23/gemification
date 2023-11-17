package p341ge.bog.mobilebank.openbanking.presentation.products;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel */
public final class BankWithProductsUiModel implements Parcelable {
    public static final Parcelable.Creator<BankWithProductsUiModel> CREATOR = new C33455a();

    /* renamed from: d */
    private final String f81655d;

    /* renamed from: e */
    private final String f81656e;

    /* renamed from: f */
    private final String f81657f;

    /* renamed from: g */
    private final Integer f81658g;

    /* renamed from: h */
    private final String f81659h;

    /* renamed from: i */
    private final String f81660i;

    /* renamed from: j */
    private final List f81661j;

    /* renamed from: k */
    private final boolean f81662k;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel$a */
    public static final class C33455a implements Parcelable.Creator {
        /* renamed from: a */
        public final BankWithProductsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(BankProductUiModel.CREATOR.createFromParcel(parcel));
            }
            return new BankWithProductsUiModel(readString, readString2, readString3, valueOf, readString4, readString5, arrayList, parcel.readInt() != 0);
        }

        /* renamed from: b */
        public final BankWithProductsUiModel[] newArray(int i) {
            return new BankWithProductsUiModel[i];
        }
    }

    public BankWithProductsUiModel(String str, String str2, String str3, Integer num, String str4, String str5, List list, boolean z) {
        C41536l.m120489i(str, "bankId");
        C41536l.m120489i(str2, "bankCode");
        C41536l.m120489i(str3, "consentId");
        C41536l.m120489i(str4, "bankName");
        C41536l.m120489i(str5, "UpdateOrExpirationTime");
        C41536l.m120489i(list, "products");
        this.f81655d = str;
        this.f81656e = str2;
        this.f81657f = str3;
        this.f81658g = num;
        this.f81659h = str4;
        this.f81660i = str5;
        this.f81661j = list;
        this.f81662k = z;
    }

    /* renamed from: a */
    public final String mo79287a() {
        return this.f81656e;
    }

    /* renamed from: b */
    public final String mo79288b() {
        return this.f81655d;
    }

    /* renamed from: d */
    public final Integer mo79289d() {
        return this.f81658g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo79291e() {
        return this.f81659h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankWithProductsUiModel)) {
            return false;
        }
        BankWithProductsUiModel bankWithProductsUiModel = (BankWithProductsUiModel) obj;
        return C41536l.m120484d(this.f81655d, bankWithProductsUiModel.f81655d) && C41536l.m120484d(this.f81656e, bankWithProductsUiModel.f81656e) && C41536l.m120484d(this.f81657f, bankWithProductsUiModel.f81657f) && C41536l.m120484d(this.f81658g, bankWithProductsUiModel.f81658g) && C41536l.m120484d(this.f81659h, bankWithProductsUiModel.f81659h) && C41536l.m120484d(this.f81660i, bankWithProductsUiModel.f81660i) && C41536l.m120484d(this.f81661j, bankWithProductsUiModel.f81661j) && this.f81662k == bankWithProductsUiModel.f81662k;
    }

    /* renamed from: f */
    public final String mo79293f() {
        return this.f81657f;
    }

    /* renamed from: g */
    public final List mo79294g() {
        return this.f81661j;
    }

    /* renamed from: h */
    public final boolean mo79295h() {
        return this.f81662k;
    }

    public int hashCode() {
        int hashCode = ((((this.f81655d.hashCode() * 31) + this.f81656e.hashCode()) * 31) + this.f81657f.hashCode()) * 31;
        Integer num = this.f81658g;
        int hashCode2 = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f81659h.hashCode()) * 31) + this.f81660i.hashCode()) * 31) + this.f81661j.hashCode()) * 31;
        boolean z = this.f81662k;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final String mo79297i() {
        return this.f81660i;
    }

    public String toString() {
        String str = this.f81655d;
        String str2 = this.f81656e;
        String str3 = this.f81657f;
        Integer num = this.f81658g;
        String str4 = this.f81659h;
        String str5 = this.f81660i;
        List list = this.f81661j;
        boolean z = this.f81662k;
        return "BankWithProductsUiModel(bankId=" + str + ", bankCode=" + str2 + ", consentId=" + str3 + ", bankLogo=" + num + ", bankName=" + str4 + ", UpdateOrExpirationTime=" + str5 + ", products=" + list + ", productsExpired=" + z + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81655d);
        parcel.writeString(this.f81656e);
        parcel.writeString(this.f81657f);
        Integer num = this.f81658g;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.f81659h);
        parcel.writeString(this.f81660i);
        List<BankProductUiModel> list = this.f81661j;
        parcel.writeInt(list.size());
        for (BankProductUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f81662k ? 1 : 0);
    }
}
