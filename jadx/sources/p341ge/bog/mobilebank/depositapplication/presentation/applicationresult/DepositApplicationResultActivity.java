package p341ge.bog.mobilebank.depositapplication.presentation.applicationresult;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import da0.C19948b;
import da0.C19950d;
import da0.C19955i;
import g91.C32343x;
import ha0.C24932i;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.depositapplication.presentation.applicationresult.C22840a;
import p642vh.C18358g;
import q31.C38122f;
import q31.C38125h;
import sa0.C28166a;
import ue1.C43064a;
import ue1.C43075l;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity */
public final class DepositApplicationResultActivity extends C22843b {

    /* renamed from: K */
    public static final C22826a f60170K = new C22826a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f60171G = C41219i.m119470b(new C22829d(this));

    /* renamed from: H */
    private final C41217g f60172H = C41219i.m119470b(new C22828c(this));

    /* renamed from: I */
    private final C41217g f60173I = C41219i.m119470b(C22827b.f60175d);

    /* renamed from: J */
    private final C41217g f60174J = new C1617p0(C41520a0.m120436b(DepositApplicationResultViewModel$ViewModel.class), new C22837i(this), new C22836h(this), new C22838j((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$a */
    public static final class C22826a {
        private C22826a() {
        }

        public /* synthetic */ C22826a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m74089b(C22826a aVar, Context context, DepositApplicationResultArgs depositApplicationResultArgs, int i, Object obj) {
            if ((i & 2) != 0) {
                depositApplicationResultArgs = null;
            }
            aVar.mo56884a(context, depositApplicationResultArgs);
        }

        /* renamed from: a */
        public final void mo56884a(Context context, DepositApplicationResultArgs depositApplicationResultArgs) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, DepositApplicationResultActivity.class);
            if (depositApplicationResultArgs != null) {
                intent.putExtra("ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultArgs.KEY", depositApplicationResultArgs);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$b */
    static final class C22827b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C22827b f60175d = new C22827b();

        C22827b() {
            super(0);
        }

        /* renamed from: b */
        public final C22840a invoke() {
            return new C22840a();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$c */
    static final class C22828c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationResultActivity f60176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22828c(DepositApplicationResultActivity depositApplicationResultActivity) {
            super(0);
            this.f60176d = depositApplicationResultActivity;
        }

        /* renamed from: b */
        public final DepositApplicationResultArgs invoke() {
            Intent intent = this.f60176d.getIntent();
            if (intent != null) {
                return (DepositApplicationResultArgs) intent.getParcelableExtra("ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultArgs.KEY");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$d */
    static final class C22829d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationResultActivity f60177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22829d(DepositApplicationResultActivity depositApplicationResultActivity) {
            super(0);
            this.f60177d = depositApplicationResultActivity;
        }

        /* renamed from: b */
        public final C24932i invoke() {
            return C24932i.m79710d(this.f60177d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$e */
    static final class C22830e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationResultActivity f60178d;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$e$a */
        static final class C22831a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DepositApplicationResultActivity f60179d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22831a(DepositApplicationResultActivity depositApplicationResultActivity) {
                super(1);
                this.f60179d = depositApplicationResultActivity;
            }

            /* renamed from: a */
            public final void mo56889a(C30003b bVar) {
                this.f60179d.m74079I2().f64140h.setLoading(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56889a((C30003b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$e$b */
        static final class C22832b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DepositApplicationResultActivity f60180d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22832b(DepositApplicationResultActivity depositApplicationResultActivity) {
                super(1);
                this.f60180d = depositApplicationResultActivity;
            }

            /* renamed from: a */
            public final void mo56890a(C30003b bVar) {
                C41536l.m120489i(bVar, "it");
                this.f60180d.m74079I2().f64140h.setLoading(false);
                if (bVar.mo70300c()) {
                    C38125h.m112238c(this.f60180d).mo91620o(bVar).mo4576A1(this.f60180d.getSupportFragmentManager(), (String) null);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo56890a((C30003b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$e$c */
        static final class C22833c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ DepositApplicationResultActivity f60181d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22833c(DepositApplicationResultActivity depositApplicationResultActivity) {
                super(1);
                this.f60181d = depositApplicationResultActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f60181d.m74079I2().f64140h.setLoading(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22830e(DepositApplicationResultActivity depositApplicationResultActivity) {
            super(1);
            this.f60178d = depositApplicationResultActivity;
        }

        /* renamed from: a */
        public final void mo56888a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C22831a(this.f60178d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C22832b(this.f60178d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C22833c(this.f60178d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56888a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$f */
    static final class C22834f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationResultActivity f60182d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22834f(DepositApplicationResultActivity depositApplicationResultActivity) {
            super(1);
            this.f60182d = depositApplicationResultActivity;
        }

        /* renamed from: a */
        public final void mo56892a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C38122f.C38123a.m112215k(C38125h.m112238c(this.f60182d), this.f60182d, (String) null, (Bundle) null, 6, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56892a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$g */
    static final class C22835g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60183a;

        C22835g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60183a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60183a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60183a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$h */
    public static final class C22836h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22836h(ComponentActivity componentActivity) {
            super(0);
            this.f60184d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f60184d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$i */
    public static final class C22837i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22837i(ComponentActivity componentActivity) {
            super(0);
            this.f60185d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60185d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity$j */
    public static final class C22838j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60186d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60187e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22838j(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60186d = aVar;
            this.f60187e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60186d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60187e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: G2 */
    private final C22840a m74077G2() {
        return (C22840a) this.f60173I.getValue();
    }

    /* renamed from: H2 */
    private final DepositApplicationResultArgs m74078H2() {
        return (DepositApplicationResultArgs) this.f60172H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final C24932i m74079I2() {
        return (C24932i) this.f60171G.getValue();
    }

    /* renamed from: J2 */
    private final List m74080J2(DepositApplicationResultArgs depositApplicationResultArgs) {
        return C41341q.m119913p(new C22840a.C22841a(C32343x.m95388F("applications.deposits.success.initial.amount", new Object[0]), depositApplicationResultArgs.mo56895a()), new C22840a.C22841a(C32343x.m95388F("applications.deposits.success.term", new Object[0]), depositApplicationResultArgs.mo56901f()), new C22840a.C22841a(C32343x.m95388F("applications.deposits.success.effective.IR", new Object[0]), depositApplicationResultArgs.mo56897d()));
    }

    /* renamed from: K2 */
    private final DepositApplicationResultViewModel$ViewModel m74081K2() {
        return (DepositApplicationResultViewModel$ViewModel) this.f60174J.getValue();
    }

    /* renamed from: L2 */
    private final void m74082L2() {
        m74081K2().mo56915gw().mo56909C3().mo4819k(this, new C22835g(new C22830e(this)));
        C37224b.m109963b(m74081K2().mo56915gw().mo56911X(), this, new C22834f(this));
    }

    /* renamed from: M2 */
    private final C41238w m74083M2() {
        String str;
        String str2;
        C24932i I2 = m74079I2();
        PageState pageState = I2.f64141i;
        DepositApplicationResultArgs H2 = m74078H2();
        if (H2 == null || (str = H2.mo56899e()) == null) {
            str = "applications.deposits.success.main.text";
        }
        pageState.setTitleText(C32343x.m95388F(str, new Object[0]));
        Button button = I2.f64140h;
        DepositApplicationResultArgs H22 = m74078H2();
        if (H22 == null || (str2 = H22.mo56896b()) == null) {
            str2 = "applications.deposits.success.redirect.to.home.button";
        }
        button.setButtonText(C32343x.m95388F(str2, new Object[0]));
        button.setOnClickListener(new C28166a(this));
        DepositApplicationResultArgs H23 = m74078H2();
        if (H23 == null) {
            return null;
        }
        m74085O2(H23);
        m74086P2();
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m74084N2(DepositApplicationResultActivity depositApplicationResultActivity, View view) {
        C41536l.m120489i(depositApplicationResultActivity, "this$0");
        depositApplicationResultActivity.m74081K2().mo56914fw().mo56910K5();
    }

    /* renamed from: O2 */
    private final void m74085O2(DepositApplicationResultArgs depositApplicationResultArgs) {
        C24932i I2 = m74079I2();
        LayerView layerView = I2.f64137e;
        C41536l.m120488h(layerView, "detailsContainer");
        C32343x.m95407O0(layerView);
        I2.f64139g.setTitle(C32343x.m95388F("applications.deposits.success.details", new Object[0]));
        I2.f64138f.mo5351j(new C13364a(C0767a.m2895e(this, C19950d.f54501u)));
        I2.f64138f.setAdapter(m74077G2());
        m74077G2().mo6029i(m74080J2(depositApplicationResultArgs));
    }

    /* renamed from: P2 */
    private final void m74086P2() {
        m74079I2().f64141i.setPageStateType(new PageStateType.Success(new Image.Resource(C19950d.ic_deposit_success, (Boolean) null, 2, (DefaultConstructorMarker) null), C19955i.f54548b, (Color) null, C18358g.m62729c(C19948b.f54495e), 4, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m74079I2().mo3946b());
        super.mo37451O1(bundle);
        m74082L2();
        m74083M2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("applications.deposits.main.page.header", new Object[0]);
    }
}
