package p461ig;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import he1.C41217g;
import java.io.Serializable;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.chat.presentation.activity.ConversationActivity;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p349ah.C9860d;
import p376cg.C10423b;
import p531ng.C16931k;
import p653wf.C18570b;
import p653wf.C18574d;
import p653wf.C18590s;
import ue1.C43064a;

/* renamed from: ig.i */
public final class C15640i extends C9860d {

    /* renamed from: J */
    public static final C15642b f44449J = new C15642b((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C10423b f44450B;

    /* renamed from: C */
    public C1620q0.C1624b f44451C;

    /* renamed from: D */
    private final C41217g f44452D = C1514j0.m5373b(this, C41520a0.m120436b(C16931k.class), new C15647g(new C15646f(this)), new C15649i(this));

    /* renamed from: E */
    private final C41217g f44453E = C41219i.m119470b(new C15644d(this));

    /* renamed from: F */
    private final C41217g f44454F = C41219i.m119470b(new C15645e(this));

    /* renamed from: G */
    private final C41217g f44455G = C41219i.m119470b(new C15643c(this));

    /* renamed from: H */
    private final C41217g f44456H = C41219i.m119470b(new C15648h(this));

    /* renamed from: I */
    private boolean f44457I;

    /* renamed from: ig.i$a */
    public interface C15641a extends Serializable {
        /* renamed from: j */
        void mo42951j(boolean z);
    }

    /* renamed from: ig.i$b */
    public static final class C15642b {
        private C15642b() {
        }

        public /* synthetic */ C15642b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15640i mo42952a(boolean z, boolean z2, ChatUser chatUser, C15641a aVar) {
            C41536l.m120489i(chatUser, "user");
            C41536l.m120489i(aVar, "agreedListener");
            C15640i iVar = new C15640i();
            Bundle bundle = new Bundle();
            bundle.putBoolean("CLIENT_IS_AUTHORIZED", z);
            bundle.putBoolean("CLIENT_IS_SOLO", z2);
            bundle.putParcelable("CHAT_USER", chatUser);
            bundle.putSerializable("AGREED_LISTENER", aVar);
            iVar.setArguments(bundle);
            return iVar;
        }
    }

    /* renamed from: ig.i$c */
    static final class C15643c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15640i f44458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15643c(C15640i iVar) {
            super(0);
            this.f44458d = iVar;
        }

        /* renamed from: b */
        public final C15641a invoke() {
            Bundle arguments = this.f44458d.getArguments();
            Serializable serializable = arguments != null ? arguments.getSerializable("AGREED_LISTENER") : null;
            if (serializable != null) {
                return (C15641a) serializable;
            }
            throw new NullPointerException("null cannot be cast to non-null type ge.bog.chat.presentation.actionsheet.ChatPrivacyPolicyActionSheet.AgreedListener");
        }
    }

    /* renamed from: ig.i$d */
    static final class C15644d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15640i f44459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15644d(C15640i iVar) {
            super(0);
            this.f44459d = iVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f44459d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("CLIENT_IS_AUTHORIZED") : false);
        }
    }

    /* renamed from: ig.i$e */
    static final class C15645e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15640i f44460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15645e(C15640i iVar) {
            super(0);
            this.f44460d = iVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f44460d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("CLIENT_IS_SOLO") : false);
        }
    }

    /* renamed from: ig.i$f */
    public static final class C15646f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f44461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15646f(Fragment fragment) {
            super(0);
            this.f44461d = fragment;
        }

        public final Fragment invoke() {
            return this.f44461d;
        }
    }

    /* renamed from: ig.i$g */
    public static final class C15647g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f44462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15647g(C43064a aVar) {
            super(0);
            this.f44462d = aVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = ((C1638u0) this.f44462d.invoke()).getViewModelStore();
            C41536l.m120488h(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ig.i$h */
    static final class C15648h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15640i f44463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15648h(C15640i iVar) {
            super(0);
            this.f44463d = iVar;
        }

        /* renamed from: b */
        public final ChatUser invoke() {
            Bundle arguments = this.f44463d.getArguments();
            if (arguments != null) {
                return (ChatUser) arguments.getParcelable("CHAT_USER");
            }
            return null;
        }
    }

    /* renamed from: ig.i$i */
    static final class C15649i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15640i f44464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15649i(C15640i iVar) {
            super(0);
            this.f44464d = iVar;
        }

        public final C1620q0.C1624b invoke() {
            return this.f44464d.mo42950i2();
        }
    }

    /* renamed from: e2 */
    private final C15641a m56456e2() {
        return (C15641a) this.f44455G.getValue();
    }

    /* renamed from: f2 */
    private final C10423b m56457f2() {
        C10423b bVar = this.f44450B;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: g2 */
    private final ChatUser m56458g2() {
        return (ChatUser) this.f44456H.getValue();
    }

    /* renamed from: h2 */
    private final C16931k m56459h2() {
        return (C16931k) this.f44452D.getValue();
    }

    /* renamed from: j2 */
    private final boolean m56460j2() {
        return ((Boolean) this.f44453E.getValue()).booleanValue();
    }

    /* renamed from: k2 */
    private final boolean m56461k2() {
        return ((Boolean) this.f44454F.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m56462l2(C15640i iVar, View view) {
        String str;
        C41536l.m120489i(iVar, "this$0");
        if (iVar.m56460j2()) {
            C16931k h2 = iVar.m56459h2();
            ChatUser g2 = iVar.m56458g2();
            if (g2 != null) {
                str = g2.mo33794b();
            } else {
                str = null;
            }
            h2.mo44098Hw(true, str);
        }
        iVar.f44457I = true;
        iVar.mo4577k1();
        ChatUser g22 = iVar.m56458g2();
        if (g22 != null) {
            ConversationActivity.C12992a aVar = ConversationActivity.f38329y;
            Context requireContext = iVar.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            aVar.mo34209a(requireContext, iVar.m56461k2(), g22);
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f44450B = C10423b.m37858d(getLayoutInflater(), viewGroup, true);
        mo4586v1(false);
        C16931k h2 = m56459h2();
        String string = getString(C18590s.chatbot_privacy_policy_title);
        C41536l.m120488h(string, "getString(\n             …olicy_title\n            )");
        mo26370a2(h2.mo44095Dw("chatbot.privacy.policy.title", string));
        PageDescriptionView pageDescriptionView = m56457f2().f29637f;
        C16931k h22 = m56459h2();
        String string2 = getString(C18590s.chatbot_privacy_policy_text);
        C41536l.m120488h(string2, "getString(\n             …policy_text\n            )");
        pageDescriptionView.setText(h22.mo44095Dw("chatbot.privacy.policy.text", string2));
        CheckboxView checkbox = m56457f2().f29636e.getCheckbox();
        C16931k h23 = m56459h2();
        String string3 = getString(C18590s.chatbot_privacy_policy_agree);
        C41536l.m120488h(string3, "getString(\n             …olicy_agree\n            )");
        checkbox.setText(h23.mo44095Dw("chatbot.privacy.policy.agree", string3));
        Button button = m56457f2().f29636e.getButton();
        C16931k h24 = m56459h2();
        String string4 = getString(C18590s.chatbot_privacy_policy_button_text);
        C41536l.m120488h(string4, "getString(\n             …button_text\n            )");
        button.setButtonText(h24.mo44095Dw("chatbot.privacy.policy.button", string4));
        m56457f2().f29636e.getButton().setOnClickListener(new C15639h(this));
    }

    /* renamed from: b */
    public void mo26371b() {
        String str;
        if (m56460j2()) {
            C16931k h2 = m56459h2();
            ChatUser g2 = m56458g2();
            if (g2 != null) {
                str = g2.mo33794b();
            } else {
                str = null;
            }
            h2.mo44098Hw(false, str);
        }
        super.mo26371b();
    }

    /* renamed from: i2 */
    public final C1620q0.C1624b mo42950i2() {
        C1620q0.C1624b bVar = this.f44451C;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("viewModelFactory");
        return null;
    }

    /* renamed from: k1 */
    public void mo4577k1() {
        C15641a e2 = m56456e2();
        if (e2 != null) {
            e2.mo42951j(this.f44457I);
        }
        super.mo4577k1();
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        C18570b b = C18574d.f52090a.mo46429b();
        if (b != null) {
            b.mo46406d(this);
        }
        super.onAttach(context);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f44450B = null;
    }
}
