package p341ge.bog.mobilebank.stories.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.stories.data.entity.StoryGroupDetailsEntity */
public final class StoryGroupDetailsEntity {
    private final String coverTitleEn;
    private final String coverTitleGe;
    private final String eventClickName;
    private final String geoFileObjectId;

    /* renamed from: id */
    private final long f84031id;
    private final String intFileObjectId;
    private final int storyDuration;
    private final String storyType;

    public StoryGroupDetailsEntity(long j, String str, String str2, String str3, String str4, int i, String str5, String str6) {
        this.f84031id = j;
        this.coverTitleGe = str;
        this.coverTitleEn = str2;
        this.storyType = str3;
        this.eventClickName = str4;
        this.storyDuration = i;
        this.geoFileObjectId = str5;
        this.intFileObjectId = str6;
    }

    public static /* synthetic */ StoryGroupDetailsEntity copy$default(StoryGroupDetailsEntity storyGroupDetailsEntity, long j, String str, String str2, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        StoryGroupDetailsEntity storyGroupDetailsEntity2 = storyGroupDetailsEntity;
        int i3 = i2;
        return storyGroupDetailsEntity.copy((i3 & 1) != 0 ? storyGroupDetailsEntity2.f84031id : j, (i3 & 2) != 0 ? storyGroupDetailsEntity2.coverTitleGe : str, (i3 & 4) != 0 ? storyGroupDetailsEntity2.coverTitleEn : str2, (i3 & 8) != 0 ? storyGroupDetailsEntity2.storyType : str3, (i3 & 16) != 0 ? storyGroupDetailsEntity2.eventClickName : str4, (i3 & 32) != 0 ? storyGroupDetailsEntity2.storyDuration : i, (i3 & 64) != 0 ? storyGroupDetailsEntity2.geoFileObjectId : str5, (i3 & 128) != 0 ? storyGroupDetailsEntity2.intFileObjectId : str6);
    }

    public final long component1() {
        return this.f84031id;
    }

    public final String component2() {
        return this.coverTitleGe;
    }

    public final String component3() {
        return this.coverTitleEn;
    }

    public final String component4() {
        return this.storyType;
    }

    public final String component5() {
        return this.eventClickName;
    }

    public final int component6() {
        return this.storyDuration;
    }

    public final String component7() {
        return this.geoFileObjectId;
    }

    public final String component8() {
        return this.intFileObjectId;
    }

    public final StoryGroupDetailsEntity copy(long j, String str, String str2, String str3, String str4, int i, String str5, String str6) {
        return new StoryGroupDetailsEntity(j, str, str2, str3, str4, i, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryGroupDetailsEntity)) {
            return false;
        }
        StoryGroupDetailsEntity storyGroupDetailsEntity = (StoryGroupDetailsEntity) obj;
        return this.f84031id == storyGroupDetailsEntity.f84031id && C41536l.m120484d(this.coverTitleGe, storyGroupDetailsEntity.coverTitleGe) && C41536l.m120484d(this.coverTitleEn, storyGroupDetailsEntity.coverTitleEn) && C41536l.m120484d(this.storyType, storyGroupDetailsEntity.storyType) && C41536l.m120484d(this.eventClickName, storyGroupDetailsEntity.eventClickName) && this.storyDuration == storyGroupDetailsEntity.storyDuration && C41536l.m120484d(this.geoFileObjectId, storyGroupDetailsEntity.geoFileObjectId) && C41536l.m120484d(this.intFileObjectId, storyGroupDetailsEntity.intFileObjectId);
    }

    public final String getCoverTitleEn() {
        return this.coverTitleEn;
    }

    public final String getCoverTitleGe() {
        return this.coverTitleGe;
    }

    public final String getEventClickName() {
        return this.eventClickName;
    }

    public final String getGeoFileObjectId() {
        return this.geoFileObjectId;
    }

    public final long getId() {
        return this.f84031id;
    }

    public final String getIntFileObjectId() {
        return this.intFileObjectId;
    }

    public final int getStoryDuration() {
        return this.storyDuration;
    }

    public final String getStoryType() {
        return this.storyType;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f84031id) * 31;
        String str = this.coverTitleGe;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coverTitleEn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.storyType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventClickName;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.storyDuration) * 31;
        String str5 = this.geoFileObjectId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.intFileObjectId;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        long j = this.f84031id;
        String str = this.coverTitleGe;
        String str2 = this.coverTitleEn;
        String str3 = this.storyType;
        String str4 = this.eventClickName;
        int i = this.storyDuration;
        String str5 = this.geoFileObjectId;
        String str6 = this.intFileObjectId;
        return "StoryGroupDetailsEntity(id=" + j + ", coverTitleGe=" + str + ", coverTitleEn=" + str2 + ", storyType=" + str3 + ", eventClickName=" + str4 + ", storyDuration=" + i + ", geoFileObjectId=" + str5 + ", intFileObjectId=" + str6 + ")";
    }
}
