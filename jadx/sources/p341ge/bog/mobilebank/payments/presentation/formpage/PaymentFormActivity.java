package p341ge.bog.mobilebank.payments.presentation.formpage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import cy0.C31461c;
import cy0.C31481m;
import cy0.C31485o;
import dy0.C31619b;
import ey0.C31882c;
import ey0.C31884e;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lx0.C37177b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.payments.presentation.form.C33692a;
import p341ge.bog.mobilebank.payments.presentation.formpage.C33725c;
import p341ge.bog.mobilebank.payments.presentation.resultpage.PaymentResultActivity;
import p341ge.bog.mobilebank.payments.presentation.resultpage.model.PaymentResultObjectUiModel;
import s31.C38421a;
import ue1.C43064a;
import ue1.C43075l;
import ux0.C39165p;
import vx0.C39492b;

/* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity */
public final class PaymentFormActivity extends C33722a {

    /* renamed from: c0 */
    public static final C33706a f82132c0 = new C33706a((DefaultConstructorMarker) null);

    /* renamed from: V */
    public C33725c.C33726a f82133V;

    /* renamed from: W */
    private final C41217g f82134W = new C1617p0(C41520a0.m120436b(C33725c.class), new C33718m(this), new C33720o(this), new C33719n((C43064a) null, this));

    /* renamed from: X */
    private final C41217g f82135X = C41219i.m119470b(new C33716k(this));

    /* renamed from: Y */
    private final C41217g f82136Y = C41219i.m119470b(new C33715j(this));

    /* renamed from: Z */
    private final C33713h f82137Z = new C33713h(this);

    /* renamed from: a0 */
    private final C39165p f82138a0 = new C31884e();

    /* renamed from: b0 */
    private final C41217g f82139b0 = C41219i.m119470b(new C33707b(this));

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$a */
    public static final class C33706a {
        private C33706a() {
        }

        public /* synthetic */ C33706a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo80357a(String str, String str2, Context context) {
            C41536l.m120489i(str, "paymentServiceId");
            C41536l.m120489i(str2, "pageName");
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, PaymentFormActivity.class);
            intent.putExtra("ARGS_SERVICE_ID", str);
            intent.putExtra("ARGS_PAGE_NAME", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$b */
    static final class C33707b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PaymentFormActivity f82140d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33707b(PaymentFormActivity paymentFormActivity) {
            super(0);
            this.f82140d = paymentFormActivity;
        }

        /* renamed from: b */
        public final C31461c invoke() {
            return C31461c.f78036b.mo71872a(this.f82140d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$c */
    /* synthetic */ class C33708c extends C41535k implements C43075l {
        C33708c(Object obj) {
            super(1, obj, PaymentFormActivity.class, "onPaymentCards", "onPaymentCards(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo80359b(List list) {
            ((PaymentFormActivity) this.receiver).m99086o4(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80359b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$d */
    /* synthetic */ class C33709d extends C41535k implements C43075l {
        C33709d(Object obj) {
            super(1, obj, PaymentFormActivity.class, "onCanOrderCard", "onCanOrderCard(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo80360b(boolean z) {
            ((PaymentFormActivity) this.receiver).m99084m4(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80360b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$e */
    /* synthetic */ class C33710e extends C41535k implements C43075l {
        C33710e(Object obj) {
            super(1, obj, PaymentFormActivity.class, "onPackagesData", "onPackagesData(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo80361b(List list) {
            C41536l.m120489i(list, "p0");
            ((PaymentFormActivity) this.receiver).m99085n4(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80361b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$f */
    /* synthetic */ class C33711f extends C41535k implements C43075l {
        C33711f(Object obj) {
            super(1, obj, PaymentFormActivity.class, "onPaymentCommission", "onPaymentCommission(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo80362b(C31128a aVar) {
            ((PaymentFormActivity) this.receiver).m99087p4(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80362b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$g */
    /* synthetic */ class C33712g extends C41535k implements C43075l {
        C33712g(Object obj) {
            super(1, obj, PaymentFormActivity.class, "onPaymentResult", "onPaymentResult(Lge/bog/mobilebank/payments/presentation/resultpage/model/PaymentResultObjectUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo80363b(PaymentResultObjectUiModel paymentResultObjectUiModel) {
            C41536l.m120489i(paymentResultObjectUiModel, "p0");
            ((PaymentFormActivity) this.receiver).m99088q4(paymentResultObjectUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80363b((PaymentResultObjectUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$h */
    public static final class C33713h implements C39492b {

        /* renamed from: d */
        final /* synthetic */ PaymentFormActivity f82141d;

        C33713h(PaymentFormActivity paymentFormActivity) {
            this.f82141d = paymentFormActivity;
        }

        public void afterTextChanged(Editable editable) {
            C39492b.C39493a.m114809a(this, editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C39492b.C39493a.m114810b(this, charSequence, i, i2, i3);
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C39492b.C39493a.m114811c(this, charSequence, i, i2, i3);
        }

        /* renamed from: r */
        public void mo80367r(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            this.f82141d.m99078f4();
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$i */
    /* synthetic */ class C33714i extends C41535k implements C43075l {
        C33714i(Object obj) {
            super(1, obj, PaymentFormActivity.class, "onStartOldPaymentsActivity", "onStartOldPaymentsActivity(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo80368b(String str) {
            C41536l.m120489i(str, "p0");
            ((PaymentFormActivity) this.receiver).m99089r4(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80368b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$j */
    static final class C33715j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PaymentFormActivity f82142d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33715j(PaymentFormActivity paymentFormActivity) {
            super(0);
            this.f82142d = paymentFormActivity;
        }

        /* renamed from: b */
        public final C31481m invoke() {
            return C31481m.f78052g.mo71902a(this.f82142d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$k */
    static final class C33716k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PaymentFormActivity f82143d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33716k(PaymentFormActivity paymentFormActivity) {
            super(0);
            this.f82143d = paymentFormActivity;
        }

        /* renamed from: b */
        public final C31485o invoke() {
            return C31485o.f78055h.mo71906a(this.f82143d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$l */
    static final class C33717l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82144a;

        C33717l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82144a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82144a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82144a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$m */
    public static final class C33718m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f82145d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33718m(ComponentActivity componentActivity) {
            super(0);
            this.f82145d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f82145d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$n */
    public static final class C33719n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f82146d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f82147e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33719n(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f82146d = aVar;
            this.f82147e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f82146d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f82147e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$o */
    static final class C33720o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ PaymentFormActivity f82148d;

        /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity$o$a */
        static final class C33721a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ PaymentFormActivity f82149d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33721a(PaymentFormActivity paymentFormActivity) {
                super(0);
                this.f82149d = paymentFormActivity;
            }

            /* renamed from: b */
            public final C33725c invoke() {
                String str;
                String stringExtra;
                C33725c.C33726a k4 = this.f82149d.mo80356k4();
                Intent intent = this.f82149d.getIntent();
                String str2 = "";
                if (intent == null || (str = intent.getStringExtra("ARGS_SERVICE_ID")) == null) {
                    str = str2;
                }
                Intent intent2 = this.f82149d.getIntent();
                if (!(intent2 == null || (stringExtra = intent2.getStringExtra("ARGS_PAGE_NAME")) == null)) {
                    str2 = stringExtra;
                }
                return k4.mo32537a(str, str2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33720o(PaymentFormActivity paymentFormActivity) {
            super(0);
            this.f82148d = paymentFormActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C33721a(this.f82148d));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public final void m99078f4() {
        m99082j4().mo80381Rw().mo80374Fw(mo80253Z2().getAmount(), mo80259m3().mo71910x(mo80257j3().mo72308p()));
    }

    /* renamed from: g4 */
    private final C31461c m99079g4() {
        return (C31461c) this.f82139b0.getValue();
    }

    /* renamed from: h4 */
    private final C31481m m99080h4() {
        return (C31481m) this.f82136Y.getValue();
    }

    /* renamed from: i4 */
    private final C31485o m99081i4() {
        return (C31485o) this.f82135X.getValue();
    }

    /* renamed from: j4 */
    private final C33725c m99082j4() {
        return (C33725c) this.f82134W.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final void m99083l4(PaymentFormActivity paymentFormActivity, String str, Bundle bundle) {
        C41536l.m120489i(paymentFormActivity, "this$0");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "data");
        if (str.hashCode() == -331183453 && str.equals("SELECT_CARD_REQUEST_KEY")) {
            paymentFormActivity.m99079g4().mo71871w(bundle.getLong("SELECT_CARD_RESULT_KEY", -1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public final void m99084m4(boolean z) {
        m99079g4().mo71869r(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public final void m99085n4(List list) {
        m99080h4().mo71901u(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: o4 */
    public final void m99086o4(List list) {
        C31461c g4 = m99079g4();
        if (list == null) {
            list = C41341q.m119907j();
        }
        g4.mo71870s(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public final void m99087p4(C31128a aVar) {
        m99091t4(this, (C37177b) null, 1, (Object) null);
        if (aVar instanceof C31128a.C31129a) {
            mo74709H1(((C31128a.C31129a) aVar).mo71342c());
        } else if (aVar instanceof C31128a.C31131c) {
            m99090s4((C37177b) ((C31128a.C31131c) aVar).mo71340a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public final void m99088q4(PaymentResultObjectUiModel paymentResultObjectUiModel) {
        PaymentResultActivity.f82239J.mo80430a(paymentResultObjectUiModel, this);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public final void m99089r4(String str) {
        C33624a.m98713a(this).mo79806f(p341ge.bog.mobilebank.payment.activities.PaymentFormActivity.class).mo79819s(str).mo79825y();
        finish();
    }

    /* renamed from: s4 */
    private final void m99090s4(C37177b bVar) {
        mo80253Z2().mo71862k(bVar);
    }

    /* renamed from: t4 */
    static /* synthetic */ void m99091t4(PaymentFormActivity paymentFormActivity, C37177b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = null;
        }
        paymentFormActivity.m99090s4(bVar);
    }

    /* renamed from: N3 */
    public void mo80250N3(C31619b bVar) {
        C41536l.m120489i(bVar, "loading");
        super.mo80250N3(bVar);
        if (bVar.mo72039b()) {
            m99079g4().mo71868b(!bVar.mo72038a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        m99082j4().mo80391fx().mo4819k(this, new C33717l(new C33714i(this)));
    }

    /* renamed from: U3 */
    public void mo80252U3() {
        C33725c Uw = m99082j4().mo80384Uw();
        super.mo80252U3();
        Uw.mo80386Zw().mo4825q(this);
        Uw.mo80375Lw().mo4825q(this);
        Uw.mo80385Yw().mo4825q(this);
        Uw.mo80376Mw().mo4825q(this);
        Uw.mo80388cx().mo4825q(this);
    }

    /* renamed from: f3 */
    public C39165p mo56474f3() {
        return this.f82138a0;
    }

    /* renamed from: g3 */
    public List mo56475g3() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m99081i4().mo71905q());
        return arrayList;
    }

    /* renamed from: k4 */
    public final C33725c.C33726a mo80356k4() {
        C33725c.C33726a aVar = this.f82133V;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("viewModelFactory");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (mo80263s3()) {
            mo80253Z2().mo71861i(this.f82137Z);
        }
        super.onDestroy();
    }

    /* renamed from: p3 */
    public C33692a mo56476p3() {
        return m99082j4();
    }

    /* renamed from: r3 */
    public void mo80262r3(C38421a aVar) {
        C41536l.m120489i(aVar, "data");
        mo80253Z2().mo71863n(this.f82137Z);
        super.mo80262r3(aVar);
    }

    /* renamed from: t3 */
    public void mo80264t3() {
        super.mo80264t3();
        getSupportFragmentManager().mo4367F1("SELECT_CARD_REQUEST_KEY", this, new C31882c(this));
    }

    /* renamed from: x3 */
    public void mo80266x3() {
        C33725c Uw = m99082j4().mo80384Uw();
        super.mo80266x3();
        Uw.mo80386Zw().mo4819k(this, new C33717l(new C33708c(this)));
        Uw.mo80375Lw().mo4819k(this, new C33717l(new C33709d(this)));
        Uw.mo80385Yw().mo4819k(this, new C33717l(new C33710e(this)));
        Uw.mo80376Mw().mo4819k(this, new C33717l(new C33711f(this)));
        Uw.mo80388cx().mo4819k(this, new C33717l(new C33712g(this)));
    }

    /* renamed from: z3 */
    public void mo80267z3(C31128a aVar) {
        super.mo80267z3(aVar);
        if (aVar instanceof C31128a.C31131c) {
            m99091t4(this, (C37177b) null, 1, (Object) null);
        }
    }
}
