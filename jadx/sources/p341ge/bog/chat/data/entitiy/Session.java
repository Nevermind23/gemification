package p341ge.bog.chat.data.entitiy;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.Session */
public final class Session {
    private final String alias;
    private final String chatId;
    private final String chatUserId;
    private final String secureKey;
    private final String userId;

    public Session(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "alias");
        C41536l.m120489i(str2, "chatId");
        C41536l.m120489i(str3, "userId");
        C41536l.m120489i(str4, "secureKey");
        C41536l.m120489i(str5, "chatUserId");
        this.alias = str;
        this.chatId = str2;
        this.userId = str3;
        this.secureKey = str4;
        this.chatUserId = str5;
    }

    public static /* synthetic */ Session copy$default(Session session, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = session.alias;
        }
        if ((i & 2) != 0) {
            str2 = session.chatId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = session.userId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = session.secureKey;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = session.chatUserId;
        }
        return session.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.alias;
    }

    public final String component2() {
        return this.chatId;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.secureKey;
    }

    public final String component5() {
        return this.chatUserId;
    }

    public final Session copy(String str, String str2, String str3, String str4, String str5) {
        C41536l.m120489i(str, "alias");
        C41536l.m120489i(str2, "chatId");
        C41536l.m120489i(str3, "userId");
        C41536l.m120489i(str4, "secureKey");
        C41536l.m120489i(str5, "chatUserId");
        return new Session(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return C41536l.m120484d(this.alias, session.alias) && C41536l.m120484d(this.chatId, session.chatId) && C41536l.m120484d(this.userId, session.userId) && C41536l.m120484d(this.secureKey, session.secureKey) && C41536l.m120484d(this.chatUserId, session.chatUserId);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getChatUserId() {
        return this.chatUserId;
    }

    public final String getSecureKey() {
        return this.secureKey;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((this.alias.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.secureKey.hashCode()) * 31) + this.chatUserId.hashCode();
    }

    public String toString() {
        String str = this.alias;
        String str2 = this.chatId;
        String str3 = this.userId;
        String str4 = this.secureKey;
        String str5 = this.chatUserId;
        return "Session(alias=" + str + ", chatId=" + str2 + ", userId=" + str3 + ", secureKey=" + str4 + ", chatUserId=" + str5 + ")";
    }
}
