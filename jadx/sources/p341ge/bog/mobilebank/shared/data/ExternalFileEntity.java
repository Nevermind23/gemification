package p341ge.bog.mobilebank.shared.data;

import androidx.annotation.Keep;
import j31.C36725a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.shared.data.ExternalFileEntity */
public final class ExternalFileEntity {
    private final String channelCode;
    private final Number extFileId;
    private final String fileSubType;
    private final String fileType;
    private final String fileUrl;

    /* renamed from: id */
    private final String f83723id;
    private final YesNoApiEntity isDark;
    private final String languageCode;

    public ExternalFileEntity(String str, String str2, String str3, String str4, String str5, Number number, YesNoApiEntity yesNoApiEntity, String str6) {
        this.f83723id = str;
        this.channelCode = str2;
        this.languageCode = str3;
        this.fileType = str4;
        this.fileSubType = str5;
        this.extFileId = number;
        this.isDark = yesNoApiEntity;
        this.fileUrl = str6;
    }

    public static /* synthetic */ ExternalFileEntity copy$default(ExternalFileEntity externalFileEntity, String str, String str2, String str3, String str4, String str5, Number number, YesNoApiEntity yesNoApiEntity, String str6, int i, Object obj) {
        ExternalFileEntity externalFileEntity2 = externalFileEntity;
        int i2 = i;
        return externalFileEntity.copy((i2 & 1) != 0 ? externalFileEntity2.f83723id : str, (i2 & 2) != 0 ? externalFileEntity2.channelCode : str2, (i2 & 4) != 0 ? externalFileEntity2.languageCode : str3, (i2 & 8) != 0 ? externalFileEntity2.fileType : str4, (i2 & 16) != 0 ? externalFileEntity2.fileSubType : str5, (i2 & 32) != 0 ? externalFileEntity2.extFileId : number, (i2 & 64) != 0 ? externalFileEntity2.isDark : yesNoApiEntity, (i2 & 128) != 0 ? externalFileEntity2.fileUrl : str6);
    }

    public final C36725a asDomainModel() {
        boolean z;
        String str = this.f83723id;
        String str2 = this.languageCode;
        Number number = this.extFileId;
        if (this.isDark == YesNoApiEntity.YES) {
            z = true;
        } else {
            z = false;
        }
        return new C36725a(str, str2, number, z, this.fileUrl, this.fileSubType);
    }

    public final String component1() {
        return this.f83723id;
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

    public final Number component6() {
        return this.extFileId;
    }

    public final YesNoApiEntity component7() {
        return this.isDark;
    }

    public final String component8() {
        return this.fileUrl;
    }

    public final ExternalFileEntity copy(String str, String str2, String str3, String str4, String str5, Number number, YesNoApiEntity yesNoApiEntity, String str6) {
        return new ExternalFileEntity(str, str2, str3, str4, str5, number, yesNoApiEntity, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalFileEntity)) {
            return false;
        }
        ExternalFileEntity externalFileEntity = (ExternalFileEntity) obj;
        return C41536l.m120484d(this.f83723id, externalFileEntity.f83723id) && C41536l.m120484d(this.channelCode, externalFileEntity.channelCode) && C41536l.m120484d(this.languageCode, externalFileEntity.languageCode) && C41536l.m120484d(this.fileType, externalFileEntity.fileType) && C41536l.m120484d(this.fileSubType, externalFileEntity.fileSubType) && C41536l.m120484d(this.extFileId, externalFileEntity.extFileId) && this.isDark == externalFileEntity.isDark && C41536l.m120484d(this.fileUrl, externalFileEntity.fileUrl);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final Number getExtFileId() {
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

    public final String getId() {
        return this.f83723id;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public int hashCode() {
        String str = this.f83723id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.languageCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fileType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fileSubType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Number number = this.extFileId;
        int hashCode6 = (hashCode5 + (number == null ? 0 : number.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isDark;
        int hashCode7 = (hashCode6 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str6 = this.fileUrl;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    public final YesNoApiEntity isDark() {
        return this.isDark;
    }

    public String toString() {
        String str = this.f83723id;
        String str2 = this.channelCode;
        String str3 = this.languageCode;
        String str4 = this.fileType;
        String str5 = this.fileSubType;
        Number number = this.extFileId;
        YesNoApiEntity yesNoApiEntity = this.isDark;
        String str6 = this.fileUrl;
        return "ExternalFileEntity(id=" + str + ", channelCode=" + str2 + ", languageCode=" + str3 + ", fileType=" + str4 + ", fileSubType=" + str5 + ", extFileId=" + number + ", isDark=" + yesNoApiEntity + ", fileUrl=" + str6 + ")";
    }
}
