package p341ge.bog.mobilebank.cardapplications.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import o31.C37613p;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p411em.C12486c;
import p411em.C12487d;
import p412en.C12544i2;
import p412en.C12580k2;
import p412en.C12605p2;
import p420fh.C12902d;
import p420fh.C12910e;
import p481jm.C16225e0;
import p481jm.C16232k;
import p593rm.C17665p;
import p593rm.C17666q;
import p593rm.C17667r;
import p593rm.C17668s;
import p621tm.C18013k;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import y60.C29932d;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity */
public final class OrderCardResultActivity extends C14086c {

    /* renamed from: N */
    public static final C14029a f41431N = new C14029a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C12544i2 f41432G;

    /* renamed from: H */
    public Client f41433H;

    /* renamed from: I */
    private final C41217g f41434I = C41219i.m119470b(new C14037f(this));

    /* renamed from: J */
    private final C41217g f41435J = C41219i.m119470b(new C14040i(this));

    /* renamed from: K */
    private final C41217g f41436K = new C1617p0(C41520a0.m120436b(C12605p2.class), new C14042k(this), new C14044m(this), new C14043l((C43064a) null, this));

    /* renamed from: L */
    private final C41217g f41437L = C41219i.m119470b(C14038g.f41445d);

    /* renamed from: M */
    private final C41217g f41438M = C41219i.m119470b(C14039h.f41446d);

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$a */
    public static final class C14029a {
        private C14029a() {
        }

        public /* synthetic */ C14029a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo39121a(Context context, OrderCardResult orderCardResult) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(orderCardResult, "result");
            context.startActivity(C37613p.m110614a(new Intent(context, OrderCardResultActivity.class), C41233s.m119492a("ARG_RESULT", orderCardResult)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$b */
    static final class C14030b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderCardResultActivity f41439d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$b$a */
        static final class C14031a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderCardResultActivity f41440d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14031a(OrderCardResultActivity orderCardResultActivity) {
                super(1);
                this.f41440d = orderCardResultActivity;
            }

            /* renamed from: a */
            public final void mo39123a(C41238w wVar) {
                this.f41440d.m52112Y2(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39123a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$b$b */
        static final class C14032b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderCardResultActivity f41441d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14032b(OrderCardResultActivity orderCardResultActivity) {
                super(1);
                this.f41441d = orderCardResultActivity;
            }

            /* renamed from: a */
            public final void mo39124a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f41441d.m52112Y2(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39124a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$b$c */
        static final class C14033c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ OrderCardResultActivity f41442d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14033c(OrderCardResultActivity orderCardResultActivity) {
                super(1);
                this.f41442d = orderCardResultActivity;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f41442d.m52112Y2(false);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14030b(OrderCardResultActivity orderCardResultActivity) {
            super(1);
            this.f41439d = orderCardResultActivity;
        }

        /* renamed from: a */
        public final void mo39122a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92646h(aVar, (int[]) null, new C14031a(this.f41439d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C14032b(this.f41439d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C14033c(this.f41439d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39122a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$c */
    /* synthetic */ class C14034c extends C41535k implements C43075l {
        C14034c(Object obj) {
            super(1, obj, OrderCardResultActivity.class, "openMCC", "openMCC(J)V", 0);
        }

        /* renamed from: b */
        public final void mo39126b(long j) {
            ((OrderCardResultActivity) this.receiver).m52111X2(j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39126b(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$d */
    /* synthetic */ class C14035d extends C41535k implements C43075l {
        C14035d(Object obj) {
            super(1, obj, OrderCardResultActivity.class, "showErrorPopup", "showErrorPopup(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: b */
        public final void mo39127b(Throwable th) {
            C41536l.m120489i(th, "p0");
            ((OrderCardResultActivity) this.receiver).m52116c3(th);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39127b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$e */
    static final class C14036e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ OrderCardResultActivity f41443d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14036e(OrderCardResultActivity orderCardResultActivity) {
            super(1);
            this.f41443d = orderCardResultActivity;
        }

        /* renamed from: a */
        public final void mo39128a(C30003b bVar) {
            C41536l.m120489i(bVar, "it");
            C38125h.m112238c(this.f41443d).mo91620o(bVar).mo4576A1(this.f41443d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39128a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$f */
    static final class C14037f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OrderCardResultActivity f41444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14037f(OrderCardResultActivity orderCardResultActivity) {
            super(0);
            this.f41444d = orderCardResultActivity;
        }

        /* renamed from: b */
        public final C16232k invoke() {
            return C16232k.m57860d(this.f41444d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$g */
    static final class C14038g extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14038g f41445d = new C14038g();

        C14038g() {
            super(0);
        }

        /* renamed from: b */
        public final C18013k invoke() {
            return new C18013k();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$h */
    static final class C14039h extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C14039h f41446d = new C14039h();

        C14039h() {
            super(0);
        }

        /* renamed from: b */
        public final C18013k invoke() {
            return new C18013k();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$i */
    static final class C14040i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OrderCardResultActivity f41447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14040i(OrderCardResultActivity orderCardResultActivity) {
            super(0);
            this.f41447d = orderCardResultActivity;
        }

        /* renamed from: b */
        public final OrderCardResult invoke() {
            Intent intent = this.f41447d.getIntent();
            if (intent != null) {
                return (OrderCardResult) intent.getParcelableExtra("ARG_RESULT");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$j */
    static final class C14041j implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41448a;

        C14041j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41448a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41448a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41448a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$k */
    public static final class C14042k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f41449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14042k(ComponentActivity componentActivity) {
            super(0);
            this.f41449d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f41449d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$l */
    public static final class C14043l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41450d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f41451e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14043l(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f41450d = aVar;
            this.f41451e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41450d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f41451e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$m */
    static final class C14044m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ OrderCardResultActivity f41452d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.OrderCardResultActivity$m$a */
        static final class C14045a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ OrderCardResultActivity f41453d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14045a(OrderCardResultActivity orderCardResultActivity) {
                super(0);
                this.f41453d = orderCardResultActivity;
            }

            /* renamed from: b */
            public final C12605p2 invoke() {
                C12544i2 U2 = this.f41453d.mo39120U2();
                OrderCardResult I2 = this.f41453d.m52109V2();
                C41536l.m120486f(I2);
                return U2.mo32563a(I2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14044m(OrderCardResultActivity orderCardResultActivity) {
            super(0);
            this.f41452d = orderCardResultActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C14045a(this.f41452d));
        }
    }

    /* renamed from: M2 */
    private final void m52102M2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("REQUEST_KEY_MCC_UPDATED", this, new C17667r(this));
        supportFragmentManager.mo4367F1("REQUEST_KEY_END_YEAR_CAMPAIGN_POPUP", this, new C17668s(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public static final void m52103N2(OrderCardResultActivity orderCardResultActivity, String str, Bundle bundle) {
        C41536l.m120489i(orderCardResultActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "b");
        if (bundle.getBoolean("RESULT_KEY_MCC_UPDATED", false)) {
            orderCardResultActivity.m52118e3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m52104O2(OrderCardResultActivity orderCardResultActivity, String str, Bundle bundle) {
        C41536l.m120489i(orderCardResultActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        if (bundle.getBoolean("RESULT_KEY_END_YEAR_CAMPAIGN_POPUP_CLOSED", true)) {
            orderCardResultActivity.m52110W2().mo33279kw().mo33178jo();
        }
    }

    /* renamed from: P2 */
    private final void m52105P2(C16225e0 e0Var, FeedbackItem feedbackItem) {
        boolean z;
        String f;
        InlineFeedback inlineFeedback = e0Var.f45797g;
        C41536l.m120488h(inlineFeedback, "details.feedback");
        if (feedbackItem != null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(inlineFeedback, z, false, 2, (Object) null);
        if (feedbackItem != null) {
            e0Var.f45797g.setTitleText(C34646b.m101752f(feedbackItem.mo39740b(), (Context) null, 1, (Object) null));
            e0Var.f45797g.setCaptionText(C34646b.m101752f(feedbackItem.mo39739a(), (Context) null, 1, (Object) null));
            StringSource d = feedbackItem.mo39741d();
            if (d != null && (f = C34646b.m101752f(d, (Context) null, 1, (Object) null)) != null) {
                m52106Q2().f45897i.setTitleText(f);
            }
        }
    }

    /* renamed from: Q2 */
    private final C16232k m52106Q2() {
        return (C16232k) this.f41434I.getValue();
    }

    /* renamed from: R2 */
    private final C18013k m52107R2() {
        return (C18013k) this.f41437L.getValue();
    }

    /* renamed from: T2 */
    private final C18013k m52108T2() {
        return (C18013k) this.f41438M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final OrderCardResult m52109V2() {
        return (OrderCardResult) this.f41435J.getValue();
    }

    /* renamed from: W2 */
    private final C12605p2 m52110W2() {
        return (C12605p2) this.f41436K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final void m52111X2(long j) {
        C29932d.f75725P.mo70245a(j, false).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public final void m52112Y2(boolean z) {
        FrameLayout frameLayout = m52106Q2().f45896h;
        C41536l.m120488h(frameLayout, "binding.loaderContainer");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: Z2 */
    private final void m52113Z2(OrderCardResult orderCardResult) {
        Button button = m52106Q2().f45893e;
        C41536l.m120488h(button, "setupButton$lambda$9");
        C32343x.m95483r1(button, orderCardResult.mo39762j(), false, 2, (Object) null);
        button.setButtonText(C32343x.m95388F("card.application.digital.card.sucess.screen.details.button.label", new Object[0]));
        button.setButtonIcon(getDrawable(C12487d.icons_48_card_debit_fill));
        button.setOnClickListener(new C17666q(orderCardResult, this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m52114a3(OrderCardResult orderCardResult, OrderCardResultActivity orderCardResultActivity, View view) {
        C41536l.m120489i(orderCardResult, "$result");
        C41536l.m120489i(orderCardResultActivity, "this$0");
        if (orderCardResult.mo39762j()) {
            C38122f.C38123a.m112211g(C38125h.m112238c(orderCardResultActivity), orderCardResultActivity, orderCardResult.mo39753d(), (C0173b) null, 4, (Object) null);
        }
        orderCardResultActivity.finish();
    }

    /* renamed from: b3 */
    private final void m52115b3(OrderCardResult orderCardResult) {
        String str;
        PageState pageState = m52106Q2().f45897i;
        if (orderCardResult.mo39759h() != null) {
            str = C34646b.m101752f(orderCardResult.mo39759h(), (Context) null, 1, (Object) null);
        } else if (orderCardResult.mo39762j()) {
            str = C32343x.m95388F("text.card.application.digital.card.order.success", new Object[0]);
        } else if (!C41536l.m120484d(mo39119S2().getUserInfo().getClient().clientCategory, "RB") || !orderCardResult.mo39761i()) {
            str = C32343x.m95388F("text.card.application.plastic.card.order.success.sms", new Object[0]);
        } else {
            str = C32343x.m95388F("text.card.application.plastic.card.order.success", new Object[0]);
        }
        pageState.setTitleText(str);
        m52113Z2(orderCardResult);
        m52106Q2().f45895g.f45795e.setTitle(C32343x.m95388F("text.applications.debitcard.delivery.title", new Object[0]));
        m52106Q2().f45894f.f45795e.setTitle(C32343x.m95388F("applications.card.success.details", new Object[0]));
        m52106Q2().f45894f.f45796f.setAdapter(m52107R2());
        m52106Q2().f45895g.f45796f.setAdapter(m52108T2());
        LayerView c = m52106Q2().f45895g.mo3946b();
        C41536l.m120488h(c, "binding.deliveryDetails.root");
        C32343x.m95483r1(c, !orderCardResult.mo39762j(), false, 2, (Object) null);
        m52107R2().mo6029i(orderCardResult.mo39751a());
        m52108T2().mo6029i(orderCardResult.mo39755e());
        C16225e0 e0Var = m52106Q2().f45895g;
        C41536l.m120488h(e0Var, "binding.deliveryDetails");
        m52105P2(e0Var, orderCardResult.mo39757f());
        C16225e0 e0Var2 = m52106Q2().f45894f;
        C41536l.m120488h(e0Var2, "binding.cardDetails");
        m52105P2(e0Var2, orderCardResult.mo39752b());
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m52116c3(Throwable th) {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_ICON_SINGLE_BUTTON);
        dVar.mo35637O1(Integer.valueOf(C12487d.f37171t));
        dVar.mo35638P1(Integer.valueOf(C12486c.f37159b));
        dVar.mo35648c2(C32343x.m95388F("text.junior.activation.page.error.popup.title", new Object[0]));
        dVar.mo35639Q1(C32343x.m95428Z(th, C32343x.m95388F("text.common.application.error", new Object[0])));
        dVar.mo35644X1(C32343x.m95388F("text.junior.activation.page.error.popup.button", new Object[0]));
        dVar.mo35643V1(new C17665p(dVar, this));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m52117d3(C13310d dVar, OrderCardResultActivity orderCardResultActivity, Button button) {
        C41536l.m120489i(dVar, "$this_with");
        C41536l.m120489i(orderCardResultActivity, "this$0");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        orderCardResultActivity.m52110W2().mo33279kw().mo33177Ih();
    }

    /* renamed from: e3 */
    private final void m52118e3() {
        C12910e.m48797o(this, C32343x.m95388F("card.mcc.opearation.completed.successfully", new Object[0]), (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: l1 */
    private final void m52119l1() {
        C12580k2 lw = m52110W2().mo33280lw();
        lw.mo33269i().mo4819k(this, new C14041j(new C14030b(this)));
        C37224b.m109963b(lw.mo33267Pv(), this, new C14034c(this));
        C37224b.m109963b(lw.mo33268Tg(), this, new C14035d(this));
        C37224b.m109963b(lw.mo33266Fl(), this, new C14036e(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        OrderCardResult V2 = m52109V2();
        if (V2 == null) {
            finish();
            return;
        }
        setContentView((View) m52106Q2().mo3946b());
        super.mo37451O1(bundle);
        m52119l1();
        m52115b3(V2);
        m52102M2();
    }

    /* renamed from: S2 */
    public final Client mo39119S2() {
        Client client = this.f41433H;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: U2 */
    public final C12544i2 mo39120U2() {
        C12544i2 i2Var = this.f41432G;
        if (i2Var != null) {
            return i2Var;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("text.card.applications.card.application.header", new Object[0]);
    }
}
