package p341ge.bog.mobilebank.openbanking.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import iv0.C36557i;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.ProductUiModel */
public final class ProductUiModel implements Parcelable {
    public static final Parcelable.Creator<ProductUiModel> CREATOR = new C33307a();

    /* renamed from: d */
    private final BankUiModel f81417d;

    /* renamed from: e */
    private final C36557i f81418e;

    /* renamed from: f */
    private final String f81419f;

    /* renamed from: g */
    private final String f81420g;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.ProductUiModel$a */
    public static final class C33307a implements Parcelable.Creator {
        /* renamed from: a */
        public final ProductUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ProductUiModel(BankUiModel.CREATOR.createFromParcel(parcel), C36557i.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ProductUiModel[] newArray(int i) {
            return new ProductUiModel[i];
        }
    }

    public ProductUiModel(BankUiModel bankUiModel, C36557i iVar, String str, String str2) {
        C41536l.m120489i(bankUiModel, "bank");
        C41536l.m120489i(iVar, "productType");
        C41536l.m120489i(str, "consentId");
        this.f81417d = bankUiModel;
        this.f81418e = iVar;
        this.f81419f = str;
        this.f81420g = str2;
    }

    /* renamed from: b */
    public static /* synthetic */ ProductUiModel m97960b(ProductUiModel productUiModel, BankUiModel bankUiModel, C36557i iVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bankUiModel = productUiModel.f81417d;
        }
        if ((i & 2) != 0) {
            iVar = productUiModel.f81418e;
        }
        if ((i & 4) != 0) {
            str = productUiModel.f81419f;
        }
        if ((i & 8) != 0) {
            str2 = productUiModel.f81420g;
        }
        return productUiModel.mo79104a(bankUiModel, iVar, str, str2);
    }

    /* renamed from: a */
    public final ProductUiModel mo79104a(BankUiModel bankUiModel, C36557i iVar, String str, String str2) {
        C41536l.m120489i(bankUiModel, "bank");
        C41536l.m120489i(iVar, "productType");
        C41536l.m120489i(str, "consentId");
        return new ProductUiModel(bankUiModel, iVar, str, str2);
    }

    /* renamed from: d */
    public final BankUiModel mo79105d() {
        return this.f81417d;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo79107e() {
        return this.f81419f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductUiModel)) {
            return false;
        }
        ProductUiModel productUiModel = (ProductUiModel) obj;
        return C41536l.m120484d(this.f81417d, productUiModel.f81417d) && this.f81418e == productUiModel.f81418e && C41536l.m120484d(this.f81419f, productUiModel.f81419f) && C41536l.m120484d(this.f81420g, productUiModel.f81420g);
    }

    /* renamed from: f */
    public final String mo79109f() {
        return this.f81420g;
    }

    /* renamed from: g */
    public final C36557i mo79110g() {
        return this.f81418e;
    }

    public int hashCode() {
        int hashCode = ((((this.f81417d.hashCode() * 31) + this.f81418e.hashCode()) * 31) + this.f81419f.hashCode()) * 31;
        String str = this.f81420g;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BankUiModel bankUiModel = this.f81417d;
        C36557i iVar = this.f81418e;
        String str = this.f81419f;
        String str2 = this.f81420g;
        return "ProductUiModel(bank=" + bankUiModel + ", productType=" + iVar + ", consentId=" + str + ", productId=" + str2 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        this.f81417d.writeToParcel(parcel, i);
        parcel.writeString(this.f81418e.name());
        parcel.writeString(this.f81419f);
        parcel.writeString(this.f81420g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductUiModel(BankUiModel bankUiModel, C36557i iVar, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bankUiModel, iVar, str, (i & 8) != 0 ? null : str2);
    }
}
