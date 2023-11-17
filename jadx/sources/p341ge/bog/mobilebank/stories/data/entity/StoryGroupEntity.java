package p341ge.bog.mobilebank.stories.data.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.stories.data.entity.StoryGroupEntity */
public final class StoryGroupEntity {
    private final List<StoryDetailsEntity> details;
    private final StoryGroupDetailsEntity story;

    public StoryGroupEntity(StoryGroupDetailsEntity storyGroupDetailsEntity, List<StoryDetailsEntity> list) {
        C41536l.m120489i(storyGroupDetailsEntity, "story");
        this.story = storyGroupDetailsEntity;
        this.details = list;
    }

    public static /* synthetic */ StoryGroupEntity copy$default(StoryGroupEntity storyGroupEntity, StoryGroupDetailsEntity storyGroupDetailsEntity, List<StoryDetailsEntity> list, int i, Object obj) {
        if ((i & 1) != 0) {
            storyGroupDetailsEntity = storyGroupEntity.story;
        }
        if ((i & 2) != 0) {
            list = storyGroupEntity.details;
        }
        return storyGroupEntity.copy(storyGroupDetailsEntity, list);
    }

    public final StoryGroupDetailsEntity component1() {
        return this.story;
    }

    public final List<StoryDetailsEntity> component2() {
        return this.details;
    }

    public final StoryGroupEntity copy(StoryGroupDetailsEntity storyGroupDetailsEntity, List<StoryDetailsEntity> list) {
        C41536l.m120489i(storyGroupDetailsEntity, "story");
        return new StoryGroupEntity(storyGroupDetailsEntity, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryGroupEntity)) {
            return false;
        }
        StoryGroupEntity storyGroupEntity = (StoryGroupEntity) obj;
        return C41536l.m120484d(this.story, storyGroupEntity.story) && C41536l.m120484d(this.details, storyGroupEntity.details);
    }

    public final List<StoryDetailsEntity> getDetails() {
        return this.details;
    }

    public final StoryGroupDetailsEntity getStory() {
        return this.story;
    }

    public int hashCode() {
        int hashCode = this.story.hashCode() * 31;
        List<StoryDetailsEntity> list = this.details;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StoryGroupDetailsEntity storyGroupDetailsEntity = this.story;
        List<StoryDetailsEntity> list = this.details;
        return "StoryGroupEntity(story=" + storyGroupDetailsEntity + ", details=" + list + ")";
    }
}
