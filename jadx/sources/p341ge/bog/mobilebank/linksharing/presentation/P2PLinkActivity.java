package p341ge.bog.mobilebank.linksharing.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.navigation.fragment.NavHostFragment;
import ap0.C10128a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p202p0.C7556l;
import p202p0.C7589q;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p380ck.C10464h;
import p657wj.C18601e;
import p671xj.C18774d;
import ue1.C43064a;
import ue1.C43075l;
import wo0.C18651a;
import wo0.C18652b;
import wo0.C18654d;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity */
public final class P2PLinkActivity extends C15126a {

    /* renamed from: L */
    public static final C15117a f43406L = new C15117a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f43407G = C41219i.m119470b(new C15118b(this));

    /* renamed from: H */
    private final C41217g f43408H = new C1617p0(C41520a0.m120436b(P2PLinkViewModel$ViewModel.class), new C15123g(this), new C15122f(this), new C15124h((C43064a) null, this));

    /* renamed from: I */
    private final Set f43409I;

    /* renamed from: J */
    private final Set f43410J;

    /* renamed from: K */
    private final C41217g f43411K;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity$a */
    public static final class C15117a {
        private C15117a() {
        }

        public /* synthetic */ C15117a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo42149a(Context context) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, P2PLinkActivity.class);
            context.startActivity(intent);
            return intent;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity$b */
    static final class C15118b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PLinkActivity f43412d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15118b(P2PLinkActivity p2PLinkActivity) {
            super(0);
            this.f43412d = p2PLinkActivity;
        }

        /* renamed from: b */
        public final C10128a invoke() {
            return C10128a.m37040d(this.f43412d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity$c */
    static final class C15119c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ P2PLinkActivity f43413d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15119c(P2PLinkActivity p2PLinkActivity) {
            super(0);
            this.f43413d = p2PLinkActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m55316c(P2PLinkActivity p2PLinkActivity, C7556l lVar, C7589q qVar, Bundle bundle) {
            C41536l.m120489i(p2PLinkActivity, "this$0");
            C41536l.m120489i(lVar, "<anonymous parameter 0>");
            C41536l.m120489i(qVar, "destination");
            p2PLinkActivity.m55309J2(qVar);
        }

        /* renamed from: b */
        public final C7556l.C7560c invoke() {
            return new C15128b(this.f43413d);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity$d */
    static final class C15120d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ P2PLinkActivity f43414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15120d(P2PLinkActivity p2PLinkActivity) {
            super(1);
            this.f43414d = p2PLinkActivity;
        }

        /* renamed from: a */
        public final void mo42152a(C37223a aVar) {
            Menu menu;
            MenuItem findItem;
            Button a;
            ImageView buttonIconImageView;
            View view;
            ToolbarView toolbarView = this.f43414d.f85671t;
            if (toolbarView != null && (menu = toolbarView.getMenu()) != null && (findItem = menu.findItem(C18652b.help_item)) != null && (a = C18601e.m63153a(findItem)) != null && (buttonIconImageView = a.getButtonIconImageView()) != null) {
                ViewParent parent = buttonIconImageView.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view != null) {
                    P2PLinkActivity p2PLinkActivity = this.f43414d;
                    C18774d dVar = new C18774d(view, (C18774d.C18775a) null, 0, 0, (String) null, (C43064a) null, false, false, false, 510, (DefaultConstructorMarker) null);
                    dVar.mo46562n(C18774d.C18775a.Top);
                    dVar.mo46568t(C32343x.m95388F("text.p2p.link.about.tooltip", new Object[0]));
                    dVar.mo46569u(C0767a.m2893c(p2PLinkActivity, C18651a.f52242a));
                    dVar.mo46563o(C18651a.f52243b);
                    dVar.mo46564p(true);
                    dVar.mo46565q(true);
                    dVar.mo46566r(true);
                    C18774d.m63531w(dVar, 0, 1, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42152a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity$e */
    static final class C15121e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43415a;

        C15121e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43415a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43415a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43415a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity$f */
    public static final class C15122f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15122f(ComponentActivity componentActivity) {
            super(0);
            this.f43416d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f43416d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity$g */
    public static final class C15123g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15123g(ComponentActivity componentActivity) {
            super(0);
            this.f43417d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f43417d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity$h */
    public static final class C15124h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43418d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f43419e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15124h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f43418d = aVar;
            this.f43419e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43418d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f43419e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public P2PLinkActivity() {
        int i = C18652b.p2PLinkSharingFragment;
        this.f43409I = C41357x0.m119989i(Integer.valueOf(C18652b.p2PLinkGenerationFragment), Integer.valueOf(C18652b.chooseAccountDialogFragment), Integer.valueOf(i));
        this.f43410J = C41357x0.m119989i(Integer.valueOf(i), Integer.valueOf(C18652b.p2PLinkSharingRouter));
        this.f43411K = C41219i.m119470b(new C15119c(this));
    }

    /* renamed from: F2 */
    private final C10128a m55305F2() {
        return (C10128a) this.f43407G.getValue();
    }

    /* renamed from: G2 */
    private final C7556l.C7560c m55306G2() {
        return (C7556l.C7560c) this.f43411K.getValue();
    }

    /* renamed from: H2 */
    private final C7556l m55307H2() {
        return ((NavHostFragment) m55305F2().f28050e.getFragment()).mo5009k1();
    }

    /* renamed from: I2 */
    private final P2PLinkViewModel$ViewModel m55308I2() {
        return (P2PLinkViewModel$ViewModel) this.f43408H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m55309J2(C7589q qVar) {
        MenuItem menuItem;
        Menu menu;
        mo86429X1(C32343x.m95388F("text.p2p.link.header", new Object[0]));
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView == null || (menu = toolbarView.getMenu()) == null) {
            menuItem = null;
        } else {
            menuItem = menu.findItem(C18652b.help_item);
        }
        if (menuItem != null) {
            menuItem.setVisible(this.f43409I.contains(Integer.valueOf(qVar.mo22214w())));
        }
    }

    /* renamed from: K2 */
    private final void m55310K2() {
        m55308I2().mo42156gw().mo33720oc().mo4819k(this, new C15121e(new C15120d(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m55305F2().mo3946b());
        super.mo37451O1(bundle);
        m55307H2().mo22137p(m55306G2());
        m55310K2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo40034W1() {
        return C18654d.menu_toolbar_link_sharing;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C41536l.m120489i(menu, "menu");
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        C7589q B = m55307H2().mo22111B();
        if (B != null) {
            m55306G2().mo22147a(m55307H2(), B, C0908e.m3335a());
            if (!this.f43410J.contains(Integer.valueOf(B.mo22214w()))) {
                m55308I2().mo42155fw().mo33719gi();
            }
        }
        return onCreateOptionsMenu;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m55307H2().mo22128e0(m55306G2());
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() != C18652b.help_item) {
            return true;
        }
        C32343x.m95393H0(this, "P2P_link", (String) null, "P2P_link_description_click", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
        m55307H2().mo22117L(C18652b.p2PHelpFragment);
        return true;
    }
}
