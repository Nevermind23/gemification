package p341ge.bog.mobilebank.junior.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.io.Serializable;
import java.util.List;
import km0.C25745c;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37613p;
import om0.C27052c;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.junior.presentation.model.ChildRequestApproveUiModel;
import p341ge.bog.mobilebank.junior.presentation.model.FinancialContactData;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import um0.C28886f;
import um0.C28908k;
import vm0.C29127a;
import wm0.C29479d;
import wm0.C29507n;
import wm0.C29548q;
import zm0.C30362i;
import zm0.C30365k;
import zm0.C30372r;

/* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity */
public final class JuniorActivity extends C24671a {

    /* renamed from: J */
    public static final C24657a f63514J = new C24657a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C30362i f63515G;

    /* renamed from: H */
    private final C41217g f63516H = new C1617p0(C41520a0.m120436b(C30372r.class), new C24667j(this), new C24669l(this), new C24668k((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f63517I = C41219i.m119470b(new C24665h(this));

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$a */
    public static final class C24657a {
        private C24657a() {
        }

        public /* synthetic */ C24657a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo63021a(Context context, JuniorRequestDataUiModel juniorRequestDataUiModel, NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow, boolean z) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(navigatorConstants$JuniorFlow, "flow");
            context.startActivity(C37613p.m110614a(new Intent(context, JuniorActivity.class), C41233s.m119492a("REQUEST_DATA", juniorRequestDataUiModel), C41233s.m119492a("JUNIOR_FLOW", navigatorConstants$JuniorFlow), C41233s.m119492a("SHOULD_HIDE_REJECT_BUTTON", Boolean.valueOf(z))));
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$b */
    static final class C24658b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JuniorActivity f63518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24658b(JuniorActivity juniorActivity) {
            super(1);
            this.f63518d = juniorActivity;
        }

        /* renamed from: a */
        public final void mo63022a(String str) {
            this.f63518d.m79151N2(C29548q.f74658g.mo69398a(str));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63022a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$c */
    static final class C24659c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JuniorActivity f63519d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24659c(JuniorActivity juniorActivity) {
            super(1);
            this.f63519d = juniorActivity;
        }

        /* renamed from: a */
        public final void mo63023a(CardApplicationTypeData.SchoolCardOrderData schoolCardOrderData) {
            C41536l.m120489i(schoolCardOrderData, "it");
            CardOrderListActivity.C13998a.m52073b(CardOrderListActivity.f41389O, this.f63519d, schoolCardOrderData, (C0173b) null, (List) null, false, true, 28, (Object) null);
            this.f63519d.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63023a((CardApplicationTypeData.SchoolCardOrderData) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$d */
    static final class C24660d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JuniorActivity f63520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24660d(JuniorActivity juniorActivity) {
            super(1);
            this.f63520d = juniorActivity;
        }

        /* renamed from: a */
        public final void mo63024a(JuniorRequestDataUiModel juniorRequestDataUiModel) {
            C41536l.m120489i(juniorRequestDataUiModel, "it");
            C28886f.f73740N.mo68651a(juniorRequestDataUiModel).mo4576A1(this.f63520d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63024a((JuniorRequestDataUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$e */
    static final class C24661e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JuniorActivity f63521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24661e(JuniorActivity juniorActivity) {
            super(1);
            this.f63521d = juniorActivity;
        }

        /* renamed from: a */
        public final void mo63025a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C28908k.C28909a aVar = C28908k.f73761L;
            Serializable serializableExtra = this.f63521d.getIntent().getSerializableExtra("JUNIOR_FLOW");
            C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.shared.navigation.NavigatorConstants.JuniorFlow");
            C28908k.C28909a.m88553b(aVar, (NavigatorConstants$JuniorFlow) serializableExtra, (FinancialContactData) null, 2, (Object) null).mo4576A1(this.f63521d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63025a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$f */
    static final class C24662f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ JuniorActivity f63522d;

        /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$f$a */
        static final class C24663a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ JuniorActivity f63523d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24663a(JuniorActivity juniorActivity) {
                super(1);
                this.f63523d = juniorActivity;
            }

            /* renamed from: a */
            public final void mo63027a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C12910e.m48797o(this.f63523d, C32343x.m95388F("text.junior.activation.page.child.phone.number.verified", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo63027a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24662f(JuniorActivity juniorActivity) {
            super(1);
            this.f63522d = juniorActivity;
        }

        /* renamed from: a */
        public final void mo63026a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C24663a(this.f63522d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63026a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$g */
    /* synthetic */ class C24664g extends C41535k implements C43075l {
        C24664g(Object obj) {
            super(1, obj, JuniorActivity.class, "getInitialFragment", "getInitialFragment(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo63028b(boolean z) {
            ((JuniorActivity) this.receiver).m79149L2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo63028b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$h */
    static final class C24665h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ JuniorActivity f63524d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24665h(JuniorActivity juniorActivity) {
            super(0);
            this.f63524d = juniorActivity;
        }

        /* renamed from: b */
        public final C27052c invoke() {
            return C27052c.m83880d(this.f63524d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$i */
    static final class C24666i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f63525a;

        C24666i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f63525a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f63525a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f63525a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$j */
    public static final class C24667j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f63526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24667j(ComponentActivity componentActivity) {
            super(0);
            this.f63526d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f63526d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$k */
    public static final class C24668k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f63527d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f63528e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24668k(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f63527d = aVar;
            this.f63528e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f63527d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f63528e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$l */
    static final class C24669l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ JuniorActivity f63529d;

        /* renamed from: ge.bog.mobilebank.junior.presentation.activity.JuniorActivity$l$a */
        static final class C24670a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ JuniorActivity f63530d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24670a(JuniorActivity juniorActivity) {
                super(0);
                this.f63530d = juniorActivity;
            }

            /* renamed from: b */
            public final C30372r invoke() {
                Serializable serializableExtra = this.f63530d.getIntent().getSerializableExtra("JUNIOR_FLOW");
                C41536l.m120487g(serializableExtra, "null cannot be cast to non-null type ge.bog.mobilebank.shared.navigation.NavigatorConstants.JuniorFlow");
                return this.f63530d.mo63020K2().mo32562a((JuniorRequestDataUiModel) this.f63530d.getIntent().getParcelableExtra("REQUEST_DATA"), (NavigatorConstants$JuniorFlow) serializableExtra, this.f63530d.getIntent().getBooleanExtra("SHOULD_HIDE_REJECT_BUTTON", false));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24669l(JuniorActivity juniorActivity) {
            super(0);
            this.f63529d = juniorActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C24670a(this.f63529d));
        }
    }

    /* renamed from: H2 */
    private final void m79146H2() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_CHILD_APPROVED", this, new C29127a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m79147I2(JuniorActivity juniorActivity, String str, Bundle bundle) {
        C41536l.m120489i(juniorActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        ChildRequestApproveUiModel childRequestApproveUiModel = (ChildRequestApproveUiModel) bundle.getParcelable("RESULT_KEY_APPROVE_RESULT");
        if (childRequestApproveUiModel != null) {
            juniorActivity.m79150M2().mo70728Cw().mo70692Ml(childRequestApproveUiModel);
        }
    }

    /* renamed from: J2 */
    private final C27052c m79148J2() {
        return (C27052c) this.f63517I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m79149L2(boolean z) {
        if (z) {
            m79148J2().f67936f.f68494e.setTitle(C32343x.m95388F("child.financial.number.page.header", new Object[0]));
            m79151N2(C29479d.f74594h.mo69340a());
            return;
        }
        m79148J2().f67936f.f68494e.setTitle(C32343x.m95388F("text.junior.activation.page.header", new Object[0]));
        m79151N2(C29507n.f74623i.mo69361a());
    }

    /* renamed from: M2 */
    private final C30372r m79150M2() {
        return (C30372r) this.f63516H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m79151N2(C35651n1 n1Var) {
        getSupportFragmentManager().mo4428p().mo4639r(C25745c.f65527o, n1Var).mo4515i();
    }

    /* renamed from: l1 */
    private final void m79152l1() {
        C30365k Ew = m79150M2().mo70730Ew();
        C37224b.m109963b(Ew.mo70720k6(), this, new C24658b(this));
        C37224b.m109963b(Ew.mo70724t8(), this, new C24659c(this));
        C37224b.m109963b(Ew.mo70725uo(), this, new C24660d(this));
        C37224b.m109963b(Ew.mo70711Uh(), this, new C24661e(this));
        Ew.mo70727xh().mo4819k(this, new C24666i(new C24662f(this)));
        C37224b.m109963b(Ew.mo70718hv(), this, new C24664g(this));
    }

    /* renamed from: K2 */
    public final C30362i mo63020K2() {
        C30362i iVar = this.f63515G;
        if (iVar != null) {
            return iVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m79148J2().mo3946b());
        super.mo37451O1(bundle);
        m79152l1();
        m79146H2();
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.junior.activation.page.header", new Object[0]);
    }
}
