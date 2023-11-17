package p341ge.bog.mobilebank.deposits.presentation.prolongation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.navigation.fragment.NavHostFragment;
import b41.C31128a;
import b41.C31132b;
import g91.C32319m;
import g91.C32343x;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ic0.C25161a;
import ic0.C25168f;
import ic0.C25170h;
import ic0.C25175m;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o31.C37613p;
import p163m0.C7047a;
import p202p0.C7556l;
import p202p0.C7594s;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragmentArgs;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.result.DepositProlongationResultFragmentArgs;
import p615tg.C17959a;
import py0.C38048b;
import rb0.C27985d;
import rb0.C27987f;
import rb0.C27988g;
import ue1.C43064a;
import ue1.C43075l;
import xb0.C29721i;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity */
public final class DepositProlongationActivity extends C23245a {

    /* renamed from: K */
    public static final C23234a f60824K = new C23234a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private C29721i f60825G;

    /* renamed from: H */
    private final C41217g f60826H = C41219i.m119470b(new C23235b(this));

    /* renamed from: I */
    public C25170h f60827I;

    /* renamed from: J */
    private final C41217g f60828J = new C1617p0(C41520a0.m120436b(C25175m.class), new C23240g(this), new C23242i(this), new C23241h((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$a */
    public static final class C23234a {
        private C23234a() {
        }

        public /* synthetic */ C23234a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo58117a(Context context, DepositProlongationActivityArgs depositProlongationActivityArgs) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(depositProlongationActivityArgs, "args");
            context.startActivity(C37613p.m110614a(new Intent(context, DepositProlongationActivity.class), C41233s.m119492a("ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity.ARGS_KEY", depositProlongationActivityArgs)));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$b */
    static final class C23235b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationActivity f60829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23235b(DepositProlongationActivity depositProlongationActivity) {
            super(0);
            this.f60829d = depositProlongationActivity;
        }

        /* renamed from: b */
        public final DepositProlongationActivityArgs invoke() {
            DepositProlongationActivityArgs depositProlongationActivityArgs = (DepositProlongationActivityArgs) this.f60829d.getIntent().getParcelableExtra("ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity.ARGS_KEY");
            if (depositProlongationActivityArgs != null) {
                return depositProlongationActivityArgs;
            }
            throw new NullPointerException("arguments cannot be null");
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$c */
    /* synthetic */ class C23236c extends C41535k implements C43075l {
        C23236c(Object obj) {
            super(1, obj, DepositProlongationActivity.class, "onProlongationDetailsResult", "onProlongationDetailsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo58119b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositProlongationActivity) this.receiver).m75058T2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58119b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$d */
    static final class C23237d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationActivity f60830d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23237d(DepositProlongationActivity depositProlongationActivity) {
            super(1);
            this.f60830d = depositProlongationActivity;
        }

        /* renamed from: a */
        public final void mo58120a(C38048b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f60830d.m75057S2(false);
            this.f60830d.m75059U2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58120a((C38048b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$e */
    static final class C23238e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationActivity f60831d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23238e(DepositProlongationActivity depositProlongationActivity) {
            super(1);
            this.f60831d = depositProlongationActivity;
        }

        /* renamed from: a */
        public final void mo58121a(C38048b bVar) {
            this.f60831d.m75057S2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo58121a((C38048b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$f */
    static final class C23239f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationActivity f60832d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23239f(DepositProlongationActivity depositProlongationActivity) {
            super(1);
            this.f60832d = depositProlongationActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f60832d.m75056R2(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$g */
    public static final class C23240g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60833d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23240g(ComponentActivity componentActivity) {
            super(0);
            this.f60833d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60833d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$h */
    public static final class C23241h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60834d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60835e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23241h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60834d = aVar;
            this.f60835e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60834d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60835e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$i */
    static final class C23242i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositProlongationActivity f60836d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.DepositProlongationActivity$i$a */
        static final class C23243a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DepositProlongationActivity f60837d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23243a(DepositProlongationActivity depositProlongationActivity) {
                super(0);
                this.f60837d = depositProlongationActivity;
            }

            /* renamed from: b */
            public final C25175m invoke() {
                return this.f60837d.mo58116O2().mo32556a(this.f60837d.m75052M2().mo58124a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23242i(DepositProlongationActivity depositProlongationActivity) {
            super(0);
            this.f60836d = depositProlongationActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C23243a(this.f60836d));
        }
    }

    /* renamed from: K2 */
    private final C41224m m75050K2(C38048b bVar) {
        Object obj;
        int i;
        int i2;
        if (m75052M2().mo58125b() == C25168f.DONT_WANT_TO_RENEW) {
            long t = C32319m.m95313t(System.currentTimeMillis(), bVar.mo91437m());
            i2 = C27988g.deposit_prolongation_result_fragment_args_key;
            i = C27985d.deposit_prolongation_result;
            obj = new DepositProlongationResultFragmentArgs(C32343x.m95388F("deposit.prolong.success.close", Long.valueOf(t)), C32343x.m95388F("deposit.prolong.success.choose.offer", new Object[0]), m75051L2(bVar));
        } else {
            i2 = C27988g.deposit_prolongation_fragment_args_key;
            i = C27985d.deposit_prolongation_main;
            C25168f b = m75052M2().mo58125b();
            long a = m75052M2().mo58124a();
            String f = bVar.mo91429f();
            long t2 = bVar.mo91444t();
            long c = bVar.mo91425c();
            double e = bVar.mo91427e();
            double o = bVar.mo91439o();
            double n = bVar.mo91438n();
            double j = bVar.mo91434j();
            double k = bVar.mo91435k();
            double l = bVar.mo91436l();
            String r = bVar.mo91442r();
            String i3 = bVar.mo91433i();
            String v = bVar.mo91447v();
            obj = new DepositProlongationMainFragmentArgs(b, a, f, t2, c, e, o, n, j, k, l, bVar.mo91446u(), bVar.mo91441q(), r, i3, v, bVar.mo91437m(), bVar.mo91440p(), bVar.mo91443s(), bVar.mo91426d(), bVar.mo91430g(), bVar.mo91431h());
        }
        return C41233s.m119492a(C0908e.m3336b(C41233s.m119492a(getString(i2), obj)), Integer.valueOf(i));
    }

    /* renamed from: L2 */
    private final LinkedHashMap m75051L2(C38048b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(C32343x.m95388F("deposit.prolong.success.deposit.details.amount", new Object[0]), C17959a.m61877a(C17959a.m61879c(bVar.mo91427e(), bVar.mo91429f())));
        linkedHashMap.put(C32343x.m95388F("deposit.prolong.success.deposit.details.accrued.interest", new Object[0]), C17959a.m61877a(C17959a.m61879c(bVar.mo91434j(), bVar.mo91429f())));
        String F = C32343x.m95388F("deposit.prolong.success.deposit.details.effective", new Object[0]);
        double k = bVar.mo91435k();
        linkedHashMap.put(F, k + " %");
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final DepositProlongationActivityArgs m75052M2() {
        return (DepositProlongationActivityArgs) this.f60826H.getValue();
    }

    /* renamed from: N2 */
    private final C29721i m75053N2() {
        C29721i iVar = this.f60825G;
        C41536l.m120486f(iVar);
        return iVar;
    }

    /* renamed from: P2 */
    private final C25175m m75054P2() {
        return (C25175m) this.f60828J.getValue();
    }

    /* renamed from: Q2 */
    private final void m75055Q2() {
        C37224b.m109963b(m75054P2().mo63713lw().mo63711Tt(), this, new C23236c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m75056R2(Throwable th) {
        m75057S2(false);
        mo74709H1(th);
        CardView cardView = m75053N2().f75079h;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95447f1(cardView);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m75057S2(boolean z) {
        FrameLayout frameLayout = m75053N2().f75077f;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m75058T2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C23237d(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C23238e(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C23239f(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m75059U2(C38048b bVar) {
        C41224m K2 = m75050K2(bVar);
        int intValue = ((Number) K2.mo95676b()).intValue();
        Fragment j0 = getSupportFragmentManager().mo4415j0(C27985d.f71252B0);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C7556l k1 = ((NavHostFragment) j0).mo5009k1();
        C7594s b = k1.mo22114F().mo22243b(C27987f.deposit_prolongation_nav_graph);
        b.mo22234T(intValue);
        k1.mo22133k0(b, (Bundle) K2.mo95675a());
    }

    /* renamed from: V2 */
    private final void m75060V2() {
        mo86429X1(C32343x.m95388F("deposit.prolong.actionsheet.header", new Object[0]));
        m75053N2().f75078g.mo3946b().setOnClickListener(new C25161a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m75061W2(DepositProlongationActivity depositProlongationActivity, View view) {
        C41536l.m120489i(depositProlongationActivity, "this$0");
        depositProlongationActivity.m75054P2().onRefresh(6);
        CardView cardView = depositProlongationActivity.m75053N2().f75079h;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        this.f60825G = C29721i.m90251d(getLayoutInflater());
        super.mo70996D2(bundle, m75053N2());
        m75060V2();
        m75055Q2();
    }

    /* renamed from: O2 */
    public final C25170h mo58116O2() {
        C25170h hVar = this.f60827I;
        if (hVar != null) {
            return hVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f60825G = null;
        super.onDestroy();
    }
}
