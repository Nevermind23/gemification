package p341ge.bog.chat.data.entitiy.response;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.response.BotFile */
public final class BotFile {
    private final String extension;
    private final String name;
    private final String title;
    private final String url;

    public BotFile(String str, String str2, String str3, String str4) {
        this.title = str;
        this.url = str2;
        this.name = str3;
        this.extension = str4;
    }

    public static /* synthetic */ BotFile copy$default(BotFile botFile, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botFile.title;
        }
        if ((i & 2) != 0) {
            str2 = botFile.url;
        }
        if ((i & 4) != 0) {
            str3 = botFile.name;
        }
        if ((i & 8) != 0) {
            str4 = botFile.extension;
        }
        return botFile.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.extension;
    }

    public final BotFile copy(String str, String str2, String str3, String str4) {
        return new BotFile(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotFile)) {
            return false;
        }
        BotFile botFile = (BotFile) obj;
        return C41536l.m120484d(this.title, botFile.title) && C41536l.m120484d(this.url, botFile.url) && C41536l.m120484d(this.name, botFile.name) && C41536l.m120484d(this.extension, botFile.extension);
    }

    public final String getExtension() {
        return this.extension;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.extension;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.url;
        String str3 = this.name;
        String str4 = this.extension;
        return "BotFile(title=" + str + ", url=" + str2 + ", name=" + str3 + ", extension=" + str4 + ")";
    }
}
