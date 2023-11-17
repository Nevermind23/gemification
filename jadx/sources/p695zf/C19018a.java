package p695zf;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p316xa.C8982a;
import p341ge.bog.chat.data.entitiy.ChatApiModel;
import p341ge.bog.chat.data.entitiy.EventApiModel;
import p341ge.bog.chat.data.entitiy.MessageTypeApiModel;
import p341ge.bog.chat.data.entitiy.Operation;
import p341ge.bog.chat.data.entitiy.response.BotFile;
import p341ge.bog.chat.data.entitiy.response.ChatbotComponent;
import p341ge.bog.chat.data.entitiy.response.ChatbotComponentType;
import p341ge.bog.chat.data.entitiy.response.CheckPolicyApi;
import p341ge.bog.chat.data.entitiy.response.ChoiceApi;
import p341ge.bog.chat.data.entitiy.response.Message;
import p341ge.bog.chat.data.entitiy.response.ParticipantApiModel;
import p341ge.bog.chat.data.entitiy.response.ParticipantTypeApiModel;
import p341ge.bog.chat.data.entitiy.response.ResponsePayload;
import p341ge.bog.chat.data.entitiy.response.StatusCode;
import p341ge.bog.chat.data.history.ChatHistoryResponse;
import p341ge.bog.chat.domain.model.components.AccountListComponent;
import p341ge.bog.chat.domain.model.components.CalendarRangeComponent;
import p341ge.bog.chat.domain.model.components.Component;
import p341ge.bog.chat.domain.model.components.FAQComponent;
import p341ge.bog.chat.domain.model.components.FeedbackComponent;
import p341ge.bog.chat.domain.model.components.PreContractComponent;
import p341ge.bog.chat.domain.model.components.ProductOfferComponent;
import p341ge.bog.chat.domain.model.components.ProductsSliderComponent;
import p341ge.bog.chat.domain.model.components.ProductsSliderComponentsList;
import p419fg.C12870a;
import p419fg.C12873b;
import p419fg.C12875d;
import p419fg.C12876e;
import p419fg.C12878g;
import p419fg.C12884i;
import p419fg.C12885j;
import p419fg.C12886k;
import p419fg.C12887l;
import p419fg.C12888m;

/* renamed from: zf.a */
public final class C19018a {

    /* renamed from: a */
    private final Gson f53120a;

    /* renamed from: zf.a$a */
    public /* synthetic */ class C19019a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53121a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f53122b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f53123c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f53124d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f53125e;

        static {
            int[] iArr = new int[ParticipantTypeApiModel.values().length];
            iArr[ParticipantTypeApiModel.CLIENT.ordinal()] = 1;
            iArr[ParticipantTypeApiModel.AGENT.ordinal()] = 2;
            iArr[ParticipantTypeApiModel.EXTERNAL.ordinal()] = 3;
            f53121a = iArr;
            int[] iArr2 = new int[ChatbotComponentType.values().length];
            iArr2[ChatbotComponentType.ACCOUNTS_COMPONENT.ordinal()] = 1;
            iArr2[ChatbotComponentType.PRE_CONTRACT.ordinal()] = 2;
            iArr2[ChatbotComponentType.PRODUCT_OFFER.ordinal()] = 3;
            iArr2[ChatbotComponentType.INLINE_FEEDBACK.ordinal()] = 4;
            iArr2[ChatbotComponentType.CALENDAR_RANGE.ordinal()] = 5;
            iArr2[ChatbotComponentType.PRODUCTS_SLIDER.ordinal()] = 6;
            iArr2[ChatbotComponentType.FAQ.ordinal()] = 7;
            f53122b = iArr2;
            int[] iArr3 = new int[EventApiModel.values().length];
            iArr3[EventApiModel.PARTICIPANT_JOINED.ordinal()] = 1;
            iArr3[EventApiModel.FILE_UPLOADED.ordinal()] = 2;
            iArr3[EventApiModel.PARTICIPANT_LEFT.ordinal()] = 3;
            f53123c = iArr3;
            int[] iArr4 = new int[Operation.values().length];
            iArr4[Operation.SEND_MESSAGE.ordinal()] = 1;
            iArr4[Operation.PUSH_URL.ordinal()] = 2;
            iArr4[Operation.UPLOAD_FILE.ordinal()] = 3;
            iArr4[Operation.START_TYPING.ordinal()] = 4;
            iArr4[Operation.STOP_TYPING.ordinal()] = 5;
            f53124d = iArr4;
            int[] iArr5 = new int[MessageTypeApiModel.values().length];
            iArr5[MessageTypeApiModel.EVENT.ordinal()] = 1;
            f53125e = iArr5;
        }
    }

    public C19018a(Gson gson) {
        C41536l.m120489i(gson, "gson");
        this.f53120a = gson;
    }

    /* renamed from: b */
    private final C12885j m64276b(ChatApiModel chatApiModel) {
        int i = -1;
        if (C19019a.f53125e[chatApiModel.getMessageType().ordinal()] == 1) {
            EventApiModel event = chatApiModel.getEvent();
            if (event != null) {
                i = C19019a.f53123c[event.ordinal()];
            }
            if (i == 1) {
                return C12885j.PARTICIPANT_JOINED;
            }
            if (i == 2) {
                return C12885j.FILE_ATTACHMENT;
            }
            if (i == 3) {
                return C12885j.PARTICIPANT_LEFT;
            }
            EventApiModel event2 = chatApiModel.getEvent();
            throw new IllegalStateException(("Unknown event. event: " + event2).toString());
        }
        Operation operation = chatApiModel.getOperation();
        if (operation != null) {
            i = C19019a.f53124d[operation.ordinal()];
        }
        if (i == 1 || i == 2) {
            return C12885j.TEXT;
        }
        if (i == 3) {
            return C12885j.FILE_ATTACHMENT;
        }
        if (i == 4 || i == 5) {
            return C12885j.TYPING;
        }
        Operation operation2 = chatApiModel.getOperation();
        throw new IllegalStateException(("Unknown Operation. operation: " + operation2).toString());
    }

    /* renamed from: a */
    public final String mo47182a(String str, String str2, String str3) {
        String str4 = "https://rb-chat-api.bog.ge" + "/chat-api/file/download?" + "fileReference=" + str2 + "&" + "fileId=" + str + "&" + "downloadToken=" + str3;
        C41536l.m120488h(str4, "StringBuilder(\"https://r…DownloadToken).toString()");
        return str4;
    }

    /* renamed from: c */
    public final C12878g mo47183c(ChatApiModel chatApiModel) {
        Message message;
        int i;
        C12887l lVar;
        C12870a.C12872b bVar;
        C12884i iVar;
        Component component;
        long j;
        ArrayList arrayList;
        C12873b bVar2;
        C12876e eVar;
        String title;
        Component component2;
        List<Message> messages;
        T t;
        boolean z;
        C41536l.m120489i(chatApiModel, "apiModel");
        C12885j b = m64276b(chatApiModel);
        ResponsePayload responsePayload = (ResponsePayload) chatApiModel.getPayload();
        boolean z2 = false;
        if (responsePayload == null || (messages = responsePayload.getMessages()) == null) {
            message = null;
        } else {
            Iterator<T> it = messages.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((Message) t).getFrom() != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            message = (Message) t;
        }
        C41536l.m120486f(message);
        ParticipantApiModel from = message.getFrom();
        C41536l.m120486f(from);
        ParticipantTypeApiModel type = from.getType();
        int i2 = -1;
        if (type == null) {
            i = -1;
        } else {
            i = C19019a.f53121a[type.ordinal()];
        }
        if (i == 1) {
            lVar = C12887l.CLIENT;
        } else if (i == 2) {
            lVar = C12887l.OPERATOR;
        } else if (i != 3) {
            lVar = C12887l.OPERATOR;
        } else {
            lVar = C12887l.BOT;
        }
        C12887l lVar2 = lVar;
        if (b == C12885j.FILE_ATTACHMENT) {
            bVar = new C12870a.C12872b(mo47182a(message.getFileId(), ((ResponsePayload) chatApiModel.getPayload()).getFileReference(), ((ResponsePayload) chatApiModel.getPayload()).getFileDownloadToken()), message.getFileName(), message.getFileSize(), message.getContentType());
        } else {
            bVar = null;
        }
        if (lVar2 != C12887l.CLIENT || ((ResponsePayload) chatApiModel.getPayload()).getStatusCode() == StatusCode.SUCCESS) {
            iVar = C12884i.DEFAULT;
        } else {
            iVar = C12884i.FAILED;
        }
        C12884i iVar2 = iVar;
        try {
            ChatbotComponent callChatbotComponent = ((ResponsePayload) chatApiModel.getPayload()).getCallChatbotComponent();
            if (callChatbotComponent != null) {
                ChatbotComponentType chatbotComponentType = callChatbotComponent.getChatbotComponentType();
                if (chatbotComponentType != null) {
                    i2 = C19019a.f53122b[chatbotComponentType.ordinal()];
                }
                switch (i2) {
                    case -1:
                        break;
                    case 1:
                        component2 = (Component) this.f53120a.mo18170l(callChatbotComponent.getProperties(), AccountListComponent.class);
                        break;
                    case 2:
                        component2 = (Component) this.f53120a.mo18170l(callChatbotComponent.getProperties(), PreContractComponent.class);
                        break;
                    case 3:
                        component2 = (Component) this.f53120a.mo18170l(callChatbotComponent.getProperties(), ProductOfferComponent.class);
                        break;
                    case 4:
                        component2 = (Component) this.f53120a.mo18170l(callChatbotComponent.getProperties(), FeedbackComponent.class);
                        break;
                    case 5:
                        component2 = (Component) this.f53120a.mo18170l(callChatbotComponent.getProperties(), CalendarRangeComponent.class);
                        break;
                    case 6:
                        Object m = this.f53120a.mo18171m(callChatbotComponent.getProperties(), C8982a.getParameterized(List.class, ProductsSliderComponent.class).getType());
                        C41536l.m120488h(m, "gson.fromJson(\n         …                        )");
                        component2 = new ProductsSliderComponentsList((List) m);
                        break;
                    case 7:
                        component2 = (Component) this.f53120a.mo18170l(callChatbotComponent.getProperties(), FAQComponent.class);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            component2 = null;
            component = component2;
        } catch (Exception unused) {
            component = null;
        }
        String uuid = UUID.randomUUID().toString();
        C41536l.m120488h(uuid, "randomUUID().toString()");
        if (message.getUtcTime() == 0) {
            j = new Date().getTime();
        } else {
            j = message.getUtcTime();
        }
        C12886k kVar = new C12886k(lVar2, from.getNickname(), (Integer) null, 4, (DefaultConstructorMarker) null);
        String text = message.getText();
        Long messageId = ((ResponsePayload) chatApiModel.getPayload()).getMessageId();
        List<ChoiceApi> choices = ((ResponsePayload) chatApiModel.getPayload()).getChoices();
        String str = "";
        if (choices != null) {
            arrayList = new ArrayList();
            for (ChoiceApi choiceApi : choices) {
                if (choiceApi == null || (title = choiceApi.getTitle()) == null) {
                    eVar = null;
                } else {
                    String payload = choiceApi.getPayload();
                    if (payload == null) {
                        payload = str;
                    }
                    eVar = new C12876e(title, payload);
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
            }
        } else {
            arrayList = null;
        }
        Boolean feedbackRequired = ((ResponsePayload) chatApiModel.getPayload()).getFeedbackRequired();
        if (feedbackRequired != null) {
            z2 = feedbackRequired.booleanValue();
        }
        boolean z3 = z2;
        BotFile botFileUrl = ((ResponsePayload) chatApiModel.getPayload()).getBotFileUrl();
        if (botFileUrl != null) {
            String title2 = botFileUrl.getTitle();
            if (title2 == null) {
                title2 = str;
            }
            String url = botFileUrl.getUrl();
            if (url == null) {
                url = str;
            }
            String name = botFileUrl.getName();
            if (name == null) {
                name = str;
            }
            String extension = botFileUrl.getExtension();
            if (extension != null) {
                str = extension;
            }
            bVar2 = new C12873b(title2, url, name, str);
        } else {
            bVar2 = null;
        }
        return new C12878g(uuid, j, kVar, b, text, messageId, bVar, iVar2, arrayList, z3, bVar2, component);
    }

    /* renamed from: d */
    public final C12875d mo47184d(CheckPolicyApi checkPolicyApi) {
        int i;
        boolean z;
        C41536l.m120489i(checkPolicyApi, "checkPolicyApi");
        Integer code = checkPolicyApi.getCode();
        if (code != null) {
            i = code.intValue();
        } else {
            i = -1;
        }
        String status = checkPolicyApi.getStatus();
        if (status == null) {
            status = "";
        }
        Boolean approved = checkPolicyApi.getApproved();
        if (approved != null) {
            z = approved.booleanValue();
        } else {
            z = false;
        }
        return new C12875d(i, status, z);
    }

    /* renamed from: e */
    public final List mo47185e(ChatHistoryResponse chatHistoryResponse) {
        boolean z;
        C41536l.m120489i(chatHistoryResponse, "response");
        ArrayList arrayList = new ArrayList();
        for (ChatApiModel c : chatHistoryResponse.getData()) {
            arrayList.add(mo47183c(c));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            C12878g gVar = (C12878g) next;
            if (gVar.mo33591i() == C12885j.TEXT && gVar.mo33584d() == null && C41536l.m120484d(gVar.mo33595m(), "")) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* renamed from: f */
    public final C12888m mo47186f(ChatApiModel chatApiModel) {
        int i;
        C41536l.m120489i(chatApiModel, "apiModel");
        C12878g c = mo47183c(chatApiModel);
        Operation operation = chatApiModel.getOperation();
        if (operation == null) {
            i = -1;
        } else {
            i = C19019a.f53124d[operation.ordinal()];
        }
        if (i == 4) {
            return new C12888m.C12889a(c);
        }
        if (i != 5) {
            return null;
        }
        return new C12888m.C12890b(c);
    }
}
