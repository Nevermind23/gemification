package p341ge.bog.chat.data.history;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.chat.data.entitiy.ChatApiModel;
import p341ge.bog.chat.data.entitiy.response.ResponsePayload;

@Keep
/* renamed from: ge.bog.chat.data.history.ChatHistoryResponse */
public final class ChatHistoryResponse {
    private final int code;
    private final List<ChatApiModel<ResponsePayload>> data;
    private final String status;

    public ChatHistoryResponse(int i, String str, List<ChatApiModel<ResponsePayload>> list) {
        C41536l.m120489i(str, "status");
        C41536l.m120489i(list, "data");
        this.code = i;
        this.status = str;
        this.data = list;
    }

    public static /* synthetic */ ChatHistoryResponse copy$default(ChatHistoryResponse chatHistoryResponse, int i, String str, List<ChatApiModel<ResponsePayload>> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatHistoryResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = chatHistoryResponse.status;
        }
        if ((i2 & 4) != 0) {
            list = chatHistoryResponse.data;
        }
        return chatHistoryResponse.copy(i, str, list);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.status;
    }

    public final List<ChatApiModel<ResponsePayload>> component3() {
        return this.data;
    }

    public final ChatHistoryResponse copy(int i, String str, List<ChatApiModel<ResponsePayload>> list) {
        C41536l.m120489i(str, "status");
        C41536l.m120489i(list, "data");
        return new ChatHistoryResponse(i, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatHistoryResponse)) {
            return false;
        }
        ChatHistoryResponse chatHistoryResponse = (ChatHistoryResponse) obj;
        return this.code == chatHistoryResponse.code && C41536l.m120484d(this.status, chatHistoryResponse.status) && C41536l.m120484d(this.data, chatHistoryResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final List<ChatApiModel<ResponsePayload>> getData() {
        return this.data;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((this.code * 31) + this.status.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        int i = this.code;
        String str = this.status;
        List<ChatApiModel<ResponsePayload>> list = this.data;
        return "ChatHistoryResponse(code=" + i + ", status=" + str + ", data=" + list + ")";
    }
}
