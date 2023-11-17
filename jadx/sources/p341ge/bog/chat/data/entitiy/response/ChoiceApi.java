package p341ge.bog.chat.data.entitiy.response;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.response.ChoiceApi */
public final class ChoiceApi {
    private final String payload;
    private final String title;

    public ChoiceApi(String str, String str2) {
        this.title = str;
        this.payload = str2;
    }

    public static /* synthetic */ ChoiceApi copy$default(ChoiceApi choiceApi, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = choiceApi.title;
        }
        if ((i & 2) != 0) {
            str2 = choiceApi.payload;
        }
        return choiceApi.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.payload;
    }

    public final ChoiceApi copy(String str, String str2) {
        return new ChoiceApi(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChoiceApi)) {
            return false;
        }
        ChoiceApi choiceApi = (ChoiceApi) obj;
        return C41536l.m120484d(this.title, choiceApi.title) && C41536l.m120484d(this.payload, choiceApi.payload);
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payload;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.payload;
        return "ChoiceApi(title=" + str + ", payload=" + str2 + ")";
    }
}
