package p341ge.bog.chat.data.entitiy.response;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.response.ChatbotComponent */
public final class ChatbotComponent {
    @C8664c("chatbot_component_type")
    private final ChatbotComponentType chatbotComponentType;
    private final String operation;
    private final String properties;

    public ChatbotComponent(String str, ChatbotComponentType chatbotComponentType2, String str2) {
        this.operation = str;
        this.chatbotComponentType = chatbotComponentType2;
        this.properties = str2;
    }

    public static /* synthetic */ ChatbotComponent copy$default(ChatbotComponent chatbotComponent, String str, ChatbotComponentType chatbotComponentType2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatbotComponent.operation;
        }
        if ((i & 2) != 0) {
            chatbotComponentType2 = chatbotComponent.chatbotComponentType;
        }
        if ((i & 4) != 0) {
            str2 = chatbotComponent.properties;
        }
        return chatbotComponent.copy(str, chatbotComponentType2, str2);
    }

    public final String component1() {
        return this.operation;
    }

    public final ChatbotComponentType component2() {
        return this.chatbotComponentType;
    }

    public final String component3() {
        return this.properties;
    }

    public final ChatbotComponent copy(String str, ChatbotComponentType chatbotComponentType2, String str2) {
        return new ChatbotComponent(str, chatbotComponentType2, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatbotComponent)) {
            return false;
        }
        ChatbotComponent chatbotComponent = (ChatbotComponent) obj;
        return C41536l.m120484d(this.operation, chatbotComponent.operation) && this.chatbotComponentType == chatbotComponent.chatbotComponentType && C41536l.m120484d(this.properties, chatbotComponent.properties);
    }

    public final ChatbotComponentType getChatbotComponentType() {
        return this.chatbotComponentType;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final String getProperties() {
        return this.properties;
    }

    public int hashCode() {
        String str = this.operation;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChatbotComponentType chatbotComponentType2 = this.chatbotComponentType;
        int hashCode2 = (hashCode + (chatbotComponentType2 == null ? 0 : chatbotComponentType2.hashCode())) * 31;
        String str2 = this.properties;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.operation;
        ChatbotComponentType chatbotComponentType2 = this.chatbotComponentType;
        String str2 = this.properties;
        return "ChatbotComponent(operation=" + str + ", chatbotComponentType=" + chatbotComponentType2 + ", properties=" + str2 + ")";
    }
}
