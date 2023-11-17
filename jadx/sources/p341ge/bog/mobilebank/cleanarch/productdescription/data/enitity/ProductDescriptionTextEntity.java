package p341ge.bog.mobilebank.cleanarch.productdescription.data.enitity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.productdescription.data.enitity.ProductDescriptionTextEntity */
public final class ProductDescriptionTextEntity {
    private final String iconUrl;
    private final String mainHeaderDictionaryKey;
    private final String mainHeaderDictionaryKeyValue;
    private final String mainTextDictionaryKey;
    private final String mainTextDictionaryKeyValue;
    private final List<ProductDescriptionDetailsEntity> offerDetails;
    private final String titleDictionaryKey;
    private final String titleDictionaryKeyValue;

    public ProductDescriptionTextEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<ProductDescriptionDetailsEntity> list) {
        C41536l.m120489i(list, "offerDetails");
        this.titleDictionaryKey = str;
        this.titleDictionaryKeyValue = str2;
        this.mainHeaderDictionaryKey = str3;
        this.mainHeaderDictionaryKeyValue = str4;
        this.mainTextDictionaryKey = str5;
        this.mainTextDictionaryKeyValue = str6;
        this.iconUrl = str7;
        this.offerDetails = list;
    }

    public static /* synthetic */ ProductDescriptionTextEntity copy$default(ProductDescriptionTextEntity productDescriptionTextEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, Object obj) {
        ProductDescriptionTextEntity productDescriptionTextEntity2 = productDescriptionTextEntity;
        int i2 = i;
        return productDescriptionTextEntity.copy((i2 & 1) != 0 ? productDescriptionTextEntity2.titleDictionaryKey : str, (i2 & 2) != 0 ? productDescriptionTextEntity2.titleDictionaryKeyValue : str2, (i2 & 4) != 0 ? productDescriptionTextEntity2.mainHeaderDictionaryKey : str3, (i2 & 8) != 0 ? productDescriptionTextEntity2.mainHeaderDictionaryKeyValue : str4, (i2 & 16) != 0 ? productDescriptionTextEntity2.mainTextDictionaryKey : str5, (i2 & 32) != 0 ? productDescriptionTextEntity2.mainTextDictionaryKeyValue : str6, (i2 & 64) != 0 ? productDescriptionTextEntity2.iconUrl : str7, (i2 & 128) != 0 ? productDescriptionTextEntity2.offerDetails : list);
    }

    public final String component1() {
        return this.titleDictionaryKey;
    }

    public final String component2() {
        return this.titleDictionaryKeyValue;
    }

    public final String component3() {
        return this.mainHeaderDictionaryKey;
    }

    public final String component4() {
        return this.mainHeaderDictionaryKeyValue;
    }

    public final String component5() {
        return this.mainTextDictionaryKey;
    }

    public final String component6() {
        return this.mainTextDictionaryKeyValue;
    }

    public final String component7() {
        return this.iconUrl;
    }

    public final List<ProductDescriptionDetailsEntity> component8() {
        return this.offerDetails;
    }

    public final ProductDescriptionTextEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<ProductDescriptionDetailsEntity> list) {
        List<ProductDescriptionDetailsEntity> list2 = list;
        C41536l.m120489i(list2, "offerDetails");
        return new ProductDescriptionTextEntity(str, str2, str3, str4, str5, str6, str7, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDescriptionTextEntity)) {
            return false;
        }
        ProductDescriptionTextEntity productDescriptionTextEntity = (ProductDescriptionTextEntity) obj;
        return C41536l.m120484d(this.titleDictionaryKey, productDescriptionTextEntity.titleDictionaryKey) && C41536l.m120484d(this.titleDictionaryKeyValue, productDescriptionTextEntity.titleDictionaryKeyValue) && C41536l.m120484d(this.mainHeaderDictionaryKey, productDescriptionTextEntity.mainHeaderDictionaryKey) && C41536l.m120484d(this.mainHeaderDictionaryKeyValue, productDescriptionTextEntity.mainHeaderDictionaryKeyValue) && C41536l.m120484d(this.mainTextDictionaryKey, productDescriptionTextEntity.mainTextDictionaryKey) && C41536l.m120484d(this.mainTextDictionaryKeyValue, productDescriptionTextEntity.mainTextDictionaryKeyValue) && C41536l.m120484d(this.iconUrl, productDescriptionTextEntity.iconUrl) && C41536l.m120484d(this.offerDetails, productDescriptionTextEntity.offerDetails);
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getMainHeaderDictionaryKey() {
        return this.mainHeaderDictionaryKey;
    }

    public final String getMainHeaderDictionaryKeyValue() {
        return this.mainHeaderDictionaryKeyValue;
    }

    public final String getMainTextDictionaryKey() {
        return this.mainTextDictionaryKey;
    }

    public final String getMainTextDictionaryKeyValue() {
        return this.mainTextDictionaryKeyValue;
    }

    public final List<ProductDescriptionDetailsEntity> getOfferDetails() {
        return this.offerDetails;
    }

    public final String getTitleDictionaryKey() {
        return this.titleDictionaryKey;
    }

    public final String getTitleDictionaryKeyValue() {
        return this.titleDictionaryKeyValue;
    }

    public int hashCode() {
        String str = this.titleDictionaryKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleDictionaryKeyValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mainHeaderDictionaryKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mainHeaderDictionaryKeyValue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mainTextDictionaryKey;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mainTextDictionaryKeyValue;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.iconUrl;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.offerDetails.hashCode();
    }

    public String toString() {
        String str = this.titleDictionaryKey;
        String str2 = this.titleDictionaryKeyValue;
        String str3 = this.mainHeaderDictionaryKey;
        String str4 = this.mainHeaderDictionaryKeyValue;
        String str5 = this.mainTextDictionaryKey;
        String str6 = this.mainTextDictionaryKeyValue;
        String str7 = this.iconUrl;
        List<ProductDescriptionDetailsEntity> list = this.offerDetails;
        return "ProductDescriptionTextEntity(titleDictionaryKey=" + str + ", titleDictionaryKeyValue=" + str2 + ", mainHeaderDictionaryKey=" + str3 + ", mainHeaderDictionaryKeyValue=" + str4 + ", mainTextDictionaryKey=" + str5 + ", mainTextDictionaryKeyValue=" + str6 + ", iconUrl=" + str7 + ", offerDetails=" + list + ")";
    }
}
