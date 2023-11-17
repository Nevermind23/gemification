package p341ge.bog.chat.domain.model.components;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.domain.model.components.PreContractButton */
public final class PreContractButton {
    private final String payload;
    private final String title;

    public PreContractButton(String str, String str2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "payload");
        this.title = str;
        this.payload = str2;
    }

    public static /* synthetic */ PreContractButton copy$default(PreContractButton preContractButton, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preContractButton.title;
        }
        if ((i & 2) != 0) {
            str2 = preContractButton.payload;
        }
        return preContractButton.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.payload;
    }

    public final PreContractButton copy(String str, String str2) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "payload");
        return new PreContractButton(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreContractButton)) {
            return false;
        }
        PreContractButton preContractButton = (PreContractButton) obj;
        return C41536l.m120484d(this.title, preContractButton.title) && C41536l.m120484d(this.payload, preContractButton.payload);
    }

    public final String getPayload() {
        return this.payload;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        String str = this.title;
        String str2 = this.payload;
        return "PreContractButton(title=" + str + ", payload=" + str2 + ")";
    }
}
