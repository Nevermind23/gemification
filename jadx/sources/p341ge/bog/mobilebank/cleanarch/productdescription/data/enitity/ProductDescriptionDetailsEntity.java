package p341ge.bog.mobilebank.cleanarch.productdescription.data.enitity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.productdescription.data.enitity.ProductDescriptionDetailsEntity */
public final class ProductDescriptionDetailsEntity {
    private final String headerDictionaryKey;
    private final String headerDictionaryKeyValue;
    private final String orderNo;
    private final String textDictionaryKey;
    private final String textDictionaryKeyValue;

    public ProductDescriptionDetailsEntity(String str, String str2, String str3, String str4, String str5) {
        this.orderNo = str;
        this.headerDictionaryKey = str2;
        this.headerDictionaryKeyValue = str3;
        this.textDictionaryKey = str4;
        this.textDictionaryKeyValue = str5;
    }

    public static /* synthetic */ ProductDescriptionDetailsEntity copy$default(ProductDescriptionDetailsEntity productDescriptionDetailsEntity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productDescriptionDetailsEntity.orderNo;
        }
        if ((i & 2) != 0) {
            str2 = productDescriptionDetailsEntity.headerDictionaryKey;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = productDescriptionDetailsEntity.headerDictionaryKeyValue;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = productDescriptionDetailsEntity.textDictionaryKey;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = productDescriptionDetailsEntity.textDictionaryKeyValue;
        }
        return productDescriptionDetailsEntity.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.orderNo;
    }

    public final String component2() {
        return this.headerDictionaryKey;
    }

    public final String component3() {
        return this.headerDictionaryKeyValue;
    }

    public final String component4() {
        return this.textDictionaryKey;
    }

    public final String component5() {
        return this.textDictionaryKeyValue;
    }

    public final ProductDescriptionDetailsEntity copy(String str, String str2, String str3, String str4, String str5) {
        return new ProductDescriptionDetailsEntity(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDescriptionDetailsEntity)) {
            return false;
        }
        ProductDescriptionDetailsEntity productDescriptionDetailsEntity = (ProductDescriptionDetailsEntity) obj;
        return C41536l.m120484d(this.orderNo, productDescriptionDetailsEntity.orderNo) && C41536l.m120484d(this.headerDictionaryKey, productDescriptionDetailsEntity.headerDictionaryKey) && C41536l.m120484d(this.headerDictionaryKeyValue, productDescriptionDetailsEntity.headerDictionaryKeyValue) && C41536l.m120484d(this.textDictionaryKey, productDescriptionDetailsEntity.textDictionaryKey) && C41536l.m120484d(this.textDictionaryKeyValue, productDescriptionDetailsEntity.textDictionaryKeyValue);
    }

    public final String getHeaderDictionaryKey() {
        return this.headerDictionaryKey;
    }

    public final String getHeaderDictionaryKeyValue() {
        return this.headerDictionaryKeyValue;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final String getTextDictionaryKey() {
        return this.textDictionaryKey;
    }

    public final String getTextDictionaryKeyValue() {
        return this.textDictionaryKeyValue;
    }

    public int hashCode() {
        String str = this.orderNo;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.headerDictionaryKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.headerDictionaryKeyValue;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textDictionaryKey;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.textDictionaryKeyValue;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.orderNo;
        String str2 = this.headerDictionaryKey;
        String str3 = this.headerDictionaryKeyValue;
        String str4 = this.textDictionaryKey;
        String str5 = this.textDictionaryKeyValue;
        return "ProductDescriptionDetailsEntity(orderNo=" + str + ", headerDictionaryKey=" + str2 + ", headerDictionaryKeyValue=" + str3 + ", textDictionaryKey=" + str4 + ", textDictionaryKeyValue=" + str5 + ")";
    }
}
