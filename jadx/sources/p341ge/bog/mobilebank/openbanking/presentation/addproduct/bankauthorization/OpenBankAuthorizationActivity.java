package p341ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import bv0.C31206f;
import ev0.C31819c;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kv0.C37002h;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.openbanking.presentation.BankUiModel;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity */
public final class OpenBankAuthorizationActivity extends C30772sa {

    /* renamed from: I */
    public static final C33342a f81475I = new C33342a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C31819c f81476F;

    /* renamed from: G */
    private final C41217g f81477G = new C1617p0(C41520a0.m120436b(AuthorizationViewModel$ViewModel.class), new C33349h(this), new C33348g(this), new C33350i((C43064a) null, this));

    /* renamed from: H */
    private final C41217g f81478H = C41219i.m119470b(new C33343b(this));

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$a */
    public static final class C33342a {
        private C33342a() {
        }

        public /* synthetic */ C33342a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo79165a(Context context, BankUiModel bankUiModel) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(bankUiModel, "bank");
            context.startActivity(new Intent(context, OpenBankAuthorizationActivity.class).putExtra("BANK_ARG", bankUiModel));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$b */
    static final class C33343b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OpenBankAuthorizationActivity f81479d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33343b(OpenBankAuthorizationActivity openBankAuthorizationActivity) {
            super(0);
            this.f81479d = openBankAuthorizationActivity;
        }

        /* renamed from: b */
        public final BankUiModel invoke() {
            Parcelable parcelableExtra = this.f81479d.getIntent().getParcelableExtra("BANK_ARG");
            C41536l.m120486f(parcelableExtra);
            return (BankUiModel) parcelableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$c */
    static final class C33344c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBankAuthorizationActivity f81480d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33344c(OpenBankAuthorizationActivity openBankAuthorizationActivity) {
            super(1);
            this.f81480d = openBankAuthorizationActivity;
        }

        /* renamed from: a */
        public final void mo79167a(C31128a aVar) {
            C31819c cVar = null;
            if (aVar instanceof C31128a.C31131c) {
                C31819c F2 = this.f81480d.f81476F;
                if (F2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = F2;
                }
                cVar.f78462e.loadUrl((String) ((C31128a.C31131c) aVar).mo71340a());
                C36546y.m108282F().mo27149p("open_banking_bank_added");
            } else if (aVar instanceof C31128a.C31129a) {
                C31819c F22 = this.f81480d.f81476F;
                if (F22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = F22;
                }
                cVar.f78463f.mo53596d();
            } else if (aVar instanceof C31128a.C31130b) {
                C31819c F23 = this.f81480d.f81476F;
                if (F23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = F23;
                }
                cVar.f78463f.mo53597e();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79167a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$d */
    static final class C33345d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OpenBankAuthorizationActivity f81481d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33345d(OpenBankAuthorizationActivity openBankAuthorizationActivity) {
            super(1);
            this.f81481d = openBankAuthorizationActivity;
        }

        /* renamed from: a */
        public final void mo79168a(C37223a aVar) {
            if (((String) aVar.mo90296a()) != null) {
                this.f81481d.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo79168a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$e */
    static final class C33346e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f81482a;

        C33346e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f81482a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f81482a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f81482a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$f */
    public static final class C33347f extends WebViewClient {

        /* renamed from: a */
        private boolean f81483a;

        /* renamed from: b */
        final /* synthetic */ OpenBankAuthorizationActivity f81484b;

        C33347f(OpenBankAuthorizationActivity openBankAuthorizationActivity) {
            this.f81484b = openBankAuthorizationActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            if (!this.f81483a) {
                C31819c F2 = this.f81484b.f81476F;
                if (F2 == null) {
                    C41536l.m120506z("binding");
                    F2 = null;
                }
                F2.f78463f.mo53595c();
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return this.f81484b.m98040I2().mo79156lw().mo79159wf(str);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$g */
    public static final class C33348g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81485d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33348g(ComponentActivity componentActivity) {
            super(0);
            this.f81485d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f81485d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$h */
    public static final class C33349h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f81486d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33349h(ComponentActivity componentActivity) {
            super(0);
            this.f81486d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f81486d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.bankauthorization.OpenBankAuthorizationActivity$i */
    public static final class C33350i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f81487d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f81488e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33350i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f81487d = aVar;
            this.f81488e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f81487d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f81488e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: H2 */
    private final BankUiModel m98039H2() {
        return (BankUiModel) this.f81478H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final AuthorizationViewModel$ViewModel m98040I2() {
        return (AuthorizationViewModel$ViewModel) this.f81477G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m98041J2(OpenBankAuthorizationActivity openBankAuthorizationActivity, View view) {
        C41536l.m120489i(openBankAuthorizationActivity, "this$0");
        openBankAuthorizationActivity.m98040I2().onRefresh(6);
    }

    /* renamed from: K2 */
    private final void m98042K2() {
        C31819c cVar = this.f81476F;
        C31819c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f78462e.getSettings().setJavaScriptEnabled(true);
        C31819c cVar3 = this.f81476F;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        cVar3.f78462e.getSettings().setDomStorageEnabled(true);
        C31819c cVar4 = this.f81476F;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
            cVar4 = null;
        }
        cVar4.f78462e.getSettings().setLoadWithOverviewMode(false);
        C31819c cVar5 = this.f81476F;
        if (cVar5 == null) {
            C41536l.m120506z("binding");
            cVar5 = null;
        }
        cVar5.f78462e.getSettings().setUseWideViewPort(false);
        C31819c cVar6 = this.f81476F;
        if (cVar6 == null) {
            C41536l.m120506z("binding");
            cVar6 = null;
        }
        cVar6.f78462e.getSettings().setBuiltInZoomControls(true);
        C31819c cVar7 = this.f81476F;
        if (cVar7 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar7;
        }
        cVar2.f78462e.setWebViewClient(new C33347f(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C31819c d = C31819c.m94062d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f81476F = d;
        C31819c cVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        C31819c cVar2 = this.f81476F;
        if (cVar2 == null) {
            C41536l.m120506z("binding");
            cVar2 = null;
        }
        cVar2.f78465h.setText(C32343x.m95388F("rb.load.error.text", new Object[0]));
        m98042K2();
        C31819c cVar3 = this.f81476F;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar = cVar3;
        }
        cVar.f78467j.setOnClickListener(new C37002h(this));
        m98040I2().mo79158nw().mo79160yi().mo4819k(this, new C33346e(new C33344c(this)));
        m98040I2().mo79158nw().mo79155en().mo4819k(this, new C33346e(new C33345d(this)));
        m98040I2().mo79156lw().mo79154S(m98039H2().mo79092b());
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C31206f.f77548g);
        C41536l.m120488h(string, "getString(R.string.header_text_accounts)");
        return string;
    }
}
