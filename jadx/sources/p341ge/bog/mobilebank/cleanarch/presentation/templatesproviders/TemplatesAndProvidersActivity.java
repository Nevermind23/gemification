package p341ge.bog.mobilebank.cleanarch.presentation.templatesproviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.C11398b;
import d60.C19910a;
import d60.C19911b;
import d60.C19912c;
import d60.C19913d;
import d60.C19914e;
import d60.C19915f;
import d60.C19916g;
import d60.C19917h;
import d60.C19918i;
import d60.C19919j;
import d60.C19920k;
import d60.C19921l;
import e60.C20180a;
import f60.C20439a;
import f60.C20441c;
import f60.C20442d;
import f60.C20443e;
import g91.C32297d;
import g91.C32315k0;
import g91.C32335t0;
import g91.C32343x;
import g91.C32355x0;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37104a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.InfoMessageView;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.CarTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.HouseTemplateGroupActivity;
import p341ge.bog.mobilebank.p975ui.activities.PaymentsTemplateListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity;
import p341ge.bog.mobilebank.p975ui.components.BogSwipeRefreshLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogFlatButton;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity */
public final class TemplatesAndProvidersActivity extends C22464a {

    /* renamed from: Q */
    public static final C22440a f59402Q = new C22440a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public Client f59403G;

    /* renamed from: H */
    private final C41217g f59404H = C41219i.m119470b(new C22445f(this));

    /* renamed from: I */
    private final C41217g f59405I = C41219i.m119470b(new C22444e(this));

    /* renamed from: J */
    private final C41217g f59406J = C41219i.m119470b(new C22462u(this));

    /* renamed from: K */
    private final C41217g f59407K = C41219i.m119470b(new C22442c(this));

    /* renamed from: L */
    private final C41217g f59408L = C41219i.m119470b(new C22443d(this));

    /* renamed from: M */
    private final C41217g f59409M = C41219i.m119470b(new C22461t(this));

    /* renamed from: N */
    private final C41217g f59410N = new C1617p0(C41520a0.m120436b(TemplatesProvidersViewModel.class), new C22459r(this), new C22458q(this), new C22460s((C43064a) null, this));

    /* renamed from: O */
    private C20180a f59411O;

    /* renamed from: P */
    private C37104a f59412P = new C19910a(this);

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$a */
    public static final class C22440a {
        private C22440a() {
        }

        public /* synthetic */ C22440a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$b */
    public /* synthetic */ class C22441b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59413a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                f60.e[] r0 = f60.C20443e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f60.e r1 = f60.C20443e.Loading     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f60.e r1 = f60.C20443e.Error     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f59413a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity.C22441b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$c */
    static final class C22442c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59414d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22442c(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(0);
            this.f59414d = templatesAndProvidersActivity;
        }

        /* renamed from: b */
        public final FrameLayout invoke() {
            return (FrameLayout) this.f59414d.findViewById(C10322k.f28821b5);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$d */
    static final class C22443d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59415d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22443d(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(0);
            this.f59415d = templatesAndProvidersActivity;
        }

        /* renamed from: b */
        public final InfoMessageView invoke() {
            return (InfoMessageView) this.f59415d.findViewById(C10322k.error_message_view);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$e */
    static final class C22444e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22444e(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(0);
            this.f59416d = templatesAndProvidersActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f59416d.findViewById(C10322k.new_payment_btn);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$f */
    static final class C22445f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22445f(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(0);
            this.f59417d = templatesAndProvidersActivity;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f59417d.findViewById(C10322k.content_recycler_view);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$g */
    static final class C22446g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22446g(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59418d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55445a(C20442d dVar) {
            C41536l.m120489i(dVar, "it");
            this.f59418d.m72804f3().mo55462kw(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55445a((C20442d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$h */
    static final class C22447h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59419d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22447h(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(0);
            this.f59419d = templatesAndProvidersActivity;
        }

        public final void invoke() {
            this.f59419d.m72795V2();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$i */
    static final class C22448i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22448i(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59420d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55446a(C20441c cVar) {
            C41536l.m120489i(cVar, "it");
            Intent intent = new Intent(this.f59420d, PaymentsTemplateListActivity.class);
            intent.putExtra("PAYMENT_TEMPLATE_LIST_TYPE_KEY", 30);
            intent.putExtra("PAYMENT_TEMPLATE_LIST_GROUP_KEY", cVar.mo48951b().getId());
            intent.putExtra("PRODUCT_TYPE_KEY", -1);
            intent.putExtra("PRODUCT_ACCT_KEY", -1);
            this.f59420d.startActivity(intent);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55446a((C20441c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$j */
    static final class C22449j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59421d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$j$a */
        static final class C22450a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ TemplatesAndProvidersActivity f59422d;

            /* renamed from: e */
            final /* synthetic */ C20441c f59423e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22450a(TemplatesAndProvidersActivity templatesAndProvidersActivity, C20441c cVar) {
                super(0);
                this.f59422d = templatesAndProvidersActivity;
                this.f59423e = cVar;
            }

            public final void invoke() {
                this.f59422d.m72804f3().mo55456dw(this.f59423e.mo48951b());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22449j(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59421d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55447a(C20441c cVar) {
            C41536l.m120489i(cVar, "it");
            TemplatesAndProvidersActivity templatesAndProvidersActivity = this.f59421d;
            templatesAndProvidersActivity.m72817s3(new C22450a(templatesAndProvidersActivity, cVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55447a((C20441c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$k */
    static final class C22451k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22451k(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59424d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55448a(C20441c cVar) {
            C41536l.m120489i(cVar, "it");
            Intent intent = new Intent(this.f59424d, CarTemplateGroupActivity.class);
            intent.putExtra("TEMPLATE_GROUP_ITEM_ID", cVar.mo48951b().getId());
            this.f59424d.startActivity(intent);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55448a((C20441c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$l */
    static final class C22452l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59425d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22452l(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59425d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55449a(C20439a aVar) {
            C41536l.m120489i(aVar, "it");
            if (C41536l.m120484d(aVar.mo48944b().getServiceId(), "TRANSPORT_PASS")) {
                C38122f.C38123a.m112203D(C38125h.m112238c(this.f59425d), this.f59425d, (String) null, 2, (Object) null);
            } else {
                C33624a.m98713a(this.f59425d).mo79806f(PaymentFormActivity.class).mo79819s(aVar.mo48944b().getServiceId()).mo79825y();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55449a((C20439a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$m */
    static final class C22453m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59426d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22453m(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59426d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55450a(C20442d dVar) {
            C41536l.m120489i(dVar, "it");
            C33624a.m98713a(this.f59426d).mo79806f(TemplateFormActivity.class).mo79821u(dVar.mo48956d().getId()).mo79825y();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55450a((C20442d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$n */
    static final class C22454n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59427d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22454n(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59427d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55451a(C20442d dVar) {
            C41536l.m120489i(dVar, "it");
            C36546y.m108282F().mo27152s("transfers_templates", "automatic_services", "swipe_menu_click");
            C33624a.m98713a(this.f59427d).mo79813m(C32315k0.m95259h(dVar.mo48956d())).mo79810j(dVar.mo48956d().getTemplateNameOrServiceName(this.f59427d.mo55440Z2())).mo79819s(dVar.mo48956d().getServiceId()).mo79806f(DDTransparentLoaderActivity.class).mo79825y();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55451a((C20442d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$o */
    static final class C22455o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59428d;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$o$a */
        static final class C22456a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ TemplatesAndProvidersActivity f59429d;

            /* renamed from: e */
            final /* synthetic */ C20442d f59430e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22456a(TemplatesAndProvidersActivity templatesAndProvidersActivity, C20442d dVar) {
                super(0);
                this.f59429d = templatesAndProvidersActivity;
                this.f59430e = dVar;
            }

            public final void invoke() {
                this.f59429d.m72804f3().mo55457ew(this.f59430e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22455o(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59428d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55452a(C20442d dVar) {
            C41536l.m120489i(dVar, "it");
            C36546y.m108282F().mo27152s("payments_templates", "delete", "swipe_menu_click");
            TemplatesAndProvidersActivity templatesAndProvidersActivity = this.f59428d;
            templatesAndProvidersActivity.m72817s3(new C22456a(templatesAndProvidersActivity, dVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55452a((C20442d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$p */
    static final class C22457p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22457p(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(1);
            this.f59431d = templatesAndProvidersActivity;
        }

        /* renamed from: a */
        public final void mo55453a(C20442d dVar) {
            C41536l.m120489i(dVar, "it");
            C36546y.m108282F().mo27152s("transfers_templates", "edit", "swipe_menu_click");
            C33624a.m98713a(this.f59431d).mo79806f(TemplateFormActivity.class).mo79821u(dVar.mo48956d().getId()).mo79815o(true).mo79825y();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55453a((C20442d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$q */
    public static final class C22458q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22458q(ComponentActivity componentActivity) {
            super(0);
            this.f59432d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f59432d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$r */
    public static final class C22459r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f59433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22459r(ComponentActivity componentActivity) {
            super(0);
            this.f59433d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f59433d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$s */
    public static final class C22460s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f59434d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f59435e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22460s(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f59434d = aVar;
            this.f59435e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f59434d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f59435e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$t */
    static final class C22461t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22461t(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(0);
            this.f59436d = templatesAndProvidersActivity;
        }

        /* renamed from: b */
        public final StateView invoke() {
            return (StateView) this.f59436d.findViewById(C10322k.f28746Hv);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.TemplatesAndProvidersActivity$u */
    static final class C22462u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TemplatesAndProvidersActivity f59437d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22462u(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
            super(0);
            this.f59437d = templatesAndProvidersActivity;
        }

        /* renamed from: b */
        public final BogSwipeRefreshLayout invoke() {
            return (BogSwipeRefreshLayout) this.f59437d.findViewById(C10322k.f28739Gw);
        }
    }

    /* renamed from: T2 */
    private final void m72793T2() {
        BogFlatButton bogFlatButton = new BogFlatButton(this);
        bogFlatButton.setTextSize(14);
        bogFlatButton.setText(getString(C10328q.templates_button_create), C32335t0.m95367l(this, true), true, false);
        bogFlatButton.setOnClickListener(new C19920k(this));
        int i = C10319h.create_template_button_padding;
        bogFlatButton.setPadding(C32355x0.m95516g(i), 0, C32355x0.m95516g(i), 0);
        m72798Y2().addView(bogFlatButton);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m72794U2(TemplatesAndProvidersActivity templatesAndProvidersActivity, View view) {
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        templatesAndProvidersActivity.m72795V2();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final void m72795V2() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(C10328q.templates_list_create_template_payment));
        arrayList.add(getString(C10328q.templates_list_create_template_car));
        arrayList.add(getString(C10328q.templates_list_create_template_house));
        mo86445u2(arrayList, this.f59412P, new C19917h());
        C36546y.m108282F().mo27152s("all_templates", "payment_template", "click");
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m72796W2(View view) {
        C36546y.m108282F().mo27152s("all_templates", "create_template_dialog", "cancel");
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m72797X2(TemplatesAndProvidersActivity templatesAndProvidersActivity, int i) {
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        if (i == 0) {
            C36546y.m108282F().mo27152s("all_templates", "payment", "select_template_type");
            Intent intent = new Intent(templatesAndProvidersActivity, ProviderListActivity.class);
            intent.putExtra("CREATE_NEW_TEMPLATE", true);
            templatesAndProvidersActivity.startActivity(intent);
        } else if (i != 1) {
            C36546y.m108282F().mo27152s("all_templates", "group_house", "select_template_type");
            Intent intent2 = new Intent(templatesAndProvidersActivity, HouseTemplateGroupActivity.class);
            intent2.putExtra("NEW_TEMPLATE", true);
            templatesAndProvidersActivity.startActivity(intent2);
        } else {
            C36546y.m108282F().mo27152s("all_templates", "group_car", "select_template_type");
            Intent intent3 = new Intent(templatesAndProvidersActivity, CarTemplateGroupActivity.class);
            intent3.putExtra("NEW_TEMPLATE", true);
            templatesAndProvidersActivity.startActivity(intent3);
        }
    }

    /* renamed from: Y2 */
    private final FrameLayout m72798Y2() {
        Object value = this.f59407K.getValue();
        C41536l.m120488h(value, "<get-buttonContainer>(...)");
        return (FrameLayout) value;
    }

    /* renamed from: a3 */
    private final InfoMessageView m72799a3() {
        Object value = this.f59408L.getValue();
        C41536l.m120488h(value, "<get-errorMessageView>(...)");
        return (InfoMessageView) value;
    }

    /* renamed from: b3 */
    private final Button m72800b3() {
        Object value = this.f59405I.getValue();
        C41536l.m120488h(value, "<get-newPaymentBtn>(...)");
        return (Button) value;
    }

    /* renamed from: c3 */
    private final RecyclerView m72801c3() {
        Object value = this.f59404H.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: d3 */
    private final StateView m72802d3() {
        Object value = this.f59409M.getValue();
        C41536l.m120488h(value, "<get-stateView>(...)");
        return (StateView) value;
    }

    /* renamed from: e3 */
    private final BogSwipeRefreshLayout m72803e3() {
        Object value = this.f59406J.getValue();
        C41536l.m120488h(value, "<get-swipeRefreshLayout>(...)");
        return (BogSwipeRefreshLayout) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final TemplatesProvidersViewModel m72804f3() {
        return (TemplatesProvidersViewModel) this.f59410N.getValue();
    }

    /* renamed from: g3 */
    private final void m72805g3() {
        TemplatesProvidersViewModel f3 = m72804f3();
        f3.mo55460hw().mo4819k(this, new C19913d(this));
        f3.mo55459gw().mo4819k(this, new C19914e(this));
        f3.mo55458fw().mo4819k(this, new C19915f(this));
        f3.mo55461iw().mo4819k(this, new C19916g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m72806h3(TemplatesAndProvidersActivity templatesAndProvidersActivity, C20442d dVar) {
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        C20180a aVar = templatesAndProvidersActivity.f59411O;
        C20180a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        C41536l.m120488h(dVar, "it");
        aVar.mo48576k(dVar);
        BogSwipeRefreshLayout e3 = templatesAndProvidersActivity.m72803e3();
        C20180a aVar3 = templatesAndProvidersActivity.f59411O;
        if (aVar3 == null) {
            C41536l.m120506z("adapter");
        } else {
            aVar2 = aVar3;
        }
        e3.setRefreshing(!aVar2.mo48575j());
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public static final void m72807i3(TemplatesAndProvidersActivity templatesAndProvidersActivity, Integer num) {
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        BogSwipeRefreshLayout e3 = templatesAndProvidersActivity.m72803e3();
        boolean z = false;
        if (num != null && num.intValue() == 20) {
            C32297d.m95160h(templatesAndProvidersActivity, templatesAndProvidersActivity.getString(C10328q.template_successfuly_deleted));
        } else if (num != null && num.intValue() == 10) {
            z = true;
        } else {
            C32297d.m95154b(templatesAndProvidersActivity, templatesAndProvidersActivity.getString(C10328q.f28955d2));
        }
        e3.setRefreshing(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m72808j3(TemplatesAndProvidersActivity templatesAndProvidersActivity, C20443e eVar) {
        int i;
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        if (eVar == null) {
            i = -1;
        } else {
            i = C22441b.f59413a[eVar.ordinal()];
        }
        if (i == 1) {
            return;
        }
        if (i != 2) {
            templatesAndProvidersActivity.m72803e3().setRefreshing(false);
            C32343x.m95407O0(templatesAndProvidersActivity.m72801c3());
            templatesAndProvidersActivity.m72802d3().mo53595c();
            C32343x.m95447f1(templatesAndProvidersActivity.m72800b3());
            return;
        }
        templatesAndProvidersActivity.m72803e3().setRefreshing(false);
        C20180a aVar = templatesAndProvidersActivity.f59411O;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        aVar.mo48580o((ArrayList) null);
        templatesAndProvidersActivity.m72802d3().mo53596d();
        C32343x.m95447f1(templatesAndProvidersActivity.m72800b3());
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m72809k3(TemplatesAndProvidersActivity templatesAndProvidersActivity, ArrayList arrayList) {
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        C20180a aVar = templatesAndProvidersActivity.f59411O;
        C20180a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        aVar.mo48580o(arrayList);
        BogSwipeRefreshLayout e3 = templatesAndProvidersActivity.m72803e3();
        C20180a aVar3 = templatesAndProvidersActivity.f59411O;
        if (aVar3 == null) {
            C41536l.m120506z("adapter");
        } else {
            aVar2 = aVar3;
        }
        e3.setRefreshing(!aVar2.mo48575j());
        C32343x.m95407O0(templatesAndProvidersActivity.m72801c3());
        C32343x.m95447f1(templatesAndProvidersActivity.m72800b3());
        if (arrayList.isEmpty()) {
            templatesAndProvidersActivity.m72802d3().mo53598f();
        } else {
            templatesAndProvidersActivity.m72802d3().mo53595c();
        }
    }

    /* renamed from: l3 */
    private final void m72810l3() {
        C20180a aVar = this.f59411O;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        aVar.mo48579n(new C22447h(this));
        aVar.mo48581p(new C22448i(this));
        aVar.mo48582q(new C22449j(this));
        aVar.mo48583r(new C22451k(this));
        aVar.mo48584s(new C22452l(this));
        aVar.mo48586u(new C22453m(this));
        aVar.mo48585t(new C22454n(this));
        aVar.mo48587v(new C22455o(this));
        aVar.mo48588w(new C22457p(this));
        aVar.mo48589x(new C22446g(this));
    }

    /* renamed from: m3 */
    private final void m72811m3() {
        m72803e3().setOnRefreshListener(new C19921l(this));
        m72799a3().setOnClickListener(new C19911b(this));
        m72800b3().setOnClickListener(new C19912c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m72812n3(TemplatesAndProvidersActivity templatesAndProvidersActivity) {
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        C20180a aVar = templatesAndProvidersActivity.f59411O;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        aVar.mo48580o((ArrayList) null);
        C32343x.m95405N0(templatesAndProvidersActivity.m72801c3());
        C32343x.m95447f1(templatesAndProvidersActivity.m72800b3());
        templatesAndProvidersActivity.m72802d3().mo53595c();
        templatesAndProvidersActivity.m72804f3().mo55463lw();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m72813o3(TemplatesAndProvidersActivity templatesAndProvidersActivity, View view) {
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        templatesAndProvidersActivity.m72804f3().mo55463lw();
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m72814p3(TemplatesAndProvidersActivity templatesAndProvidersActivity, View view) {
        C41536l.m120489i(templatesAndProvidersActivity, "this$0");
        m72816r3(templatesAndProvidersActivity, "PROVIDER_LIST_IS_SHOW_ALL_LIST", (String) null, (String) null, 6, (Object) null);
    }

    /* renamed from: q3 */
    private final void m72815q3(String str, String str2, String str3) {
        C38122f.C38123a.m112201B(C38125h.m112238c(this), this, "templates_page", (String) null, false, 12, (Object) null);
    }

    /* renamed from: r3 */
    static /* synthetic */ void m72816r3(TemplatesAndProvidersActivity templatesAndProvidersActivity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        templatesAndProvidersActivity.m72815q3(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m72817s3(C43064a aVar) {
        C35388f2.m105072l2(this, getString(C10328q.delete_template_dialog_title), getString(C10328q.delete_template_dialog_text), getString(C10328q.f28966r2), getString(C10328q.f28951b2), new C19918i(aVar), new C19919j(), true, true, "Alert", (View.OnClickListener) null, C11398b.f33140s, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m72818t3(C43064a aVar, View view) {
        C41536l.m120489i(aVar, "$callback");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m72819u3(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_templates_providers_list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m72801c3().setLayoutManager(new LinearLayoutManager(this));
        m72803e3().setDistanceToTriggerSync(((int) (((float) 64) * getResources().getDisplayMetrics().density)) * 3);
        this.f59411O = new C20180a();
        RecyclerView c3 = m72801c3();
        C20180a aVar = this.f59411O;
        if (aVar == null) {
            C41536l.m120506z("adapter");
            aVar = null;
        }
        c3.setAdapter(aVar);
        m72810l3();
        C32343x.m95455i0(m72800b3());
        m72802d3().mo53597e();
        m72811m3();
        m72805g3();
        m72793T2();
    }

    /* renamed from: Z2 */
    public final Client mo55440Z2() {
        Client client = this.f59403G;
        if (client != null) {
            return client;
        }
        C41536l.m120506z("client");
        return null;
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.payments_label_payments_header);
        C41536l.m120488h(string, "getString(R.string.payments_label_payments_header)");
        return string;
    }
}
