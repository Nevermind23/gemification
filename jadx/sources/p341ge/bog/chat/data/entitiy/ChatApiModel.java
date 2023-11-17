package p341ge.bog.chat.data.entitiy;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.ChatApiModel */
public final class ChatApiModel<Payload> {
    private final EventApiModel event;
    private final MessageTypeApiModel messageType;
    private final Operation operation;
    private final Payload payload;
    private final Session session;

    public ChatApiModel(MessageTypeApiModel messageTypeApiModel, Operation operation2, EventApiModel eventApiModel, Session session2, Payload payload2) {
        C41536l.m120489i(messageTypeApiModel, "messageType");
        this.messageType = messageTypeApiModel;
        this.operation = operation2;
        this.event = eventApiModel;
        this.session = session2;
        this.payload = payload2;
    }

    public static /* synthetic */ ChatApiModel copy$default(ChatApiModel chatApiModel, MessageTypeApiModel messageTypeApiModel, Operation operation2, EventApiModel eventApiModel, Session session2, Payload payload2, int i, Object obj) {
        if ((i & 1) != 0) {
            messageTypeApiModel = chatApiModel.messageType;
        }
        if ((i & 2) != 0) {
            operation2 = chatApiModel.operation;
        }
        Operation operation3 = operation2;
        if ((i & 4) != 0) {
            eventApiModel = chatApiModel.event;
        }
        EventApiModel eventApiModel2 = eventApiModel;
        if ((i & 8) != 0) {
            session2 = chatApiModel.session;
        }
        Session session3 = session2;
        if ((i & 16) != 0) {
            payload2 = chatApiModel.payload;
        }
        return chatApiModel.copy(messageTypeApiModel, operation3, eventApiModel2, session3, payload2);
    }

    public final MessageTypeApiModel component1() {
        return this.messageType;
    }

    public final Operation component2() {
        return this.operation;
    }

    public final EventApiModel component3() {
        return this.event;
    }

    public final Session component4() {
        return this.session;
    }

    public final Payload component5() {
        return this.payload;
    }

    public final ChatApiModel<Payload> copy(MessageTypeApiModel messageTypeApiModel, Operation operation2, EventApiModel eventApiModel, Session session2, Payload payload2) {
        C41536l.m120489i(messageTypeApiModel, "messageType");
        return new ChatApiModel(messageTypeApiModel, operation2, eventApiModel, session2, payload2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatApiModel)) {
            return false;
        }
        ChatApiModel chatApiModel = (ChatApiModel) obj;
        return this.messageType == chatApiModel.messageType && this.operation == chatApiModel.operation && this.event == chatApiModel.event && C41536l.m120484d(this.session, chatApiModel.session) && C41536l.m120484d(this.payload, chatApiModel.payload);
    }

    public final EventApiModel getEvent() {
        return this.event;
    }

    public final MessageTypeApiModel getMessageType() {
        return this.messageType;
    }

    public final Operation getOperation() {
        return this.operation;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public final Session getSession() {
        return this.session;
    }

    public int hashCode() {
        int hashCode = this.messageType.hashCode() * 31;
        Operation operation2 = this.operation;
        int i = 0;
        int hashCode2 = (hashCode + (operation2 == null ? 0 : operation2.hashCode())) * 31;
        EventApiModel eventApiModel = this.event;
        int hashCode3 = (hashCode2 + (eventApiModel == null ? 0 : eventApiModel.hashCode())) * 31;
        Session session2 = this.session;
        int hashCode4 = (hashCode3 + (session2 == null ? 0 : session2.hashCode())) * 31;
        Payload payload2 = this.payload;
        if (payload2 != null) {
            i = payload2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        MessageTypeApiModel messageTypeApiModel = this.messageType;
        Operation operation2 = this.operation;
        EventApiModel eventApiModel = this.event;
        Session session2 = this.session;
        Payload payload2 = this.payload;
        return "ChatApiModel(messageType=" + messageTypeApiModel + ", operation=" + operation2 + ", event=" + eventApiModel + ", session=" + session2 + ", payload=" + payload2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChatApiModel(MessageTypeApiModel messageTypeApiModel, Operation operation2, EventApiModel eventApiModel, Session session2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageTypeApiModel, (i & 2) != 0 ? null : operation2, (i & 4) != 0 ? null : eventApiModel, (i & 8) != 0 ? null : session2, (i & 16) != 0 ? null : obj);
    }
}
