package p341ge.bog.mobilebank.cleanarch.productdescription.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionDetailsUiModel */
public final class ProductDescriptionDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<ProductDescriptionDetailsUiModel> CREATOR = new C22498a();

    /* renamed from: d */
    private final String f59497d;

    /* renamed from: e */
    private final String f59498e;

    /* renamed from: f */
    private final String f59499f;

    /* renamed from: g */
    private final String f59500g;

    /* renamed from: h */
    private final String f59501h;

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionDetailsUiModel$a */
    public static final class C22498a implements Parcelable.Creator {
        /* renamed from: a */
        public final ProductDescriptionDetailsUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            return new ProductDescriptionDetailsUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* renamed from: b */
        public final ProductDescriptionDetailsUiModel[] newArray(int i) {
            return new ProductDescriptionDetailsUiModel[i];
        }
    }

    public ProductDescriptionDetailsUiModel(String str, String str2, String str3, String str4, String str5) {
        this.f59497d = str;
        this.f59498e = str2;
        this.f59499f = str3;
        this.f59500g = str4;
        this.f59501h = str5;
    }

    /* renamed from: a */
    public final String mo55535a() {
        return this.f59498e;
    }

    /* renamed from: b */
    public final String mo55536b() {
        return this.f59500g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDescriptionDetailsUiModel)) {
            return false;
        }
        ProductDescriptionDetailsUiModel productDescriptionDetailsUiModel = (ProductDescriptionDetailsUiModel) obj;
        return C41536l.m120484d(this.f59497d, productDescriptionDetailsUiModel.f59497d) && C41536l.m120484d(this.f59498e, productDescriptionDetailsUiModel.f59498e) && C41536l.m120484d(this.f59499f, productDescriptionDetailsUiModel.f59499f) && C41536l.m120484d(this.f59500g, productDescriptionDetailsUiModel.f59500g) && C41536l.m120484d(this.f59501h, productDescriptionDetailsUiModel.f59501h);
    }

    public int hashCode() {
        String str = this.f59497d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59498e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59499f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59500g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59501h;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.f59497d;
        String str2 = this.f59498e;
        String str3 = this.f59499f;
        String str4 = this.f59500g;
        String str5 = this.f59501h;
        return "ProductDescriptionDetailsUiModel(orderNo=" + str + ", headerDictionaryKey=" + str2 + ", headerDictionaryKeyValue=" + str3 + ", textDictionaryKey=" + str4 + ", textDictionaryKeyValue=" + str5 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f59497d);
        parcel.writeString(this.f59498e);
        parcel.writeString(this.f59499f);
        parcel.writeString(this.f59500g);
        parcel.writeString(this.f59501h);
    }
}
