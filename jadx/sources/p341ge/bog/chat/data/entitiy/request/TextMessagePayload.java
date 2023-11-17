package p341ge.bog.chat.data.entitiy.request;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.request.TextMessagePayload */
public final class TextMessagePayload {
    private final String appVersion;
    private final String chatLibraryVersion;
    private final String message;
    private final String phoneOs;
    private final String previousPage;
    private final boolean removeBotFile;
    private final boolean removeChoices;
    @C8664c("request_id")
    private final String requestId;
    private final String source;
    private final String title;
    private final String token;

    public TextMessagePayload(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(str2, "requestId");
        C41536l.m120489i(str5, "phoneOs");
        C41536l.m120489i(str6, "appVersion");
        C41536l.m120489i(str7, "chatLibraryVersion");
        C41536l.m120489i(str9, "source");
        this.message = str;
        this.requestId = str2;
        this.title = str3;
        this.removeBotFile = z;
        this.removeChoices = z2;
        this.token = str4;
        this.phoneOs = str5;
        this.appVersion = str6;
        this.chatLibraryVersion = str7;
        this.previousPage = str8;
        this.source = str9;
    }

    public static /* synthetic */ TextMessagePayload copy$default(TextMessagePayload textMessagePayload, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        TextMessagePayload textMessagePayload2 = textMessagePayload;
        int i2 = i;
        return textMessagePayload.copy((i2 & 1) != 0 ? textMessagePayload2.message : str, (i2 & 2) != 0 ? textMessagePayload2.requestId : str2, (i2 & 4) != 0 ? textMessagePayload2.title : str3, (i2 & 8) != 0 ? textMessagePayload2.removeBotFile : z, (i2 & 16) != 0 ? textMessagePayload2.removeChoices : z2, (i2 & 32) != 0 ? textMessagePayload2.token : str4, (i2 & 64) != 0 ? textMessagePayload2.phoneOs : str5, (i2 & 128) != 0 ? textMessagePayload2.appVersion : str6, (i2 & C11398b.f33139r) != 0 ? textMessagePayload2.chatLibraryVersion : str7, (i2 & C11398b.f33140s) != 0 ? textMessagePayload2.previousPage : str8, (i2 & C11398b.f33141t) != 0 ? textMessagePayload2.source : str9);
    }

    public final String component1() {
        return this.message;
    }

    public final String component10() {
        return this.previousPage;
    }

    public final String component11() {
        return this.source;
    }

    public final String component2() {
        return this.requestId;
    }

    public final String component3() {
        return this.title;
    }

    public final boolean component4() {
        return this.removeBotFile;
    }

    public final boolean component5() {
        return this.removeChoices;
    }

    public final String component6() {
        return this.token;
    }

    public final String component7() {
        return this.phoneOs;
    }

    public final String component8() {
        return this.appVersion;
    }

    public final String component9() {
        return this.chatLibraryVersion;
    }

    public final TextMessagePayload copy(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9) {
        C41536l.m120489i(str, "message");
        C41536l.m120489i(str2, "requestId");
        String str10 = str5;
        C41536l.m120489i(str10, "phoneOs");
        String str11 = str6;
        C41536l.m120489i(str11, "appVersion");
        String str12 = str7;
        C41536l.m120489i(str12, "chatLibraryVersion");
        String str13 = str9;
        C41536l.m120489i(str13, "source");
        return new TextMessagePayload(str, str2, str3, z, z2, str4, str10, str11, str12, str8, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMessagePayload)) {
            return false;
        }
        TextMessagePayload textMessagePayload = (TextMessagePayload) obj;
        return C41536l.m120484d(this.message, textMessagePayload.message) && C41536l.m120484d(this.requestId, textMessagePayload.requestId) && C41536l.m120484d(this.title, textMessagePayload.title) && this.removeBotFile == textMessagePayload.removeBotFile && this.removeChoices == textMessagePayload.removeChoices && C41536l.m120484d(this.token, textMessagePayload.token) && C41536l.m120484d(this.phoneOs, textMessagePayload.phoneOs) && C41536l.m120484d(this.appVersion, textMessagePayload.appVersion) && C41536l.m120484d(this.chatLibraryVersion, textMessagePayload.chatLibraryVersion) && C41536l.m120484d(this.previousPage, textMessagePayload.previousPage) && C41536l.m120484d(this.source, textMessagePayload.source);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getChatLibraryVersion() {
        return this.chatLibraryVersion;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPhoneOs() {
        return this.phoneOs;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final boolean getRemoveBotFile() {
        return this.removeBotFile;
    }

    public final boolean getRemoveChoices() {
        return this.removeChoices;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = ((this.message.hashCode() * 31) + this.requestId.hashCode()) * 31;
        String str = this.title;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.removeBotFile;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.removeChoices;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str2 = this.token;
        int hashCode3 = (((((((i3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.phoneOs.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.chatLibraryVersion.hashCode()) * 31;
        String str3 = this.previousPage;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode3 + i) * 31) + this.source.hashCode();
    }

    public String toString() {
        String str = this.message;
        String str2 = this.requestId;
        String str3 = this.title;
        boolean z = this.removeBotFile;
        boolean z2 = this.removeChoices;
        String str4 = this.token;
        String str5 = this.phoneOs;
        String str6 = this.appVersion;
        String str7 = this.chatLibraryVersion;
        String str8 = this.previousPage;
        String str9 = this.source;
        return "TextMessagePayload(message=" + str + ", requestId=" + str2 + ", title=" + str3 + ", removeBotFile=" + z + ", removeChoices=" + z2 + ", token=" + str4 + ", phoneOs=" + str5 + ", appVersion=" + str6 + ", chatLibraryVersion=" + str7 + ", previousPage=" + str8 + ", source=" + str9 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextMessagePayload(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, str4, str5, str6, str7, str8, str9);
    }
}
