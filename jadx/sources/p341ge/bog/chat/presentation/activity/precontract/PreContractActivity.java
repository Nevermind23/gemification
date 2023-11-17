package p341ge.bog.chat.presentation.activity.precontract;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.presentation.activity.C13009b;
import p341ge.bog.chat.presentation.holders.ComponentUi;
import p376cg.C10426e;
import p489kg.C16420a;
import p489kg.C16421b;
import p489kg.C16422c;
import ue1.C43064a;

/* renamed from: ge.bog.chat.presentation.activity.precontract.PreContractActivity */
public final class PreContractActivity extends C13009b {

    /* renamed from: q */
    public static final C13056a f38456q = new C13056a((DefaultConstructorMarker) null);

    /* renamed from: o */
    private final C41217g f38457o = C41219i.m119470b(new C13057b(this));

    /* renamed from: p */
    private final C41217g f38458p = C41219i.m119470b(new C13058c(this));

    /* renamed from: ge.bog.chat.presentation.activity.precontract.PreContractActivity$a */
    public static final class C13056a {
        private C13056a() {
        }

        public /* synthetic */ C13056a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo34335a(Context context, ComponentUi.PreContractComponentUi preContractComponentUi) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(preContractComponentUi, "preContractComponentUi");
            Intent intent = new Intent(context, PreContractActivity.class);
            intent.putExtra("PRE_CONTRACT_DETAILS", preContractComponentUi);
            return intent;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.precontract.PreContractActivity$b */
    static final class C13057b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PreContractActivity f38459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13057b(PreContractActivity preContractActivity) {
            super(0);
            this.f38459d = preContractActivity;
        }

        /* renamed from: b */
        public final C10426e invoke() {
            C10426e d = C10426e.m37872d(this.f38459d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.precontract.PreContractActivity$c */
    static final class C13058c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PreContractActivity f38460d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13058c(PreContractActivity preContractActivity) {
            super(0);
            this.f38460d = preContractActivity;
        }

        /* renamed from: b */
        public final ComponentUi.PreContractComponentUi invoke() {
            return (ComponentUi.PreContractComponentUi) this.f38460d.getIntent().getParcelableExtra("PRE_CONTRACT_DETAILS");
        }
    }

    /* renamed from: T0 */
    private final C10426e m49247T0() {
        return (C10426e) this.f38457o.getValue();
    }

    /* renamed from: U0 */
    private final ComponentUi.PreContractComponentUi m49248U0() {
        return (ComponentUi.PreContractComponentUi) this.f38458p.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public static final void m49249V0(PreContractActivity preContractActivity, View view) {
        C41536l.m120489i(preContractActivity, "this$0");
        preContractActivity.getOnBackPressedDispatcher().mo345g();
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public static final void m49250W0(ComponentUi.PreContractComponentUi preContractComponentUi, PreContractActivity preContractActivity, View view) {
        C41536l.m120489i(preContractComponentUi, "$preContract");
        C41536l.m120489i(preContractActivity, "this$0");
        Intent intent = new Intent();
        intent.putExtra("PRE_CONTRACT_AGREED_PAYLOAD", preContractComponentUi.mo34371d());
        intent.putExtra("PRE_CONTRACT_AGREED_TITLE", preContractComponentUi.mo34369a());
        preContractActivity.setResult(-1, intent);
        preContractActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public static final void m49251X0(PreContractActivity preContractActivity) {
        C41536l.m120489i(preContractActivity, "this$0");
        preContractActivity.m49247T0().f29648f.getButton().setEnabled(true);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) m49247T0().mo3946b());
        m49247T0().f29648f.getButton().setEnabled(false);
        m49247T0().f29649g.setNavigationOnClickListener(new C16420a(this));
        ComponentUi.PreContractComponentUi U0 = m49248U0();
        if (U0 != null) {
            m49247T0().f29649g.setTitle(U0.mo34370b());
            m49247T0().f29650h.loadDataWithBaseURL((String) null, U0.mo34373e(), "text/html", "utf-8", (String) null);
            m49247T0().f29648f.getButton().setButtonText(U0.mo34369a());
            m49247T0().f29648f.getButton().setOnClickListener(new C16421b(U0, this));
            m49247T0().f29650h.setScrollEndedListener(new C16422c(this));
        }
    }
}
