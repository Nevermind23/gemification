package p341ge.bog.mobilebank.gamification.presentation.activity;

import ah0.C19247c;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.C0152h;
import androidx.activity.C0160p;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import fh0.C20485a;
import g91.C32335t0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import i10.C25100c;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh0.C26229a;
import mh0.C26230b;
import nh0.C26494a;
import nh0.C26498e;
import o31.C37588a0;
import o31.C37613p;
import p163m0.C7047a;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity */
public final class GamificationActivity extends C24045b {

    /* renamed from: J */
    public static final C24031b f62353J = new C24031b((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C26494a f62354G;

    /* renamed from: H */
    private final C41217g f62355H = C41219i.m119470b(new C24033d(this));

    /* renamed from: I */
    private final C41217g f62356I = new C1617p0(C41520a0.m120436b(C26498e.class), new C24040k(this), new C24042m(this), new C24041l((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$a */
    private final class C24030a {

        /* renamed from: a */
        private int f62357a;

        public C24030a() {
        }

        /* renamed from: c */
        private static final int m77530c(View view) {
            Rect rect = new Rect();
            C41536l.m120488h(view, "childOfContent");
            view.getWindowVisibleDisplayFrame(rect);
            return rect.bottom - rect.top;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m77531d(C24030a aVar, View view, GamificationActivity gamificationActivity) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(gamificationActivity, "this$1");
            int c = m77530c(view);
            if (c != aVar.f62357a) {
                int height = view.getRootView().getHeight() - gamificationActivity.m77518L2();
                int i = height - c;
                if (i > height / 4) {
                    C41536l.m120488h(view, "childOfContent");
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = height - i;
                        view.setLayoutParams(layoutParams);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                } else {
                    C41536l.m120488h(view, "childOfContent");
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.height = height;
                        view.setLayoutParams(layoutParams2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                }
                view.requestLayout();
                aVar.f62357a = c;
            }
        }

        /* renamed from: b */
        public final void mo61039b() {
            View childAt = ((ViewGroup) GamificationActivity.this.findViewById(16908290)).getChildAt(0);
            childAt.getViewTreeObserver().addOnGlobalLayoutListener(new C24044a(this, childAt, GamificationActivity.this));
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$b */
    public static final class C24031b {
        private C24031b() {
        }

        public /* synthetic */ C24031b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo61040a(Context context, String str) {
            C41536l.m120489i(context, "activity");
            context.startActivity(C37613p.m110614a(new Intent(context, GamificationActivity.class), C41233s.m119492a("ARG_TOKEN", str)));
            Activity b = C25100c.m80063b(context);
            if (b != null) {
                b.overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$c */
    static final class C24032c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GamificationActivity f62359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24032c(GamificationActivity gamificationActivity) {
            super(1);
            this.f62359d = gamificationActivity;
        }

        /* renamed from: a */
        public final void mo61041a(C31128a aVar) {
            GamificationActivity gamificationActivity = this.f62359d;
            C41536l.m120488h(aVar, "result");
            gamificationActivity.m77522P2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61041a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$d */
    static final class C24033d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GamificationActivity f62360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24033d(GamificationActivity gamificationActivity) {
            super(0);
            this.f62360d = gamificationActivity;
        }

        /* renamed from: b */
        public final C20485a invoke() {
            C20485a d = C20485a.m66691d(this.f62360d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$e */
    static final class C24034e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GamificationActivity f62361d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24034e(GamificationActivity gamificationActivity) {
            super(1);
            this.f62361d = gamificationActivity;
        }

        /* renamed from: a */
        public final void mo61043a(C0152h hVar) {
            C41536l.m120489i(hVar, "$this$addCallback");
            if (this.f62361d.m77517J2().f55480i.canGoBack()) {
                this.f62361d.m77517J2().f55480i.goBack();
                hVar.mo365f(true);
            } else if (hVar.mo362c()) {
                hVar.mo365f(false);
                this.f62361d.getOnBackPressedDispatcher().mo345g();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61043a((C0152h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$f */
    static final class C24035f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GamificationActivity f62362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24035f(GamificationActivity gamificationActivity) {
            super(1);
            this.f62362d = gamificationActivity;
        }

        /* renamed from: a */
        public final void mo61044a(String str) {
            this.f62362d.m77517J2().f55476e.mo53597e();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61044a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$g */
    static final class C24036g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GamificationActivity f62363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24036g(GamificationActivity gamificationActivity) {
            super(1);
            this.f62363d = gamificationActivity;
        }

        /* renamed from: a */
        public final void mo61045a(String str) {
            C41536l.m120489i(str, C11769i.C11770a.f34149l);
            this.f62363d.m77517J2().f55476e.mo53595c();
            this.f62363d.m77517J2().f55480i.loadUrl(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo61045a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$h */
    static final class C24037h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GamificationActivity f62364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24037h(GamificationActivity gamificationActivity) {
            super(1);
            this.f62364d = gamificationActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f62364d.m77517J2().f55476e.mo53596d();
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$i */
    static final class C24038i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f62365a;

        C24038i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f62365a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f62365a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f62365a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$k */
    public static final class C24040k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f62367d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24040k(ComponentActivity componentActivity) {
            super(0);
            this.f62367d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f62367d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$l */
    public static final class C24041l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f62368d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f62369e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24041l(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f62368d = aVar;
            this.f62369e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f62368d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f62369e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$m */
    static final class C24042m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GamificationActivity f62370d;

        /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$m$a */
        static final class C24043a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ GamificationActivity f62371d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24043a(GamificationActivity gamificationActivity) {
                super(0);
                this.f62371d = gamificationActivity;
            }

            /* renamed from: b */
            public final C26498e invoke() {
                return this.f62371d.mo61038K2().mo32558a(this.f62371d.getIntent().getStringExtra("ARG_TOKEN"));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24042m(GamificationActivity gamificationActivity) {
            super(0);
            this.f62370d = gamificationActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C24043a(this.f62370d));
        }
    }

    /* renamed from: H2 */
    private final void m77515H2() {
        m77517J2().f55482k.setOnClickListener(new C26229a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m77516I2(GamificationActivity gamificationActivity, View view) {
        C41536l.m120489i(gamificationActivity, "this$0");
        gamificationActivity.m77519M2().onRefresh(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final C20485a m77517J2() {
        return (C20485a) this.f62355H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final int m77518L2() {
        int identifier = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: M2 */
    private final C26498e m77519M2() {
        return (C26498e) this.f62356I.getValue();
    }

    /* renamed from: N2 */
    private final void m77520N2() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        C41536l.m120488h(onBackPressedDispatcher, "onBackPressedDispatcher");
        C0160p.m419a(onBackPressedDispatcher, this, true, new C24034e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final void m77521O2(String str) {
        String query = new URL(str).getQuery();
        C41536l.m120488h(query, "query");
        List x0 = C40440x.m117182x0(query, new String[]{"&"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = x0.iterator();
        while (true) {
            C41224m mVar = null;
            if (!it.hasNext()) {
                break;
            }
            List x02 = C40440x.m117182x0((String) it.next(), new String[]{"="}, false, 0, 6, (Object) null);
            if (x02.size() >= 2) {
                mVar = C41233s.m119492a(x02.get(0), x02.get(1));
            }
            if (mVar != null) {
                arrayList.add(mVar);
            }
        }
        String str2 = (String) C41344r0.m119939u(arrayList).get("type");
        if (str2 != null) {
            C35388f2.m105048S1(this, C37613p.m110614a(new Intent("PUSH_NOTIF_INTENT"), C41233s.m119492a("PUSH_NOTIFS_OPEN", Boolean.TRUE), C41233s.m119492a("type", str2)), false, 2, (Object) null);
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m77522P2(C31128a aVar) {
        C31132b.m92646h(aVar, (int[]) null, new C24035f(this), 1, (Object) null);
        C31132b.m92648j(aVar, (int[]) null, new C24036g(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C24037h(this), 1, (Object) null);
    }

    /* renamed from: Q2 */
    private final void m77523Q2() {
        new C24030a().mo61039b();
        m77517J2().f55479h.setOnRefreshListener(new C26230b(this));
        getWindow().setStatusBarColor(0);
        C32343x.m95444e1(this, true);
        m77520N2();
        WebView webView = m77517J2().f55480i;
        webView.clearCache(true);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(false);
        settings.setUseWideViewPort(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(true);
        m77517J2().f55480i.setWebViewClient(new C24039j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m77524R2(GamificationActivity gamificationActivity) {
        C41536l.m120489i(gamificationActivity, "this$0");
        gamificationActivity.m77517J2().f55480i.reload();
        gamificationActivity.m77517J2().f55479h.setRefreshing(false);
    }

    /* renamed from: l1 */
    private final void m77525l1() {
        m77519M2().mo65778gw().mo65777ks().mo4819k(this, new C24038i(new C24032c(this)));
    }

    /* renamed from: K2 */
    public final C26494a mo61038K2() {
        C26494a aVar = this.f62354G;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        setContentView((View) m77517J2().mo3946b());
        getWindow().setStatusBarColor(getColor(17170445));
        m77523Q2();
        m77515H2();
        m77525l1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public int mo53709U1() {
        int f = C32335t0.m95361f();
        if (f == 1) {
            return C19247c.GamificationTransparentSolo;
        }
        if (f != 2) {
            return C19247c.GamificationTransparent;
        }
        return C19247c.GamificationTransparentWealth;
    }

    /* renamed from: ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity$j */
    public static final class C24039j extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ GamificationActivity f62366a;

        C24039j(GamificationActivity gamificationActivity) {
            this.f62366a = gamificationActivity;
        }

        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
            boolean z2 = false;
            if (str != null && C40439w.m117114r(str, "exit", false, 2, (Object) null)) {
                z2 = true;
            }
            if (z2) {
                this.f62366a.finish();
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!C40440x.m117139M(String.valueOf(str), "/deeplink", false, 2, (Object) null)) {
                return false;
            }
            GamificationActivity gamificationActivity = this.f62366a;
            if (str == null) {
                return true;
            }
            gamificationActivity.m77521O2(str);
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
        }
    }
}
