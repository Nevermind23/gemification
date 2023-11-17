package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import bg0.C19379b;
import cg0.C19737a;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailinput.GTOnboardingMailInputActivity;
import p380ck.C10463g;
import p380ck.C10464h;
import ue0.C28764z;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity */
public final class GTOnboardingIntroActivity extends C23609b {

    /* renamed from: L */
    public static final C23600a f61577L = new C23600a((DefaultConstructorMarker) null);

    /* renamed from: I */
    private final C41217g f61578I = C41219i.m119470b(new C23602c(this));

    /* renamed from: J */
    private final C41217g f61579J = new C1617p0(C41520a0.m120436b(GTOnboardingIntroViewModel$ViewModel.class), new C23606g(this), new C23605f(this), new C23607h((C43064a) null, this));

    /* renamed from: K */
    private final C41217g f61580K = C41219i.m119470b(new C23601b(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity$a */
    public static final class C23600a {
        private C23600a() {
        }

        public /* synthetic */ C23600a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60478a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, GTOnboardingIntroActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity$b */
    static final class C23601b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingIntroActivity f61581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23601b(GTOnboardingIntroActivity gTOnboardingIntroActivity) {
            super(0);
            this.f61581d = gTOnboardingIntroActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m76327c(GTOnboardingIntroActivity gTOnboardingIntroActivity, boolean z, boolean z2) {
            boolean z3;
            C41536l.m120489i(gTOnboardingIntroActivity, "this$0");
            Button button = gTOnboardingIntroActivity.m76320N2().f73548f.getButton();
            if (!z || !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            button.setEnabled(z3);
        }

        /* renamed from: b */
        public final C19737a invoke() {
            return new C19737a(new C23608a(this.f61581d));
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity$c */
    static final class C23602c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingIntroActivity f61582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23602c(GTOnboardingIntroActivity gTOnboardingIntroActivity) {
            super(0);
            this.f61582d = gTOnboardingIntroActivity;
        }

        /* renamed from: b */
        public final C28764z invoke() {
            return C28764z.m88191d(this.f61582d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity$d */
    /* synthetic */ class C23603d extends C41535k implements C43075l {
        C23603d(Object obj) {
            super(1, obj, C19737a.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo60481b(List list) {
            ((C19737a) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60481b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity$e */
    static final class C23604e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61583a;

        C23604e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61583a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61583a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61583a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity$f */
    public static final class C23605f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23605f(ComponentActivity componentActivity) {
            super(0);
            this.f61584d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61584d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity$g */
    public static final class C23606g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61585d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23606g(ComponentActivity componentActivity) {
            super(0);
            this.f61585d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61585d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.GTOnboardingIntroActivity$h */
    public static final class C23607h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61586d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61587e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23607h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61586d = aVar;
            this.f61587e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61586d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61587e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: K2 */
    private final void m76317K2() {
        m76320N2().f73548f.getButton().setOnClickListener(new C19379b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m76318L2(GTOnboardingIntroActivity gTOnboardingIntroActivity, View view) {
        C41536l.m120489i(gTOnboardingIntroActivity, "this$0");
        C32054a.C32059e eVar = C32054a.C32059e.f78901f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(eVar, F, " ", " ");
        gTOnboardingIntroActivity.mo67715G2(GTOnboardingMailInputActivity.f61415J.mo60364a(gTOnboardingIntroActivity));
        C32343x.m95393H0(gTOnboardingIntroActivity, "gt_trading_onboarding", (String) null, "rules_page_click", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
    }

    /* renamed from: M2 */
    private final C19737a m76319M2() {
        return (C19737a) this.f61580K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final C28764z m76320N2() {
        return (C28764z) this.f61578I.getValue();
    }

    /* renamed from: O2 */
    private final GTOnboardingIntroViewModel$ViewModel m76321O2() {
        return (GTOnboardingIntroViewModel$ViewModel) this.f61579J.getValue();
    }

    /* renamed from: P2 */
    private final void m76322P2() {
        m76321O2().mo60486gw().mo47603n3().mo4819k(this, new C23604e(new C23603d(m76319M2())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m76320N2());
        m76320N2().f73548f.setEnabled(false);
        m76320N2().f73547e.setAdapter(m76319M2());
        m76317K2();
        m76322P2();
        m76321O2().mo60484ew().mo47602G1();
        m76320N2().f73548f.getButton().setEnabled(false);
        m76320N2().f73548f.getButton().setButtonText(C32343x.m95388F("gt.terms.page.button.registration", new Object[0]));
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("gt.terms.page.header", new Object[0]);
    }
}
