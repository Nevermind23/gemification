package p341ge.bog.mobilebank.model.passwordrules;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.model.passwordrules.Level */
public final class Level {
    private final String description;
    private final String levelKey;
    private final int priority;
    private final List<List<String>> supportedRules;

    public Level(String str, String str2, int i, List<? extends List<String>> list) {
        C41536l.m120489i(str, "levelKey");
        C41536l.m120489i(str2, "description");
        C41536l.m120489i(list, "supportedRules");
        this.levelKey = str;
        this.description = str2;
        this.priority = i;
        this.supportedRules = list;
    }

    public static /* synthetic */ Level copy$default(Level level, String str, String str2, int i, List<List<String>> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = level.levelKey;
        }
        if ((i2 & 2) != 0) {
            str2 = level.description;
        }
        if ((i2 & 4) != 0) {
            i = level.priority;
        }
        if ((i2 & 8) != 0) {
            list = level.supportedRules;
        }
        return level.copy(str, str2, i, list);
    }

    public final String component1() {
        return this.levelKey;
    }

    public final String component2() {
        return this.description;
    }

    public final int component3() {
        return this.priority;
    }

    public final List<List<String>> component4() {
        return this.supportedRules;
    }

    public final Level copy(String str, String str2, int i, List<? extends List<String>> list) {
        C41536l.m120489i(str, "levelKey");
        C41536l.m120489i(str2, "description");
        C41536l.m120489i(list, "supportedRules");
        return new Level(str, str2, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Level)) {
            return false;
        }
        Level level = (Level) obj;
        return C41536l.m120484d(this.levelKey, level.levelKey) && C41536l.m120484d(this.description, level.description) && this.priority == level.priority && C41536l.m120484d(this.supportedRules, level.supportedRules);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLevelKey() {
        return this.levelKey;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final List<List<String>> getSupportedRules() {
        return this.supportedRules;
    }

    public int hashCode() {
        return (((((this.levelKey.hashCode() * 31) + this.description.hashCode()) * 31) + this.priority) * 31) + this.supportedRules.hashCode();
    }

    public String toString() {
        String str = this.levelKey;
        String str2 = this.description;
        int i = this.priority;
        List<List<String>> list = this.supportedRules;
        return "Level(levelKey=" + str + ", description=" + str2 + ", priority=" + i + ", supportedRules=" + list + ")";
    }
}
