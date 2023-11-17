package p341ge.bog.sso_client.onboarding;

import ac1.C31008e;
import ah1.C40313a;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.core.content.res.C0808h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10210o;
import ba1.C10211p;
import ba1.C10212q;
import ba1.C10214s;
import ba1.C10215t;
import ba1.C10216u;
import ba1.C10218w;
import ba1.C10220y;
import bc1.C31162f;
import cc1.C31366g;
import ce1.C40397a;
import dd1.C40545k1;
import de1.C40640a;
import ed1.C40762x;
import ed1.C40763y;
import gb1.C32388r;
import gd1.C40992a;
import ha1.C15454a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ib1.C36375a0;
import ib1.C36378b0;
import ib1.C36381c0;
import ib1.C36382c1;
import ib1.C36425d;
import ib1.C36426d0;
import ib1.C36427d1;
import ib1.C36429e0;
import ib1.C36432f0;
import ib1.C36435g0;
import ib1.C36438h0;
import ib1.C36441i0;
import ib1.C36443j0;
import ib1.C36445k0;
import ib1.C36446l;
import ib1.C36447l0;
import ib1.C36448m;
import ib1.C36449m0;
import ib1.C36450n;
import ib1.C36451n0;
import ib1.C36452o;
import ib1.C36454p;
import ib1.C36456q;
import ib1.C36458r;
import ib1.C36460s;
import ib1.C36462t;
import ib1.C36464u;
import ib1.C36466v;
import ib1.C36468w;
import ib1.C36470x;
import ib1.C36472y;
import ib1.C36474z;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nb1.C37396j;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35952m;
import p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd;
import p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepStart;
import p341ge.bog.sso_client.onboarding.steps.phone.C36008m;
import p485kc.C16341a;
import p642vh.C18368l;
import pc1.C42137p;
import ra1.C27964c;
import sb1.C38466d;
import sso.type.ProcessFlow;
import ua1.C28633d;
import ub1.C39052c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43081r;
import ue1.C43082s;
import vb1.C39430i;
import wg1.C43241a;
import yg1.C43399a;
import zb1.C40231c;
import zb1.C40239d;

/* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity */
public final class OnBoardingActivity extends C15454a {

    /* renamed from: y */
    public static final C35969a f87024y = new C35969a((DefaultConstructorMarker) null);

    /* renamed from: s */
    private final C41217g f87025s = C41219i.m119470b(new C35970b(this));

    /* renamed from: t */
    private final C41217g f87026t = C41219i.m119469a(C41222k.NONE, new C35981m(this, (C41806a) null, (C43064a) null, new C35980l(this), (C43064a) null));

    /* renamed from: u */
    private final C41217g f87027u;

    /* renamed from: v */
    private final C41217g f87028v;

    /* renamed from: w */
    private C27964c f87029w;

    /* renamed from: x */
    private final C41217g f87030x;

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$a */
    public static final class C35969a {
        private C35969a() {
        }

        public /* synthetic */ C35969a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo88591a(Context context, boolean z) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, OnBoardingActivity.class);
            intent.putExtra("from_recover_password", z);
            return intent;
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$b */
    static final class C35970b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OnBoardingActivity f87031d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35970b(OnBoardingActivity onBoardingActivity) {
            super(0);
            this.f87031d = onBoardingActivity;
        }

        /* renamed from: b */
        public final C28633d invoke() {
            C28633d d = C28633d.m87629d(this.f87031d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$c */
    static final class C35971c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OnBoardingActivity f87032d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35971c(OnBoardingActivity onBoardingActivity) {
            super(0);
            this.f87032d = onBoardingActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f87032d.getIntent().getBooleanExtra("from_recover_password", false));
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$d */
    static final class C35972d extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ OnBoardingActivity f87033d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35972d(OnBoardingActivity onBoardingActivity) {
            super(2);
            this.f87033d = onBoardingActivity;
        }

        /* renamed from: a */
        public final Boolean mo88594a(boolean z, int i) {
            return Boolean.valueOf(this.f87033d.m107025A1().mo89141Ox(z, i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo88594a(((Boolean) obj).booleanValue(), ((Number) obj2).intValue());
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$e */
    static final class C35973e extends C41537m implements C43081r {

        /* renamed from: d */
        final /* synthetic */ OnBoardingActivity f87034d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35973e(OnBoardingActivity onBoardingActivity) {
            super(4);
            this.f87034d = onBoardingActivity;
        }

        /* renamed from: a */
        public final C40762x invoke(String str, List list, String str2, List list2) {
            C41536l.m120489i(str, "xUserAgent");
            return this.f87034d.m107025A1().mo89206yy(str, list, str2, list2);
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$f */
    /* synthetic */ class C35974f extends C41535k implements C43079p {
        C35974f(Object obj) {
            super(2, obj, C36382c1.class, "sendFaceTecError", "sendFaceTecError(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo88596b(String str, String str2) {
            C41536l.m120489i(str, "p0");
            C41536l.m120489i(str2, "p1");
            ((C36382c1) this.receiver).mo89191sy(str, str2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo88596b((String) obj, (String) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$g */
    /* synthetic */ class C35975g extends C41535k implements C43075l {
        C35975g(Object obj) {
            super(1, obj, C36382c1.class, "logFacetecActionStart", "logFacetecActionStart(Lge/bog/sso_client/onboarding/analytics/facetec/FacetecStepStart;)V", 0);
        }

        /* renamed from: b */
        public final void mo88597b(FacetecStepStart facetecStepStart) {
            C41536l.m120489i(facetecStepStart, "p0");
            ((C36382c1) this.receiver).mo89148Vx(facetecStepStart);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88597b((FacetecStepStart) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$h */
    /* synthetic */ class C35976h extends C41535k implements C43082s {
        C35976h(Object obj) {
            super(5, obj, C36382c1.class, "logFacetecStepFinish", "logFacetecStepFinish(Lge/bog/sso_client/onboarding/analytics/facetec/FacetecStepEnd;Lge/bog/sso_client/onboarding/AnalyticsConstants$ActionResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        /* renamed from: P0 */
        public /* bridge */ /* synthetic */ Object mo41133P0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            mo88598b((FacetecStepEnd) obj, (C36425d) obj2, (String) obj3, (String) obj4, (String) obj5);
            return C41238w.f97225a;
        }

        /* renamed from: b */
        public final void mo88598b(FacetecStepEnd facetecStepEnd, C36425d dVar, String str, String str2, String str3) {
            C41536l.m120489i(facetecStepEnd, "p0");
            C41536l.m120489i(dVar, "p1");
            ((C36382c1) this.receiver).mo89150Wx(facetecStepEnd, dVar, str, str2, str3);
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$i */
    static final class C35977i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OnBoardingActivity f87035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35977i(OnBoardingActivity onBoardingActivity) {
            super(0);
            this.f87035d = onBoardingActivity;
        }

        public final void invoke() {
            this.f87035d.m107025A1().mo89205yx().mo89130G6();
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$j */
    public static final class C35978j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f87036d;

        /* renamed from: e */
        final /* synthetic */ C41806a f87037e;

        /* renamed from: f */
        final /* synthetic */ C43064a f87038f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35978j(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f87036d = componentCallbacks;
            this.f87037e = aVar;
            this.f87038f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f87036d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C40545k1.class), this.f87037e, this.f87038f);
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$k */
    public static final class C35979k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f87039d;

        /* renamed from: e */
        final /* synthetic */ C41806a f87040e;

        /* renamed from: f */
        final /* synthetic */ C43064a f87041f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35979k(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f87039d = componentCallbacks;
            this.f87040e = aVar;
            this.f87041f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f87039d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f87040e, this.f87041f);
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$l */
    public static final class C35980l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f87042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35980l(ComponentActivity componentActivity) {
            super(0);
            this.f87042d = componentActivity;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            ComponentActivity componentActivity = this.f87042d;
            return aVar.mo102076a(componentActivity, componentActivity);
        }
    }

    /* renamed from: ge.bog.sso_client.onboarding.OnBoardingActivity$m */
    public static final class C35981m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f87043d;

        /* renamed from: e */
        final /* synthetic */ C41806a f87044e;

        /* renamed from: f */
        final /* synthetic */ C43064a f87045f;

        /* renamed from: g */
        final /* synthetic */ C43064a f87046g;

        /* renamed from: h */
        final /* synthetic */ C43064a f87047h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35981m(ComponentActivity componentActivity, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f87043d = componentActivity;
            this.f87044e = aVar;
            this.f87045f = aVar2;
            this.f87046g = aVar3;
            this.f87047h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40313a.m116748a(this.f87043d, this.f87044e, this.f87045f, this.f87046g, C41520a0.m120436b(C36382c1.class), this.f87047h);
        }
    }

    public OnBoardingActivity() {
        super(0, 1, (DefaultConstructorMarker) null);
        C41222k kVar = C41222k.SYNCHRONIZED;
        this.f87027u = C41219i.m119469a(kVar, new C35978j(this, (C41806a) null, (C43064a) null));
        this.f87028v = C41219i.m119469a(kVar, new C35979k(this, (C41806a) null, (C43064a) null));
        this.f87030x = C41219i.m119470b(new C35971c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final C36382c1 m107025A1() {
        return (C36382c1) this.f87026t.getValue();
    }

    /* renamed from: B1 */
    private final void m107026B1() {
        m107025A1().mo89144Rc().mo89262e().mo89254m().mo4819k(this, new C36441i0(this));
        m107025A1().mo89144Rc().mo89262e().mo89253l().mo4819k(this, new C36447l0(this));
        m107025A1().mo89144Rc().mo89262e().mo89249h().mo4819k(this, new C36449m0(this));
        m107025A1().mo89144Rc().mo89262e().mo89252k().mo4819k(this, new C36448m(this));
        m107025A1().mo89144Rc().mo89262e().mo89250i().mo4819k(this, new C36450n(this));
        m107025A1().mo89144Rc().mo89262e().mo89247f().mo4819k(this, new C36452o(this));
        m107025A1().mo89144Rc().mo89262e().mo89248g().mo4819k(this, new C36454p(this));
        m107025A1().mo89144Rc().mo89262e().mo89256o().mo4819k(this, new C36456q(this));
        m107025A1().mo89144Rc().mo89262e().mo89255n().mo4819k(this, new C36458r(this));
        m107025A1().mo89144Rc().mo89262e().mo89246e().mo4819k(this, new C36460s(this));
        m107025A1().mo89144Rc().mo89262e().mo89251j().mo4819k(this, new C36443j0(this));
        m107025A1().mo89200wb().mo4819k(this, new C36445k0(this));
        m107025A1().mo89144Rc().mo89272p();
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m107027C1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C31162f.f77418h.mo71370a(onBoardingActivity.m107094y1()));
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m107028D1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C36008m.C36009a.m107185b(C36008m.f87108h, false, 1, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m107029E1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C36008m.f87108h.mo88718a(true));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m107030F1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C31008e.f77163j.mo71211a());
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m107031G1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C39430i.f93632g.mo93050a());
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m107032H1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C38466d.C38467a.m112916b(C38466d.f92127j, false, 1, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m107033I1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C38466d.f92127j.mo92026a(false));
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m107034J1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C31366g.f77909g.mo71749a());
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m107035K1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C42137p.C42138a.m122392b(C42137p.f99091k, false, 1, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m107036L1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C37396j.f89917h.mo90486a());
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m107037M1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107039O1(C40231c.f95610h.mo94184a());
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m107038N1(OnBoardingActivity onBoardingActivity, C35947l lVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            onBoardingActivity.m107025A1().mo89199vy((String) ((C35947l.C35951d) lVar).mo88520a());
        } else if (lVar instanceof C35947l.C35949b) {
            onBoardingActivity.m107025A1().mo89172ky(((C35947l.C35949b) lVar).mo88517a().getMessage());
        }
    }

    /* renamed from: O1 */
    private final void m107039O1(Fragment fragment) {
        getSupportFragmentManager().mo4428p().mo4642u(C10210o.f28261d, C10210o.fade_out, C10210o.fade_in, C10210o.f28262e).mo4639r(m107093x1().f72696e.getId(), fragment).mo4636g((String) null).mo4515i();
    }

    /* renamed from: P1 */
    private final Map m107040P1(Map map, C10195g0 g0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C41342q0.m119921f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), g0Var.mo26763a((String) entry.getValue(), new Object[0]));
        }
        return linkedHashMap;
    }

    /* renamed from: Q0 */
    private final C10146d0.C10172e m107041Q0() {
        return (C10146d0.C10172e) this.f87028v.getValue();
    }

    /* renamed from: Q1 */
    private final void m107042Q1() {
        C36427d1 Ax = m107025A1().mo89123Ax();
        mo42539S0(m107025A1().mo89207zx());
        Ax.mo89153Yf().mo4819k(this, new C36462t(this));
        Ax.mo89128De().mo4819k(this, new C36464u(this));
        Ax.mo89125Bs().mo4819k(this, new C36466v(this));
        Ax.mo89132Hi().mo4819k(this, new C36470x(this, this));
        Ax.mo89158d4().mo4819k(this, new C36472y(this));
        Ax.mo89140Mf().mo4819k(this, new C36474z(this));
        Ax.mo89144Rc().mo89262e().mo89257p().mo4819k(this, new C36375a0(this));
        Ax.mo89175mg().mo4819k(this, new C36378b0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m107043R1(OnBoardingActivity onBoardingActivity, C35947l lVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            onBoardingActivity.m107065d2((C35947l.C35951d) lVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m107044S1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.setResult(103, (Intent) null);
        onBoardingActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m107046T1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        boolean z;
        C41536l.m120489i(onBoardingActivity, "this$0");
        if (C10146d0.C10176g.m37222c().mo88492a() == ProcessFlow.REGISTER_NEW_CLIENT) {
            z = true;
        } else {
            z = false;
        }
        onBoardingActivity.m107071g2(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m107048U1(OnBoardingActivity onBoardingActivity, OnBoardingActivity onBoardingActivity2, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        C41536l.m120489i(onBoardingActivity2, "$owner");
        onBoardingActivity.m107067e2();
        onBoardingActivity.startActivity(C16341a.f46171a.mo43317e(onBoardingActivity2));
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m107050V1(OnBoardingActivity onBoardingActivity, C41238w wVar) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m107052W1(OnBoardingActivity onBoardingActivity, Boolean bool) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        ToolbarView toolbarView = onBoardingActivity.m107093x1().f72697f;
        C41536l.m120488h(bool, "it");
        toolbarView.setNavigationEnabled(bool.booleanValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public static final void m107054X1(OnBoardingActivity onBoardingActivity, Boolean bool) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        C41536l.m120488h(bool, "isNewUser");
        if (bool.booleanValue()) {
            onBoardingActivity.m107093x1().f72697f.setTitle(onBoardingActivity.getString(C10220y.onboarding_register));
        } else {
            onBoardingActivity.m107093x1().f72697f.setTitle(onBoardingActivity.getString(C10220y.pass_recovery_title));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public static final void m107056Y1(Intent intent, C40763y yVar) {
        C41536l.m120489i(yVar, "emitter");
        if (intent != null) {
            yVar.mo95093a(intent);
        } else {
            yVar.onError(new Throwable());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z1 */
    public static final void m107057Z1(OnBoardingActivity onBoardingActivity, Intent intent) {
        Boolean bool;
        String str;
        String str2;
        C41536l.m120489i(onBoardingActivity, "this$0");
        C36382c1 A1 = onBoardingActivity.m107025A1();
        C41536l.m120488h(intent, "it");
        C27964c cVar = onBoardingActivity.f87029w;
        if (cVar != null) {
            bool = Boolean.valueOf(cVar.mo67542g());
        } else {
            bool = null;
        }
        C27964c cVar2 = onBoardingActivity.f87029w;
        if (cVar2 != null) {
            str = cVar2.mo67540e();
        } else {
            str = null;
        }
        C27964c cVar3 = onBoardingActivity.f87029w;
        if (cVar3 != null) {
            str2 = cVar3.mo67541f();
        } else {
            str2 = null;
        }
        A1.mo89157ay(intent, bool, str, str2);
        onBoardingActivity.f87029w = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m107059a2(OnBoardingActivity onBoardingActivity, Throwable th) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.m107025A1().mo89172ky((String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final boolean m107061b2(OnBoardingActivity onBoardingActivity, MenuItem menuItem) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        if (menuItem.getItemId() != C10216u.f28308V) {
            return true;
        }
        new C39052c().mo92744e(onBoardingActivity, onBoardingActivity.m107041Q0()).mo4576A1(onBoardingActivity.getSupportFragmentManager(), (String) null);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m107063c2(OnBoardingActivity onBoardingActivity, View view) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        onBoardingActivity.onBackPressed();
    }

    /* renamed from: d2 */
    private final void m107065d2(C35947l.C35951d dVar) {
        this.f87029w = new C27964c((String) ((C41224m) dVar.mo88520a()).mo95678e(), (String) ((C41224m) dVar.mo88520a()).mo95680f(), this, mo42537P0(), new C35972d(this), C36382c1.f87772u0.mo89209a(m107095z1()), new C35973e(this), new C35974f(m107025A1()), new C35975g(m107025A1()), new C35976h(m107025A1()), mo42538R0());
    }

    /* renamed from: e2 */
    private final void m107067e2() {
        Map map;
        int i = C10211p.f28266e;
        int d = C18368l.m62755d(this, i);
        if (d == 0) {
            d = C18368l.m62755d(this, i);
        }
        Typeface h = C0808h.m3033h(this, C10215t.f28286b);
        Typeface h2 = C0808h.m3033h(this, C10215t.f28287c);
        C16341a aVar = C16341a.f46171a;
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(d & 16777215)}, 1));
        C41536l.m120488h(format, "format(format, *args)");
        aVar.mo43322j(C41342q0.m119922g(C41233s.m119492a("primary_button", format)));
        aVar.mo43324l(C41344r0.m119931m(C41233s.m119492a("scan_retry_icon", Integer.valueOf(C10214s.illustration_document_scan)), C41233s.m119492a("button_corner_radius", 16), C41233s.m119492a("head1_font", h), C41233s.m119492a("head2_font", h), C41233s.m119492a("body_font", h2), C41233s.m119492a("head1_font_size", 20), C41233s.m119492a("head2_font_size", 15), C41233s.m119492a("body_font_size", 13)));
        if (m107041Q0().mo26716g() == null) {
            map = C40239d.f95625a.mo94191a();
        } else {
            Map b = C40239d.f95625a.mo94192b();
            C10195g0 g = m107041Q0().mo26716g();
            C41536l.m120486f(g);
            map = m107040P1(b, g);
        }
        String lowerCase = C35952m.EN.mo88523b().toLowerCase();
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase()");
        String lowerCase2 = C35952m.KA.mo88523b().toLowerCase();
        C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase()");
        aVar.mo43325m(C41344r0.m119931m(C41233s.m119492a(lowerCase, map), C41233s.m119492a(lowerCase2, map)));
        aVar.mo43321i(new C35977i(this));
    }

    /* renamed from: f2 */
    private final void m107069f2() {
        if (m107094y1()) {
            m107093x1().f72697f.setTitle(getString(C10220y.pass_recovery_title));
        } else {
            m107093x1().f72697f.setTitle(getString(C10220y.onboarding_register));
        }
    }

    /* renamed from: g2 */
    private final void m107071g2(boolean z) {
        if (z) {
            C13310d c = new C39052c().mo92742c(C13310d.C13312b.TITLE_ICON_SINGLE_BUTTON, getString(C10220y.onboarding_finish_dialog_title), getString(C10220y.onboarding_finish_dialog_desc), Integer.valueOf(C10214s.icons_48_system_check), Integer.valueOf(C10212q.f28272f), C10145d.m37089c("user.credentials.success.button", m107041Q0()), (String) null);
            c.mo35643V1(new C36381c0(this, c));
            c.mo4576A1(getSupportFragmentManager(), (String) null);
            return;
        }
        C13310d c2 = new C39052c().mo92742c(C13310d.C13312b.TITLE_ICON_SINGLE_BUTTON, getString(C10220y.onboarding_recovery_title), getString(C10220y.onboarding_recovery_desc), Integer.valueOf(C10214s.icons_48_system_check), Integer.valueOf(C10212q.f28272f), C10145d.m37089c("user.credentials.success.button", m107041Q0()), (String) null);
        c2.mo35643V1(new C36426d0(this, c2));
        c2.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m107073h2(OnBoardingActivity onBoardingActivity, C13310d dVar, Button button) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        C41536l.m120489i(dVar, "$dialog");
        C41536l.m120489i(button, "it");
        onBoardingActivity.setResult(105, (Intent) null);
        dVar.mo4577k1();
        onBoardingActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m107075i2(OnBoardingActivity onBoardingActivity, C13310d dVar, Button button) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        C41536l.m120489i(dVar, "$dialog");
        C41536l.m120489i(button, "it");
        onBoardingActivity.setResult(105, (Intent) null);
        dVar.mo4577k1();
        onBoardingActivity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m107077j2(String str) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_SINGLE_BUTTON);
        dVar.mo35637O1(Integer.valueOf(C10214s.icons_48_general_id_outline));
        dVar.mo35638P1(Integer.valueOf(C10212q.f28269c));
        dVar.mo4586v1(false);
        C36451n0 n0Var = C36451n0.f87935a;
        String k2 = m107079k2(this, "text.do.fatca.popup.title", new Object[0]);
        if (k2 == null) {
            k2 = "მადლობა რეგისტრაციისთვის";
        }
        dVar.mo35648c2(k2);
        String k22 = m107079k2(this, "text.do.fatca.popup.message", str);
        if (k22 == null) {
            k22 = "დაგიკავშირდებით " + str + " მეილზე არ იდარდო";
        }
        dVar.mo35639Q1(k22);
        String k23 = m107079k2(this, "text.do.fatca.popup.button", new Object[0]);
        if (k23 == null) {
            k23 = "OK";
        }
        dVar.mo35644X1(k23);
        dVar.mo35643V1(new C36429e0(this));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: k2 */
    private static final String m107079k2(OnBoardingActivity onBoardingActivity, String str, Object... objArr) {
        C10195g0 g = onBoardingActivity.m107041Q0().mo26716g();
        if (g != null) {
            return g.mo26763a(str, Arrays.copyOf(objArr, objArr.length));
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m107081l2(OnBoardingActivity onBoardingActivity, Button button) {
        C41536l.m120489i(onBoardingActivity, "this$0");
        C41536l.m120489i(button, "it");
        onBoardingActivity.finish();
    }

    /* renamed from: x1 */
    private final C28633d m107093x1() {
        return (C28633d) this.f87025s.getValue();
    }

    /* renamed from: y1 */
    private final boolean m107094y1() {
        return ((Boolean) this.f87030x.getValue()).booleanValue();
    }

    /* renamed from: z1 */
    private final C40545k1 m107095z1() {
        return (C40545k1) this.f87027u.getValue();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C41205b I = C40762x.m118157e(new C36432f0(intent)).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95070I(new C36435g0(this), new C36438h0(this));
        C41536l.m120488h(I, "create { emitter: Single…          }\n            )");
        C40397a.m116967a(I, new C41204a());
    }

    public void onBackPressed() {
        if (m107093x1().f72697f.getNavigationEnabled()) {
            C32388r c = m107025A1().mo89144Rc().mo89262e().mo89244c();
            if (c != null) {
                C32388r.m95638f(c, false, 1, (Object) null);
            }
            super.onBackPressed();
        } else {
            new C39052c().mo92744e(this, m107041Q0()).mo4576A1(getSupportFragmentManager(), (String) null);
        }
        Object systemService = getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(m107093x1().mo3946b().getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) m107093x1().mo3946b());
        getWindow().setStatusBarColor(C18368l.m62755d(this, C10211p.f28263a));
        ToolbarView toolbarView = m107093x1().f72697f;
        toolbarView.mo1887x(C10218w.close_action_menu);
        toolbarView.setOnMenuItemClickListener(new C36446l(this));
        toolbarView.setNavigationOnClickListener(new C36468w(this));
        m107025A1().mo89152Y4();
        m107042Q1();
        m107026B1();
        m107069f2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C10146d0.C10176g.m37231l(false);
        super.onDestroy();
    }
}
