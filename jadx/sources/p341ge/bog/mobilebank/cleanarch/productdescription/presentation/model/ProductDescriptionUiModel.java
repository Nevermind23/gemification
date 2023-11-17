package p341ge.bog.mobilebank.cleanarch.productdescription.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionUiModel */
public final class ProductDescriptionUiModel implements Parcelable {
    public static final Parcelable.Creator<ProductDescriptionUiModel> CREATOR = new C22499a();

    /* renamed from: d */
    private final String f59502d;

    /* renamed from: e */
    private final String f59503e;

    /* renamed from: f */
    private final String f59504f;

    /* renamed from: g */
    private final String f59505g;

    /* renamed from: h */
    private final String f59506h;

    /* renamed from: i */
    private final String f59507i;

    /* renamed from: j */
    private final String f59508j;

    /* renamed from: k */
    private final List f59509k;

    /* renamed from: ge.bog.mobilebank.cleanarch.productdescription.presentation.model.ProductDescriptionUiModel$a */
    public static final class C22499a implements Parcelable.Creator {
        /* renamed from: a */
        public final ProductDescriptionUiModel createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ProductDescriptionDetailsUiModel.CREATOR.createFromParcel(parcel));
            }
            return new ProductDescriptionUiModel(readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList);
        }

        /* renamed from: b */
        public final ProductDescriptionUiModel[] newArray(int i) {
            return new ProductDescriptionUiModel[i];
        }
    }

    public ProductDescriptionUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list) {
        C41536l.m120489i(list, "offerDetails");
        this.f59502d = str;
        this.f59503e = str2;
        this.f59504f = str3;
        this.f59505g = str4;
        this.f59506h = str5;
        this.f59507i = str6;
        this.f59508j = str7;
        this.f59509k = list;
    }

    /* renamed from: a */
    public final String mo55546a() {
        return this.f59508j;
    }

    /* renamed from: b */
    public final String mo55547b() {
        return this.f59504f;
    }

    /* renamed from: d */
    public final String mo55548d() {
        return this.f59506h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final List mo55550e() {
        return this.f59509k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDescriptionUiModel)) {
            return false;
        }
        ProductDescriptionUiModel productDescriptionUiModel = (ProductDescriptionUiModel) obj;
        return C41536l.m120484d(this.f59502d, productDescriptionUiModel.f59502d) && C41536l.m120484d(this.f59503e, productDescriptionUiModel.f59503e) && C41536l.m120484d(this.f59504f, productDescriptionUiModel.f59504f) && C41536l.m120484d(this.f59505g, productDescriptionUiModel.f59505g) && C41536l.m120484d(this.f59506h, productDescriptionUiModel.f59506h) && C41536l.m120484d(this.f59507i, productDescriptionUiModel.f59507i) && C41536l.m120484d(this.f59508j, productDescriptionUiModel.f59508j) && C41536l.m120484d(this.f59509k, productDescriptionUiModel.f59509k);
    }

    /* renamed from: f */
    public final String mo55552f() {
        return this.f59502d;
    }

    public int hashCode() {
        String str = this.f59502d;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59503e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59504f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59505g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59506h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59507i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f59508j;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.f59509k.hashCode();
    }

    public String toString() {
        String str = this.f59502d;
        String str2 = this.f59503e;
        String str3 = this.f59504f;
        String str4 = this.f59505g;
        String str5 = this.f59506h;
        String str6 = this.f59507i;
        String str7 = this.f59508j;
        List list = this.f59509k;
        return "ProductDescriptionUiModel(titleDictionaryKey=" + str + ", titleDictionaryKeyValue=" + str2 + ", mainHeaderDictionaryKey=" + str3 + ", mainHeaderDictionaryKeyValue=" + str4 + ", mainTextDictionaryKey=" + str5 + ", mainTextDictionaryKeyValue=" + str6 + ", iconUrl=" + str7 + ", offerDetails=" + list + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f59502d);
        parcel.writeString(this.f59503e);
        parcel.writeString(this.f59504f);
        parcel.writeString(this.f59505g);
        parcel.writeString(this.f59506h);
        parcel.writeString(this.f59507i);
        parcel.writeString(this.f59508j);
        List<ProductDescriptionDetailsUiModel> list = this.f59509k;
        parcel.writeInt(list.size());
        for (ProductDescriptionDetailsUiModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
