package p341ge.bog.mobilebank.insurance.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.insurance.data.model.ProductLogoApiModel */
public final class ProductLogoApiModel {
    private final String channelCode;
    private final Long extFileId;
    private final String fileSubType;
    private final String fileType;
    private final String fileUrl;

    /* renamed from: id */
    private final Long f63148id;
    private final String isDark;
    private final String languageCode;

    public ProductLogoApiModel(Long l, String str, String str2, String str3, String str4, Long l2, String str5, String str6) {
        this.f63148id = l;
        this.channelCode = str;
        this.languageCode = str2;
        this.fileType = str3;
        this.fileSubType = str4;
        this.extFileId = l2;
        this.isDark = str5;
        this.fileUrl = str6;
    }

    public static /* synthetic */ ProductLogoApiModel copy$default(ProductLogoApiModel productLogoApiModel, Long l, String str, String str2, String str3, String str4, Long l2, String str5, String str6, int i, Object obj) {
        ProductLogoApiModel productLogoApiModel2 = productLogoApiModel;
        int i2 = i;
        return productLogoApiModel.copy((i2 & 1) != 0 ? productLogoApiModel2.f63148id : l, (i2 & 2) != 0 ? productLogoApiModel2.channelCode : str, (i2 & 4) != 0 ? productLogoApiModel2.languageCode : str2, (i2 & 8) != 0 ? productLogoApiModel2.fileType : str3, (i2 & 16) != 0 ? productLogoApiModel2.fileSubType : str4, (i2 & 32) != 0 ? productLogoApiModel2.extFileId : l2, (i2 & 64) != 0 ? productLogoApiModel2.isDark : str5, (i2 & 128) != 0 ? productLogoApiModel2.fileUrl : str6);
    }

    public final Long component1() {
        return this.f63148id;
    }

    public final String component2() {
        return this.channelCode;
    }

    public final String component3() {
        return this.languageCode;
    }

    public final String component4() {
        return this.fileType;
    }

    public final String component5() {
        return this.fileSubType;
    }

    public final Long component6() {
        return this.extFileId;
    }

    public final String component7() {
        return this.isDark;
    }

    public final String component8() {
        return this.fileUrl;
    }

    public final ProductLogoApiModel copy(Long l, String str, String str2, String str3, String str4, Long l2, String str5, String str6) {
        return new ProductLogoApiModel(l, str, str2, str3, str4, l2, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductLogoApiModel)) {
            return false;
        }
        ProductLogoApiModel productLogoApiModel = (ProductLogoApiModel) obj;
        return C41536l.m120484d(this.f63148id, productLogoApiModel.f63148id) && C41536l.m120484d(this.channelCode, productLogoApiModel.channelCode) && C41536l.m120484d(this.languageCode, productLogoApiModel.languageCode) && C41536l.m120484d(this.fileType, productLogoApiModel.fileType) && C41536l.m120484d(this.fileSubType, productLogoApiModel.fileSubType) && C41536l.m120484d(this.extFileId, productLogoApiModel.extFileId) && C41536l.m120484d(this.isDark, productLogoApiModel.isDark) && C41536l.m120484d(this.fileUrl, productLogoApiModel.fileUrl);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final Long getExtFileId() {
        return this.extFileId;
    }

    public final String getFileSubType() {
        return this.fileSubType;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final Long getId() {
        return this.f63148id;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public int hashCode() {
        Long l = this.f63148id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.channelCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.languageCode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileSubType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.extFileId;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.isDark;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fileUrl;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    public final String isDark() {
        return this.isDark;
    }

    public String toString() {
        Long l = this.f63148id;
        String str = this.channelCode;
        String str2 = this.languageCode;
        String str3 = this.fileType;
        String str4 = this.fileSubType;
        Long l2 = this.extFileId;
        String str5 = this.isDark;
        String str6 = this.fileUrl;
        return "ProductLogoApiModel(id=" + l + ", channelCode=" + str + ", languageCode=" + str2 + ", fileType=" + str3 + ", fileSubType=" + str4 + ", extFileId=" + l2 + ", isDark=" + str5 + ", fileUrl=" + str6 + ")";
    }
}
