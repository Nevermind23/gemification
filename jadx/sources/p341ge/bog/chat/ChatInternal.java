package p341ge.bog.chat;

import android.content.Context;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1619q;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40774e;
import gd1.C40992a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.chat.presentation.activity.ConversationActivity;
import p405eg.C12442b0;
import p405eg.C12448e0;
import p405eg.C12452h;
import p405eg.C12455k;
import p405eg.C12456l;
import p405eg.C12463s;
import p419fg.C12875d;
import p461ig.C15640i;
import p653wf.C18569a;
import p653wf.C18575e;
import p653wf.C18576f;
import p653wf.C18577g;

/* renamed from: ge.bog.chat.ChatInternal */
public final class ChatInternal implements C18569a {

    /* renamed from: a */
    private final C12455k f38302a;

    /* renamed from: b */
    private final C12448e0 f38303b;

    /* renamed from: c */
    private final C12463s f38304c;

    /* renamed from: d */
    private final C12452h f38305d;

    /* renamed from: e */
    private final C12456l f38306e;

    /* renamed from: f */
    private final C12442b0 f38307f;

    public ChatInternal(C12455k kVar, C12448e0 e0Var, C12463s sVar, C12452h hVar, C12456l lVar, C12442b0 b0Var) {
        C41536l.m120489i(kVar, "endChatUseCase");
        C41536l.m120489i(e0Var, "unreadMessageCountUseCase");
        C41536l.m120489i(sVar, "isChatActiveUseCase");
        C41536l.m120489i(hVar, "checkPolicyAgreedUseCase");
        C41536l.m120489i(lVar, "getChatEndObservableUseCase");
        C41536l.m120489i(b0Var, "setInAppNotificationUseCase");
        this.f38302a = kVar;
        this.f38303b = e0Var;
        this.f38304c = sVar;
        this.f38305d = hVar;
        this.f38306e = lVar;
        this.f38307f = b0Var;
    }

    /* renamed from: j */
    private final C40762x m49018j(FragmentManager fragmentManager, Context context, boolean z, boolean z2, boolean z3, ChatUser chatUser, C1619q qVar) {
        C40774e X = C40774e.m118229X();
        if (!z3) {
            X.mo95096a(Boolean.TRUE);
            ConversationActivity.f38329y.mo34209a(context, z, chatUser);
        } else if (z2) {
            qVar.getLifecycle().mo4906a(new ChatInternal$getOpenChatObservable$1$1(this.f38305d.mo33063a(chatUser.mo33794b()).mo95027o0(C40992a.m118827a()).mo94983G0(new C18575e(X, context, z, chatUser, this, fragmentManager), new C18576f(X))));
        } else {
            C41536l.m120488h(X, "subject");
            m49021m(X, fragmentManager, false, z, chatUser);
        }
        C40762x x = X.mo95091x();
        C41536l.m120488h(x, "create<Boolean>().also {…       }\n        }.hide()");
        return x;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m49019k(C40774e eVar, Context context, boolean z, ChatUser chatUser, ChatInternal chatInternal, FragmentManager fragmentManager, C12875d dVar) {
        C41536l.m120489i(eVar, "$subject");
        C41536l.m120489i(context, "$context");
        C41536l.m120489i(chatUser, "$user");
        C41536l.m120489i(chatInternal, "this$0");
        C41536l.m120489i(fragmentManager, "$fragmentManager");
        if (dVar.mo33573a()) {
            eVar.mo95096a(Boolean.TRUE);
            ConversationActivity.f38329y.mo34209a(context, z, chatUser);
            return;
        }
        chatInternal.m49021m(eVar, fragmentManager, true, z, chatUser);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m49020l(C40774e eVar, Throwable th) {
        C41536l.m120489i(eVar, "$subject");
        eVar.onError(th);
    }

    /* renamed from: m */
    private final void m49021m(C40774e eVar, FragmentManager fragmentManager, boolean z, boolean z2, ChatUser chatUser) {
        C15640i.f44449J.mo42952a(z2, z, chatUser, new C18577g(eVar)).mo4576A1(fragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m49022n(C40774e eVar, boolean z) {
        C41536l.m120489i(eVar, "$subject");
        eVar.mo95096a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo33787a() {
        this.f38307f.mo33053a();
    }

    /* renamed from: b */
    public void mo33788b() {
        this.f38302a.mo33066a();
    }

    /* renamed from: c */
    public C40762x mo33789c(C1505h hVar, ChatUser chatUser, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(hVar, "activity");
        C41536l.m120489i(chatUser, "user");
        FragmentManager supportFragmentManager = hVar.getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "activity.supportFragmentManager");
        return m49018j(supportFragmentManager, hVar, z, z2, z3, chatUser, hVar);
    }

    /* renamed from: d */
    public C40749p mo33790d() {
        return this.f38304c.mo33074a();
    }

    /* renamed from: e */
    public C40749p mo33791e() {
        return this.f38306e.mo33067a();
    }

    /* renamed from: f */
    public C40749p mo33792f() {
        return this.f38303b.mo33059a();
    }
}
