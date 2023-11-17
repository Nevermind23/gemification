package p341ge.bog.mobilebank.products.presentation.details.pension;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import hy0.C36267a;
import hy0.C36270d;
import hy0.C36274h;
import iy0.C36611l;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p394dj.C12132a;
import p394dj.C12138g;
import p617ti.C17966a;
import ue1.C43064a;
import ue1.C43075l;
import uz0.C39179a;
import uz0.C39180b;
import uz0.C39181c;
import uz0.C39182d;
import uz0.C39183e;
import uz0.C39184f;
import uz0.C39187i;
import xy0.C39960x;

/* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity */
public final class PensionDetailsActivity extends C34261a {

    /* renamed from: I */
    public static final C34248a f83120I = new C34248a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C36611l f83121G;

    /* renamed from: H */
    private final C41217g f83122H = new C1617p0(C41520a0.m120436b(PensionDetailsViewModel$ViewModel.class), new C34256i(this), new C34255h(this), new C34257j((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$a */
    public static final class C34248a {
        private C34248a() {
        }

        public /* synthetic */ C34248a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo82625a(Context context, C0173b bVar) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(bVar, "launcher");
            bVar.mo404a(new Intent(context, PensionDetailsActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$b */
    static final class C34249b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PensionDetailsActivity f83123d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34249b(PensionDetailsActivity pensionDetailsActivity) {
            super(1);
            this.f83123d = pensionDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82626a(C31128a aVar) {
            PensionDetailsActivity pensionDetailsActivity = this.f83123d;
            C41536l.m120488h(aVar, "result");
            pensionDetailsActivity.m100729O2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82626a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$c */
    static final class C34250c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PensionDetailsActivity f83124d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34250c(PensionDetailsActivity pensionDetailsActivity) {
            super(1);
            this.f83124d = pensionDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82627a(C31128a aVar) {
            PensionDetailsActivity pensionDetailsActivity = this.f83124d;
            C41536l.m120488h(aVar, "result");
            pensionDetailsActivity.m100730P2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82627a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$d */
    static final class C34251d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PensionDetailsActivity f83125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34251d(PensionDetailsActivity pensionDetailsActivity) {
            super(1);
            this.f83125d = pensionDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82628a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f83125d.setResult(-1);
            this.f83125d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82628a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$e */
    static final class C34252e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PensionDetailsActivity f83126d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34252e(PensionDetailsActivity pensionDetailsActivity) {
            super(1);
            this.f83126d = pensionDetailsActivity;
        }

        /* renamed from: a */
        public final void mo82629a(C41238w wVar) {
            C36611l K2 = this.f83126d.f83121G;
            C36611l lVar = null;
            if (K2 == null) {
                C41536l.m120506z("binding");
                K2 = null;
            }
            K2.f88313k.setBackgroundColor(C36267a.color_black_tr_100);
            C36611l K22 = this.f83126d.f83121G;
            if (K22 == null) {
                C41536l.m120506z("binding");
            } else {
                lVar = K22;
            }
            FrameLayout frameLayout = lVar.f88313k;
            C41536l.m120488h(frameLayout, "binding.progressBarContainer");
            C32343x.m95447f1(frameLayout);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82629a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$f */
    static final class C34253f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PensionDetailsActivity f83127d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34253f(PensionDetailsActivity pensionDetailsActivity) {
            super(1);
            this.f83127d = pensionDetailsActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f83127d.mo74709H1(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$g */
    static final class C34254g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83128a;

        C34254g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83128a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83128a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83128a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$h */
    public static final class C34255h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83129d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34255h(ComponentActivity componentActivity) {
            super(0);
            this.f83129d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83129d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$i */
    public static final class C34256i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34256i(ComponentActivity componentActivity) {
            super(0);
            this.f83130d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83130d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity$j */
    public static final class C34257j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83131d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83132e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34257j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83131d = aVar;
            this.f83132e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83131d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83132e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: N2 */
    private final PensionDetailsViewModel$ViewModel m100728N2() {
        return (PensionDetailsViewModel$ViewModel) this.f83122H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final void m100729O2(C31128a aVar) {
        Double d;
        C36611l lVar = null;
        if (aVar instanceof C31128a.C31131c) {
            C36611l lVar2 = this.f83121G;
            if (lVar2 == null) {
                C41536l.m120506z("binding");
                lVar2 = null;
            }
            FrameLayout frameLayout = lVar2.f88313k;
            C41536l.m120488h(frameLayout, "binding.progressBarContainer");
            C32343x.m95455i0(frameLayout);
            BigDecimal a = ((C39960x) ((C31128a.C31131c) aVar).mo71340a()).mo93788a();
            if (a != null) {
                d = Double.valueOf(a.doubleValue());
            } else {
                d = null;
            }
            C41536l.m120486f(d);
            C17966a aVar2 = new C17966a(d.doubleValue(), "GEL");
            C36611l lVar3 = this.f83121G;
            if (lVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                lVar = lVar3;
            }
            lVar.f88310h.setData(new C12132a(C32343x.m95388F("text.widget.georgian.pension.funds.total.saving", new Object[0]), C41339p.m119900e(aVar2), (List) null, (TextProgressBarView.ProgressModel) null, (C12138g) null, false, false, 92, (DefaultConstructorMarker) null));
        } else if (aVar instanceof C31128a.C31129a) {
            mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            C36611l lVar4 = this.f83121G;
            if (lVar4 == null) {
                C41536l.m120506z("binding");
            } else {
                lVar = lVar4;
            }
            CardView cardView = lVar.f88315m;
            C41536l.m120488h(cardView, "binding.retryButtonContainer");
            C32343x.m95447f1(cardView);
        } else if (aVar instanceof C31128a.C31130b) {
            C36611l lVar5 = this.f83121G;
            if (lVar5 == null) {
                C41536l.m120506z("binding");
            } else {
                lVar = lVar5;
            }
            FrameLayout frameLayout2 = lVar.f88313k;
            C41536l.m120488h(frameLayout2, "binding.progressBarContainer");
            C32343x.m95447f1(frameLayout2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m100730P2(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C34251d(this), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C34252e(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C34253f(this), 1, (Object) null);
    }

    /* renamed from: Q2 */
    private final void m100731Q2(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C32343x.m95388F(str, new Object[0]))));
        } catch (Exception unused) {
        }
    }

    /* renamed from: R2 */
    private final void m100732R2() {
        C36611l lVar = this.f83121G;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        lVar.f88316n.setOnScrollChangeListener(new C39179a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m100733S2(PensionDetailsActivity pensionDetailsActivity, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        C41536l.m120489i(pensionDetailsActivity, "this$0");
        C41536l.m120489i(nestedScrollView, "<anonymous parameter 0>");
        C36611l lVar = pensionDetailsActivity.f83121G;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        ToolbarView toolbarView = lVar.f88317o.f68494e;
        boolean z = true;
        if (i2 <= 1) {
            z = false;
        }
        C41536l.m120488h(toolbarView, "setToolbarAnimation$lambda$9$lambda$8");
        ToolbarView.m50857i0(toolbarView, z, false, 2, (Object) null);
    }

    /* renamed from: T2 */
    private final void m100734T2() {
        C36611l lVar = this.f83121G;
        C36611l lVar2 = null;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        lVar.f88311i.setTitle(getString(C36274h.f87575o));
        lVar.f88310h.setThumbnailImageDrawable(getDrawable(C36270d.ic_pensions_img));
        lVar.f88310h.setHeaderType(NewProductHeaderView.C13482a.COLOR);
        lVar.f88310h.setThumbnailImageSize(NewProductHeaderView.C13483b.LARGE);
        lVar.f88308f.setButtonText(getString(C36274h.f87561B));
        lVar.f88312j.setText(C32343x.m95388F("text.georgian.pension.funds.meaning", new Object[0]));
        lVar.f88309g.setOnClickListener(new C39180b(this));
        lVar.f88309g.setButtonText(C32343x.m95388F("link.georgian.pension.funds.website.title", new Object[0]));
        lVar.f88308f.setOnClickListener(new C39181c(this));
        C36611l lVar3 = this.f83121G;
        if (lVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            lVar2 = lVar3;
        }
        lVar2.f88314l.mo3946b().setOnClickListener(new C39182d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m100735U2(PensionDetailsActivity pensionDetailsActivity, View view) {
        C41536l.m120489i(pensionDetailsActivity, "this$0");
        pensionDetailsActivity.m100731Q2("link.georgian.pension.funds.website");
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m100736V2(PensionDetailsActivity pensionDetailsActivity, View view) {
        C41536l.m120489i(pensionDetailsActivity, "this$0");
        pensionDetailsActivity.m100738X2();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m100737W2(PensionDetailsActivity pensionDetailsActivity, View view) {
        C41536l.m120489i(pensionDetailsActivity, "this$0");
        C21481a.onRefresh$default(pensionDetailsActivity.m100728N2(), 0, 1, (Object) null);
    }

    /* renamed from: X2 */
    private final void m100738X2() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_CLOSE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("text.georgian.pension.funds.title", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("text.georgian.pension.funds.disable.question", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("text.georgian.pension.funds.hide.N", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("text.georgian.pension.funds.hide.Y", new Object[0]));
        dVar.mo35645Y1(new C39183e(dVar));
        dVar.mo35641T1(new C39184f(this, dVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m100739Y2(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m100740Z2(PensionDetailsActivity pensionDetailsActivity, C13310d dVar, Button button) {
        C41536l.m120489i(pensionDetailsActivity, "this$0");
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        pensionDetailsActivity.m100728N2().mo82636hw().mo82633Fa();
        dVar.mo4577k1();
    }

    /* renamed from: l1 */
    private final void m100741l1() {
        C39187i iw = m100728N2().mo82637iw();
        iw.getPensionAmount().mo4819k(this, new C34254g(new C34249b(this)));
        iw.mo82634ff().mo4819k(this, new C34254g(new C34250c(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C36611l d = C36611l.m108576d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f83121G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m100732R2();
        m100734T2();
        m100741l1();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.georgian.pension.funds.title", new Object[0]);
    }
}
