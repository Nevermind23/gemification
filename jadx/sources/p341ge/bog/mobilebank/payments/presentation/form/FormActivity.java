package p341ge.bog.mobilebank.payments.presentation.form;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.result.C0173b;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import com.salesforce.marketingcloud.UrlHandler;
import cy0.C31457a;
import cy0.C31465e;
import cy0.C31469g;
import cy0.C31473i;
import cy0.C31477k;
import cy0.C31489q;
import cy0.C31493s;
import cy0.C31497u;
import dy0.C31618a;
import dy0.C31619b;
import dy0.C31620c;
import dy0.C31622e;
import ey0.C31877a;
import g91.C32290b1;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import i91.C36370c;
import java.util.List;
import jx0.C36813c;
import jx0.C36819f;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lx0.C37179d;
import m41.C37224b;
import ox0.C37833c;
import p017b.C2105c;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.payments.domain.model.KeyValue;
import p341ge.bog.mobilebank.payments.presentation.form.C33692a;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import s31.C38421a;
import ue1.C43064a;
import ue1.C43075l;
import ux0.C39116c;
import ux0.C39118d;
import ux0.C39145e;
import ux0.C39147f;
import ux0.C39149g;
import ux0.C39151h;
import ux0.C39153i;
import ux0.C39156j;
import ux0.C39162n;
import ux0.C39163o;
import ux0.C39165p;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity */
public abstract class FormActivity extends C33694b implements C39162n, C41185v.C41186a {

    /* renamed from: T */
    public static final C33667a f82066T = new C33667a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f82067G = C41219i.m119470b(new C33669c(this));

    /* renamed from: H */
    public PreferencesApiManager f82068H;

    /* renamed from: I */
    protected C31877a f82069I;

    /* renamed from: J */
    private C39163o f82070J;

    /* renamed from: K */
    private final C41217g f82071K = C41219i.m119470b(new C33674h(this));

    /* renamed from: L */
    private final C41217g f82072L = C41219i.m119470b(new C33691y(this));

    /* renamed from: M */
    private final C41217g f82073M = C41219i.m119470b(new C33690x(this));

    /* renamed from: N */
    private final C41217g f82074N = C41219i.m119470b(new C33672f(this));

    /* renamed from: O */
    private final C41217g f82075O = C41219i.m119470b(new C33668b(this));

    /* renamed from: P */
    private final C41217g f82076P = C41219i.m119470b(new C33673g(this));

    /* renamed from: Q */
    private final C41217g f82077Q = C41219i.m119470b(new C33689w(this));

    /* renamed from: R */
    private final C41217g f82078R = C41219i.m119470b(new C33670d(this));

    /* renamed from: S */
    private final C0173b f82079S;

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$a */
    public static final class C33667a {
        private C33667a() {
        }

        public /* synthetic */ C33667a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$b */
    static final class C33668b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33668b(FormActivity formActivity) {
            super(0);
            this.f82080d = formActivity;
        }

        /* renamed from: b */
        public final C31457a invoke() {
            return C31457a.f78033a.mo71864a(this.f82080d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$c */
    static final class C33669c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82081d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33669c(FormActivity formActivity) {
            super(0);
            this.f82081d = formActivity;
        }

        /* renamed from: b */
        public final C36813c invoke() {
            return C36813c.m109065d(this.f82081d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$d */
    static final class C33670d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33670d(FormActivity formActivity) {
            super(0);
            this.f82082d = formActivity;
        }

        /* renamed from: b */
        public final C31465e invoke() {
            return C31465e.f78039c.mo71876a(this.f82082d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$e */
    static final class C33671e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33671e(FormActivity formActivity) {
            super(1);
            this.f82083d = formActivity;
        }

        /* renamed from: a */
        public final void mo80271a(Exception exc) {
            C41536l.m120489i(exc, "err");
            this.f82083d.mo74709H1(exc);
            this.f82083d.mo80254a3().f88809h.mo53596d();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80271a((Exception) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$f */
    static final class C33672f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33672f(FormActivity formActivity) {
            super(0);
            this.f82084d = formActivity;
        }

        /* renamed from: b */
        public final C31469g invoke() {
            return C31469g.f78042d.mo71884a(this.f82084d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$g */
    static final class C33673g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82085d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33673g(FormActivity formActivity) {
            super(0);
            this.f82085d = formActivity;
        }

        /* renamed from: b */
        public final C31473i invoke() {
            return C31473i.f78046e.mo71890a(this.f82085d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$h */
    static final class C33674h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82086d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33674h(FormActivity formActivity) {
            super(0);
            this.f82086d = formActivity;
        }

        /* renamed from: b */
        public final C31477k invoke() {
            return C31477k.f78049f.mo71898a(this.f82086d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$i */
    /* synthetic */ class C33675i extends C41535k implements C43075l {
        C33675i(Object obj) {
            super(1, obj, FormActivity.class, "onPaymentConfigResult", "onPaymentConfigResult(Lge/bog/mobilebank/shared/payments/domain/model/PaymentConfigDetails;)V", 0);
        }

        /* renamed from: b */
        public final void mo80275b(C38421a aVar) {
            ((FormActivity) this.receiver).m98882C3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80275b((C38421a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$j */
    static final class C33676j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82087d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33676j(FormActivity formActivity) {
            super(1);
            this.f82087d = formActivity;
        }

        /* renamed from: a */
        public final void mo80276a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f82087d.m98933y3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80276a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$k */
    static final class C33677k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82088d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33677k(FormActivity formActivity) {
            super(1);
            this.f82088d = formActivity;
        }

        /* renamed from: a */
        public final void mo80277a(C31622e eVar) {
            C41536l.m120489i(eVar, "it");
            this.f82088d.m98922d3().mo71888A(eVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80277a((C31622e) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$l */
    static final class C33678l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82089d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33678l(FormActivity formActivity) {
            super(1);
            this.f82089d = formActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            FormActivity formActivity = this.f82089d;
            C41536l.m120488h(bool, "it");
            formActivity.m98913T3(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$m */
    /* synthetic */ class C33679m extends C41535k implements C43075l {
        C33679m(Object obj) {
            super(1, obj, FormActivity.class, "onInitialData", "onInitialData(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo80279b(C31128a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((FormActivity) this.receiver).m98880A3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80279b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$n */
    /* synthetic */ class C33680n extends C41535k implements C43075l {
        C33680n(Object obj) {
            super(1, obj, FormActivity.class, "onTemplates", "onTemplates(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo80280b(C31128a aVar) {
            ((FormActivity) this.receiver).m98891H3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80280b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$o */
    /* synthetic */ class C33681o extends C41535k implements C43075l {
        C33681o(Object obj) {
            super(1, obj, FormActivity.class, "onFormSecondPageParamsResult", "onFormSecondPageParamsResult(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo80281b(C31128a aVar) {
            ((FormActivity) this.receiver).mo80267z3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80281b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$p */
    /* synthetic */ class C33682p extends C41519a implements C43075l {
        C33682p(Object obj) {
            super(1, obj, FormActivity.class, "onScaStateResult", "onScaStateResult(Lge/bog/mobilebank/payments/presentation/form/model/ScaStateResource;)Lkotlin/Unit;", 8);
        }

        /* renamed from: b */
        public final void mo80282b(C31620c cVar) {
            C41536l.m120489i(cVar, "p0");
            C41238w unused = ((FormActivity) this.f97690d).m98889G3(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80282b((C31620c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$q */
    /* synthetic */ class C33683q extends C41535k implements C43075l {
        C33683q(Object obj) {
            super(1, obj, FormActivity.class, "setFormLoading", "setFormLoading(Lge/bog/mobilebank/payments/presentation/form/model/FormLoadingUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo80283b(C31619b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((FormActivity) this.receiver).mo80250N3(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80283b((C31619b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$r */
    /* synthetic */ class C33684r extends C41535k implements C43075l {
        C33684r(Object obj) {
            super(1, obj, FormActivity.class, "onPaymentError", "onPaymentError(Lge/bog/mobilebank/shared/requestedresult/RequestedResult;)V", 0);
        }

        /* renamed from: b */
        public final void mo80284b(C31128a aVar) {
            ((FormActivity) this.receiver).m98885E3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80284b((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$s */
    /* synthetic */ class C33685s extends C41535k implements C43075l {
        C33685s(Object obj) {
            super(1, obj, FormActivity.class, "restoreData", "restoreData(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo80285b(List list) {
            C41536l.m120489i(list, "p0");
            ((FormActivity) this.receiver).m98895J3(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80285b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$t */
    /* synthetic */ class C33686t extends C41535k implements C43075l {
        C33686t(Object obj) {
            super(1, obj, FormActivity.class, "onMainButtonText", "onMainButtonText(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo80286b(String str) {
            C41536l.m120489i(str, "p0");
            ((FormActivity) this.receiver).m98881B3(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo80286b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$u */
    static final class C33687u extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82090d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33687u(FormActivity formActivity) {
            super(1);
            this.f82090d = formActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f82090d.mo80254a3().f88810i;
            C41536l.m120488h(button, "binding.mainButton");
            C41536l.m120488h(bool, "it");
            C32343x.m95483r1(button, bool.booleanValue(), false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$v */
    static final class C33688v implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f82091a;

        C33688v(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f82091a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f82091a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f82091a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$w */
    static final class C33689w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33689w(FormActivity formActivity) {
            super(0);
            this.f82092d = formActivity;
        }

        /* renamed from: b */
        public final C31489q invoke() {
            return C31489q.f78058i.mo71911a(this.f82092d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$x */
    static final class C33690x extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33690x(FormActivity formActivity) {
            super(0);
            this.f82093d = formActivity;
        }

        /* renamed from: b */
        public final C31493s invoke() {
            return C31493s.f78061j.mo71915a(this.f82093d.mo80257j3());
        }
    }

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.FormActivity$y */
    static final class C33691y extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ FormActivity f82094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33691y(FormActivity formActivity) {
            super(0);
            this.f82094d = formActivity;
        }

        /* renamed from: b */
        public final C31497u invoke() {
            return C31497u.f78064k.mo71920a(this.f82094d.mo80257j3());
        }
    }

    public FormActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2105c(), new C39116c(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f82079S = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public final void m98880A3(C31128a aVar) {
        if (aVar instanceof C31128a.C31130b) {
            if (mo80257j3().mo80302f().isEmpty()) {
                mo80254a3().f88809h.mo53597e();
            }
        } else if (aVar instanceof C31128a.C31129a) {
            mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            mo80254a3().f88809h.mo53596d();
        } else if (aVar instanceof C31128a.C31131c) {
            mo80254a3().f88809h.mo53595c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public final void m98881B3(String str) {
        mo80254a3().f88810i.setButtonText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: C3 */
    public final void m98882C3(C38421a aVar) {
        if (aVar != null) {
            mo80254a3().mo3946b().post(new C39118d(this, aVar));
        } else {
            mo80266x3();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static final void m98883D3(FormActivity formActivity, C38421a aVar) {
        C41536l.m120489i(formActivity, "this$0");
        List B0 = C41358y.m119991B0(formActivity.mo80257j3().mo72307n(false));
        C31618a h = formActivity.mo80253Z2().mo71860h();
        if (h != null) {
            B0.add(h);
        }
        formActivity.mo80252U3();
        formActivity.mo86429X1(formActivity.m98925i3());
        if (!B0.isEmpty()) {
            formActivity.mo56476p3().mo56501R1(B0);
        }
        formActivity.m98917W2(aVar);
        formActivity.mo80266x3();
        formActivity.m98895J3(formActivity.mo56476p3().mo56527ml());
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public final void m98885E3(C31128a aVar) {
        if (aVar instanceof C31128a.C31129a) {
            mo74709H1(((C31128a.C31129a) aVar).mo71342c());
        }
    }

    /* renamed from: F3 */
    private final void m98887F3() {
        m98921c3().mo71883y();
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final C41238w m98889G3(C31620c cVar) {
        C21503d a = cVar.mo72043a();
        Dialog dialog = null;
        if (a instanceof C21503d.C21506c) {
            C41185v.C41187b bVar = C41185v.f97155C;
            Object a2 = cVar.mo72043a().mo53701a();
            C41536l.m120486f(a2);
            C41185v e = C41185v.C41187b.m119423e(bVar, (String) a2, mo56476p3().mo56506W3(m98923e3(), m98921c3().mo71879j()), (C41143c) null, 4, (Object) null);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            e.mo4576A1(supportFragmentManager, (String) null);
            return C41238w.f97225a;
        } else if (a instanceof C21503d.C21505b) {
            C41185v l3 = m98926l3();
            if (l3 == null) {
                return null;
            }
            l3.mo95635L2(true);
            return C41238w.f97225a;
        } else if (!(a instanceof C21503d.C21504a)) {
            C41185v l32 = m98926l3();
            if (l32 == null) {
                return null;
            }
            m98929q3(l32.mo4579n1());
            l32.mo4577k1();
            return C41238w.f97225a;
        } else if (((C21503d.C21504a) cVar.mo72043a()).mo53708h()) {
            C41185v l33 = m98926l3();
            if (l33 == null) {
                return null;
            }
            l33.mo95634K2(C32343x.m95388F(((C21503d.C21504a) cVar.mo72043a()).mo53705e(), new Object[0]));
            return C41238w.f97225a;
        } else {
            C41185v l34 = m98926l3();
            if (l34 != null) {
                dialog = l34.mo4579n1();
            }
            m98929q3(dialog);
            C41185v l35 = m98926l3();
            if (l35 != null) {
                l35.mo4577k1();
            }
            mo74709H1(((C21503d.C21504a) cVar.mo72043a()).mo53706f());
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H3 */
    public final void m98891H3(C31128a aVar) {
        m98928o3().mo71919d(aVar);
    }

    /* renamed from: I3 */
    private final void m98893I3() {
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").addFlags(268435456).addFlags(1073741824).setData(Uri.fromParts("package", getPackageName(), (String) null));
        C41536l.m120488h(data, "Intent(Settings.ACTION_A… this.packageName, null))");
        if (data.resolveActivity(getPackageManager()) != null) {
            startActivity(data);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J3 */
    public final void m98895J3(List list) {
        m98922d3().mo71889B(list);
    }

    /* renamed from: K3 */
    private final void m98897K3() {
        mo80254a3().f88807f.f88853g.setOnClickListener(new C39145e(this));
        mo80254a3().f88810i.setOnClickListener(new C39147f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L3 */
    public static final void m98899L3(FormActivity formActivity, View view) {
        C41536l.m120489i(formActivity, "this$0");
        formActivity.mo56476p3().mo56515bs();
    }

    /* access modifiers changed from: private */
    /* renamed from: M3 */
    public static final void m98901M3(FormActivity formActivity, View view) {
        C41536l.m120489i(formActivity, "this$0");
        formActivity.m98933y3();
    }

    /* renamed from: P3 */
    private final void m98905P3() {
        mo80254a3().f88808g.setFormManager(mo80257j3());
        mo80254a3().f88809h.mo53597e();
    }

    /* renamed from: Q3 */
    private final void m98907Q3() {
        C36819f fVar = mo80254a3().f88807f;
        PageDescriptionView pageDescriptionView = fVar.f88852f;
        C37833c cVar = C37833c.f90838a;
        pageDescriptionView.setTitle(C34646b.m101752f(cVar.mo91161w(), (Context) null, 1, (Object) null));
        fVar.f88853g.setButtonText(C34646b.m101752f(cVar.mo91160v(), (Context) null, 1, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: R3 */
    public static final void m98909R3(C13310d dVar, C43064a aVar, Button button) {
        C41536l.m120489i(dVar, "$dialog");
        C41536l.m120489i(aVar, "$onConfirm");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: S3 */
    public static final void m98911S3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$dialog");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: T3 */
    public final void m98913T3(boolean z) {
        boolean z2;
        if (!z || m98921c3().mo71882o() || !C36370c.m107927h(this)) {
            z2 = false;
        } else {
            z2 = true;
        }
        m98920b3().mo71875p(z2);
    }

    /* renamed from: V3 */
    private final void m98916V3() {
        mo80257j3().mo80306l();
    }

    /* renamed from: W2 */
    private final void m98917W2(C38421a aVar) {
        m98919Y2(aVar);
        mo80262r3(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public static final void m98918X2(FormActivity formActivity, Boolean bool) {
        C41536l.m120489i(formActivity, "this$0");
        C41536l.m120488h(bool, "isGranted");
        if (bool.booleanValue()) {
            formActivity.m98913T3(true);
            formActivity.m98924h3().mo71896g();
            formActivity.m98924h3().mo71897v();
        } else if (!ActivityCompat.m2592x(formActivity, "android.permission.READ_CONTACTS")) {
            formActivity.m98893I3();
        }
    }

    /* renamed from: Y2 */
    private final void m98919Y2(C38421a aVar) {
        mo80257j3().mo80304j();
        mo80257j3().mo72310r(aVar, new C33671e(this));
    }

    /* renamed from: b3 */
    private final C31465e m98920b3() {
        return (C31465e) this.f82078R.getValue();
    }

    /* renamed from: c3 */
    private final C31469g m98921c3() {
        return (C31469g) this.f82074N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final C31473i m98922d3() {
        return (C31473i) this.f82076P.getValue();
    }

    /* renamed from: e3 */
    private final List m98923e3() {
        List B0 = C41358y.m119991B0(mo56475g3());
        B0.add(new KeyValue("channel", "mob"));
        return B0;
    }

    /* renamed from: h3 */
    private final C31477k m98924h3() {
        return (C31477k) this.f82071K.getValue();
    }

    /* renamed from: i3 */
    private final String m98925i3() {
        return mo56476p3().mo56496Kk();
    }

    /* renamed from: l3 */
    private final C41185v m98926l3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* renamed from: n3 */
    private final C31493s m98927n3() {
        return (C31493s) this.f82073M.getValue();
    }

    /* renamed from: o3 */
    private final C31497u m98928o3() {
        return (C31497u) this.f82072L.getValue();
    }

    /* renamed from: q3 */
    private final C41238w m98929q3(Dialog dialog) {
        if (dialog == null) {
            return null;
        }
        View currentFocus = dialog.getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = getSystemService("input_method");
            C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m98930u3(FormActivity formActivity, String str, Bundle bundle) {
        C41536l.m120489i(formActivity, "this$0");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "<anonymous parameter 1>");
        if (str.hashCode() == 502912750 && str.equals("ScaVerificationDialogFragment.CLOSE")) {
            C33692a.C33693a.m99009a(formActivity.mo56476p3(), (C21503d) null, (String) null, (String) null, (String) null, formActivity.m98921c3().mo71879j(), (List) null, 46, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m98931v3(FormActivity formActivity, String str, Bundle bundle) {
        String string;
        C41536l.m120489i(formActivity, "this$0");
        C41536l.m120489i(str, "requestKey");
        C41536l.m120489i(bundle, "data");
        if (str.hashCode() == -1468994132 && str.equals("SELECT_REQUEST_KEY") && (string = bundle.getString("SELECT_RESULT_KEY")) != null) {
            formActivity.m98927n3().mo71914c(bundle.getInt("SELECT_RESULT_ELEMENT_INDEX"), string);
        }
    }

    /* renamed from: w3 */
    private final void m98932w3() {
        mo56476p3().mo56486Ce().mo4819k(this, new C33688v(new C33675i(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public final void m98933y3() {
        List list;
        C32290b1.m95111a(this);
        m98916V3();
        if (mo80257j3().mo80303g()) {
            String amount = mo80253Z2().getAmount();
            if (mo56476p3().mo56503Tu()) {
                list = mo80259m3().mo71910x(mo80257j3().mo72308p());
            } else {
                list = C41341q.m119907j();
            }
            mo56476p3().mo56491Hq(amount, list, mo80257j3().mo72307n(false));
        }
    }

    /* renamed from: A */
    public void mo80248A(C31622e eVar) {
        C41536l.m120489i(eVar, "templateUiModel");
        mo56476p3().mo56479A(eVar);
    }

    /* renamed from: I */
    public void mo80249I() {
        mo56476p3().mo56489H1();
    }

    /* renamed from: N3 */
    public void mo80250N3(C31619b bVar) {
        C41536l.m120489i(bVar, "loading");
        mo80257j3().mo72306m(!bVar.mo72038a());
        mo80254a3().f88810i.setLoading(bVar.mo72038a());
        m98924h3().mo71894e(bVar.mo72038a());
        if (bVar.mo72039b()) {
            mo80253Z2().mo71858b(!bVar.mo72038a());
        }
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        mo56476p3().mo56536sc(new C21503d.C21506c((Object) null), str, str2, str3, m98921c3().mo71879j(), m98923e3());
        C41238w wVar = C41238w.f97225a;
        C41185v l3 = m98926l3();
        if (l3 != null) {
            l3.mo4577k1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) mo80254a3().mo3946b());
        super.mo37451O1(bundle);
        this.f82070J = new C39163o(this, mo80258k3());
        C39165p f3 = mo56474f3();
        C39163o oVar = this.f82070J;
        if (oVar == null) {
            C41536l.m120506z("formContext");
            oVar = null;
        }
        mo80251O3(new C31877a(f3, oVar));
        m98905P3();
        m98907Q3();
        m98897K3();
        m98932w3();
        mo80264t3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O3 */
    public final void mo80251O3(C31877a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f82069I = aVar;
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C33692a.C33693a.m99009a(mo56476p3(), new C21503d.C21504a(new Exception(str), (Object) null), (String) null, (String) null, (String) null, m98921c3().mo71879j(), (List) null, 46, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            C33692a.C33693a.m99009a(mo56476p3(), new C21503d.C21505b((Object) null), (String) null, (String) null, (String) null, m98921c3().mo71879j(), (List) null, 46, (Object) null);
        }
    }

    /* renamed from: U3 */
    public void mo80252U3() {
        C33692a p3 = mo56476p3();
        p3.mo56541v9().mo4825q(this);
        p3.mo56523jn().mo4825q(this);
        p3.mo56507Wl().mo4825q(this);
        p3.mo56492I2().mo4825q(this);
        p3.mo56487Da().mo4825q(this);
        p3.mo56546xj().mo4825q(this);
        p3.mo56518ed().mo4825q(this);
        p3.mo56498P5().mo4825q(this);
        p3.mo56510Xk().mo4825q(this);
        p3.mo56537si().mo4825q(this);
        p3.mo56481Bd().mo4825q(this);
        p3.mo56544wm().mo4825q(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public final C31457a mo80253Z2() {
        return (C31457a) this.f82075O.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public final C36813c mo80254a3() {
        return (C36813c) this.f82067G.getValue();
    }

    /* renamed from: d0 */
    public void mo80255d0(String str, String str2, String str3, String str4, C43064a aVar) {
        C41536l.m120489i(str, "title");
        C41536l.m120489i(str2, "text");
        C41536l.m120489i(str3, "positiveButtonText");
        C41536l.m120489i(str4, "negativeButtonText");
        C41536l.m120489i(aVar, "onConfirm");
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35648c2(str);
        dVar.mo35639Q1(str2);
        dVar.mo35646Z1(str3);
        dVar.mo35642U1(str4);
        dVar.mo35645Y1(new C39153i(dVar, aVar));
        dVar.mo35641T1(new C39156j(dVar));
        dVar.mo4586v1(true);
        dVar.mo4576A1(getSupportFragmentManager(), "DIALOG_TAG");
    }

    /* renamed from: f3 */
    public abstract C39165p mo56474f3();

    /* renamed from: g0 */
    public void mo80256g0() {
        m98928o3().mo71918a();
        mo56476p3().mo56482Bg();
    }

    /* renamed from: g3 */
    public abstract List mo56475g3();

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public final C31877a mo80257j3() {
        C31877a aVar = this.f82069I;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("paymentFormManager");
        return null;
    }

    /* renamed from: k3 */
    public final PreferencesApiManager mo80258k3() {
        PreferencesApiManager preferencesApiManager = this.f82068H;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m3 */
    public final C31489q mo80259m3() {
        return (C31489q) this.f82077Q.getValue();
    }

    /* renamed from: o */
    public void mo80260o() {
        m98928o3().mo71918a();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (mo80263s3()) {
            C39163o oVar = this.f82070J;
            if (oVar == null) {
                C41536l.m120506z("formContext");
                oVar = null;
            }
            oVar.mo92815d(C31877a.m94206o(mo80257j3(), false, 1, (Object) null));
            mo80257j3().mo80304j();
        }
    }

    /* renamed from: p */
    public void mo80261p(String str, String str2, String str3) {
        C41536l.m120489i(str, "category");
        C41536l.m120489i(str2, UrlHandler.ACTION);
        C41536l.m120489i(str3, "label");
        C32343x.m95497x0(this, str, str3, str2, m98925i3());
    }

    /* renamed from: p3 */
    public abstract C33692a mo56476p3();

    /* renamed from: r3 */
    public void mo80262r3(C38421a aVar) {
        C41536l.m120489i(aVar, "data");
        m98921c3().mo71881m(aVar.mo91950d());
        m98924h3().mo71895f(this.f82079S, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s3 */
    public final boolean mo80263s3() {
        return this.f82069I != null;
    }

    /* renamed from: t3 */
    public void mo80264t3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo4367F1("ScaVerificationDialogFragment.CLOSE", this, new C39149g(this));
        supportFragmentManager.mo4367F1("SELECT_REQUEST_KEY", this, new C39151h(this));
    }

    /* renamed from: w */
    public void mo80265w(List list) {
        C41536l.m120489i(list, "formValues");
        mo56476p3().mo56524ju(list);
    }

    /* renamed from: x3 */
    public void mo80266x3() {
        C33692a p3 = mo56476p3();
        p3.mo56541v9().mo4819k(this, new C33688v(new C33679m(this)));
        p3.mo56523jn().mo4819k(this, new C33688v(new C33680n(this)));
        p3.mo56507Wl().mo4819k(this, new C33688v(new C33681o(this)));
        p3.mo56492I2().mo4819k(this, new C33688v(new C33682p(this)));
        p3.mo56487Da().mo4819k(this, new C33688v(new C33683q(this)));
        p3.mo56546xj().mo4819k(this, new C33688v(new C33684r(this)));
        p3.mo56498P5().mo4819k(this, new C33688v(new C33685s(this)));
        p3.mo56510Xk().mo4819k(this, new C33688v(new C33686t(this)));
        p3.mo56481Bd().mo4819k(this, new C33688v(new C33687u(this)));
        C37224b.m109963b(p3.mo56544wm(), this, new C33676j(this));
        C37224b.m109963b(p3.mo56537si(), this, new C33677k(this));
        p3.mo56518ed().mo4819k(this, new C33688v(new C33678l(this)));
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return m98925i3();
    }

    /* renamed from: z3 */
    public void mo80267z3(C31128a aVar) {
        if (aVar instanceof C31128a.C31129a) {
            mo74709H1(((C31128a.C31129a) aVar).mo71342c());
        } else if (aVar instanceof C31128a.C31131c) {
            m98921c3().mo71880l((C37179d) ((C31128a.C31131c) aVar).mo71340a());
        } else if (aVar == null) {
            m98887F3();
        }
    }
}
