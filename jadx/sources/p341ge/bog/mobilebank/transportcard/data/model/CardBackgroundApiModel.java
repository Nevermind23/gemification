package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.CardBackgroundApiModel */
public final class CardBackgroundApiModel {
    private final String channelCode;
    private final String extFileId;
    private final String fileSubType;
    private final String fileType;
    private final String fileUrl;

    /* renamed from: id */
    private final Integer f84442id;
    private final String isDark;
    private final String languageCode;

    public CardBackgroundApiModel(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "channelCode");
        C41536l.m120489i(str2, "languageCode");
        C41536l.m120489i(str3, "fileType");
        C41536l.m120489i(str4, "fileSubType");
        C41536l.m120489i(str6, "isDark");
        this.f84442id = num;
        this.channelCode = str;
        this.languageCode = str2;
        this.fileType = str3;
        this.fileSubType = str4;
        this.extFileId = str5;
        this.isDark = str6;
        this.fileUrl = str7;
    }

    public static /* synthetic */ CardBackgroundApiModel copy$default(CardBackgroundApiModel cardBackgroundApiModel, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        CardBackgroundApiModel cardBackgroundApiModel2 = cardBackgroundApiModel;
        int i2 = i;
        return cardBackgroundApiModel.copy((i2 & 1) != 0 ? cardBackgroundApiModel2.f84442id : num, (i2 & 2) != 0 ? cardBackgroundApiModel2.channelCode : str, (i2 & 4) != 0 ? cardBackgroundApiModel2.languageCode : str2, (i2 & 8) != 0 ? cardBackgroundApiModel2.fileType : str3, (i2 & 16) != 0 ? cardBackgroundApiModel2.fileSubType : str4, (i2 & 32) != 0 ? cardBackgroundApiModel2.extFileId : str5, (i2 & 64) != 0 ? cardBackgroundApiModel2.isDark : str6, (i2 & 128) != 0 ? cardBackgroundApiModel2.fileUrl : str7);
    }

    public final Integer component1() {
        return this.f84442id;
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

    public final String component6() {
        return this.extFileId;
    }

    public final String component7() {
        return this.isDark;
    }

    public final String component8() {
        return this.fileUrl;
    }

    public final CardBackgroundApiModel copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C41536l.m120489i(str, "channelCode");
        C41536l.m120489i(str2, "languageCode");
        C41536l.m120489i(str3, "fileType");
        C41536l.m120489i(str4, "fileSubType");
        String str8 = str6;
        C41536l.m120489i(str8, "isDark");
        return new CardBackgroundApiModel(num, str, str2, str3, str4, str5, str8, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardBackgroundApiModel)) {
            return false;
        }
        CardBackgroundApiModel cardBackgroundApiModel = (CardBackgroundApiModel) obj;
        return C41536l.m120484d(this.f84442id, cardBackgroundApiModel.f84442id) && C41536l.m120484d(this.channelCode, cardBackgroundApiModel.channelCode) && C41536l.m120484d(this.languageCode, cardBackgroundApiModel.languageCode) && C41536l.m120484d(this.fileType, cardBackgroundApiModel.fileType) && C41536l.m120484d(this.fileSubType, cardBackgroundApiModel.fileSubType) && C41536l.m120484d(this.extFileId, cardBackgroundApiModel.extFileId) && C41536l.m120484d(this.isDark, cardBackgroundApiModel.isDark) && C41536l.m120484d(this.fileUrl, cardBackgroundApiModel.fileUrl);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getExtFileId() {
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

    public final Integer getId() {
        return this.f84442id;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public int hashCode() {
        Integer num = this.f84442id;
        int i = 0;
        int hashCode = (((((((((num == null ? 0 : num.hashCode()) * 31) + this.channelCode.hashCode()) * 31) + this.languageCode.hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.fileSubType.hashCode()) * 31;
        String str = this.extFileId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.isDark.hashCode()) * 31;
        String str2 = this.fileUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String isDark() {
        return this.isDark;
    }

    public String toString() {
        Integer num = this.f84442id;
        String str = this.channelCode;
        String str2 = this.languageCode;
        String str3 = this.fileType;
        String str4 = this.fileSubType;
        String str5 = this.extFileId;
        String str6 = this.isDark;
        String str7 = this.fileUrl;
        return "CardBackgroundApiModel(id=" + num + ", channelCode=" + str + ", languageCode=" + str2 + ", fileType=" + str3 + ", fileSubType=" + str4 + ", extFileId=" + str5 + ", isDark=" + str6 + ", fileUrl=" + str7 + ")";
    }
}
