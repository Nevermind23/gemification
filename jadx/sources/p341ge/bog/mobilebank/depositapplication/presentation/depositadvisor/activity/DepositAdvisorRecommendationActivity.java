package p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity;

import a81.C30772sa;
import ab0.C19218a;
import ab0.C19219b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import g91.C32343x;
import ha0.C24930g;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ka0.C25695d;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.depositheader.DepositHeaderView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.depositadvisor.viewmodel.DepositAdvisorRecommendationViewModel$ViewModel;
import p380ck.C10464h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorRecommendationActivity */
public final class DepositAdvisorRecommendationActivity extends C30772sa {

    /* renamed from: H */
    public static final C22928a f60334H = new C22928a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C24930g f60335F;

    /* renamed from: G */
    private final C41217g f60336G = new C1617p0(C41520a0.m120436b(DepositAdvisorRecommendationViewModel$ViewModel.class), new C22933f(this), new C22932e(this), new C22934g((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorRecommendationActivity$a */
    public static final class C22928a {
        private C22928a() {
        }

        public /* synthetic */ C22928a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo57054a(Context context, ArrayList arrayList, C25695d dVar, Long l) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(arrayList, "deposits");
            C41536l.m120489i(dVar, "recommendedDepositType");
            Intent intent = new Intent(context, DepositAdvisorRecommendationActivity.class);
            intent.putParcelableArrayListExtra("EXTRA_DEPOSITS", arrayList);
            intent.putExtra("EXTRA_RECOMMENDED_DEPOSIT", dVar);
            intent.putExtra("EXTRA_DEPOSIT_PURPOSE", l);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorRecommendationActivity$b */
    static final class C22929b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositAdvisorRecommendationActivity f60337d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22929b(DepositAdvisorRecommendationActivity depositAdvisorRecommendationActivity) {
            super(1);
            this.f60337d = depositAdvisorRecommendationActivity;
        }

        /* renamed from: a */
        public final void mo57055a(List list) {
            C24930g G2 = this.f60337d.f60335F;
            if (G2 == null) {
                C41536l.m120506z("binding");
                G2 = null;
            }
            DepositHeaderView depositHeaderView = G2.f64117e;
            C41536l.m120488h(list, "deposits");
            depositHeaderView.setMultipleDeposit(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57055a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorRecommendationActivity$c */
    static final class C22930c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositAdvisorRecommendationActivity f60338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22930c(DepositAdvisorRecommendationActivity depositAdvisorRecommendationActivity) {
            super(1);
            this.f60338d = depositAdvisorRecommendationActivity;
        }

        /* renamed from: a */
        public final void mo57056a(C37223a aVar) {
            DepositAdvisorRecommendationViewModel$ViewModel.C22935a aVar2 = (DepositAdvisorRecommendationViewModel$ViewModel.C22935a) aVar.mo90296a();
            if (aVar2 != null) {
                this.f60338d.m74328M2(aVar2);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57056a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorRecommendationActivity$d */
    static final class C22931d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60339a;

        C22931d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60339a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60339a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60339a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorRecommendationActivity$e */
    public static final class C22932e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60340d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22932e(ComponentActivity componentActivity) {
            super(0);
            this.f60340d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f60340d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorRecommendationActivity$f */
    public static final class C22933f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60341d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22933f(ComponentActivity componentActivity) {
            super(0);
            this.f60341d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60341d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositadvisor.activity.DepositAdvisorRecommendationActivity$g */
    public static final class C22934g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60342d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60343e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22934g(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60342d = aVar;
            this.f60343e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60342d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60343e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: I2 */
    private final DepositAdvisorRecommendationViewModel$ViewModel m74324I2() {
        return (DepositAdvisorRecommendationViewModel$ViewModel) this.f60336G.getValue();
    }

    /* renamed from: J2 */
    private final void m74325J2() {
        m74324I2().mo57063gw().mo57064h0().mo4819k(this, new C22931d(new C22929b(this)));
        m74324I2().mo57063gw().mo57059A0().mo4819k(this, new C22931d(new C22930c(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m74326K2(DepositAdvisorRecommendationActivity depositAdvisorRecommendationActivity, String str) {
        C41536l.m120489i(depositAdvisorRecommendationActivity, "this$0");
        C41536l.m120489i(str, "id");
        depositAdvisorRecommendationActivity.m74324I2().mo57061ew().mo48331M0(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m74327L2(DepositAdvisorRecommendationActivity depositAdvisorRecommendationActivity, View view) {
        C41536l.m120489i(depositAdvisorRecommendationActivity, "this$0");
        depositAdvisorRecommendationActivity.m74324I2().mo57061ew().mo48330Il();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final void m74328M2(DepositAdvisorRecommendationViewModel$ViewModel.C22935a aVar) {
        ArrayList a = aVar.mo57066a();
        C25695d b = aVar.mo57067b();
        Long c = aVar.mo57068c();
        C32343x.m95393H0(this, "deposit_application", b.toString(), "deposit_advisor_continue_to_open", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        DepositApplicationActivity.f60098K.mo56778a(this, a, b, c);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C25695d dVar;
        C24930g d = C24930g.m79700d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f60335F = d;
        C24930g gVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m74325J2();
        Intent intent = getIntent();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_DEPOSITS");
        Serializable serializableExtra = intent.getSerializableExtra("EXTRA_RECOMMENDED_DEPOSIT");
        if (serializableExtra instanceof C25695d) {
            dVar = (C25695d) serializableExtra;
        } else {
            dVar = null;
        }
        long longExtra = intent.getLongExtra("EXTRA_DEPOSIT_PURPOSE", -1);
        if (parcelableArrayListExtra == null) {
            finish();
            return;
        }
        C32343x.m95393H0(this, "deposit_application", String.valueOf(dVar), "deposit_advisor_recommended_deposit", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
        m74324I2().mo57065hw(parcelableArrayListExtra, dVar, longExtra);
        C24930g gVar2 = this.f60335F;
        if (gVar2 == null) {
            C41536l.m120506z("binding");
        } else {
            gVar = gVar2;
        }
        PageDescriptionView pageDescriptionView = gVar.f64118f;
        pageDescriptionView.setTitle(C32343x.m95388F("applications.deposits.recommended.deposit.main.text", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("applications.deposits.recommended.deposit.info.text", new Object[0]));
        DepositHeaderView depositHeaderView = gVar.f64117e;
        depositHeaderView.setAnnualInterestRateTitle(C32343x.m95388F("applications.deposits.recommended.deposit.int.rate.label", new Object[0]));
        depositHeaderView.setEffectiveInterestRateTitle(C32343x.m95388F("applications.deposits.recommended.deposit.IRR.rate.label", new Object[0]));
        depositHeaderView.setDepositSelectionListener(new C19218a(this));
        Button mainButton = gVar.f64117e.getMainButton();
        mainButton.setButtonText(C32343x.m95388F("applications.deposits.I.main.button.label", new Object[0]));
        mainButton.setOnClickListener(new C19219b(this));
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("applications.deposits.main.page.header", new Object[0]);
    }
}
