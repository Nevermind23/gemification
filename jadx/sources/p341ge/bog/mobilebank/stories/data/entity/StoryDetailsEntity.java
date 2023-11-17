package p341ge.bog.mobilebank.stories.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.stories.data.entity.StoryDetailsEntity */
public final class StoryDetailsEntity {
    private final String buttonTextEn;
    private final String buttonTextGe;
    private final StoryButtonTypeEntity buttonType;
    private final String contentDescriptionEn;
    private final String contentDescriptionGe;
    private final String contentLinkEn;
    private final String contentLinkGe;
    private final String contentTitleEn;
    private final String contentTitleGe;
    private final String eventButtonClickName;
    private final String eventCloseName;
    private final String eventViewName;
    private final String geoFileObjectId;

    /* renamed from: id */
    private final long f84030id;
    private final String intFileObjectId;
    private final String storyType;

    public StoryDetailsEntity(long j, String str, String str2, String str3, String str4, String str5, String str6, StoryButtonTypeEntity storyButtonTypeEntity, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f84030id = j;
        this.contentTitleGe = str;
        this.contentTitleEn = str2;
        this.contentDescriptionGe = str3;
        this.contentDescriptionEn = str4;
        this.contentLinkGe = str5;
        this.contentLinkEn = str6;
        this.buttonType = storyButtonTypeEntity;
        this.buttonTextGe = str7;
        this.buttonTextEn = str8;
        this.eventCloseName = str9;
        this.eventButtonClickName = str10;
        this.eventViewName = str11;
        this.geoFileObjectId = str12;
        this.intFileObjectId = str13;
        this.storyType = str14;
    }

    public static /* synthetic */ StoryDetailsEntity copy$default(StoryDetailsEntity storyDetailsEntity, long j, String str, String str2, String str3, String str4, String str5, String str6, StoryButtonTypeEntity storyButtonTypeEntity, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, Object obj) {
        StoryDetailsEntity storyDetailsEntity2 = storyDetailsEntity;
        int i2 = i;
        return storyDetailsEntity.copy((i2 & 1) != 0 ? storyDetailsEntity2.f84030id : j, (i2 & 2) != 0 ? storyDetailsEntity2.contentTitleGe : str, (i2 & 4) != 0 ? storyDetailsEntity2.contentTitleEn : str2, (i2 & 8) != 0 ? storyDetailsEntity2.contentDescriptionGe : str3, (i2 & 16) != 0 ? storyDetailsEntity2.contentDescriptionEn : str4, (i2 & 32) != 0 ? storyDetailsEntity2.contentLinkGe : str5, (i2 & 64) != 0 ? storyDetailsEntity2.contentLinkEn : str6, (i2 & 128) != 0 ? storyDetailsEntity2.buttonType : storyButtonTypeEntity, (i2 & C11398b.f33139r) != 0 ? storyDetailsEntity2.buttonTextGe : str7, (i2 & C11398b.f33140s) != 0 ? storyDetailsEntity2.buttonTextEn : str8, (i2 & C11398b.f33141t) != 0 ? storyDetailsEntity2.eventCloseName : str9, (i2 & C11398b.f33142u) != 0 ? storyDetailsEntity2.eventButtonClickName : str10, (i2 & C11398b.f33143v) != 0 ? storyDetailsEntity2.eventViewName : str11, (i2 & 8192) != 0 ? storyDetailsEntity2.geoFileObjectId : str12, (i2 & 16384) != 0 ? storyDetailsEntity2.intFileObjectId : str13, (i2 & 32768) != 0 ? storyDetailsEntity2.storyType : str14);
    }

    public final long component1() {
        return this.f84030id;
    }

    public final String component10() {
        return this.buttonTextEn;
    }

    public final String component11() {
        return this.eventCloseName;
    }

    public final String component12() {
        return this.eventButtonClickName;
    }

    public final String component13() {
        return this.eventViewName;
    }

    public final String component14() {
        return this.geoFileObjectId;
    }

    public final String component15() {
        return this.intFileObjectId;
    }

    public final String component16() {
        return this.storyType;
    }

    public final String component2() {
        return this.contentTitleGe;
    }

    public final String component3() {
        return this.contentTitleEn;
    }

    public final String component4() {
        return this.contentDescriptionGe;
    }

    public final String component5() {
        return this.contentDescriptionEn;
    }

    public final String component6() {
        return this.contentLinkGe;
    }

    public final String component7() {
        return this.contentLinkEn;
    }

    public final StoryButtonTypeEntity component8() {
        return this.buttonType;
    }

    public final String component9() {
        return this.buttonTextGe;
    }

    public final StoryDetailsEntity copy(long j, String str, String str2, String str3, String str4, String str5, String str6, StoryButtonTypeEntity storyButtonTypeEntity, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        return new StoryDetailsEntity(j, str, str2, str3, str4, str5, str6, storyButtonTypeEntity, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryDetailsEntity)) {
            return false;
        }
        StoryDetailsEntity storyDetailsEntity = (StoryDetailsEntity) obj;
        return this.f84030id == storyDetailsEntity.f84030id && C41536l.m120484d(this.contentTitleGe, storyDetailsEntity.contentTitleGe) && C41536l.m120484d(this.contentTitleEn, storyDetailsEntity.contentTitleEn) && C41536l.m120484d(this.contentDescriptionGe, storyDetailsEntity.contentDescriptionGe) && C41536l.m120484d(this.contentDescriptionEn, storyDetailsEntity.contentDescriptionEn) && C41536l.m120484d(this.contentLinkGe, storyDetailsEntity.contentLinkGe) && C41536l.m120484d(this.contentLinkEn, storyDetailsEntity.contentLinkEn) && this.buttonType == storyDetailsEntity.buttonType && C41536l.m120484d(this.buttonTextGe, storyDetailsEntity.buttonTextGe) && C41536l.m120484d(this.buttonTextEn, storyDetailsEntity.buttonTextEn) && C41536l.m120484d(this.eventCloseName, storyDetailsEntity.eventCloseName) && C41536l.m120484d(this.eventButtonClickName, storyDetailsEntity.eventButtonClickName) && C41536l.m120484d(this.eventViewName, storyDetailsEntity.eventViewName) && C41536l.m120484d(this.geoFileObjectId, storyDetailsEntity.geoFileObjectId) && C41536l.m120484d(this.intFileObjectId, storyDetailsEntity.intFileObjectId) && C41536l.m120484d(this.storyType, storyDetailsEntity.storyType);
    }

    public final String getButtonTextEn() {
        return this.buttonTextEn;
    }

    public final String getButtonTextGe() {
        return this.buttonTextGe;
    }

    public final StoryButtonTypeEntity getButtonType() {
        return this.buttonType;
    }

    public final String getContentDescriptionEn() {
        return this.contentDescriptionEn;
    }

    public final String getContentDescriptionGe() {
        return this.contentDescriptionGe;
    }

    public final String getContentLinkEn() {
        return this.contentLinkEn;
    }

    public final String getContentLinkGe() {
        return this.contentLinkGe;
    }

    public final String getContentTitleEn() {
        return this.contentTitleEn;
    }

    public final String getContentTitleGe() {
        return this.contentTitleGe;
    }

    public final String getEventButtonClickName() {
        return this.eventButtonClickName;
    }

    public final String getEventCloseName() {
        return this.eventCloseName;
    }

    public final String getEventViewName() {
        return this.eventViewName;
    }

    public final String getGeoFileObjectId() {
        return this.geoFileObjectId;
    }

    public final long getId() {
        return this.f84030id;
    }

    public final String getIntFileObjectId() {
        return this.intFileObjectId;
    }

    public final String getStoryType() {
        return this.storyType;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f84030id) * 31;
        String str = this.contentTitleGe;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentTitleEn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentDescriptionGe;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.contentDescriptionEn;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.contentLinkGe;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.contentLinkEn;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        StoryButtonTypeEntity storyButtonTypeEntity = this.buttonType;
        int hashCode7 = (hashCode6 + (storyButtonTypeEntity == null ? 0 : storyButtonTypeEntity.hashCode())) * 31;
        String str7 = this.buttonTextGe;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.buttonTextEn;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.eventCloseName;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.eventButtonClickName;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.eventViewName;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.geoFileObjectId;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.intFileObjectId;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.storyType;
        if (str14 != null) {
            i = str14.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        long j = this.f84030id;
        String str = this.contentTitleGe;
        String str2 = this.contentTitleEn;
        String str3 = this.contentDescriptionGe;
        String str4 = this.contentDescriptionEn;
        String str5 = this.contentLinkGe;
        String str6 = this.contentLinkEn;
        StoryButtonTypeEntity storyButtonTypeEntity = this.buttonType;
        String str7 = this.buttonTextGe;
        String str8 = this.buttonTextEn;
        String str9 = this.eventCloseName;
        String str10 = this.eventButtonClickName;
        String str11 = this.eventViewName;
        String str12 = this.geoFileObjectId;
        String str13 = this.intFileObjectId;
        String str14 = this.storyType;
        return "StoryDetailsEntity(id=" + j + ", contentTitleGe=" + str + ", contentTitleEn=" + str2 + ", contentDescriptionGe=" + str3 + ", contentDescriptionEn=" + str4 + ", contentLinkGe=" + str5 + ", contentLinkEn=" + str6 + ", buttonType=" + storyButtonTypeEntity + ", buttonTextGe=" + str7 + ", buttonTextEn=" + str8 + ", eventCloseName=" + str9 + ", eventButtonClickName=" + str10 + ", eventViewName=" + str11 + ", geoFileObjectId=" + str12 + ", intFileObjectId=" + str13 + ", storyType=" + str14 + ")";
    }
}
