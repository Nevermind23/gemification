package p341ge.bog.mobilebank.openbanking.presentation.products;

import android.os.Parcel;
import android.os.Parcelable;
import iv0.C36557i;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.products.BankProductUiModel */
public final class BankProductUiModel implements Parcelable {
    public static final Parcelable.Creator<BankProductUiModel> CREATOR = new C33454a();

    /* renamed from: d */
    private final C36557i f81651d;

    /* renamed from: e */
    private final int f81652e;

    /* renamed from: f */
    private final String f81653f;

    /* renamed from: g */
    private final String f81654g;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.BankProductUiModel$a */
    public static final class C33454a implements Parcelable.Creator {
        /* renamed from: a */
        public final BankProductUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new BankProductUiModel(C36557i.valueOf(parcel.readString()), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final BankProductUiModel[] newArray(int i) {
            return new BankProductUiModel[i];
        }
    }

    public BankProductUiModel(C36557i iVar, int i, String str, String str2) {
        C41536l.m120489i(iVar, "productType");
        C41536l.m120489i(str, "totalAmount");
        this.f81651d = iVar;
        this.f81652e = i;
        this.f81653f = str;
        this.f81654g = str2;
    }

    /* renamed from: a */
    public final int mo79274a() {
        return this.f81652e;
    }

    /* renamed from: b */
    public final C36557i mo79275b() {
        return this.f81651d;
    }

    /* renamed from: d */
    public final String mo79276d() {
        return this.f81654g;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo79278e() {
        return this.f81653f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankProductUiModel)) {
            return false;
        }
        BankProductUiModel bankProductUiModel = (BankProductUiModel) obj;
        return this.f81651d == bankProductUiModel.f81651d && this.f81652e == bankProductUiModel.f81652e && C41536l.m120484d(this.f81653f, bankProductUiModel.f81653f) && C41536l.m120484d(this.f81654g, bankProductUiModel.f81654g);
    }

    public int hashCode() {
        int hashCode = ((((this.f81651d.hashCode() * 31) + this.f81652e) * 31) + this.f81653f.hashCode()) * 31;
        String str = this.f81654g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        C36557i iVar = this.f81651d;
        int i = this.f81652e;
        String str = this.f81653f;
        String str2 = this.f81654g;
        return "BankProductUiModel(productType=" + iVar + ", productNameResId=" + i + ", totalAmount=" + str + ", singleProductId=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f81651d.name());
        parcel.writeInt(this.f81652e);
        parcel.writeString(this.f81653f);
        parcel.writeString(this.f81654g);
    }
}
