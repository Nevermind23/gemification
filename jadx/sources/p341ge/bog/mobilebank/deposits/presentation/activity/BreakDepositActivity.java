package p341ge.bog.mobilebank.deposits.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import ba1.C10146d0;
import bc0.C19369a;
import d21.C31517a;
import dc0.C19970a;
import fc0.C20462b;
import g91.C32303f;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import nc0.C26404a;
import nc0.C26406b;
import nc0.C26408c;
import nc0.C26412g;
import o31.C37588a0;
import o31.C37613p;
import oy0.C37839e;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.ValidateDepositBreakParams;
import p341ge.bog.mobilebank.deposits.presentation.model.depositbreak.C23233a;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p615tg.C17959a;
import rb0.C27983b;
import rb0.C27984c;
import rb0.C27988g;
import ue1.C43064a;
import ue1.C43075l;
import xb0.C29717f;
import xb0.C29729q;

/* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity */
public final class BreakDepositActivity extends C23176w implements C41185v.C41186a {

    /* renamed from: M */
    public static final C23050a f60573M = new C23050a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C26404a f60574G;

    /* renamed from: H */
    private final C41217g f60575H = C41219i.m119470b(new C23059j(this));

    /* renamed from: I */
    private final C41217g f60576I = new C1617p0(C41520a0.m120436b(C26412g.class), new C23073x(this), new C23075z(this), new C23074y((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f60577J = C41219i.m119470b(C23060k.f60584d);

    /* renamed from: K */
    private final C41217g f60578K = C41219i.m119470b(C23061l.f60585d);

    /* renamed from: L */
    private final C41217g f60579L = C41219i.m119470b(new C23062m(this));

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$a */
    public static final class C23050a {
        private C23050a() {
        }

        public /* synthetic */ C23050a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo57726a(Context context, long j) {
            C41536l.m120489i(context, "context");
            context.startActivity(C37613p.m110614a(new Intent(context, BreakDepositActivity.class), C41233s.m119492a("ARG_AGREE_KEY", Long.valueOf(j))));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$b */
    /* synthetic */ class C23051b extends C41535k implements C43075l {
        C23051b(Object obj) {
            super(1, obj, BreakDepositActivity.class, "onResourcesResult", "onResourcesResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57727b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((BreakDepositActivity) this.receiver).m74725m3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57727b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$c */
    static final class C23052c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23052c(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60580d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57728a(CardAccountSelectorData cardAccountSelectorData) {
            C41536l.m120489i(cardAccountSelectorData, "it");
            C31517a.f78078J.mo71926a(cardAccountSelectorData).mo4576A1(this.f60580d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57728a((CardAccountSelectorData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$d */
    /* synthetic */ class C23053d extends C41535k implements C43075l {
        C23053d(Object obj) {
            super(1, obj, BreakDepositActivity.class, "fillBreakDetails", "fillBreakDetails(Lge/bog/mobilebank/deposits/presentation/model/depositbreak/DepositBreakDetailsUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo57729b(C23233a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((BreakDepositActivity) this.receiver).m74715c3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57729b((C23233a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$e */
    /* synthetic */ class C23054e extends C41535k implements C43075l {
        C23054e(Object obj) {
            super(1, obj, BreakDepositActivity.class, "fillInput", "fillInput(Lge/bog/mobilebank/deposits/presentation/model/depositbreak/input/DepositBreakInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo57730b(C20462b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((BreakDepositActivity) this.receiver).m74716d3(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57730b((C20462b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$f */
    static final class C23055f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23055f(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60581d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57731a(ValidateDepositBreakParams validateDepositBreakParams) {
            C41536l.m120489i(validateDepositBreakParams, "it");
            C41185v.C41187b bVar = C41185v.f97155C;
            HashMap Aw = this.f60581d.m74721j3().mo65656Aw(validateDepositBreakParams);
            Aw.put("tmxSessionId", C10146d0.C10177h.m37232a());
            C41238w wVar = C41238w.f97225a;
            C41185v e = C41185v.C41187b.m119423e(bVar, "DEPOSITS_VALIDATE_AND_PROCESS_DEPOSIT_BREAK", Aw, (C41143c) null, 4, (Object) null);
            FragmentManager supportFragmentManager = this.f60581d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            e.mo4576A1(supportFragmentManager, (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57731a((ValidateDepositBreakParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$g */
    /* synthetic */ class C23056g extends C41535k implements C43075l {
        C23056g(Object obj) {
            super(1, obj, BreakDepositActivity.class, "onDepositBreakValidation", "onDepositBreakValidation(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57732b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((BreakDepositActivity) this.receiver).m74722k3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57732b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$h */
    static final class C23057h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23057h(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60582d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57733a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f60582d.m74729q3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57733a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$i */
    /* synthetic */ class C23058i extends C41535k implements C43075l {
        C23058i(Object obj) {
            super(1, obj, BreakDepositActivity.class, "onProcessDepositBreakResult", "onProcessDepositBreakResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo57734b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((BreakDepositActivity) this.receiver).m74724l3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57734b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$j */
    static final class C23059j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60583d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23059j(BreakDepositActivity breakDepositActivity) {
            super(0);
            this.f60583d = breakDepositActivity;
        }

        /* renamed from: b */
        public final C29717f invoke() {
            return C29717f.m90233d(this.f60583d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$k */
    /* synthetic */ class C23060k extends C41535k implements C43064a {

        /* renamed from: d */
        public static final C23060k f60584d = new C23060k();

        C23060k() {
            super(0, C19970a.class, "<init>", "<init>()V", 0);
        }

        /* renamed from: b */
        public final C19970a invoke() {
            return new C19970a();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$l */
    /* synthetic */ class C23061l extends C41535k implements C43064a {

        /* renamed from: d */
        public static final C23061l f60585d = new C23061l();

        C23061l() {
            super(0, C19970a.class, "<init>", "<init>()V", 0);
        }

        /* renamed from: b */
        public final C19970a invoke() {
            return new C19970a();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$m */
    static final class C23062m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23062m(BreakDepositActivity breakDepositActivity) {
            super(0);
            this.f60586d = breakDepositActivity;
        }

        /* renamed from: b */
        public final C13364a invoke() {
            return new C13364a(C0767a.m2895e(this.f60586d, C27984c.f71248y));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$n */
    static final class C23063n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60587d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23063n(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60587d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57739a(C37839e eVar) {
            BreakDepositActivity.m74727o3(this.f60587d, true, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57739a((C37839e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$o */
    static final class C23064o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60588d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23064o(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60588d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57740a(C37839e eVar) {
            C41536l.m120489i(eVar, "it");
            BreakDepositActivity.m74727o3(this.f60588d, false, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57740a((C37839e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$p */
    static final class C23065p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60589d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23065p(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60589d = breakDepositActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            BreakDepositActivity.m74727o3(this.f60589d, false, false, 2, (Object) null);
            this.f60589d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$q */
    static final class C23066q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60590d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23066q(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60590d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57742a(List list) {
            BreakDepositActivity.m74727o3(this.f60590d, true, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57742a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$r */
    static final class C23067r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60591d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23067r(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60591d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57743a(List list) {
            C41536l.m120489i(list, "it");
            BreakDepositSuccessActivity.f60602I.mo57761a(this.f60591d, list);
            this.f60591d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57743a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$s */
    static final class C23068s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60592d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23068s(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60592d = breakDepositActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            BreakDepositActivity.m74727o3(this.f60592d, false, false, 2, (Object) null);
            this.f60592d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$t */
    static final class C23069t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60593d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23069t(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60593d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57745a(C19369a aVar) {
            this.f60593d.m74717e3().f75022k.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57745a((C19369a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$u */
    static final class C23070u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23070u(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60594d = breakDepositActivity;
        }

        /* renamed from: a */
        public final void mo57746a(C19369a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f60594d.m74717e3().f75022k.mo53595c();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57746a((C19369a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$v */
    static final class C23071v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23071v(BreakDepositActivity breakDepositActivity) {
            super(1);
            this.f60595d = breakDepositActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60595d.m74717e3().f75028q.setText(C32343x.m95431a0(th, (String) null, 1, (Object) null));
            this.f60595d.m74717e3().f75022k.mo53596d();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$w */
    static final class C23072w implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60596a;

        C23072w(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60596a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60596a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60596a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$x */
    public static final class C23073x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60597d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23073x(ComponentActivity componentActivity) {
            super(0);
            this.f60597d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60597d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$y */
    public static final class C23074y extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60598d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60599e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23074y(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60598d = aVar;
            this.f60599e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60598d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60599e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$z */
    static final class C23075z extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BreakDepositActivity f60600d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositActivity$z$a */
        static final class C23076a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ BreakDepositActivity f60601d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23076a(BreakDepositActivity breakDepositActivity) {
                super(0);
                this.f60601d = breakDepositActivity;
            }

            /* renamed from: b */
            public final C26412g invoke() {
                return this.f60601d.mo57725i3().mo32552a(this.f60601d.getIntent().getLongExtra("ARG_AGREE_KEY", -1));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23075z(BreakDepositActivity breakDepositActivity) {
            super(0);
            this.f60600d = breakDepositActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C23076a(this.f60600d));
        }
    }

    /* renamed from: U2 */
    private final void m74707U2() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_CARD_ACCOUNT_SELECTED", this, new C23154a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m74708V2(BreakDepositActivity breakDepositActivity, String str, Bundle bundle) {
        C41536l.m120489i(breakDepositActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        CardAccountSelectorUiModel cardAccountSelectorUiModel = (CardAccountSelectorUiModel) bundle.getParcelable("RESULT_KEY_SELECTED_ACCOUNT");
        if (cardAccountSelectorUiModel != null) {
            breakDepositActivity.m74721j3().mo65663ww().mo65643Bk(cardAccountSelectorUiModel);
        }
    }

    /* renamed from: W2 */
    private final void m74709W2() {
        m74717e3().f75017f.getButton().setOnClickListener(new C23155b(this));
        m74717e3().f75017f.getCheckbox().setOnCheckedStateChangeListener(new C23156c(this));
        m74717e3().f75016e.setOnClickListener(new C23157d(this));
        m74717e3().f75017f.getCheckbox().setTextClickListener(new C23158e(this));
        m74717e3().f75029r.setOnClickListener(new C23159f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m74710X2(BreakDepositActivity breakDepositActivity) {
        C41536l.m120489i(breakDepositActivity, "this$0");
        C32303f.m95184D(C32343x.m95388F("link.terms.deposit.violation", new Object[0]), breakDepositActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m74711Y2(BreakDepositActivity breakDepositActivity, View view) {
        C41536l.m120489i(breakDepositActivity, "this$0");
        C21481a.onRefresh$default(breakDepositActivity.m74721j3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m74712Z2(BreakDepositActivity breakDepositActivity, View view) {
        C41536l.m120489i(breakDepositActivity, "this$0");
        C26406b.C26407a.m82517a(breakDepositActivity.m74721j3().mo65663ww(), (String) null, (String) null, (String) null, 7, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m74713a3(BreakDepositActivity breakDepositActivity, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(breakDepositActivity, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        breakDepositActivity.m74721j3().mo65663ww().mo65644En(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m74714b3(BreakDepositActivity breakDepositActivity, View view) {
        C41536l.m120489i(breakDepositActivity, "this$0");
        breakDepositActivity.m74721j3().mo65663ww().mo65645H0();
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m74715c3(C23233a aVar) {
        C19970a.C19971a.C19972a aVar2 = C19970a.C19971a.f54565e;
        C29729q qVar = m74717e3().f75023l;
        C41536l.m120488h(qVar, "binding.currentAmount");
        aVar2.mo48340b(qVar, aVar.mo58109a());
        m74719g3().mo6029i(aVar.mo58112d());
        m74718f3().mo6029i(aVar.mo58111c());
        m74717e3().f75018g.setTitle(C17959a.m61877a(aVar.mo58110b()));
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m74716d3(C20462b bVar) {
        String str;
        Input input = m74717e3().f75016e;
        CardAccountSelectorUiModel a = bVar.mo48996c().mo48991a();
        if (a == null || (str = a.mo84204b()) == null) {
            str = "";
        }
        input.setInputText(str);
        m74717e3().f75017f.getButton().setEnabled(bVar.mo48997d());
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final C29717f m74717e3() {
        return (C29717f) this.f60575H.getValue();
    }

    /* renamed from: f3 */
    private final C19970a m74718f3() {
        return (C19970a) this.f60577J.getValue();
    }

    /* renamed from: g3 */
    private final C19970a m74719g3() {
        return (C19970a) this.f60578K.getValue();
    }

    /* renamed from: h3 */
    private final C13364a m74720h3() {
        return (C13364a) this.f60579L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public final C26412g m74721j3() {
        return (C26412g) this.f60576I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public final void m74722k3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23063n(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C23064o(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23065p(this), 1, (Object) null);
    }

    /* renamed from: l1 */
    private final void m74723l1() {
        C26408c Bw = m74721j3().mo65657Bw();
        Bw.mo65654Zf().mo4819k(this, new C23072w(new C23051b(this)));
        C37224b.m109963b(Bw.mo65649Ct(), this, new C23052c(this));
        Bw.mo65651Nn().mo4819k(this, new C23072w(new C23053d(this)));
        Bw.mo65655f().mo4819k(this, new C23072w(new C23054e(this)));
        C37224b.m109963b(Bw.mo65652Pq(), this, new C23055f(this));
        Bw.mo65650Nb().mo4819k(this, new C23072w(new C23056g(this)));
        C37224b.m109963b(Bw.mo65653Su(), this, new C23057h(this));
        Bw.mo65648Ac().mo4819k(this, new C23072w(new C23058i(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m74724l3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23066q(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C23067r(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23068s(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public final void m74725m3(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C23069t(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C23070u(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23071v(this), 1, (Object) null);
    }

    /* renamed from: n3 */
    private final void m74726n3(boolean z, boolean z2) {
        FrameLayout frameLayout = m74717e3().f75030s;
        C41536l.m120488h(frameLayout, "binding.regularLoaderContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        ProgressBar progressBar = m74717e3().f75031t;
        C41536l.m120488h(progressBar, "binding.roundLoader");
        C32343x.m95483r1(progressBar, z2, false, 2, (Object) null);
        if (!z2) {
            m74717e3().f75017f.getButton().setLoading(z);
        }
    }

    /* renamed from: o3 */
    static /* synthetic */ void m74727o3(BreakDepositActivity breakDepositActivity, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        breakDepositActivity.m74726n3(z, z2);
    }

    /* renamed from: p3 */
    private final void m74728p3() {
        C29717f e3 = m74717e3();
        e3.f75024m.setTitle(C32343x.m95388F("deposits.break.page.title", new Object[0]));
        e3.f75024m.setText(C32343x.m95388F("deposits.break.page.message", new Object[0]));
        e3.f75020i.f74985e.setTitle(C32343x.m95388F("deposits.break.page.total.sum.description", new Object[0]));
        e3.f75026o.f74985e.setTitle(C32343x.m95388F("deposits.break.page.lost.interrest.desc", new Object[0]));
        e3.f75018g.setText(C32343x.m95388F("deposits.break.page.account.desc", new Object[0]));
        e3.f75016e.setHintText((CharSequence) C32343x.m95388F("deposits.break.page.account", new Object[0]));
        e3.f75017f.getButton().setButtonText(C32343x.m95388F("deposits.break.page.button", new Object[0]));
        e3.f75017f.getCheckbox().mo35145g(C32343x.m95388F("deposits.break.page.agree", new Object[0]), C32343x.m95388F("deposits.break.page.agree.terms", new Object[0]));
        e3.f75020i.mo3946b().setBackgroundColor(C0767a.m2893c(this, C27983b.f71227j));
        e3.f75020i.f74986f.setAdapter(m74719g3());
        e3.f75026o.f74986f.setAdapter(m74718f3());
        e3.f75020i.f74986f.mo5351j(m74720h3());
        e3.f75026o.f74986f.mo5351j(m74720h3());
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public final void m74729q3() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(mo38120z1());
        dVar.mo35639Q1(C32343x.m95388F("text.deposits.breaching.agreement.warning", new Object[0]));
        dVar.mo35646Z1(C32343x.m95452h0(C27988g.f71308c, new Object[0]));
        dVar.mo35642U1(C32343x.m95452h0(C27988g.f71306a, new Object[0]));
        dVar.mo35645Y1(new C23160g(this, dVar));
        dVar.mo35641T1(new C23161h(dVar));
        dVar.mo4586v1(false);
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m74730r3(BreakDepositActivity breakDepositActivity, C13310d dVar, Button button) {
        C41536l.m120489i(breakDepositActivity, "this$0");
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        breakDepositActivity.m74721j3().mo65663ww().mo65646Vs();
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m74731s3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C41185v g0 = C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
        m74721j3().mo65663ww().mo65647pf(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m74717e3());
        m74728p3();
        m74709W2();
        m74723l1();
        m74707U2();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        C41185v g0 = C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo95634K2(str);
        }
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m74726n3(z, true);
    }

    /* renamed from: i3 */
    public final C26404a mo57725i3() {
        C26404a aVar = this.f60574G;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("deposits.break.page.header", new Object[0]);
    }
}
