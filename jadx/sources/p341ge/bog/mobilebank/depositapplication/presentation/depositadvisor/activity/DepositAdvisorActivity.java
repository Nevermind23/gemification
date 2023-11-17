package p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.C1493e0;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import cb0.C19686b;
import da0.C19947a;
import db0.C19956a;
import db0.C19960e;
import g91.C32343x;
import ha0.C24929f;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorViewModel$ViewModel;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity */
public final class DepositAdvisorActivity extends C30772sa {

    /* renamed from: H */
    public static final C22921a f60324H = new C22921a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C24929f f60325F;

    /* renamed from: G */
    private final C41217g f60326G = new C1617p0(C41520a0.m120436b(DepositAdvisorViewModel$ViewModel.class), new C22926f(this), new C22925e(this), new C22927g((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity$a */
    public static final class C22921a {
        private C22921a() {
        }

        public /* synthetic */ C22921a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo57049a(Context context, ArrayList arrayList) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(arrayList, "deposits");
            Intent intent = new Intent(context, DepositAdvisorActivity.class);
            intent.putParcelableArrayListExtra("EXTRA_DEPOSITS", arrayList);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity$b */
    static final class C22922b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositAdvisorActivity f60327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22922b(DepositAdvisorActivity depositAdvisorActivity) {
            super(1);
            this.f60327d = depositAdvisorActivity;
        }

        /* renamed from: a */
        public final void mo57050a(C37223a aVar) {
            C19956a aVar2 = (C19956a) aVar.mo90296a();
            if (aVar2 != null) {
                this.f60327d.m74312H2(aVar2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57050a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity$c */
    static final class C22923c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositAdvisorActivity f60328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22923c(DepositAdvisorActivity depositAdvisorActivity) {
            super(1);
            this.f60328d = depositAdvisorActivity;
        }

        /* renamed from: a */
        public final void mo57051a(C37223a aVar) {
            DepositAdvisorViewModel$ViewModel.C22942f fVar = (DepositAdvisorViewModel$ViewModel.C22942f) aVar.mo90296a();
            if (fVar != null) {
                this.f60328d.m74314J2(fVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57051a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity$d */
    static final class C22924d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60329a;

        C22924d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60329a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60329a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60329a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity$e */
    public static final class C22925e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22925e(ComponentActivity componentActivity) {
            super(0);
            this.f60330d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f60330d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity$f */
    public static final class C22926f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60331d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22926f(ComponentActivity componentActivity) {
            super(0);
            this.f60331d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60331d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorActivity$g */
    public static final class C22927g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60332d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60333e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22927g(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60332d = aVar;
            this.f60333e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60332d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60333e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: G2 */
    private final DepositAdvisorViewModel$ViewModel m74311G2() {
        return (DepositAdvisorViewModel$ViewModel) this.f60326G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public final void m74312H2(C19956a aVar) {
        C1493e0 t = getSupportFragmentManager().mo4428p().mo4641t(C19947a.enter_from_right, C19947a.exit_to_left);
        C24929f fVar = this.f60325F;
        if (fVar == null) {
            C41536l.m120506z("binding");
            fVar = null;
        }
        C1493e0 r = t.mo4639r(fVar.f64114e.getId(), C19686b.f54023g.mo47886a(aVar));
        List y0 = getSupportFragmentManager().mo4446y0();
        C41536l.m120488h(y0, "supportFragmentManager.fragments");
        if (!y0.isEmpty()) {
            r.mo4636g((String) null);
        }
        r.mo4515i();
    }

    /* renamed from: I2 */
    private final void m74313I2() {
        m74311G2().mo57073Bw().mo57078lm().mo4819k(this, new C22924d(new C22922b(this)));
        m74311G2().mo57073Bw().mo57076Pb().mo4819k(this, new C22924d(new C22923c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m74314J2(DepositAdvisorViewModel$ViewModel.C22942f fVar) {
        ArrayList a = fVar.mo57085a();
        DepositAdvisorRecommendationActivity.f60334H.mo57054a(this, new ArrayList(a), fVar.mo57086b(), fVar.mo57087c());
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C24929f d = C24929f.m79695d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f60325F = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m74313I2();
        C19960e yw = m74311G2().mo57079yw();
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("EXTRA_DEPOSITS");
        if (parcelableArrayListExtra == null) {
            finish();
        } else {
            yw.mo48335g7(parcelableArrayListExtra);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("applications.deposits.main.page.header", new Object[0]);
    }
}
