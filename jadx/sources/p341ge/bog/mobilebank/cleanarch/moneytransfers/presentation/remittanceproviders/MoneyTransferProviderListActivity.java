package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g20.C20639w;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import i20.C25104d;
import iu0.C36546y;
import jg1.C41438c;
import jg1.C41452l;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.presentation.p766zk.ZkUmtsCardsListActivity;
import p341ge.bog.mobilebank.eventbus.events.LogInEvent;
import p366bk.C10328q;
import p826lz.C26098b;
import p846nz.C26640a;
import p846nz.C26651j;
import p846nz.C26652k;
import p846nz.C26653l;
import p856oz.C27095a;
import p90.C27434u0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity */
public final class MoneyTransferProviderListActivity extends C21286a {

    /* renamed from: L */
    public static final C21272a f57089L = new C21272a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C41438c f57090G;

    /* renamed from: H */
    private final C41217g f57091H = C41219i.m119470b(new C21273b(this));

    /* renamed from: I */
    private final C41217g f57092I = new C1617p0(C41520a0.m120436b(MoneyTransferListViewModel$ViewModel.class), new C21284m(this), new C21283l(this), new C21285n((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f57093J = C41219i.m119470b(C21278g.f57100d);

    /* renamed from: K */
    private final C41217g f57094K = C41219i.m119470b(new C21280i(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$a */
    public static final class C21272a {
        private C21272a() {
        }

        public /* synthetic */ C21272a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53268a(Context context, String str) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, MoneyTransferProviderListActivity.class);
            intent.putExtra("MT_SYSTEM", str);
            context.startActivity(intent);
        }

        /* renamed from: b */
        public final void mo53269b(Context context) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, MoneyTransferProviderListActivity.class);
            intent.putExtra("SHOW_RATES_ACTION_SHEET", true);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$b */
    static final class C21273b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferProviderListActivity f57095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21273b(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            super(0);
            this.f57095d = moneyTransferProviderListActivity;
        }

        /* renamed from: b */
        public final C27434u0 invoke() {
            return C27434u0.m85043d(this.f57095d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$c */
    static final class C21274c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferProviderListActivity f57096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21274c(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            super(1);
            this.f57096d = moneyTransferProviderListActivity;
        }

        /* renamed from: a */
        public final void mo53271a(C25104d dVar) {
            C41536l.m120489i(dVar, "it");
            C26098b.f66210J.mo65019a().mo4576A1(this.f57096d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53271a((C25104d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$d */
    static final class C21275d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferProviderListActivity f57097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21275d(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            super(1);
            this.f57097d = moneyTransferProviderListActivity;
        }

        /* renamed from: a */
        public final void mo53272a(C27095a aVar) {
            MoneyTransferProviderListActivity moneyTransferProviderListActivity = this.f57097d;
            C41536l.m120488h(aVar, "uiState");
            moneyTransferProviderListActivity.m68939X2(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53272a((C27095a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$e */
    static final class C21276e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferProviderListActivity f57098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21276e(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            super(1);
            this.f57098d = moneyTransferProviderListActivity;
        }

        /* renamed from: a */
        public final void mo53273a(MoneyTransferTypeUiModel moneyTransferTypeUiModel) {
            C41536l.m120489i(moneyTransferTypeUiModel, "it");
            ZkUmtsCardsListActivity.f59447L.mo55468a(this.f57098d, moneyTransferTypeUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53273a((MoneyTransferTypeUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$f */
    static final class C21277f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferProviderListActivity f57099d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21277f(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            super(1);
            this.f57099d = moneyTransferProviderListActivity;
        }

        /* renamed from: a */
        public final void mo53274a(MoneyTransferTypeUiModel moneyTransferTypeUiModel) {
            C41536l.m120489i(moneyTransferTypeUiModel, "it");
            MoneyTransferDetailsActivity.C21185a.m68673b(MoneyTransferDetailsActivity.f56897b0, this.f57099d, moneyTransferTypeUiModel, (MoneyTransferWizardData) null, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53274a((MoneyTransferTypeUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$g */
    static final class C21278g extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C21278g f57100d = new C21278g();

        C21278g() {
            super(0);
        }

        /* renamed from: b */
        public final C26640a invoke() {
            return new C26640a();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$h */
    static final class C21279h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57101a;

        C21279h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57101a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57101a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57101a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$i */
    static final class C21280i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferProviderListActivity f57102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21280i(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            super(0);
            this.f57102d = moneyTransferProviderListActivity;
        }

        public final String invoke() {
            Intent intent = this.f57102d.getIntent();
            if (intent != null) {
                return intent.getStringExtra("MT_SYSTEM");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$j */
    static final class C21281j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferProviderListActivity f57103d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21281j(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            super(1);
            this.f57103d = moneyTransferProviderListActivity;
        }

        /* renamed from: a */
        public final void mo53278a(MoneyTransferTypeUiModel moneyTransferTypeUiModel) {
            C41536l.m120489i(moneyTransferTypeUiModel, "it");
            C36546y.m108282F().mo27152s("remittance", moneyTransferTypeUiModel.mo53145d(), "remittance_click_provider");
            this.f57103d.m68929N2().mo53250pw().mo53246Jc(moneyTransferTypeUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53278a((MoneyTransferTypeUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$k */
    public static final class C21282k implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferProviderListActivity f57104d;

        C21282k(MoneyTransferProviderListActivity moneyTransferProviderListActivity) {
            this.f57104d = moneyTransferProviderListActivity;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            Input input = this.f57104d.m68928L2().f69903p;
            if (this.f57104d.m68928L2().f69903p.getInputText().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            input.setInputButtonEnabled(z);
            this.f57104d.m68930O2().mo65895q(false);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$l */
    public static final class C21283l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57105d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21283l(ComponentActivity componentActivity) {
            super(0);
            this.f57105d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57105d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$m */
    public static final class C21284m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f57106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21284m(ComponentActivity componentActivity) {
            super(0);
            this.f57106d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57106d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity$n */
    public static final class C21285n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57107d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f57108e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21285n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f57107d = aVar;
            this.f57108e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57107d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57108e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final C27434u0 m68928L2() {
        return (C27434u0) this.f57091H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final MoneyTransferListViewModel$ViewModel m68929N2() {
        return (MoneyTransferListViewModel$ViewModel) this.f57092I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final C26640a m68930O2() {
        return (C26640a) this.f57093J.getValue();
    }

    /* renamed from: P2 */
    private final String m68931P2() {
        return (String) this.f57094K.getValue();
    }

    /* renamed from: Q2 */
    private final void m68932Q2(C25104d dVar) {
        boolean z;
        CardView cardView = m68928L2().f69892e.f69129k;
        C41536l.m120488h(cardView, "binding.bannerView.bannerView");
        if (dVar != null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(cardView, z, false, 2, (Object) null);
        if (dVar != null) {
            CardView cardView2 = m68928L2().f69892e.f69129k;
            C41536l.m120488h(cardView2, "binding.bannerView.bannerView");
            C20639w wVar = new C20639w(cardView2);
            wVar.mo49182m(new C21274c(this));
            wVar.mo49181j(dVar);
        }
    }

    /* renamed from: R2 */
    private final void m68933R2() {
        m68928L2().f69895h.setText(C32343x.m95388F("text.umts.data.load.error", new Object[0]));
        m68928L2().f69898k.setButtonText(C32343x.m95388F("text.umts.page.refresh", new Object[0]));
        m68928L2().f69902o.setTitle(C32343x.m95388F("text.umts.receive.chooseTransfer", new Object[0]));
        m68928L2().f69903p.setHintText((CharSequence) C32343x.m95388F("umts.universal.enter.transfer.number", new Object[0]));
        m68928L2().f69904q.setText(C32343x.m95388F("text.umts.receive.enterTransferNumber", new Object[0]));
        m68928L2().f69903p.setInfoText(C32343x.m95388F("text.umts.receive.searchDescription", new Object[0]));
        m68928L2().f69903p.setInputButtonEnabled(false);
        RecyclerView recyclerView = m68928L2().f69901n;
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(m68930O2());
    }

    /* renamed from: S2 */
    private final void m68934S2() {
        m68929N2().mo53254sw().mo53248Qe().mo4819k(this, new C21279h(new C21275d(this)));
        C37224b.m109963b(m68929N2().mo53254sw().mo53247No(), this, new C21276e(this));
        C37224b.m109963b(m68929N2().mo53254sw().mo53249Wq(), this, new C21277f(this));
    }

    /* renamed from: T2 */
    private final void m68935T2() {
        m68928L2().f69898k.setOnClickListener(new C26651j(this));
        m68930O2().mo65894p(new C21281j(this));
        m68928L2().f69903p.setOnInputFocusChangeListener(new C26652k());
        m68928L2().f69903p.setInputButtonClickListener(new C26653l(this));
        m68928L2().f69903p.getTextInput().addTextChangedListener(new C21282k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m68936U2(MoneyTransferProviderListActivity moneyTransferProviderListActivity, View view) {
        C41536l.m120489i(moneyTransferProviderListActivity, "this$0");
        moneyTransferProviderListActivity.m68929N2().mo53255tw();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m68937V2(View view, boolean z) {
        if (z) {
            C36546y.m108282F().mo27152s("remittance", "", "remittance_enter_code");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m68938W2(MoneyTransferProviderListActivity moneyTransferProviderListActivity, View view) {
        C41536l.m120489i(moneyTransferProviderListActivity, "this$0");
        C36546y.m108282F().mo27152s("remittance", "", "remittance_enter_code_check");
        moneyTransferProviderListActivity.m68929N2().mo53250pw().mo53252rp(moneyTransferProviderListActivity.m68928L2().f69903p.getInputText());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: X2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m68939X2(p856oz.C27095a r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p856oz.C27095a.C27098c
            if (r0 == 0) goto L_0x00f5
            p90.u0 r0 = r5.m68928L2()
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r0 = r0.f69899l
            r0.mo53595c()
            java.lang.String r0 = r5.m68931P2()
            r1 = 0
            if (r0 == 0) goto L_0x003d
            r0 = r6
            oz.a$c r0 = (p856oz.C27095a.C27098c) r0
            java.util.List r0 = r0.mo66391d()
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003b
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel r3 = (p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel) r3
            java.lang.String r3 = r3.mo53145d()
            java.lang.String r4 = r5.m68931P2()
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r4)
            if (r3 == 0) goto L_0x001f
            r1 = r2
        L_0x003b:
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel r1 = (p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel) r1
        L_0x003d:
            if (r1 == 0) goto L_0x004e
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferListViewModel$ViewModel r0 = r5.m68929N2()
            nz.b r0 = r0.mo53250pw()
            r0.mo53246Jc(r1)
            r5.finish()
            goto L_0x005c
        L_0x004e:
            nz.a r0 = r5.m68930O2()
            r1 = r6
            oz.a$c r1 = (p856oz.C27095a.C27098c) r1
            java.util.List r1 = r1.mo66391d()
            r0.mo6029i(r1)
        L_0x005c:
            oz.a$c r6 = (p856oz.C27095a.C27098c) r6
            i20.d r0 = r6.mo66390c()
            if (r0 == 0) goto L_0x0067
            r5.m68932Q2(r0)
        L_0x0067:
            oz.b r6 = r6.mo66392e()
            if (r6 == 0) goto L_0x0114
            p90.u0 r0 = r5.m68928L2()
            ge.bog.designsystem.components.input.Input r0 = r0.f69903p
            boolean r1 = r6 instanceof p856oz.C27099b.C27101b
            r2 = r1 ^ 1
            r0.setInputButtonEnabled(r2)
            r0 = 0
            if (r1 == 0) goto L_0x0091
            p90.u0 r6 = r5.m68928L2()
            ge.bog.designsystem.components.input.Input r6 = r6.f69903p
            r6.mo35919b()
            p90.u0 r6 = r5.m68928L2()
            android.widget.FrameLayout r6 = r6.f69897j
            r6.setVisibility(r0)
            goto L_0x0114
        L_0x0091:
            oz.b$a r1 = p856oz.C27099b.C27100a.f68065a
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r6, r1)
            r2 = 8
            if (r1 == 0) goto L_0x00c7
            p90.u0 r6 = r5.m68928L2()
            android.widget.FrameLayout r6 = r6.f69897j
            r6.setVisibility(r2)
            p90.u0 r6 = r5.m68928L2()
            ge.bog.designsystem.components.input.Input r6 = r6.f69903p
            java.lang.String r1 = "umts.universal.transfer.not.found"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = g91.C32343x.m95388F(r1, r0)
            r6.setInfoText(r0)
            p90.u0 r6 = r5.m68928L2()
            ge.bog.designsystem.components.input.Input r6 = r6.f69903p
            r6.mo35920c()
            nz.a r6 = r5.m68930O2()
            r0 = 1
            r6.mo65895q(r0)
            goto L_0x0114
        L_0x00c7:
            boolean r1 = r6 instanceof p856oz.C27099b.C27102c
            if (r1 == 0) goto L_0x0114
            p90.u0 r1 = r5.m68928L2()
            android.widget.FrameLayout r1 = r1.f69897j
            r1.setVisibility(r2)
            p90.u0 r1 = r5.m68928L2()
            ge.bog.designsystem.components.input.Input r1 = r1.f69903p
            java.lang.String r2 = "text.umts.receive.searchDescription"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = g91.C32343x.m95388F(r2, r0)
            r1.setInfoText(r0)
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$a r0 = p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity.f56897b0
            oz.b$c r6 = (p856oz.C27099b.C27102c) r6
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel r1 = r6.mo66396a()
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r6 = r6.mo66397b()
            r0.mo53092a(r5, r1, r6)
            goto L_0x0114
        L_0x00f5:
            boolean r0 = r6 instanceof p856oz.C27095a.C27096a
            if (r0 == 0) goto L_0x0103
            p90.u0 r6 = r5.m68928L2()
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r6 = r6.f69899l
            r6.mo53596d()
            goto L_0x0114
        L_0x0103:
            oz.a$b r0 = p856oz.C27095a.C27097b.f68061a
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r0)
            if (r6 == 0) goto L_0x0114
            p90.u0 r6 = r5.m68928L2()
            ge.bog.mobilebank.cleanarch.presentation.common.StateView r6 = r6.f69899l
            r6.mo53597e()
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity.m68939X2(oz.a):void");
    }

    /* renamed from: M2 */
    public final C41438c mo53266M2() {
        C41438c cVar = this.f57090G;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("eventBus");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m68928L2().mo3946b());
        super.mo37451O1(bundle);
        m68933R2();
        m68935T2();
        m68934S2();
        C32343x.m95423W0(mo53266M2(), this);
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("SHOW_RATES_ACTION_SHEET", false)) {
            z = true;
        }
        if (z) {
            C26098b.f66210J.mo65019a().mo4576A1(getSupportFragmentManager(), (String) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(mo53266M2(), this);
    }

    @C41452l
    public final void onLoginAfterSessionExpired(LogInEvent logInEvent) {
        C41536l.m120489i(logInEvent, "event");
        m68929N2().mo53255tw();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_transfer_provider_list_header_text);
        C41536l.m120488h(string, "getString(R.string.money…rovider_list_header_text)");
        return string;
    }
}
