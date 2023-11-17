package p341ge.bog.chat.presentation.activity.faq;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import he1.C41217g;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.presentation.activity.C13009b;
import p341ge.bog.chat.presentation.holders.ComponentUi;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p376cg.C10424c;
import p475jg.C15765a;
import p475jg.C15767c;
import ue1.C43064a;

/* renamed from: ge.bog.chat.presentation.activity.faq.ChatFAQActivity */
public final class ChatFAQActivity extends C13009b {

    /* renamed from: q */
    public static final C13023a f38383q = new C13023a((DefaultConstructorMarker) null);

    /* renamed from: o */
    private final C41217g f38384o = C41219i.m119470b(new C13024b(this));

    /* renamed from: p */
    private final C41217g f38385p = C41219i.m119470b(new C13025c(this));

    /* renamed from: ge.bog.chat.presentation.activity.faq.ChatFAQActivity$a */
    public static final class C13023a {
        private C13023a() {
        }

        public /* synthetic */ C13023a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo34277a(Context context, ComponentUi.FAQComponentUi fAQComponentUi) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(fAQComponentUi, "faqComponentUi");
            Intent putExtra = new Intent(context, ChatFAQActivity.class).putExtra("FAQ_QUESTIONS", fAQComponentUi);
            C41536l.m120488h(putExtra, "Intent(context, ChatFAQA…UESTIONS, faqComponentUi)");
            context.startActivity(putExtra);
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.faq.ChatFAQActivity$b */
    static final class C13024b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChatFAQActivity f38386d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13024b(ChatFAQActivity chatFAQActivity) {
            super(0);
            this.f38386d = chatFAQActivity;
        }

        /* renamed from: b */
        public final C10424c invoke() {
            C10424c d = C10424c.m37862d(this.f38386d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.faq.ChatFAQActivity$c */
    static final class C13025c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChatFAQActivity f38387d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13025c(ChatFAQActivity chatFAQActivity) {
            super(0);
            this.f38387d = chatFAQActivity;
        }

        /* renamed from: b */
        public final ComponentUi.FAQComponentUi invoke() {
            return (ComponentUi.FAQComponentUi) this.f38387d.getIntent().getParcelableExtra("FAQ_QUESTIONS");
        }
    }

    /* renamed from: R0 */
    private final C10424c m49170R0() {
        return (C10424c) this.f38384o.getValue();
    }

    /* renamed from: S0 */
    private final ComponentUi.FAQComponentUi m49171S0() {
        return (ComponentUi.FAQComponentUi) this.f38385p.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: T0 */
    public static final void m49172T0(ChatFAQActivity chatFAQActivity, View view) {
        C41536l.m120489i(chatFAQActivity, "this$0");
        chatFAQActivity.getOnBackPressedDispatcher().mo345g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        List list;
        super.onCreate(bundle);
        setContentView((View) m49170R0().mo3946b());
        C15767c cVar = new C15767c();
        m49170R0().f29639e.setAdapter(cVar);
        ComponentUi.FAQComponentUi S0 = m49171S0();
        String str = null;
        if (S0 != null) {
            list = S0.mo34347a();
        } else {
            list = null;
        }
        cVar.mo6029i(list);
        ToolbarView toolbarView = m49170R0().f29640f;
        ComponentUi.FAQComponentUi S02 = m49171S0();
        if (S02 != null) {
            str = S02.mo34348b();
        }
        toolbarView.setTitle(str);
        m49170R0().f29640f.setNavigationOnClickListener(new C15765a(this));
    }
}
