package qc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.C0152h;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10199i;
import ba1.C10205l;
import ba1.C10210o;
import ba1.C10220y;
import ce1.C40397a;
import dc1.C31559e;
import ed1.C40736c;
import fh1.C40951a;
import gb1.C32386q;
import gb1.C32392v;
import gd1.C40992a;
import gh1.C41125a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p060e1.C5905g;
import p060e1.C5958l0;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.sso_client.choose_company.ChooseCompanyActivity;
import p341ge.bog.sso_client.choose_company.CompaniesArguments;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35952m;
import p341ge.bog.sso_client.models.UserContact;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.onboarding.OnBoardingActivity;
import p341ge.bog.sso_client.onetimepassword.OneTimePasswordFragmentDialog;
import p341ge.bog.sso_client.passwordrecovery.PasswordRecoveryActivity;
import p341ge.bog.sso_client.signin.SignInActivity;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p420fh.C12902d;
import rc1.C42357b;
import sc1.C42394f;
import sso.type.StrongAuthMethod;
import tc1.C42930e;
import ua1.C28690w0;
import uc1.C43041g;
import uc1.C43055l;
import ue1.C43064a;
import vc1.C43114f;
import wc1.C43175e;
import wg1.C43241a;
import xc1.C43250e;
import yc1.C43337c;
import yc1.C43348i;
import yg1.C43399a;
import zc1.C43408e;

/* renamed from: qc1.e0 */
public final class C42216e0 extends Fragment implements C31559e {

    /* renamed from: q */
    public static final C42217a f99324q = new C42217a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f99325d = C41219i.m119469a(C41222k.NONE, new C42231n(this, (C41806a) null, (C43064a) null, new C42230m(this), (C43064a) null));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C28690w0 f99326e;

    /* renamed from: f */
    private final C41217g f99327f;

    /* renamed from: g */
    private final C41204a f99328g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1639v f99329h;

    /* renamed from: i */
    private final HashSet f99330i;

    /* renamed from: j */
    private final C41217g f99331j;

    /* renamed from: k */
    private final C41217g f99332k;

    /* renamed from: l */
    private boolean f99333l;

    /* renamed from: m */
    private WindowInsets f99334m;

    /* renamed from: n */
    private final C41217g f99335n;

    /* renamed from: o */
    private int f99336o;

    /* renamed from: p */
    private String f99337p;

    /* renamed from: qc1.e0$a */
    public static final class C42217a {
        private C42217a() {
        }

        public /* synthetic */ C42217a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C42216e0 mo97698a() {
            return new C42216e0();
        }
    }

    /* renamed from: qc1.e0$b */
    public /* synthetic */ class C42218b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f99338a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f99339b;

        static {
            int[] iArr = new int[C35952m.values().length];
            iArr[C35952m.KA.ordinal()] = 1;
            iArr[C35952m.EN.ordinal()] = 2;
            iArr[C35952m.TR.ordinal()] = 3;
            f99338a = iArr;
            int[] iArr2 = new int[C10146d0.C10172e.C10174b.values().length];
            iArr2[C10146d0.C10172e.C10174b.WINDOWED.ordinal()] = 1;
            iArr2[C10146d0.C10172e.C10174b.FULL_SCREEN.ordinal()] = 2;
            f99339b = iArr2;
        }
    }

    /* renamed from: qc1.e0$c */
    static final class C42219c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42216e0 f99340d;

        /* renamed from: e */
        final /* synthetic */ Fragment f99341e;

        /* renamed from: f */
        final /* synthetic */ Animation f99342f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42219c(C42216e0 e0Var, Fragment fragment, Animation animation) {
            super(0);
            this.f99340d = e0Var;
            this.f99341e = fragment;
            this.f99342f = animation;
        }

        public final void invoke() {
            this.f99340d.m122618Y1(this.f99341e);
            C28690w0 M1 = this.f99340d.f99326e;
            if (M1 == null) {
                C41536l.m120506z("binding");
                M1 = null;
            }
            M1.f73031j.startAnimation(this.f99342f);
        }
    }

    /* renamed from: qc1.e0$d */
    static final class C42220d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42216e0 f99343d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42220d(C42216e0 e0Var) {
            super(0);
            this.f99343d = e0Var;
        }

        public final void invoke() {
            C28690w0 M1 = this.f99343d.f99326e;
            if (M1 == null) {
                C41536l.m120506z("binding");
                M1 = null;
            }
            M1.f73031j.setAlpha(1.0f);
        }
    }

    /* renamed from: qc1.e0$e */
    static final class C42221e extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C42221e f99344d = new C42221e();

        /* renamed from: qc1.e0$e$a */
        public static final class C42222a implements C41125a {

            /* renamed from: a */
            private final Object f99345a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

            /* renamed from: a */
            public C40951a mo26679a() {
                return C41125a.C41126a.m119226a(this);
            }

            /* renamed from: b */
            public final Object mo97699b() {
                return this.f99345a;
            }
        }

        C42221e() {
            super(0);
        }

        public final String invoke() {
            return ((C10146d0.C10172e) new C42222a().mo97699b()).mo26726q().mo92939a();
        }
    }

    /* renamed from: qc1.e0$f */
    static final class C42223f implements C1645y {

        /* renamed from: a */
        final /* synthetic */ C42216e0 f99346a;

        C42223f(C42216e0 e0Var) {
            this.f99346a = e0Var;
        }

        public final void onChanged(Object obj) {
            if (obj instanceof C35947l.C35949b) {
                this.f99346a.f99329h.mo4823o(((C35947l.C35949b) obj).mo88517a());
            }
        }
    }

    /* renamed from: qc1.e0$g */
    public static final class C42224g implements C41125a {

        /* renamed from: a */
        private final Object f99347a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo97700b() {
            return this.f99347a;
        }
    }

    /* renamed from: qc1.e0$h */
    static final class C42225h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42216e0 f99348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42225h(C42216e0 e0Var) {
            super(0);
            this.f99348d = e0Var;
        }

        public final void invoke() {
            C42216e0 e0Var = this.f99348d;
            C43114f fVar = new C43114f();
            String string = this.f99348d.getString(C10220y.sso_sign_in_auth_secondary_title);
            C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
            e0Var.m122605L2(fVar, string);
        }
    }

    /* renamed from: qc1.e0$i */
    public static final class C42226i extends C0152h {

        /* renamed from: d */
        final /* synthetic */ C42216e0 f99349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42226i(C42216e0 e0Var) {
            super(true);
            this.f99349d = e0Var;
        }

        /* renamed from: b */
        public void mo361b() {
            C42357b l = this.f99349d.mo97693V1().mo97718Iw().mo32134f().mo32173l();
            this.f99349d.getChildFragmentManager().mo4409g1();
            if (l == null && mo362c()) {
                mo365f(false);
                this.f99349d.requireActivity().onBackPressed();
            }
        }
    }

    /* renamed from: qc1.e0$j */
    public static final class C42227j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f99350d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99351e;

        /* renamed from: f */
        final /* synthetic */ C43064a f99352f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42227j(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f99350d = componentCallbacks;
            this.f99351e = aVar;
            this.f99352f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f99350d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f99351e, this.f99352f);
        }
    }

    /* renamed from: qc1.e0$k */
    public static final class C42228k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f99353d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99354e;

        /* renamed from: f */
        final /* synthetic */ C43064a f99355f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42228k(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f99353d = componentCallbacks;
            this.f99354e = aVar;
            this.f99355f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f99353d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10199i.class), this.f99354e, this.f99355f);
        }
    }

    /* renamed from: qc1.e0$l */
    public static final class C42229l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f99356d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99357e;

        /* renamed from: f */
        final /* synthetic */ C43064a f99358f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42229l(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f99356d = componentCallbacks;
            this.f99357e = aVar;
            this.f99358f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f99356d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10205l.class), this.f99357e, this.f99358f);
        }
    }

    /* renamed from: qc1.e0$m */
    public static final class C42230m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f99359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42230m(Fragment fragment) {
            super(0);
            this.f99359d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f99359d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f99359d.requireActivity());
        }
    }

    /* renamed from: qc1.e0$n */
    public static final class C42231n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f99360d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99361e;

        /* renamed from: f */
        final /* synthetic */ C43064a f99362f;

        /* renamed from: g */
        final /* synthetic */ C43064a f99363g;

        /* renamed from: h */
        final /* synthetic */ C43064a f99364h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42231n(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f99360d = fragment;
            this.f99361e = aVar;
            this.f99362f = aVar2;
            this.f99363g = aVar3;
            this.f99364h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f99360d, this.f99361e, this.f99362f, this.f99363g, C41520a0.m120436b(C42253o0.class), this.f99364h);
        }
    }

    /* renamed from: qc1.e0$o */
    static final class C42232o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42216e0 f99365d;

        /* renamed from: e */
        final /* synthetic */ Fragment f99366e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42232o(C42216e0 e0Var, Fragment fragment) {
            super(0);
            this.f99365d = e0Var;
            this.f99366e = fragment;
        }

        public final void invoke() {
            this.f99365d.m122618Y1(this.f99366e);
        }
    }

    /* renamed from: qc1.e0$p */
    public static final class C42233p implements Animation.AnimationListener {

        /* renamed from: d */
        final /* synthetic */ C43064a f99367d;

        /* renamed from: e */
        final /* synthetic */ C43064a f99368e;

        C42233p(C43064a aVar, C43064a aVar2) {
            this.f99367d = aVar;
            this.f99368e = aVar2;
        }

        public void onAnimationEnd(Animation animation) {
            C43064a aVar = this.f99368e;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            C43064a aVar = this.f99367d;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public C42216e0() {
        C41222k kVar = C41222k.SYNCHRONIZED;
        this.f99327f = C41219i.m119469a(kVar, new C42227j(this, (C41806a) null, (C43064a) null));
        this.f99328g = new C41204a();
        this.f99329h = new C32386q();
        this.f99330i = new HashSet();
        this.f99331j = C41219i.m119469a(kVar, new C42228k(this, (C41806a) null, (C43064a) null));
        this.f99332k = C41219i.m119469a(kVar, new C42229l(this, (C41806a) null, (C43064a) null));
        this.f99335n = C41219i.m119470b(C42221e.f99344d);
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m122584A2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C43408e eVar = new C43408e();
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(eVar, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m122586B2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C43250e eVar = new C43250e();
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(eVar, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public static final void m122588C2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C42253o0.m122698rx(e0Var.mo97693V1(), (UserContact) null, new C42225h(e0Var), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m122590D2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C42930e eVar = new C42930e();
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(eVar, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m122592E2(C42216e0 e0Var, Boolean bool) {
        C41536l.m120489i(e0Var, "this$0");
        C43175e.C43176a aVar = C43175e.f100711h;
        C41536l.m120488h(bool, "it");
        C43175e a = aVar.mo101731a(bool.booleanValue());
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(a, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m122594F2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        e0Var.mo97693V1().mo97707Aw();
    }

    /* renamed from: H2 */
    private final void m122597H2(Window window) {
        window.setSoftInputMode(this.f99336o);
        window.getDecorView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
    }

    /* renamed from: I2 */
    private final void m122599I2(Window window) {
        ViewParent viewParent;
        window.setSoftInputMode(16);
        View findViewById = window.getDecorView().findViewById(16908290);
        ViewGroup viewGroup = null;
        if (findViewById != null) {
            viewParent = findViewById.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewParent;
        }
        window.getDecorView().setOnApplyWindowInsetsListener(new C42207a(viewGroup, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final WindowInsets m122601J2(ViewGroup viewGroup, C42216e0 e0Var, View view, WindowInsets windowInsets) {
        C41536l.m120489i(e0Var, "this$0");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(windowInsets, "insets");
        if (viewGroup != null && !C41536l.m120484d(e0Var.f99334m, windowInsets)) {
            C5905g gVar = new C5905g();
            gVar.mo19350p0(400);
            gVar.mo19355t0(new DecelerateInterpolator());
            C5958l0.m23911b(viewGroup, gVar);
        }
        e0Var.f99334m = windowInsets;
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: K2 */
    private final void m122603K2() {
        requireActivity().getOnBackPressedDispatcher().mo342c(getViewLifecycleOwner(), new C42226i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m122605L2(Fragment fragment, String str) {
        if (!this.f99333l) {
            m122612Q1(fragment, str);
            return;
        }
        C28690w0 w0Var = this.f99326e;
        C28690w0 w0Var2 = null;
        if (w0Var == null) {
            C41536l.m120506z("binding");
            w0Var = null;
        }
        w0Var.f73031j.setText(str);
        Animation O2 = m122610O2(this, new C42232o(this, fragment), (C43064a) null, C10210o.slide_up_anim, 0, 8, (Object) null);
        C28690w0 w0Var3 = this.f99326e;
        if (w0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            w0Var2 = w0Var3;
        }
        w0Var2.f73031j.startAnimation(O2);
    }

    /* renamed from: M2 */
    private final Animation m122607M2(C43064a aVar, C43064a aVar2, int i, long j) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), i);
        loadAnimation.setStartOffset(j);
        loadAnimation.setAnimationListener(new C42233p(aVar, aVar2));
        C41536l.m120488h(loadAnimation, "loadAnimation(context, a…\n            })\n        }");
        return loadAnimation;
    }

    /* renamed from: O2 */
    static /* synthetic */ Animation m122610O2(C42216e0 e0Var, C43064a aVar, C43064a aVar2, int i, long j, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            j = 0;
        }
        return e0Var.m122607M2(aVar, aVar2, i, j);
    }

    /* renamed from: Q1 */
    private final void m122612Q1(Fragment fragment, String str) {
        this.f99333l = true;
        C28690w0 w0Var = this.f99326e;
        C28690w0 w0Var2 = null;
        if (w0Var == null) {
            C41536l.m120506z("binding");
            w0Var = null;
        }
        w0Var.f73031j.setText(str);
        C42220d dVar = new C42220d(this);
        int i = C10210o.slide_down_anim;
        Animation O2 = m122610O2(this, (C43064a) null, new C42219c(this, fragment, m122610O2(this, dVar, (C43064a) null, i, 0, 8, (Object) null)), i, 0, 8, (Object) null);
        C28690w0 w0Var3 = this.f99326e;
        if (w0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            w0Var2 = w0Var3;
        }
        w0Var2.f73030i.startAnimation(O2);
    }

    /* renamed from: R1 */
    private final String m122613R1() {
        return (String) this.f99335n.getValue();
    }

    /* renamed from: T1 */
    private final C10199i m122614T1() {
        return (C10199i) this.f99331j.getValue();
    }

    /* renamed from: U1 */
    private final C10205l m122615U1() {
        return (C10205l) this.f99332k.getValue();
    }

    /* renamed from: W1 */
    private final void m122616W1(LiveData... liveDataArr) {
        for (LiveData liveData : liveDataArr) {
            this.f99330i.add(liveData);
            this.f99329h.mo4956s(liveData, new C42223f(this));
        }
    }

    /* renamed from: X1 */
    private final void m122617X1() {
        C1505h activity;
        View view = getView();
        if (view != null && (activity = getActivity()) != null) {
            C41536l.m120488h(activity, "activity");
            C10145d.m37091e(activity, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m122618Y1(Fragment fragment) {
        this.f99337p = fragment.getClass().getName();
        C1493e0 p = getChildFragmentManager().mo4428p();
        C28690w0 w0Var = this.f99326e;
        if (w0Var == null) {
            C41536l.m120506z("binding");
            w0Var = null;
        }
        p.mo4639r(w0Var.f73028g.getId(), fragment).mo4636g(fragment.getClass().getName()).mo4516j();
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public static final void m122619a2(C42216e0 e0Var) {
        int i;
        C41536l.m120489i(e0Var, "this$0");
        C10146d0.C10172e.C10174b p = ((C10146d0.C10172e) new C42224g().mo97700b()).mo26725p();
        if (p == null) {
            i = -1;
        } else {
            i = C42218b.f99339b[p.ordinal()];
        }
        if (i == 1) {
            C40736c f = C10146d0.C10148b.f28142a.mo26674f();
            if (f != null) {
                f.onComplete();
            }
        } else if (i == 2) {
            C10146d0.C10148b bVar = C10146d0.C10148b.f28142a;
            Context requireContext = e0Var.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Intent q = bVar.mo26676q(requireContext);
            if (q != null) {
                e0Var.startActivity(q);
                C1505h activity = e0Var.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public static final void m122620b2(C42216e0 e0Var, Throwable th) {
        C41536l.m120489i(e0Var, "this$0");
        e0Var.mo97694Z1(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m122621f2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        e0Var.mo97693V1().mo97746wx();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m122622g2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C43055l a = C43055l.f100483h.mo101641a(C43055l.C43057b.OPTIONAL);
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(a, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m122624h2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C43055l a = C43055l.f100483h.mo101641a(C43055l.C43057b.MANDATORY);
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(a, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m122626i2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C43041g a = C43041g.f100453i.mo101630a();
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(a, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m122628j2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C43337c a = C43337c.f101156g.mo102018a();
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(a, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m122630k2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C42394f a = C42394f.f99665g.mo97867a();
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(a, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m122632l2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        C43348i a = C43348i.f101175j.mo102023a();
        String string = e0Var.getString(C10220y.sso_sign_in_auth_secondary_title);
        C41536l.m120488h(string, "getString(R.string.sso_s…_in_auth_secondary_title)");
        e0Var.m122605L2(a, string);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m122634m2(C42216e0 e0Var, Boolean bool) {
        C41536l.m120489i(e0Var, "this$0");
        if (C41536l.m120484d(e0Var.m122613R1(), "JUNIOR")) {
            C1533o.m5445b(e0Var, "SignInFragment_key", C0908e.m3336b(C41233s.m119492a("initiate_onboarding", Boolean.TRUE)));
            return;
        }
        OnBoardingActivity.C35969a aVar = OnBoardingActivity.f87024y;
        C1505h requireActivity = e0Var.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C41536l.m120488h(bool, "fromRecoverPassword");
        e0Var.startActivityForResult(aVar.mo88591a(requireActivity, bool.booleanValue()), 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m122636n2(C42216e0 e0Var, C41238w wVar) {
        C41536l.m120489i(e0Var, "this$0");
        PasswordRecoveryActivity.C40999a aVar = PasswordRecoveryActivity.f96810x;
        C1505h requireActivity = e0Var.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        e0Var.startActivityForResult(PasswordRecoveryActivity.C40999a.m118883b(aVar, requireActivity, (String) null, false, 6, (Object) null), 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m122638o2(C42216e0 e0Var, List list) {
        C41536l.m120489i(e0Var, "this$0");
        ChooseCompanyActivity.C15265a aVar = ChooseCompanyActivity.f43638v;
        C1505h requireActivity = e0Var.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        Intent a = aVar.mo42324a(requireActivity);
        C41536l.m120488h(list, "it");
        e0Var.startActivityForResult(a.putExtras(new CompaniesArguments(list).mo42331b()), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m122640p2(C42216e0 e0Var, String str) {
        C41536l.m120489i(e0Var, "this$0");
        C42253o0 V1 = e0Var.mo97693V1();
        C41536l.m120488h(str, "clientKey");
        V1.mo97713Ew(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m122642q2(C42216e0 e0Var, C41224m mVar) {
        C41536l.m120489i(e0Var, "this$0");
        e0Var.mo97693V1().mo42543hw((String) mVar.mo95675a(), (StrongAuthMethod) mVar.mo95676b());
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m122644r2(C42216e0 e0Var, C35947l lVar) {
        C41536l.m120489i(e0Var, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            C41224m mVar = (C41224m) ((C35947l.C35951d) lVar).mo88520a();
            C41224m mVar2 = (C41224m) mVar.mo95675a();
            OneTimePasswordFragmentDialog.f87123F.mo88740a(e0Var, (UserContact) mVar2.mo95678e(), (UserContact) mVar2.mo95680f(), (String) mVar.mo95676b()).mo4576A1(e0Var.requireActivity().getSupportFragmentManager(), "FragmentOneTimePassword");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m122646s2(C42216e0 e0Var, C35947l lVar) {
        C41536l.m120489i(e0Var, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            e0Var.mo97695c2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m122648t2(C42216e0 e0Var, C41238w wVar) {
        String str;
        String str2;
        String str3;
        C41536l.m120489i(e0Var, "this$0");
        C13310d dVar = new C13310d();
        Context context = e0Var.getContext();
        if (context != null) {
            str = context.getString(C10220y.ext_device_error_dialog_title);
        } else {
            str = null;
        }
        dVar.mo35648c2(str);
        Context context2 = e0Var.getContext();
        if (context2 != null) {
            str2 = context2.getString(C10220y.ext_device_error_dialog_text);
        } else {
            str2 = null;
        }
        dVar.mo35639Q1(str2);
        dVar.mo35647a2(C13310d.C13312b.TITLE_SINGLE_BUTTON);
        Context context3 = e0Var.getContext();
        if (context3 != null) {
            str3 = context3.getString(C10220y.button_text_ok_got_it);
        } else {
            str3 = null;
        }
        dVar.mo35644X1(str3);
        dVar.mo4576A1(e0Var.getChildFragmentManager(), (String) null);
        dVar.mo35643V1(new C42290u(dVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m122650u2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$dialogView");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final C35947l m122652v2(C35947l lVar) {
        C35947l.C35949b bVar;
        Throwable th = null;
        if (lVar instanceof C35947l.C35949b) {
            bVar = (C35947l.C35949b) lVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            th = bVar.mo88517a();
        }
        boolean z = th instanceof ApiException;
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m122653w2(C42216e0 e0Var, View view) {
        C41536l.m120489i(e0Var, "this$0");
        e0Var.mo97693V1().mo97741px();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m122655x2(C42216e0 e0Var, C35947l lVar) {
        C41536l.m120489i(e0Var, "this$0");
        C28690w0 w0Var = null;
        if (lVar instanceof C35947l.C35951d) {
            C10146d0.f28134c.mo26705a().mo4819k(e0Var.getViewLifecycleOwner(), new C42291v(e0Var));
            C28690w0 w0Var2 = e0Var.f99326e;
            if (w0Var2 == null) {
                C41536l.m120506z("binding");
            } else {
                w0Var = w0Var2;
            }
            w0Var.f73029h.setVisibility(8);
        } else if (lVar instanceof C35947l.C35949b) {
            C28690w0 w0Var3 = e0Var.f99326e;
            if (w0Var3 == null) {
                C41536l.m120506z("binding");
                w0Var3 = null;
            }
            w0Var3.f73029h.setLoading(false);
            C28690w0 w0Var4 = e0Var.f99326e;
            if (w0Var4 == null) {
                C41536l.m120506z("binding");
                w0Var4 = null;
            }
            w0Var4.f73029h.setVisibility(0);
            if (e0Var.getActivity() != null) {
                C12902d.C12903a aVar = C12902d.f38098b;
                C1505h requireActivity = e0Var.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12902d e = C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null);
                String string = e0Var.getString(C10220y.update_settings_display_error_text);
                C41536l.m120488h(string, "getString(R.string.updat…tings_display_error_text)");
                C12902d.m48766q(e, string, (C12902d.C12905b) null, 2, (Object) null);
            }
        } else if (lVar instanceof C35947l.C35950c) {
            C28690w0 w0Var5 = e0Var.f99326e;
            if (w0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                w0Var = w0Var5;
            }
            w0Var.f73029h.setLoading(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m122657y2(C42216e0 e0Var, Boolean bool) {
        C41536l.m120489i(e0Var, "this$0");
        e0Var.mo97693V1().mo97730Xw(false);
        C41536l.m120488h(bool, "reset");
        if (bool.booleanValue()) {
            C42253o0.m122694ox(e0Var.mo97693V1(), false, 1, (Object) null);
        }
        e0Var.mo97693V1().mo97708Ax();
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m122659z2(C42216e0 e0Var, Button button, View view) {
        C35952m mVar;
        C41536l.m120489i(e0Var, "this$0");
        C41536l.m120489i(button, "$this_apply");
        C10199i T1 = e0Var.m122614T1();
        int i = C42218b.f99338a[e0Var.m122614T1().mo26767a().ordinal()];
        if (i == 1) {
            mVar = C35952m.EN;
        } else if (i == 2) {
            mVar = C35952m.KA;
        } else if (i == 3) {
            mVar = C35952m.TR;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        T1.mo26769c(mVar);
        button.getContext().startActivity(Intent.makeRestartActivityTask(e0Var.requireActivity().getComponentName()));
    }

    /* renamed from: S1 */
    public final C10146d0.C10172e mo97692S1() {
        return (C10146d0.C10172e) this.f99327f.getValue();
    }

    /* renamed from: V1 */
    public final C42253o0 mo97693V1() {
        return (C42253o0) this.f99325d.getValue();
    }

    /* renamed from: Z1 */
    public final void mo97694Z1(boolean z) {
        C1505h activity;
        if (z) {
            C10146d0.C10159c.f28157a.mo26689a();
        }
        C10146d0.C10148b bVar = C10146d0.C10148b.f28142a;
        if (bVar.mo26674f() != null) {
            C40736c f = bVar.mo26674f();
            C41536l.m120486f(f);
            f.onError(new Throwable());
        } else if (getActivity() != null && (getActivity() instanceof SignInActivity) && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    /* renamed from: b0 */
    public void mo42323b0(String str) {
        C41536l.m120489i(str, "clientKey");
        mo97693V1().mo97713Ew(str);
    }

    /* renamed from: c2 */
    public final void mo97695c2() {
        C41205b G = C10146d0.C10148b.f28142a.mo26673d().mo94890I(C40992a.m118827a()).mo94888G(new C42246l(this), new C42292w(this));
        C41536l.m120488h(G, "Auth.finishUpAuth()\n    …led(false)\n            })");
        C40397a.m116967a(G, this.f99328g);
    }

    /* renamed from: d2 */
    public final void mo97696d2() {
        Window window = requireActivity().getWindow();
        C41536l.m120488h(window, "requireActivity().window");
        m122599I2(window);
    }

    /* renamed from: e2 */
    public final void mo97697e2() {
        Window window = requireActivity().getWindow();
        C41536l.m120488h(window, "requireActivity().window");
        m122597H2(window);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (getActivity() != null && !(getActivity() instanceof SignInActivity)) {
            super.onActivityResult(i, i2, intent);
            switch (i2) {
                case 101:
                    mo97695c2();
                    return;
                case 102:
                    mo97694Z1(true);
                    return;
                case 103:
                    mo97693V1().mo97738lx();
                    return;
                case 104:
                    mo97693V1().mo97748yx(true);
                    return;
                case 105:
                    mo97693V1().mo97735hx();
                    return;
                default:
                    return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28690w0 d = C28690w0.m87878d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f99326e = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        for (LiveData t : this.f99330i) {
            this.f99329h.mo4957t(t);
        }
        Window window = requireActivity().getWindow();
        C41536l.m120488h(window, "requireActivity().window");
        m122597H2(window);
        super.onDestroyView();
    }

    public void onPause() {
        m122617X1();
        Window window = requireActivity().getWindow();
        C41536l.m120488h(window, "requireActivity().window");
        m122597H2(window);
        super.onPause();
    }

    public void onResume() {
        Window window = requireActivity().getWindow();
        C41536l.m120488h(window, "requireActivity().window");
        m122599I2(window);
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo97693V1().mo97744ux(m122615U1().mo26772b(this));
        mo97693V1().mo97710Bx(TMXFlags.TMX_FLAG_LOGIN_KEY);
        C28690w0 w0Var = null;
        if (mo97692S1().mo26712c() != null) {
            C28690w0 w0Var2 = this.f99326e;
            if (w0Var2 == null) {
                C41536l.m120506z("binding");
                w0Var2 = null;
            }
            AppCompatImageView appCompatImageView = w0Var2.f73026e;
            C43064a c = mo97692S1().mo26712c();
            C41536l.m120486f(c);
            appCompatImageView.setImageDrawable((Drawable) c.invoke());
        }
        this.f99333l = false;
        Window window = requireActivity().getWindow();
        this.f99336o = window.getAttributes().softInputMode;
        C41536l.m120488h(window, "this");
        m122599I2(window);
        C28690w0 w0Var3 = this.f99326e;
        if (w0Var3 == null) {
            C41536l.m120506z("binding");
            w0Var3 = null;
        }
        Button button = w0Var3.f73027f;
        if (!C41536l.m120484d(m122613R1(), "JUNIOR")) {
            i = 0;
        } else {
            i = 4;
        }
        button.setVisibility(i);
        button.setOnClickListener(new C42293x(this, button));
        mo97693V1().mo97718Iw().mo32131c().mo32156o().mo4819k(getViewLifecycleOwner(), new C42234f(this));
        mo97693V1().mo97718Iw().mo32131c().mo32153l().mo4819k(getViewLifecycleOwner(), new C42248m(this));
        mo97693V1().mo97718Iw().mo32131c().mo32150i().mo4819k(getViewLifecycleOwner(), new C42250n(this));
        mo97693V1().mo97718Iw().mo32131c().mo32145d().mo4819k(getViewLifecycleOwner(), new C42252o(this));
        mo97693V1().mo97718Iw().mo32131c().mo32151j().mo4819k(getViewLifecycleOwner(), new C42285p(this));
        mo97693V1().mo97718Iw().mo32131c().mo32157p().mo4819k(getViewLifecycleOwner(), new C42286q(this));
        mo97693V1().mo97718Iw().mo32131c().mo32159r().mo4819k(getViewLifecycleOwner(), new C42287r(this));
        mo97693V1().mo97718Iw().mo32131c().mo32148g().mo4819k(getViewLifecycleOwner(), new C42288s(this));
        mo97693V1().mo97718Iw().mo32131c().mo32147f().mo4819k(getViewLifecycleOwner(), new C42289t(this));
        mo97693V1().mo97718Iw().mo32131c().mo32152k().mo4819k(getViewLifecycleOwner(), new C42294y(this));
        mo97693V1().mo97718Iw().mo32131c().mo32149h().mo4819k(getViewLifecycleOwner(), new C42295z(this));
        mo97693V1().mo97718Iw().mo32131c().mo32144c().mo4819k(getViewLifecycleOwner(), new C42208a0(this));
        mo97693V1().mo97718Iw().mo32131c().mo32155n().mo4819k(getViewLifecycleOwner(), new C42210b0(this));
        mo97693V1().mo97718Iw().mo32131c().mo32160s().mo4819k(getViewLifecycleOwner(), new C42212c0(this));
        mo97693V1().mo97718Iw().mo32131c().mo32161t().mo4819k(getViewLifecycleOwner(), new C42214d0(this));
        mo97693V1().mo97718Iw().mo32131c().mo32146e().mo4819k(getViewLifecycleOwner(), new C42209b(this));
        mo97693V1().mo97718Iw().mo32131c().mo32143b().mo4819k(getViewLifecycleOwner(), new C42211c(this));
        mo97693V1().mo97718Iw().mo32131c().mo32154m().mo4819k(getViewLifecycleOwner(), new C42213d(this));
        mo97693V1().mo42541fw().mo4819k(getViewLifecycleOwner(), new C42215e(this));
        mo97693V1().mo97725Rw().mo4819k(getViewLifecycleOwner(), new C42236g(this));
        mo97693V1().mo97717Hw().mo4819k(getViewLifecycleOwner(), new C42238h(this));
        LiveData b = C1607m0.m5654b(mo97693V1().mo42544x0(), new C42240i());
        C41536l.m120488h(b, "map(viewModel.errorLiveD…          }\n            }");
        m122616W1(b, mo97693V1().mo42541fw(), mo97693V1().mo97725Rw());
        C1639v vVar = this.f99329h;
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C32392v.m95651c(vVar, viewLifecycleOwner, requireActivity);
        m122603K2();
        C28690w0 w0Var4 = this.f99326e;
        if (w0Var4 == null) {
            C41536l.m120506z("binding");
            w0Var4 = null;
        }
        w0Var4.f73029h.setVisibility(8);
        C28690w0 w0Var5 = this.f99326e;
        if (w0Var5 == null) {
            C41536l.m120506z("binding");
        } else {
            w0Var = w0Var5;
        }
        w0Var.f73029h.setOnClickListener(new C42242j(this));
        C10146d0.f28134c.mo26706b().mo4819k(getViewLifecycleOwner(), new C42244k(this));
    }
}
