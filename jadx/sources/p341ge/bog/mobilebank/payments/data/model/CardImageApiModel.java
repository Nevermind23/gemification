package p341ge.bog.mobilebank.payments.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.payments.data.model.CardImageApiModel */
public final class CardImageApiModel {
    private final String channelCode;
    private final String customerType;
    private final String darkMode;
    private final String extFileId;
    private final String fileSubType;
    private final String fileType;
    private final String fileUrl;

    /* renamed from: id */
    private final Long f81974id;
    private final YesNoApiEntity isDark;
    private final String languageCode;

    public CardImageApiModel(Long l, String str, String str2, String str3, String str4, String str5, YesNoApiEntity yesNoApiEntity, String str6, String str7, String str8) {
        this.f81974id = l;
        this.channelCode = str;
        this.languageCode = str2;
        this.fileType = str3;
        this.fileSubType = str4;
        this.extFileId = str5;
        this.isDark = yesNoApiEntity;
        this.customerType = str6;
        this.darkMode = str7;
        this.fileUrl = str8;
    }

    public static /* synthetic */ CardImageApiModel copy$default(CardImageApiModel cardImageApiModel, Long l, String str, String str2, String str3, String str4, String str5, YesNoApiEntity yesNoApiEntity, String str6, String str7, String str8, int i, Object obj) {
        CardImageApiModel cardImageApiModel2 = cardImageApiModel;
        int i2 = i;
        return cardImageApiModel.copy((i2 & 1) != 0 ? cardImageApiModel2.f81974id : l, (i2 & 2) != 0 ? cardImageApiModel2.channelCode : str, (i2 & 4) != 0 ? cardImageApiModel2.languageCode : str2, (i2 & 8) != 0 ? cardImageApiModel2.fileType : str3, (i2 & 16) != 0 ? cardImageApiModel2.fileSubType : str4, (i2 & 32) != 0 ? cardImageApiModel2.extFileId : str5, (i2 & 64) != 0 ? cardImageApiModel2.isDark : yesNoApiEntity, (i2 & 128) != 0 ? cardImageApiModel2.customerType : str6, (i2 & C11398b.f33139r) != 0 ? cardImageApiModel2.darkMode : str7, (i2 & C11398b.f33140s) != 0 ? cardImageApiModel2.fileUrl : str8);
    }

    public final Long component1() {
        return this.f81974id;
    }

    public final String component10() {
        return this.fileUrl;
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

    public final YesNoApiEntity component7() {
        return this.isDark;
    }

    public final String component8() {
        return this.customerType;
    }

    public final String component9() {
        return this.darkMode;
    }

    public final CardImageApiModel copy(Long l, String str, String str2, String str3, String str4, String str5, YesNoApiEntity yesNoApiEntity, String str6, String str7, String str8) {
        return new CardImageApiModel(l, str, str2, str3, str4, str5, yesNoApiEntity, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardImageApiModel)) {
            return false;
        }
        CardImageApiModel cardImageApiModel = (CardImageApiModel) obj;
        return C41536l.m120484d(this.f81974id, cardImageApiModel.f81974id) && C41536l.m120484d(this.channelCode, cardImageApiModel.channelCode) && C41536l.m120484d(this.languageCode, cardImageApiModel.languageCode) && C41536l.m120484d(this.fileType, cardImageApiModel.fileType) && C41536l.m120484d(this.fileSubType, cardImageApiModel.fileSubType) && C41536l.m120484d(this.extFileId, cardImageApiModel.extFileId) && this.isDark == cardImageApiModel.isDark && C41536l.m120484d(this.customerType, cardImageApiModel.customerType) && C41536l.m120484d(this.darkMode, cardImageApiModel.darkMode) && C41536l.m120484d(this.fileUrl, cardImageApiModel.fileUrl);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getCustomerType() {
        return this.customerType;
    }

    public final String getDarkMode() {
        return this.darkMode;
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

    public final Long getId() {
        return this.f81974id;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public int hashCode() {
        Long l = this.f81974id;
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
        String str5 = this.extFileId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.isDark;
        int hashCode7 = (hashCode6 + (yesNoApiEntity == null ? 0 : yesNoApiEntity.hashCode())) * 31;
        String str6 = this.customerType;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.darkMode;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fileUrl;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode9 + i;
    }

    public final YesNoApiEntity isDark() {
        return this.isDark;
    }

    public String toString() {
        Long l = this.f81974id;
        String str = this.channelCode;
        String str2 = this.languageCode;
        String str3 = this.fileType;
        String str4 = this.fileSubType;
        String str5 = this.extFileId;
        YesNoApiEntity yesNoApiEntity = this.isDark;
        String str6 = this.customerType;
        String str7 = this.darkMode;
        String str8 = this.fileUrl;
        return "CardImageApiModel(id=" + l + ", channelCode=" + str + ", languageCode=" + str2 + ", fileType=" + str3 + ", fileSubType=" + str4 + ", extFileId=" + str5 + ", isDark=" + yesNoApiEntity + ", customerType=" + str6 + ", darkMode=" + str7 + ", fileUrl=" + str8 + ")";
    }
}
