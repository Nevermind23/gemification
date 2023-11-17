package p341ge.bog.mobilebank.insurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.data.model.InsuranceProductApiModel */
public final class InsuranceProductApiModel {
    private final String detailsTextDKey;
    private final String headerTextDKey;

    /* renamed from: id */
    private final Long f63147id;
    private final String lookupName;
    private final String lookupValue;
    private final ProductLogoApiModel productLogo;

    public InsuranceProductApiModel(Long l, String str, String str2, String str3, String str4, ProductLogoApiModel productLogoApiModel) {
        this.f63147id = l;
        this.lookupName = str;
        this.lookupValue = str2;
        this.headerTextDKey = str3;
        this.detailsTextDKey = str4;
        this.productLogo = productLogoApiModel;
    }

    public static /* synthetic */ InsuranceProductApiModel copy$default(InsuranceProductApiModel insuranceProductApiModel, Long l, String str, String str2, String str3, String str4, ProductLogoApiModel productLogoApiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            l = insuranceProductApiModel.f63147id;
        }
        if ((i & 2) != 0) {
            str = insuranceProductApiModel.lookupName;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = insuranceProductApiModel.lookupValue;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = insuranceProductApiModel.headerTextDKey;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = insuranceProductApiModel.detailsTextDKey;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            productLogoApiModel = insuranceProductApiModel.productLogo;
        }
        return insuranceProductApiModel.copy(l, str5, str6, str7, str8, productLogoApiModel);
    }

    public final Long component1() {
        return this.f63147id;
    }

    public final String component2() {
        return this.lookupName;
    }

    public final String component3() {
        return this.lookupValue;
    }

    public final String component4() {
        return this.headerTextDKey;
    }

    public final String component5() {
        return this.detailsTextDKey;
    }

    public final ProductLogoApiModel component6() {
        return this.productLogo;
    }

    public final InsuranceProductApiModel copy(Long l, String str, String str2, String str3, String str4, ProductLogoApiModel productLogoApiModel) {
        return new InsuranceProductApiModel(l, str, str2, str3, str4, productLogoApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsuranceProductApiModel)) {
            return false;
        }
        InsuranceProductApiModel insuranceProductApiModel = (InsuranceProductApiModel) obj;
        return C41536l.m120484d(this.f63147id, insuranceProductApiModel.f63147id) && C41536l.m120484d(this.lookupName, insuranceProductApiModel.lookupName) && C41536l.m120484d(this.lookupValue, insuranceProductApiModel.lookupValue) && C41536l.m120484d(this.headerTextDKey, insuranceProductApiModel.headerTextDKey) && C41536l.m120484d(this.detailsTextDKey, insuranceProductApiModel.detailsTextDKey) && C41536l.m120484d(this.productLogo, insuranceProductApiModel.productLogo);
    }

    public final String getDetailsTextDKey() {
        return this.detailsTextDKey;
    }

    public final String getHeaderTextDKey() {
        return this.headerTextDKey;
    }

    public final Long getId() {
        return this.f63147id;
    }

    public final String getLookupName() {
        return this.lookupName;
    }

    public final String getLookupValue() {
        return this.lookupValue;
    }

    public final ProductLogoApiModel getProductLogo() {
        return this.productLogo;
    }

    public int hashCode() {
        Long l = this.f63147id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.lookupName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lookupValue;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.headerTextDKey;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.detailsTextDKey;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ProductLogoApiModel productLogoApiModel = this.productLogo;
        if (productLogoApiModel != null) {
            i = productLogoApiModel.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        Long l = this.f63147id;
        String str = this.lookupName;
        String str2 = this.lookupValue;
        String str3 = this.headerTextDKey;
        String str4 = this.detailsTextDKey;
        ProductLogoApiModel productLogoApiModel = this.productLogo;
        return "InsuranceProductApiModel(id=" + l + ", lookupName=" + str + ", lookupValue=" + str2 + ", headerTextDKey=" + str3 + ", detailsTextDKey=" + str4 + ", productLogo=" + productLogoApiModel + ")";
    }
}
