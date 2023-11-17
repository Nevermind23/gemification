package p341ge.bog.mobilebank.products.presentation.cardinsurance.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b41.C31128a;
import b41.C31132b;
import bz0.C31226f;
import cz0.C31510j;
import cz0.C31511k;
import dz0.C31632d;
import g91.C32343x;
import gz0.C36137y;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import iy0.C36602i;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusUiModel;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.viwmodel.CardInsuranceStatusesViewModel$ViewModel;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity */
public final class CardInsuranceStatusesActivity extends C33882b {

    /* renamed from: J */
    public static final C33866a f82463J = new C33866a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f82464G = C41219i.m119470b(new C33872f(this));

    /* renamed from: H */
    private final C41217g f82465H = new C1617p0(C41520a0.m120436b(CardInsuranceStatusesViewModel$ViewModel.class), new C33878l(this), new C33877k(this), new C33879m((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f82466I = C41219i.m119470b(new C33867b(this));

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$a */
    public static final class C33866a {
        private C33866a() {
        }

        public /* synthetic */ C33866a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo82043a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, CardInsuranceStatusesActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$b */
    static final class C33867b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceStatusesActivity f82467d;

        /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$b$a */
        /* synthetic */ class C33868a extends C41535k implements C43075l {
            C33868a(Object obj) {
                super(1, obj, CardInsuranceStatusesViewModel$ViewModel.class, "onCardClicked", "onCardClicked(J)V", 0);
            }

            /* renamed from: b */
            public final void mo82045b(long j) {
                ((CardInsuranceStatusesViewModel$ViewModel) this.receiver).mo82084jw(j);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo82045b(((Number) obj).longValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33867b(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            super(0);
            this.f82467d = cardInsuranceStatusesActivity;
        }

        /* renamed from: b */
        public final C31632d invoke() {
            return new C31632d(new C33868a(this.f82467d.m99617Q2()));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$c */
    /* synthetic */ class C33869c extends C41535k implements C43075l {
        C33869c(Object obj) {
            super(1, obj, CardInsuranceStatusesActivity.class, "onCardInsuranceDataResult", "onCardInsuranceDataResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo82046b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CardInsuranceStatusesActivity) this.receiver).m99618R2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82046b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$d */
    static final class C33870d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceStatusesActivity f82468d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33870d(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            super(1);
            this.f82468d = cardInsuranceStatusesActivity;
        }

        /* renamed from: a */
        public final void mo82047a(CardInsuranceStatusUiModel cardInsuranceStatusUiModel) {
            C41536l.m120489i(cardInsuranceStatusUiModel, "it");
            CardInsuranceDetailsActivity.f82437K.mo82019a(cardInsuranceStatusUiModel.mo82055a(), this.f82468d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82047a((CardInsuranceStatusUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$e */
    static final class C33871e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceStatusesActivity f82469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33871e(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            super(1);
            this.f82469d = cardInsuranceStatusesActivity;
        }

        /* renamed from: a */
        public final void mo82048a(CardInsuranceStatusUiModel cardInsuranceStatusUiModel) {
            C41536l.m120489i(cardInsuranceStatusUiModel, "it");
            C31226f.C31227a.m92832b(C31226f.f77593O, Long.valueOf(cardInsuranceStatusUiModel.mo82055a()), (List) null, (DebitCardInsuranceTypeUiModel) null, 6, (Object) null).mo4576A1(this.f82469d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82048a((CardInsuranceStatusUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$f */
    static final class C33872f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceStatusesActivity f82470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33872f(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            super(0);
            this.f82470d = cardInsuranceStatusesActivity;
        }

        /* renamed from: b */
        public final C36602i invoke() {
            return C36602i.m108537d(this.f82470d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$g */
    static final class C33873g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceStatusesActivity f82471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33873g(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            super(1);
            this.f82471d = cardInsuranceStatusesActivity;
        }

        /* renamed from: a */
        public final void mo82050a(List list) {
            this.f82471d.m99619S2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82050a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$h */
    static final class C33874h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceStatusesActivity f82472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33874h(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            super(1);
            this.f82472d = cardInsuranceStatusesActivity;
        }

        /* renamed from: a */
        public final void mo82051a(List list) {
            C41536l.m120489i(list, "it");
            this.f82472d.m99619S2(false);
            this.f82472d.m99615O2().mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82051a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$i */
    static final class C33875i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CardInsuranceStatusesActivity f82473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33875i(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
            super(1);
            this.f82473d = cardInsuranceStatusesActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f82473d.m99619S2(false);
            ConstraintLayout constraintLayout = this.f82473d.m99616P2().f88260f;
            C41536l.m120488h(constraintLayout, "binding.errorContainer");
            C32343x.m95447f1(constraintLayout);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$j */
    static final class C33876j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82474a;

        C33876j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82474a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82474a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82474a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$k */
    public static final class C33877k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82475d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33877k(ComponentActivity componentActivity) {
            super(0);
            this.f82475d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f82475d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$l */
    public static final class C33878l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82476d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33878l(ComponentActivity componentActivity) {
            super(0);
            this.f82476d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f82476d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity$m */
    public static final class C33879m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f82477d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f82478e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33879m(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f82477d = aVar;
            this.f82478e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f82477d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f82478e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: L2 */
    private final void m99612L2() {
        m99616P2().f88266l.setOnRefreshListener(new C31510j(this));
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_INSURANCE_CHANGED", this, new C31511k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m99613M2(CardInsuranceStatusesActivity cardInsuranceStatusesActivity) {
        C41536l.m120489i(cardInsuranceStatusesActivity, "this$0");
        C21481a.onRefresh$default(cardInsuranceStatusesActivity.m99617Q2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m99614N2(CardInsuranceStatusesActivity cardInsuranceStatusesActivity, String str, Bundle bundle) {
        C41536l.m120489i(cardInsuranceStatusesActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_INSURANCE_CHANGED", false)) {
            cardInsuranceStatusesActivity.m99617Q2().onRefresh(6);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final C31632d m99615O2() {
        return (C31632d) this.f82466I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final C36602i m99616P2() {
        return (C36602i) this.f82464G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final CardInsuranceStatusesViewModel$ViewModel m99617Q2() {
        return (CardInsuranceStatusesViewModel$ViewModel) this.f82465H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m99618R2(C31128a aVar) {
        C31132b.m92645g(aVar, new int[]{1, 6}, new C33873g(this));
        C31132b.m92648j(aVar, (int[]) null, new C33874h(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C33875i(this), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final void m99619S2(boolean z) {
        m99616P2().f88266l.setRefreshing(false);
        Group group = m99616P2().f88264j;
        C41536l.m120488h(group, "binding.loaders");
        C32343x.m95483r1(group, z, false, 2, (Object) null);
        SwipeRefreshLayout swipeRefreshLayout = m99616P2().f88266l;
        C41536l.m120488h(swipeRefreshLayout, "binding.swipeRefresh");
        C32343x.m95483r1(swipeRefreshLayout, !z, false, 2, (Object) null);
    }

    /* renamed from: T2 */
    private final void m99620T2() {
        m99616P2().f88263i.setAdapter(m99615O2());
    }

    /* renamed from: l1 */
    private final void m99621l1() {
        C36137y iw = m99617Q2().mo82083iw();
        iw.mo82085rn().mo4819k(this, new C33876j(new C33869c(this)));
        C37224b.m109963b(iw.mo82081Pl(), this, new C33870d(this));
        C37224b.m109963b(iw.mo82082So(), this, new C33871e(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m99616P2().mo3946b());
        super.mo37451O1(bundle);
        m99620T2();
        m99621l1();
        m99612L2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("card.insurance.main.page.header", new Object[0]);
    }
}
