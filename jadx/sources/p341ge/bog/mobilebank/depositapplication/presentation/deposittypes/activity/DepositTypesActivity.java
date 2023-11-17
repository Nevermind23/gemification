package p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g91.C32343x;
import ha0.C24934k;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import ka0.C25695d;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import mb0.C26178a;
import mb0.C26179b;
import nb0.C26397b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.viewmodel.DepositTypesViewModel$ViewModel;
import p380ck.C10464h;
import qb0.C27766a;
import qb0.C27767b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity */
public final class DepositTypesActivity extends C30772sa {

    /* renamed from: I */
    public static final C22982a f60461I = new C22982a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C24934k f60462F;

    /* renamed from: G */
    private final C41217g f60463G = new C1617p0(C41520a0.m120436b(DepositTypesViewModel$ViewModel.class), new C22989h(this), new C22988g(this), new C22990i((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C26397b f60464H = new C26397b();

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$a */
    public static final class C22982a {
        private C22982a() {
        }

        public /* synthetic */ C22982a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo57195a(Context context, String str) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, DepositTypesActivity.class);
            intent.putExtra("EXTRA_DEPOSIT_TYPE", str);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$b */
    /* synthetic */ class C22983b implements C26397b.C26399b, C41532h {

        /* renamed from: a */
        final /* synthetic */ C27767b f60465a;

        C22983b(C27767b bVar) {
            this.f60465a = bVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C26397b.C26399b) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return new C41535k(1, this.f60465a, C27767b.class, "onDepositClick", "onDepositClick(Lge/bog/mobilebank/depositapplication/domain/model/DepositType;)V", 0);
        }

        /* renamed from: h1 */
        public final void mo57197h1(C25695d dVar) {
            C41536l.m120489i(dVar, "p0");
            this.f60465a.mo57238h1(dVar);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$c */
    static final class C22984c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositTypesActivity f60466d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22984c(DepositTypesActivity depositTypesActivity) {
            super(1);
            this.f60466d = depositTypesActivity;
        }

        /* renamed from: a */
        public final void mo57199a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f60466d.mo86441o2();
            } else if (aVar instanceof C31128a.C31131c) {
                this.f60466d.mo86425J1();
                this.f60466d.f60464H.mo6029i((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                this.f60466d.mo86425J1();
                this.f60466d.m74530N2(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57199a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$d */
    static final class C22985d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositTypesActivity f60467d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22985d(DepositTypesActivity depositTypesActivity) {
            super(1);
            this.f60467d = depositTypesActivity;
        }

        /* renamed from: a */
        public final void mo57200a(C37223a aVar) {
            C27766a aVar2 = (C27766a) aVar.mo90296a();
            if (aVar2 != null) {
                DepositTypesActivity depositTypesActivity = this.f60467d;
                DepositApplicationActivity.C22794a.m73981b(DepositApplicationActivity.f60098K, depositTypesActivity, aVar2.mo67312a(), aVar2.mo67314c(), (Long) null, 8, (Object) null);
                if (aVar2.mo67313b()) {
                    depositTypesActivity.finish();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57200a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$e */
    static final class C22986e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositTypesActivity f60468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22986e(DepositTypesActivity depositTypesActivity) {
            super(1);
            this.f60468d = depositTypesActivity;
        }

        /* renamed from: a */
        public final void mo57201a(C37223a aVar) {
            List list = (List) aVar.mo90296a();
            if (list != null) {
                DepositAdvisorActivity.f60324H.mo57049a(this.f60468d, new ArrayList(list));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57201a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$f */
    static final class C22987f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60469a;

        C22987f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60469a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60469a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60469a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$g */
    public static final class C22988g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22988g(ComponentActivity componentActivity) {
            super(0);
            this.f60470d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f60470d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$h */
    public static final class C22989h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22989h(ComponentActivity componentActivity) {
            super(0);
            this.f60471d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60471d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity$i */
    public static final class C22990i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60472d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22990i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60472d = aVar;
            this.f60473e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60472d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60473e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: I2 */
    private final DepositTypesViewModel$ViewModel m74525I2() {
        return (DepositTypesViewModel$ViewModel) this.f60463G.getValue();
    }

    /* renamed from: J2 */
    private final void m74526J2() {
        C24934k kVar = this.f60462F;
        if (kVar == null) {
            C41536l.m120506z("binding");
            kVar = null;
        }
        kVar.f64179f.setAdapter(this.f60464H);
        kVar.f64179f.setHasFixedSize(true);
        this.f60464H.mo65637n(new C26178a(this));
        this.f60464H.mo65638o(new C22983b(m74525I2().mo57240mw()));
        kVar.f64180g.mo3946b().setOnClickListener(new C26179b(kVar, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m74527K2(DepositTypesActivity depositTypesActivity) {
        C41536l.m120489i(depositTypesActivity, "this$0");
        C32343x.m95393H0(depositTypesActivity, "deposit_application", (String) null, "deposit_advisor_button_click", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        depositTypesActivity.m74525I2().mo57240mw().mo57239k3();
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m74528L2(C24934k kVar, DepositTypesActivity depositTypesActivity, View view) {
        C41536l.m120489i(kVar, "$this_with");
        C41536l.m120489i(depositTypesActivity, "this$0");
        FrameLayout frameLayout = kVar.f64181h;
        C41536l.m120488h(frameLayout, "retryButtonContainer");
        C32343x.m95455i0(frameLayout);
        C21481a.onRefresh$default(depositTypesActivity.m74525I2(), 0, 1, (Object) null);
    }

    /* renamed from: M2 */
    private final void m74529M2() {
        m74525I2().mo57243pw().mo57245r1().mo4819k(this, new C22987f(new C22984c(this)));
        m74525I2().mo57243pw().mo57237A0().mo4819k(this, new C22987f(new C22985d(this)));
        m74525I2().mo57243pw().mo57247zq().mo4819k(this, new C22987f(new C22986e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m74530N2(Throwable th) {
        C24934k kVar = this.f60462F;
        if (kVar == null) {
            C41536l.m120506z("binding");
            kVar = null;
        }
        FrameLayout frameLayout = kVar.f64181h;
        C41536l.m120488h(frameLayout, "binding.retryButtonContainer");
        C32343x.m95447f1(frameLayout);
        mo74709H1(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C24934k d = C24934k.m79720d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f60462F = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m74525I2().mo57246uw(getIntent().getStringExtra("EXTRA_DEPOSIT_TYPE"));
        m74529M2();
        m74526J2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("applications.deposits.main.page.header", new Object[0]);
    }
}
