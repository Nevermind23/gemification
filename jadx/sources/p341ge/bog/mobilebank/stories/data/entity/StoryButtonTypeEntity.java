package p341ge.bog.mobilebank.stories.data.entity;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.stories.data.entity.StoryButtonTypeEntity */
public enum StoryButtonTypeEntity {
    DEEP_LINK("DEEP_LINK"),
    URL("URL");
    
    private final String value;

    private StoryButtonTypeEntity(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
