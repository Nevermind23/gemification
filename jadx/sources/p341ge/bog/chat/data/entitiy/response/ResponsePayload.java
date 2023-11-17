package p341ge.bog.chat.data.entitiy.response;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.response.ResponsePayload */
public final class ResponsePayload {
    private final BotFile botFileUrl;
    private final ChatbotComponent callChatbotComponent;
    private final Boolean chatEnded;
    private final List<ChoiceApi> choices;
    @C8664c("CONVERSATION_ID")
    private final Integer conversationId;
    private final String error;
    private final Boolean feedbackRequired;
    private final String fileDownloadToken;
    private final String fileReference;
    @C8664c("MESSAGE_ID")
    private final Long messageId;
    private final List<Message> messages;
    private final int nextPosition;
    @C8664c("request_id")
    private final String requestId;
    private final StatusCode statusCode;

    public ResponsePayload(Long l, int i, List<Message> list, String str, Integer num, StatusCode statusCode2, Boolean bool, String str2, String str3, List<ChoiceApi> list2, Boolean bool2, BotFile botFile, String str4, ChatbotComponent chatbotComponent) {
        C41536l.m120489i(list, C11769i.f34134e);
        this.messageId = l;
        this.nextPosition = i;
        this.messages = list;
        this.requestId = str;
        this.conversationId = num;
        this.statusCode = statusCode2;
        this.chatEnded = bool;
        this.fileReference = str2;
        this.fileDownloadToken = str3;
        this.choices = list2;
        this.feedbackRequired = bool2;
        this.botFileUrl = botFile;
        this.error = str4;
        this.callChatbotComponent = chatbotComponent;
    }

    public static /* synthetic */ ResponsePayload copy$default(ResponsePayload responsePayload, Long l, int i, List list, String str, Integer num, StatusCode statusCode2, Boolean bool, String str2, String str3, List list2, Boolean bool2, BotFile botFile, String str4, ChatbotComponent chatbotComponent, int i2, Object obj) {
        ResponsePayload responsePayload2 = responsePayload;
        int i3 = i2;
        return responsePayload.copy((i3 & 1) != 0 ? responsePayload2.messageId : l, (i3 & 2) != 0 ? responsePayload2.nextPosition : i, (i3 & 4) != 0 ? responsePayload2.messages : list, (i3 & 8) != 0 ? responsePayload2.requestId : str, (i3 & 16) != 0 ? responsePayload2.conversationId : num, (i3 & 32) != 0 ? responsePayload2.statusCode : statusCode2, (i3 & 64) != 0 ? responsePayload2.chatEnded : bool, (i3 & 128) != 0 ? responsePayload2.fileReference : str2, (i3 & C11398b.f33139r) != 0 ? responsePayload2.fileDownloadToken : str3, (i3 & C11398b.f33140s) != 0 ? responsePayload2.choices : list2, (i3 & C11398b.f33141t) != 0 ? responsePayload2.feedbackRequired : bool2, (i3 & C11398b.f33142u) != 0 ? responsePayload2.botFileUrl : botFile, (i3 & C11398b.f33143v) != 0 ? responsePayload2.error : str4, (i3 & 8192) != 0 ? responsePayload2.callChatbotComponent : chatbotComponent);
    }

    public final Long component1() {
        return this.messageId;
    }

    public final List<ChoiceApi> component10() {
        return this.choices;
    }

    public final Boolean component11() {
        return this.feedbackRequired;
    }

    public final BotFile component12() {
        return this.botFileUrl;
    }

    public final String component13() {
        return this.error;
    }

    public final ChatbotComponent component14() {
        return this.callChatbotComponent;
    }

    public final int component2() {
        return this.nextPosition;
    }

    public final List<Message> component3() {
        return this.messages;
    }

    public final String component4() {
        return this.requestId;
    }

    public final Integer component5() {
        return this.conversationId;
    }

    public final StatusCode component6() {
        return this.statusCode;
    }

    public final Boolean component7() {
        return this.chatEnded;
    }

    public final String component8() {
        return this.fileReference;
    }

    public final String component9() {
        return this.fileDownloadToken;
    }

    public final ResponsePayload copy(Long l, int i, List<Message> list, String str, Integer num, StatusCode statusCode2, Boolean bool, String str2, String str3, List<ChoiceApi> list2, Boolean bool2, BotFile botFile, String str4, ChatbotComponent chatbotComponent) {
        List<Message> list3 = list;
        C41536l.m120489i(list3, C11769i.f34134e);
        return new ResponsePayload(l, i, list3, str, num, statusCode2, bool, str2, str3, list2, bool2, botFile, str4, chatbotComponent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponsePayload)) {
            return false;
        }
        ResponsePayload responsePayload = (ResponsePayload) obj;
        return C41536l.m120484d(this.messageId, responsePayload.messageId) && this.nextPosition == responsePayload.nextPosition && C41536l.m120484d(this.messages, responsePayload.messages) && C41536l.m120484d(this.requestId, responsePayload.requestId) && C41536l.m120484d(this.conversationId, responsePayload.conversationId) && this.statusCode == responsePayload.statusCode && C41536l.m120484d(this.chatEnded, responsePayload.chatEnded) && C41536l.m120484d(this.fileReference, responsePayload.fileReference) && C41536l.m120484d(this.fileDownloadToken, responsePayload.fileDownloadToken) && C41536l.m120484d(this.choices, responsePayload.choices) && C41536l.m120484d(this.feedbackRequired, responsePayload.feedbackRequired) && C41536l.m120484d(this.botFileUrl, responsePayload.botFileUrl) && C41536l.m120484d(this.error, responsePayload.error) && C41536l.m120484d(this.callChatbotComponent, responsePayload.callChatbotComponent);
    }

    public final BotFile getBotFileUrl() {
        return this.botFileUrl;
    }

    public final ChatbotComponent getCallChatbotComponent() {
        return this.callChatbotComponent;
    }

    public final Boolean getChatEnded() {
        return this.chatEnded;
    }

    public final List<ChoiceApi> getChoices() {
        return this.choices;
    }

    public final Integer getConversationId() {
        return this.conversationId;
    }

    public final String getError() {
        return this.error;
    }

    public final Boolean getFeedbackRequired() {
        return this.feedbackRequired;
    }

    public final String getFileDownloadToken() {
        return this.fileDownloadToken;
    }

    public final String getFileReference() {
        return this.fileReference;
    }

    public final Long getMessageId() {
        return this.messageId;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public final int getNextPosition() {
        return this.nextPosition;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final StatusCode getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        Long l = this.messageId;
        int i = 0;
        int hashCode = (((((l == null ? 0 : l.hashCode()) * 31) + this.nextPosition) * 31) + this.messages.hashCode()) * 31;
        String str = this.requestId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.conversationId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        StatusCode statusCode2 = this.statusCode;
        int hashCode4 = (hashCode3 + (statusCode2 == null ? 0 : statusCode2.hashCode())) * 31;
        Boolean bool = this.chatEnded;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.fileReference;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileDownloadToken;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<ChoiceApi> list = this.choices;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.feedbackRequired;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BotFile botFile = this.botFileUrl;
        int hashCode10 = (hashCode9 + (botFile == null ? 0 : botFile.hashCode())) * 31;
        String str4 = this.error;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ChatbotComponent chatbotComponent = this.callChatbotComponent;
        if (chatbotComponent != null) {
            i = chatbotComponent.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        Long l = this.messageId;
        int i = this.nextPosition;
        List<Message> list = this.messages;
        String str = this.requestId;
        Integer num = this.conversationId;
        StatusCode statusCode2 = this.statusCode;
        Boolean bool = this.chatEnded;
        String str2 = this.fileReference;
        String str3 = this.fileDownloadToken;
        List<ChoiceApi> list2 = this.choices;
        Boolean bool2 = this.feedbackRequired;
        BotFile botFile = this.botFileUrl;
        String str4 = this.error;
        ChatbotComponent chatbotComponent = this.callChatbotComponent;
        return "ResponsePayload(messageId=" + l + ", nextPosition=" + i + ", messages=" + list + ", requestId=" + str + ", conversationId=" + num + ", statusCode=" + statusCode2 + ", chatEnded=" + bool + ", fileReference=" + str2 + ", fileDownloadToken=" + str3 + ", choices=" + list2 + ", feedbackRequired=" + bool2 + ", botFileUrl=" + botFile + ", error=" + str4 + ", callChatbotComponent=" + chatbotComponent + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ResponsePayload(java.lang.Long r18, int r19, java.util.List r20, java.lang.String r21, java.lang.Integer r22, p341ge.bog.chat.data.entitiy.response.StatusCode r23, java.lang.Boolean r24, java.lang.String r25, java.lang.String r26, java.util.List r27, java.lang.Boolean r28, p341ge.bog.chat.data.entitiy.response.BotFile r29, java.lang.String r30, p341ge.bog.chat.data.entitiy.response.ChatbotComponent r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x000a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r13 = r1
            goto L_0x000c
        L_0x000a:
            r13 = r28
        L_0x000c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r14 = r2
            goto L_0x0015
        L_0x0013:
            r14 = r29
        L_0x0015:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x001b
            r15 = r2
            goto L_0x001d
        L_0x001b:
            r15 = r30
        L_0x001d:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0024
            r16 = r2
            goto L_0x0026
        L_0x0024:
            r16 = r31
        L_0x0026:
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.chat.data.entitiy.response.ResponsePayload.<init>(java.lang.Long, int, java.util.List, java.lang.String, java.lang.Integer, ge.bog.chat.data.entitiy.response.StatusCode, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, ge.bog.chat.data.entitiy.response.BotFile, java.lang.String, ge.bog.chat.data.entitiy.response.ChatbotComponent, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
