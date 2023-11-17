package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import b41.C31128a;
import b41.C31132b;
import ba1.C10220y;
import com.google.android.material.tabs.C5161d;
import com.google.android.material.tabs.TabLayout;
import dt0.C31585a;
import dt0.C31586b;
import g91.C32343x;
import gt0.C36075c;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ot0.C37728a;
import ot0.C37732b;
import ot0.C37736d;
import ot0.C37748j;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.domain.model.piggybank.CasServiceNotFoundException;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.C33023a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.CasDetailsFragment;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import q31.C38122f;
import q31.C38125h;
import qt0.C38246b;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39445d;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity */
public final class CasDetailsActivity extends C32897a {

    /* renamed from: M */
    public static final C32795b f80644M = new C32795b((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C37732b f80645G;

    /* renamed from: H */
    private final C41217g f80646H = C41219i.m119470b(new C32802f(this));

    /* renamed from: I */
    private final C41217g f80647I = C41219i.m119470b(new C32803g(this));

    /* renamed from: J */
    private final C41217g f80648J = C41219i.m119470b(new C32804h(this));

    /* renamed from: K */
    private final C41217g f80649K = C41219i.m119470b(C32818u.f80670d);

    /* renamed from: L */
    private final C41217g f80650L = new C1617p0(C41520a0.m120436b(C37748j.class), new C32814r(this), new C32816t(this), new C32815s((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$a */
    private static final class C32794a extends FragmentStateAdapter {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32794a(C1505h hVar) {
            super(hVar);
            C41536l.m120489i(hVar, "parent");
        }

        public int getItemCount() {
            return 2;
        }

        /* renamed from: h */
        public Fragment mo6571h(int i) {
            if (i == 0) {
                return new CasDetailsFragment();
            }
            if (i == 1) {
                return new C33023a();
            }
            throw new IllegalStateException("Invalid fragment position".toString());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$b */
    public static final class C32795b {
        private C32795b() {
        }

        public /* synthetic */ C32795b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74686a(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, CasDetailsActivity.class);
            intent.putExtra("PARAM_CAS_SERVICE_ID", j);
            context.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo74687b(Context context, long j) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, CasDetailsActivity.class);
            intent.putExtra("PARAM_DEPOSIT_ACCT_KEY", j);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$c */
    /* synthetic */ class C32796c extends C41535k implements C43075l {
        C32796c(Object obj) {
            super(1, obj, CasDetailsActivity.class, "onCasDetailsResult", "onCasDetailsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74688b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CasDetailsActivity) this.receiver).m96881W2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74688b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$d */
    /* synthetic */ class C32797d extends C41535k implements C43075l {
        C32797d(Object obj) {
            super(1, obj, CasDetailsActivity.class, "onCasDetailsUpdate", "onCasDetailsUpdate(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo74689b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CasDetailsActivity) this.receiver).m96882X2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74689b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$e */
    static final class C32798e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80651d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$e$a */
        static final class C32799a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CasDetailsActivity f80652d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32799a(CasDetailsActivity casDetailsActivity) {
                super(1);
                this.f80652d = casDetailsActivity;
            }

            /* renamed from: a */
            public final void mo74691a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f80652d.finish();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74691a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$e$b */
        static final class C32800b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CasDetailsActivity f80653d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32800b(CasDetailsActivity casDetailsActivity) {
                super(1);
                this.f80653d = casDetailsActivity;
            }

            /* renamed from: a */
            public final void mo74692a(C41238w wVar) {
                this.f80653d.m96884Z2(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74692a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$e$c */
        /* synthetic */ class C32801c extends C41535k implements C43075l {
            C32801c(Object obj) {
                super(1, obj, CasDetailsActivity.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
            }

            /* renamed from: b */
            public final void mo74693b(Throwable th) {
                ((CasDetailsActivity) this.receiver).mo74709H1(th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74693b((Throwable) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32798e(CasDetailsActivity casDetailsActivity) {
            super(1);
            this.f80651d = casDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74690a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C32799a(this.f80651d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C32800b(this.f80651d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C32801c(this.f80651d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74690a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$f */
    static final class C32802f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32802f(CasDetailsActivity casDetailsActivity) {
            super(0);
            this.f80654d = casDetailsActivity;
        }

        /* renamed from: b */
        public final C39445d invoke() {
            return C39445d.m114632d(this.f80654d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$g */
    static final class C32803g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32803g(CasDetailsActivity casDetailsActivity) {
            super(0);
            this.f80655d = casDetailsActivity;
        }

        /* renamed from: b */
        public final Long invoke() {
            return Long.valueOf(this.f80655d.getIntent().getLongExtra("PARAM_DEPOSIT_ACCT_KEY", -1));
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$h */
    static final class C32804h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80656d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32804h(CasDetailsActivity casDetailsActivity) {
            super(0);
            this.f80656d = casDetailsActivity;
        }

        /* renamed from: b */
        public final Long invoke() {
            return Long.valueOf(this.f80656d.getIntent().getLongExtra("PARAM_CAS_SERVICE_ID", -1));
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$i */
    static final class C32805i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32805i(CasDetailsActivity casDetailsActivity) {
            super(1);
            this.f80657d = casDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74697a(CasDetailsUiModel casDetailsUiModel) {
            this.f80657d.m96885a3(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74697a((CasDetailsUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$j */
    static final class C32806j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32806j(CasDetailsActivity casDetailsActivity) {
            super(1);
            this.f80658d = casDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            if (th instanceof CasServiceNotFoundException) {
                C38122f c = C38125h.m112238c(this.f80658d);
                CasDetailsActivity casDetailsActivity = this.f80658d;
                c.mo91539A0(casDetailsActivity, casDetailsActivity.m96877S2());
                this.f80658d.finish();
                return;
            }
            this.f80658d.m96885a3(false);
            this.f80658d.m96889e3(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$k */
    static final class C32807k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32807k(CasDetailsActivity casDetailsActivity) {
            super(1);
            this.f80659d = casDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74699a(CasDetailsUiModel casDetailsUiModel) {
            this.f80659d.m96884Z2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74699a((CasDetailsUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$l */
    static final class C32808l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80660d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32808l(CasDetailsActivity casDetailsActivity) {
            super(1);
            this.f80660d = casDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80660d.m96884Z2(false);
            this.f80660d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$m */
    /* synthetic */ class C32809m extends C41535k implements C43075l {
        C32809m(Object obj) {
            super(1, obj, CasDetailsActivity.class, "onPiggyBankDetails", "onPiggyBankDetails(Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/CasDetailsUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo74701b(CasDetailsUiModel casDetailsUiModel) {
            C41536l.m120489i(casDetailsUiModel, "p0");
            ((CasDetailsActivity) this.receiver).m96883Y2(casDetailsUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74701b((CasDetailsUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$n */
    static final class C32810n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32810n(CasDetailsActivity casDetailsActivity) {
            super(1);
            this.f80661d = casDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74702a(C41238w wVar) {
            this.f80661d.m96884Z2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74702a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$o */
    static final class C32811o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32811o(CasDetailsActivity casDetailsActivity) {
            super(1);
            this.f80662d = casDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f80662d.m96884Z2(false);
            this.f80662d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$p */
    static final class C32812p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32812p(CasDetailsActivity casDetailsActivity) {
            super(1);
            this.f80663d = casDetailsActivity;
        }

        /* renamed from: a */
        public final void mo74704a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f80663d.m96884Z2(false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74704a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$q */
    static final class C32813q implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80664a;

        C32813q(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80664a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80664a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80664a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$r */
    public static final class C32814r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f80665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32814r(ComponentActivity componentActivity) {
            super(0);
            this.f80665d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80665d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$s */
    public static final class C32815s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80666d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f80667e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32815s(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f80666d = aVar;
            this.f80667e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80666d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80667e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$t */
    static final class C32816t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CasDetailsActivity f80668d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$t$a */
        static final class C32817a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CasDetailsActivity f80669d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32817a(CasDetailsActivity casDetailsActivity) {
                super(0);
                this.f80669d = casDetailsActivity;
            }

            /* renamed from: b */
            public final C37748j invoke() {
                C37728a aVar;
                C37732b Q2 = this.f80669d.mo74685Q2();
                if (this.f80669d.m96877S2() != -1) {
                    aVar = new C37728a.C37730b(this.f80669d.m96877S2());
                } else {
                    aVar = new C37728a.C37729a(this.f80669d.m96878T2());
                }
                return Q2.mo32574a(aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32816t(CasDetailsActivity casDetailsActivity) {
            super(0);
            this.f80668d = casDetailsActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C38246b.f91733a.mo91781a(new C32817a(this.f80668d));
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity$u */
    static final class C32818u extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C32818u f80670d = new C32818u();

        C32818u() {
            super(0);
        }

        /* renamed from: b */
        public final C36075c invoke() {
            return new C36075c();
        }
    }

    /* renamed from: O2 */
    private final void m96874O2() {
        m96876R2().f93722k.setOnClickListener(new C31585a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m96875P2(CasDetailsActivity casDetailsActivity, View view) {
        C41536l.m120489i(casDetailsActivity, "this$0");
        casDetailsActivity.m96879U2().onRefresh(153);
    }

    /* renamed from: R2 */
    private final C39445d m96876R2() {
        return (C39445d) this.f80646H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final long m96877S2() {
        return ((Number) this.f80647I.getValue()).longValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final long m96878T2() {
        return ((Number) this.f80648J.getValue()).longValue();
    }

    /* renamed from: U2 */
    private final C37748j m96879U2() {
        return (C37748j) this.f80650L.getValue();
    }

    /* renamed from: V2 */
    private final C36075c m96880V2() {
        return (C36075c) this.f80649K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m96881W2(C31128a aVar) {
        C31132b.m92645g(aVar, new int[]{1}, new C32805i(this));
        C31132b.m92641c(aVar, new int[]{1}, new C32806j(this));
        C31132b.m92645g(aVar, new int[]{6}, new C32807k(this));
        C31132b.m92641c(aVar, new int[]{6}, new C32808l(this));
        C31132b.m92647i(aVar, new int[]{1, 6}, new C32809m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m96882X2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C32810n(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C32811o(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C32812p(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m96883Y2(CasDetailsUiModel casDetailsUiModel) {
        m96885a3(false);
        m96884Z2(false);
        m96880V2().mo6029i(C41339p.m119900e(casDetailsUiModel));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m96884Z2(boolean z) {
        FrameLayout frameLayout = m96876R2().f93721j;
        C41536l.m120488h(frameLayout, "binding.regularLoaderContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final void m96885a3(boolean z) {
        FrameLayout frameLayout = m96876R2().f93724m;
        C41536l.m120488h(frameLayout, "binding.statusContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
        Button button = m96876R2().f93722k;
        C41536l.m120488h(button, "binding.retryButton");
        C32343x.m95483r1(button, !z, false, 2, (Object) null);
        PageState pageState = m96876R2().f93725n;
        C41536l.m120488h(pageState, "binding.statusLabel");
        C32343x.m95483r1(pageState, !z, false, 2, (Object) null);
        ProgressBar progressBar = m96876R2().f93720i;
        C41536l.m120488h(progressBar, "binding.progressBar");
        C32343x.m95483r1(progressBar, z, false, 2, (Object) null);
    }

    /* renamed from: b3 */
    private final void m96886b3() {
        m96876R2().f93717f.setAdapter(new C32794a(this));
        new C5161d(m96876R2().f93716e, m96876R2().f93717f, new C31586b(this)).mo16990a();
        m96876R2().f93717f.setCurrentItem(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m96887c3(CasDetailsActivity casDetailsActivity, TabLayout.C5153g gVar, int i) {
        C41536l.m120489i(casDetailsActivity, "this$0");
        C41536l.m120489i(gVar, "<anonymous parameter 0>");
        casDetailsActivity.m96876R2().f93717f.setCurrentItem(i);
    }

    /* renamed from: d3 */
    private final void m96888d3() {
        m96876R2().f93719h.setAdapter(m96880V2());
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m96889e3(Throwable th) {
        String str;
        FrameLayout frameLayout = m96876R2().f93724m;
        C41536l.m120488h(frameLayout, "binding.statusContainer");
        C32343x.m95483r1(frameLayout, true, false, 2, (Object) null);
        PageState pageState = m96876R2().f93725n;
        C41536l.m120488h(pageState, "binding.statusLabel");
        C32343x.m95483r1(pageState, true, false, 2, (Object) null);
        Button button = m96876R2().f93722k;
        C41536l.m120488h(button, "binding.retryButton");
        C32343x.m95483r1(button, true, false, 2, (Object) null);
        if (th instanceof ApiError) {
            str = C32343x.m95420V(((ApiError) th).mo84685a().getKey(), C32343x.m95452h0(C10220y.f28366O0, new Object[0]), new Object[0]);
        } else {
            str = th.getMessage();
            if (str == null) {
                str = C32343x.m95452h0(C10220y.f28366O0, new Object[0]);
            }
        }
        m96876R2().f93725n.setTitleText(str);
    }

    /* renamed from: l1 */
    private final void m96890l1() {
        C37736d Bw = m96879U2().mo91006Bw();
        Bw.mo91004ze().mo4819k(this, new C32813q(new C32796c(this)));
        Bw.mo91001km().mo4819k(this, new C32813q(new C32797d(this)));
        Bw.mo91002l6().mo4819k(this, new C32813q(new C32798e(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m96876R2().mo3946b());
        super.mo37451O1(bundle);
        m96888d3();
        m96885a3(true);
        m96886b3();
        m96890l1();
        m96874O2();
    }

    /* renamed from: Q2 */
    public final C37732b mo74685Q2() {
        C37732b bVar = this.f80645G;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("assistedFactory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("cas.service.header", new Object[0]);
    }
}
