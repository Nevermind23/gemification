package p341ge.bog.mobilebank.bnpl.presentation.welcome;

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
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.bnpl.presentation.offers.list.BnplOffersActivity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p382cm.C10505a;
import p480jl.C16212c;
import p536nl.C17056i;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity */
public final class BnplWelcomeActivity extends C13926a {

    /* renamed from: K */
    public static final C13919a f41273K = new C13919a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f41274G;

    /* renamed from: H */
    public PreferencesApiManager f41275H;

    /* renamed from: I */
    private final C41217g f41276I = C41219i.m119470b(new C13920b(this));

    /* renamed from: J */
    private final C41217g f41277J = new C1617p0(C41520a0.m120436b(BnplWelcomeViewModel$ViewModel.class), new C13924f(this), new C13923e(this), new C13925g((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity$a */
    public static final class C13919a {
        private C13919a() {
        }

        public /* synthetic */ C13919a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo38338a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, BnplWelcomeActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity$b */
    static final class C13920b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BnplWelcomeActivity f41278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13920b(BnplWelcomeActivity bnplWelcomeActivity) {
            super(0);
            this.f41278d = bnplWelcomeActivity;
        }

        /* renamed from: b */
        public final C17056i invoke() {
            return C17056i.m59930d(this.f41278d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity$c */
    static final class C13921c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BnplWelcomeActivity f41279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13921c(BnplWelcomeActivity bnplWelcomeActivity) {
            super(1);
            this.f41279d = bnplWelcomeActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "openNextPage");
            if (bool.booleanValue()) {
                this.f41279d.m51858N2();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity$d */
    static final class C13922d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41280a;

        C13922d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41280a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41280a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41280a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity$e */
    public static final class C13923e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13923e(ComponentActivity componentActivity) {
            super(0);
            this.f41281d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f41281d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity$f */
    public static final class C13924f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13924f(ComponentActivity componentActivity) {
            super(0);
            this.f41282d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41282d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity$g */
    public static final class C13925g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41283d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41284e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13925g(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41283d = aVar;
            this.f41284e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41283d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41284e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: G2 */
    private final C17056i m51853G2() {
        return (C17056i) this.f41276I.getValue();
    }

    /* renamed from: J2 */
    private final BnplWelcomeViewModel$ViewModel m51854J2() {
        return (BnplWelcomeViewModel$ViewModel) this.f41277J.getValue();
    }

    /* renamed from: K2 */
    private final void m51855K2() {
        m51854J2().mo38345fw().mo27229aw().mo4819k(this, new C13922d(new C13921c(this)));
    }

    /* renamed from: L2 */
    private final void m51856L2() {
        m51853G2().f47640k.setTitle(C32343x.m95388F("text.bnpl.name", new Object[0]));
        m51853G2().f47640k.setText(C32343x.m95388F("text.bnpl.payment.conditions", new Object[0]));
        PageDescriptionView pageDescriptionView = m51853G2().f47640k;
        int i = C16212c.f45713a;
        pageDescriptionView.setDrawableSrc(Integer.valueOf(i));
        m51853G2().f47636g.setText(C32343x.m95388F("text.bnpl.payment.conditions.offline", new Object[0]));
        m51853G2().f47638i.setText(C32343x.m95388F("text.bnpl.payment.conditions.online", new Object[0]));
        m51853G2().f47634e.setButtonText(C32343x.m95388F("text.bnpl.show.catalogue.button", new Object[0]));
        m51853G2().f47634e.setOnClickListener(new C10505a(this));
        m51853G2().f47640k.setDrawableSrc(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m51857M2(BnplWelcomeActivity bnplWelcomeActivity, View view) {
        C41536l.m120489i(bnplWelcomeActivity, "this$0");
        bnplWelcomeActivity.m51854J2().mo38343dw().mo27228vb();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final void m51858N2() {
        BnplOffersActivity.f41243K.mo38321a(this);
        finish();
    }

    /* renamed from: H2 */
    public final Client mo38336H2() {
        Client client = this.f41274G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: I2 */
    public final PreferencesApiManager mo38337I2() {
        PreferencesApiManager preferencesApiManager = this.f41275H;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        if (mo38337I2().isBnplWelcomePageSeen(mo38336H2().getLoginInfo().mo90307d())) {
            m51858N2();
            return;
        }
        setContentView((View) m51853G2().mo3946b());
        super.mo37451O1(bundle);
        m51856L2();
        m51855K2();
        mo86429X1(mo38120z1());
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.bnpl.name", new Object[0]);
    }
}
