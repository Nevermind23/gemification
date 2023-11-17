package p341ge.bog.mobilebank.p2p.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.res.C0808h;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import dw0.C31612a;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7546i;
import p202p0.C7556l;
import p202p0.C7589q;
import p202p0.C7594s;
import p341ge.bog.mobilebank.shared.P2PFlowType;
import ue1.C43064a;
import uv0.C39104a;
import uv0.C39106c;
import uv0.C39108e;
import yv0.C40076a;

/* renamed from: ge.bog.mobilebank.p2p.presentation.P2PActivity */
public final class P2PActivity extends C30772sa {

    /* renamed from: H */
    public static final C33486a f81720H = new C33486a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f81721F = C41219i.m119470b(new C33487b(this));

    /* renamed from: G */
    private final C41217g f81722G = C41219i.m119470b(new C33488c(this));

    /* renamed from: ge.bog.mobilebank.p2p.presentation.P2PActivity$a */
    public static final class C33486a {
        private C33486a() {
        }

        public /* synthetic */ C33486a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo79434a(Context context, P2PFlowType p2PFlowType) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(p2PFlowType, "p2pFlowType");
            Intent intent = new Intent(context, P2PActivity.class);
            intent.putExtra("P2P_FLOW_TYPE", p2PFlowType);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.P2PActivity$b */
    static final class C33487b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PActivity f81723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33487b(P2PActivity p2PActivity) {
            super(0);
            this.f81723d = p2PActivity;
        }

        /* renamed from: b */
        public final C40076a invoke() {
            return C40076a.m116109d(this.f81723d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.p2p.presentation.P2PActivity$c */
    static final class C33488c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PActivity f81724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33488c(P2PActivity p2PActivity) {
            super(0);
            this.f81724d = p2PActivity;
        }

        /* renamed from: b */
        public final P2PFlowType invoke() {
            return (P2PFlowType) this.f81724d.getIntent().getParcelableExtra("P2P_FLOW_TYPE");
        }
    }

    /* renamed from: F2 */
    private final C40076a m98303F2() {
        return (C40076a) this.f81721F.getValue();
    }

    /* renamed from: G2 */
    private final P2PFlowType m98304G2() {
        return (P2PFlowType) this.f81722G.getValue();
    }

    /* renamed from: H2 */
    private final void m98305H2() {
        Fragment j0 = getSupportFragmentManager().mo4415j0(C39106c.f93256q);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        ((NavHostFragment) j0).mo5009k1().mo22137p(new C31612a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m98306I2(P2PActivity p2PActivity, C7556l lVar, C7589q qVar, Bundle bundle) {
        C41536l.m120489i(p2PActivity, "this$0");
        C41536l.m120489i(lVar, "<anonymous parameter 0>");
        C41536l.m120489i(qVar, "dest");
        CharSequence x = qVar.mo22215x();
        if (x != null) {
            p2PActivity.mo86429X1(x.toString());
        }
    }

    /* renamed from: J2 */
    private final void m98307J2() {
        Fragment j0 = getSupportFragmentManager().mo4415j0(C39106c.f93256q);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) j0;
        C7594s b = navHostFragment.mo5009k1().mo22114F().mo22243b(C39108e.p2p_nav_graph);
        P2PFlowType G2 = m98304G2();
        if (G2 instanceof P2PFlowType.P2PSend) {
            b.mo22234T(C39106c.P2PSendFragment);
        } else if (G2 instanceof P2PFlowType.P2PTopUp) {
            b.mo22234T(C39106c.p2PTopUpFragment);
            C7546i.C7547a aVar = new C7546i.C7547a();
            P2PFlowType G22 = m98304G2();
            C41536l.m120487g(G22, "null cannot be cast to non-null type ge.bog.mobilebank.shared.P2PFlowType.P2PTopUp");
            b.mo22206b("P2P_TOP_UP_ACCT_NO", aVar.mo22092b(((P2PFlowType.P2PTopUp) G22).mo84158a()).mo22091a());
        } else {
            new UnsupportedOperationException("P2PFlowType not found");
        }
        navHostFragment.mo5009k1().mo22133k0(b, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m98303F2().mo3946b());
        super.mo37451O1(bundle);
        m98305H2();
        m98303F2().f95252f.f68494e.setBackgroundColor(C0808h.m3029d(getResources(), C39104a.f93244a, (Resources.Theme) null));
        m98307J2();
    }
}
