package p341ge.bog.chat.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import com.google.android.material.datepicker.C5023l;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p017b.C2106d;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.chat.domain.model.components.Component;
import p341ge.bog.chat.domain.model.components.PreContractComponent;
import p341ge.bog.chat.presentation.actionsheet.AccountSelectorComponentData;
import p341ge.bog.chat.presentation.activity.C13018f0;
import p341ge.bog.chat.presentation.activity.C13060q0;
import p341ge.bog.chat.presentation.activity.faq.ChatFAQActivity;
import p341ge.bog.chat.presentation.activity.precontract.PreContractActivity;
import p341ge.bog.chat.presentation.holders.ComponentUi;
import p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder;
import p341ge.bog.chat.presentation.holders.CustomOutgoingMessageViewHolder;
import p341ge.bog.chat.presentation.holders.ParticipantJoinedChatEndedMessageViewHolder;
import p341ge.bog.chat.presentation.view.MessageInputLayout;
import p341ge.bog.chatkit.messages.MessageHolders;
import p341ge.bog.chatkit.messages.MessagesList;
import p341ge.bog.chatkit.messages.MessagesListAdapter;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p376cg.C10425d;
import p419fg.C12870a;
import p419fg.C12886k;
import p419fg.C12887l;
import p420fh.C12902d;
import p434gh.C15278a;
import p447hg.C15497a;
import p447hg.C15498b;
import p447hg.C15499c;
import p447hg.C15502e;
import p461ig.C15628a;
import p461ig.C15631d;
import p531ng.C16931k;
import p653wf.C18570b;
import p653wf.C18574d;
import p653wf.C18587p;
import p653wf.C18588q;
import p653wf.C18589r;
import p653wf.C18590s;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.chat.presentation.activity.ConversationActivity */
public final class ConversationActivity extends C13009b implements C15628a {

    /* renamed from: y */
    public static final C12992a f38329y = new C12992a((DefaultConstructorMarker) null);

    /* renamed from: z */
    private static final Set f38330z;

    /* renamed from: o */
    private final C41217g f38331o = C41219i.m119470b(new C12997f(this));

    /* renamed from: p */
    public C15497a f38332p;

    /* renamed from: q */
    private C41204a f38333q;

    /* renamed from: r */
    public C1620q0.C1624b f38334r;

    /* renamed from: s */
    private final C41217g f38335s = new C1617p0(C41520a0.m120436b(C16931k.class), new C13002k(this), new C12998g(this));
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C13039l0 f38336t;

    /* renamed from: u */
    private C13015e f38337u = new C13015e((Long) null, (Long) null, 3, (DefaultConstructorMarker) null);

    /* renamed from: v */
    private final C41217g f38338v = C41219i.m119470b(new C13001j(this));

    /* renamed from: w */
    private final C41217g f38339w = C41219i.m119470b(new C13003l(this));

    /* renamed from: x */
    private C0173b f38340x;

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$a */
    public static final class C12992a {
        private C12992a() {
        }

        public /* synthetic */ C12992a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo34209a(Context context, boolean z, ChatUser chatUser) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(chatUser, "user");
            Intent intent = new Intent(context, ConversationActivity.class);
            intent.putExtra("IS_SOLO", z);
            intent.putExtra("CHAT_USER", chatUser);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$b */
    public /* synthetic */ class C12993b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38341a;

        static {
            int[] iArr = new int[C13032i0.values().length];
            iArr[C13032i0.TEXT.ordinal()] = 1;
            iArr[C13032i0.FILE_ATTACHMENT.ordinal()] = 2;
            f38341a = iArr;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$c */
    public static final class C12994c implements MessageInputLayout.C13090c {

        /* renamed from: a */
        final /* synthetic */ ConversationActivity f38342a;

        C12994c(ConversationActivity conversationActivity) {
            this.f38342a = conversationActivity;
        }

        /* renamed from: a */
        public boolean mo34210a(CharSequence charSequence) {
            this.f38342a.m49108u1();
            C16931k.m59520Kw(this.f38342a.m49061E1(), String.valueOf(charSequence), (String) null, false, 6, (Object) null);
            return true;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$d */
    public static final class C12995d implements MessageInputLayout.C13093e {

        /* renamed from: a */
        final /* synthetic */ ConversationActivity f38343a;

        C12995d(ConversationActivity conversationActivity) {
            this.f38343a = conversationActivity;
        }

        /* renamed from: a */
        public void mo34211a() {
            C13039l0 m1 = this.f38343a.f38336t;
            if (m1 == null) {
                C41536l.m120506z("adapter");
                m1 = null;
            }
            m1.mo34314n();
        }

        /* renamed from: b */
        public void mo34212b() {
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$e */
    public static final class C12996e implements MessageInputLayout.C13089b {

        /* renamed from: a */
        final /* synthetic */ ConversationActivity f38344a;

        C12996e(ConversationActivity conversationActivity) {
            this.f38344a = conversationActivity;
        }

        /* renamed from: a */
        public void mo34213a() {
            this.f38344a.m49061E1().mo44099Iw("chat", "", "attach_file_click");
            this.f38344a.startActivityForResult(C15502e.f44008a.mo42603a(), 10098);
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$f */
    static final class C12997f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConversationActivity f38345d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12997f(ConversationActivity conversationActivity) {
            super(0);
            this.f38345d = conversationActivity;
        }

        /* renamed from: b */
        public final C10425d invoke() {
            C10425d d = C10425d.m37867d(this.f38345d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$g */
    static final class C12998g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConversationActivity f38346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12998g(ConversationActivity conversationActivity) {
            super(0);
            this.f38346d = conversationActivity;
        }

        public final C1620q0.C1624b invoke() {
            return this.f38346d.mo34207H1();
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$h */
    static final class C12999h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12999h f38347d = new C12999h();

        C12999h() {
            super(1);
        }

        /* renamed from: a */
        public final void mo34215a(C13034j0 j0Var) {
            if (j0Var != null) {
                j0Var.mo34303r((Component) null);
            }
            if (j0Var != null) {
                j0Var.mo34302q((List) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34215a((C13034j0) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$i */
    static final class C13000i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C13000i f38348d = new C13000i();

        C13000i() {
            super(1);
        }

        /* renamed from: a */
        public final void mo34216a(C13034j0 j0Var) {
            if (j0Var != null) {
                j0Var.mo34304s(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34216a((C13034j0) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$j */
    static final class C13001j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConversationActivity f38349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13001j(ConversationActivity conversationActivity) {
            super(0);
            this.f38349d = conversationActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f38349d.getIntent().getBooleanExtra("IS_SOLO", false));
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$k */
    public static final class C13002k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f38350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13002k(ComponentActivity componentActivity) {
            super(0);
            this.f38350d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f38350d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.ConversationActivity$l */
    static final class C13003l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConversationActivity f38351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13003l(ConversationActivity conversationActivity) {
            super(0);
            this.f38351d = conversationActivity;
        }

        /* renamed from: b */
        public final ChatUser invoke() {
            Intent intent = this.f38351d.getIntent();
            if (intent != null) {
                return (ChatUser) intent.getParcelableExtra("CHAT_USER");
            }
            return null;
        }
    }

    static {
        List<String> e = C41339p.m119900e("საქართველოს ბანკი");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(e, 10));
        for (String lowerCase : e) {
            String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
            C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList.add(lowerCase2);
        }
        f38330z = C41358y.m119993D0(arrayList);
    }

    public ConversationActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C13065t(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…  }, 100)\n        }\n    }");
        this.f38340x = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final boolean m49057A1(C13034j0 j0Var, byte b) {
        C41536l.m120489i(j0Var, "msg");
        if (b == 7 && (j0Var.mo34300o() == C13032i0.PARTICIPANT_JOINED || j0Var.mo34300o() == C13032i0.CHAT_ENDED)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final String m49058B1(ConversationActivity conversationActivity, String str, String str2) {
        C41536l.m120489i(conversationActivity, "this$0");
        C41536l.m120489i(str, "key");
        C41536l.m120489i(str2, "defValue");
        return conversationActivity.m49061E1().mo44095Dw(str, str2);
    }

    /* renamed from: C1 */
    private final void m49059C1(C13034j0 j0Var) {
        if (j0Var.mo34300o() != C13032i0.FILE_ATTACHMENT && j0Var.mo34292h() == null) {
            return;
        }
        if (j0Var.mo34290f() instanceof C12870a.C12872b) {
            String d = ((C12870a.C12872b) j0Var.mo34290f()).mo33558d();
            if (d != null) {
                mo34206F1().mo42596a(d, this, j0Var.mo34290f().mo33555b(), j0Var.mo34290f().mo33554a());
            }
        } else if (!(j0Var.mo34290f() instanceof C12870a.C12871a) && j0Var.mo34292h() != null) {
            mo34206F1().mo42596a(j0Var.mo34292h().mo34244d(), this, j0Var.mo34292h().mo34242b(), j0Var.mo34292h().mo34241a());
        }
    }

    /* renamed from: D1 */
    private final C10425d m49060D1() {
        return (C10425d) this.f38331o.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final C16931k m49061E1() {
        return (C16931k) this.f38335s.getValue();
    }

    /* renamed from: G1 */
    private final ChatUser m49062G1() {
        return (ChatUser) this.f38339w.getValue();
    }

    /* renamed from: I1 */
    private final void m49063I1(C13018f0 f0Var) {
        C13039l0 l0Var = null;
        if (f0Var instanceof C13018f0.C13021c) {
            C13018f0.C13021c cVar = (C13018f0.C13021c) f0Var;
            if (cVar.mo34269a().mo34291g().mo34236c() != C12887l.CLIENT) {
                C13039l0 l0Var2 = this.f38336t;
                if (l0Var2 == null) {
                    C41536l.m120506z("adapter");
                    l0Var2 = null;
                }
                l0Var2.mo34312l(C13000i.f38348d);
            }
            Component j = cVar.mo34269a().mo34295j();
            if (j != null && (j instanceof PreContractComponent)) {
                this.f38340x.mo404a(PreContractActivity.f38456q.mo34335a(this, ComponentUi.PreContractComponentUi.f38474h.mo34378a((PreContractComponent) j)));
            }
            C13039l0 l0Var3 = this.f38336t;
            if (l0Var3 == null) {
                C41536l.m120506z("adapter");
            } else {
                l0Var = l0Var3;
            }
            l0Var.mo34309i(cVar.mo34269a());
        } else if (f0Var instanceof C13018f0.C13022d) {
            C13039l0 l0Var4 = this.f38336t;
            if (l0Var4 == null) {
                C41536l.m120506z("adapter");
            } else {
                l0Var = l0Var4;
            }
            l0Var.update(((C13018f0.C13022d) f0Var).mo34273a());
        } else if (f0Var instanceof C13018f0.C13019a) {
            C13039l0 l0Var5 = this.f38336t;
            if (l0Var5 == null) {
                C41536l.m120506z("adapter");
            } else {
                l0Var = l0Var5;
            }
            l0Var.delete(((C13018f0.C13019a) f0Var).mo34261a());
        } else if (f0Var instanceof C13018f0.C13020b) {
            C13039l0 l0Var6 = this.f38336t;
            if (l0Var6 == null) {
                C41536l.m120506z("adapter");
            } else {
                l0Var = l0Var6;
            }
            l0Var.deleteById(((C13018f0.C13020b) f0Var).mo34265a());
        }
    }

    /* renamed from: J1 */
    private final boolean m49064J1() {
        return ((Boolean) this.f38338v.getValue()).booleanValue();
    }

    /* renamed from: K1 */
    private final void m49065K1(boolean z) {
        C41205b G0 = m49061E1().mo44097Fw(z).mo94983G0(new C13042m(this), new C13044n());
        C41536l.m120488h(G0, "chatViewModel.loadHistor…\n        }, {\n\n        })");
        m49102o1(G0);
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m49066L1(ConversationActivity conversationActivity, List list) {
        C41536l.m120489i(conversationActivity, "this$0");
        C13039l0 l0Var = conversationActivity.f38336t;
        if (l0Var == null) {
            C41536l.m120506z("adapter");
            l0Var = null;
        }
        l0Var.addToEnd(list, false);
        conversationActivity.m49082V1();
        if (list.size() < 30) {
            C13039l0 l0Var2 = conversationActivity.f38336t;
            if (l0Var2 == null) {
                C41536l.m120506z("adapter");
                l0Var2 = null;
            }
            l0Var2.setLoadMoreListener((MessagesListAdapter.C13110d) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m49067M1(Throwable th) {
    }

    /* renamed from: N1 */
    private final void m49068N1() {
        C16931k E1 = m49061E1();
        E1.mo44092Aw().mo4819k(this, new C13071z());
        C41205b F0 = E1.mo44094Cw().mo94981F0(new C13028h(this));
        C41536l.m120488h(F0, "messageSubject.subscribe…isibility()\n            }");
        m49102o1(F0);
        E1.mo44104zw().mo4819k(this, new C13031i(this));
        E1.mo44096Ew().mo4819k(this, new C13033j(this));
        E1.mo44093Bw().mo4819k(this, new C13036k(this));
        E1.mo44103yw().mo4819k(this, new C13038l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m49069O1(C41238w wVar) {
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m49070P1(ConversationActivity conversationActivity, C13018f0 f0Var) {
        C41536l.m120489i(conversationActivity, "this$0");
        C41536l.m120488h(f0Var, "it");
        conversationActivity.m49063I1(f0Var);
        conversationActivity.m49082V1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m49072Q1(ConversationActivity conversationActivity, C13018f0 f0Var) {
        C41536l.m120489i(conversationActivity, "this$0");
        C41536l.m120488h(f0Var, "it");
        conversationActivity.m49063I1(f0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m49074R1(ConversationActivity conversationActivity, C13060q0 q0Var) {
        C41536l.m120489i(conversationActivity, "this$0");
        C13039l0 l0Var = null;
        if (q0Var instanceof C13060q0.C13061a) {
            C13039l0 l0Var2 = conversationActivity.f38336t;
            if (l0Var2 == null) {
                C41536l.m120506z("adapter");
            } else {
                l0Var = l0Var2;
            }
            l0Var.mo34311k(((C13060q0.C13061a) q0Var).mo34339a());
        } else if (C41536l.m120484d(q0Var, C13060q0.C13062b.f38462a)) {
            C13039l0 l0Var3 = conversationActivity.f38336t;
            if (l0Var3 == null) {
                C41536l.m120506z("adapter");
            } else {
                l0Var = l0Var3;
            }
            l0Var.mo34316p();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m49076S1(ConversationActivity conversationActivity, C15498b bVar) {
        C41536l.m120489i(conversationActivity, "this$0");
        if (((C41238w) bVar.mo42597a()) != null) {
            C12902d e = C12902d.C12903a.m48771e(C12902d.f38098b, conversationActivity, false, 2, (Object) null);
            C16931k E1 = conversationActivity.m49061E1();
            String string = conversationActivity.getString(C18590s.chatbot_file_max_size_error);
            C41536l.m120488h(string, "getString(\n             …                        )");
            e.mo33652k(E1.mo44095Dw("rbc.chat.max.filesize.error", string), C15278a.INFO, C12902d.C12905b.C12907b.f38104a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m49078T1(ConversationActivity conversationActivity, ActivityResult activityResult) {
        String str;
        C41536l.m120489i(conversationActivity, "this$0");
        if (activityResult.mo371b() == -1) {
            Intent a = activityResult.mo370a();
            String str2 = null;
            if (a != null) {
                str = a.getStringExtra("PRE_CONTRACT_AGREED_PAYLOAD");
            } else {
                str = null;
            }
            Intent a2 = activityResult.mo370a();
            if (a2 != null) {
                str2 = a2.getStringExtra("PRE_CONTRACT_AGREED_TITLE");
            }
            new Handler(conversationActivity.getMainLooper()).postDelayed(new C13051o(conversationActivity, str2, str), 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m49080U1(ConversationActivity conversationActivity, String str, String str2) {
        C41536l.m120489i(conversationActivity, "this$0");
        conversationActivity.m49108u1();
        C16931k.m59520Kw(conversationActivity.m49061E1(), str, str2, false, 4, (Object) null);
    }

    /* renamed from: V1 */
    private final void m49082V1() {
        boolean z;
        ConstraintLayout c = m49060D1().f29644g.mo3946b();
        C41536l.m120488h(c, "binding.noHistory.root");
        C13039l0 l0Var = this.f38336t;
        if (l0Var == null) {
            C41536l.m120506z("adapter");
            l0Var = null;
        }
        int i = 0;
        if (l0Var.getMessagesCount() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        c.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public final void m49084W1(C12886k kVar) {
        int i;
        int i2;
        int i3 = 8;
        if (kVar.mo33617b() == C12887l.BOT) {
            AppCompatTextView appCompatTextView = m49060D1().f29645h.f29720i;
            if (m49064J1()) {
                i2 = C18590s.common_text_solo;
            } else {
                i2 = C18590s.common_text_bank_of_georgia;
            }
            appCompatTextView.setText(getString(i2));
            AppCompatTextView appCompatTextView2 = m49060D1().f29645h.f29719h;
            C41536l.m120488h(appCompatTextView2, "binding.toolbar.operatorTextView");
            appCompatTextView2.setVisibility(8);
            TextBadgeView textBadgeView = m49060D1().f29645h.f29717f;
            C41536l.m120488h(textBadgeView, "binding.toolbar.digitalAssistantBadge");
            textBadgeView.setVisibility(8);
            return;
        }
        Set set = f38330z;
        String lowerCase = String.valueOf(kVar.mo33616a()).toLowerCase(Locale.ROOT);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        boolean contains = set.contains(lowerCase);
        m49060D1().f29645h.f29720i.setText(kVar.mo33616a());
        AppCompatTextView appCompatTextView3 = m49060D1().f29645h.f29719h;
        C41536l.m120488h(appCompatTextView3, "binding.toolbar.operatorTextView");
        if (!contains) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatTextView3.setVisibility(i);
        TextBadgeView textBadgeView2 = m49060D1().f29645h.f29717f;
        C41536l.m120488h(textBadgeView2, "binding.toolbar.digitalAssistantBadge");
        if (contains) {
            i3 = 0;
        }
        textBadgeView2.setVisibility(i3);
    }

    /* renamed from: X1 */
    private final void m49086X1() {
        if (m49064J1()) {
            m49060D1().f29645h.f29716e.setImageResource(C18587p.ic_chat_toolbar_icon_online_solo);
            m49060D1().f29644g.f29695e.setImageResource(C18587p.ic_big_bog_solo);
            m49060D1().f29645h.f29720i.setText(getString(C18590s.common_text_solo));
        } else {
            m49060D1().f29645h.f29716e.setImageResource(C18587p.ic_chat_toolbar_icon_online);
            m49060D1().f29644g.f29695e.setImageResource(C18587p.ic_big_bog);
            m49060D1().f29645h.f29720i.setText(getString(C18590s.common_text_bank_of_georgia));
        }
        TextBadgeView textBadgeView = m49060D1().f29645h.f29717f;
        C16931k E1 = m49061E1();
        String string = getString(C18590s.chat_text_digital_assistant);
        C41536l.m120488h(string, "getString(R.string.chat_text_digital_assistant)");
        textBadgeView.setBadgeText(E1.mo44095Dw("text.chat.digital.assistant", string));
    }

    /* renamed from: o1 */
    private final void m49102o1(C41205b bVar) {
        if (this.f38333q == null) {
            this.f38333q = new C41204a();
        }
        C41204a aVar = this.f38333q;
        if (aVar != null) {
            aVar.mo95660b(bVar);
        }
    }

    /* renamed from: p1 */
    private final void m49103p1() {
        m49060D1().f29642e.setInputListener(new C12994c(this));
        m49060D1().f29642e.setTypingListener(new C12995d(this));
        m49060D1().f29642e.setAttachmentsListener(new C12996e(this));
        C13039l0 l0Var = this.f38336t;
        C13039l0 l0Var2 = null;
        if (l0Var == null) {
            C41536l.m120506z("adapter");
            l0Var = null;
        }
        l0Var.setLoadMoreListener(new C13026g(this));
        C13039l0 l0Var3 = this.f38336t;
        if (l0Var3 == null) {
            C41536l.m120506z("adapter");
        } else {
            l0Var2 = l0Var3;
        }
        l0Var2.mo34317q(new C13063r(this));
        m49060D1().f29645h.f29718g.setOnClickListener(new C13064s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m49104q1(ConversationActivity conversationActivity, int i, int i2) {
        C41536l.m120489i(conversationActivity, "this$0");
        conversationActivity.m49065K1(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m49105r1(ConversationActivity conversationActivity, ComponentUi componentUi) {
        C41536l.m120489i(conversationActivity, "this$0");
        C41536l.m120489i(componentUi, "component");
        if (componentUi instanceof ComponentUi.C13076a) {
            C15631d.f44435E.mo42939a(((ComponentUi.C13076a) componentUi).mo34383a()).mo4576A1(conversationActivity.getSupportFragmentManager(), (String) null);
        } else if (componentUi instanceof ComponentUi.C13078c) {
            ComponentUi.C13078c cVar = (ComponentUi.C13078c) componentUi;
            if (!cVar.mo34396d() || C41536l.m120484d(cVar.mo34395b(), "👎")) {
                conversationActivity.m49108u1();
            }
            conversationActivity.m49061E1().mo44100Jw(cVar.mo34395b(), cVar.mo34394a(), !cVar.mo34396d());
        } else if (componentUi instanceof ComponentUi.PreContractComponentUi) {
            conversationActivity.f38340x.mo404a(PreContractActivity.f38456q.mo34335a(conversationActivity, (ComponentUi.PreContractComponentUi) componentUi));
        } else if (componentUi instanceof ComponentUi.C13077b) {
            C5023l a = C5023l.C5029f.m19565c().mo16275a();
            C41536l.m120488h(a, "datePicker()\n                            .build()");
            a.mo16267J1(new C13053p(conversationActivity, componentUi));
            a.mo4576A1(conversationActivity.getSupportFragmentManager(), (String) null);
        } else if (componentUi instanceof ComponentUi.C13079d) {
            conversationActivity.m49108u1();
            C16931k.m59520Kw(conversationActivity.m49061E1(), ((ComponentUi.C13079d) componentUi).mo34400a(), (String) null, false, 6, (Object) null);
        } else if (componentUi instanceof ComponentUi.FAQComponentUi) {
            ChatFAQActivity.f38383q.mo34277a(conversationActivity, (ComponentUi.FAQComponentUi) componentUi);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m49106s1(ConversationActivity conversationActivity, ComponentUi componentUi, Long l) {
        C13015e eVar;
        C41536l.m120489i(conversationActivity, "this$0");
        C41536l.m120489i(componentUi, "$component");
        ComponentUi.C13077b bVar = (ComponentUi.C13077b) componentUi;
        if (bVar.mo34390e()) {
            eVar = C13015e.m49157b(conversationActivity.f38337u, l, (Long) null, 2, (Object) null);
        } else {
            eVar = C13015e.m49157b(conversationActivity.f38337u, (Long) null, l, 1, (Object) null);
        }
        conversationActivity.f38337u = eVar;
        C43075l b = bVar.mo34388b();
        C41536l.m120488h(l, "it");
        b.invoke(l);
        if (conversationActivity.f38337u.mo34252e()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(bVar.mo34387a());
            conversationActivity.m49108u1();
            C16931k E1 = conversationActivity.m49061E1();
            String d = bVar.mo34389d();
            Long d2 = conversationActivity.f38337u.mo34251d();
            C41536l.m120486f(d2);
            Long c = conversationActivity.f38337u.mo34250c();
            C41536l.m120486f(c);
            String format = String.format(d, Arrays.copyOf(new Object[]{simpleDateFormat.format(new Date(d2.longValue())), simpleDateFormat.format(new Date(c.longValue()))}, 2));
            C41536l.m120488h(format, "format(this, *args)");
            C16931k.m59520Kw(E1, format, (String) null, false, 6, (Object) null);
            conversationActivity.f38337u = new C13015e((Long) null, (Long) null, 3, (DefaultConstructorMarker) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m49107t1(ConversationActivity conversationActivity, View view) {
        C41536l.m120489i(conversationActivity, "this$0");
        conversationActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m49108u1() {
        C13039l0 l0Var = this.f38336t;
        if (l0Var == null) {
            C41536l.m120506z("adapter");
            l0Var = null;
        }
        l0Var.mo34312l(C12999h.f38347d);
    }

    /* renamed from: v1 */
    private final void m49109v1() {
        int i = C18589r.chat_item_participan_joined_chat_ended;
        MessageHolders dateHeaderLayout = new MessageHolders().setIncomingTextConfig(CustomIncomingMessageViewHolder.class, C18589r.chat_item_incoming_text_message).setOutcomingTextConfig(CustomOutgoingMessageViewHolder.class, C18589r.chat_item_outgoing_text_message).registerContentType((byte) 7, ParticipantJoinedChatEndedMessageViewHolder.class, i, i, new C13066u()).setDateHeaderLayout(C18589r.chat_date_header_item);
        C41536l.m120488h(dateHeaderLayout, "holdersConfig");
        C13039l0 l0Var = new C13039l0(dateHeaderLayout, new C13045n0(this, m49064J1()));
        this.f38336t = l0Var;
        l0Var.mo34318r(new C13067v(this));
        C13039l0 l0Var2 = this.f38336t;
        C13039l0 l0Var3 = null;
        if (l0Var2 == null) {
            C41536l.m120506z("adapter");
            l0Var2 = null;
        }
        l0Var2.enableSelectionMode(new C13068w(this));
        C13039l0 l0Var4 = this.f38336t;
        if (l0Var4 == null) {
            C41536l.m120506z("adapter");
            l0Var4 = null;
        }
        l0Var4.setDateHeadersFormatter(new C13069x());
        C13039l0 l0Var5 = this.f38336t;
        if (l0Var5 == null) {
            C41536l.m120506z("adapter");
        } else {
            l0Var3 = l0Var5;
        }
        l0Var3.registerViewClickListener(C18588q.f52162i, new C13070y(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m49110w1(ConversationActivity conversationActivity, int i) {
        C41536l.m120489i(conversationActivity, "this$0");
        if (i == 1) {
            C13039l0 l0Var = conversationActivity.f38336t;
            if (l0Var == null) {
                C41536l.m120506z("adapter");
                l0Var = null;
            }
            l0Var.copySelectedMessagesText(conversationActivity, new C13059q(), false);
            C12902d e = C12902d.C12903a.m48771e(C12902d.f38098b, conversationActivity, false, 2, (Object) null);
            String string = conversationActivity.getString(C18590s.message_copied);
            C41536l.m120488h(string, "getString(R.string.message_copied)");
            e.mo33652k(string, C15278a.POSITIVE, C12902d.C12905b.C12907b.f38104a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final String m49111x1(C13034j0 j0Var) {
        C12870a f;
        int i = C12993b.f38341a[j0Var.mo34300o().ordinal()];
        if (i == 1) {
            return j0Var.mo34301p();
        }
        if (i == 2 && (f = j0Var.mo34290f()) != null) {
            return f.mo33555b();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final String m49112y1(Date date) {
        C41536l.m120488h(date, "it");
        return C15499c.m56058a(date);
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m49113z1(ConversationActivity conversationActivity, View view, C13034j0 j0Var) {
        C41536l.m120489i(conversationActivity, "this$0");
        C41536l.m120488h(j0Var, "message");
        conversationActivity.m49059C1(j0Var);
    }

    /* renamed from: F1 */
    public final C15497a mo34206F1() {
        C15497a aVar = this.f38332p;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("downloadManager");
        return null;
    }

    /* renamed from: H1 */
    public final C1620q0.C1624b mo34207H1() {
        C1620q0.C1624b bVar = this.f38334r;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelFactory");
        return null;
    }

    /* renamed from: W */
    public void mo34208W(AccountSelectorComponentData accountSelectorComponentData) {
        C41536l.m120489i(accountSelectorComponentData, "data");
        m49108u1();
        C16931k.m59520Kw(m49061E1(), accountSelectorComponentData.mo34195h(), (String) null, false, 6, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        if (i == 10098 && i2 == -1 && intent != null && (data = intent.getData()) != null) {
            m49061E1().mo44101sw(this, data);
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C18570b b = C18574d.f52090a.mo46429b();
        if (b != null) {
            b.mo46404b(this);
        }
        setContentView((View) m49060D1().mo3946b());
        m49086X1();
        m49109v1();
        m49060D1().f29643f.mo5351j(new C13029h0(this));
        MessagesList messagesList = m49060D1().f29643f;
        C13039l0 l0Var = this.f38336t;
        if (l0Var == null) {
            C41536l.m120506z("adapter");
            l0Var = null;
        }
        messagesList.setAdapter(l0Var);
        m49103p1();
        m49068N1();
        ChatUser G1 = m49062G1();
        if (G1 != null) {
            m49061E1().mo44102xw(G1);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C41204a aVar = this.f38333q;
        if (aVar != null) {
            aVar.dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13039l0 l0Var = this.f38336t;
        if (l0Var == null) {
            C41536l.m120506z("adapter");
            l0Var = null;
        }
        l0Var.clear();
        m49065K1(false);
    }
}
