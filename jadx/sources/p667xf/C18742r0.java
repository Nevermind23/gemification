package p667xf;

import android.text.TextUtils;
import android.util.Log;
import be1.C40330c;
import com.google.gson.Gson;
import de1.C40640a;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40741h;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41872c0;
import of1.C41937x;
import of1.C41939y;
import p316xa.C8982a;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.chat.data.InvalidTokenException;
import p341ge.bog.chat.data.entitiy.ChatApiModel;
import p341ge.bog.chat.data.entitiy.EventApiModel;
import p341ge.bog.chat.data.entitiy.MessageTypeApiModel;
import p341ge.bog.chat.data.entitiy.Operation;
import p341ge.bog.chat.data.entitiy.Session;
import p341ge.bog.chat.data.entitiy.request.RequestChatPayload;
import p341ge.bog.chat.data.entitiy.request.TextMessagePayload;
import p341ge.bog.chat.data.entitiy.response.CheckPolicyApi;
import p341ge.bog.chat.data.entitiy.response.Message;
import p341ge.bog.chat.data.entitiy.response.ParticipantApiModel;
import p341ge.bog.chat.data.entitiy.response.ResponsePayload;
import p341ge.bog.chat.data.entitiy.response.StatusCode;
import p341ge.bog.chat.data.history.ChatHistoryResponse;
import p341ge.bog.chat.data.history.FileUploadResponse;
import p341ge.bog.chat.domain.model.components.Component;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p348ag.C9854a;
import p348ag.C9856c;
import p362bg.C10272b;
import p405eg.C12449f;
import p405eg.C12451g;
import p419fg.C12870a;
import p419fg.C12873b;
import p419fg.C12874c;
import p419fg.C12875d;
import p419fg.C12877f;
import p419fg.C12878g;
import p419fg.C12880h;
import p419fg.C12884i;
import p419fg.C12885j;
import p419fg.C12886k;
import p419fg.C12887l;
import p419fg.C12888m;
import p433gg.C15276a;
import p652we.C18561l;
import p653wf.C18582k;
import p681yf.C18914a;
import p695zf.C19018a;
import uh1.C43108c;

/* renamed from: xf.r0 */
public final class C18742r0 implements C15276a {

    /* renamed from: B */
    public static final C18743a f52377B = new C18743a((DefaultConstructorMarker) null);

    /* renamed from: C */
    private static final Object f52378C = new Object();

    /* renamed from: D */
    private static final Object f52379D = new Object();

    /* renamed from: E */
    private static final Object f52380E = new Object();

    /* renamed from: F */
    private static final Object f52381F = new Object();

    /* renamed from: A */
    private boolean f52382A;

    /* renamed from: a */
    private final C9856c f52383a;

    /* renamed from: b */
    private final C18914a f52384b;

    /* renamed from: c */
    private final C9854a f52385c;

    /* renamed from: d */
    private final C19018a f52386d;

    /* renamed from: e */
    private final Gson f52387e;

    /* renamed from: f */
    private final C18749t0 f52388f;

    /* renamed from: g */
    private final C12449f f52389g;

    /* renamed from: h */
    private final C12451g f52390h;

    /* renamed from: i */
    private final C18582k f52391i;

    /* renamed from: j */
    private C41204a f52392j = new C41204a();

    /* renamed from: k */
    private C40330c f52393k;

    /* renamed from: l */
    private final C40741h f52394l;

    /* renamed from: m */
    private C40765a f52395m;

    /* renamed from: n */
    private final C40765a f52396n;

    /* renamed from: o */
    private C40765a f52397o;

    /* renamed from: p */
    private final C40765a f52398p;

    /* renamed from: q */
    private ArrayList f52399q;

    /* renamed from: r */
    private C40765a f52400r;

    /* renamed from: s */
    private final C40749p f52401s;

    /* renamed from: t */
    private AtomicBoolean f52402t;

    /* renamed from: u */
    private C40765a f52403u;

    /* renamed from: v */
    private final C40749p f52404v;

    /* renamed from: w */
    private C40765a f52405w;

    /* renamed from: x */
    private final C40749p f52406x;

    /* renamed from: y */
    private C40765a f52407y;

    /* renamed from: z */
    private ChatUser f52408z;

    /* renamed from: xf.r0$a */
    public static final class C18743a {
        private C18743a() {
        }

        public /* synthetic */ C18743a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: xf.r0$b */
    public /* synthetic */ class C18744b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52409a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f52410b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f52411c;

        static {
            int[] iArr = new int[Operation.values().length];
            iArr[Operation.SEND_MESSAGE.ordinal()] = 1;
            iArr[Operation.PUSH_URL.ordinal()] = 2;
            iArr[Operation.START_TYPING.ordinal()] = 3;
            iArr[Operation.STOP_TYPING.ordinal()] = 4;
            iArr[Operation.REQUEST_CHAT.ordinal()] = 5;
            f52409a = iArr;
            int[] iArr2 = new int[EventApiModel.values().length];
            iArr2[EventApiModel.PARTICIPANT_JOINED.ordinal()] = 1;
            iArr2[EventApiModel.PARTICIPANT_LEFT.ordinal()] = 2;
            iArr2[EventApiModel.FILE_UPLOADED.ordinal()] = 3;
            f52410b = iArr2;
            int[] iArr3 = new int[MessageTypeApiModel.values().length];
            iArr3[MessageTypeApiModel.REQUEST.ordinal()] = 1;
            iArr3[MessageTypeApiModel.RESPONSE.ordinal()] = 2;
            iArr3[MessageTypeApiModel.EVENT.ordinal()] = 3;
            f52411c = iArr3;
        }
    }

    /* renamed from: xf.r0$c */
    public static final class C18745c extends C8982a<ChatApiModel<ResponsePayload>> {
        C18745c() {
        }
    }

    public C18742r0(C9856c cVar, C18914a aVar, C9854a aVar2, C19018a aVar3, Gson gson, C18749t0 t0Var, C12449f fVar, C12451g gVar, C18582k kVar) {
        C41536l.m120489i(cVar, "chatService");
        C41536l.m120489i(aVar, "restService");
        C41536l.m120489i(aVar2, "chatLifeCycle");
        C41536l.m120489i(aVar3, "mapper");
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(t0Var, "sessionStorage");
        this.f52383a = cVar;
        this.f52384b = aVar;
        this.f52385c = aVar2;
        this.f52386d = aVar3;
        this.f52387e = gson;
        this.f52388f = t0Var;
        this.f52389g = fVar;
        this.f52390h = gVar;
        this.f52391i = kVar;
        C40330c M = C40330c.m116776M();
        C41536l.m120488h(M, "create<Any>()");
        this.f52393k = M;
        C40741h v = M.mo94935q(new C18734n0()).mo94939v(new C18736o0());
        C41536l.m120488h(v, "_messagesSubject.filter … it as MessageEvent\n    }");
        this.f52394l = v;
        Boolean bool = Boolean.FALSE;
        C40765a i1 = C40765a.m118199i1(bool);
        C41536l.m120488h(i1, "createDefault(false)");
        this.f52395m = i1;
        this.f52396n = i1;
        C40765a i12 = C40765a.m118199i1(bool);
        C41536l.m120488h(i12, "createDefault(false)");
        this.f52397o = i12;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<ChatUserInfo>()");
        this.f52398p = h1;
        this.f52399q = new ArrayList();
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create<Any>()");
        this.f52400r = h12;
        this.f52401s = h12.mo94990M(new C18738p0()).mo95026k0(new C18740q0());
        this.f52402t = new AtomicBoolean(false);
        C40765a h13 = C40765a.m118198h1();
        C41536l.m120488h(h13, "create<Any>()");
        this.f52403u = h13;
        this.f52404v = h13.mo94990M(new C18709b()).mo95026k0(new C18711c());
        C40765a h14 = C40765a.m118198h1();
        C41536l.m120488h(h14, "create<Any>()");
        this.f52405w = h14;
        this.f52406x = h14.mo94990M(new C18713d()).mo95026k0(new C18715e());
        C40765a i13 = C40765a.m118199i1(0);
        C41536l.m120488h(i13, "createDefault(0)");
        this.f52407y = i13;
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public static final C40754t m63353A0(C18742r0 r0Var, List list) {
        C41536l.m120489i(r0Var, "this$0");
        C41536l.m120489i(list, "it");
        if (r0Var.f52402t.get()) {
            return C40749p.m118027J();
        }
        r0Var.f52402t.set(true);
        return C40749p.m118043h0(list).mo94971A(new C18718f0(r0Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m63354A1(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public static final void m63356B0(C18742r0 r0Var) {
        C41536l.m120489i(r0Var, "this$0");
        r0Var.f52402t.set(false);
    }

    /* renamed from: B1 */
    private final void m63357B1(C12878g gVar) {
        C12884i iVar;
        synchronized (this.f52399q) {
            C12878g gVar2 = (C12878g) C41358y.m120009Y(this.f52399q);
            if (gVar2 != null) {
                if (!C41536l.m120484d(gVar.mo33589h(), gVar2.mo33589h())) {
                    iVar = C12884i.DEFAULT;
                    gVar.mo33600r(iVar);
                    this.f52393k.onNext(new C12880h.C12883c(gVar));
                    C41238w wVar = C41238w.f97225a;
                }
            }
            iVar = C12884i.SENT;
            gVar.mo33600r(iVar);
            this.f52393k.onNext(new C12880h.C12883c(gVar));
            C41238w wVar2 = C41238w.f97225a;
        }
    }

    /* renamed from: C0 */
    private final String m63359C0() {
        ChatUser chatUser = this.f52408z;
        ChatUser chatUser2 = null;
        if (chatUser == null) {
            C41536l.m120506z("user");
            chatUser = null;
        }
        if (!TextUtils.isEmpty(chatUser.mo33799f())) {
            ChatUser chatUser3 = this.f52408z;
            if (chatUser3 == null) {
                C41536l.m120506z("user");
            } else {
                chatUser2 = chatUser3;
            }
            return chatUser2.mo33799f();
        }
        ChatUser chatUser4 = this.f52408z;
        if (chatUser4 == null) {
            C41536l.m120506z("user");
        } else {
            chatUser2 = chatUser4;
        }
        return chatUser2.mo33805k();
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public final void m63361D0(C10272b bVar) {
        StatusCode statusCode;
        boolean z;
        String str;
        int i;
        String f = bVar.mo26869f();
        String str2 = null;
        if (C41536l.m120484d(f, "CONNECTED")) {
            m63431m1(this, (ChatApiModel) null, "SUBSCRIBE", 1, (Object) null);
            this.f52397o.onNext(Boolean.TRUE);
        } else if (C41536l.m120484d(f, "MESSAGE") && bVar.mo26868e() != null && C41536l.m120484d(bVar.mo26867c("destination"), "/user/queue/chat")) {
            ChatApiModel chatApiModel = (ChatApiModel) this.f52387e.mo18171m(bVar.mo26868e(), new C18745c().getType());
            ResponsePayload responsePayload = (ResponsePayload) chatApiModel.getPayload();
            if (responsePayload != null) {
                statusCode = responsePayload.getStatusCode();
            } else {
                statusCode = null;
            }
            if (statusCode == StatusCode.INVALID_SESSION_ERROR) {
                m63428l0(this, (C12874c) null, 1, (Object) null);
                mo42347d();
                return;
            }
            ResponsePayload responsePayload2 = (ResponsePayload) chatApiModel.getPayload();
            if (responsePayload2 != null) {
                z = C41536l.m120484d(responsePayload2.getChatEnded(), Boolean.TRUE);
            } else {
                z = false;
            }
            int i2 = -1;
            if (z) {
                Session session = chatApiModel.getSession();
                if (session != null) {
                    str = session.getChatUserId();
                } else {
                    str = null;
                }
                Integer conversationId = ((ResponsePayload) chatApiModel.getPayload()).getConversationId();
                if (true ^ ((ResponsePayload) chatApiModel.getPayload()).getMessages().isEmpty()) {
                    ParticipantApiModel from = ((ResponsePayload) chatApiModel.getPayload()).getMessages().get(0).getFrom();
                    if (from != null) {
                        i = Integer.valueOf(from.getParticipantId());
                    } else {
                        i = null;
                    }
                } else {
                    i = -1;
                }
                ParticipantApiModel from2 = ((ResponsePayload) chatApiModel.getPayload()).getMessages().get(0).getFrom();
                if (from2 != null) {
                    str2 = from2.getNickname();
                }
                m63426k0(new C12874c(str, conversationId, i, str2));
            } else if (chatApiModel.getMessageType() != null) {
                int i3 = C18744b.f52411c[chatApiModel.getMessageType().ordinal()];
                if (i3 == 1) {
                    Operation operation = chatApiModel.getOperation();
                    if (operation != null) {
                        i2 = C18744b.f52409a[operation.ordinal()];
                    }
                    if (i2 == 1 || i2 == 2) {
                        C19018a aVar = this.f52386d;
                        C41536l.m120488h(chatApiModel, "chatModel");
                        m63377L0(aVar.mo47183c(chatApiModel));
                        if (chatApiModel.getOperation() == Operation.SEND_MESSAGE && this.f52388f.mo46525b()) {
                            m63389R0(chatApiModel.getSession());
                        }
                    } else if (i2 == 3 || i2 == 4) {
                        C41536l.m120488h(chatApiModel, "chatModel");
                        m63456v1(chatApiModel);
                    }
                } else if (i3 == 2) {
                    Operation operation2 = chatApiModel.getOperation();
                    if (operation2 != null) {
                        i2 = C18744b.f52409a[operation2.ordinal()];
                    }
                    if (i2 == 1) {
                        C41536l.m120488h(chatApiModel, "chatModel");
                        m63371I0(chatApiModel);
                    } else if (i2 == 5) {
                        m63433n1(chatApiModel.getSession());
                    }
                } else if (i3 == 3) {
                    EventApiModel event = chatApiModel.getEvent();
                    if (event != null) {
                        i2 = C18744b.f52410b[event.ordinal()];
                    }
                    if (i2 == 1) {
                        if (chatApiModel.getOperation() == Operation.REQUEST_CHAT) {
                            m63433n1(chatApiModel.getSession());
                        }
                        C41536l.m120488h(chatApiModel, "chatModel");
                        m63391S0(chatApiModel);
                    } else if (i2 == 2) {
                        C19018a aVar2 = this.f52386d;
                        C41536l.m120488h(chatApiModel, "chatModel");
                        C12878g c = aVar2.mo47183c(chatApiModel);
                        if (C41536l.m120484d(c.mo33592j().mo33616a(), "საქართველოს ბანკი")) {
                            m63377L0(c);
                        }
                    } else if (i2 == 3) {
                        C19018a aVar3 = this.f52386d;
                        C41536l.m120488h(chatApiModel, "chatModel");
                        m63377L0(aVar3.mo47183c(chatApiModel));
                    }
                }
            }
        }
    }

    /* renamed from: E0 */
    private final void m63363E0() {
        int i;
        if (!this.f52393k.mo94360N()) {
            Object j1 = this.f52407y.mo95100j1();
            C41536l.m120486f(j1);
            i = ((Number) j1).intValue() + 1;
        } else {
            i = 0;
        }
        this.f52407y.onNext(Integer.valueOf(i));
    }

    /* renamed from: F0 */
    private final boolean m63365F0() {
        ChatUser chatUser = this.f52408z;
        if (chatUser == null) {
            C41536l.m120506z("user");
            chatUser = null;
        }
        return chatUser.mo33806l() != 0;
    }

    /* renamed from: G0 */
    private final boolean m63367G0() {
        return C41536l.m120484d(this.f52395m.mo95100j1(), Boolean.TRUE);
    }

    /* renamed from: H0 */
    private final boolean m63369H0() {
        List list;
        C12873b bVar;
        Component component;
        String str;
        List list2;
        C12878g gVar = (C12878g) C41358y.m120010Z(this.f52399q, 0);
        C12878g gVar2 = (C12878g) C41358y.m120010Z(this.f52399q, 1);
        C12873b bVar2 = null;
        if (gVar != null) {
            list = gVar.mo33585e();
        } else {
            list = null;
        }
        if (list == null) {
            if (gVar != null) {
                bVar = gVar.mo33584d();
            } else {
                bVar = null;
            }
            if (bVar == null) {
                if (gVar != null) {
                    component = gVar.mo33587f();
                } else {
                    component = null;
                }
                if (component == null) {
                    if (gVar != null) {
                        str = gVar.mo33595m();
                    } else {
                        str = null;
                    }
                    if (!C41536l.m120484d(str, "👍")) {
                        return false;
                    }
                    if (gVar2 != null) {
                        list2 = gVar2.mo33585e();
                    } else {
                        list2 = null;
                    }
                    if (list2 == null) {
                        if (gVar2 != null) {
                            bVar2 = gVar2.mo33584d();
                        }
                        if (bVar2 == null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: I0 */
    private final void m63371I0(ChatApiModel chatApiModel) {
        List<Message> messages;
        Message message;
        int i;
        ResponsePayload responsePayload = (ResponsePayload) chatApiModel.getPayload();
        if (responsePayload != null && (messages = responsePayload.getMessages()) != null && (message = (Message) C41358y.m120009Y(messages)) != null) {
            String requestId = ((ResponsePayload) chatApiModel.getPayload()).getRequestId();
            synchronized (this.f52399q) {
                ArrayList arrayList = this.f52399q;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (C41536l.m120484d(((C12878g) listIterator.previous()).mo33589h(), requestId)) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    Object obj = this.f52399q.get(i);
                    C41536l.m120488h(obj, "cachedMessages[index]");
                    C12878g b = C12878g.m48709b((C12878g) obj, (String) null, message.getUtcTime(), (C12886k) null, (C12885j) null, (String) null, (Long) null, (C12870a) null, (C12884i) null, (List) null, false, (C12873b) null, (Component) null, 4093, (Object) null);
                    this.f52399q.set(i, b);
                    this.f52393k.onNext(new C12880h.C12883c(b));
                }
                C41238w wVar = C41238w.f97225a;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public static final boolean m63373J0(Object obj) {
        C41536l.m120489i(obj, "it");
        return obj instanceof C12880h;
    }

    /* access modifiers changed from: private */
    /* renamed from: K0 */
    public static final C12880h m63375K0(Object obj) {
        C41536l.m120489i(obj, "it");
        return (C12880h) obj;
    }

    /* renamed from: L0 */
    private final void m63377L0(C12878g gVar) {
        m63363E0();
        this.f52392j.mo95660b(this.f52384b.mo46919f(gVar.mo33593k()).mo94888G(new C18714d0(), new C18716e0()));
        this.f52400r.onNext(new C12888m.C12890b((C12878g) null, 1, (DefaultConstructorMarker) null));
        for (C12878g q : this.f52399q) {
            q.mo33599q(false);
        }
        m63418g0(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m63379M0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m63381N0(Throwable th) {
    }

    /* renamed from: O0 */
    private final void m63383O0() {
        this.f52392j.mo95660b(this.f52383a.mo26353c().mo94923G(C40640a.m117458b()).mo94920C(new C18739q(this)));
    }

    /* renamed from: P0 */
    private final void m63385P0() {
        this.f52392j.mo95660b(this.f52383a.mo26351a().mo94923G(C40640a.m117458b()).mo94920C(new C18741r(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public static final void m63387Q0(C18742r0 r0Var, C18561l.C18562a aVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(r0Var, "this$0");
        if (aVar instanceof C18561l.C18562a.C18563a) {
            z = true;
        } else {
            z = aVar instanceof C18561l.C18562a.C18564b;
        }
        if (z) {
            z2 = true;
        } else {
            z2 = aVar instanceof C18561l.C18562a.C18565c;
        }
        if (z2) {
            r0Var.f52395m.onNext(Boolean.FALSE);
        } else if (aVar instanceof C18561l.C18562a.C18566d) {
            m63431m1(r0Var, (ChatApiModel) null, "CONNECT", 1, (Object) null);
        } else if (aVar instanceof C18561l.C18562a.C18567e) {
            Log.d("ragaca", aVar.toString());
        }
    }

    /* renamed from: R0 */
    private final void m63389R0(Session session) {
        m63433n1(session);
    }

    /* renamed from: S0 */
    private final void m63391S0(ChatApiModel chatApiModel) {
        m63397V0();
        C12878g c = this.f52386d.mo47183c(chatApiModel);
        if (c.mo33592j().mo33617b() != C12887l.CLIENT) {
            this.f52403u.onNext(c.mo33592j());
        }
        if (c.mo33592j().mo33617b() == C12887l.OPERATOR) {
            if (!C41536l.m120484d(c.mo33592j().mo33616a(), "საქართველოს ბანკი")) {
                m63418g0(c);
            }
        } else if (c.mo33592j().mo33617b() == C12887l.BOT) {
            m63401X0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public static final void m63393T0(C18742r0 r0Var, C43108c cVar) {
        C41536l.m120489i(r0Var, "this$0");
        r0Var.f52407y.onNext(0);
    }

    /* renamed from: U0 */
    private final C40734b m63395U0() {
        C12451g gVar;
        if (m63365F0() && (gVar = this.f52390h) != null) {
            return gVar.mo33062a();
        }
        C40734b i = C40734b.m117918i();
        C41536l.m120488h(i, "{\n            Completable.complete()\n        }");
        return i;
    }

    /* renamed from: V0 */
    private final void m63397V0() {
        Object obj;
        boolean z;
        synchronized (this.f52399q) {
            Iterator it = this.f52399q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C12878g) obj).mo33591i() == C12885j.PARTICIPANT_LEFT) {
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
            C12878g gVar = (C12878g) obj;
            if (gVar != null) {
                this.f52393k.onNext(new C12880h.C12881a(gVar));
                C41238w wVar = C41238w.f97225a;
            }
        }
    }

    /* renamed from: W0 */
    private final void m63399W0() {
        synchronized (this.f52399q) {
            for (C12878g q : this.f52399q) {
                q.mo33599q(false);
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: X0 */
    private final void m63401X0() {
        C12885j jVar;
        synchronized (this.f52399q) {
            C12878g gVar = (C12878g) C41358y.m120009Y(this.f52399q);
            if (gVar != null) {
                jVar = gVar.mo33591i();
            } else {
                jVar = null;
            }
            if (jVar == C12885j.PARTICIPANT_JOINED) {
                this.f52399q.remove(0);
                this.f52393k.onNext(new C12880h.C12881a(gVar));
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: Y0 */
    private final void m63403Y0() {
        String str;
        MessageTypeApiModel messageTypeApiModel = MessageTypeApiModel.REQUEST;
        Operation operation = Operation.REQUEST_CHAT;
        String C0 = m63359C0();
        ChatUser chatUser = this.f52408z;
        if (chatUser == null) {
            C41536l.m120506z("user");
            chatUser = null;
        }
        String k = chatUser.mo33805k();
        ChatUser chatUser2 = this.f52408z;
        if (chatUser2 == null) {
            C41536l.m120506z("user");
            chatUser2 = null;
        }
        String m = chatUser2.mo33807m();
        ChatUser chatUser3 = this.f52408z;
        if (chatUser3 == null) {
            C41536l.m120506z("user");
            chatUser3 = null;
        }
        String d = chatUser3.mo33795d();
        ChatUser chatUser4 = this.f52408z;
        if (chatUser4 == null) {
            C41536l.m120506z("user");
            chatUser4 = null;
        }
        String g = chatUser4.mo33800g();
        ChatUser chatUser5 = this.f52408z;
        if (chatUser5 == null) {
            C41536l.m120506z("user");
            chatUser5 = null;
        }
        String h = chatUser5.mo33801h();
        ChatUser chatUser6 = this.f52408z;
        if (chatUser6 == null) {
            C41536l.m120506z("user");
            chatUser6 = null;
        }
        String i = chatUser6.mo33803i();
        ChatUser chatUser7 = this.f52408z;
        if (chatUser7 == null) {
            C41536l.m120506z("user");
            chatUser7 = null;
        }
        String a = chatUser7.mo33793a();
        ChatUser chatUser8 = this.f52408z;
        if (chatUser8 == null) {
            C41536l.m120506z("user");
            chatUser8 = null;
        }
        String e = chatUser8.mo33797e();
        ChatUser chatUser9 = this.f52408z;
        if (chatUser9 == null) {
            C41536l.m120506z("user");
            chatUser9 = null;
        }
        String b = chatUser9.mo33794b();
        C12449f fVar = this.f52389g;
        if (fVar != null) {
            str = fVar.mo33060a();
        } else {
            str = null;
        }
        ChatUser chatUser10 = this.f52408z;
        if (chatUser10 == null) {
            C41536l.m120506z("user");
            chatUser10 = null;
        }
        m63431m1(this, new ChatApiModel(messageTypeApiModel, operation, (EventApiModel) null, (Session) null, new RequestChatPayload(C0, k, m, d, "", g, h, i, a, e, b, str, AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID, chatUser10.mo33804j(), m63435o1()), 12, (DefaultConstructorMarker) null), (String) null, 2, (Object) null);
    }

    /* renamed from: Z0 */
    private final void m63405Z0() {
        if (this.f52388f.mo46524a() == null) {
            m63403Y0();
        } else {
            this.f52395m.onNext(Boolean.TRUE);
        }
    }

    /* renamed from: a1 */
    private final void m63407a1() {
        this.f52402t.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public static final void m63409b1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public static final void m63411c1(Throwable th) {
    }

    /* renamed from: d1 */
    private final void m63413d1() {
        m63431m1(this, new ChatApiModel(MessageTypeApiModel.REQUEST, Operation.DISCONNECT, (EventApiModel) null, this.f52388f.mo46524a(), (Object) null, 20, (DefaultConstructorMarker) null), (String) null, 2, (Object) null);
    }

    /* renamed from: e1 */
    private final void m63415e1(C12878g gVar, String str) {
        if (str == null && (str = gVar.mo33595m()) == null) {
            str = "";
        }
        this.f52392j.mo95660b(C40734b.m117925u(new C18707a(this, str, gVar)).mo94885D(m63395U0().mo94895d(C40734b.m117925u(new C18729l(this))).mo94895d(this.f52397o.mo94990M(new C18753w()).mo94994O().mo94955p()).mo94895d(C40734b.m117925u(new C18722h0(this)).mo94895d(this.f52396n.mo94990M(new C18730l0()).mo94994O().mo94955p()))).mo94890I(C40640a.m117458b()).mo94887F(new C18732m0(this, gVar)));
    }

    /* access modifiers changed from: private */
    /* renamed from: f1 */
    public static final C41238w m63417f1(C18742r0 r0Var, String str, C12878g gVar) {
        String str2;
        C18742r0 r0Var2 = r0Var;
        C41536l.m120489i(r0Var2, "this$0");
        C41536l.m120489i(str, "$messageText");
        C41536l.m120489i(gVar, "$message");
        MessageTypeApiModel messageTypeApiModel = MessageTypeApiModel.REQUEST;
        Operation operation = Operation.SEND_MESSAGE;
        Session a = r0Var2.f52388f.mo46524a();
        String h = gVar.mo33589h();
        String m = gVar.mo33595m();
        boolean z = !C41536l.m120484d(gVar.mo33595m(), "👍");
        C12449f fVar = r0Var2.f52389g;
        if (fVar != null) {
            str2 = fVar.mo33060a();
        } else {
            str2 = null;
        }
        ChatUser chatUser = r0Var2.f52408z;
        if (chatUser == null) {
            C41536l.m120506z("user");
            chatUser = null;
        }
        String h2 = chatUser.mo33801h();
        ChatUser chatUser2 = r0Var2.f52408z;
        if (chatUser2 == null) {
            C41536l.m120506z("user");
            chatUser2 = null;
        }
        String a2 = chatUser2.mo33793a();
        ChatUser chatUser3 = r0Var2.f52408z;
        if (chatUser3 == null) {
            C41536l.m120506z("user");
            chatUser3 = null;
        }
        m63431m1(r0Var2, new ChatApiModel(messageTypeApiModel, operation, (EventApiModel) null, a, new TextMessagePayload(str, h, m, false, z, str2, h2, a2, AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID, chatUser3.mo33804j(), r0Var.m63435o1(), 8, (DefaultConstructorMarker) null), 4, (DefaultConstructorMarker) null), (String) null, 2, (Object) null);
        return C41238w.f97225a;
    }

    /* renamed from: g0 */
    private final void m63418g0(C12878g gVar) {
        synchronized (this.f52399q) {
            m63401X0();
            C12878g gVar2 = (C12878g) C41358y.m120009Y(this.f52399q);
            if (gVar2 != null && gVar2.mo33594l() == C12884i.SENT) {
                gVar2.mo33600r(C12884i.DEFAULT);
                this.f52393k.onNext(new C12880h.C12883c(gVar2));
            }
            this.f52399q.add(0, gVar);
            this.f52393k.onNext(new C12880h.C12882b(gVar));
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g1 */
    public static final C41238w m63419g1(C18742r0 r0Var) {
        C41536l.m120489i(r0Var, "this$0");
        r0Var.f52385c.mo26349c();
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m63420h0(C18742r0 r0Var, C12878g gVar, C41205b bVar) {
        C41536l.m120489i(r0Var, "this$0");
        C41536l.m120489i(gVar, "$message");
        r0Var.m63418g0(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public static final boolean m63421h1(Boolean bool) {
        C41536l.m120489i(bool, "isOpened");
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m63422i0(C18742r0 r0Var, C12870a.C12871a aVar, C12878g gVar, FileUploadResponse fileUploadResponse) {
        int i;
        C12884i iVar;
        C18742r0 r0Var2 = r0Var;
        C41536l.m120489i(r0Var2, "this$0");
        C41536l.m120489i(aVar, "$attachment");
        C41536l.m120489i(gVar, "$message");
        synchronized (r0Var2.f52399q) {
            ArrayList arrayList = r0Var2.f52399q;
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (C41536l.m120484d(((C12878g) listIterator.previous()).mo33589h(), gVar.mo33589h())) {
                        i = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            Object obj = r0Var2.f52399q.get(i);
            C41536l.m120488h(obj, "cachedMessages[index]");
            C12878g gVar2 = (C12878g) obj;
            C12870a.C12872b bVar = new C12870a.C12872b(r0Var2.f52386d.mo47182a(fileUploadResponse.getPayload().getFileId(), fileUploadResponse.getPayload().getFileReference(), fileUploadResponse.getPayload().getFileDownloadToken()), aVar.mo33555b(), aVar.mo33556c(), aVar.mo33554a());
            if (i == 0) {
                iVar = C12884i.SENT;
            } else {
                iVar = C12884i.DEFAULT;
            }
            C12878g b = C12878g.m48709b(gVar2, (String) null, 0, (C12886k) null, (C12885j) null, (String) null, (Long) null, bVar, iVar, (List) null, false, (C12873b) null, (Component) null, 3903, (Object) null);
            r0Var2.f52399q.set(i, b);
            r0Var2.f52393k.onNext(new C12880h.C12883c(b));
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public static final C41238w m63423i1(C18742r0 r0Var) {
        C41536l.m120489i(r0Var, "this$0");
        r0Var.m63405Z0();
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m63424j0(Throwable th) {
        th.printStackTrace();
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public static final boolean m63425j1(Boolean bool) {
        C41536l.m120489i(bool, "isOpened");
        return bool.booleanValue();
    }

    /* renamed from: k0 */
    private final void m63426k0(C12874c cVar) {
        this.f52405w.onNext(C12877f.SESSION_ENDED);
        this.f52400r.onNext(new C12888m.C12890b((C12878g) null, 1, (DefaultConstructorMarker) null));
        this.f52403u.onNext(new C12886k(C12887l.BOT, (String) null, (Integer) null, 6, (DefaultConstructorMarker) null));
        m63401X0();
        this.f52388f.mo46526c();
        this.f52385c.mo26348b();
        C40765a aVar = this.f52395m;
        Boolean bool = Boolean.FALSE;
        aVar.onNext(bool);
        this.f52397o.onNext(bool);
        this.f52382A = false;
        if (cVar != null) {
            this.f52398p.onNext(cVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m63427k1(C18742r0 r0Var, C12878g gVar) {
        C41536l.m120489i(r0Var, "this$0");
        C41536l.m120489i(gVar, "$message");
        r0Var.m63357B1(gVar);
    }

    /* renamed from: l0 */
    static /* synthetic */ void m63428l0(C18742r0 r0Var, C12874c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        r0Var.m63426k0(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x013e  */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m63429l1(p341ge.bog.chat.data.entitiy.ChatApiModel r11, java.lang.String r12) {
        /*
            r10 = this;
            int r0 = r12.hashCode()
            r1 = -993530582(0xffffffffc4c7ed2a, float:-1599.4114)
            java.lang.String r2 = "destination"
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r0 == r1) goto L_0x010e
            r1 = 2541448(0x26c788, float:3.561327E-39)
            java.lang.String r7 = "token"
            if (r0 == r1) goto L_0x00de
            r1 = 1669334218(0x638004ca, float:4.7230567E21)
            if (r0 == r1) goto L_0x001d
            goto L_0x0116
        L_0x001d:
            java.lang.String r0 = "CONNECT"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0027
            goto L_0x0116
        L_0x0027:
            r0 = 5
            bg.a[] r0 = new p362bg.C10271a[r0]
            bg.a r1 = new bg.a
            java.lang.String r2 = "accept-version"
            java.lang.String r8 = "1.1,1.2"
            r1.<init>(r2, r8)
            r0[r5] = r1
            bg.a r1 = new bg.a
            ge.bog.chat.data.ChatUser r2 = r10.f52408z
            java.lang.String r5 = "user"
            if (r2 != 0) goto L_0x0041
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r2 = r6
        L_0x0041:
            java.lang.String r2 = r2.mo33805k()
            ge.bog.chat.data.ChatUser r8 = r10.f52408z
            if (r8 != 0) goto L_0x004d
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r8 = r6
        L_0x004d:
            java.lang.String r8 = r8.mo33807m()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r2 = " "
            r9.append(r2)
            r9.append(r8)
            java.lang.String r2 = r9.toString()
            r1.<init>(r5, r2)
            r0[r4] = r1
            bg.a r1 = new bg.a
            ge.bog.chat.data.ChatUser r2 = r10.f52408z
            if (r2 != 0) goto L_0x0074
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r2 = r6
        L_0x0074:
            java.lang.String r2 = r2.mo33799f()
            java.lang.String r4 = "nickname"
            r1.<init>(r4, r2)
            r0[r3] = r1
            bg.a r1 = new bg.a
            ge.bog.chat.data.ChatUser r2 = r10.f52408z
            if (r2 != 0) goto L_0x0089
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r2 = r6
        L_0x0089:
            java.lang.String r2 = r2.mo33800g()
            java.lang.String r3 = "phoneNumber"
            r1.<init>(r3, r2)
            r2 = 3
            r0[r2] = r1
            bg.a r1 = new bg.a
            ge.bog.chat.data.ChatUser r2 = r10.f52408z
            if (r2 != 0) goto L_0x009f
            kotlin.jvm.internal.C41536l.m120506z(r5)
            r2 = r6
        L_0x009f:
            java.lang.String r2 = r2.mo33794b()
            java.lang.String r3 = "channel"
            r1.<init>(r3, r2)
            r2 = 4
            r0[r2] = r1
            java.util.ArrayList r0 = ie1.C41341q.m119903f(r0)
            boolean r1 = r10.m63365F0()
            if (r1 == 0) goto L_0x00c7
            bg.a r1 = new bg.a
            eg.f r2 = r10.f52389g
            if (r2 == 0) goto L_0x00c0
            java.lang.String r2 = r2.mo33060a()
            goto L_0x00c1
        L_0x00c0:
            r2 = r6
        L_0x00c1:
            r1.<init>(r7, r2)
            r0.add(r1)
        L_0x00c7:
            xf.t0 r1 = r10.f52388f
            ge.bog.chat.data.entitiy.Session r1 = r1.mo46524a()
            if (r1 == 0) goto L_0x013b
            bg.a r2 = new bg.a
            java.lang.String r3 = "prevId"
            java.lang.String r1 = r1.getChatUserId()
            r2.<init>(r3, r1)
            r0.add(r2)
            goto L_0x013b
        L_0x00de:
            java.lang.String r0 = "SEND"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0116
            bg.a[] r0 = new p362bg.C10271a[r4]
            bg.a r1 = new bg.a
            java.lang.String r3 = "/app/chat"
            r1.<init>(r2, r3)
            r0[r5] = r1
            java.util.ArrayList r0 = ie1.C41341q.m119903f(r0)
            boolean r1 = r10.m63365F0()
            if (r1 == 0) goto L_0x013b
            bg.a r1 = new bg.a
            eg.f r2 = r10.f52389g
            if (r2 == 0) goto L_0x0106
            java.lang.String r2 = r2.mo33060a()
            goto L_0x0107
        L_0x0106:
            r2 = r6
        L_0x0107:
            r1.<init>(r7, r2)
            r0.add(r1)
            goto L_0x013b
        L_0x010e:
            java.lang.String r0 = "SUBSCRIBE"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x011b
        L_0x0116:
            java.util.List r0 = ie1.C41341q.m119907j()
            goto L_0x013b
        L_0x011b:
            bg.a[] r0 = new p362bg.C10271a[r3]
            bg.a r1 = new bg.a
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "id"
            r1.<init>(r7, r3)
            r0[r5] = r1
            bg.a r1 = new bg.a
            java.lang.String r3 = "/user/queue/chat"
            r1.<init>(r2, r3)
            r0[r4] = r1
            java.util.List r0 = ie1.C41341q.m119910m(r0)
        L_0x013b:
            if (r11 != 0) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            com.google.gson.Gson r1 = r10.f52387e
            java.lang.String r6 = r1.mo18181w(r11)
        L_0x0144:
            bg.b r11 = new bg.b
            r11.<init>(r12, r0, r6)
            ag.c r12 = r10.f52383a
            r12.mo26352b(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p667xf.C18742r0.m63429l1(ge.bog.chat.data.entitiy.ChatApiModel, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static final C12875d m63430m0(C18742r0 r0Var, CheckPolicyApi checkPolicyApi) {
        C41536l.m120489i(r0Var, "this$0");
        C41536l.m120489i(checkPolicyApi, "it");
        return r0Var.f52386d.mo47184d(checkPolicyApi);
    }

    /* renamed from: m1 */
    static /* synthetic */ void m63431m1(C18742r0 r0Var, ChatApiModel chatApiModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            chatApiModel = null;
        }
        if ((i & 2) != 0) {
            str = "SEND";
        }
        r0Var.m63429l1(chatApiModel, str);
    }

    /* renamed from: n0 */
    private final void m63432n0() {
        synchronized (this.f52399q) {
            for (C12878g gVar : this.f52399q) {
                gVar.mo33597o((List) null);
                gVar.mo33598p((Component) null);
            }
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: n1 */
    private final void m63433n1(Session session) {
        boolean z;
        this.f52388f.mo46527d(session);
        m63465y1();
        C40765a aVar = this.f52395m;
        if (session != null) {
            z = true;
        } else {
            z = false;
        }
        aVar.onNext(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public static final boolean m63434o0(C12888m mVar) {
        C41536l.m120489i(mVar, "it");
        return mVar instanceof C12888m.C12889a;
    }

    /* renamed from: o1 */
    private final String m63435o1() {
        return this.f52382A ? "in_app" : "chat_session_start";
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m63437p0(C18742r0 r0Var, C12888m mVar) {
        C41536l.m120489i(r0Var, "this$0");
        r0Var.m63401X0();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final C41238w m63438p1() {
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public static final boolean m63440q0(Boolean bool) {
        C41536l.m120489i(bool, "opened");
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final C41238w m63441q1(C18742r0 r0Var) {
        C41536l.m120489i(r0Var, "this$0");
        r0Var.f52385c.mo26349c();
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m63443r0(C18742r0 r0Var, Boolean bool) {
        C41536l.m120489i(r0Var, "this$0");
        r0Var.f52405w.onNext(C12877f.SESSION_STARTED);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final boolean m63444r1(Boolean bool) {
        C41536l.m120489i(bool, "isOpened");
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public static final boolean m63446s0(Object obj) {
        C41536l.m120489i(obj, "it");
        return obj instanceof C12877f;
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final C41238w m63447s1(C18742r0 r0Var) {
        C41536l.m120489i(r0Var, "this$0");
        r0Var.m63405Z0();
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public static final C12877f m63449t0(Object obj) {
        C41536l.m120489i(obj, "it");
        return (C12877f) obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final boolean m63450t1(Boolean bool) {
        C41536l.m120489i(bool, "isOpened");
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public static final boolean m63452u0(Object obj) {
        C41536l.m120489i(obj, "it");
        return obj instanceof C12886k;
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m63453u1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public static final C12886k m63455v0(Object obj) {
        C41536l.m120489i(obj, "it");
        return (C12886k) obj;
    }

    /* renamed from: v1 */
    private final void m63456v1(ChatApiModel chatApiModel) {
        C12888m f = this.f52386d.mo47186f(chatApiModel);
        if (f != null) {
            this.f52400r.onNext(f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public static final C40735b0 m63458w0(ChatHistoryResponse chatHistoryResponse) {
        C41536l.m120489i(chatHistoryResponse, "it");
        if (chatHistoryResponse.getCode() == 403) {
            return C40762x.m118158o(new InvalidTokenException());
        }
        return C40762x.m118162z(chatHistoryResponse);
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public static final boolean m63459w1(Object obj) {
        C41536l.m120489i(obj, "it");
        return obj instanceof C12888m;
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public static final C40735b0 m63461x0(C18742r0 r0Var, Long l, Throwable th) {
        C40734b a;
        String str;
        C41536l.m120489i(r0Var, "this$0");
        C41536l.m120489i(th, "it");
        if (!(th instanceof InvalidTokenException)) {
            return C40762x.m118158o(th);
        }
        C12451g gVar = r0Var.f52390h;
        ChatUser chatUser = null;
        if (gVar == null || (a = gVar.mo33062a()) == null) {
            return null;
        }
        C18914a aVar = r0Var.f52384b;
        C12449f fVar = r0Var.f52389g;
        if (fVar == null || (str = fVar.mo33060a()) == null) {
            str = "";
        }
        ChatUser chatUser2 = r0Var.f52408z;
        if (chatUser2 == null) {
            C41536l.m120506z("user");
        } else {
            chatUser = chatUser2;
        }
        return a.mo94898g(aVar.mo46918e(l, 30, str, chatUser.mo33794b()));
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final C12888m m63462x1(Object obj) {
        C41536l.m120489i(obj, "it");
        return (C12888m) obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public static final List m63464y0(C18742r0 r0Var, ChatHistoryResponse chatHistoryResponse) {
        C41536l.m120489i(r0Var, "this$0");
        C41536l.m120489i(chatHistoryResponse, "historyResponse");
        return r0Var.f52386d.mo47185e(chatHistoryResponse);
    }

    /* renamed from: y1 */
    private final void m63465y1() {
        String str;
        String str2;
        String str3;
        Session a = this.f52388f.mo46524a();
        C41204a aVar = this.f52392j;
        C18914a aVar2 = this.f52384b;
        ChatUser chatUser = this.f52408z;
        String str4 = null;
        if (chatUser == null) {
            C41536l.m120506z("user");
            chatUser = null;
        }
        String b = chatUser.mo33794b();
        if (a != null) {
            str = a.getUserId();
        } else {
            str = null;
        }
        C18582k kVar = this.f52391i;
        if (kVar != null) {
            str2 = kVar.mo46432a();
        } else {
            str2 = null;
        }
        C12449f fVar = this.f52389g;
        if (fVar != null) {
            str3 = fVar.mo33060a();
        } else {
            str3 = null;
        }
        C18582k kVar2 = this.f52391i;
        if (kVar2 != null) {
            str4 = kVar2.mo46433b();
        }
        aVar.mo95660b(aVar2.mo46916c(b, str, str2, "ANDROID", str3, str4).mo94890I(C40640a.m117458b()).mo94888G(new C18726j0(), new C18728k0()));
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m63467z0(C18742r0 r0Var, List list) {
        C41536l.m120489i(r0Var, "this$0");
        synchronized (r0Var.f52399q) {
            r0Var.f52399q.addAll(list);
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m63468z1() {
    }

    /* renamed from: a */
    public void mo42344a() {
        this.f52382A = true;
        m63363E0();
    }

    /* renamed from: b */
    public void mo42345b(String str, String str2, boolean z) {
        C12878g.C12879a aVar = C12878g.f38038m;
        if (str == null) {
            str = "";
        }
        C12878g b = aVar.mo33603b(str, m63359C0());
        m63399W0();
        if (z) {
            m63432n0();
        }
        m63418g0(b);
        m63415e1(b, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42346c(p341ge.bog.chat.data.ChatUser r6) {
        /*
            r5 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            ge.bog.chat.data.ChatUser r1 = r5.f52408z
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x001a
            if (r1 != 0) goto L_0x0012
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r1 = r3
        L_0x0012:
            boolean r0 = r6.mo33808p(r1)
            if (r0 == 0) goto L_0x001a
            r0 = r2
            goto L_0x001b
        L_0x001a:
            r0 = r4
        L_0x001b:
            boolean r1 = r5.m63367G0()
            if (r1 == 0) goto L_0x0023
            if (r0 != 0) goto L_0x006a
        L_0x0023:
            if (r0 != 0) goto L_0x002a
            p433gg.C15276a.C15277a.m55664a(r5, r4, r2, r3)
            r5.f52408z = r6
        L_0x002a:
            hd1.a r6 = r5.f52392j
            r6.mo95663e()
            r5.m63407a1()
            r5.m63385P0()
            r5.m63383O0()
            hd1.a r6 = r5.f52392j
            ee1.a r0 = r5.f52396n
            xf.m r1 = new xf.m
            r1.<init>()
            ed1.p r0 = r0.mo94990M(r1)
            xf.n r1 = new xf.n
            r1.<init>(r5)
            hd1.b r0 = r0.mo94981F0(r1)
            r6.mo95660b(r0)
            hd1.a r6 = r5.f52392j
            ed1.p r0 = r5.f52401s
            xf.o r1 = new xf.o
            r1.<init>()
            ed1.p r0 = r0.mo94990M(r1)
            xf.p r1 = new xf.p
            r1.<init>(r5)
            hd1.b r0 = r0.mo94981F0(r1)
            r6.mo95660b(r0)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p667xf.C18742r0.mo42346c(ge.bog.chat.data.ChatUser):void");
    }

    /* renamed from: d */
    public void mo42347d() {
        this.f52392j.mo95660b(C40734b.m117925u(new C18717f()).mo94885D(m63395U0().mo94895d(C40734b.m117925u(new C18719g(this))).mo94895d(this.f52397o.mo94990M(new C18721h()).mo94994O().mo94955p()).mo94895d(C40734b.m117925u(new C18723i(this)).mo94895d(this.f52396n.mo94990M(new C18725j()).mo94994O().mo94955p()))).mo94890I(C40640a.m117458b()).mo94887F(new C18727k()));
    }

    /* renamed from: e */
    public C40749p mo42348e() {
        C40749p pVar = this.f52401s;
        C41536l.m120488h(pVar, "typingSubject");
        return pVar;
    }

    /* renamed from: f */
    public C40749p mo42349f(String str) {
        String str2;
        C18914a aVar = this.f52384b;
        C12449f fVar = this.f52389g;
        if (fVar == null || (str2 = fVar.mo33060a()) == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        C40749p O = aVar.mo46915b(str2, str).mo95062A(new C18756z(this)).mo95075O();
        C41536l.m120488h(O, "restService.checkPolicyA…\n        }.toObservable()");
        return O;
    }

    /* renamed from: g */
    public C40749p mo42350g() {
        C40749p pVar = this.f52404v;
        C41536l.m120488h(pVar, "currParticipant");
        return pVar;
    }

    public C40749p getUnreadMessageCount() {
        C40749p y = this.f52407y.mo95043y();
        C41536l.m120488h(y, "unreadMessageCountSubject.distinctUntilChanged()");
        return y;
    }

    /* renamed from: h */
    public C40749p mo42352h() {
        return this.f52398p;
    }

    /* renamed from: i */
    public C40741h mo42353i() {
        C40741h n = this.f52394l.mo94933n(new C18755y(this));
        C41536l.m120488h(n, "messagesSubject.doOnSubs…bject.onNext(0)\n        }");
        return n;
    }

    /* renamed from: j */
    public C40749p mo42354j() {
        C40749p pVar = this.f52406x;
        C41536l.m120488h(pVar, "currConversationStatus");
        return pVar;
    }

    /* renamed from: k */
    public void mo42355k(C12870a.C12871a aVar) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C12870a.C12871a aVar2 = aVar;
        C41536l.m120489i(aVar2, "attachment");
        if (aVar.mo33557d().length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C12878g.C12879a aVar3 = C12878g.f38038m;
            ChatUser chatUser = this.f52408z;
            ChatUser chatUser2 = null;
            if (chatUser == null) {
                C41536l.m120506z("user");
                chatUser = null;
            }
            C12878g a = aVar3.mo33602a(aVar2, chatUser.mo33805k());
            C41939y.C41942c b = C41939y.C41942c.f98597c.mo97031b("file", URLEncoder.encode(aVar.mo33555b(), "utf-8"), C41872c0.f98276a.mo96717i(aVar.mo33557d(), C41937x.f98573e.mo97020b("multipart/form-data"), 0, aVar.mo33557d().length));
            Session a2 = this.f52388f.mo46524a();
            C41204a aVar4 = this.f52392j;
            C18914a aVar5 = this.f52384b;
            if (a2 != null) {
                str = a2.getAlias();
            } else {
                str = null;
            }
            if (a2 != null) {
                str2 = a2.getChatUserId();
            } else {
                str2 = null;
            }
            if (a2 != null) {
                str3 = a2.getSecureKey();
            } else {
                str3 = null;
            }
            if (a2 != null) {
                str4 = a2.getUserId();
            } else {
                str4 = null;
            }
            if (a2 != null) {
                str5 = a2.getChatId();
            } else {
                str5 = null;
            }
            ChatUser chatUser3 = this.f52408z;
            if (chatUser3 == null) {
                C41536l.m120506z("user");
            } else {
                chatUser2 = chatUser3;
            }
            aVar4.mo95660b(aVar5.mo46917d(str, str2, str3, str4, str5, chatUser2.mo33794b(), b).mo95072K(C40640a.m117458b()).mo95083l(new C18708a0(this, a)).mo95070I(new C18710b0(this, aVar2, a), new C18712c0()));
        }
    }

    /* renamed from: l */
    public C40749p mo42356l(boolean z) {
        C40749p pVar;
        Long l;
        String str;
        synchronized (this.f52399q) {
            if ((!m63369H0() || !(!this.f52399q.isEmpty())) && m63365F0()) {
                if (!z) {
                    this.f52399q.clear();
                }
                C12878g gVar = (C12878g) C41358y.m120020j0(this.f52399q);
                ChatUser chatUser = null;
                if (gVar != null) {
                    l = Long.valueOf(gVar.mo33596n());
                } else {
                    l = null;
                }
                C18914a aVar = this.f52384b;
                C12449f fVar = this.f52389g;
                if (fVar == null || (str = fVar.mo33060a()) == null) {
                    str = "";
                }
                ChatUser chatUser2 = this.f52408z;
                if (chatUser2 == null) {
                    C41536l.m120506z("user");
                } else {
                    chatUser = chatUser2;
                }
                pVar = aVar.mo46918e(l, 30, str, chatUser.mo33794b()).mo95087r(new C18746s()).mo95064C(new C18748t(this, l)).mo95062A(new C18750u(this)).mo95084m(new C18752v(this)).mo95075O();
            } else {
                pVar = C40749p.m118043h0(new ArrayList(this.f52399q));
            }
        }
        C41536l.m120488h(pVar, "synchronized(cachedMessa…)\n            }\n        }");
        C40749p Q = pVar.mo94998Q(new C18754x(this));
        C41536l.m120488h(Q, "obs.flatMap {\n          …)\n            }\n        }");
        return Q;
    }

    /* renamed from: m */
    public void mo42357m(boolean z, String str) {
        String str2;
        String str3;
        C18914a aVar = this.f52384b;
        C12449f fVar = this.f52389g;
        if (fVar == null || (str2 = fVar.mo33060a()) == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        if (z) {
            str3 = PensionStatusResult.STATUS_ACTIVE;
        } else {
            str3 = "R";
        }
        aVar.mo46914a(str2, str, str3).mo94888G(new C18720g0(), new C18724i0());
    }

    /* renamed from: n */
    public C40749p mo42358n() {
        return this.f52396n;
    }

    /* renamed from: o */
    public void mo42359o(boolean z) {
        if (z) {
            m63413d1();
        }
        this.f52405w.onNext(C12877f.CLOSED);
        C40765a aVar = this.f52395m;
        Boolean bool = Boolean.FALSE;
        aVar.onNext(bool);
        this.f52397o.onNext(bool);
        this.f52393k.onNext(f52379D);
        this.f52395m.onNext(bool);
        this.f52400r.onNext(f52378C);
        this.f52403u.onNext(f52380E);
        this.f52405w.onNext(f52381F);
        this.f52407y.onNext(0);
        synchronized (this.f52399q) {
            this.f52399q.clear();
            C41238w wVar = C41238w.f97225a;
        }
        this.f52388f.mo46526c();
        this.f52385c.mo26348b();
    }
}
