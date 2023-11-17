package p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity;

import a81.C30772sa;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import com.github.mikephil.charting.utils.Utils;
import g91.C32297d;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41217g;
import he1.C41238w;
import i50.C25119a;
import i50.C25120b;
import i50.C25121c;
import i50.C25122d;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationData;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.model.PendingProductConfirmationParams;
import p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel;
import p341ge.bog.mobilebank.p975ui.activities.OperationResultActivity;
import p341ge.bog.mobilebank.p975ui.model.OperationResultData;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.rest.BankApi;
import p366bk.C10322k;
import p366bk.C10324m;
import p90.C27372n1;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity */
public final class ProductConfirmationActivity extends C30772sa implements C41185v.C41186a {

    /* renamed from: J */
    public static final C22264a f59088J = new C22264a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f59089F = new C1617p0(C41520a0.m120436b(ProductConfirmationViewModel.class), new C22276m(this), new C22275l(this), new C22277n((C43064a) null, this));

    /* renamed from: G */
    private PendingProductConfirmationData f59090G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C27372n1 f59091H;

    /* renamed from: I */
    private boolean f59092I;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$a */
    public static final class C22264a {
        private C22264a() {
        }

        public /* synthetic */ C22264a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55144a(Activity activity, PendingProductConfirmationData pendingProductConfirmationData) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(pendingProductConfirmationData, "data");
            Intent intent = new Intent(activity, ProductConfirmationActivity.class);
            intent.putExtra("ProductConfirmationActivity.EXTRA_CONFIRMATION_DATA", pendingProductConfirmationData);
            activity.startActivityForResult(intent, 10029);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$b */
    public /* synthetic */ class C22265b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59093a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$a[] r0 = p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel.C22280a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$a r1 = p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel.C22280a.ACCEPT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel$a r1 = p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.viewmodel.ProductConfirmationViewModel.C22280a.DECLINE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f59093a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity.C22265b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$c */
    /* synthetic */ class C22266c extends C41535k implements C43075l {
        C22266c(Object obj) {
            super(1, obj, ProductConfirmationActivity.class, "onConfirmationHtmlReady", "onConfirmationHtmlReady(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo55145b(String str) {
            C41536l.m120489i(str, "p0");
            ((ProductConfirmationActivity) this.receiver).m72154U2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55145b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$d */
    /* synthetic */ class C22267d extends C41535k implements C43075l {
        C22267d(Object obj) {
            super(1, obj, ProductConfirmationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo55146b(boolean z) {
            ((ProductConfirmationActivity) this.receiver).m72155V2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55146b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$e */
    static final class C22268e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationActivity f59094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22268e(ProductConfirmationActivity productConfirmationActivity) {
            super(1);
            this.f59094d = productConfirmationActivity;
        }

        /* renamed from: a */
        public final void mo55147a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            C27372n1 H2 = this.f59094d.f59091H;
            if (H2 == null) {
                C41536l.m120506z("binding");
                H2 = null;
            }
            H2.f69360r.setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55147a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$f */
    /* synthetic */ class C22269f extends C41535k implements C43075l {
        C22269f(Object obj) {
            super(1, obj, ProductConfirmationActivity.class, "onProductConfirmation", "onProductConfirmation(Lge/bog/mobilebank/cleanarch/presentation/productconfirmation/viewmodel/ProductConfirmationViewModel$Confirmation;)V", 0);
        }

        /* renamed from: b */
        public final void mo55148b(ProductConfirmationViewModel.C22280a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((ProductConfirmationActivity) this.receiver).m72157X2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55148b((ProductConfirmationViewModel.C22280a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$g */
    static final class C22270g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationActivity f59095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22270g(ProductConfirmationActivity productConfirmationActivity) {
            super(1);
            this.f59095d = productConfirmationActivity;
        }

        /* renamed from: a */
        public final void mo55149a(boolean z) {
            C41185v I2 = this.f59095d.m72151R2();
            if (I2 != null) {
                I2.mo95635L2(z);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55149a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$h */
    static final class C22271h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationActivity f59096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22271h(ProductConfirmationActivity productConfirmationActivity) {
            super(1);
            this.f59096d = productConfirmationActivity;
        }

        /* renamed from: a */
        public final void mo55150a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "error");
            if (aVar.mo53708h()) {
                C41185v I2 = this.f59096d.m72151R2();
                if (I2 != null) {
                    I2.mo95634K2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
                    return;
                }
                return;
            }
            C41185v I22 = this.f59096d.m72151R2();
            if (I22 != null) {
                I22.mo4577k1();
            }
            this.f59096d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55150a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$i */
    public static final class C22272i extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ View f59097d;

        C22272i(View view) {
            this.f59097d = view;
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animation");
            super.onAnimationEnd(animator);
            this.f59097d.setVisibility(8);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$j */
    public static final class C22273j extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ ProductConfirmationActivity f59098a;

        C22273j(ProductConfirmationActivity productConfirmationActivity) {
            this.f59098a = productConfirmationActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m72179b(ProductConfirmationActivity productConfirmationActivity) {
            C41536l.m120489i(productConfirmationActivity, "this$0");
            C27372n1 H2 = productConfirmationActivity.f59091H;
            if (H2 == null) {
                C41536l.m120506z("binding");
                H2 = null;
            }
            if (H2.f69351i.hasReachedBottom()) {
                productConfirmationActivity.m72164e3();
            } else {
                productConfirmationActivity.m72153T2();
            }
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            new Handler().postDelayed(new C25122d(this.f59098a), 50);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$k */
    static final class C22274k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ProductConfirmationActivity f59099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22274k(ProductConfirmationActivity productConfirmationActivity) {
            super(0);
            this.f59099d = productConfirmationActivity;
        }

        public final void invoke() {
            this.f59099d.m72164e3();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$l */
    public static final class C22275l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22275l(ComponentActivity componentActivity) {
            super(0);
            this.f59100d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59100d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$m */
    public static final class C22276m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22276m(ComponentActivity componentActivity) {
            super(0);
            this.f59101d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59101d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.productconfirmation.activity.ProductConfirmationActivity$n */
    public static final class C22277n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59102d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59103e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22277n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59102d = aVar;
            this.f59103e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59102d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59103e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: O2 */
    private final void m72148O2(View view, boolean z, float f) {
        AnimatorListenerAdapter animatorListenerAdapter;
        if (z && view.getVisibility() == 0) {
            return;
        }
        if (z || view.getVisibility() == 0) {
            if (z) {
                view.setAlpha(Utils.FLOAT_EPSILON);
                view.setVisibility(0);
            }
            ViewPropertyAnimator animate = view.animate();
            if (!z) {
                f = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f).setDuration((long) (((double) view.getResources().getInteger(17694722)) * 1.5d));
            if (z) {
                animatorListenerAdapter = null;
            } else {
                animatorListenerAdapter = m72150Q2(view);
            }
            duration.setListener(animatorListenerAdapter);
        }
    }

    /* renamed from: P2 */
    static /* synthetic */ void m72149P2(ProductConfirmationActivity productConfirmationActivity, View view, boolean z, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        productConfirmationActivity.m72148O2(view, z, f);
    }

    /* renamed from: Q2 */
    private final AnimatorListenerAdapter m72150Q2(View view) {
        return new C22272i(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final C41185v m72151R2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: S2 */
    private final ProductConfirmationViewModel m72152S2() {
        return (ProductConfirmationViewModel) this.f59089F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final void m72153T2() {
        C27372n1 n1Var = this.f59091H;
        C27372n1 n1Var2 = null;
        if (n1Var == null) {
            C41536l.m120506z("binding");
            n1Var = null;
        }
        n1Var.f69347e.setVisibility(8);
        C27372n1 n1Var3 = this.f59091H;
        if (n1Var3 == null) {
            C41536l.m120506z("binding");
            n1Var3 = null;
        }
        n1Var3.f69352j.setVisibility(8);
        C27372n1 n1Var4 = this.f59091H;
        if (n1Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            n1Var2 = n1Var4;
        }
        ConstraintLayout constraintLayout = n1Var2.f69349g;
        C41536l.m120488h(constraintLayout, "binding.arrowContainer");
        m72149P2(this, constraintLayout, false, 0.5f, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final void m72154U2(String str) {
        C27372n1 n1Var = this.f59091H;
        C27372n1 n1Var2 = null;
        if (n1Var == null) {
            C41536l.m120506z("binding");
            n1Var = null;
        }
        n1Var.f69351i.loadDataWithBaseURL("file:///android_asset/", str, "text/html", "UTF-8", (String) null);
        C27372n1 n1Var3 = this.f59091H;
        if (n1Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            n1Var2 = n1Var3;
        }
        n1Var2.f69351i.setWebViewClient(new C22273j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final void m72155V2(boolean z) {
        if (z) {
            mo86441o2();
        } else {
            mo86425J1();
        }
    }

    /* renamed from: W2 */
    private final void m72156W2() {
        OperationResultData operationResultData = new OperationResultData();
        operationResultData.setSuccess(true);
        operationResultData.setSuccessTitle(C32343x.m95388F("product.confirmation.successfully.confirmed", new Object[0]));
        String F = C32343x.m95388F("product.confirmations.success.result.screen.label", new Object[0]);
        PendingProductConfirmationData pendingProductConfirmationData = this.f59090G;
        if (pendingProductConfirmationData == null) {
            C41536l.m120506z("data");
            pendingProductConfirmationData = null;
        }
        operationResultData.addDetails(F, pendingProductConfirmationData.mo55154b());
        OperationResultActivity.m104475E2(this, operationResultData);
        Intent intent = new Intent();
        intent.putExtra("ProductConfirmationActivity.EXTRA_CONFIRMATION_RESULT_ACCEPT", true);
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m72157X2(ProductConfirmationViewModel.C22280a aVar) {
        C41185v R2 = m72151R2();
        if (R2 != null) {
            R2.mo4577k1();
        }
        int i = C22265b.f59093a[aVar.ordinal()];
        if (i == 1) {
            m72156W2();
        } else if (i == 2) {
            m72158Y2();
        }
    }

    /* renamed from: Y2 */
    private final void m72158Y2() {
        Intent intent = new Intent();
        intent.putExtra("ProductConfirmationActivity.EXTRA_CONFIRMATION_RESULT_REJECT", true);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: Z2 */
    private final void m72159Z2(ProductConfirmationViewModel.C22280a aVar) {
        String str;
        this.f59092I = aVar.mo55189b();
        C41185v.C41187b bVar = C41185v.f97155C;
        if (aVar.mo55189b()) {
            str = BankApi.APPLICATIONS_RBS_PROCESS_RBS_RESPONSE;
        } else {
            str = BankApi.APPLICATIONS_RBS_REJECT_RESPONSE;
        }
        String str2 = str;
        ProductConfirmationViewModel S2 = m72152S2();
        PendingProductConfirmationData pendingProductConfirmationData = this.f59090G;
        if (pendingProductConfirmationData == null) {
            C41536l.m120506z("data");
            pendingProductConfirmationData = null;
        }
        long d = pendingProductConfirmationData.mo55155d();
        PendingProductConfirmationData pendingProductConfirmationData2 = this.f59090G;
        if (pendingProductConfirmationData2 == null) {
            C41536l.m120506z("data");
            pendingProductConfirmationData2 = null;
        }
        C41185v e = C41185v.C41187b.m119423e(bVar, str2, S2.mo55182Bw(new PendingProductConfirmationParams(d, pendingProductConfirmationData2.mo55157e(), aVar.mo55189b(), (String) null, (String) null, (String) null, (String) null, 120, (DefaultConstructorMarker) null)), (C41143c) null, 4, (Object) null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        e.mo4576A1(supportFragmentManager, (String) null);
    }

    /* renamed from: a3 */
    private final void m72160a3() {
        C27372n1 n1Var = this.f59091H;
        C27372n1 n1Var2 = null;
        if (n1Var == null) {
            C41536l.m120506z("binding");
            n1Var = null;
        }
        n1Var.f69351i.setOnBottomReachedListener(50, new C22274k(this));
        C27372n1 n1Var3 = this.f59091H;
        if (n1Var3 == null) {
            C41536l.m120506z("binding");
            n1Var3 = null;
        }
        n1Var3.f69347e.setOnClickListener(new C25119a(this));
        C27372n1 n1Var4 = this.f59091H;
        if (n1Var4 == null) {
            C41536l.m120506z("binding");
            n1Var4 = null;
        }
        n1Var4.f69352j.setOnClickListener(new C25120b(this));
        C27372n1 n1Var5 = this.f59091H;
        if (n1Var5 == null) {
            C41536l.m120506z("binding");
            n1Var5 = null;
        }
        n1Var5.f69347e.setText(C32343x.m95388F("product.confirmation.page.accept.contract", new Object[0]));
        C27372n1 n1Var6 = this.f59091H;
        if (n1Var6 == null) {
            C41536l.m120506z("binding");
            n1Var6 = null;
        }
        n1Var6.f69352j.setText(C32343x.m95388F("product.confirmation.page.decline.contract", new Object[0]));
        C27372n1 n1Var7 = this.f59091H;
        if (n1Var7 == null) {
            C41536l.m120506z("binding");
        } else {
            n1Var2 = n1Var7;
        }
        n1Var2.f69359q.mo3946b().setOnClickListener(new C25121c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m72161b3(ProductConfirmationActivity productConfirmationActivity, View view) {
        C41536l.m120489i(productConfirmationActivity, "this$0");
        productConfirmationActivity.m72159Z2(ProductConfirmationViewModel.C22280a.ACCEPT);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m72162c3(ProductConfirmationActivity productConfirmationActivity, View view) {
        C41536l.m120489i(productConfirmationActivity, "this$0");
        productConfirmationActivity.m72159Z2(ProductConfirmationViewModel.C22280a.DECLINE);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m72163d3(ProductConfirmationActivity productConfirmationActivity, View view) {
        C41536l.m120489i(productConfirmationActivity, "this$0");
        C27372n1 n1Var = productConfirmationActivity.f59091H;
        if (n1Var == null) {
            C41536l.m120506z("binding");
            n1Var = null;
        }
        n1Var.f69360r.setVisibility(8);
        productConfirmationActivity.m72152S2().mo55183Cw();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m72164e3() {
        C27372n1 n1Var = this.f59091H;
        C27372n1 n1Var2 = null;
        if (n1Var == null) {
            C41536l.m120506z("binding");
            n1Var = null;
        }
        ConstraintLayout constraintLayout = n1Var.f69349g;
        C41536l.m120488h(constraintLayout, "binding.arrowContainer");
        m72149P2(this, constraintLayout, false, Utils.FLOAT_EPSILON, 4, (Object) null);
        C27372n1 n1Var3 = this.f59091H;
        if (n1Var3 == null) {
            C41536l.m120506z("binding");
            n1Var3 = null;
        }
        BogButton bogButton = n1Var3.f69347e;
        C41536l.m120488h(bogButton, "binding.acceptButton");
        m72149P2(this, bogButton, false, Utils.FLOAT_EPSILON, 6, (Object) null);
        C27372n1 n1Var4 = this.f59091H;
        if (n1Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            n1Var2 = n1Var4;
        }
        BogButton bogButton2 = n1Var2.f69352j;
        C41536l.m120488h(bogButton2, "binding.declineButton");
        m72149P2(this, bogButton2, false, Utils.FLOAT_EPSILON, 6, (Object) null);
    }

    /* renamed from: l1 */
    private final void m72165l1() {
        ProductConfirmationViewModel S2 = m72152S2();
        C21484c.m69411c(S2.mo55188zw(), this, new C22266c(this), new C22267d(this), new C22268e(this));
        C21484c.m69411c(S2.mo55187yw(), this, new C22269f(this), new C22270g(this), new C22271h(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_product_confirmation;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        PendingProductConfirmationData pendingProductConfirmationData = null;
        if (this.f59092I) {
            ProductConfirmationViewModel S2 = m72152S2();
            PendingProductConfirmationData pendingProductConfirmationData2 = this.f59090G;
            if (pendingProductConfirmationData2 == null) {
                C41536l.m120506z("data");
                pendingProductConfirmationData2 = null;
            }
            long d = pendingProductConfirmationData2.mo55155d();
            PendingProductConfirmationData pendingProductConfirmationData3 = this.f59090G;
            if (pendingProductConfirmationData3 == null) {
                C41536l.m120506z("data");
            } else {
                pendingProductConfirmationData = pendingProductConfirmationData3;
            }
            S2.mo55185ow(d, pendingProductConfirmationData.mo55157e(), str, str2, str3);
            return;
        }
        ProductConfirmationViewModel S22 = m72152S2();
        PendingProductConfirmationData pendingProductConfirmationData4 = this.f59090G;
        if (pendingProductConfirmationData4 == null) {
            C41536l.m120506z("data");
            pendingProductConfirmationData4 = null;
        }
        long d2 = pendingProductConfirmationData4.mo55155d();
        PendingProductConfirmationData pendingProductConfirmationData5 = this.f59090G;
        if (pendingProductConfirmationData5 == null) {
            C41536l.m120506z("data");
        } else {
            pendingProductConfirmationData = pendingProductConfirmationData5;
        }
        S22.mo55186uw(d2, pendingProductConfirmationData.mo55157e(), str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        PendingProductConfirmationData pendingProductConfirmationData = (PendingProductConfirmationData) getIntent().getParcelableExtra("ProductConfirmationActivity.EXTRA_CONFIRMATION_DATA");
        if (pendingProductConfirmationData == null) {
            finish();
            return;
        }
        this.f59090G = pendingProductConfirmationData;
        C27372n1 a = C27372n1.m84796a(findViewById(C10322k.product_confirmation_container));
        C41536l.m120488h(a, "bind(findViewById(R.id.p…_confirmation_container))");
        this.f59091H = a;
        ProductConfirmationViewModel S2 = m72152S2();
        PendingProductConfirmationData pendingProductConfirmationData2 = this.f59090G;
        if (pendingProductConfirmationData2 == null) {
            C41536l.m120506z("data");
            pendingProductConfirmationData2 = null;
        }
        S2.mo55184Jw(pendingProductConfirmationData2);
        m72160a3();
        m72165l1();
        m72152S2().mo55183Cw();
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C32297d.m95154b(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m72155V2(z);
    }
}
