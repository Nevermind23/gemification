package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import g31.C32054a;
import g41.C32081a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25190j;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.employmentinfo.GTOnboardingEmploymentInfoActivity;
import p380ck.C10463g;
import p420fh.C12902d;
import p420fh.C12910e;
import sf0.C28193b;
import ue0.C28758w;
import ue1.C43064a;
import ue1.C43075l;
import uf0.C28766a;
import uf0.C28767b;
import uf0.C28768c;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity */
public final class GTOnboardingMailValidateActivity extends C28193b {

    /* renamed from: K */
    public static final C23528a f61443K = new C23528a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C28758w f61444H;

    /* renamed from: I */
    private final C41217g f61445I = new C1617p0(C41520a0.m120436b(GTOnboardingMailValidateViewModel$ViewModel.class), new C23535h(this), new C23534g(this), new C23536i((C43064a) null, this));

    /* renamed from: J */
    private final C41217g f61446J = C41219i.m119470b(new C23530c(this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$a */
    public static final class C23528a {
        private C23528a() {
        }

        public /* synthetic */ C23528a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo60388a(Context context, String str, String str2) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "mail");
            C41536l.m120489i(str2, "requestId");
            Intent intent = new Intent(context, GTOnboardingMailValidateActivity.class);
            intent.putExtra("MAIL", str);
            intent.putExtra("RequestId", str2);
            return intent;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$b */
    static final class C23529b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailValidateActivity f61447d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23529b(GTOnboardingMailValidateActivity gTOnboardingMailValidateActivity) {
            super(1);
            this.f61447d = gTOnboardingMailValidateActivity;
        }

        /* renamed from: a */
        public final void mo60389a(String str) {
            boolean z;
            C41536l.m120489i(str, "text");
            C28758w K2 = this.f61447d.f61444H;
            if (K2 == null) {
                C41536l.m120506z("binding");
                K2 = null;
            }
            Button button = K2.f73496f;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            button.setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60389a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$c */
    static final class C23530c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailValidateActivity f61448d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23530c(GTOnboardingMailValidateActivity gTOnboardingMailValidateActivity) {
            super(0);
            this.f61448d = gTOnboardingMailValidateActivity;
        }

        public final String invoke() {
            String stringExtra = this.f61448d.getIntent().getStringExtra("MAIL");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$d */
    static final class C23531d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailValidateActivity f61449d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23531d(GTOnboardingMailValidateActivity gTOnboardingMailValidateActivity) {
            super(1);
            this.f61449d = gTOnboardingMailValidateActivity;
        }

        /* renamed from: a */
        public final void mo60390a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f61449d.m76122R2().mo60400ow().mo60399n0();
                return;
            }
            C28758w wVar = null;
            if (aVar instanceof C31128a.C31129a) {
                C28758w K2 = this.f61449d.f61444H;
                if (K2 == null) {
                    C41536l.m120506z("binding");
                    K2 = null;
                }
                K2.f73496f.setLoading(false);
                C28758w K22 = this.f61449d.f61444H;
                if (K22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    wVar = K22;
                }
                wVar.f73497g.mo36272n();
            } else if (aVar instanceof C31128a.C31130b) {
                C28758w K23 = this.f61449d.f61444H;
                if (K23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    wVar = K23;
                }
                wVar.f73496f.setLoading(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60390a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$e */
    static final class C23532e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTOnboardingMailValidateActivity f61450d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23532e(GTOnboardingMailValidateActivity gTOnboardingMailValidateActivity) {
            super(1);
            this.f61450d = gTOnboardingMailValidateActivity;
        }

        /* renamed from: a */
        public final void mo60391a(C31128a aVar) {
            C28758w wVar = null;
            if (aVar instanceof C31128a.C31131c) {
                C28758w K2 = this.f61450d.f61444H;
                if (K2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    wVar = K2;
                }
                wVar.f73496f.setLoading(false);
                GTOnboardingMailValidateActivity gTOnboardingMailValidateActivity = this.f61450d;
                gTOnboardingMailValidateActivity.mo67715G2(GTOnboardingEmploymentInfoActivity.f61479L.mo60413a(gTOnboardingMailValidateActivity));
            } else if (aVar instanceof C31128a.C31129a) {
                C28758w K22 = this.f61450d.f61444H;
                if (K22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    wVar = K22;
                }
                wVar.f73496f.setLoading(false);
                this.f61450d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            } else if (aVar instanceof C31128a.C31130b) {
                C28758w K23 = this.f61450d.f61444H;
                if (K23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    wVar = K23;
                }
                wVar.f73496f.setLoading(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60391a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$f */
    static final class C23533f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61451a;

        C23533f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61451a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61451a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61451a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$g */
    public static final class C23534g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23534g(ComponentActivity componentActivity) {
            super(0);
            this.f61452d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61452d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$h */
    public static final class C23535h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23535h(ComponentActivity componentActivity) {
            super(0);
            this.f61453d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61453d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.email.mailvalidate.GTOnboardingMailValidateActivity$i */
    public static final class C23536i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61454d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61455e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23536i(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61454d = aVar;
            this.f61455e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61454d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61455e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: N2 */
    private final void m76118N2() {
        C28758w wVar = this.f61444H;
        C28758w wVar2 = null;
        if (wVar == null) {
            C41536l.m120506z("binding");
            wVar = null;
        }
        wVar.f73496f.setOnClickListener(new C28766a(this));
        C28758w wVar3 = this.f61444H;
        if (wVar3 == null) {
            C41536l.m120506z("binding");
            wVar3 = null;
        }
        wVar3.f73497g.setResendButtonClickListener(new C28767b(this));
        C28758w wVar4 = this.f61444H;
        if (wVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            wVar2 = wVar4;
        }
        C32343x.m95457j(wVar2.f73497g.getBinding().f27107e.getTextInput(), new C23529b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m76119O2(GTOnboardingMailValidateActivity gTOnboardingMailValidateActivity, View view) {
        boolean z;
        C41536l.m120489i(gTOnboardingMailValidateActivity, "this$0");
        C32054a.C32058d dVar = C32054a.C32058d.f78900f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32081a.m94499a(dVar, F, " ", " ");
        C28758w wVar = gTOnboardingMailValidateActivity.f61444H;
        C28758w wVar2 = null;
        if (wVar == null) {
            C41536l.m120506z("binding");
            wVar = null;
        }
        if (wVar.f73497g.getBinding().f27107e.getInputText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C28768c ow = gTOnboardingMailValidateActivity.m76122R2().mo60400ow();
            C28758w wVar3 = gTOnboardingMailValidateActivity.f61444H;
            if (wVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                wVar2 = wVar3;
            }
            ow.mo60394F5(wVar2.f73497g.getBinding().f27107e.getInputText());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m76120P2(GTOnboardingMailValidateActivity gTOnboardingMailValidateActivity, View view) {
        C41536l.m120489i(gTOnboardingMailValidateActivity, "this$0");
        C28758w wVar = gTOnboardingMailValidateActivity.f61444H;
        if (wVar == null) {
            C41536l.m120506z("binding");
            wVar = null;
        }
        wVar.f73497g.getBinding().f27107e.setInputText("");
        gTOnboardingMailValidateActivity.m76122R2().mo60400ow().mo60396aa();
    }

    /* renamed from: Q2 */
    private final String m76121Q2() {
        return (String) this.f61446J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final GTOnboardingMailValidateViewModel$ViewModel m76122R2() {
        return (GTOnboardingMailValidateViewModel$ViewModel) this.f61445I.getValue();
    }

    /* renamed from: S2 */
    private final void m76123S2() {
        m76122R2().mo60401pw().mo60404t6().mo4819k(this, new C23533f(new C23531d(this)));
        m76122R2().mo60401pw().mo60398cs().mo4819k(this, new C23533f(new C23532e(this)));
    }

    /* renamed from: T2 */
    private final void m76124T2() {
        String stringExtra = getIntent().getStringExtra("RequestId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        m76122R2().mo60400ow().mo60397bl(m76121Q2());
        m76122R2().mo60400ow().mo60395Fh(stringExtra);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C28758w d = C28758w.m88164d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f61444H = d;
        C28758w wVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        mo86436g2();
        super.mo37451O1(bundle);
        C28758w wVar2 = this.f61444H;
        if (wVar2 == null) {
            C41536l.m120506z("binding");
            wVar2 = null;
        }
        wVar2.f73495e.setText(getString(C25190j.gt_onboarding_mail_validate_description) + m76121Q2());
        C28758w wVar3 = this.f61444H;
        if (wVar3 == null) {
            C41536l.m120506z("binding");
            wVar3 = null;
        }
        wVar3.f73496f.setEnabled(false);
        C28758w wVar4 = this.f61444H;
        if (wVar4 == null) {
            C41536l.m120506z("binding");
            wVar4 = null;
        }
        wVar4.f73497g.setEmail(m76121Q2());
        C28758w wVar5 = this.f61444H;
        if (wVar5 == null) {
            C41536l.m120506z("binding");
        } else {
            wVar = wVar5;
        }
        wVar.f73497g.mo36289t();
        m76124T2();
        m76118N2();
        m76123S2();
        String string = getString(C25190j.gt_onboarding_mail_code_sent);
        C41536l.m120488h(string, "getString(R.string.gt_onboarding_mail_code_sent)");
        C12910e.m48797o(this, string, C12902d.C12905b.C12907b.f38104a, false, 4, (Object) null);
    }
}
