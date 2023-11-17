package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result;

import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.TermsAndConditionsActivity;
import ue0.C28762y;
import ue1.C43064a;
import ue1.C43075l;
import zf0.C30291a;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultActivity */
public final class IdentomatResultActivity extends C23578a {

    /* renamed from: K */
    public static final C23571a f61524K = new C23571a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C28762y f61525I;

    /* renamed from: J */
    private final C41217g f61526J = new C1617p0(C41520a0.m120436b(IdentomatResultViewModel$ViewModel.class), new C23575e(this), new C23574d(this), new C23576f((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultActivity$a */
    public static final class C23571a {
        private C23571a() {
        }

        public /* synthetic */ C23571a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultActivity$b */
    static final class C23572b implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61527a;

        C23572b(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61527a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61527a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61527a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultActivity$c */
    static final class C23573c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentomatResultActivity f61528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23573c(IdentomatResultActivity identomatResultActivity) {
            super(1);
            this.f61528d = identomatResultActivity;
        }

        /* renamed from: a */
        public final void mo60461a(C31128a aVar) {
            this.f61528d.m76256M2().mo60464hw().mo60462D().mo4825q(this.f61528d);
            C28762y yVar = null;
            if (aVar instanceof C31128a.C31131c) {
                C28762y J2 = this.f61528d.f61525I;
                if (J2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    yVar = J2;
                }
                yVar.f73539h.setLoading(false);
                IdentomatResultActivity identomatResultActivity = this.f61528d;
                identomatResultActivity.mo67715G2(TermsAndConditionsActivity.f61636M.mo60510a(identomatResultActivity));
            } else if (aVar instanceof C31128a.C31129a) {
                C28762y J22 = this.f61528d.f61525I;
                if (J22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    yVar = J22;
                }
                yVar.f73539h.setLoading(false);
                this.f61528d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31130b) {
                C28762y J23 = this.f61528d.f61525I;
                if (J23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    yVar = J23;
                }
                yVar.f73539h.setLoading(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60461a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultActivity$d */
    public static final class C23574d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23574d(ComponentActivity componentActivity) {
            super(0);
            this.f61529d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61529d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultActivity$e */
    public static final class C23575e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61530d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23575e(ComponentActivity componentActivity) {
            super(0);
            this.f61530d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61530d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.IdentomatResultActivity$f */
    public static final class C23576f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61531d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61532e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23576f(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61531d = aVar;
            this.f61532e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61531d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61532e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final IdentomatResultViewModel$ViewModel m76256M2() {
        return (IdentomatResultViewModel$ViewModel) this.f61526J.getValue();
    }

    /* renamed from: N2 */
    private final void m76257N2() {
        C28762y yVar = this.f61525I;
        if (yVar == null) {
            C41536l.m120506z("binding");
            yVar = null;
        }
        yVar.f73539h.setOnClickListener(new C30291a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m76258O2(IdentomatResultActivity identomatResultActivity, View view) {
        C41536l.m120489i(identomatResultActivity, "this$0");
        C28762y yVar = identomatResultActivity.f61525I;
        if (yVar == null) {
            C41536l.m120506z("binding");
            yVar = null;
        }
        if (!yVar.f73539h.getLoading() && !identomatResultActivity.m76256M2().mo60464hw().mo60462D().mo4817i()) {
            identomatResultActivity.m76256M2().mo60464hw().mo60462D().mo4819k(identomatResultActivity, new C23572b(new C23573c(identomatResultActivity)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28762y d = C28762y.m88182d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61525I = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        m76257N2();
    }
}
