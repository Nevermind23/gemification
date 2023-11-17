package com.identomat.activities;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.C0218d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1629r;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.LiveData;
import androidx.navigation.fragment.NavHostFragment;
import com.github.mikephil.charting.utils.Utils;
import ef1.C40813h;
import ef1.C40814h0;
import ef1.C40822j0;
import ef1.C40845o1;
import ef1.C40867u0;
import ef1.C40883y1;
import he1.C41217g;
import he1.C41228o;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe1.C41862l;
import org.json.JSONObject;
import p163m0.C7047a;
import p202p0.C7556l;
import p202p0.C7602w;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p345ad.C9786e;
import p345ad.C9789f;
import p345ad.C9793g;
import p345ad.C9796h;
import p345ad.C9800j;
import p345ad.C9801k;
import p485kc.C16341a;
import p485kc.C16344b;
import p485kc.C16347e;
import p499lc.C16542a;
import p499lc.C16543b;
import p541oc.C17147a;
import p569qc.C17481a;
import p569qc.C17485b;
import p678yc.C18877a;
import p692zc.C19005g;
import ue1.C43064a;
import ue1.C43079p;

public final class NavigationActivity extends C0218d {

    /* renamed from: v */
    public static final C10522a f29874v = new C10522a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final String f29875n = "identomat_";

    /* renamed from: o */
    private C17147a f29876o;

    /* renamed from: p */
    private NavHostFragment f29877p;

    /* renamed from: q */
    private C7556l f29878q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C18877a f29879r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C9786e f29880s;

    /* renamed from: t */
    private C9793g f29881t;

    /* renamed from: u */
    private final C41217g f29882u;

    /* renamed from: com.identomat.activities.NavigationActivity$a */
    public static final class C10522a {
        private C10522a() {
        }

        public /* synthetic */ C10522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7602w mo27261a() {
            return new C7602w.C7603a().mo22257b(C16344b.identomat_slide_in_left).mo22258c(C16344b.identomat_slide_out_right).mo22260e(C16344b.identomat_slide_in_right).mo22261f(C16344b.identomat_slide_out_left).mo22256a();
        }
    }

    /* renamed from: com.identomat.activities.NavigationActivity$b */
    public static final class C10523b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f29883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10523b(ComponentActivity componentActivity) {
            super(0);
            this.f29883d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f29883d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: com.identomat.activities.NavigationActivity$c */
    public static final class C10524c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f29884d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f29885e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10524c(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f29884d = aVar;
            this.f29885e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f29884d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f29885e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: com.identomat.activities.NavigationActivity$d */
    static final class C10525d extends C41862l implements C43079p {

        /* renamed from: h */
        int f29886h;

        /* renamed from: i */
        final /* synthetic */ NavigationActivity f29887i;

        /* renamed from: com.identomat.activities.NavigationActivity$d$a */
        static final class C10526a extends C41862l implements C43079p {

            /* renamed from: h */
            int f29888h;

            /* renamed from: i */
            final /* synthetic */ C9800j f29889i;

            /* renamed from: j */
            final /* synthetic */ NavigationActivity f29890j;

            /* renamed from: com.identomat.activities.NavigationActivity$d$a$a */
            public /* synthetic */ class C10527a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f29891a;

                static {
                    int[] iArr = new int[C9801k.values().length];
                    iArr[C9801k.SUCCESS.ordinal()] = 1;
                    f29891a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10526a(C9800j jVar, NavigationActivity navigationActivity, Continuation continuation) {
                super(2, continuation);
                this.f29889i = jVar;
                this.f29890j = navigationActivity;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                return new C10526a(this.f29889i, this.f29890j, continuation);
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object unused = C41793d.m121157c();
                if (this.f29888h == 0) {
                    C41228o.m119483b(obj);
                    if (C10527a.f29891a[this.f29889i.mo26295c().ordinal()] == 1) {
                        this.f29890j.m38150a1();
                    } else {
                        Toast.makeText(this.f29890j.getApplicationContext(), this.f29889i.mo26294b(), 0).show();
                        this.f29890j.onBackPressed();
                    }
                    return C41238w.f97225a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C10526a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10525d(NavigationActivity navigationActivity, Continuation continuation) {
            super(2, continuation);
            this.f29887i = navigationActivity;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C10525d(this.f29887i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f29886h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C9786e P0 = this.f29887i.f29880s;
                Context baseContext = this.f29887i.getBaseContext();
                this.f29886h = 1;
                obj = P0.mo26252m(baseContext, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else if (i == 2) {
                C41228o.m119483b(obj);
                this.f29887i.f29880s.mo26259v(this.f29887i.getBaseContext());
                return C41238w.f97225a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C9800j jVar = (C9800j) obj;
            JSONObject a = jVar.mo26293a();
            if (a != null) {
                NavigationActivity navigationActivity = this.f29887i;
                Log.i(navigationActivity.f29875n, C41536l.m120497q("start: ", a));
                navigationActivity.f29879r.mo46863c().mo47071t(a);
                navigationActivity.f29879r.mo46862b().mo47050b();
                navigationActivity.f29879r.mo46867g().mo47154s(a);
                C9789f.f26588f.mo26274a(a);
                C9793g.f26598e.mo26285a(a);
                C9796h.f26607E.mo26289a(a);
            }
            Log.i(this.f29887i.f29875n, C41536l.m120497q("config: ", this.f29887i.f29879r));
            C40883y1 c2 = C40867u0.m118469c();
            C10526a aVar = new C10526a(jVar, this.f29887i, (Continuation) null);
            this.f29886h = 2;
            if (C40813h.m118303e(c2, aVar, this) == c) {
                return c;
            }
            this.f29887i.f29880s.mo26259v(this.f29887i.getBaseContext());
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C10525d) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: com.identomat.activities.NavigationActivity$e */
    static final class C10528e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ NavigationActivity f29892d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10528e(NavigationActivity navigationActivity) {
            super(0);
            this.f29892d = navigationActivity;
        }

        public final C1620q0.C1624b invoke() {
            return new C17485b(this.f29892d.f29880s, (C9793g) null, (C9796h) null, 6, (DefaultConstructorMarker) null);
        }
    }

    public NavigationActivity() {
        C16341a aVar = C16341a.f46171a;
        this.f29879r = aVar.mo43316d();
        this.f29880s = aVar.mo43314b();
        this.f29881t = aVar.mo43315c();
        this.f29882u = new C1617p0(C41520a0.m120436b(C16543b.class), new C10523b(this), new C10528e(this), new C10524c((C43064a) null, this));
    }

    /* renamed from: T0 */
    private final C16543b m38144T0() {
        return (C16543b) this.f29882u.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: U0 */
    public final void m38145U0(JSONObject jSONObject) {
        if (jSONObject != null && m38149Y0(jSONObject)) {
            String string = jSONObject.getString("result");
            if (!C41536l.m120484d(string, ProductType.PRODUCT_STATUS_IN_PROGRESS)) {
                if (C41536l.m120484d(string, "closed")) {
                    C16341a.f46171a.mo43313a(this);
                } else {
                    C16341a.f46171a.mo43313a(this);
                }
            }
        }
    }

    /* renamed from: V0 */
    private final void m38146V0() {
        boolean z;
        if (Settings.Global.getFloat(getApplicationContext().getContentResolver(), "animator_duration_scale", Utils.FLOAT_EPSILON) == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                ValueAnimator.class.getMethod("setDurationScale", new Class[]{Float.TYPE}).invoke((Object) null, new Object[]{Float.valueOf(1.0f)});
            } catch (Throwable unused) {
                Log.i(this.f29875n, "Animation  Disabled");
            }
        }
    }

    /* renamed from: W0 */
    private final void m38147W0() {
        getSupportFragmentManager().mo4361D1(new C17481a(this.f29880s, this.f29881t, C16341a.f46171a.mo43316d()));
        Fragment j0 = getSupportFragmentManager().mo4415j0(C16347e.f46195w0);
        if (j0 != null) {
            NavHostFragment navHostFragment = (NavHostFragment) j0;
            this.f29877p = navHostFragment;
            this.f29878q = navHostFragment.mo5009k1();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
    }

    /* renamed from: X0 */
    private final void m38148X0(Bundle bundle) {
        if (bundle == null) {
            m38152c1();
            return;
        }
        C7556l lVar = this.f29878q;
        C41536l.m120486f(lVar);
        lVar.mo22129f0(bundle);
    }

    /* renamed from: Y0 */
    private final boolean m38149Y0(JSONObject jSONObject) {
        return jSONObject.length() != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public final void m38150a1() {
        C7602w a = C7602w.C7603a.m28913i(new C7602w.C7603a(), C16347e.startFragment, true, false, 4, (Object) null).mo22256a();
        C19005g.C19006a a2 = C16341a.f46171a.mo43316d().mo46865e().mo47125a();
        C7556l lVar = this.f29878q;
        if (lVar != null) {
            lVar.mo22119N(a2.mo47132b(), a2.mo47131a(), a);
        }
    }

    /* renamed from: b1 */
    private final void m38151b1() {
        LiveData gw = m38144T0().mo43688gw();
        if (gw != null) {
            gw.mo4819k(this, new C16542a(this));
        }
    }

    /* renamed from: c1 */
    private final void m38152c1() {
        C16341a.f46171a.mo43319g(this);
        C40845o1 unused = C40821j.m118316b(C1629r.m5683a(this), C40867u0.m118468b(), (C40822j0) null, new C10525d(this, (Continuation) null), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        RelativeLayout relativeLayout;
        super.onCreate(bundle);
        if (C41536l.m120484d(this.f29880s.mo26249C(), "")) {
            finish();
            return;
        }
        C17147a d = C17147a.m60225d(getLayoutInflater());
        this.f29876o = d;
        if (d == null) {
            relativeLayout = null;
        } else {
            relativeLayout = d.mo3946b();
        }
        setContentView((View) relativeLayout);
        m38151b1();
        m38147W0();
        m38148X0(bundle);
        Log.i("identomat_", "IDENTOMAT VERSION: 1.1.68");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C16543b.m58750fw(m38144T0(), (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(this.f29875n, "onNewIntent");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        Log.i(this.f29875n, "onResume: ");
        m38146V0();
        this.f29880s.mo26257s(this, 1);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C41536l.m120489i(bundle, "outState");
        super.onSaveInstanceState(bundle);
        C7556l lVar = this.f29878q;
        C41536l.m120486f(lVar);
        lVar.mo22130h0();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        Log.i(this.f29875n, "onStop: ");
        this.f29880s.mo26257s(this, 0);
        super.onStop();
    }
}
