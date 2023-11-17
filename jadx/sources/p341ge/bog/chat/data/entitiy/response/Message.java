package p341ge.bog.chat.data.entitiy.response;

import androidx.annotation.Keep;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.response.Message */
public final class Message {
    private final ParticipantApiModel from;
    private final int index;
    private final String text;
    private final String type;
    private final Map<String, String> userData;
    private final long utcTime;

    public Message(ParticipantApiModel participantApiModel, int i, String str, String str2, long j, Map<String, String> map) {
        this.from = participantApiModel;
        this.index = i;
        this.text = str;
        this.type = str2;
        this.utcTime = j;
        this.userData = map;
    }

    public static /* synthetic */ Message copy$default(Message message, ParticipantApiModel participantApiModel, int i, String str, String str2, long j, Map<String, String> map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            participantApiModel = message.from;
        }
        if ((i2 & 2) != 0) {
            i = message.index;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = message.text;
        }
        String str3 = str;
        if ((i2 & 8) != 0) {
            str2 = message.type;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            j = message.utcTime;
        }
        long j2 = j;
        if ((i2 & 32) != 0) {
            map = message.userData;
        }
        return message.copy(participantApiModel, i3, str3, str4, j2, map);
    }

    public final ParticipantApiModel component1() {
        return this.from;
    }

    public final int component2() {
        return this.index;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.type;
    }

    public final long component5() {
        return this.utcTime;
    }

    public final Map<String, String> component6() {
        return this.userData;
    }

    public final Message copy(ParticipantApiModel participantApiModel, int i, String str, String str2, long j, Map<String, String> map) {
        return new Message(participantApiModel, i, str, str2, j, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return C41536l.m120484d(this.from, message.from) && this.index == message.index && C41536l.m120484d(this.text, message.text) && C41536l.m120484d(this.type, message.type) && this.utcTime == message.utcTime && C41536l.m120484d(this.userData, message.userData);
    }

    public final String getContentType() {
        Map<String, String> map = this.userData;
        if (map != null) {
            return map.get("fileContentType");
        }
        return null;
    }

    public final String getFileId() {
        Map<String, String> map = this.userData;
        if (map != null) {
            return map.get("file-id");
        }
        return null;
    }

    public final String getFileName() {
        Map<String, String> map = this.userData;
        if (map != null) {
            return map.get("file-name");
        }
        return null;
    }

    public final Long getFileSize() {
        String str;
        Double h;
        Map<String, String> map = this.userData;
        if (map == null || (str = map.get("file-size")) == null || (h = C40437u.m117096h(str)) == null) {
            return null;
        }
        return Long.valueOf((long) h.doubleValue());
    }

    public final ParticipantApiModel getFrom() {
        return this.from;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final Map<String, String> getUserData() {
        return this.userData;
    }

    public final long getUtcTime() {
        return this.utcTime;
    }

    public int hashCode() {
        ParticipantApiModel participantApiModel = this.from;
        int i = 0;
        int hashCode = (((participantApiModel == null ? 0 : participantApiModel.hashCode()) * 31) + this.index) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.utcTime)) * 31;
        Map<String, String> map = this.userData;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        ParticipantApiModel participantApiModel = this.from;
        int i = this.index;
        String str = this.text;
        String str2 = this.type;
        long j = this.utcTime;
        Map<String, String> map = this.userData;
        return "Message(from=" + participantApiModel + ", index=" + i + ", text=" + str + ", type=" + str2 + ", utcTime=" + j + ", userData=" + map + ")";
    }
}
