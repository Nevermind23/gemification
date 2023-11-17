package p341ge.bog.mobilebank.products.data.model.addproduct;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.products.data.model.YesNoApiModel;
import p341ge.bog.mobilebank.shared.data.ExternalFileEntity;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.addproduct.CommonGetProductTypeApiModel */
public final class CommonGetProductTypeApiModel {
    private final ExternalFileEntity externalFile;

    /* renamed from: id */
    private final long f82308id;
    private final String keywords;
    private final YesNoApiModel newBadge;
    private final String orderNumber;
    private final String productCode;
    private final String productDescription;
    private final String productNameKey;
    private final String status;

    public CommonGetProductTypeApiModel(long j, String str, String str2, String str3, String str4, String str5, String str6, YesNoApiModel yesNoApiModel, ExternalFileEntity externalFileEntity) {
        C41536l.m120489i(str2, "productDescription");
        C41536l.m120489i(str3, "status");
        C41536l.m120489i(str4, "orderNumber");
        C41536l.m120489i(str5, "productNameKey");
        this.f82308id = j;
        this.productCode = str;
        this.productDescription = str2;
        this.status = str3;
        this.orderNumber = str4;
        this.productNameKey = str5;
        this.keywords = str6;
        this.newBadge = yesNoApiModel;
        this.externalFile = externalFileEntity;
    }

    public static /* synthetic */ CommonGetProductTypeApiModel copy$default(CommonGetProductTypeApiModel commonGetProductTypeApiModel, long j, String str, String str2, String str3, String str4, String str5, String str6, YesNoApiModel yesNoApiModel, ExternalFileEntity externalFileEntity, int i, Object obj) {
        CommonGetProductTypeApiModel commonGetProductTypeApiModel2 = commonGetProductTypeApiModel;
        int i2 = i;
        return commonGetProductTypeApiModel.copy((i2 & 1) != 0 ? commonGetProductTypeApiModel2.f82308id : j, (i2 & 2) != 0 ? commonGetProductTypeApiModel2.productCode : str, (i2 & 4) != 0 ? commonGetProductTypeApiModel2.productDescription : str2, (i2 & 8) != 0 ? commonGetProductTypeApiModel2.status : str3, (i2 & 16) != 0 ? commonGetProductTypeApiModel2.orderNumber : str4, (i2 & 32) != 0 ? commonGetProductTypeApiModel2.productNameKey : str5, (i2 & 64) != 0 ? commonGetProductTypeApiModel2.keywords : str6, (i2 & 128) != 0 ? commonGetProductTypeApiModel2.newBadge : yesNoApiModel, (i2 & C11398b.f33139r) != 0 ? commonGetProductTypeApiModel2.externalFile : externalFileEntity);
    }

    public final long component1() {
        return this.f82308id;
    }

    public final String component2() {
        return this.productCode;
    }

    public final String component3() {
        return this.productDescription;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.orderNumber;
    }

    public final String component6() {
        return this.productNameKey;
    }

    public final String component7() {
        return this.keywords;
    }

    public final YesNoApiModel component8() {
        return this.newBadge;
    }

    public final ExternalFileEntity component9() {
        return this.externalFile;
    }

    public final CommonGetProductTypeApiModel copy(long j, String str, String str2, String str3, String str4, String str5, String str6, YesNoApiModel yesNoApiModel, ExternalFileEntity externalFileEntity) {
        String str7 = str2;
        C41536l.m120489i(str7, "productDescription");
        String str8 = str3;
        C41536l.m120489i(str8, "status");
        String str9 = str4;
        C41536l.m120489i(str9, "orderNumber");
        String str10 = str5;
        C41536l.m120489i(str10, "productNameKey");
        return new CommonGetProductTypeApiModel(j, str, str7, str8, str9, str10, str6, yesNoApiModel, externalFileEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonGetProductTypeApiModel)) {
            return false;
        }
        CommonGetProductTypeApiModel commonGetProductTypeApiModel = (CommonGetProductTypeApiModel) obj;
        return this.f82308id == commonGetProductTypeApiModel.f82308id && C41536l.m120484d(this.productCode, commonGetProductTypeApiModel.productCode) && C41536l.m120484d(this.productDescription, commonGetProductTypeApiModel.productDescription) && C41536l.m120484d(this.status, commonGetProductTypeApiModel.status) && C41536l.m120484d(this.orderNumber, commonGetProductTypeApiModel.orderNumber) && C41536l.m120484d(this.productNameKey, commonGetProductTypeApiModel.productNameKey) && C41536l.m120484d(this.keywords, commonGetProductTypeApiModel.keywords) && this.newBadge == commonGetProductTypeApiModel.newBadge && C41536l.m120484d(this.externalFile, commonGetProductTypeApiModel.externalFile);
    }

    public final ExternalFileEntity getExternalFile() {
        return this.externalFile;
    }

    public final long getId() {
        return this.f82308id;
    }

    public final String getKeywords() {
        return this.keywords;
    }

    public final YesNoApiModel getNewBadge() {
        return this.newBadge;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductDescription() {
        return this.productDescription;
    }

    public final String getProductNameKey() {
        return this.productNameKey;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f82308id) * 31;
        String str = this.productCode;
        int i = 0;
        int hashCode = (((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.productDescription.hashCode()) * 31) + this.status.hashCode()) * 31) + this.orderNumber.hashCode()) * 31) + this.productNameKey.hashCode()) * 31;
        String str2 = this.keywords;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        YesNoApiModel yesNoApiModel = this.newBadge;
        int hashCode3 = (hashCode2 + (yesNoApiModel == null ? 0 : yesNoApiModel.hashCode())) * 31;
        ExternalFileEntity externalFileEntity = this.externalFile;
        if (externalFileEntity != null) {
            i = externalFileEntity.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.f82308id;
        String str = this.productCode;
        String str2 = this.productDescription;
        String str3 = this.status;
        String str4 = this.orderNumber;
        String str5 = this.productNameKey;
        String str6 = this.keywords;
        YesNoApiModel yesNoApiModel = this.newBadge;
        ExternalFileEntity externalFileEntity = this.externalFile;
        return "CommonGetProductTypeApiModel(id=" + j + ", productCode=" + str + ", productDescription=" + str2 + ", status=" + str3 + ", orderNumber=" + str4 + ", productNameKey=" + str5 + ", keywords=" + str6 + ", newBadge=" + yesNoApiModel + ", externalFile=" + externalFileEntity + ")";
    }
}
