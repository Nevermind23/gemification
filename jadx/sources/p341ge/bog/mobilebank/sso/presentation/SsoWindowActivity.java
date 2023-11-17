package p341ge.bog.mobilebank.sso.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import f10.C20329a;
import g91.C32290b1;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10329r;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.sso.presentation.SsoWindowActivity */
public final class SsoWindowActivity extends C34707b {

    /* renamed from: s */
    public static final C34700a f83873s = new C34700a((DefaultConstructorMarker) null);

    /* renamed from: q */
    private final C41217g f83874q = new C1617p0(C41520a0.m120436b(LoginViewModel.class), new C34704e(this), new C34703d(this), new C34705f((C43064a) null, this));

    /* renamed from: r */
    private C20329a f83875r;

    /* renamed from: ge.bog.mobilebank.sso.presentation.SsoWindowActivity$a */
    public static final class C34700a {
        private C34700a() {
        }

        public /* synthetic */ C34700a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final void m101926b(boolean z, Activity activity, Fragment fragment) {
            Class<SsoWindowActivity> cls = SsoWindowActivity.class;
            if (fragment != null) {
                Intent intent = new Intent(fragment.getContext(), cls);
                if (!z) {
                    fragment.startActivity(intent);
                } else {
                    fragment.startActivityForResult(intent, 421);
                }
            } else if (activity != null) {
                Intent intent2 = new Intent(activity, cls);
                if (!z) {
                    activity.startActivity(intent2);
                } else {
                    activity.startActivityForResult(intent2, 421);
                }
            }
        }

        /* renamed from: a */
        public final void mo84778a(boolean z, Activity activity) {
            C41536l.m120489i(activity, "activity");
            m101926b(z, activity, (Fragment) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.SsoWindowActivity$b */
    static final class C34701b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SsoWindowActivity f83876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34701b(SsoWindowActivity ssoWindowActivity) {
            super(1);
            this.f83876d = ssoWindowActivity;
        }

        /* renamed from: a */
        public final void mo84779a(C41238w wVar) {
            this.f83876d.setResult(-1);
            C32290b1.m95111a(this.f83876d);
            this.f83876d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84779a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.SsoWindowActivity$c */
    static final class C34702c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83877a;

        C34702c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83877a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83877a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83877a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.SsoWindowActivity$d */
    public static final class C34703d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83878d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34703d(ComponentActivity componentActivity) {
            super(0);
            this.f83878d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83878d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.SsoWindowActivity$e */
    public static final class C34704e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34704e(ComponentActivity componentActivity) {
            super(0);
            this.f83879d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83879d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.sso.presentation.SsoWindowActivity$f */
    public static final class C34705f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83880d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83881e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34705f(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83880d = aVar;
            this.f83881e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83880d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83881e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: S0 */
    private final LoginViewModel m101924S0() {
        return (LoginViewModel) this.f83874q.getValue();
    }

    /* renamed from: T0 */
    public static final void m101925T0(boolean z, Activity activity) {
        f83873s.mo84778a(z, activity);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C20329a a = C20329a.f55281b.mo48813a();
        this.f83875r = a;
        Context context2 = null;
        if (context != null) {
            if (a == null) {
                C41536l.m120506z("localeManager");
                a = null;
            }
            context2 = a.mo48810f(context);
        }
        super.attachBaseContext(context2);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        C20329a aVar = this.f83875r;
        if (aVar == null) {
            C41536l.m120506z("localeManager");
            aVar = null;
        }
        aVar.mo48810f(this);
        int themeType = PreferencesApiManager.getInstance().getThemeType();
        if (themeType == 1) {
            i = C10329r.TransparentActivityStyleSolo;
        } else if (themeType != 2) {
            i = C10329r.TransparentActivityStyle;
        } else {
            i = C10329r.TransparentActivityStyleWealth;
        }
        setTheme(i);
        setContentView(C10324m.activity_sso_window);
        m101924S0().mo84776iw().mo4819k(this, new C34702c(new C34701b(this)));
        LoginViewModel S0 = m101924S0();
        int i2 = C10322k.auth_window_frg_cont;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        S0.mo84775fw(i2, supportFragmentManager);
    }
}
