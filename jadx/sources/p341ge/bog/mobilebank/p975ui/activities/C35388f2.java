package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30599fa;
import a81.C30613ga;
import a81.C30627ha;
import a81.C30641ia;
import a81.C30655ja;
import a81.C30668ka;
import a81.C30681la;
import a81.C30694ma;
import a81.C30707na;
import a81.C30720oa;
import a81.C30722p;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.activity.ComponentActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1483c;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import com.salesforce.marketingcloud.C11398b;
import e51.C31663a;
import f10.C20329a;
import f81.C31959b;
import f81.C31960c;
import f81.C31961d;
import g91.C32284a;
import g91.C32288b;
import g91.C32303f;
import g91.C32335t0;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import j41.C36728a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l41.C37071a;
import l81.C37104a;
import m41.C37224b;
import org.parceler.C42035e;
import p163m0.C7047a;
import p341ge.bog.chat.data.ChatUser;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.pushnotification.PushNotificationHandlerActivity;
import p341ge.bog.mobilebank.model.KeyValue;
import p341ge.bog.mobilebank.p975ui.activities.viewmodel.RootActivityViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.serverstatus.OutOfServiceActivity;
import p341ge.bog.mobilebank.shared2.session.SessionManager;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10325n;
import p366bk.C10328q;
import p653wf.C18569a;
import p657wj.C18601e;
import p671xj.C18774d;
import q81.C38166c0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.activities.f2 */
public abstract class C35388f2 extends C35424j0 {

    /* renamed from: C */
    public static final C35389a f85663C = new C35389a((DefaultConstructorMarker) null);

    /* renamed from: D */
    private static boolean f85664D;

    /* renamed from: E */
    private static final List f85665E = C41341q.m119910m("REGISTRATION_FLOW", "RESTORE_CREDENTIALS", "QR_PAY", "CCY", "DIGITAL_ONBOARDING");

    /* renamed from: A */
    private final C41217g f85666A = C41219i.m119470b(C35397i.f85684d);

    /* renamed from: B */
    private final C30722p f85667B;

    /* renamed from: q */
    private final C41217g f85668q = new C1617p0(C41520a0.m120436b(RootActivityViewModel$ViewModel.class), new C35406r(this), new C35405q(this), new C35407s((C43064a) null, this));

    /* renamed from: r */
    protected C20329a f85669r;

    /* renamed from: s */
    protected C36546y f85670s;

    /* renamed from: t */
    public ToolbarView f85671t;

    /* renamed from: u */
    public SessionManager f85672u;

    /* renamed from: v */
    public C36728a f85673v;

    /* renamed from: w */
    public C37071a f85674w;

    /* renamed from: x */
    public C31663a f85675x;

    /* renamed from: y */
    private C1483c f85676y;

    /* renamed from: z */
    private final C41217g f85677z = C41219i.m119470b(C35402n.f85689d);

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$a */
    public static final class C35389a {
        private C35389a() {
        }

        public /* synthetic */ C35389a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$b */
    static final class C35390b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85678d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35390b(C35388f2 f2Var) {
            super(1);
            this.f85678d = f2Var;
        }

        /* renamed from: a */
        public final void mo86450a(C31128a aVar) {
            C35388f2 f2Var = this.f85678d;
            C41536l.m120488h(aVar, "it");
            f2Var.mo86426N1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86450a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$c */
    static final class C35391c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35391c(C35388f2 f2Var) {
            super(1);
            this.f85679d = f2Var;
        }

        /* renamed from: a */
        public final void mo86451a(C31959b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f85679d.m105056Y1(bVar.mo72441a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86451a((C31959b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$d */
    static final class C35392d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35392d(C35388f2 f2Var) {
            super(1);
            this.f85680d = f2Var;
        }

        /* renamed from: a */
        public final void mo86452a(C31961d dVar) {
            C41536l.m120489i(dVar, "data");
            this.f85680d.mo86428V1(dVar.mo72452a(), dVar.mo72453b(), dVar.mo72454c());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86452a((C31961d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$e */
    static final class C35393e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35393e(C35388f2 f2Var) {
            super(1);
            this.f85681d = f2Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "it");
            if (bool.booleanValue()) {
                this.f85681d.mo86447x2(OutOfServiceActivity.class);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$f */
    static final class C35394f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35394f(C35388f2 f2Var) {
            super(1);
            this.f85682d = f2Var;
        }

        /* renamed from: a */
        public final void mo86454a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f85682d.m105078p2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86454a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$g */
    /* synthetic */ class C35395g extends C41535k implements C43075l {
        C35395g(Object obj) {
            super(1, obj, C35388f2.class, "updateUnreadMessageCount", "updateUnreadMessageCount(I)V", 0);
        }

        /* renamed from: b */
        public final void mo86455b(int i) {
            ((C35388f2) this.receiver).m105041A2(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86455b(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$h */
    static final class C35396h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35396h(C35388f2 f2Var) {
            super(1);
            this.f85683d = f2Var;
        }

        /* renamed from: a */
        public final void mo86456a(C41238w wVar) {
            this.f85683d.m105069i2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86456a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$i */
    static final class C35397i extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C35397i f85684d = new C35397i();

        C35397i() {
            super(0);
        }

        /* renamed from: b */
        public final C41204a invoke() {
            return new C41204a();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$j */
    static final class C35398j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85685d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35398j(C35388f2 f2Var) {
            super(1);
            this.f85685d = f2Var;
        }

        /* renamed from: a */
        public final void mo86458a(Object obj) {
            this.f85685d.mo86425J1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86458a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$k */
    static final class C35399k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85686d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35399k(C35388f2 f2Var) {
            super(1);
            this.f85686d = f2Var;
        }

        /* renamed from: a */
        public final void mo86459a(Object obj) {
            this.f85686d.mo86441o2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo86459a(obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$l */
    static final class C35400l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85687d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35400l(C35388f2 f2Var) {
            super(1);
            this.f85687d = f2Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f85687d.mo86425J1();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$m */
    static final class C35401m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85688d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35401m(C35388f2 f2Var) {
            super(1);
            this.f85688d = f2Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "expired");
            if (bool.booleanValue()) {
                this.f85688d.m105082r2();
            } else {
                this.f85688d.m105045K1();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$n */
    static final class C35402n extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C35402n f85689d = new C35402n();

        C35402n() {
            super(0);
        }

        /* renamed from: b */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$o */
    static final class C35403o implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f85690a;

        C35403o(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f85690a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f85690a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f85690a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$p */
    static final class C35404p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C35388f2 f85691d;

        /* renamed from: e */
        final /* synthetic */ C18774d f85692e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35404p(C35388f2 f2Var, C18774d dVar) {
            super(0);
            this.f85691d = f2Var;
            this.f85692e = dVar;
        }

        public final void invoke() {
            this.f85691d.m105050T1();
            this.f85692e.mo46561c();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$q */
    public static final class C35405q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f85693d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35405q(ComponentActivity componentActivity) {
            super(0);
            this.f85693d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f85693d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$r */
    public static final class C35406r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f85694d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35406r(ComponentActivity componentActivity) {
            super(0);
            this.f85694d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f85694d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.f2$s */
    public static final class C35407s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f85695d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f85696e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35407s(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f85695d = aVar;
            this.f85696e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f85695d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f85696e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public final void m105041A2(int i) {
        Menu menu;
        MenuItem findItem;
        BadgeRelativeLayout b;
        boolean z;
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView != null && (menu = toolbarView.getMenu()) != null && (findItem = menu.findItem(C10322k.chat_menu_item)) != null && (b = C18601e.m63154b(findItem)) != null) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            b.setBadgeVisible(z);
            Resources resources = b.getResources();
            int i2 = C10319h.f28655y0;
            b.setVerticalOffset(-resources.getDimensionPixelSize(i2));
            b.setHorizontalOffset(-b.getResources().getDimensionPixelSize(i2));
            b.getBadgeView().setBadge(new NotificationBadgeView.BadgeType.Number(i));
        }
    }

    /* renamed from: B1 */
    private final Intent m105042B1(Context context, Intent intent) {
        Intent intent2 = new Intent(context, MainActivity.class);
        intent2.putExtra("PUSH_NOTIFS_OPEN", true);
        if (intent != null && !TextUtils.isEmpty(intent.getStringExtra("type"))) {
            intent2.putExtra("type", intent.getStringExtra("type"));
            intent2.putExtra("parameters", C42035e.m122121c((ArrayList) C42035e.m122119a(intent.getParcelableExtra("parameters"))));
            intent2.putExtra("messageId", intent.getStringExtra("messageId"));
            intent2.setFlags(268468224);
        }
        return intent2;
    }

    /* renamed from: E1 */
    private final RootActivityViewModel$ViewModel m105043E1() {
        return (RootActivityViewModel$ViewModel) this.f85668q.getValue();
    }

    /* renamed from: I1 */
    private final boolean m105044I1(Intent intent) {
        if (!intent.getBooleanExtra("PUSH_NOTIFS_OPEN", false)) {
            return false;
        }
        String stringExtra = intent.getStringExtra("type");
        ArrayList arrayList = (ArrayList) C42035e.m122119a(intent.getParcelableExtra("parameters"));
        if (!C41358y.m119999O(f85665E, stringExtra)) {
            if (!C41536l.m120484d("URL", stringExtra)) {
                return false;
            }
            if (!TextUtils.isEmpty(mo55213D1("CLICK_WEB_URL", arrayList)) || !TextUtils.isEmpty(mo55213D1("TARGET", arrayList))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public final void m105045K1() {
        try {
            C1483c cVar = this.f85676y;
            if (cVar != null) {
                cVar.mo4578l1();
            }
        } catch (Throwable unused) {
        }
        this.f85676y = null;
    }

    /* renamed from: L1 */
    private final boolean m105046L1() {
        return C41358y.m119999O(C41341q.m119910m("ACTION_OPEN_FROM_WIDGET", "ge.bog.mobilebank.appshortcuts.ATMS_AND_SERVICE_CENTERS", "ge.bog.mobilebank.appshortcuts.CURRENCY_RATES", "ge.bog.mobilebank.appshortcuts.MOBILE_TOPUP", "ge.bog.mobilebank.appshortcuts.PAYMENTS", "ge.bog.mobilebank.appshortcuts.QR_PAY"), getIntent().getAction());
    }

    /* renamed from: S1 */
    public static /* synthetic */ void m105048S1(C35388f2 f2Var, Intent intent, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            f2Var.mo86141R1(intent, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPushReceive");
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final void m105050T1() {
        String str;
        C18569a tw = m105043E1().mo86500tw();
        C36546y t1 = mo86443t1();
        C30722p w1 = mo40037w1();
        if (w1 != null) {
            str = w1.mo70942b();
        } else {
            str = null;
        }
        boolean z = true;
        ChatUser J = t1.mo89312J(true, (String) null, (String) null, str);
        C41536l.m120488h(J, "app.getChatProperties(\n …ageName\n                )");
        if (C32335t0.m95361f() != 1) {
            z = false;
        }
        C41205b F = tw.mo33789c(this, J, z, true, true).mo95067F();
        C41536l.m120488h(F, "viewModel.chat.openChat(…            ).subscribe()");
        mo86438k1(F);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public final void m105056Y1(Intent intent) {
        startActivity(m105042B1(this, intent));
    }

    /* renamed from: c2 */
    public static /* synthetic */ void m105060c2(C35388f2 f2Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            f2Var.mo86433b2(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: restartAppSafe");
    }

    /* renamed from: f2 */
    private final void m105064f2() {
        int U1 = mo53709U1();
        if (U1 == -1) {
            C32335t0.m95369n(this);
        } else {
            setTheme(U1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final boolean m105067h2(C35388f2 f2Var, MenuItem menuItem) {
        C41536l.m120489i(f2Var, "this$0");
        C41536l.m120489i(menuItem, "item");
        if (menuItem.getItemId() != C10322k.chat_menu_item) {
            return f2Var.onOptionsItemSelected(menuItem);
        }
        if (C41536l.m120484d(f2Var.m105043E1().mo86504xw().mo4814f(), Boolean.FALSE)) {
            Integer num = (Integer) f2Var.m105043E1().getUnreadMessages().mo4814f();
            if (num == null) {
                num = 0;
            }
            if (num.intValue() > 0) {
                f2Var.m105050T1();
                return true;
            }
        }
        f2Var.mo86160y2();
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final void m105069i2() {
        ToolbarView toolbarView;
        Menu menu;
        MenuItem findItem;
        Button a;
        if (m105043E1().mo86499sw() && !C41536l.m120484d(m105043E1().mo86504xw().mo4814f(), Boolean.TRUE) && (toolbarView = this.f85671t) != null && (menu = toolbarView.getMenu()) != null && (findItem = menu.findItem(C10322k.chat_menu_item)) != null && (a = C18601e.m63153a(findItem)) != null) {
            C18774d dVar = new C18774d(a, (C18774d.C18775a) null, 0, 0, (String) null, (C43064a) null, false, false, false, 510, (DefaultConstructorMarker) null);
            dVar.mo46562n(C18774d.C18775a.Top);
            String string = getString(C10328q.chatbot_in_app_notification_title);
            C41536l.m120488h(string, "getString(R.string.chatb…n_app_notification_title)");
            dVar.mo46568t(string);
            dVar.mo46569u(C0767a.m2893c(this, C10318g.f28625J0));
            dVar.mo46563o(C10320i.chatbot_tooltip_background);
            dVar.mo46567s(new C35404p(this, dVar));
            dVar.mo46570v(10);
            m105043E1().mo86498Fw();
            m105043E1().mo86503ww();
        }
    }

    /* renamed from: l1 */
    private final void m105071l1() {
        C31960c vw = m105043E1().mo86502vw();
        vw.mo72448Uf().mo4819k(this, new C35403o(new C35390b(this)));
        C37224b.m109963b(vw.mo72451zk(), this, new C35391c(this));
        C37224b.m109963b(vw.mo72445Ig(), this, new C35392d(this));
        vw.mo72447O8().mo4819k(this, new C35403o(new C35393e(this)));
        C37224b.m109963b(vw.mo72450m6(), this, new C35394f(this));
        vw.getUnreadMessages().mo4819k(this, new C35403o(new C35395g(this)));
        vw.mo72446J4().mo4819k(this, new C35403o(new C35396h(this)));
    }

    /* renamed from: l2 */
    public static /* synthetic */ C1483c m105072l2(C35388f2 f2Var, String str, String str2, String str3, String str4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z, boolean z2, String str5, View.OnClickListener onClickListener3, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = null;
            }
            if ((i & 16) != 0) {
                onClickListener = null;
            }
            if ((i & 32) != 0) {
                onClickListener2 = null;
            }
            if ((i & 64) != 0) {
                z = true;
            }
            if ((i & 128) != 0) {
                z2 = true;
            }
            if ((i & C11398b.f33139r) != 0) {
                str5 = "Alert";
            }
            if ((i & C11398b.f33140s) != 0) {
                onClickListener3 = null;
            }
            return f2Var.mo86439k2(str, str2, str3, str4, onClickListener, onClickListener2, z, z2, str5, onClickListener3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showConditionalDialog");
    }

    /* renamed from: m1 */
    private final void m105073m1() {
        Configuration configuration = getResources().getConfiguration();
        configuration.fontScale = 1.0f;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Object systemService = getSystemService("window");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
        getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
    }

    /* renamed from: n1 */
    private final void m105074n1() {
        if (getIntent() != null) {
            getIntent().removeExtra("PUSH_NOTIFS_OPEN");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m105075n2(Runnable runnable, View view) {
        C41536l.m120489i(runnable, "$confirmButtonClickListener");
        runnable.run();
    }

    /* renamed from: o1 */
    private final C1483c m105076o1(String str, String str2, String str3, String str4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, boolean z, boolean z2) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(str);
        dVar.mo35639Q1(str2);
        dVar.mo35646Z1(str3);
        dVar.mo35645Y1(new C30613ga(z2, dVar, onClickListener));
        dVar.mo35642U1(str4);
        dVar.mo35641T1(new C30627ha(z2, dVar, onClickListener2));
        dVar.mo35640S1(new C30641ia(onClickListener3));
        dVar.mo4586v1(z);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m105077p1(boolean z, C13310d dVar, View.OnClickListener onClickListener, Button button) {
        C41536l.m120489i(dVar, "$dialog");
        if (z) {
            dVar.mo4577k1();
        }
        if (onClickListener != null) {
            onClickListener.onClick(button);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final void m105078p2() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_SINGLE_BUTTON);
        dVar.mo35648c2(dVar.getString(C10328q.not_enough_storage));
        dVar.mo35639Q1(dVar.getString(C10328q.not_enough_storage_warning_description));
        dVar.mo35644X1("OK");
        dVar.mo35643V1(new C30681la(this));
        dVar.mo4586v1(false);
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m105079q1(boolean z, C13310d dVar, View.OnClickListener onClickListener, Button button) {
        C41536l.m120489i(dVar, "$dialog");
        if (z) {
            dVar.mo4577k1();
        }
        if (onClickListener != null) {
            onClickListener.onClick(button);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m105080q2(C35388f2 f2Var, Button button) {
        C41536l.m120489i(f2Var, "this$0");
        C41536l.m120489i(button, "it");
        f2Var.finishAffinity();
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m105081r1(View.OnClickListener onClickListener, Button button) {
        if (onClickListener != null) {
            onClickListener.onClick(button);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m105082r2() {
        int i;
        int i2;
        boolean yw = m105043E1().mo86505yw();
        if (yw) {
            i = C10328q.session_expired_dialog_title;
        } else {
            i = C10328q.session_expired_dialog_title_solo;
        }
        if (yw) {
            i2 = C10328q.session_expired_dialog_text;
        } else {
            i2 = C10328q.session_expired_dialog_text_solo;
        }
        this.f85676y = m105072l2(this, getString(i), getString(i2), getString(C10328q.session_expired_dialog_continue), getString(C10328q.session_expired_dialog_logout), new C30694ma(this), new C30707na(this), false, false, (String) null, (View.OnClickListener) null, 896, (Object) null);
    }

    /* renamed from: s1 */
    private final void m105083s1() {
        m105088x1().dispose();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m105084s2(C35388f2 f2Var, View view) {
        C41536l.m120489i(f2Var, "this$0");
        C32303f.m95189I(Boolean.TRUE, f2Var);
        f2Var.m105045K1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m105085t2(C35388f2 f2Var, View view) {
        C41536l.m120489i(f2Var, "this$0");
        f2Var.mo86446v1().mo42368a(f2Var);
        f2Var.m105045K1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m105086v2(C37104a aVar, C38166c0 c0Var, int i) {
        C41536l.m120489i(c0Var, "$bogDialogFragment");
        if (aVar != null) {
            aVar.mo48298Z0(i);
        }
        c0Var.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m105087w2(C38166c0 c0Var, View.OnClickListener onClickListener, View view) {
        C41536l.m120489i(c0Var, "$bogDialogFragment");
        c0Var.mo4577k1();
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* renamed from: x1 */
    private final C41204a m105088x1() {
        return (C41204a) this.f85666A.getValue();
    }

    /* renamed from: y2 */
    private final void mo86160y2() {
        String str;
        C36546y.m108282F().mo27152s("more", "contact", "open_module");
        C30722p w1 = mo40037w1();
        if (w1 != null) {
            str = w1.mo70942b();
        } else {
            str = null;
        }
        ContactUsActivity.m103438Q3(this, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A1 */
    public final C20329a mo86422A1() {
        C20329a aVar = this.f85669r;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("localeManager");
        return null;
    }

    /* renamed from: C1 */
    public final SessionManager mo86423C1() {
        SessionManager sessionManager = this.f85672u;
        if (sessionManager != null) {
            return sessionManager;
        }
        C41536l.m120506z("sessionManager");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D1 */
    public String mo55213D1(String str, List list) {
        boolean z;
        Object obj;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((KeyValue) obj).getKey(), str)) {
                break;
            }
        }
        KeyValue keyValue = (KeyValue) obj;
        if (keyValue != null) {
            return keyValue.getValue();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F1 */
    public final void mo86424F1(Class cls, C32288b bVar) {
        C41536l.m120489i(cls, "targetActivity");
        C41536l.m120489i(bVar, "param");
        C32284a.f79683a.mo72807d(cls, bVar);
        finish();
    }

    /* renamed from: G1 */
    public void mo52674G1(C21503d.C21504a aVar) {
        mo74709H1(aVar != null ? aVar.mo53706f() : null);
    }

    /* renamed from: H1 */
    public void mo74709H1(Throwable th) {
        mo86448y1().mo48350a(th);
    }

    /* renamed from: J1 */
    public final void mo86425J1() {
        View findViewById = findViewById(C10322k.f28784Qe);
        if (findViewById != null) {
            C32343x.m95455i0(findViewById);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N1 */
    public final void mo86426N1(C31128a aVar) {
        C41536l.m120489i(aVar, "<this>");
        C31132b.m92648j(aVar, (int[]) null, new C35398j(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C35399k(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C35400l(this), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public void mo86140P1(C32288b bVar) {
        C41536l.m120489i(bVar, "param");
    }

    /* renamed from: Q1 */
    public final void mo86427Q1(Intent intent) {
        m105048S1(this, intent, false, 2, (Object) null);
    }

    /* renamed from: R1 */
    public void mo86141R1(Intent intent, boolean z) {
        m105043E1().mo86501uw().mo72439Vm(intent, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public int mo53709U1() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V1 */
    public final void mo86428V1(Intent intent, boolean z, boolean z2) {
        C41536l.m120489i(intent, "receivedIntent");
        if (m105044I1(intent) || z2) {
            m105074n1();
            PushNotificationHandlerActivity.f59140a0.mo55229a(this, intent);
            return;
        }
        getIntent().putExtra("PUSH_NOTIFS_OPEN", true);
        getIntent().putExtra("type", intent.getStringExtra("type"));
        getIntent().putExtra("parameters", C42035e.m122121c((ArrayList) C42035e.m122119a(intent.getParcelableExtra("parameters"))));
        getIntent().putExtra("messageId", intent.getStringExtra("messageId"));
        if (z) {
            C32303f.m95188H(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public int mo40034W1() {
        return -1;
    }

    /* renamed from: X1 */
    public final void mo86429X1(String str) {
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView != null && str != null) {
            toolbarView.setTitle(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z1 */
    public final void mo86430Z1() {
        finishAffinity();
        PendingIntent activity = PendingIntent.getActivity(this, 123456, new Intent(this, LauncherActivity.class), 301989888);
        Object systemService = getSystemService("alarm");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).set(1, System.currentTimeMillis() + ((long) BogInputLayout.INPUT_NORMAL_STATE), activity);
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a2 */
    public final void mo86431a2() {
        m105060c2(this, false, 1, (Object) null);
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24 && configuration != null) {
            int i = configuration.uiMode;
            configuration.setTo(getBaseContext().getResources().getConfiguration());
            configuration.uiMode = i;
        }
        super.applyOverrideConfiguration(configuration);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Context context2;
        mo86435e2(C20329a.f55281b.mo48813a());
        if (context != null) {
            context2 = mo86422A1().mo48810f(context);
        } else {
            context2 = null;
        }
        super.attachBaseContext(context2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public final void mo86433b2(boolean z) {
        Intent launchIntentForPackage = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            startActivity(launchIntentForPackage);
        }
        if (z) {
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d2 */
    public final void mo86434d2(C36546y yVar) {
        C41536l.m120489i(yVar, "<set-?>");
        this.f85670s = yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e2 */
    public final void mo86435e2(C20329a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f85669r = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g2 */
    public final void mo86436g2() {
        ToolbarView toolbarView = (ToolbarView) findViewById(C10322k.f28748Hx);
        this.f85671t = toolbarView;
        if (toolbarView != null) {
            setSupportActionBar(toolbarView);
            toolbarView.setOnMenuItemClickListener(new C30599fa(this));
            mo86429X1(mo38120z1());
        }
    }

    /* renamed from: j2 */
    public final C1483c mo86437j2(String str, String str2, String str3, String str4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z) {
        return m105072l2(this, str, str2, str3, str4, onClickListener, onClickListener2, z, false, (String) null, (View.OnClickListener) null, 896, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k1 */
    public final void mo86438k1(C41205b bVar) {
        C41536l.m120489i(bVar, "disposable");
        m105088x1().mo95660b(bVar);
    }

    /* renamed from: k2 */
    public final C1483c mo86439k2(String str, String str2, String str3, String str4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, boolean z, boolean z2, String str5, View.OnClickListener onClickListener3) {
        C1483c o1 = m105076o1(str, str2, str3, str4, onClickListener, onClickListener2, onClickListener3, z, z2);
        o1.mo4576A1(getSupportFragmentManager(), str5);
        o1.mo4586v1(z);
        return o1;
    }

    /* renamed from: m2 */
    public final void mo86440m2(Runnable runnable) {
        C41536l.m120489i(runnable, "confirmButtonClickListener");
        m105072l2(this, getString(C10328q.f28931K0), getString(C10328q.f28923E1), getString(C10328q.f28924F0), getString(C10328q.f28932M0), new C30720oa(runnable), (View.OnClickListener) null, false, true, (String) null, (View.OnClickListener) null, 864, (Object) null);
    }

    /* renamed from: o2 */
    public final void mo86441o2() {
        View findViewById = findViewById(C10322k.f28784Qe);
        if (findViewById != null) {
            C32343x.m95447f1(findViewById);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 421) {
            mo86446v1().mo42369b(this, i, i2, intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C36546y N = C36546y.m108285N();
        C41536l.m120488h(N, "getInstance()");
        mo86434d2(N);
        String simpleName = getClass().getSimpleName();
        int hashCode = hashCode();
        Log.v("### onCreate", simpleName + ":" + hashCode);
        if (this instanceof LauncherActivity) {
            f85664D = true;
        }
        if (f85664D || m105046L1()) {
            super.onCreate(bundle);
            mo86444u1().mo72086a(C32343x.m95476p0(this));
            m105073m1();
            m105064f2();
            mo86422A1().mo48810f(this);
            if (mo49479M1() > 0) {
                setContentView(mo49479M1());
            }
            mo37451O1(bundle);
            m105071l1();
            mo86423C1().mo84760q().mo4819k(this, new C35403o(new C35401m(this)));
            return;
        }
        super.onCreate((Bundle) null);
        Log.e("###", "Return to the login activity");
        finish();
        mo86446v1().mo42368a(this);
        overridePendingTransition(0, 0);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItem;
        BadgeRelativeLayout b;
        C41536l.m120489i(menu, "menu");
        ToolbarView toolbarView = this.f85671t;
        if (toolbarView == null) {
            return false;
        }
        int i = C10325n.menu_toolbar_root_activity;
        MenuInflater menuInflater = getMenuInflater();
        C41536l.m120488h(menuInflater, "menuInflater");
        toolbarView.mo37108n0(i, menu, menuInflater);
        Menu menu2 = toolbarView.getMenu();
        if (menu2 != null) {
            menuItem = menu2.findItem(C10322k.chat_menu_item);
        } else {
            menuItem = null;
        }
        if (!(menuItem == null || (b = C18601e.m63154b(menuItem)) == null)) {
            b.getBadgeView().setBadge(NotificationBadgeView.BadgeType.Empty.f39879d);
            m105043E1().mo86501uw().mo72440Xh();
        }
        int W1 = mo40034W1();
        if (W1 == -1) {
            return true;
        }
        MenuInflater menuInflater2 = getMenuInflater();
        C41536l.m120488h(menuInflater2, "menuInflater");
        toolbarView.mo37108n0(W1, menu, menuInflater2);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        String simpleName = getClass().getSimpleName();
        int hashCode = hashCode();
        Log.v("### Destroying activity", simpleName + ":" + hashCode);
        mo86443t1().mo89319n0(this);
        m105083s1();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        mo86443t1().mo89320o0(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C41536l.m120489i(strArr, "permissions");
        C41536l.m120489i(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == 0) {
                arrayList.add(strArr[i2]);
            } else {
                arrayList2.add(strArr[i2]);
                if (!ActivityCompat.m2592x(this, strArr[i2])) {
                    PreferencesApiManager.getInstance().setForeverDeniedPermission(strArr[i2]);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C32284a aVar = C32284a.f79683a;
        if (aVar.mo72806c()) {
            if (C41536l.m120484d(aVar.mo72804a(), getClass())) {
                mo86140P1(aVar.mo72805b());
                aVar.mo72808e();
            } else {
                finish();
            }
        }
        mo86443t1().mo89325p0(this);
    }

    public void onUserInteraction() {
        super.onUserInteraction();
        mo86423C1().mo84763u();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        mo86436g2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t1 */
    public final C36546y mo86443t1() {
        C36546y yVar = this.f85670s;
        if (yVar != null) {
            return yVar;
        }
        C41536l.m120506z("app");
        return null;
    }

    /* renamed from: u1 */
    public final C31663a mo86444u1() {
        C31663a aVar = this.f85675x;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("appPreferences");
        return null;
    }

    /* renamed from: u2 */
    public final void mo86445u2(List list, C37104a aVar, View.OnClickListener onClickListener) {
        C41536l.m120489i(list, "options");
        if (getSupportFragmentManager().mo4418k0("FRAGMENT_TAG_TEMPLATE_LIST") == null) {
            C38166c0 c0Var = new C38166c0();
            c0Var.mo91697C1(new C30655ja(aVar, c0Var));
            c0Var.mo91700F1(getString(C10328q.templates_list_create_template_choose));
            c0Var.mo91699E1(new ArrayList(list));
            c0Var.mo91698D1(getString(C10328q.f28928H0), new C30668ka(c0Var, onClickListener));
            c0Var.mo4576A1(getSupportFragmentManager(), "FRAGMENT_TAG_TEMPLATE_LIST");
        }
    }

    /* renamed from: v1 */
    public final C36728a mo86446v1() {
        C36728a aVar = this.f85673v;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("authHelper");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public C30722p mo40037w1() {
        return this.f85667B;
    }

    /* renamed from: x2 */
    public final void mo86447x2(Class cls) {
        C41536l.m120489i(cls, "clazz");
        startActivity(new Intent(this, cls));
    }

    /* renamed from: y1 */
    public final C37071a mo86448y1() {
        C37071a aVar = this.f85674w;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("errorHandler");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z2 */
    public final boolean mo86449z2() {
        Intent intent = getIntent();
        return intent != null && intent.getBooleanExtra("PUSH_NOTIFS_OPEN", false);
    }

    public void setContentView(int i) {
        super.setContentView(i);
        mo86436g2();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        mo86436g2();
    }
}
