package p341ge.bog.chat.data.entitiy.request;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.request.RequestChatPayload */
public final class RequestChatPayload {
    private final String appVersion;
    private final String channel;
    private final String chatLibraryVersion;
    private final String email;
    private final String firstName;
    private final String language;
    private final String lastName;
    private final String nickname;
    private final String phoneNumber;
    private final String phoneOs;
    private final String phoneOsVersion;
    private final String previousPage;
    private final String source;
    private final String subject;
    private final String token;

    public RequestChatPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        String str23 = str8;
        String str24 = str9;
        String str25 = str10;
        String str26 = str11;
        String str27 = str13;
        String str28 = str15;
        C41536l.m120489i(str16, "nickname");
        C41536l.m120489i(str17, "firstName");
        C41536l.m120489i(str18, "lastName");
        C41536l.m120489i(str19, "subject");
        C41536l.m120489i(str20, "email");
        C41536l.m120489i(str21, "phoneNumber");
        C41536l.m120489i(str22, "phoneOs");
        C41536l.m120489i(str23, "phoneOsVersion");
        C41536l.m120489i(str24, "appVersion");
        C41536l.m120489i(str25, "language");
        C41536l.m120489i(str26, "channel");
        C41536l.m120489i(str27, "chatLibraryVersion");
        C41536l.m120489i(str28, "source");
        this.nickname = str16;
        this.firstName = str17;
        this.lastName = str18;
        this.subject = str19;
        this.email = str20;
        this.phoneNumber = str21;
        this.phoneOs = str22;
        this.phoneOsVersion = str23;
        this.appVersion = str24;
        this.language = str25;
        this.channel = str26;
        this.token = str12;
        this.chatLibraryVersion = str27;
        this.previousPage = str14;
        this.source = str28;
    }

    public static /* synthetic */ RequestChatPayload copy$default(RequestChatPayload requestChatPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        RequestChatPayload requestChatPayload2 = requestChatPayload;
        int i2 = i;
        return requestChatPayload.copy((i2 & 1) != 0 ? requestChatPayload2.nickname : str, (i2 & 2) != 0 ? requestChatPayload2.firstName : str2, (i2 & 4) != 0 ? requestChatPayload2.lastName : str3, (i2 & 8) != 0 ? requestChatPayload2.subject : str4, (i2 & 16) != 0 ? requestChatPayload2.email : str5, (i2 & 32) != 0 ? requestChatPayload2.phoneNumber : str6, (i2 & 64) != 0 ? requestChatPayload2.phoneOs : str7, (i2 & 128) != 0 ? requestChatPayload2.phoneOsVersion : str8, (i2 & C11398b.f33139r) != 0 ? requestChatPayload2.appVersion : str9, (i2 & C11398b.f33140s) != 0 ? requestChatPayload2.language : str10, (i2 & C11398b.f33141t) != 0 ? requestChatPayload2.channel : str11, (i2 & C11398b.f33142u) != 0 ? requestChatPayload2.token : str12, (i2 & C11398b.f33143v) != 0 ? requestChatPayload2.chatLibraryVersion : str13, (i2 & 8192) != 0 ? requestChatPayload2.previousPage : str14, (i2 & 16384) != 0 ? requestChatPayload2.source : str15);
    }

    public final String component1() {
        return this.nickname;
    }

    public final String component10() {
        return this.language;
    }

    public final String component11() {
        return this.channel;
    }

    public final String component12() {
        return this.token;
    }

    public final String component13() {
        return this.chatLibraryVersion;
    }

    public final String component14() {
        return this.previousPage;
    }

    public final String component15() {
        return this.source;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.subject;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.phoneNumber;
    }

    public final String component7() {
        return this.phoneOs;
    }

    public final String component8() {
        return this.phoneOsVersion;
    }

    public final String component9() {
        return this.appVersion;
    }

    public final RequestChatPayload copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        String str16 = str;
        C41536l.m120489i(str16, "nickname");
        String str17 = str2;
        C41536l.m120489i(str17, "firstName");
        String str18 = str3;
        C41536l.m120489i(str18, "lastName");
        String str19 = str4;
        C41536l.m120489i(str19, "subject");
        String str20 = str5;
        C41536l.m120489i(str20, "email");
        String str21 = str6;
        C41536l.m120489i(str21, "phoneNumber");
        String str22 = str7;
        C41536l.m120489i(str22, "phoneOs");
        String str23 = str8;
        C41536l.m120489i(str23, "phoneOsVersion");
        String str24 = str9;
        C41536l.m120489i(str24, "appVersion");
        String str25 = str10;
        C41536l.m120489i(str25, "language");
        String str26 = str11;
        C41536l.m120489i(str26, "channel");
        String str27 = str13;
        C41536l.m120489i(str27, "chatLibraryVersion");
        C41536l.m120489i(str15, "source");
        return new RequestChatPayload(str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str12, str27, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestChatPayload)) {
            return false;
        }
        RequestChatPayload requestChatPayload = (RequestChatPayload) obj;
        return C41536l.m120484d(this.nickname, requestChatPayload.nickname) && C41536l.m120484d(this.firstName, requestChatPayload.firstName) && C41536l.m120484d(this.lastName, requestChatPayload.lastName) && C41536l.m120484d(this.subject, requestChatPayload.subject) && C41536l.m120484d(this.email, requestChatPayload.email) && C41536l.m120484d(this.phoneNumber, requestChatPayload.phoneNumber) && C41536l.m120484d(this.phoneOs, requestChatPayload.phoneOs) && C41536l.m120484d(this.phoneOsVersion, requestChatPayload.phoneOsVersion) && C41536l.m120484d(this.appVersion, requestChatPayload.appVersion) && C41536l.m120484d(this.language, requestChatPayload.language) && C41536l.m120484d(this.channel, requestChatPayload.channel) && C41536l.m120484d(this.token, requestChatPayload.token) && C41536l.m120484d(this.chatLibraryVersion, requestChatPayload.chatLibraryVersion) && C41536l.m120484d(this.previousPage, requestChatPayload.previousPage) && C41536l.m120484d(this.source, requestChatPayload.source);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getChatLibraryVersion() {
        return this.chatLibraryVersion;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getPhoneOs() {
        return this.phoneOs;
    }

    public final String getPhoneOsVersion() {
        return this.phoneOsVersion;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.nickname.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.subject.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.phoneOs.hashCode()) * 31) + this.phoneOsVersion.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.language.hashCode()) * 31) + this.channel.hashCode()) * 31;
        String str = this.token;
        int i = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.chatLibraryVersion.hashCode()) * 31;
        String str2 = this.previousPage;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.source.hashCode();
    }

    public String toString() {
        String str = this.nickname;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.subject;
        String str5 = this.email;
        String str6 = this.phoneNumber;
        String str7 = this.phoneOs;
        String str8 = this.phoneOsVersion;
        String str9 = this.appVersion;
        String str10 = this.language;
        String str11 = this.channel;
        String str12 = this.token;
        String str13 = this.chatLibraryVersion;
        String str14 = this.previousPage;
        String str15 = this.source;
        return "RequestChatPayload(nickname=" + str + ", firstName=" + str2 + ", lastName=" + str3 + ", subject=" + str4 + ", email=" + str5 + ", phoneNumber=" + str6 + ", phoneOs=" + str7 + ", phoneOsVersion=" + str8 + ", appVersion=" + str9 + ", language=" + str10 + ", channel=" + str11 + ", token=" + str12 + ", chatLibraryVersion=" + str13 + ", previousPage=" + str14 + ", source=" + str15 + ")";
    }
}
