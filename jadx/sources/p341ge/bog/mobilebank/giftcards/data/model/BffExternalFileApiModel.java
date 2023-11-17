package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.BffExternalFileApiModel */
public final class BffExternalFileApiModel {
    private final String channelCode;
    private final String customerType;
    private final YesNoApiEntity darkMode;
    private final String directory;
    private final List<BffExternalFileExtensionApiModel> extensions;
    private final String fileId;
    private final String fileSubtype;
    private final String fileType;
    private final String fileUrl;

    /* renamed from: id */
    private final Long f62389id;
    private final YesNoApiEntity isDark;
    private final String langCode;
    private final Integer orderNo;
    private final String status;

    public BffExternalFileApiModel(Long l, String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity, String str5, List<BffExternalFileExtensionApiModel> list, String str6, String str7, YesNoApiEntity yesNoApiEntity2, String str8, Integer num, String str9) {
        this.f62389id = l;
        this.fileId = str;
        this.fileUrl = str2;
        this.channelCode = str3;
        this.customerType = str4;
        this.darkMode = yesNoApiEntity;
        this.directory = str5;
        this.extensions = list;
        this.fileSubtype = str6;
        this.fileType = str7;
        this.isDark = yesNoApiEntity2;
        this.langCode = str8;
        this.orderNo = num;
        this.status = str9;
    }

    public static /* synthetic */ BffExternalFileApiModel copy$default(BffExternalFileApiModel bffExternalFileApiModel, Long l, String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity, String str5, List list, String str6, String str7, YesNoApiEntity yesNoApiEntity2, String str8, Integer num, String str9, int i, Object obj) {
        BffExternalFileApiModel bffExternalFileApiModel2 = bffExternalFileApiModel;
        int i2 = i;
        return bffExternalFileApiModel.copy((i2 & 1) != 0 ? bffExternalFileApiModel2.f62389id : l, (i2 & 2) != 0 ? bffExternalFileApiModel2.fileId : str, (i2 & 4) != 0 ? bffExternalFileApiModel2.fileUrl : str2, (i2 & 8) != 0 ? bffExternalFileApiModel2.channelCode : str3, (i2 & 16) != 0 ? bffExternalFileApiModel2.customerType : str4, (i2 & 32) != 0 ? bffExternalFileApiModel2.darkMode : yesNoApiEntity, (i2 & 64) != 0 ? bffExternalFileApiModel2.directory : str5, (i2 & 128) != 0 ? bffExternalFileApiModel2.extensions : list, (i2 & C11398b.f33139r) != 0 ? bffExternalFileApiModel2.fileSubtype : str6, (i2 & C11398b.f33140s) != 0 ? bffExternalFileApiModel2.fileType : str7, (i2 & C11398b.f33141t) != 0 ? bffExternalFileApiModel2.isDark : yesNoApiEntity2, (i2 & C11398b.f33142u) != 0 ? bffExternalFileApiModel2.langCode : str8, (i2 & C11398b.f33143v) != 0 ? bffExternalFileApiModel2.orderNo : num, (i2 & 8192) != 0 ? bffExternalFileApiModel2.status : str9);
    }

    public final Long component1() {
        return this.f62389id;
    }

    public final String component10() {
        return this.fileType;
    }

    public final YesNoApiEntity component11() {
        return this.isDark;
    }

    public final String component12() {
        return this.langCode;
    }

    public final Integer component13() {
        return this.orderNo;
    }

    public final String component14() {
        return this.status;
    }

    public final String component2() {
        return this.fileId;
    }

    public final String component3() {
        return this.fileUrl;
    }

    public final String component4() {
        return this.channelCode;
    }

    public final String component5() {
        return this.customerType;
    }

    public final YesNoApiEntity component6() {
        return this.darkMode;
    }

    public final String component7() {
        return this.directory;
    }

    public final List<BffExternalFileExtensionApiModel> component8() {
        return this.extensions;
    }

    public final String component9() {
        return this.fileSubtype;
    }

    public final BffExternalFileApiModel copy(Long l, String str, String str2, String str3, String str4, YesNoApiEntity yesNoApiEntity, String str5, List<BffExternalFileExtensionApiModel> list, String str6, String str7, YesNoApiEntity yesNoApiEntity2, String str8, Integer num, String str9) {
        return new BffExternalFileApiModel(l, str, str2, str3, str4, yesNoApiEntity, str5, list, str6, str7, yesNoApiEntity2, str8, num, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BffExternalFileApiModel)) {
            return false;
        }
        BffExternalFileApiModel bffExternalFileApiModel = (BffExternalFileApiModel) obj;
        return C41536l.m120484d(this.f62389id, bffExternalFileApiModel.f62389id) && C41536l.m120484d(this.fileId, bffExternalFileApiModel.fileId) && C41536l.m120484d(this.fileUrl, bffExternalFileApiModel.fileUrl) && C41536l.m120484d(this.channelCode, bffExternalFileApiModel.channelCode) && C41536l.m120484d(this.customerType, bffExternalFileApiModel.customerType) && this.darkMode == bffExternalFileApiModel.darkMode && C41536l.m120484d(this.directory, bffExternalFileApiModel.directory) && C41536l.m120484d(this.extensions, bffExternalFileApiModel.extensions) && C41536l.m120484d(this.fileSubtype, bffExternalFileApiModel.fileSubtype) && C41536l.m120484d(this.fileType, bffExternalFileApiModel.fileType) && this.isDark == bffExternalFileApiModel.isDark && C41536l.m120484d(this.langCode, bffExternalFileApiModel.langCode) && C41536l.m120484d(this.orderNo, bffExternalFileApiModel.orderNo) && C41536l.m120484d(this.status, bffExternalFileApiModel.status);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getCustomerType() {
        return this.customerType;
    }

    public final YesNoApiEntity getDarkMode() {
        return this.darkMode;
    }

    public final String getDirectory() {
        return this.directory;
    }

    public final List<BffExternalFileExtensionApiModel> getExtensions() {
        return this.extensions;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileSubtype() {
        return this.fileSubtype;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final Long getId() {
        return this.f62389id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final Integer getOrderNo() {
        return this.orderNo;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        Long l = this.f62389id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.fileId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fileUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.channelCode;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.darkMode;
        int hashCode6 = (hashCode5 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str5 = this.directory;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<BffExternalFileExtensionApiModel> list = this.extensions;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.fileSubtype;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fileType;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity2 = this.isDark;
        int hashCode11 = (hashCode10 + (yesNoApiEntity2 == null ? 0 : yesNoApiEntity2.hashCode())) * 31;
        String str8 = this.langCode;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.orderNo;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.status;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode13 + i;
    }

    public final YesNoApiEntity isDark() {
        return this.isDark;
    }

    public String toString() {
        Long l = this.f62389id;
        String str = this.fileId;
        String str2 = this.fileUrl;
        String str3 = this.channelCode;
        String str4 = this.customerType;
        YesNoApiEntity yesNoApiEntity = this.darkMode;
        String str5 = this.directory;
        List<BffExternalFileExtensionApiModel> list = this.extensions;
        String str6 = this.fileSubtype;
        String str7 = this.fileType;
        YesNoApiEntity yesNoApiEntity2 = this.isDark;
        String str8 = this.langCode;
        Integer num = this.orderNo;
        String str9 = this.status;
        return "BffExternalFileApiModel(id=" + l + ", fileId=" + str + ", fileUrl=" + str2 + ", channelCode=" + str3 + ", customerType=" + str4 + ", darkMode=" + yesNoApiEntity + ", directory=" + str5 + ", extensions=" + list + ", fileSubtype=" + str6 + ", fileType=" + str7 + ", isDark=" + yesNoApiEntity2 + ", langCode=" + str8 + ", orderNo=" + num + ", status=" + str9 + ")";
    }
}
