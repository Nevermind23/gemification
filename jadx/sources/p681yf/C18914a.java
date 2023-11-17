package p681yf;

import ci1.C40458f;
import ci1.C40464l;
import ci1.C40467o;
import ci1.C40469q;
import ci1.C40472t;
import ed1.C40734b;
import ed1.C40762x;
import of1.C41939y;
import p341ge.bog.chat.data.entitiy.response.CheckPolicyApi;
import p341ge.bog.chat.data.history.ChatHistoryResponse;
import p341ge.bog.chat.data.history.FileUploadResponse;

/* renamed from: yf.a */
public interface C18914a {
    @C40467o("chat-api/approval/save")
    /* renamed from: a */
    C40734b mo46914a(@C40472t("ssoToken") String str, @C40472t("channel") String str2, @C40472t("value") String str3);

    @C40458f("chat-api/approval/check")
    /* renamed from: b */
    C40762x<CheckPolicyApi> mo46915b(@C40472t("ssoToken") String str, @C40472t("channel") String str2);

    @C40467o("chat-api/firebase/update")
    /* renamed from: c */
    C40734b mo46916c(@C40472t("channel") String str, @C40472t("chatUserId") String str2, @C40472t("firebaseToken") String str3, @C40472t("os") String str4, @C40472t("sessionId") String str5, @C40472t("extCustomerId") String str6);

    @C40464l
    @C40467o("chat-api/file/upload")
    /* renamed from: d */
    C40762x<FileUploadResponse> mo46917d(@C40472t("alias") String str, @C40472t("chatUserId") String str2, @C40472t("secureKey") String str3, @C40472t("userId") String str4, @C40472t("chatId") String str5, @C40472t("channel") String str6, @C40469q C41939y.C41942c cVar);

    @C40458f("chat-api/customer/messages-mobile")
    /* renamed from: e */
    C40762x<ChatHistoryResponse> mo46918e(@C40472t("lastTime") Long l, @C40472t("limit") int i, @C40472t("token") String str, @C40472t("channel") String str2);

    @C40467o("chat-api/message/acknowledge")
    /* renamed from: f */
    C40734b mo46919f(@C40472t("messageId") Long l);
}
